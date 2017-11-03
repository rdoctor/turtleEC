/*me: Reid Doctor
* Login: cs11fapc <<< --- Use your cs11f course-specific account name 
* Date: Sep 29 2016
* File: CS11TurtleGraphicsEC.java
* Sources of Help: ... Adhitya Sampath, http://unix.stackexchange.com/questions/159672/how-to-create-a-simple-txt-text-file-using-terminal (used to learn how to create a file in terminal) *
* Describe what this program does here.
*
*/
import turtleClasses.*;
import java.awt.Color;
import java.util.Random;
/*
 * Name:       CS11TurtleGraphicsEC
 * Purpose: completes the assignment PA1 extra credit */

public class CS11TurtleGraphicsEC extends Turtle { 
  private final static int CHAR_WIDTH = 40; 
  private final static int CHAR_HEIGHT = 80;
  private final static int PADDING_BETWEEN_CHARS = 40;
  private final static int PADDING_BETWEEN_LINES = 40;
  private final static int CHAR_SPACING = CHAR_WIDTH + PADDING_BETWEEN_CHARS;
  private final static int LINE_SPACING = CHAR_HEIGHT + PADDING_BETWEEN_LINES;
  private final static int START_X_1 = 40; // starting x offset for line 1
  private final static int START_X_2 = 40; // starting x offset for line 2
  private final static int START_X_3 = 40; // starting x offset for line 3
  private final static int START_Y = 40;   // starting y offset
  private final static int PEN_WIDTH = 10;
  private final static Color PEN_COLOR = Color.BLUE;
  private final static int WORLD_WIDTH = 1080;
  private final static int WORLD_HEIGHT = 480;
  private final static int Y_OFFSET_1 = 2; // for turnToFace() for the N and D
  private final static int Y_OFFSET_2 = 4; // for turnToFace() for the As and V
  private final static int Y_CORRECT_1 = 22; // for correcting the N's crossbar's length
  private final static int Y_COORECT_2 = 2; // for correcting the D's height
  private static int[] C1 = new int[2]; //stores the location of the first character
  private static int[] S1 = new int[2];//stores the location of the second character
  private static int[] ONE1 = new int[2];//stores the location of the third character
  private static int[] ONE2 = new int[2];//stores the location of the fourth character
  private static int[] F = new int[2];//stores the location of the fifth character
  private static int[] A1 = new int[2];//stores the location of the sixth character
  private static int[] P = new int[2];//stores the location of the sevent character
  private static int[] C2 = new int[2];//stores the location of the eigth character
  private static int[] J = new int[2];//stores the location of the ninth character
  private static int[] A2 = new int[2];//stores the location of the tenth character
  private static int[] V = new int[2];//stores the location of the eleventh character
  private static int[] A3 = new int[2];//stores the location of the twelfth character
  private static int[] TWO = new int[2];//stores the location of the thirteenth character
  private static int[] ZERO = new int[2];//stores the location of the fourteenth character
  private static int[] ONE3 = new int[2];//stores the location of the fifteenth character
  private static int[] SIX = new int[2];//stores the location of the sixteenth character
  private static int[] U = new int[2];//stores the location of the seventeenth character
  private static int[] C3 = new int[2];//stores the location of the eighteenth character
  private static int[] S2 = new int[2];//stores the location of the nineteenth character
  private static int[] A4 = new int[2];//stores the location of the twentieth character
  private static int[] N = new int[2];//stores the location of the twentyfirst character
  private static int[] D = new int[2];//stores the location of the twentysecond character
  private static int[] I = new int[2];//stores the location of the twentythird character
  private static int[] E = new int[2];//stores the location of the twentyfourht character
  private static int[] G = new int[2];//stores the location of the twentyfifth character
  private static int[] O = new int[2];//stores the location of the twentysixth character
  private static boolean T = true;
  private final static Color PEN_COLOR_WHITE = Color.WHITE;

/*
 * Delay between turtle actions (turns, moves) in milliseconds. 
 * 1000=1sec. so 200=0.2sec.
 */
  private static int DELAY = 20;
/*
* Name:       Constructor name
*Purpose: Briefly describe the purpose of this constructor
*Parameters: List all parameters and their types and what they represent.
*If no parameters, just state None.
*/

