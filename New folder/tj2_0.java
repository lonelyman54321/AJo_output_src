/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.analytics.AnalyticsManager$Companion;

/*
 * Renamed from tJ2
 */
public final class tj2_0 {
    public static int a(int n3, int n4, int n7, int n8) {
        return n3 | n4 | n7 | 0x80 | n8;
    }

    public static int b(int n3) {
        return n3 & 0x180;
    }

    public static int c(int n3) {
        return n3 & 0x40;
    }

    public static boolean d(int n3, boolean n4) {
        int n7 = 4;
        n3 = (n3 &= 7) != n7 && (n4 == 0 || n3 != (n4 = 3)) ? 0 : 1;
        return n3 != 0;
    }

    public static void e(AnalyticsManager$Companion analyticsManager$Companion, String string2, String string3, String string4) {
        analyticsManager$Companion.getInstance().getGtmEvents().pushButtonTapEvent(string2, string3, string4);
    }
}

