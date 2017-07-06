# androidAdv
20170706
http://10.131.35.50:8080/url.txt
https://docs.google.com/document/d/1UhNCMT3vICNcisX4LOUIXYlsrLUwehK_5g3yPiQ6moc/edit
老師上課 google document

先叫醒 android studio (2.3.3)
Greenshot/CC356P008.pdf
開啟新的android project
MVC模式，Controller都是Activity(管全螢幕) 類似的叫做fragement(切割部分畫面)
Fragement1 chtti.com D:\androidadv20170706\androidadv\Fragement1
API19 4.4 FINISH
gradle proxy setting非常重要的部分 enable-https
workspace->透過gradle尋找相依性並抓取資料(走HTTP/HTTPS)
initialize

workspace會含多個project再含多個module(每一層都有build.gradle)
加目錄有一個.gradle老師已經設定好了
都會先下載在C:\Users\chtti\.gradle\caches
右下角gradle console BUILD SUCCESSFUL

project view 的 external lib可以看到這些 gradle file
stack machine 包含 stack heap(-Xmx Xms設定) global constant code
help=>edit Custome VM Options=> 增加compile效能 

Windows: %USERPROFILE%\.<CONFIGURATION_FOLDER>/
C:\Users\chtti\.AndroidStudio2.3
ref:https://developer.android.com/studio/intro/studio-config.html
放在使用者目錄git追不到
# custom Android Studio VM options, see http://tools.android.com/tech-docs/configuration
-Xmx2048m 打錯大小寫會開不了 studio
-Xms1576m



放在專案目錄
gradle.properties(android view gradle倒數第三個) 有global/project(上面數來第三個)兩種
org.gradle.jvmargs=-Xmx2048m -Xms1536m

global的 放在使用者目錄git追不到
org.gradle.parallel=true
org.gradle.daemon=true

記得sync gradle

file->setting->editor->general->Change font size(zoom) with ctrl-mouse wheel

gradle的改變 安裝
D:\androidadv20170706\androidadv\Fragement1
win gradlew.bat 
linux gradlew.sh
設定在D:\androidadv20170706\androidadv\Fragement1\gradle\wrapper\gradle-wrapper.properties
下下指令看看 gradlew 與 gradlew app:dependencies

SDK Manager進行更新相關SDK
C:\Users\chtti\AppData\Local\Android\sdk\extras\intel\Hardware_Accelerated_Execution_Manager\intelhaxm-android.exe

AVD Manger->create -> nexeus5->x86->lolliop 22 x86(ABI app binary interface) download
->adv option ram 1024 vmheaps 384->finish ->run

可以看android monitor和右下角有backgroud task運行狀況(第一次會久一點點>2m)
後面大概就是40s

調整字型 file->setting->editor->color&font->font(source code pro) language default comment doc tag text斜體取消

fVID 駱駝大寫找到
ctrl-shift-F
https://stackoverflow.com/questions/20252180/search-all-the-occurrences-of-a-string-in-the-entire-project-in-android-studio

file->project structure 改變JDK location cmd查java home(set JAVA) C:\Program Files\Java\jdk1.8.0_73
改完會看到gradle又重新build
把 setting的reopen關閉
