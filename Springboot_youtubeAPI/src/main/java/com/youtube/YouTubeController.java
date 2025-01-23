package com.youtube;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "youtube")
public class YouTubeController {

    @RequestMapping(value = "/videos", method = RequestMethod.GET)
    public String getYouTubeVideos() {
        return "YouTube videos allow creators to upload, share, and watch videos.";
    }

    @PostMapping("/channels")
    public String createYouTubeChannel() {
        return "You can create a YouTube channel to upload and manage videos.";
    }

    @PutMapping("/playlists")
    public String updateYouTubePlaylist() {
        return "YouTube playlists help organize and group your favorite videos together.";
    }

    @DeleteMapping("/videos/{videoId}")
    public String deleteYouTubeVideo() {
        return "YouTube videos can be deleted by the video owner or admins.";
    }
}
