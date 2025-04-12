/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer;

public final class AFLogger$LogLevel
extends Enum {
    public static final /* enum */ AFLogger$LogLevel DEBUG;
    public static final /* enum */ AFLogger$LogLevel ERROR;
    public static final /* enum */ AFLogger$LogLevel INFO;
    public static final /* enum */ AFLogger$LogLevel NONE;
    public static final /* enum */ AFLogger$LogLevel VERBOSE;
    public static final /* enum */ AFLogger$LogLevel WARNING;
    private static final /* synthetic */ AFLogger$LogLevel[] getMediationNetwork;
    private final int level;

    static {
        AFLogger$LogLevel aFLogger$LogLevel;
        AFLogger$LogLevel aFLogger$LogLevel2;
        AFLogger$LogLevel aFLogger$LogLevel3;
        AFLogger$LogLevel aFLogger$LogLevel4;
        AFLogger$LogLevel aFLogger$LogLevel5;
        AFLogger$LogLevel aFLogger$LogLevel6;
        NONE = aFLogger$LogLevel6 = new AFLogger$LogLevel("NONE", 0, 0);
        int n3 = 1;
        ERROR = aFLogger$LogLevel5 = new AFLogger$LogLevel("ERROR", n3, n3);
        int n4 = 2;
        WARNING = aFLogger$LogLevel4 = new AFLogger$LogLevel("WARNING", n4, n4);
        int n7 = 3;
        INFO = aFLogger$LogLevel3 = new AFLogger$LogLevel("INFO", n7, n7);
        int n8 = 4;
        DEBUG = aFLogger$LogLevel2 = new AFLogger$LogLevel("DEBUG", n8, n8);
        int n10 = 5;
        VERBOSE = aFLogger$LogLevel = new AFLogger$LogLevel("VERBOSE", n10, n10);
        AFLogger$LogLevel[] aFLogger$LogLevelArray = new AFLogger$LogLevel[6];
        aFLogger$LogLevelArray[0] = aFLogger$LogLevel6;
        aFLogger$LogLevelArray[n3] = aFLogger$LogLevel5;
        aFLogger$LogLevelArray[n4] = aFLogger$LogLevel4;
        aFLogger$LogLevelArray[n7] = aFLogger$LogLevel3;
        aFLogger$LogLevelArray[n8] = aFLogger$LogLevel2;
        aFLogger$LogLevelArray[n10] = aFLogger$LogLevel;
        getMediationNetwork = aFLogger$LogLevelArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private AFLogger$LogLevel() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.level = var3_2;
    }

    public static AFLogger$LogLevel valueOf(String string2) {
        return Enum.valueOf(AFLogger$LogLevel.class, string2);
    }

    public static AFLogger$LogLevel[] values() {
        return (AFLogger$LogLevel[])getMediationNetwork.clone();
    }

    public final int getLevel() {
        return this.level;
    }
}

