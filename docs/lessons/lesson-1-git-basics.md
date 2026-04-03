# Lesson 1 — Git Basics (hands-on)

Objective: Learn local Git workflow, branching, commits, and opening a PR.

Quick commands (run in the project folder):

1. Initialize a repo locally:

   git init

2. Create and switch to a feature branch:

   git checkout -b feature/your-name-groovy

3. Stage and commit changes:

   git add .
   git commit -m "feat: add initial groovy monitor script"

4. Push to a remote (replace `origin` and branch name):

   git remote add origin <your-remote-url>
   git push -u origin feature/your-name-groovy

5. Open a Pull Request on GitHub from your branch to `main`.

Exercises:
- Edit `scripts/monitor.groovy` to add a timestamp and commit your change.
- Create a small README update and open a PR; practice adding a good description.

If you want, I can run these commands here and walk you through each step interactively.
