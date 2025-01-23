# YouTube Spring Boot API

This repository contains a Spring Boot application that provides RESTful APIs to manage YouTube-related information. The application exposes different endpoints for fetching, creating, updating, and deleting YouTube content such as videos, channels, and playlists.

## What I Did in This project

In this project, I created a Spring Boot-based RESTful API for managing basic YouTube-related functionality. The API consists of the following features:

1. **GET `/youtube/videos`**: Retrieves a description of YouTube videos and their functionality, explaining how YouTube videos are used for uploading, sharing, and watching content.
  
2. **POST `/youtube/channels`**: Allows users to create a new YouTube channel by explaining how to set up a channel to upload and manage content.

3. **PUT `/youtube/playlists`**: Provides an endpoint to update YouTube playlist information, explaining how playlists are used to organize and group videos.

4. **DELETE `/youtube/videos/{videoId}`**: Allows users to delete a YouTube video by its unique ID, highlighting the video deletion process for the video owner or admins.

The project leverages **Spring Boot** for building the REST API and includes common HTTP methods such as **GET**, **POST**, **PUT**, and **DELETE** to simulate basic YouTube functionalities.

## Features

- **GET `/youtube/videos`**: Retrieves information about YouTube videos.
- **POST `/youtube/channels`**: Creates a new YouTube channel.
- **PUT `/youtube/playlists`**: Updates information about YouTube playlists.
- **DELETE `/youtube/videos/{videoId}`**: Deletes a YouTube video by its ID.

## Prerequisites

Before running this project, ensure that you have the following installed:

- Java 8 or higher
- Maven
- Spring Boot
- IDE (e.g., IntelliJ IDEA, Eclipse) or command line for building and running the project.


