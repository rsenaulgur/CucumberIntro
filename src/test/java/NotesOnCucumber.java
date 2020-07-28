public class NotesOnCucumber {

    /**
     * Presentation Link:
     * https://docs.google.com/presentation/d/13d4ucnjA0HRNaidvYN-S9fDGTvCuznhiaydoQAcRdsU/edit?usp=sharing
     *
     */

    // CUCUMBER

    // Cucumber is a tool used for BDD frameworks (Behaviour Driven Development) -> Action to Reaction
    // Cucumber provides a file type -> .feature -> which has 1 Feature and as many scenarios wanted
    // (although 1 scenario as an scenario outline meaning having different cases is the best practice)

    // Given to Then to When concept

    // First thing to do to use cucumber -> Add dependency to the pom.xml
    // Make sure that you recreate the scenario manually
    // - pay a visit to the website and go through all testing steps
    // - take notes
    // Then -> create a .feature file, convert your notes into the steps (given - when - then)
    // run the feature file to get the blueprint of your step definition methods
    // paste them to a class and start filling them in

    // Scenario outline:
    // Allows you to use the same scenario over and over again with different inputs
    // Scenario Outline: Test Apply Now Top Nav2
    // Given ...
    // When ... <...>
    // Then ...

    //      Examples:
    //        | ... |
    //        | ... |
    //        | ... |

    // This example above will run 3 times on click of one run and will use the example inputs for each of the times


    // Parallel Execution with Cucumber:
    // Cannot be done with xml file but with a Runner class -> @RunWith(Cucumber.class) annotation before the class

}
