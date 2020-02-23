package com.company;

/*

0924 Scary Tale
1. There are five classes: little red riding hood, grandmother, pie, lumberjack, wolf.
2. Each class has 2 fields: killed (killed ArrayList) and eaten (ate ArrayList).
3. Necessary objects are created (hood, grandmother, ...).
4. Make the right connections, who ate and killed whom, so that the logic of the fairy tale “Little Red Riding Hood” turns out.
PS: nobody ate pies. They were only carried. The wolf ate a bit. And then they killed him.

Requirements:
1. The main method should change the state (internal variables) of the wolf wolf object.
2. The main method should change the state (internal variables) of the woodman lumberjack object.
3. Nobody ate pies.
4. The wolf ate a little.
5. And then the wolf was killed.

 */

import java.io.*;
import java.lang.reflect.Array;
import java.net.URISyntaxException;
import java.nio.file.FileSystemException;
import java.nio.file.attribute.AclFileAttributeView;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {
    public static LittleRedRidingHood hood = new LittleRedRidingHood();
    public static Grandmother grandmother = new Grandmother();
    public static Patty patty = new Patty();
    public static Woodman woodman = new Woodman();
    public static Wolf wolf = new Wolf();
    public static void main(String[] args) throws Exception {
        wolf.ate.add(grandmother);
        wolf.ate.add(hood);
        woodman.killed.add(wolf);
    }
    public static class LittleRedRidingHood extends StoryItem {}
    public static class Grandmother extends StoryItem {}
    public static class Patty extends StoryItem {}
    public static class Woodman extends StoryItem {}
    public static class Wolf extends StoryItem {}

    public static abstract class StoryItem {
        public ArrayList<StoryItem> killed = new ArrayList<StoryItem>();
        public ArrayList<StoryItem> ate = new ArrayList<StoryItem>();

    }

}







