# About

This is a simple test project, in which I test out how to build a Java Application for Android using JavaFX, GraalVM and the 'gluonfx-maven-plugin'.

# Run (on Windows) with maven
```
mvn gluonfx:run
```

# Build native artifact for Android
Should work like this:
```
mvn gluonfx:install gluonfx:nativerun
```

But my system architecture 'x86_64-microsoft-windows' differs from the phone architectur 'aarch64-linux-android', which is why I use a github action to run the native build instead.

