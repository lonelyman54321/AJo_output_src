/*
 * Decompiled with CFR 0.152.
 */
import java.util.Stack;

/*
 * Renamed from Cf0
 */
public final class cf0_2 {
    public static cf0_2 b;
    public Stack a;

    public static cf0_2 a() {
        cf0_2 cf0_22 = b;
        if (cf0_22 == null) {
            Stack stack;
            cf0_22 = new Object();
            cf0_22.a = stack = new Stack();
            b = cf0_22;
        }
        return b;
    }
}

