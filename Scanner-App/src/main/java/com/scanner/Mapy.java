package com.scanner;

public class Mapy {
    

    public int[][] map = new int[20][20];
    public Connections connections;
    public Mapy(){
        for(int x = 0; x < map.length; x++){
            for(int y = 0; y < map[0].length; y ++){
                if(x== 0 || x ==map.length -1){
                    map[x][y] = 1;
                }
                if(y== 0 || y == map.length - 1){
                    map[x][y] = 1;
                }
                System.out.print(map[x][y]);
            }
            System.out.println();
          
        }
        connections = new Connections(map);
    }
}
