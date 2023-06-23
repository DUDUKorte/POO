public class ExercicioSemRetorno {
    public static void main(String args[]){
        int[] myNums = {0,1,2,3,4,5,6,7,8,9};

        imprimirNumeros(myNums);
        somaNumeros(myNums);
        imprimirNumeros(myNums);
    }

    public static void imprimirNumeros(int[] nums){
        String output = "";
        for(int i : nums){
            if(i==nums[nums.length-1]){
                output+=i;
            }else{
                output+=i+" ";
            }
        }
        System.out.println(output);
    }

    public static void somaNumeros(int[] nums){
        int soma = 0;
        for(int i : nums){
            soma += i;
        }
        System.out.println(soma);
    }
}
