#! /bin/bash

pandoc -w html --template ../templates/html-template.html --number-sections --toc --highlight-style=tango -o ../html/$1.html $1.md

echo "../html/$1.html done"
