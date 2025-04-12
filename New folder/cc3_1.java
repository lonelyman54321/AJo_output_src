/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 */
import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.ui.layout.c;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.viewinterop.b;
import androidx.lifecycle.i$a;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.ExoPlayer$c;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$string;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from cC3
 */
public final class cc3_1 {
    public static final void a(LP1 lP1, LP1 lP12, ExoPlayer exoPlayer, boolean bl2, boolean bl3, b30_0 b30_02, int n3) {
        bc3_2 bc3_22;
        ExoPlayer exoPlayer2 = exoPlayer;
        Object object = b30_02;
        j30_0 j30_02 = b30_02.g(-308202663);
        int n4 = -1524324409;
        float f5 = -1.4281578E-16f;
        j30_02.K(n4);
        Object object2 = j30_02.v();
        object = b30$a.a;
        if (object2 == object) {
            object2 = J83.g(bl2);
            j30_02.o(object2);
        }
        Object object3 = object2;
        object3 = (tr1_0)object2;
        Object object4 = null;
        n4 = -1524321826;
        f5 = -1.4284996E-16f;
        object2 = wg2_2.a(j30_02, false, n4);
        if (object2 == object) {
            object2 = J83.g(Boolean.FALSE);
            j30_02.o(object2);
        }
        Object object5 = object2;
        object5 = (tr1_0)object2;
        n4 = -1524319961;
        f5 = -1.4287465E-16f;
        object2 = wg2_2.a(j30_02, false, n4);
        if (object2 == object) {
            object2 = J83.g("");
            j30_02.o(object2);
        }
        Object object6 = object2;
        object6 = (tr1_0)object2;
        j30_02.T(false);
        Object object7 = false;
        boolean n7 = false;
        object = null;
        object2 = bc3_22;
        Object object8 = object3;
        bc3_22 = new bc3_2(null, (tr1_0)object6, (tr1_0)object5, (tr1_0)object3, exoPlayer);
        ly0_0.e(exoPlayer2, object7, bc3_22, j30_02);
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
        boolean bl4 = (Boolean)object;
        if (bl4) {
            j30_02.K(-8070618);
            int n8 = R$string.video_mute;
            object = nk_0.f(j30_02, n8);
            j30_02.T(false);
        } else {
            j30_02.K(-8001116);
            int n10 = R$string.video_unmute;
            object = nk_0.f(j30_02, n10);
            j30_02.T(false);
        }
        float f6 = 16;
        object5 = lP1;
        object6 = h.e(lP1, f6);
        object8 = new ub3_2(exoPlayer2, (tr1_0)object3);
        int n14 = 7;
        object7 = androidx.compose.foundation.d.b((LP1)object6, false, null, (Function0)object8, n14);
        bc3_22 = null;
        int n15 = 8;
        f6 = 1.1E-44f;
        int n16 = 120;
        object3 = object2;
        object4 = object;
        object2 = j30_02;
        Pd1.a((im2)object3, (String)object, (LP1)object7, null, null, 0.0f, null, j30_02, n15, n16);
        object3 = j30_02.X();
        if (object3 != null) {
            object2 = object4;
            object = lP1;
            object6 = lP12;
            object5 = exoPlayer;
            n14 = 0;
            ((CF2)object3).d = object4 = new vb3_2(lP1, lP12, exoPlayer, bl2, false, n3);
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static final void b(ft1_2 ft1_22, LP1 lP1, String string2, int n3, boolean bl2, b30_0 object, int bl3, int n4) {
        Object object2;
        Object object3;
        Object object4;
        int n7;
        boolean bl4;
        void var16_29;
        int n8;
        Object object5;
        Object object6;
        Object object7;
        int n10;
        Object object8;
        LP1 lP12;
        Object object9;
        block24: {
            void var18_39;
            int n14;
            block23: {
                block22: {
                    block21: {
                        int n15;
                        block20: {
                            int n16;
                            int n17;
                            object9 = ft1_22;
                            lP12 = lP1;
                            object8 = string2;
                            n15 = bl3;
                            n10 = 16;
                            Intrinsics.checkNotNullParameter(ft1_22, "listState");
                            Intrinsics.checkNotNullParameter(lP1, "modifier");
                            object7 = "videoUrl";
                            Intrinsics.checkNotNullParameter(string2, (String)object7);
                            object6 = object;
                            object5 = object.g(-196658266);
                            int n18 = bl3 & 0xE;
                            if (n18 == 0) {
                                void var16_20;
                                boolean bl5 = ((j30_0)object5).J(ft1_22);
                                if (bl5) {
                                    int n19 = 4;
                                } else {
                                    int n20 = 2;
                                }
                                int n21 = var16_20 | n15;
                            } else {
                                boolean bl6 = bl3;
                            }
                            n8 = n15 & 0x70;
                            if (n8 == 0) {
                                void var16_23;
                                n8 = (int)(((j30_0)object5).J(lP12) ? 1 : 0);
                                n8 = n8 != 0 ? 32 : 16;
                                n17 = var16_23 | n8;
                            }
                            if ((n8 = n15 & 0x380) == 0) {
                                n8 = (int)(((j30_0)object5).J(object8) ? 1 : 0);
                                n8 = n8 != 0 ? 256 : 128;
                                n16 = n17 | n8;
                            }
                            if ((n8 = n15 & 0x1C00) == 0) {
                                n8 = (int)(((j30_0)object5).c(n3) ? 1 : 0);
                                n8 = n8 != 0 ? 2048 : 1024;
                                n14 = n16 | n8;
                            }
                            if ((n10 = n4 & 0x10) == 0) break block20;
                            int n22 = n14 | 0x6000;
                            break block21;
                        }
                        n8 = 0xE000 & n15;
                        if (n8 != 0) break block21;
                        n8 = (int)(bl2 ? 1 : 0);
                        boolean bl7 = ((j30_0)object5).a(bl2);
                        if (!bl7) break block22;
                        int n24 = 16384;
                        break block23;
                    }
                    n8 = (int)(bl2 ? 1 : 0);
                    break block24;
                }
                int n25 = 8192;
            }
            int n26 = n14 | var18_39;
        }
        int n27 = var16_29 & 0xB6DB;
        int n28 = 9362;
        if (n27 == n28 && (bl4 = ((j30_0)object5).h())) {
            ((j30_0)object5).D();
            n7 = n8;
            object4 = object5;
        } else {
            void var30_61;
            boolean bl8;
            boolean bl9 = false;
            object7 = null;
            int n29 = n10 != 0 ? 0 : n8;
            object4 = AndroidCompositionLocals_androidKt.b;
            object6 = object4 = ((j30_0)object5).j((H30)object4);
            object6 = (Context)object4;
            n10 = -68344988;
            ((j30_0)object5).K(n10);
            object4 = ((j30_0)object5).v();
            object3 = b30$a.a;
            if (object4 == object3) {
                object4 = J83.g((Object)i$a.ON_CREATE);
                ((j30_0)object5).o(object4);
            }
            object2 = object4;
            object2 = (tr1_0)object4;
            ((j30_0)object5).T(false);
            object4 = AndroidCompositionLocals_androidKt.a;
            object4 = (Configuration)((j30_0)object5).j((H30)object4);
            int n30 = -68340317;
            ((j30_0)object5).K(n30);
            Object object10 = ((j30_0)object5).v();
            if (object10 == object3) {
                object10 = J83.g(Boolean.TRUE);
                ((j30_0)object5).o(object10);
            }
            Object object11 = object10;
            object11 = (tr1_0)object10;
            int n32 = -68338428;
            object10 = wg2_2.a((j30_0)object5, false, n32);
            if (object10 == object3) {
                object10 = J83.g(Boolean.FALSE);
                ((j30_0)object5).o(object10);
            }
            Object object12 = object10;
            object12 = (tr1_0)object10;
            ((j30_0)object5).T(false);
            object10 = AndroidCompositionLocals_androidKt.getLocalLifecycleOwner();
            object10 = (mu1_1)((j30_0)object5).j((H30)object10);
            n7 = -68334911;
            ((j30_0)object5).K(n7);
            Object object13 = ((j30_0)object5).v();
            if (object13 == object3) {
                AJIOApplication.Companion.getClass();
                object13 = AJIOApplication$a.a();
                object3 = new ExoPlayer$c((Context)object13);
                object13 = ((ExoPlayer$c)object3).a();
                ((j30_0)object5).o(object13);
            }
            Object object14 = object13;
            object14 = (ExoPlayer)object13;
            ((j30_0)object5).T(false);
            Intrinsics.checkNotNull(object14);
            object3 = h40_0.a;
            object3 = h40_0.y().isAudioMuted();
            if (object3 != null) {
                boolean bl10;
                boolean bl11 = bl10 = ((Boolean)object3).booleanValue();
            } else {
                boolean bl12 = false;
            }
            Object object15 = object3;
            Object object16 = object10;
            object3 = new wb3_2((mu1_1)object10, (ExoPlayer)object14, (tr1_0)object2, (tr1_0)object11, (tr1_0)object12);
            ly0_0.b(object10, (Function1)object3, (b30_0)object5);
            object3 = ((ft1_2)object9).i.b();
            n7 = 0;
            object10 = new cC3$a((ExoPlayer)object14, (ft1_2)object9, (tr1_0)object12, null);
            ly0_0.d((b30_0)object5, object3, (Function2)object10);
            object10 = LP1$a.b;
            object3 = Nc$a.a;
            object7 = HA.e((Nc)object3, false);
            int n34 = ((j30_0)object5).P;
            object13 = ((j30_0)object5).P();
            object9 = a30_0.c((b30_0)object5, (LP1)object10);
            object15 = N20.W;
            object15.getClass();
            object = object10;
            object10 = N20$a.b;
            object8 = ((j30_0)object5).a;
            boolean bl13 = object8 instanceof mp;
            if (!bl13) {
                s20.a();
                throw null;
            }
            ((j30_0)object5).A();
            bl13 = ((j30_0)object5).O;
            if (bl13) {
                ((j30_0)object5).C((Function0)object10);
            } else {
                ((j30_0)object5).n();
            }
            object10 = N20$a.e;
            Ow3.a((b30_0)object5, object7, (Function2)object10);
            object7 = N20$a.d;
            Ow3.a((b30_0)object5, object13, (Function2)object7);
            object7 = N20$a.f;
            boolean bl14 = ((j30_0)object5).O;
            if (bl14 || !(bl8 = Intrinsics.areEqual(object10 = ((j30_0)object5).v(), object13 = Integer.valueOf(n34)))) {
                rk_0.a(n34, (j30_0)object5, n34, (N20$a$a)object7);
            }
            object7 = N20$a.c;
            Ow3.a((b30_0)object5, object9, (Function2)object7);
            object9 = d.a;
            object7 = j.c;
            object7 = lP12.then((LP1)object7);
            object3 = new xb3_1((Configuration)object4, (ExoPlayer)object14, (tr1_0)object12);
            object8 = c.a((LP1)object7, (Function1)object3);
            object4 = object15;
            object7 = object6;
            n8 = n3;
            object3 = object14;
            object13 = object;
            void var24_52 = var30_61;
            Object object17 = object;
            object13 = string2;
            object15 = new yb3_2((Context)object6, n3, (ExoPlayer)object14, (boolean)var30_61, string2);
            object4 = object16;
            object7 = object2;
            object6 = ft1_22;
            object10 = object11;
            object13 = object12;
            object16 = new zb3_2((tr1_0)object2, ft1_22, (ExoPlayer)object14, (tr1_0)object11, (tr1_0)object12);
            n10 = 0;
            boolean bl15 = false;
            object2 = object15;
            object11 = object8;
            object12 = object16;
            object13 = object14;
            object14 = object5;
            object4 = object5;
            object5 = null;
            b.a((Function1)object15, (LP1)object8, (Function1)object16, (b30_0)object14, 0, 0);
            object7 = Nc$a.i;
            object6 = n29 != 0 ? Nc$a.g : object7;
            object3 = object17;
            object2 = ((d)object9).a((LP1)object17, (Nc)object6);
            object11 = ((d)object9).a((LP1)object17, (Nc)object7);
            object12 = object13;
            void var35_67 = var30_61;
            object5 = object4;
            int n35 = 512;
            cc3_1.a((LP1)object2, (LP1)object11, (ExoPlayer)object13, (boolean)var35_67, false, (b30_0)object4, n35);
            boolean bl16 = true;
            ((j30_0)object4).T(bl16);
            n7 = n29;
        }
        object8 = ((j30_0)object4).X();
        if (object8 != null) {
            object4 = object2;
            object7 = ft1_22;
            object6 = lP1;
            object3 = string2;
            int n36 = n3;
            ((CF2)object8).d = object2 = new ac3_1(ft1_22, lP1, string2, n3, n7 != 0, (int)(bl3 ? 1 : 0), n4);
        }
    }
}

