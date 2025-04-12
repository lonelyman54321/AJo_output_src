/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap$Config
 */
import android.graphics.Bitmap;

public final class dz3$a {
    public static final /* synthetic */ int[] a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        Bitmap.Config config;
        int n7 = Bitmap.Config.values().length;
        int[] nArray = new int[n7];
        a = nArray;
        try {
            config = Bitmap.Config.ALPHA_8;
            n4 = config.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            config = Bitmap.Config.RGB_565;
            n4 = config.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            config = Bitmap.Config.ARGB_4444;
            n4 = config.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            config = Jh.a();
            n4 = config.ordinal();
            nArray[n4] = n3 = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = a;
            config = Bitmap.Config.ARGB_8888;
            n4 = config.ordinal();
            nArray[n4] = n3 = 5;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

