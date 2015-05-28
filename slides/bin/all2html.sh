#! /bin/bash

rm ../html/*
echo "folder html cleaned"

for FILE in *.md; do

  FILE_WITHOUT_EXTENSION=${FILE%%.*}

  ../bin/txt2html.sh $FILE_WITHOUT_EXTENSION

done
