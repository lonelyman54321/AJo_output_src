/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.layout.j;
import com.ril.ajio.services.data.fleek.feedModel.Component;
import com.ril.ajio.services.data.fleek.feedModel.Media;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class lB {
    public static final void a(int n3, Media media, b30_0 b30_02, int n4) {
        int n7 = 1815778372;
        Object object = b30_02;
        Object object2 = b30_02.g(n7);
        object = j.c(LP1$a.b, 1.0f);
        float f5 = x20_0.e((b30_0)object2, n3);
        LP1 lP1 = j.d((LP1)object, f5);
        int n8 = 1;
        object = new n8_0(media, n8);
        lB$a lB$a = lB$a.a;
        u10 u102 = d10_0.a;
        u10 u103 = d10_0.b;
        int n10 = 0x6000000;
        int n14 = 6;
        int n15 = 760;
        vw_1.b((Function0)object, lP1, lB$a, null, null, null, null, null, u102, null, u103, (b30_0)object2, n10, n14, n15);
        object2 = ((j30_0)object2).X();
        if (object2 != null) {
            ((CF2)object2).d = object = new jb_1(n3, media, n4);
        }
    }

    public static final void b(ft1_2 ft1_22, Component component, dr0_0 dr0_02, ac_1 ac_12, rc_2 rc_22, sc_1 sc_12, b30_0 b30_02, int n3) {
        Intrinsics.checkNotNullParameter(ft1_22, "listState");
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(dr0_02, "fleekViewModel");
        Intrinsics.checkNotNullParameter(ac_12, "onFollowClick");
        Intrinsics.checkNotNullParameter(rc_22, "onBackClicked");
        Intrinsics.checkNotNullParameter(sc_12, "onShareClicked");
        int n4 = 1490881810;
        Object object = b30_02.g(n4);
        fx0_2 fx0_22 = new rb_1(component, ft1_22, ac_12, rc_22, sc_12);
        int n7 = 1279423868;
        u10 u102 = v10.c(n7, fx0_22, (b30_0)object);
        fx0_22 = null;
        int n8 = 3072;
        int n10 = 7;
        OA.a(null, null, false, u102, (b30_0)object, n8, n10);
        object = ((j30_0)object).X();
        if (object != null) {
            fx0_22 = new kb_2(ft1_22, component, dr0_02, ac_12, rc_22, sc_12, n3);
            ((CF2)object).d = fx0_22;
        }
    }
}

