# Runbook

Purpose: quick operational steps to run the example scripts and a few troubleshooting notes.

Run the system inspector
1. Ensure Java and Groovy are installed.
2. From the project root run:

```
groovy scripts/monitor.groovy
```

Troubleshooting
- If `groovy` is not found, install Groovy (SDKMAN recommended for macOS/Linux) or use the official Windows installer.
- For permission or classpath issues, run the script with `groovy -cp . scripts/monitor.groovy`.

When to escalate
- Repeated failures across environments — collect logs and open an issue with steps to reproduce.
- Suspected security incident — follow the Security runbook.
