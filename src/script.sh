#!/bin/bash

# 파일명 배열
filenames=("filename1" "filename2" "filename3")

# 현재 날짜를 YYYYMMDD 형식으로 가져오기
current_date=$(date +%Y%m%d)

# 배열을 순회하면서 ls -al 명령어 실행
for filename in "${filenames[@]}"; do
  ls -al "${filename}_${current_date}"
done

chmod +x script.sh
./script.sh