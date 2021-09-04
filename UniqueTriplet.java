import java.util.Scanner;
class UniqueTriplet {

	static void Triplets(int[] ar, int a) {
		for(int i=0;i<a-2;i++) {
			for(int j=i+1;j<a-1;j++) {
				for(int k=j+1;k<a;k++) {
					if(ar[i]+ar[j]+ar[k]==0) {
						System.out.print(ar[i]+" ");
						System.out.print(ar[j]+" ");
						System.out.println(ar[k]);
						}
				}
			}
		}
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int ar[]=new int[a];
		for(int i=0;i<a;i++) {
			ar[i]=sc.nextInt();
		}
		Triplets(ar,a);
		
	}

}
