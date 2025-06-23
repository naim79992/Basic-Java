class Arr{
    public static void main(String[] args){
        int arr[]={2,3,4};
        for(int i:arr){
            System.out.println(i);
        }
        //Dynamic(assign arr size)
        int num[]=new int[4]; //all the val=0
        for(int i:num) System.out.println(i);
        num[0]=1000;
        for(int i:num) System.out.println(i);
        //Multi dimentional
        int arr2[][]={{1,2,3},{4,5,6}};
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[i].length;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }

        int arr3[][]=new int[4][4];
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                arr3[i][j]=(int)(Math.random()*100);//assign random val 0-99
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }
        //jagged array
        int arr4[][]=new int[3][]; //3 rows, col size not defined
        arr4[0]=new int[2]; //1st row 2 col
        arr4[1]=new int[3]; //2nd row 3 col
        arr4[2]=new int[4]; //3rd row 4 col
        for(int i=0;i<arr4.length;i++){
            for(int j=0;j<arr4[i].length;j++){
                arr4[i][j]=(int)(Math.random()*100);//assign random val 0-99
                System.out.print(arr4[i][j]+" ");
            }
            System.out.println();
        }
        //3d array
        int arr5[][][]=new int[3][4][5]; //3d array 3x4x5
        for(int i=0;i<arr5.length;i++){
            for(int j=0;j<arr5[i].length;j++){
                for(int k=0;k<arr5[i][j].length;k++){
                    arr5[i][j][k]=(int)(Math.random()*100);//assign random val 0-99
                    System.out.print(arr5[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }




    }
}