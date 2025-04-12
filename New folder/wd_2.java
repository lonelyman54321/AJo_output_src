/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from wd
 */
public final class wd_2
implements Function2 {
    public final /* synthetic */ ib3_0 a;
    public final /* synthetic */ dr0_0 b;
    public final /* synthetic */ p83_0 c;

    public wd_2(tr1_0 tr1_02, dr0_0 dr0_02, p83_0 p83_02) {
        this.a = tr1_02;
        this.b = dr0_02;
        this.c = p83_02;
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        object = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 0xB;
        if (n4 == (n3 = 2) && (n4 = (int)(object.h() ? 1 : 0)) != 0) {
            object.D();
        } else {
            long l2 = nz_1.t;
            double d2 = 0.5;
            float f5 = (float)d2;
            object2 = LP1$a.b;
            float f6 = 1.0f;
            Object object3 = j.c((LP1)object2, f6);
            int n7 = 8;
            Rr0.a((LP1)object3, l2, f5, 0.0f, (b30_0)object, 438, n7);
            object3 = (String)this.a.getValue();
            Object object4 = j.c((LP1)object2, f6);
            float f7 = uq0_0.k;
            int n8 = 5;
            f5 = f7;
            LP1 lP1 = h.i((LP1)object4, 0.0f, f7, 0.0f, f7, n8);
            object2 = this.b;
            object4 = new ud_2((dr0_0)object2);
            Object object5 = this.c;
            vd_2 vd_22 = new vd_2((dr0_0)object2, (p83_0)object5);
            int n10 = 384;
            f7 = 5.38E-43f;
            object5 = object;
            ov3.r((String)object3, (ud_2)object4, lP1, vd_22, (b30_0)object, n10);
        }
        return Unit.a;
    }
}

