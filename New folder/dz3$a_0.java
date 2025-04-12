/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.a;
import androidx.compose.ui.layout.c;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Dz3$a
 */
public final class dz3$a_0
implements gx0_2 {
    public static final dz3$a_0 a;

    static {
        dz3$a_0 dz3$a_0;
        a = dz3$a_0 = new Object();
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        long l2;
        int n3 = 1;
        float f5 = 0.0f;
        Object object4 = null;
        int n4 = 2;
        float f6 = 2.8E-45f;
        Object object5 = object;
        object5 = (LP1)object;
        Object object6 = object2;
        object6 = (b30_0)object2;
        Object object7 = object3;
        ((Number)object3).intValue();
        Intrinsics.checkNotNullParameter(object5, "$this$composed");
        object6.K(-1044377376);
        int n7 = 986504317;
        object6.K(n7);
        object7 = object6.v();
        b30$a$a b30$a$a = b30$a.a;
        if (object7 == b30$a$a) {
            l2 = 0L;
            object7 = new bj1(l2);
            object7 = J83.g(object7);
            object6.o(object7);
        }
        Object object8 = object7;
        object8 = (tr1_0)object7;
        object6.E();
        object7 = bh1_0.c((b30_0)object6);
        float f7 = -2;
        bj1 bj12 = (bj1)object8.getValue();
        long l3 = bj12.a;
        int n8 = 32;
        float f8 = (int)(l3 >> n8);
        f7 *= f8;
        f8 = n4;
        float f11 = (int)(((bj1)object8.getValue()).a >> n8);
        f8 *= f11;
        int n10 = 1500;
        f11 = 2.102E-42f;
        int n14 = 6;
        Object object9 = Hl.a(Hl.c(n10, 0, null, n14));
        int n15 = 4104;
        object7 = bh1_0.a((vg1_0)object7, f7, f8, (Ug1)object9, (b30_0)object6, n15);
        l2 = 4293454829L;
        long l4 = zx_0.d(l2);
        OX oX = new OX(l4);
        l4 = zx_0.d(0xFFF7F2F2L);
        OX oX2 = new OX(l4);
        l2 = zx_0.d(l2);
        object9 = new OX(l2);
        int n16 = 3;
        f7 = 4.2E-45f;
        Object[] objectArray = new OX[n16];
        objectArray[0] = oX;
        objectArray[n3] = oX2;
        objectArray[n4] = object9;
        List list = xx_2.i(objectArray);
        long l7 = h72.a(((Number)((Vg1$a)object7).d.getValue()).floatValue(), 0.0f);
        f5 = ((Number)((Vg1$a)object7).d.getValue()).floatValue();
        f6 = (int)(((bj1)object8.getValue()).a >> n8);
        f5 += f6;
        long l8 = ((bj1)object8.getValue()).a;
        l3 = 0xFFFFFFFFL;
        f6 = (int)(l8 &= l3);
        long l12 = h72.a(f5, f6);
        object4 = new cu1_0(list, l7, l12, 0);
        object4 = androidx.compose.foundation.a.a((LP1)object5, (cu1_0)object4);
        n4 = 986527566;
        f6 = 0.0015656741f;
        object6.K(n4);
        Object object10 = object6.v();
        if (object10 == b30$a$a) {
            object10 = new so2_1(object8, n3);
            object6.o(object10);
        }
        object10 = (Function1)object10;
        object6.E();
        LP1 lP1 = c.a((LP1)object4, (Function1)object10);
        object6.E();
        return lP1;
    }
}