  public CS11TurtleGraphicsEC(World w, int delay) {
    super(w, delay); // Invoke superclass's ctor to create this turtle
  } // on World w with delay of each turtle's action.
/*
 *Name: drawC
 *Purpose: draws the uppercase letter C
 *Parameters: int x, int y start in upper left corner of this char block 
 *
 *Return: void
 */

  private void drawC(int x, int y) {
    penUp();
    moveTo(x, y); // always start in upper left corner of this char block 
    turnToFace(getXPos() + 1, getYPos()); // face right
    penDown();
    forward(CHAR_WIDTH);
    backward(CHAR_WIDTH);
    turnRight();
    forward(CHAR_HEIGHT);
    turnLeft();
    forward(CHAR_WIDTH);
  }

/*
 *Name: drawS
 *Purpose: draws the uppercase letter S
 *Parameters: int x, int y start in upper left corner of this char block 
 *
 *Return: void
 */

  private void drawS(int x, int y) {
    penUp();
    moveTo(x, y); // always start in upper left corner of this char block 
    turnToFace(getXPos() + 1, getYPos()); // face right
    penDown();
    forward(CHAR_WIDTH);
    turnRight();
    turnRight();
    forward(CHAR_WIDTH);
    turnLeft();
    forward(CHAR_WIDTH);
    turnLeft();
    forward(CHAR_WIDTH);
    turnRight();
    forward(CHAR_WIDTH);
    turnRight();
    forward(CHAR_WIDTH);
  }

/*
 *Name:  draw1
 *Purpose: draws the number 1
 *Parameters: int x, int y start in upper left corner of this char block 
 *
 *Return: void
 */


  private void draw1(int x, int y) {
    penUp();
    moveTo(x, y); // always start in upper left corner of this char block 
    turnToFace(getXPos() + 1, getYPos()); // face right
    penDown();
    forward(CHAR_WIDTH/2);
    turnRight();
    forward(CHAR_HEIGHT);
    turnRight();
    forward(CHAR_WIDTH/2);
    turnRight();
    turnRight();
    forward(CHAR_WIDTH);

  }

/*
 *Name:  drawF
 *Purpose: draws the uppercase letter F
 *Parameters: int x, int y start in upper left corner of this char block 
 *
 *Return: void
 */

  private void drawF(int x, int y) {
    penUp();
    moveTo(x, y); // always start in upper left corner of this char block 
    turnToFace(getXPos() + 1, getYPos()); // face right
    penDown();
    forward(CHAR_WIDTH);
    backward(CHAR_WIDTH);
    turnRight();
    forward(CHAR_WIDTH);
    turnLeft();
    forward(CHAR_WIDTH);
    backward(CHAR_WIDTH);
    turnRight();
    forward(CHAR_WIDTH);
  }

/*
 *Name:  drawA
 *Purpose: draws the uppercase letter A
 *Parameters: int x, int y start in upper left corner of this char block 
 *
 *Return: void
 */

  private void drawA(int x, int y) {
    penUp();
    moveTo(x, y); // always start in upper left corner of this char block 
    turnToFace(getXPos() + 1, getYPos()); //face right
    turnRight();
    forward(CHAR_HEIGHT);
    turnToFace(getXPos() + 1, getYPos() -  Y_OFFSET_2); // face 75 degrees
    penDown();
    forward((int)Math.sqrt(CHAR_HEIGHT * (CHAR_WIDTH / 2)) * 2);
    turnToFace(getXPos() + 1, getYPos() +  Y_OFFSET_2); // face -75 degrees
    forward((int)Math.sqrt(CHAR_HEIGHT * (CHAR_WIDTH / 2)) * 2);
    backward(CHAR_WIDTH);
    turnToFace(getXPos() - 1, getYPos()); 
    forward(CHAR_WIDTH / 2);

  }

/*
 *Name:  drawP
 *Purpose: draws the uppercase letter P
 *Parameters: int x, int y start in upper left corner of this char block 
 *
 *Return: void
 */

