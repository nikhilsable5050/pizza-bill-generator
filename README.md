🍕 Pizza Bill Generator (Java OOP Project)

A beginner-friendly Java project that demonstrates Object-Oriented Programming (OOP) concepts using a simple and real-world Pizza Billing System.

🚀 Features

✔️ Choose pizza type: Veg / Non-Veg / Deluxe
✔️ Add extra cheese
✔️ Add extra toppings
✔️ Add takeaway option
✔️ Auto-generated detailed bill
✔️ Clean and modular OOP structure

🧩 OOP Concepts Used
1. Encapsulation

All variables (price, toppings, cheese, takeaway) are private.

They are accessed using public methods only.

2. Inheritance

DeluxPizza extends the Pizza class.

Deluxe pizza automatically includes cheese & toppings.

3. Polymorphism

DeluxPizza overrides addExtraCheese() and addExtraToppings()
to prevent double additions.

4. Abstraction

The base Pizza class handles common billing logic.

User interacts only through simple method calls.

📂 Project Structure
src/
│── Pizza.java
│── DeluxPizza.java
│── Main.java
