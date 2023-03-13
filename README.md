# Serialization and Deserialization in Java with Example

Serialization in Java is the concept of representing an object’s state as a byte stream. The byte stream has all the information about the object. Usually used in Hibernate, JMS, JPA, and EJB, serialization in Java helps transport the code from one JVM to another and then de-serialize it there.

Deserialization is the exact opposite process of serialization where the byte data type stream is converted back to an object in the memory. The best part about these mechanisms is that both are JVM-independent, meaning you serialize on one JVM and de-serialize on another.


<p align="center">
<img src="https://media.geeksforgeeks.org/wp-content/cdn-uploads/gq/2016/01/serialize-deserialize-java.png" />
</p>

The byte stream created is platform independent. So, the object serialized on one platform can be deserialized on a different platform. To make a Java object serializable we implement the java.io.Serializable interface. The ObjectOutputStream class contains writeObject() method for serializing an Object. 

```
public final void writeObject(Object obj)
                       throws IOException
                       
 ```
 ```
The ObjectInputStream class contains readObject() method for deserializing an object. 
 

public final Object readObject()
                  throws IOException,
               ClassNotFoundException
               
               
```            
