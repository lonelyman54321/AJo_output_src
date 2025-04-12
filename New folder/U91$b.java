/*
 * Decompiled with CFR 0.152.
 */
public final class U91$b {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        U91$a u91$a;
        int n7 = U91$a.values().length;
        int[] nArray = new int[n7];
        try {
            u91$a = U91$a.DOWNLOAD_NOTIFICATION_BITMAP;
            n4 = u91$a.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            u91$a = U91$a.DOWNLOAD_GZIP_NOTIFICATION_BITMAP_WITH_TIME_LIMIT;
            n4 = u91$a.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            u91$a = U91$a.DOWNLOAD_SIZE_CONSTRAINED_GZIP_NOTIFICATION_BITMAP;
            n4 = u91$a.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            u91$a = U91$a.DOWNLOAD_SIZE_CONSTRAINED_GZIP_NOTIFICATION_BITMAP_WITH_TIME_LIMIT;
            n4 = u91$a.ordinal();
            nArray[n4] = n3 = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            u91$a = U91$a.DOWNLOAD_INAPP_BITMAP;
            n4 = u91$a.ordinal();
            nArray[n4] = n3 = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            u91$a = U91$a.DOWNLOAD_ANY_BITMAP;
            n4 = u91$a.ordinal();
            nArray[n4] = n3 = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            u91$a = U91$a.DOWNLOAD_BYTES;
            n4 = u91$a.ordinal();
            nArray[n4] = n3 = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

