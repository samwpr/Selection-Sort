/*****
Selection Sort 
It is a sorting algorithm that keeps track of the minimum value during each iteration 

 

Time Complexity 
O(n^2) The larger the dataset the more inefficient the alogrithm is going to be 
*/

class Main {
  public static void main(String[] args) {

		int[] array = {4, 3, 6, 4, 7, 8};

		selectionSort(array);

			for (int i : array){
				System.out.print(i);
			}
  }
	private static int selectionSort(int[] array){
		for(int i = 0; i < array.length -1; i++){
			int min = i;
			for(int j = i + 1; j < array.length; j++){
				if(array[min] > array[j]){
					min = j;
				}
			}
			int temp = array[i];
			array[i] = array[min];
			array[min] = temp;
		}
		return 0;
	}
}

/*****
Working 
{4, 3}

for(int i = 0; i < array.length -1; i++){
for(i = 0; i < 6; i++){

int min = i;
int min = 0;

for(int j = i + 1; j < array.length; j++){
for(j = 1; j < 6; j++){

if(array[min] > array[j]){
if(array[0] > array[1]){
if(4 > 3)

min = j;
min = 1 

int temp = array[i];
int temp = 4

array[i] = array[min];
array[0] = array[1]
array[0] = 3

array[min] = temp;
array[1] = 4 

End result 
{3, 4}

*/