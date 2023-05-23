# Spring Core Study

---
## gradle 한글 인코딩 설정하기

1. Shift 두 번 타건 후 통합검색창에 vm 검색
2. 사용자 지정 vm 옵션 편집 클릭
3. 가장 아랫줄에 **`-Dfile.encoding=utf-8`** 입력 후 인텔리제이 재실행

---
## 인텔리제이 화면상 글씨 폰트 크기 조절

1. File 메뉴창에서 Settings 선택
2. 좌측Editor 탭의 General 선택
3. 상단의 Change font size(Zoom) with Ctrl-Mouse Wheel 체크 및 저장
4. Ctrl 누르고 휠 위 아래로 움직이면 확대 및 축소 가능

---
## 테마 및 아이콘 설치

1. plugin에서 material 검색
2. Atom material icon, Material Theme UI 적용
   (File -> Settings -> Theme 검색 후 모양 탭에서 테마 선택)

---
## 깃허브 연동

1. File -> Settings -> Version Control -> 깃허브 계정 등록
2. 하단부에 Terminal 열고 $ git rm -r --cached 입력

---
## 자바 옵션이 안 보이는 경우
1. File -> Settings -> build tools -> gradle 하단 SDK 세팅
2. File -> project structure -> projects의 SDK는 버전 맞게
   하단의 Language level은 sdk default로 설정