=== src/main/java


com.cafe24.springcontainer.user
com.cafe24.springcontainer.soundsystem
com.cafe24.springcontainer.videosystem
   |- DigitalVideoDisc
   |- Avengers
   |- DVDPalyer
   |- BlankDisc
   |- DVDPack


config.user
   |--------  UserConfig.java
config.soundsystem
   |--------  CDPlayerConfig.java   (자동)
config.videosystem
   |--------  DVDPlayerConfig.java  (명시적 설정)



=== src/main/resources

config.user
   |--------  UserConfig.xml
config.soundsystem
   |--------  CDPlayerConfig.xml   (자동)
config.videosystem
   |--------  DVDPlayerConfig.xml  (명시적 설정)



=== src/test/java
   |---- com.cafe24.springcontainer.soundsystem
   |       |-- CDPlayerJavaConfigTest.Java
   |       |-- CDPlayerXmlConfigTest.Java
   |       
   |---- com.cafe24.springcontainer.videosystem
           |-- DVDPlayerJavaConfigTest.java
           |-- DVDPlayerXmlConfigTest.java
           |-- DVDPlayerMixingConfigTest01.java
           |-- DVDPlayerMixingConfigTest02.java
           |-- DVDPlayerMixingConfigTest03.java
