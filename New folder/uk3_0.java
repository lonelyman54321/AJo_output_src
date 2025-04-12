/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from uk3
 */
public final class uk3_0
extends Lambda
implements Function1 {
    public static final uk3_0 c;

    static {
        uk3_0 uk3_02;
        c = uk3_02 = new Lambda(1);
    }

    public final Object invoke(Object object) {
        object = (hk3_0)object;
        long l2 = ((Iw)object).f;
        long l3 = 0xFFFFFFFFL;
        int n3 = (int)(l2 & l3);
        object = ((Iw)object).g.a;
        int n4 = ie3_1.c((int)(l2 & l3), (String)object);
        jo0_0 jo0_02 = new jo0_0(n3 -= n4, 0);
        return jo0_02;
    }
}

