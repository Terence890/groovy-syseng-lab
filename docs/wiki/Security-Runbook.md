# Security Runbook

If you discover a vulnerability or sensitive data exposure, follow these steps.

Immediate steps
- Stop further sensitive actions and collect relevant logs.
- Remove access keys from public locations and rotate credentials.
- Open a private issue and notify the repository owner / security contact.

Reporting
- Contact: security@example.com (replace before public publishing)

Prevention and hygiene
- Do not commit secrets; use environment variables or secret stores.
- Run periodic scans (e.g., `git-secrets`, `trufflehog`) on the repo.
- Limit logging of sensitive information.
