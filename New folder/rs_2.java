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
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from rs
 */
public final class rs_2 {
    /*
     * WARNING - void declaration
     */
    public static final void a(p83_0 p83_02, ft1_2 ft1_22, String string2, ft1_2 ft1_23, LP1 lP1, int n3, int n4, String string3, String string4, Pair pair, b30_0 object, int n7) {
        block54: {
            Object object2;
            Object object3;
            int n8;
            Object object4;
            Object object5;
            int n10;
            Object object6;
            Object object7;
            Object object8;
            Object object9;
            Object object10;
            ft1_2 ft1_24;
            Object object11;
            block53: {
                int n14;
                block57: {
                    int n15;
                    Object object12;
                    block56: {
                        Object object13;
                        block55: {
                            boolean bl2;
                            int n16;
                            int n17;
                            int n18;
                            Object object14;
                            ft1_2 ft1_25;
                            block52: {
                                int n19;
                                int n20;
                                object11 = p83_02;
                                ft1_24 = ft1_22;
                                object10 = string2;
                                ft1_25 = ft1_23;
                                object9 = lP1;
                                int n162 = n3;
                                object13 = string3;
                                object14 = string4;
                                int n21 = n7;
                                Intrinsics.checkNotNullParameter(ft1_22, "listStateColumn");
                                Intrinsics.checkNotNullParameter(ft1_23, "listStateRow");
                                Intrinsics.checkNotNullParameter(lP1, "modifier");
                                Intrinsics.checkNotNullParameter(string3, "uuidSubComponent");
                                object8 = "thumbnailUrl";
                                Intrinsics.checkNotNullParameter(string4, (String)object8);
                                object7 = object;
                                object6 = object.g(1861207531);
                                n14 = n7 & 0xE;
                                if (n14 == 0) {
                                    n14 = (int)(((j30_0)object6).J(p83_02) ? 1 : 0);
                                    n14 = n14 != 0 ? 4 : 2;
                                    n14 |= n21;
                                } else {
                                    n14 = n7;
                                }
                                n18 = n21 & 0x70;
                                if (n18 == 0) {
                                    n18 = (int)(((j30_0)object6).J(ft1_24) ? 1 : 0);
                                    n18 = n18 != 0 ? 32 : 16;
                                    n14 |= n18;
                                }
                                if ((n18 = n21 & 0x380) == 0) {
                                    n18 = (int)(((j30_0)object6).J(object10) ? 1 : 0);
                                    n18 = n18 != 0 ? 256 : 128;
                                    n14 |= n18;
                                }
                                if ((n18 = n21 & 0x1C00) == 0) {
                                    n18 = (int)(((j30_0)object6).J(ft1_25) ? 1 : 0);
                                    n18 = n18 != 0 ? 2048 : 1024;
                                    n14 |= n18;
                                }
                                if ((n18 = 0xE000 & n21) == 0) {
                                    n18 = (int)(((j30_0)object6).J(object9) ? 1 : 0);
                                    n18 = n18 != 0 ? 16384 : 8192;
                                    n14 |= n18;
                                }
                                if ((n18 = 0x70000 & n21) == 0) {
                                    n18 = (int)(((j30_0)object6).c(n162) ? 1 : 0);
                                    n18 = n18 != 0 ? 131072 : 65536;
                                    n14 |= n18;
                                }
                                if ((n18 = 0x380000 & n21) == 0) {
                                    void var26_47;
                                    n18 = n4;
                                    boolean bl3 = ((j30_0)object6).c(n4);
                                    if (bl3) {
                                        int n22 = 0x100000;
                                    } else {
                                        int n24 = 524288;
                                    }
                                    n14 |= var26_47;
                                } else {
                                    n18 = n4;
                                }
                                int n25 = n21 & 0x1C00000;
                                if (n25 == 0) {
                                    void var26_52;
                                    boolean bl4 = ((j30_0)object6).J(object13);
                                    if (bl4) {
                                        int n26 = 0x800000;
                                    } else {
                                        int n27 = 0x400000;
                                    }
                                    n14 |= var26_52;
                                }
                                if ((n20 = n21 & 0xE000000) == 0) {
                                    void var26_57;
                                    boolean bl5 = ((j30_0)object6).J(object14);
                                    if (bl5) {
                                        int n28 = 0x4000000;
                                    } else {
                                        int n29 = 0x2000000;
                                    }
                                    n14 |= var26_57;
                                }
                                int n30 = n21 & 0x70000000;
                                object13 = pair;
                                if (n30 == 0) {
                                    void var26_62;
                                    boolean bl6 = ((j30_0)object6).J(pair);
                                    if (bl6) {
                                        int n32 = 0x20000000;
                                    } else {
                                        int n34 = 0x10000000;
                                    }
                                    n14 |= var26_62;
                                }
                                if ((n17 = n14 & (n19 = 1533916891)) != (n10 = 306783378) || (n17 = (int)(((j30_0)object6).h() ? 1 : 0)) == 0) break block52;
                                ((j30_0)object6).D();
                                object13 = string3;
                                int n35 = n162;
                                object5 = object14;
                                object14 = object10;
                                object4 = object9;
                                object10 = object6;
                                break block53;
                            }
                            Object object15 = new Ref$ObjectRef();
                            ((Ref$ObjectRef)object15).element = object7 = "";
                            n8 = -260166622;
                            ((j30_0)object6).K(n8);
                            Object object16 = ((j30_0)object6).v();
                            object13 = b30$a.a;
                            int n36 = 0;
                            object5 = null;
                            if (object16 == object13) {
                                object16 = J83.g(null);
                                ((j30_0)object6).o(object16);
                            }
                            object16 = (tr1_0)object16;
                            n36 = -260164492;
                            Object object17 = object7;
                            n17 = 0;
                            object7 = null;
                            object5 = wg2_2.a((j30_0)object6, false, n36);
                            if (object5 == object13) {
                                AJIOApplication.Companion.getClass();
                                object5 = AJIOApplication$a.a();
                                object7 = new ExoPlayer$c((Context)object5);
                                object5 = ((ExoPlayer$c)object7).a();
                                ((j30_0)object6).o(object5);
                            }
                            object5 = (ExoPlayer)object5;
                            ((j30_0)object6).T(false);
                            Intrinsics.checkNotNull(object5);
                            n17 = -260161641;
                            ((j30_0)object6).K(n17);
                            object7 = ((j30_0)object6).v();
                            if (object7 == object13) {
                                object7 = J83.g(Boolean.FALSE);
                                ((j30_0)object6).o(object7);
                            }
                            tr1_0 tr1_02 = (tr1_0)object7;
                            n17 = -260159593;
                            n18 = 0;
                            object3 = null;
                            object7 = wg2_2.a((j30_0)object6, false, n17);
                            if (object7 == object13) {
                                object7 = J83.g(Boolean.FALSE);
                                ((j30_0)object6).o(object7);
                            }
                            tr1_0 tr1_03 = (tr1_0)object7;
                            n17 = -260157499;
                            object7 = wg2_2.a((j30_0)object6, false, n17);
                            if (object7 == object13) {
                                object12 = null;
                                object7 = J83.g(null);
                                ((j30_0)object6).o(object7);
                            } else {
                                object12 = null;
                            }
                            Object object18 = object7;
                            object18 = (tr1_0)object7;
                            n17 = -260154907;
                            object7 = wg2_2.a((j30_0)object6, false, n17);
                            if (object7 == object13) {
                                object7 = J83.g(null);
                                ((j30_0)object6).o(object7);
                            }
                            Object object19 = object7;
                            object19 = (tr1_0)object7;
                            ((j30_0)object6).T(false);
                            object7 = h40_0.a;
                            object7 = h40_0.y();
                            object3 = ((FleekVideoConfigValue)object7).isAutoPlayVideo();
                            object7 = ((FleekVideoConfigValue)object7).isPlayInLoop();
                            Ref$ObjectRef ref$ObjectRef = object15;
                            object15 = Boolean.FALSE;
                            n18 = (int)(Intrinsics.areEqual(object3, object15) ? 1 : 0);
                            int n37 = n18 != 0 && (n17 = (int)(Intrinsics.areEqual(object7, object15) ? 1 : 0)) != 0 ? 0 : 1;
                            object15 = Unit.a;
                            ((j30_0)object6).K(-260142804);
                            n18 = n14 & 0x70;
                            n17 = 32;
                            int n38 = n18 == n17 ? 1 : 0;
                            int n39 = n14 & 0xE;
                            n17 = 4;
                            if (n39 == n17) {
                                n17 = 1;
                            } else {
                                n17 = 0;
                                object7 = null;
                            }
                            int n41 = n38 | n17;
                            object7 = ((j30_0)object6).v();
                            if (n41 == 0 && object7 != object13) {
                                boolean bl7 = false;
                                object2 = null;
                            } else {
                                boolean bl8 = false;
                                object2 = null;
                                object7 = new gs_1(ft1_24, (p83_0)object11, (tr1_0)object16, null);
                                ((j30_0)object6).o(object7);
                            }
                            object7 = (Function2)object7;
                            boolean bl9 = false;
                            ((j30_0)object6).T(false);
                            ly0_0.d((b30_0)object6, object15, (Function2)object7);
                            object7 = (Component)object16.getValue();
                            object8 = object2;
                            object11 = object7;
                            Object object20 = object17;
                            tr1_0 tr1_04 = tr1_02;
                            tr1_0 tr1_05 = tr1_03;
                            object7 = string2;
                            int n42 = n18;
                            object3 = object5;
                            Object object21 = object15;
                            object15 = object16;
                            object17 = object16;
                            object16 = ft1_23;
                            object = object13;
                            object13 = object6;
                            object6 = object18;
                            object12 = object5;
                            object5 = null;
                            object2 = new js_2(string2, (ExoPlayer)object3, (tr1_0)object15, ft1_23, (tr1_0)object18, null);
                            ly0_0.d((b30_0)object13, object11, (Function2)object2);
                            object2 = (Subcomponent)object18.getValue();
                            n38 = 0;
                            object8 = object11;
                            object3 = string3;
                            object15 = object12;
                            object16 = ref$ObjectRef;
                            object6 = object19;
                            n36 = n37;
                            object4 = object18;
                            object14 = object17;
                            object9 = object;
                            object10 = object13;
                            object13 = null;
                            object11 = new ks_1(string2, string3, (ExoPlayer)object12, ref$ObjectRef, (tr1_0)object19, n37 != 0, (tr1_0)object18, (tr1_0)object17, null);
                            ly0_0.d((b30_0)object10, object2, (Function2)object11);
                            object2 = (Subcomponent)object18.getValue();
                            ((j30_0)object10).K(-260101248);
                            n15 = n14;
                            n17 = 256;
                            if ((n14 &= 0x380) == n17) {
                                n36 = 1;
                            } else {
                                n36 = 0;
                                object5 = null;
                            }
                            object8 = ((j30_0)object10).v();
                            if (n36 != 0 || object8 == object9) {
                                n16 = 0;
                                object6 = null;
                                object8 = object5;
                                object7 = object19;
                                object3 = object18;
                                object15 = object17;
                                object16 = string2;
                                object5 = new ls_1((tr1_0)object19, (tr1_0)object18, (tr1_0)object17, string2, null);
                                ((j30_0)object10).o(object5);
                            }
                            object8 = (Function2)object8;
                            object7 = null;
                            ((j30_0)object10).T(false);
                            ly0_0.d((b30_0)object10, object2, (Function2)object8);
                            object13 = object12;
                            object2 = new ds_0(object12, 0);
                            object8 = object21;
                            ly0_0.b(object21, (Function1)object2, (b30_0)object10);
                            boolean bl10 = ft1_24.i.b();
                            object2 = bl10;
                            ((j30_0)object10).K(-260089669);
                            n17 = n42;
                            n14 = 32;
                            if (n42 == n14) {
                                n36 = 1;
                            } else {
                                n36 = 0;
                                object5 = null;
                            }
                            object8 = ((j30_0)object10).v();
                            if (n36 == 0 && object8 != object9) {
                                object4 = tr1_05;
                            } else {
                                object4 = tr1_05;
                                n17 = 0;
                                object7 = null;
                                object8 = new ms_1(ft1_24, tr1_05, null);
                                ((j30_0)object10).o(object8);
                            }
                            object8 = (Function2)object8;
                            object7 = null;
                            ((j30_0)object10).T(false);
                            ly0_0.d((b30_0)object10, object2, (Function2)object8);
                            boolean bl11 = ft1_25.i.b();
                            object2 = bl11;
                            ((j30_0)object10).K(-260085739);
                            n14 = n15 & 0x1C00;
                            n17 = 2048;
                            if (n14 == n17) {
                                n36 = 1;
                            } else {
                                n36 = 0;
                                object5 = null;
                            }
                            object8 = ((j30_0)object10).v();
                            if (n36 == 0 && object8 != object9) {
                                object14 = tr1_04;
                                object9 = null;
                            } else {
                                object14 = tr1_04;
                                object9 = null;
                                object8 = new ns_1(ft1_25, tr1_04, null);
                                ((j30_0)object10).o(object8);
                            }
                            object8 = (Function2)object8;
                            n17 = 0;
                            ((j30_0)object10).T(false);
                            ly0_0.d((b30_0)object10, object2, (Function2)object8);
                            object2 = (Boolean)object4.getValue();
                            object2.getClass();
                            n16 = 0;
                            object8 = object5;
                            object7 = string2;
                            object3 = object13;
                            object15 = object4;
                            object16 = object17;
                            object5 = new os_1(string2, (ExoPlayer)object13, (tr1_0)object4, (tr1_0)object17, null);
                            ly0_0.d((b30_0)object10, object2, (Function2)object5);
                            object2 = (Boolean)object14.getValue();
                            object2.getClass();
                            n38 = 0;
                            object8 = object5;
                            object7 = object18;
                            object3 = object19;
                            object15 = string3;
                            object16 = object13;
                            object6 = object14;
                            object9 = object5;
                            n36 = 0;
                            object5 = null;
                            object8 = new ps_1((tr1_0)object18, (tr1_0)object19, string3, (ExoPlayer)object13, (tr1_0)object14, null);
                            ly0_0.d((b30_0)object10, object2, (Function2)object8);
                            object2 = (Boolean)object14.getValue();
                            boolean bl12 = (Boolean)object2;
                            if (!bl12 && !(bl2 = ((Boolean)(object2 = (Boolean)object4.getValue())).booleanValue())) {
                                n36 = 0;
                                object5 = null;
                            } else {
                                n36 = 1;
                            }
                            object2 = n36 != 0;
                            n38 = 0;
                            object8 = object9;
                            object7 = object13;
                            object3 = string2;
                            object15 = object19;
                            object16 = string3;
                            n16 = n37;
                            object5 = object4;
                            object4 = object14;
                            object14 = object17;
                            object12 = object13;
                            object13 = null;
                            object9 = new hs_1((ExoPlayer)object7, string2, (tr1_0)object19, string3, n37 != 0, (tr1_0)object5, (tr1_0)object4, (tr1_0)object17, null);
                            ly0_0.d((b30_0)object10, object2, (Function2)object9);
                            object2 = Nc$a.e;
                            n14 = n15 >> 12;
                            object7 = null;
                            object2 = HA.e((Nc)object2, false);
                            n17 = ((j30_0)object10).P;
                            object3 = ((j30_0)object10).P();
                            object4 = lP1;
                            object15 = a30_0.c((b30_0)object10, lP1);
                            N20.W.getClass();
                            object16 = N20$a.b;
                            object6 = ((j30_0)object10).a;
                            n16 = object6 instanceof mp;
                            if (n16 == 0) break block54;
                            ((j30_0)object10).A();
                            n16 = ((j30_0)object10).O;
                            if (n16 != 0) {
                                ((j30_0)object10).C((Function0)object16);
                            } else {
                                ((j30_0)object10).n();
                            }
                            object16 = N20$a.e;
                            Ow3.a((b30_0)object10, object2, (Function2)object16);
                            object2 = N20$a.d;
                            Ow3.a((b30_0)object10, object3, (Function2)object2);
                            object2 = N20$a.f;
                            n18 = (int)(((j30_0)object10).O ? 1 : 0);
                            if (n18 != 0 || (n18 = (int)(Intrinsics.areEqual(object3 = ((j30_0)object10).v(), object16 = Integer.valueOf(n17)) ? 1 : 0)) == 0) {
                                rk_0.a(n17, (j30_0)object10, n17, (N20$a$a)object2);
                            }
                            object2 = N20$a.c;
                            Ow3.a((b30_0)object10, object15, (Function2)object2);
                            object2 = (Component)object17.getValue();
                            if (object2 != null) {
                                object5 = ((Component)object2).getUuid();
                                object14 = string2;
                            } else {
                                object14 = string2;
                                n36 = 0;
                                object5 = null;
                            }
                            boolean bl13 = Intrinsics.areEqual(object5, object14);
                            if (!bl13) break block55;
                            object2 = (Subcomponent)object19.getValue();
                            if (object2 != null && (object7 = ((Subcomponent)object2).getUuid()) != null) {
                                object13 = string3;
                            } else {
                                object13 = string3;
                                object7 = object20;
                            }
                            boolean bl14 = Intrinsics.areEqual(object7, object13);
                            if (!bl14) break block56;
                            ((j30_0)object10).K(1081631421);
                            int n44 = n14 & 0x70 | 8;
                            n44 = n44 | (n14 &= 0x380);
                            n15 = n15 >> 18 & 0x1C00;
                            n16 = n44 | n15;
                            n36 = 0;
                            object8 = object12;
                            n17 = n3;
                            n18 = n4;
                            object15 = pair;
                            object16 = object10;
                            nc3_1.b((ExoPlayer)object12, n3, n4, pair, (b30_0)object10, n16, 0);
                            boolean bl15 = false;
                            object2 = null;
                            ((j30_0)object10).T(false);
                            n15 = n3;
                            object5 = string4;
                            n14 = 1;
                            break block57;
                        }
                        object13 = string3;
                    }
                    ((j30_0)object10).K(1081927750);
                    object12.pause();
                    int n45 = n15 >> 24 & 0xE;
                    n15 = n14 & 0x70;
                    int n46 = n45 | n15;
                    n15 = n3;
                    object5 = string4;
                    n14 = 1;
                    AF2.e(string4, n3, (b30_0)object10, n46);
                    boolean bl16 = false;
                    object2 = null;
                    ((j30_0)object10).T(false);
                }
                ((j30_0)object10).T(n14 != 0);
            }
            object10 = ((j30_0)object10).X();
            if (object10 != null) {
                object2 = object9;
                object11 = p83_02;
                ft1_24 = ft1_22;
                object8 = string2;
                object7 = ft1_23;
                object3 = lP1;
                n10 = n3;
                n8 = n4;
                object6 = string3;
                object5 = string4;
                object4 = pair;
                ((CF2)object10).d = object9 = new es_1(p83_02, ft1_22, string2, ft1_23, lP1, n3, n4, string3, string4, pair, n7);
            }
            return;
        }
        s20.a();
        throw null;
    }
}

