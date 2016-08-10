package systemdesign;

import java.util.ArrayList;
import java.util.Random;

public class CabSystem {

	public static class Car {
		private  int xCor;
		private  int yCor;
		private String carName;
		public Car(String name, int x, int y){
			xCor = x;
			yCor = y;
			carName = name;
		}
		public int getX(){
			return xCor;
		}
		public int getY(){
			return yCor;
		}
		public String toString(){
			return carName+":["+xCor+","+yCor+"]";
		}
		public String getName(){
			return carName;
		}
	}
	
	public static class Distance{
		private String carName;
		private double value;
		public Distance(String name, double val){
			carName = name;
			value = val;
		}
		public String getName(){
			return carName;
		}
		public double getDistance(){
			return value;
		}
		public String toString(){
			return carName+":["+value+"]";
		}
		
	}
	
	public static double getDistance(int posX, int posY, int carX, int carY){
		double result = 0;
		double temp1 = Double.parseDouble(Integer.toString(posX))-Double.parseDouble(Integer.toString(carX));
		double temp2 = Double.parseDouble(Integer.toString(posY))-Double.parseDouble(Integer.toString(carY));
		result = Math.sqrt(Math.pow(temp1, 2)+Math.pow(temp2, 2));
		return result;
	}
	
	public static ArrayList<Distance> sortDistanceArr(ArrayList<Distance> disArr){
		ArrayList<Distance> processArr = new ArrayList<Distance>(disArr);
		ArrayList<Distance> resultArr = new ArrayList<Distance>();
		double tempDisVal = processArr.get(0).getDistance();
		String tempDisName = processArr.get(0).getName();
		boolean done = false;
		while (!done){
			int notice = 0;
			tempDisVal = processArr.get(0).getDistance();
			tempDisName = processArr.get(0).getName();
			for (int ii = 1; ii< processArr.size(); ii++){
				if(processArr.get(ii).getDistance()<tempDisVal){
					tempDisVal = processArr.get(ii).getDistance();
					tempDisName = processArr.get(ii).getName();
					notice = ii;
				}
			}
			Distance d = new Distance(tempDisName,tempDisVal);
			resultArr.add(d);
			processArr.remove(notice);
			if(processArr.size()<1){
				done = true;
			}
			
		}
		return resultArr;
	}
	
