����   2 0  (com/ru/usty/elevator/ElevatorMainProgram  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this *Lcom/ru/usty/elevator/ElevatorMainProgram; main ([Ljava/lang/String;)V
    ,com/ru/usty/elevator/visualization/TestSuite   startVisualization &()Lcom/ru/usty/elevator/ElevatorScene;      �
    java/lang/Thread   sleep (J)V
     ! runTest (I)V      �
 % ' & java/lang/InterruptedException (  printStackTrace args [Ljava/lang/String; e  Ljava/lang/InterruptedException; StackMapTable 
SourceFile ElevatorMainProgram.java !               /     *� �    
                    	       ~     � W � �  "� � L+� $�      %  
       
   
         "         ) *     + ,  -    W %  .    /