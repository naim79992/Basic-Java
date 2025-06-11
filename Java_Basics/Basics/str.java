class str{
    public static void main(String[] args) {
    //String is a class in java. It is used to create string objects.[Non-premtive]
    //String is immutable. It means once a string object is created, it cannot be changed.
    String name="Naim"; //not recommended
    String name2=new String("Naim"); //recommended way to use string(as it's a class)
   System.out.println(name+" "+name2);  
   
   //string buffer[thrate safe]
   StringBuffer s1=new StringBuffer(""); 
   System.out.println(s1.capacity() + " "+ s1.length()); //16+1=17
   StringBuffer s1=new StringBuffer("Naim"); 
   s1.append(" Hasan");
   s1.deleteCharAt(2);
   s1.insert(2,"Hi ");
    String st=st.toString(); //convert StringBuffer to String
    
    //same for StringBuilder[not thread safe]

}
}