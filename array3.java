public class array3 {
    public static void main(String[] args) {
        String [] obat = new String[3];
        obat [0] = "parsetamol";
        obat [1] = "bodrex";
        obat [2] = "paramex";
        int apotek = obat.length;
        for(String name : obat){
            System.out.println(name);
        }


    }
}
