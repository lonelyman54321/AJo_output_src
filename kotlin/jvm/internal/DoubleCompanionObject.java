/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

public final class DoubleCompanionObject {
    public static final DoubleCompanionObject INSTANCE;
    public static final double MAX_VALUE = Double.MAX_VALUE;
    public static final double MIN_VALUE = Double.MIN_VALUE;
    public static final double NEGATIVE_INFINITY = Double.NEGATIVE_INFINITY;
    public static final double NaN = Double.NaN;
    public static final double POSITIVE_INFINITY = Double.POSITIVE_INFINITY;
    public static final int SIZE_BITS = 64;
    public static final int SIZE_BYTES = 8;

    static {
        DoubleCompanionObject doubleCompanionObject;
        INSTANCE = doubleCompanionObject = new DoubleCompanionObject();
    }

    private DoubleCompanionObject() {
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

    public final double getMAX_VALUE() {
        return Double.MAX_VALUE;
    }

    public final double getMIN_VALUE() {
        return Double.MIN_VALUE;
    }

    public final double getNEGATIVE_INFINITY() {
        return -1.0 / 0.0;
    }

    public final double getNaN() {
        return 0.0 / 0.0;
    }

    public final double getPOSITIVE_INFINITY() {
        return 1.0 / 0.0;
    }
}

