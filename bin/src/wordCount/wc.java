package wordCount;
import java.io.*;
public class wc{
	public static void main(String[] args) {
		if(args.length!=0){
			int len=args.length;
			if(len==2)
			{
				String action=args[0],thefile=args[1];
				baseCount.count(action, thefile);
			}
			else if(len==3)
			{
				String action1=args[0],action2=args[1],thefile=args[2];
				baseCount.count(action1, action2,thefile);
			}
			else if(len==4)
			{
				String action1=args[0],action2=args[1],action3=args[2],thefile=args[3];
				baseCount.count(action1, action2,action3,thefile);
			}
			else if(len==5){

				String action1=args[0],action2=args[1],sourcefile=args[2],action3=args[3],thefile=args[4];
				baseCount.count(action1, action2,sourcefile,action3,thefile);
			}
			else if(len==6){

				String action1=args[0],action2=args[1],action3=args[2],sourcefile=args[3],action4=args[4],thefile=args[5];
				baseCount.count(action1, action2,action3,sourcefile,action4,thefile);
			}
		}
		else System.out.println("null");

}
}