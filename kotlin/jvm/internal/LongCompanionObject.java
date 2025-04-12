/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

public final class LongCompanionObject {
    public static final LongCompanionObject INSTANCE;
    public static final long MAX_VALUE = Long.MAX_VALUE;
    public static final long MIN_VALUE = Long.MIN_VALUE;
    public static final int SIZE_BITS = 64;
    public static final int SIZE_BYTES = 8;

    static {
        LongCompanionObject longCompanionObject;
        INSTANCE = longCompanionObject = new LongCompanionObject();
    }

    private LongCompanionObject() {
    }

    public static /* synthetic */ void getSIZE_BITS$annotations() {
    }

    public static /* synthetic */ void getSIZE_BYTES$annotations() {
    }
}

