/*
 * Decompiled with CFR 0.152.
 */
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class xA0$g
extends Lambda
implements Function1 {
    public final /* synthetic */ xA0 c;
    public final /* synthetic */ long d;

    public xA0$g(xA0 xA02, long l2) {
        this.c = xA02;
        this.d = l2;
        super(1);
    }

    public final Object invoke(Object object) {
        Nc nc;
        Object object22;
        object = (Xz0)((Object)object);
        xA0 xA02 = this.c;
        Object object3 = xA02.w;
        long l2 = 0L;
        if (object3 != null && (object3 = xA02.r1()) != null && (object22 = Intrinsics.areEqual(object3 = xA02.w, nc = xA02.r1())) == 0) {
            object3 = xA0$a.$EnumSwitchMapping$0;
            Object object4 = ((Enum)object).ordinal();
            Object object22 = 1;
            if ((object4 = (Object)object3[object4]) != object22 && object4 != (object22 = 2)) {
                object22 = 3;
                if (object4 == object22) {
                    object = xA02.s.a().c;
                    if (object != null) {
                        long l3 = this.d;
                        object3 = new bj1(l3);
                        long l4 = ((bj1)((BR)object).b.invoke((Object)object3)).a;
                        Nc nc2 = xA02.r1();
                        Intrinsics.checkNotNull(nc2);
                        object = bp1_0.Ltr;
                        long l7 = nc2.a(l3, l4, (bp1_0)((Object)object));
                        nc2 = xA02.w;
                        Intrinsics.checkNotNull(nc2);
                        long l8 = nc2.a(l3, l4, (bp1_0)((Object)object));
                        l2 = Si1.c(l7, l8);
                    }
                } else {
                    object = new NoWhenBranchMatchedException();
                    throw object;
                }
            }
        }
        object = new Si1(l2);
        return object;
    }
}

