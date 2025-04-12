/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Qs1
 */
public final class qs1_1
extends Lambda
implements gx0_2 {
    public final /* synthetic */ es1 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    public qs1_1(es1 es12, long l2, int n3, int n4) {
        this.c = es12;
        this.d = l2;
        this.e = n3;
        this.f = n4;
        super(3);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        int n3 = ((Number)object).intValue();
        int n4 = ((Number)object2).intValue();
        object3 = (Function1)object3;
        int n7 = this.e;
        n3 += n7;
        long l2 = this.d;
        n3 = f60.h(n3, l2);
        int n8 = this.f;
        n4 = f60.g(n4 + n8, l2);
        nz0_2 nz0_22 = fh1_2.f();
        return this.c.V0(n3, n4, nz0_22, (Function1)object3);
    }
}

