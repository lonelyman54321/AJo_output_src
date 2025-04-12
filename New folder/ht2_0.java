/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Color
 *  android.graphics.Typeface
 */
import android.graphics.Color;
import android.graphics.Typeface;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ht2
 */
public final class ht2_0
implements et2_0 {
    public static Typeface b(String string2, tv0_0 tv0_02, int n3) {
        tv0_0 tv0_03;
        int n4 = nV0.a(n3, 0);
        if (n4 != 0 && (n4 = Intrinsics.areEqual(tv0_02, tv0_03 = tv0_0.m)) != 0 && (string2 == null || (n4 = string2.length()) == 0)) {
            return Typeface.DEFAULT;
        }
        string2 = string2 == null ? Typeface.DEFAULT : Typeface.create((String)string2, (int)0);
        int n7 = tv0_02.a;
        n3 = (int)(nV0.a(n3, 1) ? 1 : 0);
        return gt2_0.a((Typeface)string2, n7, n3 != 0);
    }

    public static String d(int n3) {
        Integer n4 = Color.red((int)n3);
        Integer n7 = Color.green((int)n3);
        Integer n8 = Color.blue((int)n3);
        Double d2 = (double)Color.alpha((int)n3) / 255.0;
        Object[] objectArray = new Object[]{n4, n7, n8, d2};
        n3 = gz3.a;
        return String.format(Locale.US, "rgba(%d,%d,%d,%.3f)", objectArray);
    }

    public static final double e(long l2) {
        double d2 = l2 >>> 11;
        double d5 = 2048;
        double d7 = l2 & 0x7FFL;
        return (d2 *= d5) + d7;
    }

    public Typeface a(tv0_0 tv0_02, int n3) {
        return ht2_0.b(null, tv0_02, n3);
    }

    public Typeface c(gz0_1 gz0_12, tv0_0 tv0_02, int n3) {
        return ht2_0.b(gz0_12.f, tv0_02, n3);
    }
}

