/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.juegopoo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author EQUIPO
 */
public class JuegoPoo {

    public static void main(String[] args) {
        
        System.out.println("---VIDEO JUEGOS----");
        
        List<VideoJuego> juegos = new ArrayList<VideoJuego> ();
        
        juegos.add(new VideoJuego("ABA234", "Mario Bross", "Nintendo64", 105, "Aventura"));
        juegos.add(new VideoJuego("TAR547", "Sonic", "Sega", 25, "Accion"));
        juegos.add(new VideoJuego("YAR456", "Super Girl", "PC", 36, "Tactic"));
        juegos.add(new VideoJuego("UAR879", "League of Legends", "Play Station", 1000, "Rol"));
        juegos.add(new VideoJuego("LIP252", "Dota2", "Nintendo64", 1500, "Multiplayer"));
        
        System.out.println("Lista de VideoJuegos Almacenados");
        for(VideoJuego jueguito:juegos){
            System.out.println("Titulo: " + jueguito.getTitulo());
            System.out.println("Consola: " + jueguito.getConsola());
            System.out.println("Cantidad de Jugadores: " + jueguito.getCantidadJugadores());
            System.out.println("-----------------------");
        }
        
        System.out.println("Cambio de Nombre y Cantidad de Jugadores de 2 juegos");
        for(VideoJuego cambio:juegos){
            if(cambio.getTitulo().equalsIgnoreCase("Super Girl")){
                cambio.setTitulo("Power Puff Girls");
                cambio.setCantidadJugadores(550);
                
            }else if(cambio.getTitulo().equalsIgnoreCase("Dota 2")){
                cambio.setTitulo("Wild Rift");
                cambio.setCantidadJugadores(220);
            }
        }
        System.out.println("------------------");
        System.out.println("Mostrar la lista de Juegos luego de la Reasignacion");
        for(VideoJuego mostrar:juegos){
            System.out.println("Titulo: " + mostrar.getTitulo());
            System.out.println("Consola: " + mostrar.getConsola());
            System.out.println("Cantidad de Jugadores: " + mostrar.getCantidadJugadores());
            System.out.println("-----------------------");
        }
        
        System.out.println("Mostrar aquellos Juegos que sean para Nintendo 64");
        for(VideoJuego nintendo:juegos){
            if(nintendo.getConsola().equalsIgnoreCase("Nintendo64")){
                System.out.println("Juego Nintendo 64: " + nintendo.getTitulo());
                System.out.println("---------------------");
            }
        }
    }
}
