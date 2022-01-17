package firstcode;

public class ByteArrayToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte[] bytes= {1,2,15,16,17};
		for(byte b:bytes) {
			String st=String.format("%02X", b);
			System.out.print(st);
		}
	}

}
