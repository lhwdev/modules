# 🚧 Modules: General-Purpose Module System

A module system & loader for Kotlin. Made for me to use.

## Architecture

**Module** is a building block for this system. Everything is a module.
Anything can be defined to be a module, like image, audio, jar/executable, even
virtual things.

Modules can have **dependencies**. Typically dependencies are modules. For jar,
dependencies become its classpath.

**Metadata** declares extra information about each module.



## Manifest

**Manifest** declares basic information, such as dependencies and metadata.
Manifest is defined in `module-manifest.json` file.
