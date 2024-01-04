public class Main {
    public static void main(String[] args) {
        //todo Тут увольняем айтишников
       /* for(int i=2;i<=100;i=i+2){
            System.out.println("Уволен айтишник с id" + i);
        }

        */
        boolean isId = true;
        int i = 0;
        while(isId){
            if(i==48) {
                isId=false;

            }

            System.out.println("Уволен айтишник с id " + (i=i+2));
        }

    }
}
