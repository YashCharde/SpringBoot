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

## Testing the API in Postman

To test the API in **Postman**, follow these steps:

### 1. GET Request to `/youtube/videos`:
- **Method**: GET
- **URL**: `http://localhost:8080/youtube/videos`
- **Response**:
  
  "YouTube videos allow creators to upload, share, and watch videos."
  ```

### 2. POST Request to `/youtube/channels`:
- **Method**: POST
- **URL**: `http://localhost:8080/youtube/channels`
- **Response**:
  ```
  "You can create a YouTube channel to upload and manage videos."
  ```

### 3. PUT Request to `/youtube/playlists`:
- **Method**: PUT
- **URL**: `http://localhost:8080/youtube/playlists`
- **Response**:
  ```
  "YouTube playlists help organize and group your favorite videos together."
  ```

### 4. DELETE Request to `/youtube/videos/{videoId}`:
- **Method**: DELETE
- **URL**: `http://localhost:8080/youtube/videos/{videoId}`  
  *(replace `{videoId}` with an actual video ID, e.g., `1234`)*
- **Response**:
  ```
  "YouTube videos can be deleted by the video owner or admins."
  ```

---

### Steps to Test Using Postman:
1. Open **Postman**.
2. Create a **New Request**.
3. Select the desired HTTP method (**GET**, **POST**, **PUT**, **DELETE**).
4. Enter the appropriate URL for the endpoint (e.g., `http://localhost:8080/youtube/videos`).
5. If using **POST** or **PUT**, you can add request bodies (if needed).
6. Click **Send** to execute the request and view the response.
7. The API will return the respective response as defined in the code.


## Prerequisites

Before running this project, ensure that you have the following installed:

- Java 8 or higher
- Maven
- Spring Boot
- IDE (e.g., IntelliJ IDEA, Eclipse) or command line for building and running the project.


