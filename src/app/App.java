package app;

public class App {
    public static void main(String[] args) throws Exception {

        // tạo mảng với 100 000 số nguyên ngẫu nhiên
        int countInt = 100000;
        int[] arr    = new int[countInt];

        for(int i = 0; i < countInt; i++){
            arr[i] = (int) Math.floor(Math.random()*countInt);
            //System.out.print(arr[i] + " "); // check arr
        }

        // tạo đối tượng đếm thời gian kết thúc
        StopWatch stopWatch = new StopWatch();

        // bắt đầu đếm
        stopWatch.start();

        // Sắp sếp chọn
        for(int i = 0; i < countInt; i++){
           int min       = arr[i];
           int min_index = i;
            for(int j = i+1; j < countInt; j++){
                if(min > arr[j]){
                    min       = arr[j];
                    min_index = j;
                }
            }
            arr[min_index] = arr[i];
            arr[i]         = min;
        }

        // kết thúc sắp sếp chọn
        stopWatch.stop();

        System.out.print("\nThời gian sắp sếp: ");
        System.out.print(stopWatch.getElapsedTime() + " milisecond\n");

        // kiểm tra sắp sếp đúng hay sai
        //for (int i = 0; i < countInt; i++) {
        //    System.out.print(arr[i] + " ");
        //}
    }
}
