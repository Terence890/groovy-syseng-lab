# Publishing the Wiki

Two simple ways to publish these pages to GitHub:

1) Copy-paste: Use the repository "Wiki" tab and paste Markdown into new pages.

2) Use the GitHub Wiki repo (recommended for multiple pages):

PowerShell example (from project root):

```powershell
git clone https://github.com/Terence890/groovy-syseng-lab.wiki.git
Set-Location groovy-syseng-lab.wiki
Copy-Item -Path "..\system-eng-starter\docs\wiki\*" -Destination . -Recurse
git add .
git commit -m "docs: initial wiki pages"
git push
```

If you want, I can run these steps for you (I will need permission to push to the remote repo from this machine).
