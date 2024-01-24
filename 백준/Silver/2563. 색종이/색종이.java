import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        		
        		
        int[][] whiteBoard = new int[101][101];
        int area = 0;
        
        for(int i=0; i<N; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine()); //한줄에 들어온 문자열을 나눈다
            int x = Integer.parseInt(st.nextToken()); //처음 들어온 숫자를 저장한다
            int y = Integer.parseInt(st.nextToken()); 
            
        //    x+1~ x+10; y+1 ~ y+10; 
            
            for(int j=x+1; j<=x+10; j++) {
                for(int k=y+1; k<=y+10; k++) {
                    
                	if(whiteBoard[j][k] == 0) {
                		area++;
                		whiteBoard[j][k] = 1;
                	}
                }
                
            }
            
        }
//        for(int i=0; i<100; i++) {
//        	for(int j=0; j<100; j++) {
//        		if(whiteBoard[i][j]==1)
//        			area++;
//        	}
//        }
        System.out.println(area);
    }    
}