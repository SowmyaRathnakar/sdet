package JavaActivity2;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int array[] = {10, 77, 10, 54, -11, 10};
int x=0;
int y=0;
int z=array.length -1 ;

for (x=0; x <= z; x++)
	if (array [x] == 10)
	y = y +10;

System.out.println("Sum of 10s in array is:"+ y);
	}

}