  private void drawP(int x, int y) {
    penUp();
    moveTo(x, y); // always start in upper left corner of this char block 
    turnToFace(getXPos() + 1, getYPos()); // face right
    penDown();
    forward(CHAR_WIDTH);
    turnRight();
    forward(CHAR_WIDTH);
    turnRight();
    forward(CHAR_WIDTH);
    turnRight();
    forward(CHAR_WIDTH);
    backward(CHAR_HEIGHT);
  }

/*
 *Name:  drawJ
 *Purpose: draws the uppercase letter J
 *Parameters: int x, int y start in upper left corner of this char block 
 *
 *Return: void
 */

  private void drawJ(int x, int y) {
    penUp();
    moveTo(x, y); // always start in upper left corner of this char block 
    turnToFace(getXPos() + 1, getYPos()); // face right
    penDown();
    forward(CHAR_WIDTH);
    backward(CHAR_WIDTH / 2);
    turnRight();
    forward(CHAR_HEIGHT);
    turnRight();
    forward(CHAR_WIDTH / 2);
    turnRight();
    forward(CHAR_WIDTH / 2);
  }

/*
 *Name:  drawV
 *Purpose: draws the uppercase letter V
 *Parameters: int x, int y start in upper left corner of this char block 
 *
 *Return: void
 */

  private void drawV(int x, int y) {
    penUp();
    moveTo(x, y); // always start in upper left corner of this char block 
    turnToFace(getXPos() + 1, getYPos()); // face right
    turnToFace(getXPos() + 1, getYPos() +  Y_OFFSET_2); // face 60 degrees
    penDown();
    forward((int)Math.sqrt(CHAR_HEIGHT * (CHAR_WIDTH / 2)) * 2);
    turnToFace(getXPos() + 1, getYPos() -  Y_OFFSET_2); // face -60 degrees
    forward((int)Math.sqrt(CHAR_HEIGHT * (CHAR_WIDTH / 2)) * 2);
  }

/*
 *Name:  draw2
 *Purpose: draws the number 2
 *Parameters: int x, int y start in upper left corner of this char block 
 *
 *Return: void
 */

  private void draw2(int x, int y) {
    penUp();
    moveTo(x, y); // always start in upper left corner of this char block 
    turnToFace(getXPos() + 1, getYPos()); // face right
    penDown();
    forward(CHAR_WIDTH);
    turnRight();
    forward(CHAR_WIDTH);
    turnRight();
    forward(CHAR_WIDTH);
    turnLeft();
    forward(CHAR_WIDTH);
    turnLeft();
    forward(CHAR_WIDTH);
    turnRight();

  }

/*
 *Name:  draw0
 *Purpose: draws the number 0
 *Parameters: int x, int y start in upper left corner of this char block 
 *
 *Return: void
 */

  private void draw0(int x, int y) {
    penUp();
    moveTo(x, y); // always start in upper left corner of this char block 
    turnToFace(getXPos() + 1, getYPos()); // face right
    penDown();
    forward(CHAR_WIDTH);
    turnRight();
    forward(CHAR_HEIGHT);
    turnRight();
    forward(CHAR_WIDTH);
    turnRight();
    forward(CHAR_HEIGHT);
    turnRight();

  }

/*
 *Name:  draw6
 *Purpose: draws the number 6
 *Parameters: int x, int y start in upper left corner of this char block 
 *
 *Return: void
 */

  private void draw6(int x, int y) {
    penUp();
    moveTo(x, y); // always start in upper left corner of this char block 
    turnToFace(getXPos() + 1, getYPos()); // face right
    penDown();
    forward(CHAR_WIDTH);
    backward(CHAR_WIDTH);
    turnRight();
    forward(CHAR_WIDTH);
    turnLeft();
    forward(CHAR_WIDTH);
    turnRight();
    forward(CHAR_WIDTH);
    turnRight();
    forward(CHAR_WIDTH);
    turnRight();
    forward(CHAR_WIDTH);


  }

/*
 *Name:  drawU
 *Purpose: draws the uppercase letter U
 *Parameters: int x, int y start in upper left corner of this char block 
 *
 *Return: void
 */

  private void drawU(int x, int y) {
    penUp();
    moveTo(x, y); // always start in upper left corner of this char block 
    turnToFace(getXPos() + 1, getYPos()); // face right
    penDown();
    turnRight();
    forward(CHAR_HEIGHT);
    turnLeft();
    forward(CHAR_WIDTH);
    turnLeft();
    forward(CHAR_HEIGHT);

  }

/*
 *Name:  drawN
 *Purpose: draws the uppercase letter N
 *Parameters: int x, int y start in upper left corner of this char block 
 *
 *Return: void
 */

