shiny-print
===========

dbd project

1. Download https://code.google.com/p/msysgit/downloads/list
   During installation choose the option which allows the msygit to be added to the classpath.If you don't want to choose this option then follow the instructions from here:
   http://blog.countableset.ch/2012/06/07/adding-git-to-windows-7-path/
   After that only click next, next

2. Download gitHub for Windows :
https://help.github.com/articles/set-up-git

3 From Windows gitHub,from Tools ->Options change the default repository directory.Then make a clone of the repository.

4. In the folder .git/info from project in the exclude add the following:

.classpath
.project
.settings
target/
.springBeans

5. Basic commands:
 git checkout -b branchName 
  creates a new branch 
  
 git status 
 git gui
 git add.
 git commit -m""
 git fetch
 git push origin master