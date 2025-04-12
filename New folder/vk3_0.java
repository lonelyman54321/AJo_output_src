/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from vk3
 */
public final class vk3_0
extends Lambda
implements Function1 {
    public static final vk3_0 c;

    static {
        vk3_0 vk3_02;
        c = vk3_02 = new Lambda(1);
    }

    public final Object invoke(Object object) {
        jo0_0 jo0_02;
        int n3;
        object = (hk3_0)object;
        String string2 = ((Iw)object).g.a;
        long l2 = ((Iw)object).f;
        long l3 = 0xFFFFFFFFL;
        int n4 = (int)(l2 &= l3);
        int n7 = ie3_1.b(n4, string2);
        if (n7 != (n3 = -1)) {
            long l4 = ((Iw)object).f;
            long l7 = l4 & l3;
            int n8 = (int)l7;
            n7 -= n8;
            n8 = 0;
            object = null;
            jo0_02 = new jo0_0(0, n7);
        } else {
            n3 = 0;
            jo0_02 = null;
        }
        return jo0_02;
    }
}

