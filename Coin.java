import java.util.Random;

public class Coin {

	
		// TODO Auto-generated method stub
		static int rand1  = new Random().nextInt(2);
		
		public static void main(String[] args) {
			if (rand1 ==0){
				System.out.println("Орел");
	}else if  (rand1 ==1){
		System.out.println("Решка");
	}

}
}

