#! /bin/bash

pandoc --number-sections --table-of-contents -o ../pdf/$1.pdf $1.md

echo "../pdf/$1.pdf done"
