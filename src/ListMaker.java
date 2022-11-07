import java.util.ArrayList;
import java.util.Scanner;
public class ListMaker {
    static ArrayList<String> list = new ArrayList<>();

    static Scanner items = new Scanner(System.in);
    static Scanner del = new Scanner(System.in);
    static Scanner quit =new Scanner(System.in);


    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);


        final String menu ="A- Add D- Delete P-Print Q-Quit";
        boolean done=false;
        String cmd="";



        System.out.println(menu);
        do {
            //display the list
            displayList();
            //display the menu options
            // get a menu choice
            cmd= SafeInput.getRegExString(console,menu,"[AaDdPpQq]");
            cmd=cmd.toUpperCase();
            //execute the choice
           switch(cmd){
               case "A":
                   addList();
                   break;
               case "D":
                   deleteItem();
                   break;
               case "P":
                   printDisplay();
                   break;
               case "Q":
                 done=SafeInput.getYNConfirm(quit,"Are you sure you would like to quit?");

           }


        }
        while(!done);

    }



    private static void printDisplay() {
        if(list.size() !=0)
        {
            for (int i = 0; i < list.size(); i++)
            {

                System.out.printf("%3d%35s", i+1, list.get(i));
            }
        }else
            System.out.println("+++++++** List is empty *************");

    }


    private static void deleteItem() {
        int delete;

        delete=SafeInput.getRangedInt(del,"Enter the item number you would like to delete",1,list.size());
        delete=delete-1;
        list.remove(delete);



        }


    private static void addList(){
    String item="";
    //prompt the user for a list item
    System.out.println("What item would you like to add to your list?");
    //make sure it is not an empty sting (NONZERO thing)
    item=SafeInput.getNonZeroLenString(items,"What items would you like to add");

    //add it to the list
    list.add(item);

}






    private static void displayList() {

        if(list.size() !=0)
        {
            for (int i = 0; i < list.size(); i++)
            {
                System.out.printf("%3d%35s", i + 1, list.get(i));

            }
        }else
            System.out.println("*****List is empty****\n");

        }






    }



