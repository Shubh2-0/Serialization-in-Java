# Serialization and Deserialization in Java with Example

# Serialization and Deserialization in Java

[![GitHub](https://img.shields.io/badge/GitHub-Serialization%20in%20Java-blue.svg)](https://github.com/Shubh2-0/Serialization-in-Java)

Welcome to the "Serialization and Deserialization in Java" repository! This repository contains three projects that demonstrate simple implementations of serialization and deserialization in Java. Each project showcases a different example and can be used as a reference to understand these concepts better.

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


# Points to Note About Serialization in Java?

To serialize an object, there are a few conditions to be met. Some other key points need to be highlighted before you proceed further in the article. These are the conditions and points to remember while using serialization in Java.

✍ Serialization is a marker interface with no method or data member

✍ You can serialize an object only by implementing the serializable interface

✍ All the fields of a class must be serializable; otherwise, use the transient keyword (more about it later)

✍ The child class doesn’t have to implement the Serializable interface, if the parent class does

✍ The serialization process only saves non-static data members, but not static or transient data members

✍ By default, the String and all wrapper classes implement the Serializable interface



# How to Serialize an Object?

Since you now know what serialization in Java is, and all the relevant points, let’s delve deep into how to serialize an object. You must use the writeObject() method of the ObjectOutputStream class for serialization and readObject() method of the InputObjectStream class for deserialization purpose.

Syntax for the writeObject() method:
```
public final void writeObject(Object o) throws IO Exception
```

Syntax for the readObject() method:
```
public final Object readObject() throws IOException, ClassNotFoundException
```

**Let’s look at an example to understand how to serialize and de-serialize an object in Java.**

# Example for Serialization in Java ⭐

The following program code will serialize a student object and save it to a file named student.ser.

<img src="https://www.simplilearn.com/ice9/free_resources_article_thumb/SerializationinJava_1.png" />

# Output 
<img src="https://www.simplilearn.com/ice9/free_resources_article_thumb/SerializationinJava_2.png" />



===================================================




# Example for Deserialization in Java ⭐
In the code below, you will look at how to deserialize the student object that was have serialized in the above example.
<img src="https://www.simplilearn.com/ice9/free_resources_article_thumb/DeserializationinJava_1.png" />
<img src="https://www.simplilearn.com/ice9/free_resources_article_thumb/DeserializationinJava_2.png" />

# Output
<img src="https://www.simplilearn.com/ice9/free_resources_article_thumb/DeserializationinJava_3.png" />


## 📁 Project Examples

### Example 1
This project demonstrates a basic implementation of serialization and deserialization in Java. It covers the essential concepts and provides a starting point for understanding how to serialize and deserialize objects effectively.

### Example 2
In this project, we explore a more advanced implementation of serialization and deserialization. It delves into complex object structures, inheritance, and how to handle edge cases when serializing and deserializing objects.

### Example 3
The third project in this repository showcases serialization and deserialization with external libraries or frameworks. It demonstrates how to leverage popular libraries to simplify the serialization and deserialization process and increase productivity.

## 🚀 Getting Started

To get started with any of the examples, follow the steps below:

1. Clone this repository: `git clone https://github.com/Shubh2-0/Serialization-in-Java.git`
2. Navigate to the specific example you want to explore: `cd ExampleX` (replace `X` with the example number)
3. Build and run the project using your preferred Java IDE or build tool.

## 📚 Resources

Here are some resources that can help you dive deeper into serialization and deserialization in Java:

- [Oracle Documentation on Serialization](https://docs.oracle.com/javase/8/docs/platform/serialization/spec/serialTOC.html)
- [Java Object Serialization Specification](https://docs.oracle.com/en/java/javase/11/docs/specs/serialization/index.html)
- [Baeldung: Java Serialization](https://www.baeldung.com/java-serialization)

## 🤝 Contributions

Contributions to this repository are welcome! If you have any suggestions, bug fixes, or additional examples, please feel free to open an issue or submit a pull request.


Let's learn and explore serialization and deserialization in Java together! 🎉

