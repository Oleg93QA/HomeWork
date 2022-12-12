public class forGit {
    public static void main(String[] args) {
        // Найти разность между максимальным и минимальным элементами массива

        int[] massivz = new int[6];
        int maxi = 0;
        int minn = 0;
        int raznost = 0;
        for( int i = 0; i < massivz.length; i++) {
            massivz[i] = (int) (Math.random() * 100);
            System.out.print(massivz[i] + " ");
        }
        for(int i = 0; i < massivz.length; i++){
           maxi = Math.max(maxi, massivz[i]);
        }
        System.out.println(" максимальное = " + maxi);
        minn = maxi;

        for(int i = 0; i < massivz.length; i++){
            minn = Math.min(minn, massivz[i]);
        }
       System.out.println(" минимальное = " + minn);
        raznost = maxi - minn;
        System.out.println("Разность = " + raznost);

//////////////////////////////2 method /////////////////////////////////


        int[] massiv = new int[6];
        int max = 0;
        int min = 0;
        for( int i = 0; i < massiv.length; i++) {
            massiv[i] = (int) (Math.random() * 100);
            System.out.print(massiv[i] + " ");
        }
        for(int i = 0; i < massivz.length; i++) {
            if (massiv[i] > max){
                max = massiv[i];
            }
        }
        System.out.println(" максимальное = " + max);

       min = max;
        for(int i = 0; i < massivz.length; i++){
            if(massiv[i] < min){
                min = massiv[i];
            }
        }
        System.out.println(" минимальное = " + min);
/////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("/////////////////////////////////////////////////////////////////////////");
        // Разделить элементы массива на максимальный
        double[] massiv1 = new double[6];
        double[] newMassiv = new double[6];
        double maxMax = 0;
        for( int i = 0; i < massiv1.length; i++) {
            massiv1[i] = (double) (Math.random() * 100);
            System.out.print(massiv1[i] + " ");
        }
        for(int i = 0; i < massiv1.length; i++){
            maxMax = Math.max(maxMax, massiv1[i]);
        }
        System.out.println("максимальное число = " + maxMax);

        for(int i = 0; i < massiv1.length; i++){
            newMassiv[i] = massiv1[i] / maxMax;
            System.out.println("новый массив = " + newMassiv[i]);
        }


    }
}