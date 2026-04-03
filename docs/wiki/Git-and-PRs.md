# Git & PRs

Branching strategy
- `feature/<short-desc>` for new work
- `fix/<short-desc>` for bug fixes
- `chore/<short-desc>` for maintenance

Create a PR
1. Push your branch to the remote.
2. Open a Pull Request targeting `main`.
3. Fill the PR template and describe the change, testing steps, and any rollout notes.

Review checklist
- Does the code/changes have a clear purpose?
- Are tests or manual verification steps included?
- No secrets or credentials in the diff?
- Docs updated if the behavior changed?

Good PR practices
- Keep PRs small and focused.
- Use descriptive commit messages and a clear PR title.
