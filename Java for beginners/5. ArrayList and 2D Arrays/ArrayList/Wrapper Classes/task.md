
***

Remember that Java is an Object-Oriented Language (OOP)?
That, in theory, means that all data types in Java are objects.

However, you know that there are 8 exceptions: primitive data types.
Primitive types were originally included in Java because
the developers wanted *C* and *C++* programmers to find 
familiarity with the language and to provide some flexibility
and efficiency. The cost was breaking the OOP paradigm.

At some point in your Java journey you will have to use
primitive types as objects; and *wrapper classes* are the 
tool you'll need to achieve that.

In essence, a *Wrapper Class* has a constructor designed to
contain its equivalent primitive data type.

As there are 8 primitive data types, there are 8 *wrapper classes*.
The table below summarizes them

| **Primitive type** | **Wrapper class** |
|--------------------|-------------------|
| boolean            | Boolean           |
| byte               | Byte              |
| short              | Short             |
| int                | **Integer**       |
| long               | Long              |
| float              | Float             |
| double             | Double            |
| char               | **Character**     |

Wrapper classes are capitalized versions of 
their respective primitive types, with the notable
exception of *int* and *char*, so be careful.

The process of converting a primitive type to 
an object is called 'boxing' (alluding to 
an analogy of objects as boxes that contain information),
and when you convert an object from a wrapper class
to its primitive equivalent, it's called 'unboxing' the variable.

Usually you don't have to worry about boxing or unboxing
since the compiler handles most conversions for itself. This
is called 'autoboxing' or 'autounboxing'. Here are
some examples where you can get an idea of all this.
