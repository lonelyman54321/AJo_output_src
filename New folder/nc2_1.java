/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.R$string;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Nc2
 */
public final class nc2_1
implements gx0_2 {
    public final /* synthetic */ Function0 a;

    public nc2_1(nb_1 nb_12) {
        this.a = nb_12;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (PA)object;
        Object object4 = object2;
        object4 = (b30_0)object2;
        int n3 = ((Number)object3).intValue();
        object3 = "$this$BoxWithConstraints";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        int n4 = n3 & 0x51;
        n3 = 16;
        if (n4 == n3 && (n4 = (int)(object4.h() ? 1 : 0)) != 0) {
            object4.D();
        } else {
            n4 = R$string.close;
            object = nk_0.f((b30_0)object4, n4);
            object2 = LP1$a.b;
            int n7 = 4;
            float f5 = n7;
            Object object5 = null;
            Object object6 = object2;
            object3 = j.c(h.i((LP1)object2, 0.0f, 0.0f, f5, 0.0f, 11), 1.0f);
            double d2 = 0.2;
            float f6 = (float)d2;
            long l2 = OX.b;
            int n8 = 8;
            f5 = n8;
            Object object7 = SP2.a(f5);
            object3 = gz.a((LP1)object3, f6, l2, (i13)object7);
            object6 = GE.a;
            long l3 = xx_1.e;
            int n10 = 6;
            int n14 = 14;
            long l4 = 0L;
            Object object8 = object4;
            object7 = GE.a(l3, l4, (b30_0)object4, n10, n14);
            int n15 = -1820985805;
            f6 = -3.1044733E-27f;
            object4.K(n15);
            object6 = this.a;
            boolean bl2 = object4.J(object6);
            Object object9 = object4.v();
            if (bl2 || object9 == (object5 = b30$a.a)) {
                object6 = (nb_1)object6;
                bl2 = false;
                object5 = null;
                object9 = new mc2_1(object6, 0);
                object4.o(object9);
            }
            object8 = object9;
            object8 = (Function0)object9;
            object4.E();
            long l7 = OX.f;
            f6 = 6;
            LP1 lP1 = h.e((LP1)object2, f6);
            n15 = 0;
            f6 = 0.0f;
            object6 = null;
            int n16 = 0x1B0000;
            int n17 = 1;
            object5 = object;
            object9 = object3;
            vb2.a(false, (String)object, (LP1)object3, (ol0)object7, (Function0)object8, l7, lP1, (b30_0)object4, n16, n17);
        }
        return Unit.a;
    }
}

