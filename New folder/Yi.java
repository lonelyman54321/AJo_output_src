/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class Yi
extends Lambda
implements Function2 {
    public final /* synthetic */ NC3 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ LP1 f;
    public final /* synthetic */ k72 g;

    public Yi(NC3 nC3, long l2, boolean bl2, LP1 lP1, k72 k722) {
        this.c = nC3;
        this.d = l2;
        this.e = bl2;
        this.f = lP1;
        this.g = k722;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        object = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 3;
        if (n4 == (n3 = 2) && (n4 = (int)(object.h() ? 1 : 0)) != 0) {
            object.D();
        } else {
            xi_1 xi_12;
            object2 = O30.q;
            Object object3 = this.c;
            object2 = ((vc3_1)object2).c(object3);
            LP1 lP1 = this.f;
            k72 k722 = this.g;
            long l2 = this.d;
            boolean bl2 = this.e;
            object3 = xi_12;
            xi_12 = new xi_1(l2, bl2, lP1, k722);
            n3 = -1426434671;
            object3 = v10.c(n3, xi_12, (b30_0)object);
            int n7 = 56;
            L30.a((MB2)object2, (Function2)object3, (b30_0)object, n7);
        }
        return Unit.a;
    }
}

