public class LatihanArray {
    public static void main(String[] args) {
        String[] kata = new String[4];
        kata[0] = "hallo";
        kata[1] = "selamat";
        kata[2] = "malam";
        kata[3] = "1D";
        int panjangkata = kata.length;

        String[] nama = {"dewi","budi","heni"};
        int p = nama.length;

        for(int index=0; index< nama.length;index++){
            System.out.println("index ke " + index+ "adalah : " + nama[index]);
        }
        for(String name : nama){
            System.out.println(name);
        }

        int[] angka = new int[10];
        float[] angka_float = new float[5];
        float[] angka_pecahan = {1.2F,2.6F,};


    }
}
