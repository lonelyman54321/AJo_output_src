/*
 * Decompiled with CFR 0.152.
 */
package com.google.j2objc.annotations;

public final class ReflectionSupport$Level
extends Enum {
    private static final /* synthetic */ ReflectionSupport$Level[] $VALUES;
    public static final /* enum */ ReflectionSupport$Level FULL;
    public static final /* enum */ ReflectionSupport$Level NATIVE_ONLY;

    private static /* synthetic */ ReflectionSupport$Level[] $values() {
        ReflectionSupport$Level reflectionSupport$Level = NATIVE_ONLY;
        reflectionSupport$Level = FULL;
        ReflectionSupport$Level[] reflectionSupport$LevelArray = new ReflectionSupport$Level[]{reflectionSupport$Level, reflectionSupport$Level};
        return reflectionSupport$LevelArray;
    }

    static {
        ReflectionSupport$Level reflectionSupport$Level;
        NATIVE_ONLY = reflectionSupport$Level = new ReflectionSupport$Level("NATIVE_ONLY", 0);
        FULL = reflectionSupport$Level = new ReflectionSupport$Level("FULL", 1);
        $VALUES = ReflectionSupport$Level.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ReflectionSupport$Level() {
        void var2_-1;
        void var1_-1;
    }

    public static ReflectionSupport$Level valueOf(String string2) {
        return Enum.valueOf(ReflectionSupport$Level.class, string2);
    }

    public static ReflectionSupport$Level[] values() {
        return (ReflectionSupport$Level[])$VALUES.clone();
    }
}

