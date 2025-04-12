/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.Fragment;
import com.ril.ajio.R$string;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class PL2$b
implements Function2 {
    public final /* synthetic */ pl2_1 a;

    public PL2$b(pl2_1 pl2_12) {
        this.a = pl2_12;
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        object = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 0xB;
        if (n4 == (n3 = 2) && (n4 = (int)(object.h() ? 1 : 0)) != 0) {
            object.D();
        } else {
            n4 = R$string.ajio_bra_genie;
            object2 = nk_0.f((b30_0)object, n4);
            Object object3 = this.a;
            ax1_0 ax1_02 = new ax1_0((Fragment)object3, 1);
            tl2_1 tl2_12 = new tl2_1((pl2_1)object3);
            int n7 = -1334054710;
            object3 = v10.c(n7, tl2_12, (b30_0)object);
            int n8 = 384;
            zl2_0.a((String)object2, ax1_02, (u10)object3, (b30_0)object, n8);
        }
        return Unit.a;
    }
}