  private void drawN(int x, int y) {
    penUp();
    moveTo(x, y); // always start in upper left corner of this char block 
    turnToFace(getXPos() + 1, getYPos()); // face right
    penDown();
    turnRight();
    forward(CHAR_HEIGHT);
    backward(CHAR_HEIGHT);
    turnToFace(getXPos() + 1, getYPos() + Y_OFFSET_1); // face -60 degrees
    forward((int)Math.sqrt(CHAR_HEIGHT * (CHAR_WIDTH)) * 2 - Y_CORRECT_1);
    turnToFace(getXPos(), getYPos() - 1);
    forward(CHAR_HEIGHT);
  }

/*
 *Name:  drawD
 *Purpose: draws the uppercase letter D
 *Parameters: int x, int y start in upper left corner of this char block 
 *
 *Return: void
 */

  private void drawD(int x, int y) {
    penUp();
    moveTo(x, y); // always start in upper left corner of this char block 
    turnToFace(getXPos() + 1, getYPos()); // face right
    penDown();
    forward(CHAR_WIDTH / 2);
    turnToFace(getXPos() + 1, getYPos() + Y_OFFSET_1); // face -60 degrees
    forward((int)Math.sqrt((CHAR_HEIGHT / 3) * (CHAR_WIDTH / 2)));
    turnToFace(getXPos(), getYPos() + 1);
    forward((int)CHAR_HEIGHT / 2 + Y_COORECT_2);
    turnToFace(getXPos() - 1, getYPos() + Y_OFFSET_1); // face -120 degrees
    forward((int)Math.sqrt((CHAR_HEIGHT / 3) * (CHAR_WIDTH / 2)));
    turnToFace(getXPos() - 1, getYPos());
    forward(CHAR_WIDTH / 2);
    turnRight();
    forward(CHAR_HEIGHT);
  }

/*
 *Name:  drawI
 *Purpose: draws the uppercase letter I
 *Parameters: int x, int y start in upper left corner of this char block 
 *
 *Return: void
 */

  private void drawI(int x, int y) {
    penUp();
    moveTo(x, y); // always start in upper left corner of this char block 
    turnToFace(getXPos() + 1, getYPos()); // face right
    penDown();
    forward(CHAR_WIDTH);
    backward(CHAR_WIDTH / 2);
    turnRight();
    forward(CHAR_HEIGHT);
    turnRight();
    forward(CHAR_WIDTH / 2);
    backward(CHAR_WIDTH);
  }

/*
 *Name:  drawE
 *Purpose: draws the uppercase letter E
 *Parameters: int x, int y start in upper left corner of this char block 
 *
 *Return: void
 */

  private void drawE(int x, int y) {
    penUp();
    moveTo(x, y); // always start in upper left corner of this char block 
    turnToFace(getXPos() + 1, getYPos()); // face right
    penDown();
    forward(CHAR_WIDTH);
    backward(CHAR_WIDTH);
    turnRight();
    forward(CHAR_WIDTH);
    turnLeft();
    forward(CHAR_WIDTH);
    backward(CHAR_WIDTH);
    turnRight();
    forward(CHAR_WIDTH);
    turnLeft();
    forward(CHAR_WIDTH);

  }

/*
 *Name:  drawG
 *Purpose: draws the uppercase letter G
 *Parameters: int x, int y start in upper left corner of this char block 
 *
 *Return: void
 */

  private void drawG(int x, int y) {
    penUp();
    moveTo(x, y); // always start in upper left corner of this char block 
    turnToFace(getXPos() + 1, getYPos()); // face right
    penDown();
    forward(CHAR_WIDTH);
    backward(CHAR_WIDTH);
    turnRight();
    forward(CHAR_HEIGHT);
    turnLeft();
    forward(CHAR_WIDTH);
    turnLeft();
    forward(CHAR_WIDTH);
    turnLeft();
    forward(CHAR_WIDTH / 3);

  }

/*
 *Name: twinkle
 *Purpose: make the letters twinkle
 *Parameters: CS11TurtleGraphicsEC myTurtle   (allows the function to draw) 
 *Return: void
 */

