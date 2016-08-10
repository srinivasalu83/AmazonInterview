package systemdesign.vendor;

public class MachineWarning extends Exception{

	public MachineWarning(String warning){
		System.out.println(warning);
	}
}
