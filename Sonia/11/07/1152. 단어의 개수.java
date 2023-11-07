import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws Exception  {
    
    	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	        StringTokenizer st = new StringTokenizer(br.readLine()," ");               
                    System.out.println(st.countTokens());
                    br.close();
          }	
    }

/*
방법2. split(),trim() 활용 / 주의: 아무것도 입력 안했을 때 _+enter : 1로 카운팅됨 
import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException  {
    
    	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	        
    	       String input = br.readLine().trim(); // 양쪽 끝 공백 제거 
                 if(input.equals("")) {
                    System.out.print(0);  // enter가 기준이기때문에 _+enter : 1로 카운팅 됨
                     return;
                }      
        
               String []arr = input.split(" ");
    	        System.out.print(arr.length);
               
    	    }
    	
    }



*/
