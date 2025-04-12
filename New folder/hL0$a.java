/*
 * Decompiled with CFR 0.152.
 */
public final class hL0$a {
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
        int n8 = Tk1.values().length;
        int[] nArray = new int[n8];
        b = nArray;
        int n10 = 1;
        try {
            object3 = Tk1.BYTE_STRING;
            n7 = object3.ordinal();
            nArray[n7] = n10;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n8 = 2;
        try {
            object3 = b;
            object2 = Tk1.MESSAGE;
            n4 = ((Enum)object2).ordinal();
            object3[n4] = (Tk1)n8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n7 = 3;
        try {
            object2 = b;
            enum_ = Tk1.STRING;
            n3 = enum_.ordinal();
            object2[n3] = (Tk1)n7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n4 = hL0$b.values().length;
        object2 = new int[n4];
        a = (int[])object2;
        try {
            enum_ = hL0$b.MAP;
            n3 = enum_.ordinal();
            object2[n3] = (Tk1)n10;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object = a;
            object2 = hL0$b.VECTOR;
            n4 = ((Enum)object2).ordinal();
            object[n4] = n8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            object = (Object)hL0$b.SCALAR;
            n10 = ((Enum)object).ordinal();
            nArray[n10] = n7;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

