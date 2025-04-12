/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/*
 * Renamed from Je3
 */
public class je3_2
extends ie3_2 {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Double d(String string2) {
        Regex regex;
        Intrinsics.checkNotNullParameter(string2, "<this>");
        Double d2 = null;
        try {
            regex = xt2_2.b;
        }
        catch (NumberFormatException numberFormatException) {
            return d2;
        }
        boolean bl2 = regex.c(string2);
        if (!bl2) return d2;
        double d5 = Double.parseDouble(string2);
        return d5;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Float e(String string2) {
        Regex regex;
        Intrinsics.checkNotNullParameter(string2, "<this>");
        Float f5 = null;
        try {
            regex = xt2_2.b;
        }
        catch (NumberFormatException numberFormatException) {
            return f5;
        }
        boolean bl2 = regex.c(string2);
        if (!bl2) return f5;
        float f6 = Float.parseFloat(string2);
        return Float.valueOf(f6);
    }
}

