����   2 8  com/ru/usty/elevator/Elevator  java/lang/Object  java/lang/Runnable <init> ()V Code
     LineNumberTable LocalVariableTable this Lcom/ru/usty/elevator/Elevator; main ([Ljava/lang/String;)V args [Ljava/lang/String; run	    "com/ru/usty/elevator/ElevatorScene   sem  Ljava/util/concurrent/Semaphore;
    java/util/concurrent/Semaphore   acquire
 ! # " java/lang/InterruptedException $  printStackTrace	 & ( ' java/lang/System ) * out Ljava/io/PrintStream; , Person Thread
 . 0 / java/io/PrintStream 1 2 println (Ljava/lang/String;)V e  Ljava/lang/InterruptedException; StackMapTable 
SourceFile Elevator.java !            	   /     *� 
�                        	    	   +      �                            	   p     � � � L+�  � %+� -�     	 !            
                  
  3 4  5    I !  6    7