package operators_programs_list;

public class Swap_Nibbles_In_Byte {

	public static void main(String[] args) {
		// 61.	Implement a Java program to swap the nibbles in a byte.
		byte orgbyte=(byte) 0b10101010;
		byte swapbyte=(byte)((orgbyte & 0x0F << 4 | orgbyte & 0xF0 >> 4 ));
		System.out.println(Integer.toBinaryString(swapbyte & 0xFF));
//		byte originalByte = (byte) 0b10101010;
//
//        byte swappedByte = (byte) ((originalByte & 0x0F) << 4 | (originalByte & 0xF0) >> 4);
//
//        System.out.println("Original byte: " + Integer.toBinaryString(originalByte & 0xFF));
//        System.out.println("Swapped byte: " + Integer.toBinaryString(swappedByte & 0xFF));


	}

}
