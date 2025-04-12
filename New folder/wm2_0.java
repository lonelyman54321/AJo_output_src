/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

/*
 * Renamed from wm2
 */
public final class wm2_0 {
    public static gi_0 a(String string2, xm3 xm32, long l2, Vo0 vo0, RU0$a rU0$a, List list, int n3, int n4) {
        List list2;
        Object object;
        int n7 = n4 & 0x20;
        if (n7 != 0) {
            object = mz0_2.a;
            list2 = object;
        } else {
            list2 = list;
        }
        mz0_2 mz0_22 = mz0_2.a;
        ii ii2 = new ii(string2, xm32, list2, mz0_22, rU0$a, vo0);
        object = new gi_0(ii2, n3, false, l2);
        return object;
    }
}

