#! /bin/bash

rm ../pdf/*
echo "folder pdf cleaned"

for FILE in *.md; do

  FILE_WITHOUT_EXTENSION=${FILE%%.*}

  ../bin/txt2pdf.sh $FILE_WITHOUT_EXTENSION

done
