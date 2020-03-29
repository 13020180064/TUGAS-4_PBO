public class Methods{
	public static String tulisan = "Selamat Belajar Methods pada Java!";

	public static void cetakTulisan(){
		System.out.println(tulisan);
	}

	public static void cetakNama(String nama){
		System.out.println("Nama saya adalah "+nama);
	}

	public static void main(String[] args){
		cetakTulisan();
		cetakNama("RULIA");
	}
}