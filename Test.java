package parcial01;

import java.util.ArrayList;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer>  segundos = new ArrayList<Integer>();
		segundos.add(2);
		segundos.add(33);
		segundos.add(5);
		segundos.add(5);
		segundos.add(21);
		segundos.add(6);
		segundos.add(6);
		segundos.add(7);
		
		int min1 = segundos.get(0);
		int min2 = segundos.get(1);
		int min3 = segundos.get(2);
		int sum = 0;
		int intercambio = 0;

		for (int i = 2; i < segundos.size(); i++) {
		    int segundo = segundos.get(i);
		    if (segundo < min1) {
		        intercambio = min1;
		        min1 = segundo;
		        segundo = intercambio;
		    }
		    if (segundo < min2) {
		        intercambio = min2;
		        min2 = segundo;
		        segundo = intercambio;
		    }
		    if (segundo < min3) {
		        intercambio = min3;
		        min3 = segundo;
		        segundo = intercambio;
		    }
		    System.out.println("Segundo " + segundo);
		    sum += segundo;
		}
		System.out.println(min1+ " " + min2+ " " + min3);
	}

}
