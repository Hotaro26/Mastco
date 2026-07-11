# Mascot

sup! welcome to Mascot (formerly mastco) — it's basically this evil open-source alarm app I made that literally *forces* you out of bed. if you're the type to snooze 50 times and end up late to everything, you kinda need this. 

Mascot makes you do annoying stuff like solving math problems, scanning random QR codes, or even walking to your bathroom to take a picture of your sink just to turn off the alarm. the AI object detection is all on-device so it's super fast and doesn't steal your data.

### What's under the hood?

I built this thing using some pretty cool stuff:
- **Kotlin & Jetpack Compose:** all the UI is modern and smooth (the cards even get squishy when you press them).
- **Google ML Kit:** handles all the on-device AI for object detection (like recognizing your toothbrush) and QR scanning offline!
- **Room Database:** saves your alarms locally.
- **Coroutines & Services:** keeps the alarm and timers running perfectly in the background so you can't escape it.

### How to build it locally

if you wanna mess with the code or build it yourself, it's super easy.

1. clone the repo:
   ```bash
   git clone https://github.com/Hotaro26/Mascot.git
   cd Mascot
   ```
2. open the project in Android Studio (or whatever you use).
3. let Gradle sync all the dependencies.
4. hit the run button or build an APK from the command line:
   ```bash
   ./gradlew assembleDebug
   ```
5. install the APK on your phone and try not to throw it at a wall when the alarm goes off.

### Contributing

wanna add a new feature or fix a bug? bet. i'm totally down for pull requests. 
1. fork the repo.
2. create a new branch (`git checkout -b feature/your-cool-idea`).
3. make your changes and commit them.
4. push to your fork and open a PR.

just make sure your code isn't super messy and you're good to go.

### License

Mascot is licensed under the [MIT License](LICENSE). do whatever you want with the code, just don't blame me if you still sleep through your math problems.
