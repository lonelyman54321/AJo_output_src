/*
 * Decompiled with CFR 0.152.
 */
import kotlin.NoWhenBranchMatchedException;

/*
 * Renamed from cj0
 */
public final class cj0_0 {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final double a(int n3, int n4, int n7, int n8, WS2 wS2) {
        double d2 = n7;
        double d5 = n3;
        d2 /= d5;
        double d7 = n8;
        double d9 = n4;
        d7 /= d9;
        int[] nArray = cj0$a.$EnumSwitchMapping$0;
        n4 = wS2.ordinal();
        n3 = nArray[n4];
        if (n3 == (n4 = 1)) return Math.max(d2, d7);
        n4 = 2;
        if (n3 == n4) {
            return Math.min(d2, d7);
        }
        NoWhenBranchMatchedException noWhenBranchMatchedException = new NoWhenBranchMatchedException();
        throw noWhenBranchMatchedException;
    }
}

