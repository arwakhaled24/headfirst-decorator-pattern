# Decorator Design Pattern (Java)

This repository contains a simple and clean implementation of the **Decorator Design Pattern**, inspired by the classic *Head First Design Patterns – Starbuzz Coffee* example.

## 📌 What is the Decorator Pattern?

The Decorator Pattern is a **structural design pattern** that allows you to add new behaviors to objects dynamically by wrapping them in decorator classes, without modifying the original class.

This makes it ideal for:
- Adding features at runtime  
- Extending functionality without changing base code  
- Following the Open/Closed Principle  

---

## ☕ Starbuzz Coffee Example

In this example:
- `Beverage` is the base abstract class  
- Drinks like `Espresso` and `DarkRoast` extend it  
- Condiments like `Mocha` and `Whip` are **decorators** that wrap beverages and add behavior

---

## 🧠 Key Concepts

- Uses **object wrapping** rather than inheritance  
- Adds dynamic behavior at runtime  
- Easy to extend with new condiments  
- Follows **Open/Closed Principle**  

---
## UML 
<img width="925" height="661" alt="DJJ44" src="https://github.com/user-attachments/assets/ee3a0e1b-632f-4b4c-bc0b-d2b3375847cd" />

