package org.learning.bestOfTheYear.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/song")
public class ControllerSong {
@GetMapping
    public String ListOfSongs(Model model){
        List<Song> songs = getSongs();
        model.addAttribute("songs", songs);
        return "SongList";
    }

    @GetMapping("/details")
    public String songDetails(@RequestParam int songId, Model model) {
        // cerco il player con il nome arrivato come parametro
        Song song = getSongById(songId);
        model.addAttribute("song", song);
        return "song-details";
    }




    private List<Song> getSongs() {
        List<Song> songs = new ArrayList<>();

        songs.add(new Song(1, "Allora", "Ale"));
        songs.add(new Song(2, "Trovato", "Filippo"));
        songs.add(new Song(3, "Tornerai li", "Gennarino"));
        songs.add(new Song(4, "Risalita", "Fernandello"));
        songs.add(new Song(5, "Caldo e freddo", "Zio Pippo"));

        return songs;
    }

    private Song getSongById(int songId) {
        Song song = null;
        for (Song p : getSongs()) {
            if (p.getId() == songId ){
                song = p;
                break;
            }
        }
        return song;
    }

}
