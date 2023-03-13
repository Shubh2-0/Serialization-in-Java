# Serialization and Deserialization in Java with Example

**Serialization** in Java is the concept of representing an object’s state as a byte stream. The byte stream has all the information about the object. Usually used in Hibernate, JMS, JPA, and EJB, serialization in Java helps transport the code from one JVM to another and then de-serialize it there.

**Deserialization** is the exact opposite process of serialization where the byte data type stream is converted back to an object in the memory. The best part about these mechanisms is that both are JVM-independent, meaning you serialize on one JVM and de-serialize on another.


<p align="center">
<img src="https://media.geeksforgeeks.org/wp-content/cdn-uploads/gq/2016/01/serialize-deserialize-java.png" />
</p>


# What are the Advantages of Serialization?

Serialization offers a plethora of benefits. Some of its primary advantages are:

✨ Used for marshaling (traveling the state of an object on the network)

✨ To persist or save an object’s state

✨ JVM independent

✨ Easy to understand and customize
