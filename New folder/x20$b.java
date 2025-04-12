/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.a;
import androidx.compose.ui.layout.c;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class x20$b
implements gx0_2 {
    public static final x20$b a;

    static {
        x20$b x20$b;
        a = x20$b = new Object();
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
        object6.K(-1729338249);
        int n7 = -1576929099;
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
        long l4 = ((bj1)object8.getValue()).a >> n8;
        float f11 = (int)l4;
        f8 *= f11;
        int n10 = 1000;
        f11 = 1.401E-42f;
        int n14 = 6;
        Object object9 = Hl.a(Hl.c(n10, 0, null, n14));
        int n15 = 4104;
        Object object10 = object6;
        object7 = bh1_0.a((vg1_0)object7, f7, f8, (Ug1)object9, (b30_0)object6, n15);
        l2 = nz_1.f;
        object9 = new OX(l2);
        long l7 = zx_0.d(4280756782L);
        OX oX = new OX(l7);
        object10 = new OX(l2);
        int n16 = 3;
        f7 = 4.2E-45f;
        Object[] objectArray = new OX[n16];
        objectArray[0] = object9;
        objectArray[n3] = oX;
        objectArray[n4] = object10;
        List list = xx_2.i(objectArray);
        long l8 = h72.a(((Number)((Vg1$a)object7).d.getValue()).floatValue(), 0.0f);
        f5 = ((Number)((Vg1$a)object7).d.getValue()).floatValue();
        f6 = (int)(((bj1)object8.getValue()).a >> n8);
        f5 += f6;
        long l12 = ((bj1)object8.getValue()).a;
        l3 = 0xFFFFFFFFL;
        f6 = (int)(l12 &= l3);
        long l14 = h72.a(f5, f6);
        object4 = new cu1_0(list, l8, l14, 0);
        object4 = androidx.compose.foundation.a.a((LP1)object5, (cu1_0)object4);
        n4 = -1576902162;
        f6 = -1.7670129E-18f;
        object6.K(n4);
        Object object11 = object6.v();
        if (object11 == b30$a$a) {
            object11 = new Z5(object8, n3);
            object6.o(object11);
        }
        object11 = (Function1)object11;
        object6.E();
        LP1 lP1 = c.a((LP1)object4, (Function1)object11);
        object6.E();
        return lP1;
    }
}

