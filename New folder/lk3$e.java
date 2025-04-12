/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class lk3$e
extends Lambda
implements Function2 {
    public final /* synthetic */ long c;
    public final /* synthetic */ Float d;
    public final /* synthetic */ Function2 e;

    public lk3$e(long l2, Float f5, Function2 function2) {
        this.c = l2;
        this.d = f5;
        this.e = function2;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        object = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 3;
        if (n4 == (n3 = 2) && (n4 = (int)(object.h() ? 1 : 0)) != 0) {
            object.D();
        } else {
            object2 = w60_0.a;
            long l2 = this.c;
            Object object3 = new OX(l2);
            object2 = ((nw0_1)object2).c(object3);
            Float f5 = this.d;
            Function2 function2 = this.e;
            object3 = new rk3_0(l2, f5, function2);
            object3 = v10.c(-1132188434, (fx0_2)object3, (b30_0)object);
            int n7 = 56;
            L30.a((MB2)object2, (Function2)object3, (b30_0)object, n7);
        }
        return Unit.a;
    }
}

