/*
 * Decompiled with CFR 0.152.
 */
public final class sR2$a {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

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
        int n8 = rR2$E$d.values().length;
        int[] nArray = new int[n8];
        c = nArray;
        int n10 = 1;
        try {
            object3 = rR2$E$d.Miter;
            n7 = object3.ordinal();
            nArray[n7] = n10;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n8 = 2;
        try {
            object3 = c;
            object2 = rR2$E$d.Round;
            n4 = ((Enum)object2).ordinal();
            object3[n4] = (rR2$E$d)n8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n7 = 3;
        try {
            object2 = c;
            enum_ = rR2$E$d.Bevel;
            n3 = enum_.ordinal();
            object2[n3] = (rR2$E$d)n7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n4 = rR2$E$c.values().length;
        object2 = new int[n4];
        b = (int[])object2;
        try {
            enum_ = rR2$E$c.Butt;
            n3 = enum_.ordinal();
            object2[n3] = (rR2$E$d)n10;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object2 = b;
            enum_ = rR2$E$c.Round;
            n3 = enum_.ordinal();
            object2[n3] = (rR2$E$d)n8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object2 = b;
            enum_ = rR2$E$c.Square;
            n3 = enum_.ordinal();
            object2[n3] = (rR2$E$d)n7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n4 = By2$a.values().length;
        object2 = new int[n4];
        a = (int[])object2;
        try {
            enum_ = By2$a.xMidYMin;
            n3 = enum_.ordinal();
            object2[n3] = (rR2$E$d)n10;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            object = a;
            object2 = By2$a.xMidYMid;
            n4 = ((Enum)object2).ordinal();
            object[n4] = n8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            object = (Object)By2$a.xMidYMax;
            n10 = ((Enum)object).ordinal();
            nArray[n10] = n7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            object = By2$a.xMaxYMin;
            n10 = ((Enum)object).ordinal();
            nArray[n10] = n7 = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            object = By2$a.xMaxYMid;
            n10 = ((Enum)object).ordinal();
            nArray[n10] = n7 = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            object = By2$a.xMaxYMax;
            n10 = ((Enum)object).ordinal();
            nArray[n10] = n7 = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            object = By2$a.xMinYMid;
            n10 = ((Enum)object).ordinal();
            nArray[n10] = n7 = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            object = By2$a.xMinYMax;
            n10 = ((Enum)object).ordinal();
            nArray[n10] = n7 = 8;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

