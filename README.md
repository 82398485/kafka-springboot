# kafka-springboot
Some operations of kafka with springboot

# kafka-startup
###1. install kafka    
https://www.cnblogs.com/justuntil/p/8033792.html

###2. install zookeeper   
http://www.cnblogs.com/wangyangliuping/p/5546506.html

###3. close firewall  
systemctl stop firewalld.service    #stop firewall
systemctl disable firewalld.service #stop firewall autorun

###4. modify kafka config 
advertised.listeners=PLAINTEXT://192.168.10.72:9092   

###5. start kafka at backend  
bin/kafka-server-start.sh config/server.properties 1>/dev/null 2>&1 &  

###6. start zookeeper    
./zkServer.sh start

###7. check kafka and zookeeper is running  
netstat -tunlp|egrep "(2181|9092)"

###8. run the example  


