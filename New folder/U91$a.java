/*
 * Decompiled with CFR 0.152.
 */
public final class U91$a
extends Enum {
    private static final /* synthetic */ U91$a[] $VALUES;
    public static final /* enum */ U91$a DOWNLOAD_ANY_BITMAP;
    public static final /* enum */ U91$a DOWNLOAD_BYTES;
    public static final /* enum */ U91$a DOWNLOAD_GZIP_NOTIFICATION_BITMAP_WITH_TIME_LIMIT;
    public static final /* enum */ U91$a DOWNLOAD_INAPP_BITMAP;
    public static final /* enum */ U91$a DOWNLOAD_NOTIFICATION_BITMAP;
    public static final /* enum */ U91$a DOWNLOAD_SIZE_CONSTRAINED_GZIP_NOTIFICATION_BITMAP;
    public static final /* enum */ U91$a DOWNLOAD_SIZE_CONSTRAINED_GZIP_NOTIFICATION_BITMAP_WITH_TIME_LIMIT;

    private static final /* synthetic */ U91$a[] $values() {
        U91$a u91$a = DOWNLOAD_NOTIFICATION_BITMAP;
        u91$a = DOWNLOAD_GZIP_NOTIFICATION_BITMAP_WITH_TIME_LIMIT;
        u91$a = DOWNLOAD_SIZE_CONSTRAINED_GZIP_NOTIFICATION_BITMAP;
        u91$a = DOWNLOAD_SIZE_CONSTRAINED_GZIP_NOTIFICATION_BITMAP_WITH_TIME_LIMIT;
        u91$a = DOWNLOAD_INAPP_BITMAP;
        u91$a = DOWNLOAD_ANY_BITMAP;
        u91$a = DOWNLOAD_BYTES;
        U91$a[] u91$aArray = new U91$a[]{u91$a, u91$a, u91$a, u91$a, u91$a, u91$a, u91$a};
        return u91$aArray;
    }

    static {
        U91$a u91$a;
        DOWNLOAD_NOTIFICATION_BITMAP = u91$a = new U91$a("DOWNLOAD_NOTIFICATION_BITMAP", 0);
        DOWNLOAD_GZIP_NOTIFICATION_BITMAP_WITH_TIME_LIMIT = u91$a = new U91$a("DOWNLOAD_GZIP_NOTIFICATION_BITMAP_WITH_TIME_LIMIT", 1);
        DOWNLOAD_SIZE_CONSTRAINED_GZIP_NOTIFICATION_BITMAP = u91$a = new U91$a("DOWNLOAD_SIZE_CONSTRAINED_GZIP_NOTIFICATION_BITMAP", 2);
        DOWNLOAD_SIZE_CONSTRAINED_GZIP_NOTIFICATION_BITMAP_WITH_TIME_LIMIT = u91$a = new U91$a("DOWNLOAD_SIZE_CONSTRAINED_GZIP_NOTIFICATION_BITMAP_WITH_TIME_LIMIT", 3);
        DOWNLOAD_INAPP_BITMAP = u91$a = new U91$a("DOWNLOAD_INAPP_BITMAP", 4);
        DOWNLOAD_ANY_BITMAP = u91$a = new U91$a("DOWNLOAD_ANY_BITMAP", 5);
        DOWNLOAD_BYTES = u91$a = new U91$a("DOWNLOAD_BYTES", 6);
        $VALUES = U91$a.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private U91$a() {
        void var2_-1;
        void var1_-1;
    }

    public static U91$a valueOf(String string2) {
        return Enum.valueOf(U91$a.class, string2);
    }

    public static U91$a[] values() {
        return (U91$a[])$VALUES.clone();
    }
}

