import java.util.Scanner;

public class SafeInput {
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String result = " ";
        boolean done = false;

        do
        {
            System.out.print("\n" + prompt + ": ");
            result = pipe.nextLine();
            if(result.length() >= 1)
                done = true;
            else
                System.out.println("\nYou must enter at least one character!\nTry again.");

        }while(!done);
        return result;

    }
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        int retVal = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print("\n" + prompt + "[" + low + "-" + high + "]: ");
            if(pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
                pipe.nextLine();
                if(retVal >= low && retVal <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("\nNumber is out of range [" + low + "-" + high + "]: " + retVal);
                }
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter an int: " + trash);
            }
        }while(!done);

        return retVal;
    }
    public static int getInt(Scanner pipe, String prompt)
    {
        int retVal = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print("\n" + prompt + ": ");
            if(pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter an int: " + trash);
            }
        }while(!done);

        return retVal;
    }

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        double retVal = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print("\n" + prompt + "[" + low + "-" + high + "]: ");
            if(pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                if(retVal >= low && retVal <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("\nNumber is out of range [" + low + "-" + high + "]: " + retVal);
                }
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a double: " + trash);
            }
        }while(!done);

        return retVal;
    }
    public static double getDouble(Scanner pipe, String prompt)
    {
        double retVal = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print("\n" + prompt + ": ");
            if(pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a double: " + trash);
            }
        }while(!done);

        return retVal;
    }

    public static boolean getYNConfirm(Scanner pipe, String prompt)
    {
        boolean retVal = true;
        String response = "";
        boolean gotAVal = false;

        do
        {
            System.out.print("\n" + prompt + " [Y/N] ");
            response = pipe.nextLine();
            if(response.equalsIgnoreCase("Y"))
            {
                gotAVal = true;
                retVal = true;
            }
            else if(response.equalsIgnoreCase("N"))
            {
                gotAVal = true;
                retVal = false;
            }
            else
            {
                System.out.println("You must answer [Y/N]! " + response );
            }

        }while(!gotAVal);

        return retVal;
    }
    public static String getRegExString(Scanner pipe, String prompt, String regExPattern)
    {
        String response = "";
        boolean gotAVal = false;

        do
        {
            System.out.print("\n" + prompt + ": ");
            response = pipe.nextLine();
            if(response.matches(regExPattern))
            {
                gotAVal = true;
            }
            else
            {
                System.out.println("\n" + response + " must match the pattern " + regExPattern);
                System.out.println("Try again!");
            }

        }while(!gotAVal);

        return response;
    }
    public static void prettyHeader(String msg)
    {
        boolean done = false;
        int lineLength = 60;
        int asterisks = 3;
        int spacesAroundName = ((lineLength - msg.length()) / 2);

        do
        {
            if(msg.length() >= 1 && msg.length() <= 60)
            {
                done = true;
            }

            else
            {
                System.out.println("\nYour title must be between 1-60 characters!\nTry again.");
                done = false;
            }

        }while(!done);

        for(int i = 1; i <= 65; i++)
        {
            for(int j = 1; j <= 1; j++)
            {
                System.out.print("*");
            }
            System.out.print("");
        }

        for(int i = 1; i <= 1; i++)
        {
            for(int j = 1; j <= 1; j++)
            {
                System.out.print("\n***");
            }
            System.out.print("");
        }

        printSpacesAroundName(spacesAroundName);
        System.out.print(msg);
        printSpacesAroundName(spacesAroundName);

        for(int i = 62; i <= 62; i++)
        {
            for(int j = 62; j <= 62; j++)
            {
                System.out.print("***");
            }
            System.out.print("\n");
        }

        for(int i = 1; i <= 65; i++)
        {
            for(int j = 3; j <= 3; j++)
            {
                System.out.print("*");
            }
            System.out.print("");
        }

    }
    private static void printSpacesAroundName(int spacesAroundName)
    {
        for (int i = 0; i < spacesAroundName; i++)
            System.out.print(" ");
    }

    public static double getAverage(int values[])
    {
        int sum = 0;
        double ave = 0;
        for(int r = 0; r < values.length; r++)
        {
            sum+= values[r];
        }
        ave = sum / values.length;
        return ave;
    }
}







