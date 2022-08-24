package readfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author NTT
 *
 */
public class Auto {

	private static final String Entity = null;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Auto auto = new Auto();
		double bnbIn = 1;
		ArrayList<Entity> listEntity = auto.inputProcess();
		for (int i = 0; i < listEntity.size(); i++) {
//			System.out.println(i + "");
			System.out.println(auto.getBnbOut(listEntity.get(i), 1));
			
			
			}

	}

	public ArrayList<Entity> inputProcess() {
		ArrayList<Entity> list = new ArrayList<Entity>();
		try {
			File myObj = new File("filename.txt");
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				String[] dataInfo = data.split(" ");

				if (dataInfo.length == 3) {
					Entity entity = new Entity();
					entity.setBnbUsdt(Double.parseDouble(dataInfo[0]));
					entity.setEthUsdt(Double.parseDouble(dataInfo[1]));
					entity.setBnbEth(Float.parseFloat(dataInfo[2]));

					list.add(entity);					
			//	System.out.println(entity.toString());
				}	
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		return list;
	}

	public double getBnbOut(Entity entity, double bnbIn) {

		double usdt1, eth2, bnbOut = 0; 
		usdt1= bnbIn * entity.getBnbUsdt();
		eth2 = usdt1 / entity.getEthUsdt();
		bnbOut = eth2 / entity.getBnbEth();
		return bnbOut;
		
		
	}
}
