/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

public final class IntCompanionObject {
    public static final IntCompanionObject INSTANCE;
    public static final int MAX_VALUE = Integer.MAX_VALUE;
    public static final int MIN_VALUE = Integer.MIN_VALUE;
    public static final int SIZE_BITS = 32;
    public static final int SIZE_BYTES = 4;

    static {
        IntCompanionObject intCompanionObject;
        INSTANCE = intCompanionObject = new IntCompanionObject();
    }

    private IntCompanionObject() {
    }

    public static /* synthetic */ void getSIZE_BITS$annotations() {
    }

    public static /* synthetic */ void getSIZE_BYTES$annotations() {
    }
}

