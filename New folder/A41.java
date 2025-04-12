/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.j;
import kotlin.jvm.internal.Lambda;

public final class A41
extends Lambda
implements gx0_2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ xm3 e;

    public A41(int n3, int n4, xm3 xm32) {
        this.c = n3;
        this.d = n4;
        this.e = xm32;
        super(3);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object, Object object2, Object object3) {
        int n3;
        int n4;
        Object object4;
        Object object5;
        A41 a41 = this;
        Object object6 = object;
        object6 = (LP1)object;
        object6 = object2;
        object6 = (b30_0)object2;
        Object object7 = object3;
        object7 = (Number)object3;
        ((Number)object7).intValue();
        float f5 = 2.7562094E-24f;
        object6.K(408240218);
        int n7 = this.c;
        int n8 = this.d;
        B41.d(n7, n8);
        Object object8 = LP1$a.b;
        int n10 = -1 >>> 1;
        int n14 = 1;
        if (n7 == n14 && n8 == n10) {
            object6.E();
            return object8;
        }
        object8 = O30.f;
        object8 = (Vo0)object6.j((H30)object8);
        Object object9 = O30.i;
        object9 = (RU0$a)object6.j((H30)object9);
        Object object10 = O30.l;
        object10 = (bp1_0)((Object)object6.j((H30)object10));
        xm3 xm32 = a41.e;
        int n15 = object6.J(xm32);
        int n16 = object6.J(object10);
        Object object11 = object6.v();
        b30$a$a b30$a$a = b30$a.a;
        if ((n15 |= n16) != 0 || object11 == b30$a$a) {
            object11 = ym3.a(xm32, (bp1_0)((Object)object10));
            object6.o(object11);
        }
        object11 = (xm3)object11;
        n15 = object6.J(object9);
        int n17 = object6.J(object11);
        Object object12 = object6.v();
        if ((n15 |= n17) != 0 || object12 == b30$a$a) {
            nV0 nV02;
            object5 = ((xm3)object11).a;
            object12 = ((S93)object5).f;
            object4 = ((S93)object5).c;
            if (object4 == null) {
                object4 = tv0_0.m;
            }
            if ((nV02 = ((S93)object5).d) != null) {
                n4 = nV02.a;
            } else {
                n4 = 0;
                nV02 = null;
            }
            object5 = ((S93)object5).e;
            n15 = object5 != null ? ((oV0)object5).a : 1;
            object12 = object9.a((RU0)object12, (tv0_0)object4, n4, n15);
            object6.o(object12);
        }
        object12 = (ib3_0)object12;
        object5 = object12.getValue();
        int n18 = object6.J(object8);
        n4 = object6.J(object9);
        int n19 = n18 | n4;
        n4 = (int)(object6.J(xm32) ? 1 : 0);
        int n20 = n19 | n4;
        n4 = (int)(object6.J(object10) ? 1 : 0);
        int n21 = n20 | n4;
        n15 = object6.J(object5) | n21;
        object4 = object6.v();
        long l2 = 0xFFFFFFFFL;
        if (n15 != 0 || object4 == b30$a$a) {
            object5 = gk3.a;
            long l3 = gk3.a((xm3)object11, (Vo0)object8, (RU0$a)object9, (String)object5, n14);
            long l4 = l3 & l2;
            n14 = (int)l4;
            object4 = n14;
            object6.o(object4);
        }
        object4 = (Number)object4;
        n10 = ((Number)object4).intValue();
        Object object13 = object12.getValue();
        n15 = (int)(object6.J(object8) ? 1 : 0);
        int n22 = object6.J(object9);
        int n24 = object6.J(xm32) | (n15 |= n22);
        int n25 = object6.J(object10) | n24;
        n14 = object6.J(object13) | n25;
        object10 = object6.v();
        if (n14 != 0 || object10 == b30$a$a) {
            object13 = new StringBuilder();
            object10 = gk3.a;
            ((StringBuilder)object13).append((String)object10);
            n24 = 10;
            ((StringBuilder)object13).append((char)n24);
            ((StringBuilder)object13).append((String)object10);
            object13 = ((StringBuilder)object13).toString();
            n25 = 2;
            long l7 = gk3.a((xm3)object11, (Vo0)object8, (RU0$a)object9, (String)object13, n25) & l2;
            n3 = (int)l7;
            object10 = n3;
            object6.o(object10);
        }
        object10 = (Number)object10;
        n14 = ((Number)object10).intValue() - n10;
        n3 = 0;
        object9 = null;
        n25 = 1;
        if (n7 == n25) {
            n7 = 0;
            object7 = null;
            f5 = 0.0f;
        } else {
            n7 = (n7 - n25) * n14 + n10;
            object7 = n7;
        }
        n24 = -1 >>> 1;
        if (n8 != n24) {
            n8 = (n8 - n25) * n14 + n10;
            object9 = n8;
        }
        n8 = 2143289344;
        float f6 = 0.0f / 0.0f;
        if (object7 != null) {
            n7 = (Integer)object7;
            f5 = object8.D0(n7);
        } else {
            n7 = 2143289344;
            f5 = 0.0f / 0.0f;
        }
        if (object9 != null) {
            n8 = (Integer)object9;
            f6 = object8.D0(n8);
        }
        object8 = j.e(f5, f6);
        object6.E();
        return object8;
    }
}

