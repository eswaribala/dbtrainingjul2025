package com.db.bankinapp.tests;

import com.db.bankingapp.dao.FileHandler;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class FileHandlerTest {
    @Test
    void testCreateFileSuccess() throws IOException {
        // Step 1: Create a mock
        FileHandler mockHandler = mock(FileHandler.class);
        String fileName="test"+new Faker().number().numberBetween(1,10000)+".log";

        // Step 2: Define behavior (stub)
        when(mockHandler.createFile("logs",fileName)).thenReturn(false);

        // Step 3: Call the method
        boolean result = mockHandler.createFile("logs",fileName);

        // Step 4: Assert result
        assertTrue(result);

        // Step 5: Verify interaction
        verify(mockHandler, times(1)).createFile("logs",fileName);
    }

    @Test
    void testCreateFileThrowsException() throws IOException {
        FileHandler mockHandler = mock(FileHandler.class);

        // Simulate IOException
        when(mockHandler.createFile("invalid/dir", "bad.txt"))
                .thenThrow(new IOException("Cannot create file"));

        // Assert exception
        IOException ex = assertThrows(IOException.class, () ->
                mockHandler.createFile("invalid/dir", "bad.txt")
        );

        assertEquals("Cannot create file", ex.getMessage());

        verify(mockHandler).createFile("invalid/dir", "bad.txt");
    }
}
