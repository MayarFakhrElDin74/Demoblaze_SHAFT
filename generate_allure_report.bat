@echo off
:: If you already have a valid JAVA_HOME environment variable set, feel free to comment the below two lines
set JAVA_HOME=C:\Users\lenovo\.p2\pool\plugins\org.eclipse.justj.openjdk.hotspot.jre.full.win32.x86_64_17.0.6.v20230125-1136\jre
set path=%JAVA_HOME%\bin;%path%
set path=C:\Users\lenovo\.m2\repository\allure\allure-2.20.1\bin;%path%
allure serve allure-results
pause
exit