/*
 * Decompiled with CFR 0.152.
 */
package kotlin.io;

public final class FileWalkDirection
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ FileWalkDirection[] $VALUES;
    public static final /* enum */ FileWalkDirection BOTTOM_UP;
    public static final /* enum */ FileWalkDirection TOP_DOWN;

    private static final /* synthetic */ FileWalkDirection[] $values() {
        FileWalkDirection fileWalkDirection = TOP_DOWN;
        fileWalkDirection = BOTTOM_UP;
        FileWalkDirection[] fileWalkDirectionArray = new FileWalkDirection[]{fileWalkDirection, fileWalkDirection};
        return fileWalkDirectionArray;
    }

    static {
        Enum[] enumArray = new FileWalkDirection("TOP_DOWN", 0);
        TOP_DOWN = enumArray;
        enumArray = new FileWalkDirection("BOTTOM_UP", 1);
        BOTTOM_UP = enumArray;
        enumArray = FileWalkDirection.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private FileWalkDirection() {
        void var2_-1;
        void var1_-1;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static FileWalkDirection valueOf(String string2) {
        return Enum.valueOf(FileWalkDirection.class, string2);
    }

    public static FileWalkDirection[] values() {
        return (FileWalkDirection[])$VALUES.clone();
    }
}

