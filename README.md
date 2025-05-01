
---

# 🎯 Guess the Number Game

## 📋 Description
This is a fun and interactive **"Guess the Number"** game for Android where the player guesses a randomly generated number between **1 and 100** — not by typing, but by selecting **"Lower"**, **"Higher"**, or **"Equal"** buttons.

Instead of manually entering numbers, players interact through button clicks, with instant visual feedback to guide them toward the target number.

---

## 🎮 Game Mechanics

- The game starts with a **random number** between 1 and 100.
- The **initial guess** is set to 50.
- Players click one of the following:
  - 🔽 **Lower**: Guess a smaller number.
  - 🔼 **Higher**: Guess a larger number.
  - ✅ **Equal**: Confirm the guess is correct.
- **Correct choice** ➝ button turns **green** and guess updates.
- **Wrong choice** ➝ button turns **red** and guess **does not update**.
- The game continues until the player clicks "Equal" with the correct guess.
- Once the correct number is guessed, the game ends and the player is returned to the **Sign-Up** screen.

---

## 🧩 Game Features

### ✨ Two Activities:
- **SignUpActivity**
  - Enter: First Name, Last Name, and Gender (via a dropdown).
  - Press "Start Game" to begin.
- **GameActivity**
  - Play the guessing game with the three-button interface.

### 💡 Dynamic Guessing Mechanism:
- Guessed number updates with each correct guess (like binary search).

### 🚦 Instant Visual Feedback:
- ✅ **Green** = Correct guess.
- ❌ **Red** = Incorrect guess.

### 🔀 Random Number Generation:
- Target number is randomly generated between **1–100** at game start.

### 🔄 Navigation:
- On correct guess, returns to **SignUpActivity** to allow replaying.

---

## ▶️ How to Play

1. Launch the app and enter your First Name, Last Name, and Gender.
2. Tap **Start Game**.
3. The game begins with a guess of **50**.
4. Use **Lower**, **Higher**, or **Equal** to guide the app toward the target.
5. Correct button ➝ guess updates and button turns green.
6. Incorrect button ➝ guess stays and button turns red.
7. When "Equal" is correctly clicked, the game ends and restarts at the Sign-Up screen.

---

## 🛠 Technologies Used
- **Java / Kotlin** (Android)
- **Android Studio**
- **XML Layouts**
- **Random Number Generator**
- **Intent Navigation**
- **Event Listeners and UI Feedback**

---
