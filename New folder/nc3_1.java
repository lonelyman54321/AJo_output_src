/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.viewinterop.b;
import androidx.media3.exoplayer.ExoPlayer;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$string;
import com.ril.ajio.kmm.shared.model.home.FleekVideoConfigValue;
import kotlin.Pair;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from nC3
 */
public final class nc3_1 {
    public static final void a(LP1 lP1, LP1 lP12, ExoPlayer exoPlayer, boolean bl2, b30_0 b30_02, int n3) {
        kc3_2 kc3_22;
        ExoPlayer exoPlayer2 = exoPlayer;
        Object object = b30_02;
        j30_0 j30_02 = b30_02.g(781920678);
        int n4 = -1524292441;
        float f5 = -1.4323887E-16f;
        j30_02.K(n4);
        Object object2 = j30_02.v();
        object = b30$a.a;
        if (object2 == object) {
            object2 = J83.g(bl2);
            j30_02.o(object2);
        }
        Object object3 = object2;
        object3 = (tr1_0)object2;
        n4 = -1524289858;
        f5 = -1.4327306E-16f;
        object2 = wg2_2.a(j30_02, false, n4);
        if (object2 == object) {
            object2 = J83.g(Boolean.FALSE);
            j30_02.o(object2);
        }
        Object object4 = object2;
        object4 = (tr1_0)object2;
        n4 = -1524287993;
        f5 = -1.4329774E-16f;
        object2 = wg2_2.a(j30_02, false, n4);
        if (object2 == object) {
            object2 = J83.g("");
            j30_02.o(object2);
        }
        Object object5 = object2;
        object5 = (tr1_0)object2;
        j30_02.T(false);
        object2 = j30_02.v();
        if (object2 == object) {
            object2 = Qx2.a(ly0_0.f(f.a, j30_02), j30_02);
        }
        object2 = ((Q30)object2).a;
        CF2 cF2 = null;
        object = object2;
        object = (c80)object2;
        object2 = kc3_22;
        Object object6 = object5;
        kc3_22 = new kc3_2((c80)object, (tr1_0)object5, exoPlayer, (tr1_0)object4, (tr1_0)object3, null);
        ly0_0.d(j30_02, exoPlayer2, kc3_22);
        object2 = (Boolean)object3.getValue();
        n4 = (int)(((Boolean)object2).booleanValue() ? 1 : 0);
        if (n4 != 0) {
            f5 = 0.0f;
            object2 = null;
            exoPlayer2.setVolume(0.0f);
            n4 = R$drawable.ic_mute;
        } else {
            f5 = 1.0f;
            exoPlayer2.setVolume(f5);
            n4 = R$drawable.ic_unmute;
        }
        object2 = km2.a(n4, j30_02, 0);
        object = (Boolean)object3.getValue();
        boolean n7 = (Boolean)object;
        if (n7) {
            j30_02.K(-6851450);
            int n8 = R$string.video_mute;
            object = nk_0.f(j30_02, n8);
            j30_02.T(false);
        } else {
            j30_02.K(-6781948);
            int n10 = R$string.video_unmute;
            object = nk_0.f(j30_02, n10);
            j30_02.T(false);
        }
        object6 = new ic3_2(exoPlayer2, (tr1_0)object3, (tr1_0)object4);
        int n14 = 7;
        object4 = androidx.compose.foundation.d.b(lP1, false, null, (Function0)object6, n14);
        kc3_22 = null;
        int n15 = 120;
        object3 = object2;
        object2 = j30_02;
        Pd1.a((im2)object3, (String)object, (LP1)object4, null, null, 0.0f, null, j30_02, 8, n15);
        object3 = object = object5.getValue();
        object3 = (String)object;
        long l2 = OX.f;
        long l3 = Em3.f(14);
        int n16 = n3 & 0x70 | 0xD80;
        j30_02 = null;
        long l4 = 0L;
        long l7 = 0L;
        int n17 = 131056;
        Ll3.b((String)object3, lP12, l2, l3, null, null, null, l4, null, null, l7, 0, false, 0, 0, null, null, (b30_0)object2, n16, 0, n17);
        cF2 = ((j30_0)object2).X();
        if (cF2 != null) {
            object2 = object3;
            object = lP1;
            object6 = lP12;
            cF2.d = object3 = new jc3_2(lP1, lP12, exoPlayer, bl2, n3);
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static final void b(ExoPlayer exoPlayer, int bl2, int n3, Pair object, b30_0 object2, int n4, int n7) {
        void var33_38;
        boolean bl3;
        boolean bl4;
        boolean bl5;
        int n8;
        int n10;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        Object object7;
        Object object8;
        Object object9;
        ec3_2 ec3_22;
        Object object10;
        float f5;
        float f6;
        int n14;
        Object object11;
        Object object12;
        Object object13;
        Object object14;
        Object object15;
        Object object16;
        Object object17;
        boolean bl6;
        int n15;
        ExoPlayer exoPlayer2 = exoPlayer;
        int n16 = 1;
        float f7 = Float.MIN_VALUE;
        Object object18 = "exoPlayer";
        Intrinsics.checkNotNullParameter(exoPlayer, (String)object18);
        float f8 = 457079.72f;
        Object object19 = object2;
        j30_0 j30_02 = object2.g(1222586103);
        int n17 = n7 & 4;
        if (n17 != 0) {
            n17 = -1;
            f8 = 0.0f / 0.0f;
            n15 = -1;
        } else {
            n15 = n3;
        }
        n17 = n7 & 8;
        if (n17 != 0) {
            bl6 = false;
            object17 = null;
        } else {
            object17 = object;
        }
        n17 = -1379934321;
        f8 = -2.1813466E-11f;
        j30_02.K(n17);
        object18 = j30_02.v();
        object19 = b30$a.a;
        if (object18 == object19) {
            object18 = h40_0.a;
            object18 = h40_0.y();
            j30_02.o(object18);
        }
        object18 = (FleekVideoConfigValue)object18;
        Object object20 = null;
        j30_02.T(false);
        Object object21 = ((FleekVideoConfigValue)object18).isAutoPlayVideo();
        Object object22 = ((FleekVideoConfigValue)object18).isPlayInLoop();
        object18 = ((FleekVideoConfigValue)object18).isAudioMuted();
        int n18 = object18 != null ? (n17 = (int)(((Boolean)object18).booleanValue() ? 1 : 0)) : 0;
        n17 = -1379925982;
        f8 = -2.1827932E-11f;
        j30_02.K(n17);
        object18 = j30_02.v();
        if (object18 == object19) {
            object18 = J83.g(Boolean.TRUE);
            j30_02.o(object18);
        }
        Object object23 = object18;
        object23 = (tr1_0)object18;
        n17 = -1379923805;
        f8 = -2.1831708E-11f;
        object18 = wg2_2.a(j30_02, false, n17);
        if (object18 == object19) {
            object18 = J83.g(Boolean.FALSE);
            j30_02.o(object18);
        }
        Object object24 = object18;
        object24 = (tr1_0)object18;
        n17 = -1379921949;
        f8 = -2.1834928E-11f;
        object18 = wg2_2.a(j30_02, false, n17);
        if (object18 == object19) {
            object18 = J83.g(Boolean.FALSE);
            j30_02.o(object18);
        }
        Object object25 = object18;
        object25 = (tr1_0)object18;
        n17 = -1379919859;
        f8 = -2.1838554E-11f;
        object18 = wg2_2.a(j30_02, false, n17);
        if (object18 == object19) {
            object18 = J83.g(object21);
            j30_02.o(object18);
        }
        Object object26 = object18;
        object26 = (tr1_0)object18;
        j30_02.T(false);
        object18 = AndroidCompositionLocals_androidKt.b;
        Object object27 = object18 = j30_02.j((H30)object18);
        object27 = (Context)object18;
        n17 = -1379915099;
        f8 = -2.184681E-11f;
        j30_02.K(n17);
        object18 = j30_02.v();
        if (object18 == object19) {
            object18 = object16;
            object19 = object22;
            object15 = exoPlayer;
            object14 = object23;
            object13 = object25;
            object12 = object26;
            object11 = object16;
            object16 = object24;
            ((mc3_2)object18)((Boolean)object22, exoPlayer, (tr1_0)object23, (tr1_0)object25, (tr1_0)object26, (tr1_0)object24);
            j30_02.o(object18);
        }
        object16 = object18;
        object16 = (mc3_2)object18;
        j30_02.T(false);
        object18 = AndroidCompositionLocals_androidKt.getLocalLifecycleOwner();
        object11 = object18 = j30_02.j((H30)object18);
        object11 = (mu1_1)object18;
        object18 = object12;
        object19 = object11;
        object15 = object21;
        object14 = object22;
        object13 = exoPlayer;
        object21 = object12;
        object12 = object23;
        ((dc3_2)object18)((mu1_1)object11, (Boolean)object15, (Boolean)object22, exoPlayer, (tr1_0)object23);
        ly0_0.b(object11, (Function1)object18, j30_02);
        object11 = LP1$a.b;
        object23 = Nc$a.a;
        object18 = HA.e((Nc)object23, false);
        int n19 = j30_02.P;
        object15 = j30_02.P();
        object14 = a30_0.c(j30_02, (LP1)object11);
        object13 = N20.W;
        object13.getClass();
        object22 = N20$a.b;
        object21 = j30_02.a;
        int n20 = object21 instanceof mp;
        if (n20 == 0) {
            s20.a();
            throw null;
        }
        j30_02.A();
        n20 = j30_02.O;
        if (n20 != 0) {
            j30_02.C((Function0)object22);
        } else {
            j30_02.n();
        }
        object12 = N20$a.e;
        Ow3.a(j30_02, object18, (Function2)object12);
        object13 = N20$a.d;
        Ow3.a(j30_02, object15, (Function2)object13);
        object15 = N20$a.f;
        n17 = (int)(j30_02.O ? 1 : 0);
        if (n17 != 0 || (n17 = (int)(Intrinsics.areEqual(object18 = j30_02.v(), object20 = Integer.valueOf(n19)) ? 1 : 0)) == 0) {
            rk_0.a(n19, j30_02, n19, (N20$a$a)object15);
        }
        object20 = N20$a.c;
        Ow3.a(j30_02, object14, (Function2)object20);
        object14 = d.a;
        n17 = 1065353216;
        f8 = 1.0f;
        if (object17 != null && (n14 = ((Boolean)(object19 = (Boolean)((Pair)object17).a)).booleanValue()) == n16) {
            object19 = (Float)((Pair)object17).b;
            if (object19 != null) {
                f6 = ((Float)object19).floatValue();
            } else {
                int n21 = 1065353216;
                f6 = 1.0f;
            }
            object19 = c.a((LP1)object11, f6);
            f5 = uq0_0.e;
            object10 = SP2.a(f5);
            object19 = QV.a((LP1)object19, (i13)object10);
        } else {
            object19 = j.c((LP1)object11, f8);
            f7 = uq0_0.e;
            object10 = SP2.a(f7);
            object19 = QV.a((LP1)object19, (i13)object10);
        }
        n16 = 0;
        f7 = 0.0f;
        object10 = null;
        object18 = HA.e((Nc)object23, false);
        n16 = j30_02.P;
        Object object28 = object14;
        object14 = j30_02.P();
        object19 = a30_0.c(j30_02, (LP1)object19);
        Object object29 = object17;
        bl6 = object21 instanceof mp;
        if (!bl6) {
            s20.a();
            throw null;
        }
        j30_02.A();
        bl6 = j30_02.O;
        if (bl6) {
            j30_02.C((Function0)object22);
        } else {
            j30_02.n();
        }
        Ow3.a(j30_02, object18, (Function2)object12);
        Ow3.a(j30_02, object14, (Function2)object13);
        n17 = (int)(j30_02.O ? 1 : 0);
        if (n17 != 0 || (n17 = (int)(Intrinsics.areEqual(object18 = j30_02.v(), object14 = Integer.valueOf(n16)) ? 1 : 0)) == 0) {
            rk_0.a(n16, j30_02, n16, (N20$a$a)object15);
        }
        Ow3.a(j30_02, object19, (Function2)object20);
        object18 = j.c((LP1)object11, 1.0f);
        n16 = (int)(bl2 ? 1 : 0);
        f6 = (float)bl2;
        object17 = j.d((LP1)object18, f6);
        object18 = ec3_22;
        object19 = object27;
        object14 = object15;
        object10 = object15;
        Object object30 = object28;
        object2 = object11;
        object11 = object13;
        object13 = exoPlayer;
        object27 = object20;
        object20 = object12;
        object12 = object16;
        ec3_22 = new ec3_2((Context)object19, n15, (int)(bl2 ? 1 : 0), exoPlayer, (mc3_2)object16);
        object14 = new ub_1(1);
        int n22 = 384;
        int n24 = 0;
        object16 = null;
        object19 = ec3_22;
        object15 = object17;
        object13 = j30_02;
        b.a(ec3_22, (LP1)object17, (Function1)object14, j30_02, n22, 0);
        f8 = -1.6390757E-33f;
        j30_02.K(-1995953335);
        n17 = (int)(exoPlayer.isPlaying() ? 1 : 0);
        object19 = Nc$a.e;
        object15 = fg2_1.a;
        float f11 = 0.3f;
        n20 = 7;
        if (n17 == 0 && (n17 = (int)(((Boolean)(object18 = (Boolean)object24.getValue())).booleanValue() ? 1 : 0)) != 0) {
            object18 = j.c;
            object12 = new fc3_2(exoPlayer2);
            object16 = null;
            bl6 = false;
            object18 = androidx.compose.foundation.d.b((LP1)object18, false, null, (Function0)object12, n20);
            long l2 = OX.b(OX.b, f11);
            object18 = a.b((LP1)object18, l2, (i13)object15);
            object13 = HA.e((Nc)object23, false);
            n22 = j30_02.P;
            object17 = j30_02.P();
            object18 = a30_0.c(j30_02, (LP1)object18);
            n24 = object21 instanceof mp;
            if (n24 == 0) {
                s20.a();
                throw null;
            }
            j30_02.A();
            n24 = j30_02.O;
            if (n24 != 0) {
                j30_02.C((Function0)object22);
            } else {
                j30_02.n();
            }
            Ow3.a(j30_02, object13, (Function2)object20);
            Ow3.a(j30_02, object17, (Function2)object11);
            n20 = (int)(j30_02.O ? 1 : 0);
            if (n20 != 0 || (n20 = (int)(Intrinsics.areEqual(object13 = j30_02.v(), object16 = Integer.valueOf(n22)) ? 1 : 0)) == 0) {
                rk_0.a(n22, j30_02, n22, (N20$a$a)object10);
            }
            object13 = object27;
            Ow3.a(j30_02, object18, (Function2)object27);
            n17 = R$drawable.ic_pdp_video_replay;
            n22 = 0;
            object18 = km2.a(n17, j30_02, 0);
            object16 = object2;
            object17 = object30;
            object27 = ((d)object30).a((LP1)object2, (Nc)object19);
            ec3_22 = null;
            object30 = null;
            int n25 = 56;
            float f12 = 7.8E-44f;
            int n26 = 120;
            object12 = object21;
            object21 = object18;
            object18 = object22;
            object22 = "Play/Pause Icon";
            object9 = object23;
            object23 = object27;
            object8 = object13;
            object7 = object20;
            n20 = 0;
            object13 = null;
            object20 = null;
            object6 = object17;
            object5 = object29;
            bl6 = false;
            object17 = null;
            object4 = object2;
            object3 = object11;
            n24 = 0;
            object16 = null;
            object11 = null;
            object = j30_02;
            object27 = j30_02;
            n10 = n25;
            f5 = f12;
            n8 = n26;
            Pd1.a((im2)object21, (String)object22, (LP1)object23, null, null, 0.0f, null, j30_02, n25, n26);
            boolean bl7 = true;
            j30_02.T(bl7);
        } else {
            object4 = object2;
            object12 = object21;
            object18 = object22;
            object9 = object23;
            object7 = object20;
            object3 = object11;
            object8 = object27;
            object5 = object29;
            object6 = object30;
            n20 = 0;
            object13 = null;
            n24 = 0;
            object16 = null;
        }
        j30_02.T(false);
        j30_02.K(-1995919682);
        boolean bl8 = exoPlayer.isPlaying();
        if (!bl8 && (bl5 = Intrinsics.areEqual(object21 = (Boolean)object26.getValue(), object22 = Boolean.FALSE)) && !(bl4 = ((Boolean)(object21 = (Boolean)object24.getValue())).booleanValue()) && (bl3 = ((Boolean)(object21 = (Boolean)object25.getValue())).booleanValue())) {
            object21 = j.c;
            object22 = new rd2_2(exoPlayer2, 2);
            int n27 = 7;
            object21 = androidx.compose.foundation.d.b((LP1)object21, false, null, (Function0)object22, n27);
            long l3 = OX.b(OX.b, f11);
            object15 = a.b((LP1)object21, l3, (i13)object15);
            object14 = object9;
            object14 = HA.e((Nc)object9, false);
            int n28 = j30_02.P;
            object22 = j30_02.P();
            object15 = a30_0.c(j30_02, (LP1)object15);
            n22 = object12 instanceof mp;
            if (n22 == 0) {
                s20.a();
                throw null;
            }
            j30_02.A();
            n22 = (int)(j30_02.O ? 1 : 0);
            if (n22 != 0) {
                j30_02.C((Function0)object18);
            } else {
                j30_02.n();
            }
            object18 = object7;
            Ow3.a(j30_02, object14, (Function2)object7);
            object18 = object3;
            Ow3.a(j30_02, object22, (Function2)object3);
            n17 = j30_02.O;
            if (n17 != 0 || (n17 = Intrinsics.areEqual(object18 = j30_02.v(), object14 = Integer.valueOf(n28))) == 0) {
                rk_0.a(n28, j30_02, n28, (N20$a$a)object10);
            }
            object18 = object8;
            Ow3.a(j30_02, object15, (Function2)object8);
            n17 = R$drawable.ic_pdp_video_play;
            object21 = km2.a(n17, j30_02, 0);
            object15 = object6;
            object18 = object4;
            object23 = ((d)object6).a((LP1)object4, (Nc)object19);
            object11 = null;
            object19 = null;
            object22 = "Play/Pause Icon";
            object20 = null;
            bl6 = false;
            object17 = null;
            n10 = 56;
            f5 = 7.8E-44f;
            n8 = 120;
            object10 = j30_02;
            j30_02 = null;
            object27 = object10;
            Pd1.a((im2)object21, (String)object22, (LP1)object23, null, null, 0.0f, null, (b30_0)object10, n10, n8);
            boolean bl9 = true;
            f6 = Float.MIN_VALUE;
            ((j30_0)object10).T(bl9);
        } else {
            object10 = j30_02;
            object15 = object6;
            object18 = object4;
            boolean bl10 = true;
            f6 = Float.MIN_VALUE;
        }
        ((j30_0)object10).T(false);
        ((j30_0)object10).T((boolean)var33_38);
        object19 = Nc$a.g;
        object19 = ((d)object15).a((LP1)object18, (Nc)object19);
        f11 = 16;
        object19 = h.e((LP1)object19, f11);
        object13 = Nc$a.i;
        object15 = h.e(((d)object15).a((LP1)object18, (Nc)object13), f11);
        n22 = 512;
        object18 = object19;
        object19 = object15;
        object15 = exoPlayer;
        object13 = object10;
        nc3_1.a((LP1)object18, (LP1)object19, exoPlayer, n18 != 0, (b30_0)object10, n22);
        n17 = 1;
        f8 = Float.MIN_VALUE;
        ((j30_0)object10).T(n17 != 0);
        object10 = ((j30_0)object10).X();
        if (object10 != null) {
            object18 = object21;
            object19 = exoPlayer;
            object13 = object5;
            n22 = n4;
            n24 = n7;
            ((CF2)object10).d = object21 = new gc3_1(exoPlayer, (int)(bl2 ? 1 : 0), n15, (Pair)object5, n4, n7);
        }
    }

    public static final String c(long l2) {
        long l3 = 1000;
        int n3 = (int)(l2 / l3);
        int n4 = 60;
        n3 %= n4;
        long l4 = 60000;
        l2 /= l4;
        l4 = n4;
        int n7 = (int)(l2 % l4);
        Object object = StringCompanionObject.INSTANCE;
        object = n7;
        Integer n8 = n3;
        n4 = 2;
        Object[] objectArray = new Object[n4];
        objectArray[0] = object;
        objectArray[1] = n8;
        return xh2_0.a(objectArray, n4, "%02d:%02d", "format(...)");
    }
}

