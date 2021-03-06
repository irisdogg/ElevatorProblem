����   2 �  "com/ru/usty/elevator/ElevatorScene  java/lang/Object VISUALIZATION_WAIT_TIME I ConstantValue  � numberOfFloors numberOfElevators personCount Ljava/util/ArrayList; 	Signature *Ljava/util/ArrayList<Ljava/lang/Integer;>; exitedCount exitedCountMutex  Ljava/util/concurrent/Semaphore; sem <init> ()V Code
    	     LineNumberTable LocalVariableTable this $Lcom/ru/usty/elevator/ElevatorScene; restartScene (II)V ! java/util/concurrent/Semaphore
   #  $ (I)V	  &   ( java/lang/Thread * $com/ru/usty/elevator/ElevatorScene$1
 ) ,  - '(Lcom/ru/usty/elevator/ElevatorScene;)V
 ' /  0 (Ljava/lang/Runnable;)V
 ' 2 3  start	  5 	 	  7 
  9 java/util/ArrayList
 8 	  <  
 > @ ? java/lang/Integer A B valueOf (I)Ljava/lang/Integer;
 8 D E F add (Ljava/lang/Object;)Z
 8 H I  clear
  K L M getNumberOfFloors ()I	  O   i StackMapTable 	addPerson (II)Ljava/lang/Thread; U com/ru/usty/elevator/Person
 T W  
 8 Y Z [ get (I)Ljava/lang/Object;
 > ] ^ M intValue
 8 ` a b set '(ILjava/lang/Object;)Ljava/lang/Object; sourceFloor destinationFloor person Lcom/ru/usty/elevator/Person; personThread Ljava/lang/Thread; getCurrentFloorForElevator (I)I elevator getNumberOfPeopleInElevator getNumberOfPeopleWaitingAtFloor floor setNumberOfFloors getNumberOfElevators setNumberOfElevators isElevatorOpen (I)Z
  u i j
  w x s isButtonPushedAtFloor
  z m j personExitsAtFloor
   } ~  acquire
   � �  release
 � � � java/lang/InterruptedException �  printStackTrace e  Ljava/lang/InterruptedException; getExitedCountAtFloor 
SourceFile ElevatorScene.java InnerClasses !                	     
                        	     	             <     
*� *� �              	         
           ;     ��  Y� "� %� 'Y� )Y*� +� .� 1*� 4*� 6*� 8Y� :� ;>� *� ;� =� CW����*� � *� 8Y� :� � 
*� � G>� *� � =� CW�*� J���  Y� "� N�       J    %  '  1  ? " @ ' B 2 C 7 D C C K G R H ] I ` K g M l N x M � P � Q    4    �       � 	     � 
   4  P   i  P   Q    � 7� �   R S     �     7� TY� VN� 'Y-� .:� 1*� ;*� ;� X� >� \`� =� _W�           X 
 Z  \  g 5 h    4    7       7 c     7 d   
 - e f   # g h   i j     6     �           o                k    l j     i     �                 ���           v  w  x  y                k   Q      m j     C     *� ;� X� >� \�           �                n    L M     /     *� 4�           �              o $     >     *� 4�       
    �  �                	    p M     /     *� 6�           �              q $     >     *� 6�       
    �  �                
    r s     >     
**� t� v�           �        
       
 k    x s     I     *� y� ��           �                n   Q    
  { $     �     1� N� |*� *� � X� >� \`� =� _W� N� � M,� ��    ( + �         �  � " � ( � , � 0 �         1       1 n   ,  � �  Q    k �  � j     ^     *� J� *� � X� >� \��           �  �  �                n   Q      �    � �   
  )      