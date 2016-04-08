/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordcount;

/**
 *
 * @author dfa
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Wordcount {
	 public static void main(String[] args){
		try {
                    int x=0;
                    int y=0;
                    int z=0;
                    int n=0;
                    int m=0;
                    Scanner in = new Scanner(new File("hlz.txt"));
                    while (in.hasNextLine()) {
                        String str = in.nextLine();
                        for(int i=0;i<str.length();i++)
                        {
                            char b=str.charAt(i);
                            if((b>=97&&b<=122)||(b>=65&&b<=90))
                            {
                                m++;
                                if((i==str.length()-1))
                                {
                                    y++;
                                    m=0;
                                }
                            }
                            else
                            {
                                if(m>0)
                                {
                                    y++;
                                    m=0;
                                }
                            }
                            n=i+1;
                        }
                        x+=n;
                        z++;
                    }
	            System.out.println("字符数为："+x);
	            System.out.println("单词数为："+y);
	            System.out.println("行数为："+z);
	        } 
                catch (FileNotFoundException e) {
	            e.printStackTrace();
	        }
		 
	 }
}