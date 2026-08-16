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

But may system architecter AMD64 differs from the phone architectur aarch64, which is why I use a github action to run the native build instead.

