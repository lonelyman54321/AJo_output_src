/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.f;

/*
 * Renamed from hl3
 */
public final class hl3_0
extends Lambda
implements gx0_2 {
    public final /* synthetic */ fl3 c;

    public hl3_0(fl3 fl32) {
        this.c = fl32;
        super(3);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (dl1_1)object;
        object2 = (xk1_0)object2;
        long l2 = ((c60)object3).a;
        long l3 = this.c.f;
        int n3 = (int)(l3 >> 32);
        int n4 = c60.k(l2);
        int n7 = c60.i(l2);
        n3 = f.g(n3, n4, n7);
        int n8 = (int)(l3 & 0xFFFFFFFFL);
        int n10 = c60.j(l2);
        n4 = c60.h(l2);
        n4 = f.g(n8, n10, n4);
        n10 = n3;
        l2 = c60.b(l2, n3, 0, n4, 0, 10);
        object2 = object2.Q(l2);
        n3 = ((Ns2)object2).a;
        int n14 = ((Ns2)object2).b;
        gl3_0 gl3_02 = new gl3_0((Ns2)object2);
        return cl1_0.a((dl1_1)object, n3, n14, gl3_02);
    }
}

