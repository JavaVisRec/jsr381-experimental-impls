# Experimental implementations
This repository contains experimental implementations of the API. Since the reference-implementation is not implemented yet 
 , other implementations are tested for performance, usability and simplicity to implement the API so the
 implementers of the library can also implement the VisRec (JSR381) API.
 
 Most of the implementations contain a few examples and may not be up-to-date with the latest version
 of the API. 
 
 Note: The experimental implementations do not work at all due to breaking changes in the API and 
 missing dependencies which are not available on Maven central yet.

## Examples

There's support for the following build tools:
* Maven
* Gradle
* Gradle Wrapper

Note: Some of the examples are using specific maven repositories for specific libraries. If you're
behind a cooperate firewall, some example implementations may not work.

### Maven
TODO Instructions here.

### Gradle
Gradle 4.7 has been actively used to test the examples. We recommend to use Gradle 4.7 or higher to
run the examples.

Go to directory of the example and perform the following command:   
> `gradle run`

OR remain in the root directory of the project and perform the following command:   
> `gradle :visrec-openimaj-impl:run`

You can change `visrec-openimaj-impl` into any of the other examples' directory.

### Gradle Wrapper
Gradle 4.7 Wrapper has been actively used to test the examples. We recommend to use Gradle 4.7 Wrapper or higher to
run the examples. Gradle Wrapper is included into the project.

Remain in the root directory of the project and perform the following command:   
> `gradlew :visrec-openimaj-impl:run`

You can change `visrec-openimaj-impl` into any of the other examples' directory.