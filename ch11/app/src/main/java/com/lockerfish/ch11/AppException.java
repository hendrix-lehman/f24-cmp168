package com.lockerfish.ch11;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AppException extends Exception {

  File file;
  public static final String LOG_FILE = "app.log";
  private PrintWriter logWriter;

  public AppException(String message) {
    super(message);
    // do some extra stuff here, like logging
    try {
      LocalDateTime now = LocalDateTime.now();
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
      file = new File(LOG_FILE);
      if (!file.exists()) {
        file.createNewFile();
      }
      logWriter = new PrintWriter(new FileOutputStream(file), true);

      logWriter.append("ERROR: (" + formatter.format(now) + ") " + message + "\n");
      logWriter.flush();
      System.out.println("file: " + file.getAbsolutePath());
    } catch (Exception e) {
      System.out.println("An error occurred while trying to log the error.");
    } finally {
      if (logWriter != null) {
        logWriter.close();
      }
    }
  }

}
