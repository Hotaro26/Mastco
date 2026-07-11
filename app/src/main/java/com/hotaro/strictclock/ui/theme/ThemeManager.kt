package com.hotaro.strictclock.ui.theme

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import com.hotaro.strictclock.data.UserPreferencesRepository

object ThemeManager {
    private var repository: UserPreferencesRepository? = null
    private var scope: CoroutineScope? = null

    fun initialize(repo: UserPreferencesRepository, coroutineScope: CoroutineScope) {
        repository = repo
        scope = coroutineScope
        coroutineScope.launch {
            repo.activeSchemeFlow.collect { _activeScheme.value = it }
        }
        coroutineScope.launch {
            repo.themeModeFlow.collect { _themeMode.value = it }
        }
        coroutineScope.launch {
            repo.isAmoledFlow.collect { _isAmoled.value = it }
        }
    }
    private val _isAmoled = MutableStateFlow(false)
    val isAmoled: StateFlow<Boolean> = _isAmoled.asStateFlow()

    private val _activeScheme = MutableStateFlow("Dynamic")
    val activeScheme: StateFlow<String> = _activeScheme.asStateFlow()

    private val _themeMode = MutableStateFlow("System")
    val themeMode: StateFlow<String> = _themeMode.asStateFlow()

    fun setAmoled(value: Boolean) {
        _isAmoled.value = value
        scope?.launch { repository?.saveIsAmoled(value) }
    }

    fun setScheme(scheme: String) {
        _activeScheme.value = scheme
        scope?.launch { repository?.saveActiveScheme(scheme) }
    }

    fun setThemeMode(mode: String) {
        _themeMode.value = mode
        scope?.launch { repository?.saveThemeMode(mode) }
    }
}
