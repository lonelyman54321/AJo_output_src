/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Vd1
 */
public final class vd1_2
implements gx0_2 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ he1_2 b;
    public final /* synthetic */ s50_0 c;
    public final /* synthetic */ hx0_2 d;
    public final /* synthetic */ tr1_0 e;

    public vd1_2(Object object, he1_2 he1_22, s50_0 s50_02, int n3, u10 u102, tr1_0 tr1_02) {
        this.a = object;
        this.b = he1_22;
        this.c = s50_02;
        this.d = u102;
        this.e = tr1_02;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        int n3;
        object = (PA)object;
        object2 = (b30_0)object2;
        object3 = (Number)object3;
        int n4 = ((Number)object3).intValue();
        Object object4 = "$this$BoxWithConstraints";
        Intrinsics.checkNotNullParameter(object, (String)object4);
        int n7 = n4 & 6;
        int n8 = 4;
        if (n7 == 0) {
            n7 = (int)(object2.J(object) ? 1 : 0);
            n7 = n7 != 0 ? 4 : 2;
            n4 |= n7;
        }
        if ((n7 = n4 & 0x13) == (n3 = 18) && (n7 = (int)(object2.h() ? 1 : 0)) != 0) {
            object2.D();
        } else {
            Object object5;
            n7 = 1026798762;
            object2.K(n7);
            object4 = this.b;
            n3 = (int)(object2.J(object4) ? 1 : 0);
            if ((n4 &= 0xE) == n8) {
                n8 = 1;
            } else {
                n8 = 0;
                object5 = null;
            }
            n8 |= n3;
            s50_0 s50_02 = this.c;
            int n10 = object2.J(s50_02);
            Object object6 = object2.v();
            if ((n8 |= n10) != 0 || object6 == (object5 = b30$a.a)) {
                n8 = 0;
                object5 = null;
                object6 = new ud1_2((he1_2)object4, (PA)object, s50_02, null);
                object2.o(object6);
            }
            object6 = (Function2)object6;
            object2.E();
            ly0_0.e(this.a, object4, (Function2)object6, (b30_0)object2);
            object4 = (zd1_2)this.e.getValue();
            object3 = n4;
            object5 = this.d;
            object5.invoke(object, object4, object2, object3);
        }
        return Unit.a;
    }
}

