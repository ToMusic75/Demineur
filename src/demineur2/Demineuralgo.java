package demineur2;

import java.util.Random;

public class Demineuralgo 
{
	private int x;
    private int y;
    private int mine;
    private boolean d;
    
    private int prohValueX;
    private int prohValueY;
    
    private int[][] map;
    private boolean[][] shem;
    private boolean[][] flag;
    
    public void Dem()
    {
        
        x = 10;
        y = 10;
        mine = 10;
        d = false;
        int i = 0;
        int j = 0;
        
        prohValueX = -1;
        prohValueY = -1;
        
        map = new int[x][y];
        shem = new boolean[x][y];
        flag = new boolean[x][y];
        
        while(i<x)//INIT
        {
            
            j = 0;
            
            while(j<y)
            {
                
                map[i][j] = 0;
                shem[i][j] = false;
                flag[i][j] = false;
                
                j++;
                
            }
            
            i++;
            
        }
        
    }
    
    public void Dem(int _x, int _y, int _m)
    {
        
        x = _x;
        y = _y;
        mine = _m;
        d = false;
        int i = 0;
        int j = 0;
        
        prohValueX = -1;
        prohValueY = -1;
        
        map = new int[x][y];
        shem = new boolean[x][y];
        flag = new boolean[x][y];
        
        while(i<x)//INIT
        {
            
            j = 0;
            
            while(j<y)
            {
                
                map[i][j] = 0;
                shem[i][j] = false;
                flag[i][j] = false;
                j++;
                
            }
            
            i++;
            
        }
        
    }
    
    public void Init()
    {
        
        x = 10;
        y = 10;
        mine = 10;
        d = false;
        int i = 0;
        int j = 0;
        
        prohValueX = -1;
        prohValueY = -1;
        
        map = new int[x][y];
        shem = new boolean[x][y];
        flag = new boolean[x][y];
        
        while(i<x)//INIT
        {
            
            j = 0;
            
            while(j<y)
            {
                
                map[i][j] = 0;
                shem[i][j] = false;
                flag[i][j] = false;
                
                j++;
                
            }
            
            i++;
            
        }
        
    }
    
    public void Init(int _x, int _y, int _m)
    {
        
        x = _x;
        y = _y;
        mine = _m;
        d = false;
        int i = 0;
        int j = 0;
        
        prohValueX = -1;
        prohValueY = -1;
        
        map = new int[x][y];
        shem = new boolean[x][y];
        flag = new boolean[x][y];
        
        while(i<x)//INIT
        {
            
            j = 0;
            
            while(j<y)
            {
                
                map[i][j] = 0;
                shem[i][j] = false;
                flag[i][j] = false;
                
                j++;
                
            }
            
            i++;
            
        }
        
    }
    
    public void genMap()
    {
        
        int i = 0;
        int j = 0;
        
        //METTRE LES MINES
        while(i < mine)
        {
            
            int xA = rand(x-1);
            int yA = rand(y-1);
            
            if(map[xA][yA] != 9)
            {
                if(xA == prohValueX && yA == prohValueY)i--;
                else map[xA][yA] = 9;
            }
            else i--;
            
            i++;
            
        }
        
        //METTRE LES CHIFFRES
        i = 0;
        while(i<x)
        {

            j = 0;
            
            while(j<y)
            {
                
                if(map[i][j] == 9)
                {
                
                    if(i-1>=0)
                        if(i-1 < x && map[i-1][j] != 9) map[i-1][j]++;
                    if(i+1 < x && map[i+1][j] != 9) map[i+1][j]++;
                    if(j-1>=0)
                        if(j-1 < y && map[i][j-1] != 9) map[i][j-1]++;
                    if(j+1 < y && map[i][j+1] != 9) map[i][j+1]++;
                    if(i+1 < x && j+1 < y && map[i+1][j+1] != 9) map[i+1][j+1]++;
                    if(i-1>=0 && j-1>=0)
                        if(i-1 < x && j-1 < y && map[i-1][j-1] != 9) map[i-1][j-1]++;
                    if(i-1>=0)
                        if(i-1 < x && j+1 < y && map[i-1][j+1] != 9) map[i-1][j+1]++;
                    if(j-1>=0)
                        if(i+1 < x && j-1 < y && map[i+1][j-1] != 9) map[i+1][j-1]++;
                    
                }

                j++;
                
            }
            
            i++;
            
        }
        
    }
    
    public void aff()
    {
        
        int i = 0;
        int j = 0;
        
        while(j<y)
        {
            
            i = 0;
            while(i<x)
            {
                
                if(shem[i][j] == true)
                {
                    if(map[i][j] == 0)
                        System.out.print(".");
                    if(map[i][j] == 1)
                        System.out.print("1");
                    if(map[i][j] == 2)
                        System.out.print("2");
                    if(map[i][j] == 3)
                        System.out.print("3");
                    if(map[i][j] == 4)
                        System.out.print("4");
                    if(map[i][j] == 5)
                        System.out.print("5");
                    if(map[i][j] == 6)
                        System.out.print("6");
                    if(map[i][j] == 7)
                        System.out.print("7");
                    if(map[i][j] == 8)
                        System.out.print("8");
                    if(map[i][j] == 9)
                        System.out.print("*");
                    
                }
                else System.out.print(" ");
                
                i++;
            
            }
        
            System.out.println();
            j++;
        
        }
        
    }
    
    public void setVisible(boolean bool)
    {
        
        int i = 0;
        int j = 0;
        
        while(i < x)
        {
            
            j = 0;
            
            while(j < y)
            {
                
                shem[i][j] = bool;
                
                j++;
                
            }
            
            i++;
            
        }
        
    }

