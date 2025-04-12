/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

public final class CharCompanionObject {
    public static final CharCompanionObject INSTANCE;
    public static final char MAX_HIGH_SURROGATE = '\udbff';
    public static final char MAX_LOW_SURROGATE = '\udfff';
    public static final char MAX_SURROGATE = '\udfff';
    public static final char MAX_VALUE = '\uffff';
    public static final char MIN_HIGH_SURROGATE = '\ud800';
    public static final char MIN_LOW_SURROGATE = '\udc00';
    public static final char MIN_SURROGATE = '\ud800';
    public static final char MIN_VALUE = '\u0000';
    public static final int SIZE_BITS = 16;
    public static final int SIZE_BYTES = 2;

    static {
        CharCompanionObject charCompanionObject;
        INSTANCE = charCompanionObject = new CharCompanionObject();
    }

    private CharCompanionObject() {
    }

    public static /* synthetic */ void getMAX_VALUE$annotations() {
    }

    public static /* synthetic */ void getMIN_VALUE$annotations() {
    }

    public static /* synthetic */ void getSIZE_BITS$annotations() {
    }

    public static /* synthetic */ void getSIZE_BYTES$annotations() {
    }
}

