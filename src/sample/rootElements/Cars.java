package sample.rootElements;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class Cars {
	private List<Car> cars = new ArrayList<Car>();

	public Cars(List<Car> cars) {
		super();
		this.cars = cars;
	}

	public Cars() {	}
	
	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
	
	
	
}
