/*
 * Decompiled with CFR 0.152.
 */
public final class NI3$a {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;
    public static final /* synthetic */ int[] $EnumSwitchMapping$2;
    public static final /* synthetic */ int[] $EnumSwitchMapping$3;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        Enum enum_;
        int n4;
        int n7;
        int n8;
        Enum enum_2;
        int n10;
        int n14 = hI3$b.values().length;
        int[] nArray = new int[n14];
        int n15 = 1;
        try {
            hI3$b hI3$b = hI3$b.ENQUEUED;
            n10 = hI3$b.ordinal();
            nArray[n10] = n15;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n10 = 2;
        try {
            enum_2 = hI3$b.RUNNING;
            n8 = enum_2.ordinal();
            nArray[n8] = n10;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n8 = 3;
        try {
            hI3$b hI3$b = hI3$b.SUCCEEDED;
            n7 = hI3$b.ordinal();
            nArray[n7] = n8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n7 = 4;
        try {
            hI3$b hI3$b = hI3$b.FAILED;
            n4 = hI3$b.ordinal();
            nArray[n4] = n7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n4 = 5;
        try {
            enum_ = hI3$b.BLOCKED;
            n3 = enum_.ordinal();
            nArray[n3] = n4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            int n16;
            enum_ = hI3$b.CANCELLED;
            n3 = enum_.ordinal();
            nArray[n3] = n16 = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
        n14 = Au.values().length;
        nArray = new int[n14];
        try {
            enum_ = Au.EXPONENTIAL;
            n3 = enum_.ordinal();
            nArray[n3] = n15;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            enum_ = Au.LINEAR;
            n3 = enum_.ordinal();
            nArray[n3] = n10;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$1 = nArray;
        n14 = lV1.values().length;
        nArray = new int[n14];
        try {
            enum_ = lV1.NOT_REQUIRED;
            n3 = enum_.ordinal();
            nArray[n3] = n15;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            enum_ = lV1.CONNECTED;
            n3 = enum_.ordinal();
            nArray[n3] = n10;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            enum_ = lV1.UNMETERED;
            n3 = enum_.ordinal();
            nArray[n3] = n8;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            enum_2 = lV1.NOT_ROAMING;
            n8 = enum_2.ordinal();
            nArray[n8] = n7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            enum_2 = lV1.METERED;
            n8 = enum_2.ordinal();
            nArray[n8] = n4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$2 = nArray;
        n14 = sg2.values().length;
        nArray = new int[n14];
        try {
            enum_2 = sg2.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
            n8 = enum_2.ordinal();
            nArray[n8] = n15;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            sg2 sg22 = sg2.DROP_WORK_REQUEST;
            n15 = sg22.ordinal();
            nArray[n15] = n10;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$3 = nArray;
    }
}

