import java.util.Scanner;


public class credit {
	public static void main(String[] args) {
		int [] price = new int[200];
		int no_item = 0;
		int cre = 0;
		Scanner sc = new Scanner(System.in);

		
		

			cre = sc.nextInt();

			no_item = sc.nextInt();

			for(int i1 = 1; i1<no_item;i1++){
				price[i1] = sc.nextInt();
			}
		



			for(int j=1;j<=no_item;j++){
				boolean res = false;
				for(int k=2;k<=no_item;k++){
					int x =1;
					if(price[j]+price[k] == cre){
						if(j==k){
							continue;
						}
						System.out.println("Case #"+x +": " +j+" " +k);
						res = true;
						x++;
						break;
					}
					else{
						continue;
					}

				}
				if(res){
					break;
				}
				else{
					continue;
				}

			}
		}

	}



