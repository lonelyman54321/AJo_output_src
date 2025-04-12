/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.io;

public final class FileWriteMode
extends Enum {
    private static final /* synthetic */ FileWriteMode[] $VALUES;
    public static final /* enum */ FileWriteMode APPEND;

    private static /* synthetic */ FileWriteMode[] $values() {
        FileWriteMode fileWriteMode = APPEND;
        FileWriteMode[] fileWriteModeArray = new FileWriteMode[]{fileWriteMode};
        return fileWriteModeArray;
    }

    static {
        FileWriteMode fileWriteMode;
        APPEND = fileWriteMode = new FileWriteMode("APPEND", 0);
        $VALUES = FileWriteMode.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private FileWriteMode() {
        void var2_-1;
        void var1_-1;
    }

    public static FileWriteMode valueOf(String string2) {
        return Enum.valueOf(FileWriteMode.class, string2);
    }

    public static FileWriteMode[] values() {
        return (FileWriteMode[])$VALUES.clone();
    }
}

