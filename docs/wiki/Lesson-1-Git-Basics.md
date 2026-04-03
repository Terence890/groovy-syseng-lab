# Lesson 1 — Git Basics

Objective: Learn a simple local Git workflow, branching, commits, and opening a PR.

Step-by-step (project root)

```
git init
git checkout -b feature/your-name-groovy
git add .
git commit -m "feat: add initial groovy monitor script"
git remote add origin https://github.com/Terence890/groovy-syseng-lab.git
git push -u origin feature/your-name-groovy
```

Open a Pull Request on GitHub from your branch to `main` and request a review.

Exercises
- Add a timestamp to `scripts/monitor.groovy`, commit, push, and open a PR.
- Practice writing a clear PR description and requesting a reviewer.
