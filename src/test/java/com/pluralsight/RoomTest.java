package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RoomTest {
    @Test
    public void checkIn_NewRoom_OccupiedAndDirty(){
        //Arrange
        Room room = new Room(3,20);

        //Act
        room.checkIn();

        //Assert
        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());
    }

    @Test
    public void checkIn_OccupiedRoom_OccupiedAndDirty(){
        //Arrange
        Room room = new Room(3,20);
        room.checkIn();

        //Act
        room.checkIn();

        //Assert
        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());
    }

    @Test
    public void checkIn_DirtyRoom_UnoccupiedAndDirty(){
        //Arrange
        Room room = new Room(3,20);
        room.checkIn();
        room.checkOut();

        //Act
        room.checkIn();

        //Assert
        assertFalse(room.isOccupied());
        assertTrue(room.isDirty());
    }

    @Test
    public void checkOut_OccupiedRoom_UnoccupiedAndDirty(){
        //Arrange
        Room room = new Room(3,20);
        room.checkIn();

        //Act
        room.checkOut();

        //Assert
        assertFalse(room.isOccupied());
        assertTrue(room.isDirty());
    }

    @Test
    public void cleanRoom_UsedRoom_UnoccupiedAndNotDirty(){
        //Arrange
        Room room = new Room(3,20);
        room.checkIn();
        room.checkOut();

        //Act
        room.cleanRoom();

        //Assert
        assertFalse(room.isOccupied());
        assertFalse(room.isDirty());
    }

    @Test
    public void cleanRoom_OccupiedRoom_OccupiedAndDirty(){
        //Arrange
        Room room = new Room(3,20);
        room.checkIn();

        //Act
        room.cleanRoom();

        //Assert
        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());
    }

}