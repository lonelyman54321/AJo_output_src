/*
 * Decompiled with CFR 0.152.
 */
package androidx.datastore.preferences.protobuf;

public final class f$a {
    public static final /* synthetic */ int[] a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        wH3 wH32;
        int n7 = wH3.values().length;
        int[] nArray = new int[n7];
        a = nArray;
        try {
            wH32 = wH3.BOOL;
            n4 = wH32.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            wH32 = wH3.BYTES;
            n4 = wH32.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            wH32 = wH3.DOUBLE;
            n4 = wH32.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            wH32 = wH3.ENUM;
            n4 = wH32.ordinal();
            nArray[n4] = n3 = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            wH32 = wH3.FIXED32;
            n4 = wH32.ordinal();
            nArray[n4] = n3 = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            wH32 = wH3.FIXED64;
            n4 = wH32.ordinal();
            nArray[n4] = n3 = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            wH32 = wH3.FLOAT;
            n4 = wH32.ordinal();
            nArray[n4] = n3 = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            wH32 = wH3.INT32;
            n4 = wH32.ordinal();
            nArray[n4] = n3 = 8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            wH32 = wH3.INT64;
            n4 = wH32.ordinal();
            nArray[n4] = n3 = 9;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            wH32 = wH3.MESSAGE;
            n4 = wH32.ordinal();
            nArray[n4] = n3 = 10;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            wH32 = wH3.SFIXED32;
            n4 = wH32.ordinal();
            nArray[n4] = n3 = 11;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            wH32 = wH3.SFIXED64;
            n4 = wH32.ordinal();
            nArray[n4] = n3 = 12;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            wH32 = wH3.SINT32;
            n4 = wH32.ordinal();
            nArray[n4] = n3 = 13;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            wH32 = wH3.SINT64;
            n4 = wH32.ordinal();
            nArray[n4] = n3 = 14;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            wH32 = wH3.STRING;
            n4 = wH32.ordinal();
            nArray[n4] = n3 = 15;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            wH32 = wH3.UINT32;
            n4 = wH32.ordinal();
            nArray[n4] = n3 = 16;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            wH32 = wH3.UINT64;
            n4 = wH32.ordinal();
            nArray[n4] = n3 = 17;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

