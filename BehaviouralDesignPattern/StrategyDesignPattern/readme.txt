When more than one child of base class in implementing some algorithm which same among
the childs then it will create code duplicacy and duplicacy will grow with the new childs
requiring same algo. To reduce it, we simply tale that part of the code and implement it
in some other class defining a function in interface. Then use constructor injection to
pass the object of class whenever it is required.
