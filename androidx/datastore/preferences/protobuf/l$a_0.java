/*
 * Decompiled with CFR 0.152.
 */
package androidx.datastore.preferences.protobuf;

/*
 * Renamed from androidx.datastore.preferences.protobuf.l$a
 */
public final class l$a_0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        Object object;
        int n3;
        int n4;
        Enum enum_;
        int n7;
        Object object2;
        int n8;
        Object object3;
        int n10;
        Object object4;
        int n14;
        Object object5;
        int n15;
        Object object6;
        int n16;
        Object object7;
        int n17;
        Object object8;
        int n18;
        Object object9;
        int n19 = wH3.values().length;
        int[] nArray = new int[n19];
        b = nArray;
        int n20 = 1;
        try {
            object9 = wH3.DOUBLE;
            n18 = object9.ordinal();
            nArray[n18] = n20;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n19 = 2;
        try {
            object9 = b;
            object8 = wH3.FLOAT;
            n17 = object8.ordinal();
            object9[n17] = (wH3)n19;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n18 = 3;
        try {
            object8 = b;
            object7 = wH3.INT64;
            n16 = object7.ordinal();
            object8[n16] = (wH3)n18;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n17 = 4;
        try {
            object7 = b;
            object6 = wH3.UINT64;
            n15 = object6.ordinal();
            object7[n15] = (wH3)n17;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n16 = 5;
        try {
            object6 = b;
            object5 = wH3.INT32;
            n14 = object5.ordinal();
            object6[n14] = (wH3)n16;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n15 = 6;
        try {
            object5 = b;
            object4 = wH3.FIXED64;
            n10 = object4.ordinal();
            object5[n10] = (wH3)n15;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n14 = 7;
        try {
            object4 = b;
            object3 = wH3.FIXED32;
            n8 = object3.ordinal();
            object4[n8] = (wH3)n14;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n10 = 8;
        try {
            object3 = b;
            object2 = wH3.BOOL;
            n7 = ((Enum)object2).ordinal();
            object3[n7] = (wH3)n10;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n8 = 9;
        try {
            object2 = b;
            enum_ = wH3.GROUP;
            n4 = enum_.ordinal();
            object2[n4] = (wH3)n8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object2 = b;
            enum_ = wH3.MESSAGE;
            n4 = enum_.ordinal();
            n3 = 10;
            object2[n4] = (wH3)n3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object2 = b;
            enum_ = wH3.STRING;
            n4 = enum_.ordinal();
            n3 = 11;
            object2[n4] = (wH3)n3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object2 = b;
            enum_ = wH3.BYTES;
            n4 = enum_.ordinal();
            n3 = 12;
            object2[n4] = (wH3)n3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object2 = b;
            enum_ = wH3.UINT32;
            n4 = enum_.ordinal();
            n3 = 13;
            object2[n4] = (wH3)n3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object2 = b;
            enum_ = wH3.SFIXED32;
            n4 = enum_.ordinal();
            n3 = 14;
            object2[n4] = (wH3)n3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object2 = b;
            enum_ = wH3.SFIXED64;
            n4 = enum_.ordinal();
            n3 = 15;
            object2[n4] = (wH3)n3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object2 = b;
            enum_ = wH3.SINT32;
            n4 = enum_.ordinal();
            n3 = 16;
            object2[n4] = (wH3)n3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object2 = b;
            enum_ = wH3.SINT64;
            n4 = enum_.ordinal();
            n3 = 17;
            object2[n4] = (wH3)n3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object2 = b;
            enum_ = wH3.ENUM;
            n4 = enum_.ordinal();
            n3 = 18;
            object2[n4] = (wH3)n3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n7 = xH3.values().length;
        object2 = new int[n7];
        a = (int[])object2;
        try {
            enum_ = xH3.INT;
            n4 = enum_.ordinal();
            object2[n4] = (wH3)n20;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object = a;
            object2 = xH3.LONG;
            n7 = ((Enum)object2).ordinal();
            object[n7] = n19;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            object = (Object)xH3.FLOAT;
            n20 = ((Enum)object).ordinal();
            nArray[n20] = n18;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            object = xH3.DOUBLE;
            n20 = ((Enum)object).ordinal();
            nArray[n20] = n17;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            object = xH3.BOOLEAN;
            n20 = ((Enum)object).ordinal();
            nArray[n20] = n16;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            object = xH3.STRING;
            n20 = ((Enum)object).ordinal();
            nArray[n20] = n15;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            object = xH3.BYTE_STRING;
            n20 = ((Enum)object).ordinal();
            nArray[n20] = n14;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            object = xH3.ENUM;
            n20 = ((Enum)object).ordinal();
            nArray[n20] = n10;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            object = xH3.MESSAGE;
            n20 = ((Enum)object).ordinal();
            nArray[n20] = n8;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

