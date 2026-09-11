# Lesson 4: Conditionals (if / else)

Goal: Make the program choose different code paths using if, else if, and else.

Time: About 30 to 40 minutes

You will learn:

- How if runs code only when a condition is true
- How else runs when the condition is false
- How else if chains more than two options
- Using comparisons (>, <, >=, <=, ==, !=) and && / || in conditions
Before this lesson: Lessons 1–3 (main, variables, booleans, comparisons, math operators).

### Why this matters for robots

Robots constantly decide:

- Is the button pressed?
- Are we on the red alliance?
- Is shooter speed high enough?
if / else is how Java chooses what to do next.

### The big idea

A condition is an expression that evaluates to true or false (boolean).

```java
if (condition) {
    // runs only when condition is true
}
```



You already know how to create booleans (batteryOk = percent >= 50). Now you use them to control which lines run.

### if

```java
int batteryPercent = 75;
```

```java
if (batteryPercent > 50) {
    System.out.println("Battery OK");
}
```



If batteryPercent is 75, it prints Battery OK.

```java
If it were 20, that println would be skipped and nothing would happen.
```

### if / else

```java
boolean intakeDown = true;
```

```java
if (intakeDown) {
    System.out.println("Intake is down");
} else {
    System.out.println("Intake is up");
}
```



Exactly one of those two blocks runs.

### else if (more than two choices)

```java
int match = 2;
```

```java
if (match == 1) {
    System.out.println("Left auton");
} else if (match == 2) {
    System.out.println("Center auton");
} else {
    System.out.println("Right auton");
}
```



Java checks from the top. The first true condition wins; the rest are skipped.

### Comparison operators (review == / !=)

```java
int speed = 0;
```

```java
if (speed == 0) {
    System.out.println("Stopped");
}
```

```java
if (speed != 0) {
    System.out.println("Moving");
}
```



Do not use = inside if. = assigns. == compares.

For boolean variables you can write:

```java
if (intakeDown) { ... }       // same as if (intakeDown == true)
if (!intakeDown) { ... }      // true when intakeDown is false
```



! means not.

### Combining conditions: && and ||

(You saw && in Lesson 2.)

```java
boolean visionLocked = true;
boolean shooterReady = true;
```

```java
if (visionLocked && shooterReady) {
    System.out.println("Shoot");
}
```

```java
if (batteryPercent < 20 || batteryPercent > 100) {
    System.out.println("Check battery reading");
}
```



### Ternary Operator

The ternary operator is a shorthand for an if-else statement. It returns one of two values based on a condition.

```java
// Syntax: condition ? valueIfTrue : valueIfFalse;
int score = 100;
String result = (score >= 50) ? "Pass" : "Fail";
System.out.println(result); // Prints "Pass"
```



### Switch Statement

A switch statement is useful when you need to compare a single variable against multiple specific values. It is cleaner than using many else if blocks and can handle Strings, not just integers.

```java
int day = 2;
switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    default:
        System.out.println("Other day");
}
```



Remember to use break to stop the code from falling through to the next case. Use default to handle values that don't match any case.

### Braces

Always use { } around the body, even for one line. It prevents bugs when you add another line later.

```java
if (batteryPercent < 20) {
    System.out.println("Low battery");
}
```



### Common mistakes

- Using = instead of == in a condition
- Missing braces
- Semicolon after if — if (x > 0); { ... } makes the if do nothing
- Comparing String with == — for text equality you will learn .equals soon; for this lesson compare numbers and booleans
- Code outside main — keep these decisions inside main for now (methods come in Lesson 6)

## Try it yourself

Edit `Main.java`. Put **all** challenge code inside `main`. Use the suggested variable values so your output matches the tests.

### Challenge 1 â€” Shooter ready

`double rpm = 3200;`  
If `rpm >= 3000` print `Shooter ready`, else print `Spinning up`.

### Challenge 2 â€” Alliance

`char alliance = 'R';`  
Print `Red`, `Blue`, or `Unknown`.

### Challenge 3 â€” Can shoot?

`boolean hasNote = true;` and `boolean atSpeed = true;`  
If both are true print `Fire`, else print `Wait`.

### Challenge 4 â€” Speed limit

`double driveSpeed = 1.2;`  
If `driveSpeed >= 1.0` print `Too fast` (mention capping at 1.0), else print `Speed OK`.

### Challenge 5 â€” Ternary speed

`double driveSpeed = 0.8;`  
Use a ternary so `speedStatus` is `"Fast"` or `"Slow"` when `driveSpeed > 0.5`. Print it.

### Challenge 6 â€” Switch mode

`int mode = 1;`  
Switch: `1` â†’ `Auton`, `2` â†’ `Teleop`, else â†’ `Disabled`.

### Check your understanding

1. When does the else block run?

2. What is the difference between = and ==?

3. What does !ready mean if ready is true?

4. When is a && b true?

5. When is a || b true?

6. What is the syntax for a ternary operator?

7. When is a switch statement preferred over if-else blocks?

8. What is the purpose of the 'break' keyword in a switch statement?

Answers on the next page

### Looking ahead

In Lesson 5, you will use loops to repeat code — for example, printing a countdown or running a step several times. Loops use the same true/false conditions you just practiced.

Lesson complete. When you can write if, else if, and else with comparisons and &amp;&amp; / ||, you are ready for Lesson 5.

---

Answers

1. When the if condition is false.

2. = stores a value; == asks if two values are equal.

3. false (! flips true/false).

4. When both a and b are true.

5. When at least one of a or b is true.

6. condition ? valueIfTrue : valueIfFalse;

7. When you need to compare a single variable against multiple specific values.

8. To stop the code from falling through to the next case.
