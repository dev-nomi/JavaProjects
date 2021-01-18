/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author noman
 */
public class Main {
    public static int[] twosum(int num[],int target){
        int i=0;
        for(int j=i+1;j<num.length;j++){
            if(num[i]+num[j]==target){
                return new int[] {i,j};
            }
            else if(j==num.length-1){
                i++;
                j=i;
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    public static void main(String[] args) {
        int num[]={1,2,3,4,5,10};
        int res[]=twosum(num,14);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
        System.out.println("");

    }
    
}
