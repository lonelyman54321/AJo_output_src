/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from wk3
 */
public final class wk3_0
extends Lambda
implements Function1 {
    public static final wk3_0 c;

    static {
        wk3_0 wk3_02;
        c = wk3_02 = new Lambda(1);
    }

    public final Object invoke(Object object) {
        jo0_0 jo0_02;
        Integer n3 = ((Iw)(object = (hk3_0)object)).d();
        if (n3 != null) {
            int n4 = n3;
            long l2 = ((Iw)object).f;
            int n7 = mm3.c;
            long l3 = 0xFFFFFFFFL;
            n7 = (int)(l2 &= l3) - n4;
            n4 = 0;
            n3 = null;
            jo0_02 = new jo0_0(n7, 0);
        } else {
            jo0_02 = null;
        }
        return jo0_02;
    }
}

