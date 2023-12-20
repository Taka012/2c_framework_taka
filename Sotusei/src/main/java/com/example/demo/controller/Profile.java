//
//import com.google.gson.Gson;
//import com.google.gson.JsonObject;
//import com.google.gson.JsonPrimitive;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.PrintWriter;
//
//@WebServlet("/import com.google.gson.Gson;
//import com.google.gson.JsonObject;
//import com.google.gson.JsonPrimitive;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.PrintWriter;
//
//@WebServlet("/Profile")
//public class ProfileServlet extends HttpServlet {
//
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//
//        // Read JSON data from the request
//        BufferedReader reader = request.getReader();
//        JsonObject data = new Gson().fromJson(reader, JsonObject.class);
//
//        // Process the received data (you can store it in a database or perform other actions)
//        String name = data.get("name").getAsString();
//        String birthdate = data.get("birthdate").getAsString();
//        String musicGenre = data.get("musicGenre").getAsString();
//        String favoriteArtist = data.get("favoriteArtist").getAsString();
//
//        // Respond with the updated profile data
//        JsonObject responseData = new JsonObject();
//        responseData.add("name", new JsonPrimitive(name));
//        responseData.add("birthdate", new JsonPrimitive(birthdate));
//        responseData.add("musicGenre", new JsonPrimitive(musicGenre));
//        responseData.add("favoriteArtist", new JsonPrimitive(favoriteArtist));
//
//        response.setContentType("application/json");
//        PrintWriter writer = response.getWriter();
//        writer.println(responseData.toString());
//        writer.flush();
//    }
//}
//")
//public class ProfileServlet extends HttpServlet {
//
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//
//        // Read JSON data from the request
//        BufferedReader reader = request.getReader();
//        JsonObject data = new Gson().fromJson(reader, JsonObject.class);
//
//        // Process the received data (you can store it in a database or perform other actions)
//        String name = data.get("name").getAsString();
//        String birthdate = data.get("birthdate").getAsString();
//        String musicGenre = data.get("musicGenre").getAsString();
//        String favoriteArtist = data.get("favoriteArtist").getAsString();
//
//        // Respond with the updated profile data
//        JsonObject responseData = new JsonObject();
//        responseData.add("name", new JsonPrimitive(name));
//        responseData.add("birthdate", new JsonPrimitive(birthdate));
//        responseData.add("musicGenre", new JsonPrimitive(musicGenre));
//        responseData.add("favoriteArtist", new JsonPrimitive(favoriteArtist));
//
//        response.setContentType("application/json");
//        PrintWriter writer = response.getWriter();
//        writer.println(responseData.toString());
//        writer.flush();
//    }
//}
