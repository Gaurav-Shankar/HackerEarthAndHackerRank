import java.util.Scanner;
public class Solution {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int cases = sc.nextInt();
double[] f = new double[cases];
double[] rf = new double[cases];
for(int i=0;i<cases;i++){
f[i]=sc.nextFloat();}
for(int i= 0;i<cases;i++){
rf[i] = Math.sin(f[i]);
System.out.println(rf[i]);
rf[i]=Math.cos(f[i]);
System.out.println(rf[i]);}}}
