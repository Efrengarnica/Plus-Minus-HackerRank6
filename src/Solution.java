import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {
	
    public static void plusMinus(List<Integer> arr) {
        int cantPos=0;
        int cantNeg=0;
        int cantCero=0;
        
        for(int i=0;i<arr.size(); i++){
           if( arr.get(i)>0){
               cantPos++;
           }else if(arr.get(i)<0){
               cantNeg++;
           }else{
               cantCero++;
           }
        }//for
        int total = arr.size();
        double propPos = (double) cantPos / total;
        double propNeg = (double) cantNeg / total;
        double propCero = (double) cantCero / total;

        System.out.println(Math.round(propPos * 1e6) / 1e6);
        System.out.println(Math.round(propNeg * 1e6) / 1e6);
        System.out.println(Math.round(propCero * 1e6) / 1e6);

    }//plusMinus

}// class Result

public class Solution {
	//Lo interesante es como crear de manera directa un arreglo desde la consola ocupando Stream.of
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        //int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "") //elimina el útlimo espacio si es que hay
        	.split(" ")) //separa el contenido cada que haya un espacio
            .map(Integer::parseInt) // vuelve el contenido a números
            .collect(toList()); //lo convierte en un Array

        Result.plusMinus(arr);

        bufferedReader.close();
        
    }//main 
}// class Solution
