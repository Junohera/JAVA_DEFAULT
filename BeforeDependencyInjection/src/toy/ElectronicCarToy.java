package toy;

import battery.Battery;
import battery.NormalBattery;

public class ElectronicCarToy {
	
	private Battery battery;
	
	public ElectronicCarToy() {
		battery = new NormalBattery();
	}
}

// 배터리 일체형 
// 배터리가 떨어지면 장난감을 새로 구입해야 한다.