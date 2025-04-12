/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class NG0$a
implements Function2 {
    public final /* synthetic */ double a;

    public NG0$a(double d2) {
        this.a = d2;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        object2 = (Number)object2;
        int n3 = ((Number)object2).intValue() & 0xB;
        int n4 = 2;
        float f5 = 2.8E-45f;
        if (n3 == n4 && (n3 = (int)(object.h() ? 1 : 0)) != 0) {
            object.D();
        } else {
            double d2 = this.a;
            double d5 = d2 / 0.8;
            object2 = LP1$a.b;
            float f6 = (float)d2;
            LP1 lP1 = j.k((LP1)object2, f6);
            f5 = (float)d5;
            Object object3 = j.d(lP1, f5);
            rp2_0 rp2_02 = SP2.a(uq0_0.e);
            object3 = x20_0.f(QV.a((LP1)object3, rp2_02));
            rp2_02 = null;
            HA.a((LP1)object3, (b30_0)object, 0);
            f5 = uq0_0.z;
            object2 = j.h((LP1)object2, f5);
            object3 = SP2.a;
            object2 = QV.a((LP1)object2, (i13)object3);
            long l2 = nz_1.f;
            fG2$a fG2$a = fg2_1.a;
            object2 = androidx.compose.foundation.a.b((LP1)object2, l2, fG2$a);
            f6 = uq0_0.c;
            long l3 = nz_1.a;
            object2 = x20_0.f(gz.a((LP1)object2, f6, l3, (i13)object3));
            HA.a((LP1)object2, (b30_0)object, 0);
        }
        return Unit.a;
    }
}

