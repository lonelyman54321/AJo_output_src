/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.a;
import com.ril.ajio.services.data.Cart.CartEntry;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Fc2
 */
public final class fc2_1
extends Lambda
implements hx0_2 {
    public final /* synthetic */ List c;
    public final /* synthetic */ boolean d;

    public fc2_1(List list, boolean bl2) {
        this.c = list;
        this.d = bl2;
        super(4);
    }

    public final Object invoke(Object object, Object object2, Object object3, Object object4) {
        float f5;
        int n3;
        object = (wr1_2)object;
        object2 = (Number)object2;
        int n4 = ((Number)object2).intValue();
        object3 = (b30_0)object3;
        int n7 = ((Number)(object4 = (Number)object4)).intValue();
        int n8 = n7 & 6;
        if (n8 == 0) {
            n3 = (int)(object3.J(object) ? 1 : 0);
            n3 = n3 != 0 ? 4 : 2;
            n3 |= n7;
        } else {
            n3 = n7;
        }
        if ((n7 &= 0x30) == 0) {
            n7 = (int)(object3.c(n4) ? 1 : 0);
            if (n7 != 0) {
                n7 = 32;
                f5 = 4.5E-44f;
            } else {
                n7 = 16;
                f5 = 2.2E-44f;
            }
            n3 |= n7;
        }
        n7 = 146;
        f5 = 2.05E-43f;
        if ((n3 &= 0x93) == n7 && (n3 = (int)(object3.h() ? 1 : 0)) != 0) {
            object3.D();
        } else {
            object = (CartEntry)this.c.get(n4);
            n4 = -1401301458;
            object3.K(n4);
            object2 = LP1$a.b;
            long l2 = OX.f;
            f5 = 10;
            object4 = SP2.a(f5);
            LP1 lP1 = a.b((LP1)object2, l2, (i13)object4);
            n7 = (int)(this.d ? 1 : 0);
            object2 = new cc2_0((CartEntry)object, n7 != 0);
            n3 = -1763346377;
            u10 u102 = v10.c(n3, (fx0_2)object2, (b30_0)object3);
            int n10 = 3072;
            int n14 = 6;
            OA.a(lP1, null, false, u102, (b30_0)object3, n10, n14);
            object3.E();
        }
        return Unit.a;
    }
}

