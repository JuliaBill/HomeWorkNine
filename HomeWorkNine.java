package Homework;



public class HomeWorkNine {


        public static void main(String[] args) {
        int H = 200;
        int N = 50;
        int M = 1;

            int count = numberOfLifts(H, N, M);
            System.out.println("Количество подъемов " + count);
        }

        public static int numberOfLifts(int floor, int stepUp, int stepDown) {
            int count = 0;

            while (floor > 0) {
                floor -= stepUp;
                count++;

                if (floor <= 0)
                    break;
                floor += stepDown;
            }
            return count;
        }

    }

