In this ATM machine, we are going to use two patterns together (StateDesignPattern and ChainOfResponsibility)

StateDesignPattern : If any object have a different operation(op1, op2, op3, op4 ...) but different operations
are performed at different stages of the object. Then we use state design pattern in that case. For eg :
   Design a TV :
                 State :                               Operation :
                 Off                                    SwitchON
                 ON                                    changeChannel, Increase/Decrease Volume, Menu

   We generally make a Interface for State defining a prototype for all the operations. In concrete StateClasses
   we implement that particular function we need and change the state of Object from there only after performing
   the particular function.

   Same Case for the ATM:
   Operation :  InsertCard, AuthenticatePin, SelectOperation(like withdrawal, balance inquiry etc), PerformOperation.

                   State :                               Operation :
                   Idle                                  InsertCard
                   HasCard                               AuthenticatePin
                   SelectionState                        SelectOperation
                   PerformState                          CashCount or etc.
                   IdleState

   while we are at one state, we are allowed to perform the certain specific operations only. At idle stage, we
   can't do Authenticate pin without inserting the Card inside the ATM machine.


Chain of Responsibility designPatter : Any request which comes in will goes into the chain.
Eg. DesignLoggerSystem

we will use chainOfResponsibility Pattern to dispense cash from the ATM.
