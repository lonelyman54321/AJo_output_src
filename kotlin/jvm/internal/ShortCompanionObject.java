/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

public final class ShortCompanionObject {
    public static final ShortCompanionObject INSTANCE;
    public static final short MAX_VALUE = Short.MAX_VALUE;
    public static final short MIN_VALUE = Short.MIN_VALUE;
    public static final int SIZE_BITS = 16;
    public static final int SIZE_BYTES = 2;

    static {
        ShortCompanionObject shortCompanionObject;
        INSTANCE = shortCompanionObject = new ShortCompanionObject();
    }

    private ShortCompanionObject() {
    }

    public static /* synthetic */ void getSIZE_BITS$annotations() {
    }

    public static /* synthetic */ void getSIZE_BYTES$annotations() {
    }
}

