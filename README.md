# Example of creating a Gradle multi-module project

This project consists of two modules ms-firstmodule and ms-secondmodule which can be started on port 8081 and 8082.

```
------------------------------------------------------------
Root project 'multimodule'
------------------------------------------------------------

Root project 'multimodule'
+--- Project ':ms-firstmodule'
\--- Project ':ms-secondmodule'
```

## Project structure

The root project has only a `settings.gradle` file, whereas each modules have their own `build.gradle` files.
```
multimodule  
  ├── buildSrc 
  ├── gradle
  ├── ms-firstmodule  
  │   └── build.gradle  
  ├── ms-secondmodule  
  │   └── build.gradle 
  └── settings.gradle 
```

## buildSrc 
Include the `buildSrc` directory in your Gradle project to write and build your own custom Gradle plugins or extensions for your project's build script

### Directory structure for buildSrc
`buildSrc/src/main/groovy` contains files with build logic
```
  ├── buildSrc 
  │    ├── build.gradle 
  │    └── src/main/groovy
  │        └── com.multimodule.common-conventions.gradle

```
## Version Catalogs
To simplify the management of dependencies across a multi-project build. It allow you to define a central list of versions for your dependencies, which can then be referenced across all of the projects in your build, ensuring consistency and avoiding version conflicts. 

### TOML file
Create toml file `gradle/libs.versions.toml` that contains a list of commonly used dependencies, along with their corresponding versions.

Change the dependencies defined in the `libs.versions.toml` file in your `build.gradle` file:
```
alias(libs.plugins.spring.boot)
```
