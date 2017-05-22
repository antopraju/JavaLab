/*
11. Write a Java Program that creates two threads object of Thread class. Where one thread asks the user to enter a number not less than four digits. Split the digits of the number and display in words the value of the number. Ex: 1 – One. Second thread finding the number of vowels in a word. Ex: JAVA – Vowel - A, Count – 2.
*/

import java.util.Scanner;

public class Threads {
		public static void main(String[] args){
			final String word;
			final int num;
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number:");
			num = sc.nextInt();
			System.out.println("Enter the Word");
			word = sc.next();
			sc.close();
			
			Runnable r1 = new Runnable(){
				public void run(){
					int n;
					n = num;
					String text = "";
					while(n > 0){
						switch(n % 10){
							
						case 1: text = "one " + text; break;
						case 2: text = "two " + text; break;
						case 3: text = "three " + text; break;
						case 4: text = "four " + text; break;
						case 5: text = "five " + text; break;
						case 6: text = "six " + text; break;
						case 7: text = "seven " + text; break;
						case 8: text = "eight " + text; break;
						case 9: text = "nine " + text; break;
						case 0: text = "zero " + text; break;
						}
						n /= 10;
					}
					System.out.println(text);
				}
				
			};
			
			Runnable r2 = new Runnable(){
				public void run(){
					char c;
					int vowels = 0, constants = 0;
					for(int i = 0; i < word.length(); i++){
						c = word.charAt(i);
						switch(c){
						case 'a':
						case 'e':
						case 'i':
						case 'o':
						case 'u':
						case 'A':
						case 'E':
						case 'I':
						case 'O':
						case 'U':	vowels++;break;
						default:    constants++;
						}
					}
					System.out.println("Vowels: "+vowels+"\nConstants: "+constants);
				}	
			};
			
			Thread t1 = new Thread(r1);
			t1.start();
			
			Thread t2 = new Thread(r2);
			t2.start();
			
			}
}
