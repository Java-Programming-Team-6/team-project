# English Dictionary
## _English Dictionary that supports English pronunciation in many countries_

### Configuration Map
![image8](https://user-images.githubusercontent.com/79684170/119258692-cc194a80-bc05-11eb-9770-c7cbd8f1d5f7.png)

## 프로그램 실행 방법
### 프로그램 설치
1. team project master branch 다운로드
2. Program 디렉토리 -> Main.java, DictionaryGUI.java, DictionaryTTS.java, FileIO.java, mbrola 디렉토리, DictionaryData 디렉토리, CookiRun Black.ttf, Maplestory Bold.ttf 확인
3. mbrola 디렉토리, DictionaryData 디렉토리들을 C드라이브에 옮기기 (각각 C:\\mbrola, C:\\DictionaryData 으로 설정)
4. CookiRun Black.ttf / Maplestory Bold.ttf 폰트 두 가지 모두 설치
5. "Dictionary" java project 생성 -> "Dictionary" package 생성 -> Main.java, DictionaryGUI.java, DictionaryTTS.java, FileIO.java 추가
### 프로그램 환경 구성
1. jdk-15.0.2 와 호환되는 jdk 요구됨.
2. FreeTTS-1.2.2 설치 : https://sourceforge.net/projects/freetts/files/ -> FreeTTS 1.2.2 -> freetts-1-2-2-bin.zip 다운로드
3. freetts-1.2.2-bin -> freetts-1.2 -> lib -> jsapi.exe 실행 : 실행하면 jsapi.jar 설치 완료
4. java project -> Properties -> Java Build Path -> Libraries -> Classpath -> Add External JARs...
5. lib 디렉토리 내의 모든 ".jar" 파일 추가
### 프로그램 실행
1. Main.java, DictionaryGUI.java, DictionaryTTS.java, FileIO.java 파일 확인
2. Main.java 실행

## Reference
- FreeTTS : https://freetts.sourceforge.io/
- MBROLA : https://github.com/numediart/MBROLA-voices
