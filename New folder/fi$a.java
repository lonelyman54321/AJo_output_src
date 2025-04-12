/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Paint$Cap
 *  android.graphics.Paint$Join
 *  android.graphics.Paint$Style
 */
import android.graphics.Paint;

public final class fi$a {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;
    public static final /* synthetic */ int[] $EnumSwitchMapping$2;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        Paint.Join join;
        int n3;
        Paint.Cap cap;
        int n4;
        int n7;
        Paint.Style style2;
        int n8 = Paint.Style.values().length;
        int[] nArray = new int[n8];
        int n10 = 1;
        try {
            style2 = Paint.Style.STROKE;
            n7 = style2.ordinal();
            nArray[n7] = n10;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
        n8 = Paint.Cap.values().length;
        nArray = new int[n8];
        try {
            style2 = Paint.Cap.BUTT;
            n7 = style2.ordinal();
            nArray[n7] = n10;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n7 = 2;
        try {
            Paint.Cap cap2 = Paint.Cap.ROUND;
            n4 = cap2.ordinal();
            nArray[n4] = n7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n4 = 3;
        try {
            cap = Paint.Cap.SQUARE;
            n3 = cap.ordinal();
            nArray[n3] = n4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$1 = nArray;
        n8 = Paint.Join.values().length;
        nArray = new int[n8];
        try {
            cap = Paint.Join.MITER;
            n3 = cap.ordinal();
            nArray[n3] = n10;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            join = Paint.Join.BEVEL;
            n10 = join.ordinal();
            nArray[n10] = n7;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            join = Paint.Join.ROUND;
            n10 = join.ordinal();
            nArray[n10] = n4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$2 = nArray;
    }
}

