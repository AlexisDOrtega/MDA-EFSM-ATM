About the Project - Software Architecture -ATM Machine (individual)	Java, UML
					
I Implemented these designs with Object Oriented Programming principals to provide an abstracted User Interface which allowed a customer to login, withdraw, deposit, check balance, and logout. I designed and documented an ATM Machine using multiple architectural patterns including MDA-EFSM, Decentralized State, Abstract Factory,  and Strategy pattern. The UML and other documentation is saved as a PDF in the repository under Documentation.


READ ME

To compile and execute the program please download and save the files onto your machine as originally named.

These files were compiled on the IDE IntelliJ. Please save the TestDriver.java class and execute it after saving the files to your machine.

Requirements:

1. MDA-EFSM model for the Account components
	a. A list of meta events for the MDA-EFSM
	b. A list of meta actions for the MDA-EFSM with their descriptions
	c. A state diagram of the MDA-EFSM
	d. Pseudo-code of all operations of Input Processors of Accounts: Account-1 and Account-2

****Provided within the Documentation Folder****


2. Class diagram(s) of the MDA of the Account components. In your design, you MUST use the
following OO design patterns:

****Provided within the Documentation Folder****

The Files are saved in a matter that describe the patterns they represent:

a. State Pattern Files:
	States.*
	StateMachine
	
b. Strategy Pattern Files: 
	
	Output.DisplayBalance.*
	Output.DisplayMenu.*
	Output.IncorrectIdMsg.*
	Output.IncorrectLockMsg.*
	Output.IncorrectPinMsg.*
	Output.IncorrectUnlockMsg.*
	Output.MakeDeposit.*
	Output.MakeWithdraw.*
	Output.NoFundsMsg.*
	Output.Penalty.*
	Output.PromptForPin.*
	Output.StoreData.*
	Output.TooManyAttemptsMsg.*
	OutputProcessor
	
c. Abstract Factory Pattern Files :
	AbstractFactory
	ConcreteFactory1
	ConcreteFactory2
	
3. For each class in the class diagram(s) you should:
	a. Describe the purpose of the class, i.e., responsibilities.
	b. Describe the responsibility of each operation supported by each class. 
	
****Please see the commented source code for this requirement****

4. Dynamics. Provide a sequence diagrams for ACCOUNT-1 for the following sequence of operations:
open(321,123,150), login(123), pin(321), withdraw(70), balance(), logout() 

****Provided within the Documentation Folder. See Sequence Diagram & TerminalOutput****


II: Well documented (commented) source code
In the source-code you should clearly indicate/highlight which parts of the source code are
responsible for the implementation of the three required design patterns (if this is not clearly
indicated in the source code, 20 points will be deducted):
	 state pattern
	 strategy pattern
	 abstract factory pattern. 
	
****Provided within the Folders Labeled src****

III: Project executables
The project executable(s) of the Account components with detailed instructions explaining the execution
of the program must be prepared and made available for grading. The project executable should be
submitted on the Blackboard. If the executable is not provided (or not easily available), 20 POINTS will
be automatically deducted from the project grade.

****All executables provided in src folder, and this read me serves as explanation for exection****


	
