import java.util.Scanner;

public class kdvHesaplama {

	public static void main(String[] args) {
		/* Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18
		, tutar 1000 TL'den büyük ise KDV oranını %8 olarak 
		KDV tutarı hesaplayan programı yazınız.*/

		int tutar ;
		double kdvliFiyat, kdvOranı;
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Lütfen ürünün Fiyatını Giriniz");
		tutar = scan.nextInt();
		if (tutar <= 1000) {
			kdvliFiyat= tutar +(tutar* 0.18);
			System.out.println("Kdvli fiyat : " + kdvliFiyat);
		}else if (tutar >1000){
			kdvliFiyat = tutar +(tutar *0.08);
			System.out.println("Kdvli fiyat : " + kdvliFiyat);
		}
		
	}

}
