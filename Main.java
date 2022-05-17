 /*****
Selection Sort 
It is a in place sorting algorithm that keeps track of the minimum value during each iteration 

Time Complexity 
O(n^2) The larger the dataset the more inefficient the alogrithm is going to be 

Example Dataset 
{9, 1, 2}

int min = null 
int temp = null 

Selection sort will go through the example dataset. 

The first number is 9 which will be assigned to int min as 9 is currently the only number it has gone through hence it is also the smallest 

{9, 1, 2} - No change 
int min = 9 
int temp = null

The next number is 1 which is smaller than 9 

int min = 1 
int temp = 9

1 will swab its position with 9 in the dataset 

{1, 9, 2}

int min = null 
int temp = null 

The sorting alogrithm will go through the data set again starting from 

int min = 9 
int temp = 2 

2 is smaller than 9 so it will swab position with 9 

the dataset is now sorted 

{1, 2, 9}
*/

class Main {
  public static void main(String[] args) {
		int[] array = {8, 7, 9, 2, 3, 1, 5, 4, 6};

		selectionSort(array);
		

		for(int i : array){
			System.out.print(i);
		}

	}

	private static void selectionSort(int[] array){
		for(int i = 0; i < array.length - 1; i++){
			int min = i;
			for(int j = i + 1; j < array.length; j++){
			if(array[min] > array[j]){ /*Change to < if you want	 to sort in descending order*/
				min = j;
			}
		}
		int temp = array[i];
		array[i] = array[min];
		array[min] = temp;
			}
	}
}

/*****
Working 
{8, 7, 9, 2, 3, 1, 5, 4, 6};

for(int i = 0; i < array.length - 1; i++){
i = 0; i < 8; i++ 

int min = i
int min = 0

for(int j = i + 1; j < array.length; j++){
j = 0 + 1; j < 8; j++
j = 1; j < 8; j++

if(array[min] > array[j]){
if(array[0] > array[1])
if 8 > 7 

min = j;
min = 1 

int temp = array[i];
int temp = array[0]
int temp = 8 

array[i] = array[min];
array[0] = array[1];
array[0] = 7 

array[min] = temp;
array[1] = 8;

{8, 7, 9, 2, 3, 1, 5, 4, 6} -> {7, 8, 9, 2, 3, 1, 5, 4, 6};



*/