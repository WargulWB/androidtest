package com.github.wargulwb.androidtest;

import com.gluonhq.attach.storage.StorageService;
import java.io.File;
import java.nio.file.Files;
import java.util.Optional;

public class DataManager {

    private static final String FILE_NAME = "userdata.txt";

    // Get the correct, OS-specific private storage folder
    private static Optional<File> getStorageDirectory() {
        return StorageService.create().flatMap(StorageService::getPrivateStorage);
    }

    // Save text data to the phone
    public static void saveData(String text) {
        getStorageDirectory().ifPresent(dir -> {
            try {
                File file = new File(dir, FILE_NAME);
                Files.writeString(file.toPath(), text);
                System.out.println("Data saved to: " + file.getAbsolutePath());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    // Read text data back from the phone
    public static String readData() {
        return getStorageDirectory().map(dir -> {
            try {
                File file = new File(dir, FILE_NAME);
                if (file.exists()) {
                    return Files.readString(file.toPath());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return "No saved data found.";
        }).orElse("Storage service unavailable.");
    }
}