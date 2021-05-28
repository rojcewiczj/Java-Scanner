package com.scanner;

import java.util.*;


public class Connections {
    
    public Map<String, List<String>> connections = new HashMap<String, List<String>>();

    public Connections(int[][] map){
        for(int x = 0; x < map.length; x++){
            for(int y = 0; y < map[0].length; y++){
                if(map[x][y] != 1){
                String Xstring = String.format("%d", x);
                String Ystring = String.format("%d", y);
                String XandY = Xstring + "," + Ystring;
                List<String> neighbors = new ArrayList<>();
                connections.put((XandY), neighbors);
                String Xup = String.format("%d", x -1);
                String Xdown = String.format("%d", x +1);
                String Yleft = String.format("%d", y -1);
                String Yright = String.format("%d", y+ 1);
                String Up = Xup + "," + Ystring;
                String Down = Xdown + "," + Ystring;
                String Left = Xstring + "," + Yleft;
                String Right = Xstring + "," + Yright;
                String DiagonalUpLeft = Xup + "," + Yleft;
                String DiagonalDownLeft = Xdown + "," + Yleft;
                String DiagonalDownRight = Xdown+ "," + Yright;
                String DiagonalUpRight = Xup + "," + Yright;
                if(connections.containsKey(Up)){
                    connections.get(Up).add(Down);
                }
                if(connections.containsKey(Down)){
                    connections.get(Down).add(Up);
                }
                if(connections.containsKey(Left)){
                    connections.get(Left).add(Right);
                }
                if(connections.containsKey(Right)){
                    connections.get(Right).add(Left);
                }
                if(connections.containsKey(DiagonalDownLeft)){
                    connections.get(DiagonalDownLeft).add(DiagonalUpRight);
                }
                if(connections.containsKey(DiagonalUpLeft)){
                    connections.get(DiagonalUpLeft).add(DiagonalDownRight);
                }
                if(connections.containsKey(DiagonalDownRight)){
                    connections.get(DiagonalDownRight).add(DiagonalUpLeft);
                }
                if(connections.containsKey(DiagonalUpRight)){
                    connections.get(DiagonalUpRight).add(DiagonalDownLeft);
                }
            }
            }
        }


    }
}
