# Postmark Java API

You can browse JavaDoc for Project on [http://sejpalsaurabh.github.io/postmark-api-doc/]

You need to create a file named ```postmark.properties```
and need to provide server and account tokens into that.

Sample ```postmark.properties``` file.
```
server-key      =   <Postmark Server Token>
account-key     =   <Postmark Account Token>
from            =   <From Email>
reply-to        =   <Reply To Email>
isHTML          =   true or false
isTracked       =   true or false
```

Also we have used log4j for logging purpose into ```postmark``` Project,
Sample ```log4j.properties``` file.
```
# LOG4J configuration
log4j.rootLogger=DEBUG, Appender1,Appender2

log4j.appender.Appender1=org.apache.log4j.ConsoleAppender
log4j.appender.Appender1.layout=org.apache.log4j.PatternLayout
log4j.appender.Appender1.layout.ConversionPattern=%-7p %d [%t] %c %x - %m%n

log4j.appender.Appender2=org.apache.log4j.FileAppender
log4j.appender.Appender2.File=<Log File Path>
log4j.appender.Appender2.layout=org.apache.log4j.PatternLayout
log4j.appender.Appender2.layout.ConversionPattern=%-7p %d [%t] %c %x - %m%n
```

Above is the minimal basic configuration to use postmark lib.
