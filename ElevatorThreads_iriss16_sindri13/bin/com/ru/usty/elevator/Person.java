����   2 @  com/ru/usty/elevator/Person  java/lang/Object  java/lang/Runnable sourceFloor I destination <init> (II)V Code
   
  ()V	    	   	  LineNumberTable LocalVariableTable this Lcom/ru/usty/elevator/Person; main ([Ljava/lang/String;)V args [Ljava/lang/String; run	     "com/ru/usty/elevator/ElevatorScene ! " sem  Ljava/util/concurrent/Semaphore;
 $ & % java/util/concurrent/Semaphore '  acquire
 ) + * java/lang/InterruptedException ,  printStackTrace	 . 0 / java/lang/System 1 2 out Ljava/io/PrintStream; 4 Person Thread
 6 8 7 java/io/PrintStream 9 : println (Ljava/lang/String;)V e  Ljava/lang/InterruptedException; StackMapTable 
SourceFile Person.java !              	       
      Y     *� *� *� �              	 	  
                       	   	       +      �                               p     � � #� L+� (� -3� 5�     	 )            
                  
  ; <  =    I )  >    ?