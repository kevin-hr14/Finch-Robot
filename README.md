# Finch-Robot

### Development Checklist

| Completed | Task         | Description |
|:---------:| :-----------:|:------------|
|    ✅     | Familiarize  | Learn how to: <ul><li>Connect to the robot</li><li>Interpret what built-in sensors detect</li><li>Setup local developing environment to code in Java</li></ul>|
|    ✅     | 3D Design    | <ul><li> Large rectangle on a cylincom, open some hole to pull the card out</li></ul>|
|    ❌     | Develop Code |             |

---

<details>
<summary><strong>Inspiration for the Project</strong></summary>

-I want to pass out Playing Card without moving around.

-Each time Playing UNO with my friends would easily make mistake in miss up order.

</details>

---

### Design Cycle
<img src="design_cycle.png" alt="design cycle" width="300" height="300">

###### Include commentary on your experience with the design cycle during this project
-At first I wanted to make a card holder consisting of three rectangles, but i found that the space requeired was too large and exceeded the printer's limit.

-After adjusment, the original three rectangles became one large rectangle, with the upper half of both sides being empty for storing cards, and holes at the bottom to help the cards slide out.
---

### Code to Highlight
```java
while (true) {
	int lL = f.getLeftLightSensor();
	int rL = f.getRightLightSensor();

	if (lL < t && rL < t) {
		f.setWheelVelocities(100, 100);
	} else if (lL > t && rL < t) {
                f.setWheelVelocities(50, 100);
	} else if (lL < t && rL > t) {
                f.setWheelVelocities(100, 50);
	} else {
                f.stopWheels();
                break;
	}

	f.sleep(100);
}
```

---

### Choose At Least Three of the Following to Include:
- What was your motivation?
  Don't miss up the order and hurt the happy feeling by mistake
  
- Why did you build this project? (Note: the answer is not "Because it was a homework assignment.")
  Because it help me organize my messy plan about my major which is mechatronic engineering
  
- What did you learn?
  How to build up 3D model, some keyword in the github, and how to wirte code in a robot.