    public void click(int sX, int sY)
    {
        
        int[][] table = null;
        
        do
        {
            
            if(table == null)
                table = new int[1][2];table[0][0]=sX;table[0][1]=sY;
            
            if(map[sX][sY] == 9){d=true;table=null;}
            else table = dec(table);
            
        }while(table != null);
        
    }
    
    public boolean getCompleted()
    {
        
        int i = 0;
        int j = 0;
        
        for(boolean[] tab : shem)
        {
            j = 0;
            for(boolean t : tab)
            {
                if(!t && map[i][j] != 9)return false;
                j++;
            }
            i++;
        }
        
        return true;
        
    }
    
    public void changeFlag(int x_, int y_)
    {
        
        if(flag[x_][y_] == false)flag[x_][y_] = true;
        else flag[x_][y_] = false;
        
    }
    
    public boolean getFlag(int x_, int y_)
    {
        
        return flag[x_][y_];
        
    }
    
    private static int rand(int max)
    {
        
        Random rand = new Random();
        return rand.nextInt(max+1);
        
    }
    
    private int[][] dec(int table[][])
    {
        
        int i = 0;
        
        int[][] tab = null;
        
        for(int[] t: table)
        {
            
            int sX = t[0];
            int sY = t[1];
            
            if(sX < x && sY < y)
            {
                
                shem[sX][sY] = true;
                
                if(map[sX][sY] == 0)
                {
                    
                    if(sX-1 < x && sX-1 >= 0 && shem[sX-1][sY] == false)
                    {
                        if(map[sX-1][sY] != 9) shem[sX-1][sY] = true;
                        if(map[sX-1][sY] == 0)
                        {
                            if(tab == null)tab = new int[x*y][2];
                            tab[i][0]=sX-1; tab[i][1]=sY;
                        }i++;
                    }
                    if(sX+1 < x && shem[sX+1][sY] == false)
                    {
                        if(map[sX+1][sY] != 9) shem[sX+1][sY] = true;
                        if(map[sX+1][sY] == 0)
                        {
                            if(tab == null)tab = new int[x*y][2];
                            tab[i][0]=sX+1; tab[i][1]=sY;
                        }i++;
                    }
                    if(sY-1 < y && sY-1 > 0 && shem[sX][sY-1] == false)
                    {
                        if(map[sX][sY-1] != 9) shem[sX][sY-1] = true;
                        if(map[sX][sY-1] == 0)
                        {
                            if(tab == null)tab = new int[x*y][2];
                            tab[i][0]=sX; tab[i][1]=sY-1;
                        }i++;
                    }
                    if(sY+1 < y && shem[sX][sY+1] == false)
                    {
                        if(map[sX][sY+1] != 9) shem[sX][sY+1] = true;
                        if(map[sX][sY+1] == 0)
                        {
                            if(tab == null)tab = new int[x*y][2];
                            tab[i][0]=sX; tab[i][1]=sY+1;
                        }i++;
                    }
                    if(sX-1 < x && sY-1 < y && sX-1 >= 0 && sY-1 >= 0 && shem[sX-1][sY-1] == false)
                    {
                        if(map[sX-1][sY-1] != 9) shem[sX-1][sY-1] = true;
                        if(map[sX-1][sY-1] == 0)
                        {
                            if(tab == null)tab = new int[x*y][2];
                            
                            tab[i][0]=sX-1; tab[i][1]=sY-1;
                        }i++;
                            
                    }
                    if(sX+1 < x && sY+1 < y && shem[sX+1][sY+1] == false)
                    {
                        if(map[sX+1][sY+1] != 9) shem[sX+1][sY+1] = true;
                        if(map[sX+1][sY+1] == 0)
                        {
                            if(tab == null)tab = new int[x*y][2];
                            
                            tab[i][0]=sX+1; tab[i][1]=sY+1;
                        }i++;
                    }
                    if(sX-1 < x && sY+1 < y && sX-1 >= 0 && shem[sX-1][sY+1] == false)
                    {
                        if(map[sX-1][sY+1] != 9) shem[sX-1][sY+1] = true;
                        if(map[sX-1][sY+1] == 0)
                        {
                            if(tab == null)tab = new int[x*y][2];
                            
                            tab[i][0]=sX-1; tab[i][1]=sY+1;
                        }i++;
                    }
                    if(sX+1 < x && sY-1 < y && sY-1 >= 0 && shem[sX+1][sY-1] == false)
                    {
                        if(map[sX+1][sY-1] != 9) shem[sX+1][sY-1] = true;
                        if(map[sX+1][sY-1] == 0)
                        {
                            if(tab == null)tab = new int[x*y][2];
                            
                            tab[i][0]=sX+1; tab[i][1]=sY-1;
                        }i++;
                    }
                    
                }
                
            }
            
        }
        
        return tab;
        
    }
    
    public boolean isDeath() {
        return d;
    }
    
    public void prohibitedValue(int x, int y)
    {
        prohValueX = x;
        prohValueY = y;
    }
    
      public int getX() {
        return x;
    }

    public int[][] getMap() {
        return map;
    }

    public boolean[][] getShem() {
        return shem;
    }

    public int getY() {
        return y;
    }

    public int getMine() {
        return mine;
    }

    public void setMap(int[][] map) {
        this.map = map;
    }

    public void setShem(boolean[][] shem) {
        this.shem = shem;
    }
    public boolean[][] getFlag() {
        return flag;
    }
    
    public void setFlag(boolean[][] flag) {
        this.flag = flag;
    }
    

}
