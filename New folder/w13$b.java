/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Paint$Join
 */
import android.graphics.Paint;

public final class w13$b
extends Enum {
    private static final /* synthetic */ w13$b[] $VALUES;
    public static final /* enum */ w13$b BEVEL;
    public static final /* enum */ w13$b MITER;
    public static final /* enum */ w13$b ROUND;

    private static /* synthetic */ w13$b[] $values() {
        w13$b w13$b = MITER;
        w13$b = ROUND;
        w13$b = BEVEL;
        w13$b[] w13$bArray = new w13$b[]{w13$b, w13$b, w13$b};
        return w13$bArray;
    }

    static {
        w13$b w13$b;
        MITER = w13$b = new w13$b("MITER", 0);
        ROUND = w13$b = new w13$b("ROUND", 1);
        BEVEL = w13$b = new w13$b("BEVEL", 2);
        $VALUES = w13$b.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private w13$b() {
        void var2_-1;
        void var1_-1;
    }

    public static w13$b valueOf(String string2) {
        return Enum.valueOf(w13$b.class, string2);
    }

    public static w13$b[] values() {
        return (w13$b[])$VALUES.clone();
    }

    public Paint.Join toPaintJoin() {
        int n3 = this.ordinal();
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                n4 = 2;
                if (n3 != n4) {
                    return null;
                }
                return Paint.Join.BEVEL;
            }
            return Paint.Join.ROUND;
        }
        return Paint.Join.MITER;
    }
}

