#! /bin/bash

pandoc -w dzslides --template ../templates/slide-template.html --number-sections --email-obfuscation=none -o ../slides/$1.slide.html $1.md

sed -i s/h1\>/h2\>/g ../slides/$1.slide.html

sed -i s/\>\<h2/\>\<h1/g ../slides/$1.slide.html

sed -i s/\\/h2\>\</\\/h1\>\</g ../slides/$1.slide.html

echo "../slides/$1.slide.html done"
