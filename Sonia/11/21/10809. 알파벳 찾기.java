import java.io.*;

public class Main {
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        char[] text = br.readLine().toCharArray(); //split이 아니라 .toCharArray()
        int[] alphabet = new int[26]; //알파벳 26자 확인 위함
 
        //int numA =(int)a;  //'a'의 아스키코드 숫자를 알 수 있음 
        
				for(int i=0; i<26; i++){

           //alphabet[i] = (int)('a'+i); //a~z 아스키코드 숫자 저장
           alphabet[i] =-1; // -1 로배열 초기화

        }
          
             for(int j=0; j<text.length; j++){ //입력 text for문 돌리기
                 int index = (int)text[j] -(int)'a'; 
                //만약 char[0]='b'->(int)'a'->98-97  따라서 index=1; 입력 글자의 인덱스를 미리 저장해줄 수 있다.
								 if(alphabet[index]== -1){  //-1 로 초기화 해준걸 바꿔주기 위함
                     alphabet[index] = j; //alphabet[1] = text의 인덱스번호인 0으로 값이 바뀜

                 }
             
         }
        for(int i :alphabet){
           System.out.print(i+" ");
        }
    }
}

/*
indexOf() 를 활용하여 훨씬 간단하게 해결 할 수 있었음. indexOf가 찾는 문자의 인덱스를 반환하고 찾지 못할 경우 -1을 반환하는 것을 활용


import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuilder sb = new StringBuilder();

        // 'a'에서 'z'까지 각 문자에 대해 반복
        for (char c = 'a'; c <= 'z'; c++) {
            // 입력 문자열에서 문자의 첫 번째 등장 위치를 추가
            sb.append(str.indexOf(c)).append(" ");
        }

        // 결과 출력
        System.out.println(sb);
    }
}

*/
