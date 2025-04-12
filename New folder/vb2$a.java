/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class vb2$a
implements gx0_2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ LP1 b;
    public final /* synthetic */ long c;

    public vb2$a(String string2, LP1 lP1, long l2) {
        this.a = string2;
        this.b = lP1;
        this.c = l2;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        vb2$a vb2$a = this;
        Object object4 = object;
        object4 = (lQ2)object;
        Object object5 = object2;
        object5 = (b30_0)object2;
        Object object6 = object3;
        object6 = (Number)object3;
        int n3 = ((Number)object6).intValue();
        Object object7 = "$this$Button";
        Intrinsics.checkNotNullParameter(object4, (String)object7);
        int n4 = n3 & 0x51;
        n3 = 16;
        if (n4 == n3 && (n4 = (int)(object5.h() ? 1 : 0)) != 0) {
            object5.D();
        } else {
            tv0_0 tv0_02 = tv0_0.o;
            long l2 = Em3.f(14);
            long l3 = Em3.f(20);
            av0_0 av0_02 = y20_0.a;
            double d2 = 0.4;
            long l4 = Em3.e(d2);
            n4 = 3;
            Cj3 cj3 = new Cj3(n4);
            int n7 = 6;
            int n8 = 129296;
            object6 = vb2$a.a;
            object7 = vb2$a.b;
            long l7 = vb2$a.c;
            int n10 = 14355456;
            Ll3.b((String)object6, (LP1)object7, l7, l2, null, tv0_02, av0_02, l4, null, cj3, l3, 0, false, 0, 0, null, null, (b30_0)object5, n10, n7, n8);
        }
        return Unit.a;
    }
}

