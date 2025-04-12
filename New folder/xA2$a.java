/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.h;
import com.ril.ajio.R$drawable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class xA2$a
implements gx0_2 {
    public final /* synthetic */ int a;

    public xA2$a(int n3) {
        this.a = n3;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object, Object object2, Object object3) {
        Object object4 = object;
        object4 = (lQ2)object;
        Object object5 = object2;
        object5 = (b30_0)object2;
        Object object6 = object3;
        object6 = (Number)object3;
        int n3 = ((Number)object6).intValue();
        Object object7 = "$this$OutlinedButton";
        Intrinsics.checkNotNullParameter(object4, (String)object7);
        int n4 = n3 & 0x51;
        n3 = 16;
        if (n4 == n3 && (n4 = (int)(object5.h() ? 1 : 0)) != 0) {
            object5.D();
            return Unit.a;
        }
        n4 = R$drawable.ic_fleek_bag;
        object6 = km2.a(n4, (b30_0)object5, 0);
        object4 = LP1$a.b;
        float f5 = uq0_0.e;
        object7 = object4;
        LP1 lP1 = h.i((LP1)object4, f5, 0.0f, 0.0f, 0.0f, 14);
        int n7 = 440;
        int n8 = 120;
        object7 = "Add to Bag";
        int n10 = 0;
        nV0 nV02 = null;
        Object object8 = object5;
        Pd1.a((im2)object6, (String)object7, lP1, null, null, 0.0f, null, (b30_0)object5, n7, n8);
        n3 = 1;
        int n14 = this.a;
        object6 = n14 == n3 ? " product" : " products";
        object6 = UX.a(n14, (String)object6);
        long l2 = oj3_2.c;
        long l3 = nz_1.h;
        Object object9 = tv0_0.m;
        av0_0 av0_02 = y20_0.a;
        double d2 = 0.4;
        long l4 = Em3.e(d2);
        n10 = 10;
        object7 = object4;
        object7 = h.i((LP1)object4, f5, 0.0f, f5, 0.0f, n10);
        nV02 = new nV0(0);
        int n15 = 130816;
        f5 = 0.0f;
        long l7 = 0L;
        int n16 = 0xDB0DB0;
        object8 = object9;
        object4 = object5;
        object9 = object5;
        Ll3.b((String)object6, (LP1)object7, l3, l2, nV02, (tv0_0)object8, av0_02, l4, null, null, l7, 0, false, 0, 0, null, null, (b30_0)object5, n16, 0, n15);
        return Unit.a;
    }
}

