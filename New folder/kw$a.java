/*
 * Decompiled with CFR 0.152.
 */
public final class kw$a {
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
        Enum enum_;
        int n4;
        Object object2;
        int n7;
        Object object3;
        int n8;
        Object object4;
        int n10 = kH1$a.values().length;
        int[] nArray = new int[n10];
        b = nArray;
        int n14 = 1;
        try {
            object4 = kH1$a.MASK_MODE_NONE;
            n8 = object4.ordinal();
            nArray[n8] = n14;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n10 = 2;
        try {
            object4 = b;
            object3 = kH1$a.MASK_MODE_SUBTRACT;
            n7 = object3.ordinal();
            object4[n7] = (kH1$a)n10;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n8 = 3;
        try {
            object3 = b;
            object2 = kH1$a.MASK_MODE_INTERSECT;
            n4 = ((Enum)object2).ordinal();
            object3[n4] = (kH1$a)n8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n7 = 4;
        try {
            object2 = b;
            enum_ = kH1$a.MASK_MODE_ADD;
            n3 = enum_.ordinal();
            object2[n3] = (kH1$a)n7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n4 = pp1$a.values().length;
        object2 = new int[n4];
        a = (int[])object2;
        try {
            enum_ = pp1$a.SHAPE;
            n3 = enum_.ordinal();
            object2[n3] = (kH1$a)n14;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object = a;
            object2 = pp1$a.PRE_COMP;
            n4 = ((Enum)object2).ordinal();
            object[n4] = n10;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            object = (Object)pp1$a.SOLID;
            n14 = ((Enum)object).ordinal();
            nArray[n14] = n8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            object = pp1$a.IMAGE;
            n14 = ((Enum)object).ordinal();
            nArray[n14] = n7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            object = pp1$a.NULL;
            n14 = ((Enum)object).ordinal();
            nArray[n14] = n8 = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            object = pp1$a.TEXT;
            n14 = ((Enum)object).ordinal();
            nArray[n14] = n8 = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            object = pp1$a.UNKNOWN;
            n14 = ((Enum)object).ordinal();
            nArray[n14] = n8 = 7;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