  private static void twinkle(CS11TurtleGraphicsEC myTurtle) {
    Random rand = new Random();
    
    while (T == true) {     //makes an infinite loop so the twinkling lasts until the user ends the program
      int randomNum = rand.nextInt(26 - 1 + 1) + 1;  //creates a random number to choose which letter twinkles
      
      if(randomNum == 1) {
       
        myTurtle.setPenColor(PEN_COLOR_WHITE);  //clears the letter
        myTurtle.drawC(C1[0], C1[1]);
        
        myTurtle.setPenColor(PEN_COLOR);
        myTurtle.drawC(C1[0], C1[1]); //writes the letter C again
      }
      else if(randomNum == 2) {
        
        myTurtle.setPenColor(PEN_COLOR_WHITE);//clears the letter
        myTurtle.drawS(S1[0], S1[1]);
        
        myTurtle.setPenColor(PEN_COLOR);
        myTurtle.drawS(S1[0], S1[1]);//writes the letter S again
      }
      else if(randomNum == 3) {
        
        myTurtle.setPenColor(PEN_COLOR_WHITE);//clears the letter
        myTurtle.draw0(O[0], O[1]);
        
        myTurtle.setPenColor(PEN_COLOR);
        myTurtle.draw0(O[0], O[1]);//writes the number 0 again
      }
      else if(randomNum == 4) {
       
        myTurtle.setPenColor(PEN_COLOR_WHITE);//clears the letter
        myTurtle.draw1(ONE1[0], ONE1[1]);
        myTurtle.setPenColor(PEN_COLOR);
        myTurtle.draw1(ONE1[0], ONE1[1]);//writes the number 1 again
      }
      else if(randomNum == 5) {
        myTurtle.setPenColor(PEN_COLOR_WHITE);//clears the letter
        myTurtle.draw1(ONE2[0], ONE2[1]);
        myTurtle.setPenColor(PEN_COLOR);
        myTurtle.draw1(ONE2[0], ONE2[1]);//writes the number 1 again
      }
      else if(randomNum == 6) {
        myTurtle.setPenColor(PEN_COLOR_WHITE);//clears the letter
        myTurtle.drawF(F[0], F[1]);
        myTurtle.setPenColor(PEN_COLOR);
        myTurtle.drawF(F[0], F[1]);//writes the letter F again
      }
      else if(randomNum == 7) {
         
        myTurtle.setPenColor(PEN_COLOR_WHITE);//clears the letter
        myTurtle.drawA(A1[0], A1[1]);
         
        myTurtle.setPenColor(PEN_COLOR);
        myTurtle.drawA(A1[0], A1[1]);//writes the letter A again
      }
      else if(randomNum == 8) {
         
        myTurtle.setPenColor(PEN_COLOR_WHITE);//clears the letter
        myTurtle.drawP(P[0], P[1]);
         
        myTurtle.setPenColor(PEN_COLOR);
        myTurtle.drawP(P[0], P[1]);//writes the letter P again
      }
      else if(randomNum == 9) {
         
        myTurtle.setPenColor(PEN_COLOR_WHITE);//clears the letter
        myTurtle.drawC(C2[0], C2[1]);
         
        myTurtle.setPenColor(PEN_COLOR);
        myTurtle.drawC(C2[0], C2[1]);//writes the letter C again
      }
      else if(randomNum == 10) {
         
        myTurtle.setPenColor(PEN_COLOR_WHITE);//clears the letter
        myTurtle.drawJ(J[0], J[1]);
         
        myTurtle.setPenColor(PEN_COLOR);
        myTurtle.drawJ(J[0], J[1]);//writes the letter J again
      }
      else if(randomNum == 11) {
         
        myTurtle.setPenColor(PEN_COLOR_WHITE);//clears the letter
        myTurtle.drawA(A2[0], A2[1]);
         
        myTurtle.setPenColor(PEN_COLOR);
        myTurtle.drawA(A2[0], A2[1]);//writes the letter A again
      }
      else if(randomNum == 12) {
         
        myTurtle.setPenColor(PEN_COLOR_WHITE);//clears the letter
        myTurtle.drawV(V[0], V[1]);
         
        myTurtle.setPenColor(PEN_COLOR);
        myTurtle.drawV(V[0], V[1]);//writes the letter V again
      }
      else if(randomNum == 13) {
         
        myTurtle.setPenColor(PEN_COLOR_WHITE);//clears the letter
        myTurtle.drawA(A3[0], A3[1]);
         
        myTurtle.setPenColor(PEN_COLOR);
        myTurtle.drawA(A3[0], A3[1]);//writes the letter A again
      }
      else if(randomNum == 14) {
         
        myTurtle.setPenColor(PEN_COLOR_WHITE);//clears the letter
        myTurtle.draw2(TWO[0], TWO[1]);
         
        myTurtle.setPenColor(PEN_COLOR);
        myTurtle.draw2(TWO[0], TWO[1]);//writes the number 2 again
      }
      else if(randomNum == 15) {
         
        myTurtle.setPenColor(PEN_COLOR_WHITE);//clears the letter
        myTurtle.draw0(ZERO[0], ZERO[1]);
         
        myTurtle.setPenColor(PEN_COLOR);
        myTurtle.draw0(ZERO[0], ZERO[1]);//writes the number 0 again
      }
      else if(randomNum == 16) {
         
        myTurtle.setPenColor(PEN_COLOR_WHITE);//clears the letter
        myTurtle.draw1(ONE3[0], ONE3[1]);
         
        myTurtle.setPenColor(PEN_COLOR);
        myTurtle.draw1(ONE3[0], ONE3[1]);//writes the number 1 again
      }
      else if(randomNum == 17) {
         
        myTurtle.setPenColor(PEN_COLOR_WHITE);//clears the letter
        myTurtle.draw6(SIX[0], SIX[1]);
         
        myTurtle.setPenColor(PEN_COLOR);
        myTurtle.draw6(SIX[0], SIX[1]);//writes the number 6 again
      }
      else if(randomNum == 18) {
         
        myTurtle.setPenColor(PEN_COLOR_WHITE);//clears the letter
        myTurtle.drawU(U[0], U[1]);
         
        myTurtle.setPenColor(PEN_COLOR);
        myTurtle.drawU(U[0], U[1]);//writes the letter U again
      }
      else if(randomNum == 19) {
         
        myTurtle.setPenColor(PEN_COLOR_WHITE);//clears the letter
        myTurtle.drawC(C3[0], C3[1]);
         
        myTurtle.setPenColor(PEN_COLOR);
        myTurtle.drawC(C3[0], C3[1]);//writes the letter C again
      }
      else if(randomNum == 20) {
         
        myTurtle.setPenColor(PEN_COLOR_WHITE);//clears the letter
        myTurtle.drawS(S2[0], S2[1]);
         
        myTurtle.setPenColor(PEN_COLOR);
        myTurtle.drawS(S2[0], S2[1]);//writes the letter S again
      }
      else if(randomNum == 21) {
         
        myTurtle.setPenColor(PEN_COLOR_WHITE);//clears the letter
        myTurtle.drawA(A4[0], A4[1]);
         
        myTurtle.setPenColor(PEN_COLOR);
        myTurtle.drawA(A4[0], A4[1]);//writes the letter A again
      }
      else if(randomNum == 22) {
         
        myTurtle.setPenColor(PEN_COLOR_WHITE);//clears the letter
        myTurtle.drawN(N[0], N[1]);
         
        myTurtle.setPenColor(PEN_COLOR);
        myTurtle.drawN(N[0], N[1]);//writes the letter N again
      }
      else if(randomNum == 23) {
         
        myTurtle.setPenColor(PEN_COLOR_WHITE);//clears the letter
        myTurtle.drawD(D[0], D[1]);
         
        myTurtle.setPenColor(PEN_COLOR);
        myTurtle.drawD(D[0], D[1]);//writes the letter D again
      }
      else if(randomNum == 24) {
         
        myTurtle.setPenColor(PEN_COLOR_WHITE);//clears the letter
        myTurtle.drawI(I[0], I[1]);
         
        myTurtle.setPenColor(PEN_COLOR);
        myTurtle.drawI(I[0], I[1]);//writes the letter I again
      }
      else if(randomNum == 25) {
         
        myTurtle.setPenColor(PEN_COLOR_WHITE);//clears the letter
        myTurtle.drawE(E[0], E[1]);
         
        myTurtle.setPenColor(PEN_COLOR);
        myTurtle.drawE(E[0], E[1]);//writes the letter E again
      }
      else if(randomNum == 26) {
         
        myTurtle.setPenColor(PEN_COLOR_WHITE);//clears the letter
        myTurtle.drawG(G[0], G[1]);
         
        myTurtle.setPenColor(PEN_COLOR);
        myTurtle.drawG(G[0], G[1]);//writes the letter G again
      }

    }
  }

/*
 *Name:  main method
 *Purpose: is the main method
 *Parameters: args (none)
 *
 *Return: void
 */

