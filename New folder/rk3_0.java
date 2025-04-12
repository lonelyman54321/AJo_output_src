/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from rk3
 */
public final class rk3_0
extends Lambda
implements Function2 {
    public final /* synthetic */ Float c;
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ long e;

    public rk3_0(long l2, Float f5, Function2 function2) {
        this.c = f5;
        this.d = function2;
        this.e = l2;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        object = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 3;
        if (n4 == (n3 = 2) && (n4 = (int)(object.h() ? 1 : 0)) != 0) {
            object.D();
        } else {
            n4 = 8;
            Function2 function2 = this.d;
            Object object3 = this.c;
            if (object3 != null) {
                int n7 = -1178229056;
                float f5 = -3.7699006E-4f;
                object.K(n7);
                nw0_1 nw0_12 = s60_0.a;
                object3 = nw0_12.c(object3);
                L30.a((MB2)object3, function2, (b30_0)object, n4);
                object.E();
            } else {
                int n8 = -1178050310;
                object.K(n8);
                object3 = s60_0.a;
                long l2 = this.e;
                float f6 = OX.d(l2);
                Float f7 = Float.valueOf(f6);
                object3 = ((nw0_1)object3).c(f7);
                L30.a((MB2)object3, function2, (b30_0)object, n4);
                object.E();
            }
        }
        return Unit.a;
    }
}

