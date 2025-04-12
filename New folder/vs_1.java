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
import com.ril.ajio.services.data.fleek.explore_brands.Component;
import com.ril.ajio.services.data.fleek.explore_brands.Subcomponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from vs
 */
public final class vs_1 {
    /*
     * WARNING - void declaration
     */
    public static final void a(p83_0 p83_02, String string2, ft1_2 ft1_22, ft1_2 ft1_23, LP1 lP1, int n3, String string3, String string4, b30_0 object, int n4) {
        block45: {
            Object object2;
            Object object3;
            Object object4;
            int n7;
            Object object5;
            Object object6;
            Object object7;
            Object object8;
            int n8;
            Object object9;
            Object object10;
            Object object11;
            block44: {
                int n10;
                block48: {
                    int n14;
                    Object object12;
                    int n15;
                    block47: {
                        Object object13;
                        block46: {
                            boolean bl2;
                            int n16;
                            void var15_19;
                            int n17;
                            Object object14;
                            int n18;
                            int n19;
                            Object object15;
                            ft1_2 ft1_24;
                            ft1_2 ft1_25;
                            block43: {
                                object11 = p83_02;
                                object10 = string2;
                                ft1_25 = ft1_22;
                                ft1_24 = ft1_23;
                                object9 = lP1;
                                int n20 = n3;
                                object13 = string3;
                                object15 = string4;
                                n8 = n4;
                                n19 = 0;
                                object8 = null;
                                Intrinsics.checkNotNullParameter(ft1_22, "listStateColumn");
                                Intrinsics.checkNotNullParameter(ft1_23, "listStateRow");
                                Intrinsics.checkNotNullParameter(lP1, "modifier");
                                Intrinsics.checkNotNullParameter(string3, "uuidSubComponent");
                                object7 = "thumbnailUrl";
                                Intrinsics.checkNotNullParameter(string4, (String)object7);
                                object6 = object;
                                object5 = object.g(926882240);
                                n15 = n4 & 0xE;
                                if (n15 == 0) {
                                    n15 = (int)(((j30_0)object5).J(p83_02) ? 1 : 0);
                                    n15 = n15 != 0 ? 4 : 2;
                                    n15 |= n8;
                                } else {
                                    n15 = n4;
                                }
                                n18 = n8 & 0x70;
                                if (n18 == 0) {
                                    n18 = (int)(((j30_0)object5).J(object10) ? 1 : 0);
                                    n18 = n18 != 0 ? 32 : 16;
                                    n15 |= n18;
                                }
                                if ((n18 = n8 & 0x380) == 0) {
                                    n18 = (int)(((j30_0)object5).J(ft1_25) ? 1 : 0);
                                    n18 = n18 != 0 ? 256 : 128;
                                    n15 |= n18;
                                }
                                if ((n18 = n8 & 0x1C00) == 0) {
                                    n18 = (int)(((j30_0)object5).J(ft1_24) ? 1 : 0);
                                    n18 = n18 != 0 ? 2048 : 1024;
                                    n15 |= n18;
                                }
                                if ((n18 = 0xE000 & n8) == 0) {
                                    n18 = (int)(((j30_0)object5).J(object9) ? 1 : 0);
                                    n18 = n18 != 0 ? 16384 : 8192;
                                    n15 |= n18;
                                }
                                if ((n18 = 0x70000 & n8) == 0) {
                                    n18 = (int)(((j30_0)object5).c(n20) ? 1 : 0);
                                    n18 = n18 != 0 ? 131072 : 65536;
                                    n15 |= n18;
                                }
                                if ((n18 = 0x380000 & n8) == 0) {
                                    n18 = (int)(((j30_0)object5).J(object13) ? 1 : 0);
                                    n18 = n18 != 0 ? 0x100000 : 524288;
                                    n15 |= n18;
                                }
                                if ((n18 = 0x1C00000 & n8) == 0) {
                                    n18 = (int)(((j30_0)object5).J(object15) ? 1 : 0);
                                    n18 = n18 != 0 ? 0x800000 : 0x400000;
                                    n15 |= n18;
                                }
                                n18 = n15;
                                n10 = 0x492492;
                                if ((n15 = 0x16DB6DB & n15) != n10 || (n15 = (int)(((j30_0)object5).h() ? 1 : 0)) == 0) break block43;
                                ((j30_0)object5).D();
                                n15 = n20;
                                object8 = object15;
                                object15 = object10;
                                LP1 lP12 = object9;
                                object10 = object5;
                                break block44;
                            }
                            object6 = new Ref$ObjectRef();
                            ((Ref$ObjectRef)object6).element = object7 = "";
                            n7 = -1681355566;
                            ((j30_0)object5).K(n7);
                            Object object16 = ((j30_0)object5).v();
                            object13 = b30$a.a;
                            int n20 = 0;
                            object4 = null;
                            if (object16 == object13) {
                                object16 = J83.g(null);
                                ((j30_0)object5).o(object16);
                            }
                            object16 = (tr1_0)object16;
                            n20 = -1681353436;
                            object4 = wg2_2.a((j30_0)object5, false, n20);
                            if (object4 == object13) {
                                AJIOApplication$a aJIOApplication$a = AJIOApplication.Companion;
                                aJIOApplication$a.getClass();
                                object8 = AJIOApplication$a.a();
                                object4 = new ExoPlayer$c((Context)object8);
                                object4 = ((ExoPlayer$c)object4).a();
                                ((j30_0)object5).o(object4);
                            }
                            object8 = object4;
                            object8 = (ExoPlayer)object4;
                            ((j30_0)object5).T(false);
                            Intrinsics.checkNotNull(object8);
                            n20 = -1681350585;
                            ((j30_0)object5).K(n20);
                            object4 = ((j30_0)object5).v();
                            if (object4 == object13) {
                                object4 = J83.g(Boolean.FALSE);
                                ((j30_0)object5).o(object4);
                            }
                            object4 = (tr1_0)object4;
                            String string5 = object7;
                            n15 = -1681348537;
                            Object object17 = object6;
                            n10 = 0;
                            object6 = null;
                            object7 = wg2_2.a((j30_0)object5, false, n15);
                            if (object7 == object13) {
                                object7 = J83.g(Boolean.FALSE);
                                ((j30_0)object5).o(object7);
                            }
                            tr1_0 tr1_02 = (tr1_0)object7;
                            n15 = -1681346443;
                            object7 = wg2_2.a((j30_0)object5, false, n15);
                            if (object7 == object13) {
                                object14 = null;
                                object7 = J83.g(null);
                                ((j30_0)object5).o(object7);
                            } else {
                                object14 = null;
                            }
                            Object object18 = object7;
                            object18 = (tr1_0)object7;
                            n15 = -1681343851;
                            object7 = wg2_2.a((j30_0)object5, false, n15);
                            if (object7 == object13) {
                                object7 = J83.g(null);
                                ((j30_0)object5).o(object7);
                            }
                            Object object19 = object7;
                            object19 = (tr1_0)object7;
                            ((j30_0)object5).T(false);
                            object7 = h40_0.a;
                            object7 = h40_0.y();
                            object6 = ((FleekVideoConfigValue)object7).isAutoPlayVideo();
                            object7 = ((FleekVideoConfigValue)object7).isPlayInLoop();
                            Object object20 = object4;
                            object4 = Boolean.FALSE;
                            n10 = (int)(Intrinsics.areEqual(object6, object4) ? 1 : 0);
                            int n21 = n10 != 0 && (n15 = (int)(Intrinsics.areEqual(object7, object4) ? 1 : 0)) != 0 ? 0 : 1;
                            object4 = Unit.a;
                            ((j30_0)object5).K(-1681331575);
                            n10 = n18 & 0x380;
                            n15 = 256;
                            if (n10 == n15) {
                                n17 = 1;
                            } else {
                                n17 = 0;
                                object12 = null;
                            }
                            int n22 = n18 & 0xE;
                            n15 = 4;
                            if (n22 == n15) {
                                boolean bl3 = true;
                            } else {
                                boolean bl4 = false;
                                object3 = null;
                            }
                            int n24 = n17 | var15_19;
                            object7 = ((j30_0)object5).v();
                            if (n24 == 0 && object7 != object13) {
                                boolean bl5 = false;
                                object3 = null;
                            } else {
                                boolean bl6 = false;
                                object3 = null;
                                object7 = new vs$a_0(ft1_25, (p83_0)object11, (tr1_0)object16, null);
                                ((j30_0)object5).o(object7);
                            }
                            object7 = (Function2)object7;
                            boolean bl7 = false;
                            ((j30_0)object5).T(false);
                            ly0_0.d((b30_0)object5, object4, (Function2)object7);
                            object11 = object7 = (Component)object16.getValue();
                            tr1_0 tr1_03 = tr1_02;
                            object7 = object3;
                            int n25 = n10;
                            object6 = string2;
                            object2 = object8;
                            Object object21 = object4;
                            Object object22 = object20;
                            object4 = object16;
                            Object object23 = object16;
                            object16 = ft1_23;
                            object = object13;
                            object13 = object5;
                            object5 = object18;
                            object14 = object8;
                            object8 = null;
                            object3 = new vs$c_0(string2, (ExoPlayer)object2, (tr1_0)object4, ft1_23, (tr1_0)object18, null);
                            ly0_0.d((b30_0)object13, object11, (Function2)object3);
                            object3 = (Subcomponent)object18.getValue();
                            n17 = 0;
                            object12 = null;
                            object7 = object11;
                            object2 = string3;
                            object4 = object14;
                            object16 = object17;
                            object5 = object19;
                            n19 = n21;
                            Object object24 = object18;
                            object15 = object23;
                            object9 = object;
                            object10 = object13;
                            object13 = null;
                            object11 = new vs$d_0(string2, string3, (ExoPlayer)object14, (Ref$ObjectRef)object17, (tr1_0)object19, n21 != 0, (tr1_0)object18, (tr1_0)object23, null);
                            ly0_0.d((b30_0)object10, object3, (Function2)object11);
                            object3 = (Subcomponent)object18.getValue();
                            ((j30_0)object10).K(-1681289552);
                            n14 = n18;
                            n15 = n18 & 0x70;
                            n10 = 32;
                            if (n15 == n10) {
                                n19 = 1;
                            } else {
                                n19 = 0;
                                object8 = null;
                            }
                            object7 = ((j30_0)object10).v();
                            if (n19 != 0 || object7 == object9) {
                                n16 = 0;
                                object5 = null;
                                object7 = object8;
                                object6 = object19;
                                object2 = object18;
                                object4 = object23;
                                object16 = string2;
                                object8 = new vs$e_0((tr1_0)object19, (tr1_0)object18, (tr1_0)object23, string2, null);
                                ((j30_0)object10).o(object8);
                            }
                            object7 = (Function2)object7;
                            object6 = null;
                            ((j30_0)object10).T(false);
                            ly0_0.d((b30_0)object10, object3, (Function2)object7);
                            object13 = object14;
                            object3 = new ss_2(object14, 0);
                            object7 = object21;
                            ly0_0.b(object21, (Function1)object3, (b30_0)object10);
                            boolean bl8 = ft1_25.i.b();
                            object3 = bl8;
                            ((j30_0)object10).K(-1681277973);
                            n10 = n25;
                            n15 = 256;
                            if (n25 == n15) {
                                n19 = 1;
                            } else {
                                n19 = 0;
                                object8 = null;
                            }
                            object7 = ((j30_0)object10).v();
                            if (n19 == 0 && object7 != object9) {
                                object24 = tr1_03;
                                object15 = null;
                            } else {
                                object24 = tr1_03;
                                object15 = null;
                                object7 = new vs$f(ft1_25, tr1_03, null);
                                ((j30_0)object10).o(object7);
                            }
                            object7 = (Function2)object7;
                            object6 = null;
                            ((j30_0)object10).T(false);
                            ly0_0.d((b30_0)object10, object3, (Function2)object7);
                            boolean bl9 = ft1_24.i.b();
                            object3 = bl9;
                            ((j30_0)object10).K(-1681274043);
                            n15 = n14 & 0x1C00;
                            n10 = 2048;
                            if (n15 == n10) {
                                n19 = 1;
                            } else {
                                n19 = 0;
                                object8 = null;
                            }
                            object7 = ((j30_0)object10).v();
                            if (n19 == 0 && object7 != object9) {
                                object9 = object22;
                            } else {
                                object9 = object22;
                                object7 = new vs$g(ft1_24, (tr1_0)object22, null);
                                ((j30_0)object10).o(object7);
                            }
                            object7 = (Function2)object7;
                            n10 = 0;
                            ((j30_0)object10).T(false);
                            ly0_0.d((b30_0)object10, object3, (Function2)object7);
                            object3 = (Boolean)object24.getValue();
                            object3.getClass();
                            n16 = 0;
                            object7 = object8;
                            object6 = string2;
                            object2 = object13;
                            object4 = object24;
                            object16 = object23;
                            object8 = new vs$h(string2, (ExoPlayer)object13, (tr1_0)object24, (tr1_0)object23, null);
                            ly0_0.d((b30_0)object10, object3, (Function2)object8);
                            object3 = (Boolean)object9.getValue();
                            object3.getClass();
                            object7 = object8;
                            object6 = object18;
                            object2 = object19;
                            object4 = string3;
                            object16 = object13;
                            object5 = object9;
                            object15 = object8;
                            n19 = 0;
                            object8 = null;
                            object7 = new vs$i((tr1_0)object18, (tr1_0)object19, string3, (ExoPlayer)object13, (tr1_0)object9, null);
                            ly0_0.d((b30_0)object10, object3, (Function2)object7);
                            object3 = (Boolean)object9.getValue();
                            boolean bl10 = (Boolean)object3;
                            if (!bl10 && !(bl2 = ((Boolean)(object3 = (Boolean)object24.getValue())).booleanValue())) {
                                n19 = 0;
                                object8 = null;
                            } else {
                                n19 = 1;
                            }
                            object3 = n19 != 0;
                            object7 = object15;
                            object6 = object13;
                            object2 = string2;
                            object4 = object19;
                            object16 = string3;
                            n16 = n21;
                            object8 = object24;
                            object24 = object9;
                            object9 = object15;
                            object15 = object23;
                            object12 = object13;
                            object13 = null;
                            object7 = new vs$b_0((ExoPlayer)object6, string2, (tr1_0)object19, string3, n21 != 0, (tr1_0)object8, (tr1_0)object24, (tr1_0)object23, null);
                            ly0_0.d((b30_0)object10, object3, (Function2)object7);
                            object3 = Nc$a.e;
                            n15 = n14 >> 12;
                            n10 = 0;
                            object6 = null;
                            object3 = HA.e((Nc)object3, false);
                            n18 = ((j30_0)object10).P;
                            object4 = ((j30_0)object10).P();
                            object24 = lP1;
                            object16 = a30_0.c((b30_0)object10, lP1);
                            N20.W.getClass();
                            object5 = N20$a.b;
                            object8 = ((j30_0)object10).a;
                            n19 = object8 instanceof mp;
                            if (n19 == 0) break block45;
                            ((j30_0)object10).A();
                            n19 = ((j30_0)object10).O;
                            if (n19 != 0) {
                                ((j30_0)object10).C((Function0)object5);
                            } else {
                                ((j30_0)object10).n();
                            }
                            object5 = N20$a.e;
                            Ow3.a((b30_0)object10, object3, (Function2)object5);
                            object3 = N20$a.d;
                            Ow3.a((b30_0)object10, object4, (Function2)object3);
                            object3 = N20$a.f;
                            n20 = (int)(((j30_0)object10).O ? 1 : 0);
                            if (n20 != 0 || (n20 = (int)(Intrinsics.areEqual(object4 = ((j30_0)object10).v(), object5 = Integer.valueOf(n18)) ? 1 : 0)) == 0) {
                                rk_0.a(n18, (j30_0)object10, n18, (N20$a$a)object3);
                            }
                            object3 = N20$a.c;
                            Ow3.a((b30_0)object10, object16, (Function2)object3);
                            object3 = (Component)object23.getValue();
                            if (object3 != null) {
                                object4 = ((Component)object3).getUuid();
                                object15 = string2;
                                boolean bl11 = false;
                                object3 = null;
                            } else {
                                object15 = string2;
                                boolean bl12 = false;
                                object3 = null;
                                n20 = 0;
                                object4 = null;
                            }
                            n10 = (int)(Intrinsics.areEqual(object4, object15) ? 1 : 0);
                            if (n10 == 0) break block46;
                            object6 = (Subcomponent)object19.getValue();
                            if (object6 != null && (object6 = ((Subcomponent)object6).getUuid()) != null) {
                                object13 = string3;
                            } else {
                                object13 = string3;
                                object6 = string5;
                            }
                            n10 = (int)(Intrinsics.areEqual(object6, object13) ? 1 : 0);
                            if (n10 == 0) break block47;
                            ((j30_0)object10).K(382777990);
                            n14 = n15 & 0x70;
                            n16 = n14 | 8;
                            n18 = 0;
                            object2 = null;
                            n20 = 0;
                            object4 = null;
                            n19 = 12;
                            object7 = object12;
                            n10 = n3;
                            object16 = object10;
                            nc3_1.b((ExoPlayer)object12, n3, 0, null, (b30_0)object10, n16, n19);
                            ((j30_0)object10).T(false);
                            n15 = n3;
                            object8 = string4;
                            n10 = 1;
                            break block48;
                        }
                        object13 = string3;
                    }
                    ((j30_0)object10).K(383049395);
                    object12.pause();
                    n14 = n14 >> 21 & 0xE;
                    n15 = n3;
                    object8 = string4;
                    n10 = 1;
                    AF2.e(string4, n3, (b30_0)object10, n14 |= (n15 &= 0x70));
                    ((j30_0)object10).T(false);
                }
                ((j30_0)object10).T(n10 != 0);
            }
            object10 = ((j30_0)object10).X();
            if (object10 != null) {
                object3 = object9;
                object11 = p83_02;
                object7 = string2;
                object6 = ft1_22;
                object2 = ft1_23;
                object4 = lP1;
                n7 = n3;
                object5 = string3;
                object8 = string4;
                n8 = n4;
                ((CF2)object10).d = object9 = new ts_2(p83_02, string2, ft1_22, ft1_23, lP1, n3, string3, string4, n4);
            }
            return;
        }
        s20.a();
        throw null;
    }
}

