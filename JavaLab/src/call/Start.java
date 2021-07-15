package call;

public class Start {
	public static void main(String[] args) {
	 printEmpty();
}    static float count(float x, float y) {        return (float) (Math.pow((x * x + y * y - 1), 3) - x * x * y * y * y);

}    public static void printEmpty() {        int height = 20, width = 60;        int heart[][] = new int[height][width];        float hx = 0.0f, hy = 0.0f;        for (int y = height / 2; y > -height / 2; y--) {            for (int x = -width / 2; x < width / 2; x++) {
            hx = (float) x / (float) (width / 2.8f);
            hy = (float) (y) / (float) (height / 2.8f);                if (count(hx, hy) <= 0.0f) {
                heart[height / 2 - y][x + width / 2] = 1;
            }
        }
    }        for (int y = 1; y < height - 1; y++) {            for (int x = 1; x < width - 1; x++) {                if (heart[y][x] == 1
                    && !(heart[y][x - 2] == 1 && heart[y][x + 2] == 1
                    && heart[y - 1][x] == 1 && heart[y + 1][x] == 1)) {
                System.out.print("*");
                
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    System.out.println("           程序員Couple 一起加油! LOVE U");
    System.out.println("");
    System.out.println("         妳的努力跟勇敢會帶領妳走向你喜歡的地方");
    System.out.println("");
    System.out.println(" Kevin Kelly Advice 32. Be the change you wish to see ");
    System.out.println("                  做出自己喜歡的改變");
    System.out.println("-----------------------------------------------");
    System.out.println("     一起成為更好的人～  Happy 520(雖然已經過了）哈哈");
    System.out.println("");
    System.out.println("                      By Wei 2021/5/23  MISS U");
    
}
		

	}


