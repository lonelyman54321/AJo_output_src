/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

public final class ByteCompanionObject {
    public static final ByteCompanionObject INSTANCE;
    public static final byte MAX_VALUE = 127;
    public static final byte MIN_VALUE = -128;
    public static final int SIZE_BITS = 8;
    public static final int SIZE_BYTES = 1;

    static {
        ByteCompanionObject byteCompanionObject;
        INSTANCE = byteCompanionObject = new ByteCompanionObject();
    }

    private ByteCompanionObject() {
    }

    public static /* synthetic */ void getSIZE_BITS$annotations() {
    }

    public static /* synthetic */ void getSIZE_BYTES$annotations() {
    }
}

