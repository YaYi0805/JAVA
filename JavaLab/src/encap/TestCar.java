package encap;

public class TestCar {

	public static void main(String[] args) {
		Car car = new Car('R');
		car.setModel("Yaris");
		System.out.printf("型號:%s,價錢:%7d,顏色:%c",car.getModel(),car.getPrice(),car.getColor());

	}

}
