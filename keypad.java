import java.util.*;

public class keypad {

    public static void main(String[] args) 
	{
	    int count=0;
	    Scanner sc=new Scanner(System.in);
	    String str=sc.nextLine();
	    int len=str.length();
	    char[] strdata = str.toCharArray();
	    for(int i=0;i<len;i++)
	    {
	        char inp=strdata[i];
	        switch(inp) 
    	    {
                case 'a':
                case ' ':
                case 'd':
                case 'g':
                case 'j':
                case 'm':
                case 'p':
                case 't':
                case 'w':
                    count=count+1;
                    break;
                case 'b':
                case 'e':
                case 'h':
                case 'k':
                case 'n':
                case 'q':
                case 'u':
                case 'x':
                    count=count+2;
                    break;
                case 'c':
                case 'f':
                case 'i':
                case 'l':
                case 'o':
                case 'r':
                case 'v':
                case 'y':
                    count=count+3;
                    break;
                case 's':
                case 'z':
                    count=count+4;
                    break;
                
    	    }
	    }
	    System.out.println(count);
	}

}
