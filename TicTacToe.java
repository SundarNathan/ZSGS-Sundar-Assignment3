import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[][] board= new char[][]{
            {
                'x', 'o', 'x'
            },
            {
                'x', 'o', 'x'
            },
            {
                'x', 'o', ' '
            }
        };

        System.out.println(xo(board));
    }

    public static String xo(char[][]board)
    {
        int rx[]=new int[3];
        int cx[]=new int[3];
        int ry[]=new int[3];
        int cy[]=new int[3];

        int x=0, y=0;
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(board[i][j]=='x')
                {
                    rx[i]++;
                    cx[j]++;
                    x++;
                }
                if(board[i][j]=='o')
                {
                    ry[i]++;
                    cy[j]++;
                    y++;
                }
            }
        }

//        System.out.println(rx[0]+" "+rx[1]+" "+rx[2]);
        if(y>x||x>y+1)
        {
            return ("Wrong turn order");
        }
        else {
            boolean xb = (rx[0] == 3 || rx[1] == 3 || rx[2] == 3) || (cx[0] == 3 || cx[1] == 3 || cx[2] == 3);
            boolean yb = (ry[0] == 3 || ry[1] == 3 || ry[2] == 3) || (cy[0] == 3 || cy[1] == 3 || cy[2] == 3);
            if(xb && yb)
            {
                return ("Continued playing after win");
            }
            else if(xb)
            {
                return "x won";
            }
            else if(yb)
            {
                return "o won";
            }
            else if(x==5)
                return "draw";
            else
                return "game ongoing";
        }
    }
}