# Software Testing MOOC

This repository contains the code examples and exercises of
TU Delft's edX MOOC on Software Testing.

## License

This repository is licensed under CC BY-NC-SA.

## Course

- Test analysis and design
- Test execution

### Error, Fault, and Failure

- Failure: A component or system behaves in a way that it is not expected
- Defect or bug or fault: A flaw in a component that can cause the system to behave incorrectly. A defect, if encountered during execution, may cause a failure
- Error: A human action that produces an incorrect result

### Validation vs verification

- Validation: is more about making sure that our system delivers what the user needs it to deliver. are we building the system that our users really want?
- Verification: is more focused on, are we building the system, right?. with verification, we make sure that our system delivers what the specification wants it to deliver, that it is free of bugs.

### When is code tested enough?

"Testing can show the presence of defects, but testing does not actually show their absence."

### Am I less productive if I write automated tests?

Some might say: "I write 100 lines of production code a day... Now, if I have to write automated tests, I will write 50 lines of production code a day and 50 lines of test code a day... So, I'm less productive now!"

## Partitions and Equivalence Partitioning

### Category-Partition method

- Identificar parametros
- Caracteristicas de cada parametro
- Add constraints
- Generar combinaciones

## Structural testing and code coverage

you probably feel that, although we have 100% line coverage, our tests are not enough.

In practice, there is no single technique that gives us 100% confidence that our systems are tested enough.

That's why we should combine all the different techniques we learned so far and test as much as we can!

### : Branch and condition coverage

A better criteria here would be to make sure we have at least one test for each branch or for each arrow in the graph.

### Condition Coverage

Condition coverage seems to cover more cases than branch coverage...
or line coverage, for that matter!

### Path coverage

Path coverage means that we want to really test all the possible paths and combinations

### Modified Condition / Decision Coverage
