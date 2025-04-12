/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.ExoPlayer$c;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.kmm.shared.model.home.FleekVideoConfigValue;
import com.ril.ajio.services.data.fleek.feedModel.Component;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class Fs {
    /*
     * Enabled aggressive block sorting
     */
    public static final void a(LP1 lP1, List list, String string2, boolean bl2, ft1_2 ft1_22, boolean bl3, int n3, String string3, b30_0 object, int n4) {
        Object object2;
        LP1 lP12 = lP1;
        List list2 = list;
        String string4 = string2;
        ft1_2 ft1_23 = ft1_22;
        String string5 = string3;
        Intrinsics.checkNotNullParameter(lP1, "modifier");
        Intrinsics.checkNotNullParameter(list, "component");
        Intrinsics.checkNotNullParameter(string2, "videoId");
        Intrinsics.checkNotNullParameter(ft1_22, "listState");
        Intrinsics.checkNotNullParameter(string3, "thumbnailUrl");
        int n7 = 1820582922;
        Object object3 = object;
        Object object4 = object.g(n7);
        int n8 = -1695660779;
        ((j30_0)object4).K(n8);
        object3 = ((j30_0)object4).v();
        Object object5 = b30$a.a;
        Object object6 = null;
        if (object3 == object5) {
            object3 = J83.g(null);
            ((j30_0)object4).o(object3);
        }
        Object object7 = object3;
        object7 = (tr1_0)object3;
        Object object8 = null;
        n8 = -1695658649;
        object3 = wg2_2.a((j30_0)object4, false, n8);
        if (object3 == object5) {
            AJIOApplication.Companion.getClass();
            object2 = AJIOApplication$a.a();
            object3 = new ExoPlayer$c((Context)object2);
            object3 = ((ExoPlayer$c)object3).a();
            ((j30_0)object4).o(object3);
        }
        Object object9 = object3;
        object9 = (ExoPlayer)object3;
        ((j30_0)object4).T(false);
        Intrinsics.checkNotNull(object9);
        n8 = -1695655658;
        ((j30_0)object4).K(n8);
        object3 = ((j30_0)object4).v();
        if (object3 == object5) {
            object3 = h40_0.a;
            object3 = h40_0.y();
            ((j30_0)object4).o(object3);
        }
        object3 = (FleekVideoConfigValue)object3;
        ((j30_0)object4).T(false);
        object5 = ((FleekVideoConfigValue)object3).isAutoPlayVideo();
        object3 = ((FleekVideoConfigValue)object3).isPlayInLoop();
        object2 = Boolean.FALSE;
        int n10 = Intrinsics.areEqual(object5, object2);
        int n14 = 1;
        int n15 = n10 != 0 && (n8 = (int)(Intrinsics.areEqual(object3, object2) ? 1 : 0)) != 0 ? 0 : 1;
        Object object10 = Unit.a;
        object3 = new xs_2((ExoPlayer)object9);
        ly0_0.b(object10, (Function1)object3, (b30_0)object4);
        object3 = new as_1(ft1_23, list2, (tr1_0)object7, null);
        ly0_0.d((b30_0)object4, object10, (Function2)object3);
        Object object11 = object3 = object7.getValue();
        object11 = (Component)object3;
        boolean bl4 = true;
        object3 = object2;
        object5 = string2;
        object6 = object2;
        object2 = object9;
        Unit unit = object10;
        n14 = n15;
        object = object9;
        object9 = object7;
        boolean bl5 = false;
        list2 = null;
        object3 = new bs_1(string2, (ExoPlayer)object2, bl2, bl4, n15 != 0, (tr1_0)object7, null);
        object3 = object11;
        ly0_0.d((b30_0)object4, object11, (Function2)object6);
        n8 = (int)(ft1_23.i.b() ? 1 : 0);
        object8 = n8 != 0;
        int n16 = 0;
        object9 = null;
        object3 = object6;
        object5 = ft1_22;
        object2 = string2;
        object11 = object;
        Object object12 = object7;
        object6 = new cs_1(ft1_22, string2, (ExoPlayer)object, n15 != 0, (tr1_0)object7, null);
        ly0_0.d((b30_0)object4, object8, (Function2)object6);
        object3 = HA.e(Nc$a.e, false);
        n10 = ((j30_0)object4).P;
        object2 = ((j30_0)object4).P();
        object11 = a30_0.c((b30_0)object4, lP12);
        N20.W.getClass();
        object10 = N20$a.b;
        object12 = ((j30_0)object4).a;
        n14 = object12 instanceof mp;
        if (n14 == 0) {
            s20.a();
            throw null;
        }
        ((j30_0)object4).A();
        n14 = ((j30_0)object4).O;
        if (n14 != 0) {
            ((j30_0)object4).C((Function0)object10);
        } else {
            ((j30_0)object4).n();
        }
        object10 = N20$a.e;
        Ow3.a((b30_0)object4, object3, (Function2)object10);
        object3 = N20$a.d;
        Ow3.a((b30_0)object4, object2, (Function2)object3);
        object3 = N20$a.f;
        boolean bl6 = ((j30_0)object4).O;
        if (bl6 || !(bl6 = Intrinsics.areEqual(object2 = ((j30_0)object4).v(), object10 = Integer.valueOf(n10)))) {
            rk_0.a(n10, (j30_0)object4, n10, (N20$a$a)object3);
        }
        object3 = N20$a.c;
        Ow3.a((b30_0)object4, object11, (Function2)object3);
        object3 = (Component)object7.getValue();
        if (object3 != null) {
            object3 = ((Component)object3).getUuid();
        } else {
            n8 = 0;
            object3 = null;
        }
        n8 = Intrinsics.areEqual(object3, string4);
        if (n8 != 0) {
            ((j30_0)object4).K(-1192036861);
            n8 = n4 >> 15 & 0x70;
            n14 = n8 | 8;
            bl6 = false;
            object2 = null;
            object11 = null;
            n16 = 12;
            object3 = object;
            n10 = n3;
            object10 = object4;
            nc3_1.b((ExoPlayer)object, n3, 0, null, (b30_0)object4, n14, n16);
            ((j30_0)object4).T(false);
        } else {
            ((j30_0)object4).K(-1191847761);
            object2 = object;
            object3 = new ds_1((ExoPlayer)object, null);
            object5 = unit;
            ly0_0.d((b30_0)object4, unit, (Function2)object3);
            n8 = n4 >> 21 & 0xE;
            n10 = n4 >> 15 & 0x70;
            AF2.e(string5, n3, (b30_0)object4, n8 |= n10);
            ((j30_0)object4).T(false);
        }
        bl5 = true;
        ((j30_0)object4).T(bl5);
        object8 = ((j30_0)object4).X();
        if (object8 != null) {
            object4 = object6;
            lP12 = lP1;
            list2 = list;
            object3 = string2;
            n10 = (int)(bl2 ? 1 : 0);
            object2 = ft1_22;
            object12 = string3;
            n16 = n4;
            ((CF2)object8).d = object6 = new ys_2(lP1, list, string2, bl2, ft1_22, bl4, n3, string3, n4);
        }
    }
}

