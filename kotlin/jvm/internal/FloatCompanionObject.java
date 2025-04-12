/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

public final class FloatCompanionObject {
    public static final FloatCompanionObject INSTANCE;
    public static final float MAX_VALUE = Float.MAX_VALUE;
    public static final float MIN_VALUE = Float.MIN_VALUE;
    public static final float NEGATIVE_INFINITY = Float.NEGATIVE_INFINITY;
    public static final float NaN = Float.NaN;
    public static final float POSITIVE_INFINITY = Float.POSITIVE_INFINITY;
    public static final int SIZE_BITS = 32;
    public static final int SIZE_BYTES = 4;

    static {
        FloatCompanionObject floatCompanionObject;
        INSTANCE = floatCompanionObject = new FloatCompanionObject();
    }

    private FloatCompanionObject() {
    }

    public static /* synthetic */ void getMAX_VALUE$annotations() {
    }

    public static /* synthetic */ void getMIN_VALUE$annotations() {
    }

    public static /* synthetic */ void getNEGATIVE_INFINITY$annotations() {
    }

    public static /* synthetic */ void getNaN$annotations() {
    }

    public static /* synthetic */ void getPOSITIVE_INFINITY$annotations() {
    }

    public static /* synthetic */ void getSIZE_BITS$annotations() {
    }

    public static /* synthetic */ void getSIZE_BYTES$annotations() {
    }

    public final float getMAX_VALUE() {
        return Float.MAX_VALUE;
    }

    public final float getMIN_VALUE() {
        return Float.MIN_VALUE;
    }

    public final float getNEGATIVE_INFINITY() {
        return -1.0f / 0.0f;
    }

    public final float getNaN() {
        return 0.0f / 0.0f;
    }

    public final float getPOSITIVE_INFINITY() {
        return 1.0f / 0.0f;
    }
}

