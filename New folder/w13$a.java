/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Paint$Cap
 */
import android.graphics.Paint;

public final class w13$a
extends Enum {
    private static final /* synthetic */ w13$a[] $VALUES;
    public static final /* enum */ w13$a BUTT;
    public static final /* enum */ w13$a ROUND;
    public static final /* enum */ w13$a UNKNOWN;

    private static /* synthetic */ w13$a[] $values() {
        w13$a w13$a = BUTT;
        w13$a = ROUND;
        w13$a = UNKNOWN;
        w13$a[] w13$aArray = new w13$a[]{w13$a, w13$a, w13$a};
        return w13$aArray;
    }

    static {
        w13$a w13$a;
        BUTT = w13$a = new w13$a("BUTT", 0);
        ROUND = w13$a = new w13$a("ROUND", 1);
        UNKNOWN = w13$a = new w13$a("UNKNOWN", 2);
        $VALUES = w13$a.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private w13$a() {
        void var2_-1;
        void var1_-1;
    }

    public static w13$a valueOf(String string2) {
        return Enum.valueOf(w13$a.class, string2);
    }

    public static w13$a[] values() {
        return (w13$a[])$VALUES.clone();
    }

    public Paint.Cap toPaintCap() {
        int n3 = this.ordinal();
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                return Paint.Cap.SQUARE;
            }
            return Paint.Cap.ROUND;
        }
        return Paint.Cap.BUTT;
    }
}

