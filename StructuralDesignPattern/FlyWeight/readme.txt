This pattern is used to reduce memory usages by sharing the data among multiple objects. 
Eg. In games, we need to create a army of robots. So we will create it once, save it somewhere and share it among the 
multiple objects and save the memory. Text editors use this pattern only.

IntrinsicData : the property which is shared among the objects.
ExtrinsicData : the property which fixed as per object.

From objects, we will keep only Intrinsic data and remove the extrinsic data(we will pass it in parameter).
Class which has only intrinsic data is known as flyWeight.