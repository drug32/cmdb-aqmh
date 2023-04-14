@rem
@rem Copyright 2015 the original author or authors.
@rem
@rem Licensed under the Apache License, Version 2.0 (the "License");
@rem you may not use this file except in compliance with the License.
@rem You may obtain a copy of the License at
@rem
@rem      https://www.apache.org/licenses/LICENSE-2.0
@rem
@rem Unless required by applicable law or agreed to in writing, software
@rem distributed under the License is distributed on an "AS IS" BASIS,
@rem WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
@rem See the License for the specific language governing permissions and
@rem limitations under the License.
@rem

@if "%DEBUG%" == "" @echo off
@rem ##########################################################################
@rem
@rem  cmdb-aqmh startup script for Windows
@rem
@rem ##########################################################################

@rem Set local scope for the variables with windows NT shell
if "%OS%"=="Windows_NT" setlocal

set DIRNAME=%~dp0
if "%DIRNAME%" == "" set DIRNAME=.
set APP_BASE_NAME=%~n0
set APP_HOME=%DIRNAME%..

@rem Resolve any "." and ".." in APP_HOME to make it shorter.
for %%i in ("%APP_HOME%") do set APP_HOME=%%~fi

@rem Add default JVM options here. You can also use JAVA_OPTS and CMDB_AQMH_OPTS to pass JVM options to this script.
set DEFAULT_JVM_OPTS="--add-opens" "java.base/java.lang=ALL-UNNAMED"

@rem Find java.exe
if defined JAVA_HOME goto findJavaFromJavaHome

set JAVA_EXE=java.exe
%JAVA_EXE% -version >NUL 2>&1
if "%ERRORLEVEL%" == "0" goto execute

echo.
echo ERROR: JAVA_HOME is not set and no 'java' command could be found in your PATH.
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:findJavaFromJavaHome
set JAVA_HOME=%JAVA_HOME:"=%
set JAVA_EXE=%JAVA_HOME%/bin/java.exe

if exist "%JAVA_EXE%" goto execute

echo.
echo ERROR: JAVA_HOME is set to an invalid directory: %JAVA_HOME%
echo.
echo Please set the JAVA_HOME variable in your environment to match the
echo location of your Java installation.

goto fail

:execute
@rem Setup the command line

