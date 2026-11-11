package com.pluralsight;

import org.junit.jupiter.api.Test;

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



}