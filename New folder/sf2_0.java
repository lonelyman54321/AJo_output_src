/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.a;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from sF2
 */
public final class sf2_0
implements hx0_2 {
    public final /* synthetic */ tr1_0 a;

    public sf2_0(tr1_0 tr1_02) {
        this.a = tr1_02;
    }

    public final Object invoke(Object object, Object object2, Object object3, Object object4) {
        object = (KA)object;
        object2 = (WW$a)object2;
        object3 = (b30_0)object3;
        object4 = (Number)object4;
        int n3 = ((Number)object4).intValue();
        Intrinsics.checkNotNullParameter(object, "$this$CoilImage");
        String string2 = "it";
        Intrinsics.checkNotNullParameter(object2, string2);
        int n4 = n3 & 0xE;
        if (n4 == 0) {
            n4 = (int)(object3.J(object) ? 1 : 0);
            n4 = n4 != 0 ? 4 : 2;
            n3 |= n4;
        }
        if ((n4 = n3 & 0x28B) == (n3 = 130) && (n4 = (int)(object3.h() ? 1 : 0)) != 0) {
            object3.D();
        } else {
            object2 = Boolean.FALSE;
            object4 = this.a;
            object4.setValue(object2);
            object2 = LP1$a.b;
            object = object.e((LP1)object2);
            long l2 = nz_1.l;
            object2 = fg2_1.a;
            object = androidx.compose.foundation.a.b((LP1)object, l2, (i13)object2);
            n4 = 0;
            object2 = null;
            HA.a((LP1)object, (b30_0)object3, 0);
        }
        return Unit.a;
    }
}

