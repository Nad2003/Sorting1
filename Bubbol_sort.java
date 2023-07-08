    for (int i = 0; i < arr.length; i++) {    // outer for loop
           for (int j = 0; j < arr.length-1-i; j++) {// inner for loop 
if (arr[j]>arr[j+1]){ // swaping condition 
   int temp=arr[j];// method of swap
   arr[j]=arr[j+1];
   arr[j+1]=temp;
}
           }
       }
