@echo off
set DIR="%~dp0"
set JAVA_EXEC="%DIR:"=%\java"
pushd %DIR% & %JAVA_EXEC%  -p "%~dp0/../app" -m era.main/org.example.era.Main  %* & popd
