/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/*
 * Renamed from pt2
 */
public final class pt2_2
extends jP2 {
    public pt2_2() {
        throw null;
    }

    public final Ri c(wr1_1 object, boolean bl2, float f5, tr1_0 tr1_02, tr1_0 tr1_03, b30_0 b30_02, int n3) {
        int n4;
        b30_02.K(331259447);
        vc3_1 vc3_12 = AndroidCompositionLocals_androidKt.f;
        vc3_12 = (View)b30_02.j(vc3_12);
        ViewGroup viewGroup = BP2.b((View)vc3_12);
        int n7 = n3 & 0xE ^ 6;
        int n8 = 0;
        int n10 = 4;
        if (n7 > n10 && (n4 = b30_02.J(object)) != 0 || (n4 = n3 & 6) == n10) {
            n4 = 1;
        } else {
            n4 = 0;
            object = null;
        }
        n7 = 0x70000 & n3;
        n10 = 196608;
        int n14 = 131072;
        if ((n7 ^= n10) > n14 && (n7 = (int)(b30_02.J(this) ? 1 : 0)) != 0 || (n3 &= n10) == n14) {
            n8 = 1;
        }
        n4 |= n8;
        n3 = (int)(b30_02.J(viewGroup) ? 1 : 0);
        Object object2 = b30_02.v();
        if ((n4 |= n3) != 0 || object2 == (object = b30$a.a)) {
            object2 = new Ri(bl2, f5, tr1_02, tr1_03, viewGroup);
            b30_02.o(object2);
        }
        object2 = (Ri)object2;
        b30_02.E();
        return object2;
    }
}

