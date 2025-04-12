/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from k
 */
public final class k_0 {
    public static final int a(cx2_2 object, int n3) {
        int n4;
        block4: {
            String string2 = "<this>";
            Intrinsics.checkNotNullParameter(object, string2);
            int[] nArray = ((cx2_2)object).f;
            ++n3;
            object = ((cx2_2)object).e;
            int n7 = ((Object)object).length;
            Intrinsics.checkNotNullParameter(nArray, string2);
            n7 += -1;
            int n8 = 0;
            string2 = null;
            while (n8 <= n7) {
                n4 = n8 + n7 >>> 1;
                int n10 = nArray[n4];
                if (n10 < n3) {
                    n8 = n4 + 1;
                    continue;
                }
                if (n10 > n3) {
                    n7 = n4 + -1;
                    continue;
                }
                break block4;
            }
            n7 = -n8;
            n4 = n7 + -1;
        }
        if (n4 < 0) {
            n4 ^= 0xFFFFFFFF;
        }
        return n4;
    }
}

