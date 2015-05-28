#! /bin/bash

rm ../slides/*
echo "folder slides cleaned"

for FILE in *.md; do

  FILE_WITHOUT_EXTENSION=${FILE%%.*}

  ../bin/txt2slide.sh $FILE_WITHOUT_EXTENSION

done
