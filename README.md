## startup 

java -jar target/dump.jar -Xmx20m --XX:+HeapDumpOnOutOfMemoryError --XX:HeapDumpPath=target/

curl http://127.0.0.1:8080/dump/v1/10000