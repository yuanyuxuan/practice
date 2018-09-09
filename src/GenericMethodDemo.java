public class GenericMethodDemo {
    public static <E> void print(E[] list){
        for(int i=0;i<list.length;i++)
            System.out.print(list[i]+" ");
        System.out.println();
    }
}
