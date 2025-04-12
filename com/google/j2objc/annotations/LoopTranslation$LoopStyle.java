/*
 * Decompiled with CFR 0.152.
 */
package com.google.j2objc.annotations;

public final class LoopTranslation$LoopStyle
extends Enum {
    private static final /* synthetic */ LoopTranslation$LoopStyle[] $VALUES;
    public static final /* enum */ LoopTranslation$LoopStyle FAST_ENUMERATION;
    public static final /* enum */ LoopTranslation$LoopStyle JAVA_ITERATOR;

    private static /* synthetic */ LoopTranslation$LoopStyle[] $values() {
        LoopTranslation$LoopStyle loopTranslation$LoopStyle = JAVA_ITERATOR;
        loopTranslation$LoopStyle = FAST_ENUMERATION;
        LoopTranslation$LoopStyle[] loopTranslation$LoopStyleArray = new LoopTranslation$LoopStyle[]{loopTranslation$LoopStyle, loopTranslation$LoopStyle};
        return loopTranslation$LoopStyleArray;
    }

    static {
        LoopTranslation$LoopStyle loopTranslation$LoopStyle;
        JAVA_ITERATOR = loopTranslation$LoopStyle = new LoopTranslation$LoopStyle("JAVA_ITERATOR", 0);
        FAST_ENUMERATION = loopTranslation$LoopStyle = new LoopTranslation$LoopStyle("FAST_ENUMERATION", 1);
        $VALUES = LoopTranslation$LoopStyle.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private LoopTranslation$LoopStyle() {
        void var2_-1;
        void var1_-1;
    }

    public static LoopTranslation$LoopStyle valueOf(String string2) {
        return Enum.valueOf(LoopTranslation$LoopStyle.class, string2);
    }

    public static LoopTranslation$LoopStyle[] values() {
        return (LoopTranslation$LoopStyle[])$VALUES.clone();
    }
}

