/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.layout.b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from il3
 */
public final class il3_0
extends Lambda
implements gx0_2 {
    public final /* synthetic */ xm3 c;

    public il3_0(xm3 xm32) {
        this.c = xm32;
        super(3);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        boolean bl2;
        boolean bl3;
        boolean bl4;
        boolean bl5;
        Object object4;
        Object object5;
        object = (LP1)object;
        object2 = (b30_0)object2;
        ((Number)object3).intValue();
        int n3 = 1582736677;
        object2.K(n3);
        object = O30.f;
        object = (Vo0)object2.j((H30)object);
        object3 = O30.i;
        object3 = (RU0$a)object2.j((H30)object3);
        Object object6 = O30.l;
        object6 = (bp1_0)((Object)object2.j((H30)object6));
        Object object7 = this.c;
        int n4 = object2.J(object7);
        int n7 = object2.J(object6);
        Object object8 = object2.v();
        b30$a$a b30$a$a = b30$a.a;
        if ((n4 |= n7) != 0 || object8 == b30$a$a) {
            object8 = ym3.a((xm3)object7, (bp1_0)((Object)object6));
            object2.o(object8);
        }
        object8 = (xm3)object8;
        n4 = object2.J(object3);
        int n8 = object2.J(object8);
        Object object9 = object2.v();
        if ((n4 |= n8) != 0 || object9 == b30$a$a) {
            int n10;
            nV0 nV02;
            object5 = ((xm3)object8).a;
            object9 = ((S93)object5).f;
            object4 = ((S93)object5).c;
            if (object4 == null) {
                object4 = tv0_0.m;
            }
            if ((nV02 = ((S93)object5).d) != null) {
                n10 = nV02.a;
            } else {
                n10 = 0;
                nV02 = null;
            }
            object5 = ((S93)object5).e;
            n4 = object5 != null ? ((oV0)object5).a : 1;
            object9 = object3.a((RU0)object9, (tv0_0)object4, n10, n4);
            object2.o(object9);
        }
        object9 = (ib3_0)object9;
        object5 = object2.v();
        if (object5 == b30$a$a) {
            long l2;
            object4 = object9.getValue();
            object5 = new Object();
            ((fl3)object5).a = object6;
            ((fl3)object5).b = object;
            ((fl3)object5).c = object3;
            ((fl3)object5).d = object7;
            ((fl3)object5).e = object4;
            ((fl3)object5).f = l2 = gk3.b((xm3)object7, (Vo0)object, (RU0$a)object3);
            object2.o(object5);
        }
        object5 = (fl3)object5;
        object7 = object9.getValue();
        object9 = ((fl3)object5).a;
        if (!(object6 == object9 && (bl5 = Intrinsics.areEqual(object, object9 = ((fl3)object5).b)) && (bl4 = Intrinsics.areEqual(object3, object9 = ((fl3)object5).c)) && (bl3 = Intrinsics.areEqual(object8, object9 = ((fl3)object5).d)) && (bl2 = Intrinsics.areEqual(object7, object9 = ((fl3)object5).e)))) {
            long l3;
            ((fl3)object5).a = object6;
            ((fl3)object5).b = object;
            ((fl3)object5).c = object3;
            ((fl3)object5).d = object8;
            ((fl3)object5).e = object7;
            ((fl3)object5).f = l3 = gk3.b((xm3)object8, (Vo0)object, (RU0$a)object3);
        }
        object = LP1$a.b;
        boolean bl6 = object2.x(object5);
        object6 = object2.v();
        if (bl6 || object6 == b30$a$a) {
            object6 = new hl3_0((fl3)object5);
            object2.o(object6);
        }
        object6 = (gx0_2)object6;
        object = b.a((LP1)object, (gx0_2)object6);
        object2.E();
        return object;
    }
}