  public static void main(String [] args) {
    int startX1 = START_X_1;
    int startX2 = START_X_2;
    int startX3 = START_X_3;
    int startY  = START_Y;

    int x, y;

    World w = new World(WORLD_WIDTH, WORLD_HEIGHT); 
    CS11TurtleGraphicsEC myTurtle = new CS11TurtleGraphicsEC(w, DELAY);
    myTurtle.setPenWidth(PEN_WIDTH); 
    myTurtle.setPenColor(PEN_COLOR);
    myTurtle.drawC(x = startX1, y = startY); 
    C1[0] = x;
    C1[1] = y;
    myTurtle.drawS(x += CHAR_SPACING, y);
    S1[0] = x;
    S1[1] = y;
    myTurtle.draw1(x += CHAR_SPACING, y);
    ONE1[0] = x;
    ONE1[1] = y;
    myTurtle.draw1(x += CHAR_SPACING, y);
    ONE2[0] = x;
    ONE2[1] = y;
    myTurtle.drawF(x += CHAR_SPACING, y);
    F[0] = x;
    F[1] = y;
    myTurtle.drawA(x += CHAR_SPACING, y);
    A1[0] = x;
    A1[1] = y;
    myTurtle.drawP(x += CHAR_SPACING, y);
    P[0] = x;
    P[1] = y;
    myTurtle.drawC(x += CHAR_SPACING, y);
    C2[0] = x;
    C2[1] = y;
    myTurtle.drawJ(x = startX2, y += LINE_SPACING);
    J[0] = x;
    J[1] = y;
    myTurtle.drawA(x += CHAR_SPACING, y);
    A2[0] = x;
    A2[1] = y;
    myTurtle.drawV(x += CHAR_SPACING, y);
    V[0] = x;
    V[1] = y;
    myTurtle.drawA(x += CHAR_SPACING, y);
    A3[0] = x;
    A3[1] = y;
    myTurtle.draw2(x += 2 * CHAR_SPACING, y); // allow for the space
    TWO[0] = x;
    TWO[1] = y;
    myTurtle.draw0(x += CHAR_SPACING, y);
    ZERO[0] = x;
    ZERO[1] = y;
    myTurtle.draw1(x += CHAR_SPACING, y);
    ONE3[0] = x;
    ONE3[1] = y;
    myTurtle.draw6(x += CHAR_SPACING, y);
    SIX[0] = x;
    SIX[1] = y;
    myTurtle.drawU(x = startX3, y += LINE_SPACING);
    U[0] = x;
    U[1] = y;
    myTurtle.drawC(x += CHAR_SPACING, y);
    C3[0] = x;
    C3[1] = y;
    myTurtle.drawS(x += 2 * CHAR_SPACING, y); // allow for the space
    S2[0] = x;
    S2[1] = y;
    myTurtle.drawA(x += CHAR_SPACING, y);
    A4[0] = x;
    A4[1] = y;
    myTurtle.drawN(x += CHAR_SPACING, y);
    N[0] = x;
    N[1] = y;
    myTurtle.drawD(x += 2 * CHAR_SPACING, y); // allow for the space
    D[0] = x;
    D[1] = y;
    myTurtle.drawI(x += CHAR_SPACING, y);
    I[0] = x;
    I[1] = y;
    myTurtle.drawE(x += CHAR_SPACING, y);
    E[0] = x;
    E[1] = y;
    myTurtle.drawG(x += CHAR_SPACING, y);
    G[0] = x;
    G[1] = y;
    myTurtle.draw0(x += CHAR_SPACING, y);
    O[0] = x;
    O[1] = y;

    twinkle(myTurtle);
  }

} // End of public class CS11TurtleGraphicsEC extends Turtle
