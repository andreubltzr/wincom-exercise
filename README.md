# Wincom Consulting Exercise

This repository contains my solution of the exercise for the job application process.

## Repository Structure
- src/main/java/org/wincom: Contains the source code for the solution
- Below this README you will find my answers to the questions in point nº 4 that was included in the provided PDF file

## 4. Optional (No code, just answers)
### What would you change if the list of keywords was large (several millions)?
My first thought is by using a database to retrieve suggestions based in the given input.

### What would you change if the requirements were to match any portion of the keywords (example: for string “pro”, code would possibly return “reprobe”)?
In my given solution, I would modify the logic of the if block (Autocomplete.java, line 28) and instead check if the given input is contained within any part of the keyword rather than checking if the keyword starts with the given input. Replacing .startsWith() with .contains() might just achieve this.

## Feedback
Your feedback is greatly appreciated! Feel free to share any ideas, improvements, or questions you have about my solution. Your input helps me grow as a developer and improve my skills.

## Contact information
- Email: [andreubltzr11@gmail.com](mailto:andreubltzr11@gmail.com)
- LinkedIn: [Andreu Baltazar](https://www.linkedin.com/in/andreu-baltazar/)