set CLASSPATH=%APP_HOME%\lib\cmdb-aqmh-1.0.jar;%APP_HOME%\lib\auth-library-1.1.0.jar;%APP_HOME%\lib\embed-server-it.1.1.0.jar;%APP_HOME%\lib\websecurity-library-it.1.1.0.jar;%APP_HOME%\lib\service-server-library-it.1.1.0.jar;%APP_HOME%\lib\commons-fileupload-1.4.jar;%APP_HOME%\lib\user-auth-rights-library-it.1.1.0.jar;%APP_HOME%\lib\cache-library-it.1.1.0.jar;%APP_HOME%\lib\config-client-library-it.1.1.0.jar;%APP_HOME%\lib\data-access-library-it.1.1.0.jar;%APP_HOME%\lib\key-library-it.1.1.0.jar;%APP_HOME%\lib\tomcat-embed-websocket-10.0.14.jar;%APP_HOME%\lib\postgresql-42.2.20.jar;%APP_HOME%\lib\jaxen-1.1.1.jar;%APP_HOME%\lib\xom-1.0.jar;%APP_HOME%\lib\xercesImpl-2.12.1.jar;%APP_HOME%\lib\dcoos-eop-library-1.1.0.jar;%APP_HOME%\lib\http-library-it.1.1.0.jar;%APP_HOME%\lib\grpc-library-it.1.1.0.jar;%APP_HOME%\lib\task-library-it.1.1.0.jar;%APP_HOME%\lib\lang-library-it.1.1.0.jar;%APP_HOME%\lib\log4j-extension-library-it.1.1.0.jar;%APP_HOME%\lib\log4j-core-2.17.1.jar;%APP_HOME%\lib\log4j-api-2.17.1.jar;%APP_HOME%\lib\spring-aspects-4.1.6.RELEASE.jar;%APP_HOME%\lib\aspectjweaver-1.9.5.jar;%APP_HOME%\lib\mybatis-plus-3.5.0.jar;%APP_HOME%\lib\commons-pool-1.5.1.jar;%APP_HOME%\lib\mybatis-plus-generator-3.5.0.jar;%APP_HOME%\lib\velocity-engine-core-2.3.jar;%APP_HOME%\lib\tomcat-embed-core-10.0.14.jar;%APP_HOME%\lib\tomcat-embed-logging-juli-8.5.2.jar;%APP_HOME%\lib\tomcat-jdbc-10.0.14.jar;%APP_HOME%\lib\spring-jdbc-4.1.6.RELEASE.jar;%APP_HOME%\lib\swagger-servlet-1.6.0.jar;%APP_HOME%\lib\grpc-protobuf-1.34.1.jar;%APP_HOME%\lib\grpc-stub-1.34.1.jar;%APP_HOME%\lib\swagger-core-1.6.0.jar;%APP_HOME%\lib\reflections-0.9.11.jar;%APP_HOME%\lib\grpc-netty-shaded-1.34.1.jar;%APP_HOME%\lib\grpc-core-1.34.1.jar;%APP_HOME%\lib\grpc-protobuf-lite-1.34.1.jar;%APP_HOME%\lib\grpc-api-1.34.1.jar;%APP_HOME%\lib\ctg-cache-nclient-2.4.2.jar;%APP_HOME%\lib\guava-29.0-jre.jar;%APP_HOME%\lib\javax.servlet-api-4.0.1.jar;%APP_HOME%\lib\kryo-5.1.1.jar;%APP_HOME%\lib\commons-io-2.2.jar;%APP_HOME%\lib\checker-qual-3.5.0.jar;%APP_HOME%\lib\dom4j-1.6.1.jar;%APP_HOME%\lib\xalan-2.6.0.jar;%APP_HOME%\lib\mybatis-plus-extension-3.5.0.jar;%APP_HOME%\lib\commons-lang3-3.11.jar;%APP_HOME%\lib\json-path-2.2.0.jar;%APP_HOME%\lib\jetty-client-11.0.0.jar;%APP_HOME%\lib\jetty-http-11.0.0.jar;%APP_HOME%\lib\jetty-alpn-client-11.0.0.jar;%APP_HOME%\lib\jetty-io-11.0.0.jar;%APP_HOME%\lib\jetty-util-11.0.0.jar;%APP_HOME%\lib\swagger-models-1.6.0.jar;%APP_HOME%\lib\slf4j-log4j12-1.7.16.jar;%APP_HOME%\lib\quartz-2.2.1.jar;%APP_HOME%\lib\slf4j-api-2.0.0-alpha1.jar;%APP_HOME%\lib\httpmime-4.4.jar;%APP_HOME%\lib\httpclient-4.4.jar;%APP_HOME%\lib\jackson-jaxrs-json-provider-2.10.1.jar;%APP_HOME%\lib\jackson-dataformat-xml-2.10.1.jar;%APP_HOME%\lib\jackson-jaxrs-base-2.10.1.jar;%APP_HOME%\lib\jackson-module-jaxb-annotations-2.10.1.jar;%APP_HOME%\lib\jackson-databind-2.10.1.jar;%APP_HOME%\lib\spring-context-support-4.1.6.RELEASE.jar;%APP_HOME%\lib\spring-context-4.1.6.RELEASE.jar;%APP_HOME%\lib\spring-tx-4.1.6.RELEASE.jar;%APP_HOME%\lib\spring-aop-4.1.6.RELEASE.jar;%APP_HOME%\lib\spring-beans-4.1.6.RELEASE.jar;%APP_HOME%\lib\spring-expression-4.1.6.RELEASE.jar;%APP_HOME%\lib\spring-core-4.1.6.RELEASE.jar;%APP_HOME%\lib\tomcat-annotations-api-10.0.14.jar;%APP_HOME%\lib\tomcat-juli-10.0.14.jar;%APP_HOME%\lib\failureaccess-1.0.1.jar;%APP_HOME%\lib\listenablefuture-9999.0-empty-to-avoid-conflict-with-guava.jar;%APP_HOME%\lib\perfmark-api-0.19.0.jar;%APP_HOME%\lib\jsr305-3.0.2.jar;%APP_HOME%\lib\error_prone_annotations-2.3.4.jar;%APP_HOME%\lib\j2objc-annotations-1.3.jar;%APP_HOME%\lib\reflectasm-1.11.9.jar;%APP_HOME%\lib\objenesis-3.2.jar;%APP_HOME%\lib\minlog-1.3.1.jar;%APP_HOME%\lib\mybatis-plus-core-3.5.0.jar;%APP_HOME%\lib\mybatis-spring-2.0.6.jar;%APP_HOME%\lib\RoaringBitmap-0.6.18.jar;%APP_HOME%\lib\httpcore-4.4.jar;%APP_HOME%\lib\commons-logging-1.2.jar;%APP_HOME%\lib\commons-codec-1.9.jar;%APP_HOME%\lib\json-smart-2.2.1.jar;%APP_HOME%\lib\jackson-dataformat-yaml-2.10.1.jar;%APP_HOME%\lib\jackson-core-2.10.1.jar;%APP_HOME%\lib\jackson-annotations-2.10.1.jar;%APP_HOME%\lib\woodstox-core-6.0.2.jar;%APP_HOME%\lib\stax2-api-4.2.jar;%APP_HOME%\lib\jsoup-1.10.2.jar;%APP_HOME%\lib\protobuf-java-3.12.0.jar;%APP_HOME%\lib\proto-google-common-protos-1.17.0.jar;%APP_HOME%\lib\animal-sniffer-annotations-1.18.jar;%APP_HOME%\lib\mybatis-plus-annotation-3.5.0.jar;%APP_HOME%\lib\jsqlparser-4.3.jar;%APP_HOME%\lib\mybatis-3.5.9.jar;%APP_HOME%\lib\jedis-2.9.0.jar;%APP_HOME%\lib\accessors-smart-1.1.jar;%APP_HOME%\lib\validation-api-1.1.0.Final.jar;%APP_HOME%\lib\javassist-3.21.0-GA.jar;%APP_HOME%\lib\jakarta.xml.bind-api-2.3.2.jar;%APP_HOME%\lib\jakarta.activation-api-1.2.1.jar;%APP_HOME%\lib\aopalliance-1.0.jar;%APP_HOME%\lib\gson-2.8.6.jar;%APP_HOME%\lib\annotations-4.1.1.4.jar;%APP_HOME%\lib\grpc-context-1.34.1.jar;%APP_HOME%\lib\commons-pool2-2.4.2.jar;%APP_HOME%\lib\commons-collections-3.2.2.jar;%APP_HOME%\lib\asm-5.0.3.jar;%APP_HOME%\lib\snakeyaml-1.24.jar;%APP_HOME%\lib\swagger-annotations-1.6.0.jar;%APP_HOME%\lib\jdom-1.0.jar;%APP_HOME%\lib\com.springsource.org.aspectj.weaver-1.6.8.RELEASE.jar;%APP_HOME%\lib\com.springsource.org.aopalliance-1.0.0.jar;%APP_HOME%\lib\js-21.3.0.jar;%APP_HOME%\lib\js-scriptengine-21.3.0.jar;%APP_HOME%\lib\log4j-1.2.17.jar;%APP_HOME%\lib\xmlParserAPIs-2.6.2.jar;%APP_HOME%\lib\icu4j-69.1.jar;%APP_HOME%\lib\com.springsource.net.sf.cglib-2.2.0.jar;%APP_HOME%\lib\quartz-jobs-2.2.1.jar;%APP_HOME%\lib\regex-21.3.0.jar;%APP_HOME%\lib\truffle-api-21.3.0.jar;%APP_HOME%\lib\graal-sdk-21.3.0.jar;%APP_HOME%\lib\c3p0-0.9.1.1.jar


@rem Execute cmdb-aqmh
"%JAVA_EXE%" %DEFAULT_JVM_OPTS% %JAVA_OPTS% %CMDB_AQMH_OPTS%  -classpath "%CLASSPATH%" com.chinatelecom.operations.aqmhserivce.Server %*

:end
@rem End local scope for the variables with windows NT shell
if "%ERRORLEVEL%"=="0" goto mainEnd

:fail
rem Set variable CMDB_AQMH_EXIT_CONSOLE if you need the _script_ return code instead of
rem the _cmd.exe /c_ return code!
if  not "" == "%CMDB_AQMH_EXIT_CONSOLE%" exit 1
exit /b 1

:mainEnd
if "%OS%"=="Windows_NT" endlocal

:omega
