/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.text.TextDirectionHeuristic
 *  android.text.TextDirectionHeuristics
 */
import android.graphics.Canvas;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;

public final class Wl3 {
    public static final Ej3 a;
    public static final long b;

    static {
        Ej3 ej3;
        a = ej3 = new Canvas();
        long l2 = 0;
        long l3 = l2 << 32;
        b = l2 & 0xFFFFFFFFL | l3;
    }

    public static final TextDirectionHeuristic a(int n3) {
        int n4;
        TextDirectionHeuristic textDirectionHeuristic = n3 != 0 ? (n3 != (n4 = 1) ? (n3 != (n4 = 2) ? (n3 != (n4 = 3) ? (n3 != (n4 = 4) ? (n3 != (n4 = 5) ? TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.LOCALE) : TextDirectionHeuristics.ANYRTL_LTR) : TextDirectionHeuristics.FIRSTSTRONG_RTL) : TextDirectionHeuristics.FIRSTSTRONG_LTR) : TextDirectionHeuristics.RTL) : TextDirectionHeuristics.LTR;
        return textDirectionHeuristic;
    }
}