	public static void main(String[] args){
		int max = Integer.MAX_VALUE/10000000;
		
		Random rand = new Random();
		int pos1 = rand.nextInt((max - 0) + 1) + 0;
	    int pos2 = rand.nextInt((max - 0) + 1) + 0;
	    if(rand.nextInt((1 - 0) + 1) + 0<1){
	    	pos1 = pos1 * -1;
	    }
	    if(rand.nextInt((1 - 0) + 1) + 0<1){
	    	pos2 = pos2 * -1;
	    }
		Car givenPosition = new Car("POSIT",pos1,pos2);

	    int randomNum11 = rand.nextInt((max - 0) + 1) + 0;
	    int randomNum12 = rand.nextInt((max - 0) + 1) + 0;
	    if(rand.nextInt((1 - 0) + 1) + 0<1){
	    	randomNum11 = randomNum11 * -1;
	    }
	    if(rand.nextInt((1 - 0) + 1) + 0<1){
	    	randomNum12 = randomNum12 * -1;
	    }
		Car car01 = new Car("CAR1",randomNum11,randomNum12);
		
		int randomNum21 = rand.nextInt((max - 0) + 1) + 0;
	    int randomNum22 = rand.nextInt((max - 0) + 1) + 0;
	    if(rand.nextInt((1 - 0) + 1) + 0<1){
	    	randomNum21 = randomNum21 * -1;
	    }
	    if(rand.nextInt((1 - 0) + 1) + 0<1){
	    	randomNum22 = randomNum22 * -1;
	    }
		Car car02 = new Car("CAR2",randomNum21,randomNum22);
		
		int randomNum31 = rand.nextInt((max - 0) + 1) + 0;
	    int randomNum32 = rand.nextInt((max - 0) + 1) + 0;
	    if(rand.nextInt((1 - 0) + 1) + 0<1){
	    	randomNum31 = randomNum31 * -1;
	    }
	    if(rand.nextInt((1 - 0) + 1) + 0<1){
	    	randomNum32 = randomNum32 * -1;
	    }
		Car car03 = new Car("CAR3",randomNum31,randomNum32);
		
		int randomNum41 = rand.nextInt((max - 0) + 1) + 0;
	    int randomNum42 = rand.nextInt((max - 0) + 1) + 0;
	    if(rand.nextInt((1 - 0) + 1) + 0<1){
	    	randomNum41 = randomNum41 * -1;
	    }
	    if(rand.nextInt((1 - 0) + 1) + 0<1){
	    	randomNum42 = randomNum42 * -1;
	    }
		Car car04 = new Car("CAR4",randomNum41,randomNum42);
		
		int randomNum51 = rand.nextInt((max - 0) + 1) + 0;
	    int randomNum52 = rand.nextInt((max - 0) + 1) + 0;
	    if(rand.nextInt((1 - 0) + 1) + 0<1){
	    	randomNum51 = randomNum51 * -1;
	    }
	    if(rand.nextInt((1 - 0) + 1) + 0<1){
	    	randomNum52 = randomNum52 * -1;
	    }
		Car car05 = new Car("CAR5",randomNum51,randomNum52);
		
		int randomNum61 = rand.nextInt((max - 0) + 1) + 0;
	    int randomNum62 = rand.nextInt((max - 0) + 1) + 0;
	    if(rand.nextInt((1 - 0) + 1) + 0<1){
	    	randomNum61 = randomNum61 * -1;
	    }
	    if(rand.nextInt((1 - 0) + 1) + 0<1){
	    	randomNum62 = randomNum62 * -1;
	    }
		Car car06 = new Car("CAR6",randomNum61,randomNum62);
		
		int randomNum71 = rand.nextInt((max - 0) + 1) + 0;
	    int randomNum72 = rand.nextInt((max - 0) + 1) + 0;
	    if(rand.nextInt((1 - 0) + 1) + 0<1){
	    	randomNum71 = randomNum71 * -1;
	    }
	    if(rand.nextInt((1 - 0) + 1) + 0<1){
	    	randomNum72 = randomNum72 * -1;
	    }
		Car car07 = new Car("CAR7",randomNum71,randomNum72);
		
		System.out.println(car01.toString());
		System.out.println(car02.toString());
		System.out.println(car03.toString());
		System.out.println(car04.toString());
		System.out.println(car05.toString());
		System.out.println(car06.toString());
		System.out.println(car07.toString());
		System.out.println(givenPosition.toString());
		double d1 = 0;double d2 = 0;double d3 = 0;double d4 = 0;double d5 = 0;double d6 = 0;double d7 = 0;
		d1 = getDistance(givenPosition.getX(),givenPosition.getY(),car01.getX(),car01.getY());
		d2 = getDistance(givenPosition.getX(),givenPosition.getY(),car02.getX(),car02.getY());
		d3 = getDistance(givenPosition.getX(),givenPosition.getY(),car03.getX(),car03.getY());
		d4 = getDistance(givenPosition.getX(),givenPosition.getY(),car04.getX(),car04.getY());
		d5 = getDistance(givenPosition.getX(),givenPosition.getY(),car05.getX(),car05.getY());
		d6 = getDistance(givenPosition.getX(),givenPosition.getY(),car06.getX(),car06.getY());
		d7 = getDistance(givenPosition.getX(),givenPosition.getY(),car07.getX(),car07.getY());
		Distance dis1 = new Distance("CAR1",d1);
		Distance dis2 = new Distance("CAR2",d2);
		Distance dis3 = new Distance("CAR3",d3);
		Distance dis4 = new Distance("CAR4",d4);
		Distance dis5 = new Distance("CAR5",d5);
		Distance dis6 = new Distance("CAR6",d6);
		Distance dis7 = new Distance("CAR7",d7);
		System.out.println("CARS DIS-*-");
		System.out.println(dis1.toString());
		System.out.println(dis2.toString());
		System.out.println(dis3.toString());
		System.out.println(dis4.toString());
		System.out.println(dis5.toString());
		System.out.println(dis6.toString());
		System.out.println(dis7.toString());
		
		ArrayList<Distance> distanceArr = new ArrayList<Distance>();
		distanceArr.add(dis1);
		distanceArr.add(dis2);
		distanceArr.add(dis3);
		distanceArr.add(dis4);
		distanceArr.add(dis5);
		distanceArr.add(dis6);
		distanceArr.add(dis7);
		
		System.out.println("ANSWER-*-");
		ArrayList<Distance> answerArr = sortDistanceArr(distanceArr);
		for(Distance d : answerArr){
			System.out.println(d);
		}
		
	}
}
