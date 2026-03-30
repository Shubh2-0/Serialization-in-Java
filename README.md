<div align="center">

# 💾 Serialization in Java

[![GitHub stars](https://img.shields.io/github/stars/Shubh2-0/Serialization-in-Java?style=for-the-badge&logo=github&color=yellow)](https://github.com/Shubh2-0/Serialization-in-Java/stargazers)
[![GitHub forks](https://img.shields.io/github/forks/Shubh2-0/Serialization-in-Java?style=for-the-badge&logo=github&color=blue)](https://github.com/Shubh2-0/Serialization-in-Java/network/members)

### Object Persistence in Java

*Convert objects to byte streams and back*

</div>

---

## 🎯 About

Learn **Java Serialization** - converting object state to byte stream for storage or transmission, and restoring it back (deserialization).

## 💡 Concept

```
┌──────────────┐     Serialize      ┌──────────────┐
│ Java Object  │ ─────────────────► │ Byte Stream  │
│              │ ◄───────────────── │ (File/Network)│
└──────────────┘    Deserialize     └──────────────┘
```

## 📚 Topics Covered

- ✅ Serializable interface
- ✅ ObjectOutputStream
- ✅ ObjectInputStream
- ✅ transient keyword
- ✅ serialVersionUID

## 💻 Example

```java
// Serialization
ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.ser"));
oos.writeObject(myObject);

// Deserialization
ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.ser"));
MyClass obj = (MyClass) ois.readObject();
```

## 🛠️ Technologies

Java | Serializable | Object Streams

## 📬 Contact

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/shubham-bhati-787319213/)
[![Gmail](https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white)](mailto:shubhambhati226@gmail.com)

---

**Keywords:** Java Serialization Deserialization Object-Stream Persistence transient













