import java.util.Scanner;
//=============================================================================
public class ExceptionArrayUp {
//-----------------------------------------------------------------------------
    private static Scanner keyboard = new Scanner(System.in);
    private static final int DATA_SIZE = 10;
//-----------------------------------------------------------------------------
    public static void main(String[] args) {

        int[] myData = new int[DATA_SIZE];
        int index;

        try {
            inputData(myData);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage() + " is an invalid index");
        }

        for (index = 0; index < myData.length; index++) {
             System.out.println(index + " = " + myData[index]);
        }
    }
//-----------------------------------------------------------------------------
    private static void inputData(int[] theData) 
throws ArrayIndexOutOfBoundsException {

        int data;
        int userIndex;

        do {
            System.out.print("Enter index and positive data value : ");
            userIndex = keyboard.nextInt();
            data = keyboard.nextInt();
            if (data > 0) {
                theData[userIndex] = data;
            }
        } while (data > 0);

    }
//-----------------------------------------------------------------------------
}
//=============================================================================
