/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from hX
 */
public final class hx_1
implements gx0_2 {
    public final /* synthetic */ Function0 a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ he1_2 c;

    public hx_1(Function0 function0, Function2 function2, he1_2 he1_22) {
        this.a = function0;
        this.b = function2;
        this.c = he1_22;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        int n3;
        object = (bj1)object;
        long l2 = ((bj1)object).a;
        Object object4 = object2;
        object4 = (b30_0)object2;
        int n4 = ((Number)(object3 = (Number)object3)).intValue();
        int n7 = n4 & 6;
        if (n7 == 0) {
            n7 = (int)(object4.d(l2) ? 1 : 0);
            n7 = n7 != 0 ? 4 : 2;
            n4 |= n7;
        }
        if ((n7 = n4 & 0x13) == (n3 = 18) && (n7 = (int)(object4.h() ? 1 : 0)) != 0) {
            object4.D();
        } else {
            object2 = this.a.invoke();
            fb3_2 fb3_22 = new fb3_2(object2);
            n7 = 0;
            object2 = 0;
            object3 = this.b;
            object2 = object3.invoke(object4, object2);
            fb3_2 fb3_23 = new fb3_2(object2);
            int n8 = n4 & 0xE;
            he1_2 he1_22 = this.c;
            kx_2.b(l2, fb3_22, he1_22, fb3_23, (b30_0)object4, n8);
        }
        return Unit.a;
    }
}

