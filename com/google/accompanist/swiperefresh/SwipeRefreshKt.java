/*
 * Decompiled with CFR 0.152.
 */
package com.google.accompanist.swiperefresh;

import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.h;
import androidx.compose.ui.input.nestedscroll.a;
import com.google.accompanist.swiperefresh.ComposableSingletons$SwipeRefreshKt;
import com.google.accompanist.swiperefresh.SwipeRefreshKt$SwipeRefresh$1$1;
import com.google.accompanist.swiperefresh.SwipeRefreshKt$SwipeRefresh$3;
import com.google.accompanist.swiperefresh.SwipeRefreshKt$SwipeRefresh$nestedScrollConnection$1$1;
import com.google.accompanist.swiperefresh.SwipeRefreshNestedScrollConnection;
import com.google.accompanist.swiperefresh.SwipeRefreshState;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class SwipeRefreshKt {
    private static final float DragMultiplier = 0.5f;

    /*
     * Enabled aggressive block sorting
     */
    public static final void SwipeRefresh-Fsagccs(SwipeRefreshState swipeRefreshState, Function0 function0, LP1 lP1, boolean n3, float f5, Nc nc, mk2_0 object, hx0_2 hx0_22, boolean bl2, Function2 function2, b30_0 object2, int n4, int n7) {
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        int n8;
        int n10;
        Object object7;
        int n14;
        Object object8;
        float f6;
        int n15;
        int n16;
        float f7;
        float f8;
        int n17;
        int n18;
        int n19;
        Object object9;
        int n20;
        float f11;
        int n21;
        int n22;
        Object object10;
        int n24;
        int n25;
        Object object11;
        Object object12;
        Object object13;
        block69: {
            block68: {
                block67: {
                    int n26;
                    block66: {
                        block65: {
                            block64: {
                                block63: {
                                    block62: {
                                        block61: {
                                            block60: {
                                                block59: {
                                                    object13 = swipeRefreshState;
                                                    object12 = function0;
                                                    object11 = function2;
                                                    n25 = n4;
                                                    n24 = n7;
                                                    Intrinsics.checkNotNullParameter(swipeRefreshState, "state");
                                                    Intrinsics.checkNotNullParameter(function0, "onRefresh");
                                                    Intrinsics.checkNotNullParameter(function2, "content");
                                                    int n27 = 2017402940;
                                                    object10 = object2.g(n27);
                                                    n22 = n7 & 1;
                                                    if (n22 != 0) {
                                                        n22 = n4 | 6;
                                                    } else {
                                                        n22 = n4 & 0xE;
                                                        if (n22 == 0) {
                                                            n22 = (int)(((j30_0)object10).J(swipeRefreshState) ? 1 : 0);
                                                            n22 = n22 != 0 ? 4 : 2;
                                                            n22 |= n25;
                                                        } else {
                                                            n22 = n4;
                                                        }
                                                    }
                                                    n21 = n24 & 2;
                                                    if (n21 != 0) {
                                                        n22 |= 0x30;
                                                    } else {
                                                        n21 = n25 & 0x70;
                                                        if (n21 == 0) {
                                                            n21 = (int)(((j30_0)object10).x(object12) ? 1 : 0);
                                                            if (n21 != 0) {
                                                                n21 = 32;
                                                                f11 = 4.5E-44f;
                                                            } else {
                                                                n21 = 16;
                                                                f11 = 2.2E-44f;
                                                            }
                                                            n22 |= n21;
                                                        }
                                                    }
                                                    n21 = n24 & 4;
                                                    if (n21 != 0) {
                                                        n22 |= 0x180;
                                                    } else {
                                                        n20 = n25 & 0x380;
                                                        if (n20 == 0) {
                                                            object9 = lP1;
                                                            n19 = (int)(((j30_0)object10).J(lP1) ? 1 : 0);
                                                            n19 = n19 != 0 ? 256 : 128;
                                                        }
                                                    }
                                                    object9 = lP1;
                                                    break block59;
                                                    n22 |= n19;
                                                }
                                                n19 = n24 & 8;
                                                if (n19 == 0) break block60;
                                                n22 |= 0xC00;
                                                break block61;
                                            }
                                            n18 = n25 & 0x1C00;
                                            if (n18 != 0) break block61;
                                            n18 = n3;
                                            n17 = (int)(((j30_0)object10).a(n3 != 0) ? 1 : 0);
                                            if (n17 == 0) break block62;
                                            n17 = 2048;
                                            f8 = 2.87E-42f;
                                            break block63;
                                        }
                                        n18 = n3;
                                        break block64;
                                    }
                                    n17 = 1024;
                                    f8 = 1.435E-42f;
                                }
                                n22 |= n17;
                            }
                            n17 = n24 & 0x10;
                            if (n17 != 0) {
                                n22 |= 0x6000;
                            } else {
                                f7 = 8.0356E-41f;
                                n16 = 0xE000 & n25;
                                if (n16 == 0) {
                                    f7 = f5;
                                    n15 = (int)(((j30_0)object10).b(f5) ? 1 : 0);
                                    n15 = n15 != 0 ? 16384 : 8192;
                                }
                            }
                            f7 = f5;
                            break block65;
                            n22 |= n15;
                        }
                        n15 = n24 & 0x20;
                        if (n15 != 0) {
                            int n28 = 196608;
                            f6 = 2.75506E-40f;
                            n22 |= n28;
                        } else {
                            f6 = 6.42848E-40f;
                            int n29 = 0x70000 & n25;
                            if (n29 == 0) {
                                object8 = nc;
                                n14 = ((j30_0)object10).J(nc);
                                n14 = n14 != 0 ? 131072 : 65536;
                            }
                        }
                        object8 = nc;
                        break block66;
                        n22 |= n14;
                    }
                    n14 = n24 & 0x40;
                    if (n14 != 0) {
                        n26 = 0x180000;
                        n22 |= n26;
                        object7 = object;
                    } else {
                        n26 = n25 & 0x380000;
                        object7 = object;
                        if (n26 == 0) {
                            n26 = (int)(((j30_0)object10).J(object) ? 1 : 0);
                            n26 = n26 != 0 ? 0x100000 : 524288;
                            n22 |= n26;
                        }
                    }
                    n10 = n24 & 0x80;
                    if (n10 != 0) {
                        n26 = 0xC00000;
                        n22 |= n26;
                        object9 = hx0_22;
                    } else {
                        n26 = n25 & 0x1C00000;
                        object9 = hx0_22;
                        if (n26 == 0) {
                            n26 = (int)(((j30_0)object10).x(hx0_22) ? 1 : 0);
                            n26 = n26 != 0 ? 0x800000 : 0x400000;
                            n22 |= n26;
                        }
                    }
                    n20 = n24 & 0x100;
                    if (n20 != 0) {
                        n26 = 0x6000000;
                        n22 |= n26;
                        n18 = (int)(bl2 ? 1 : 0);
                    } else {
                        n26 = n25 & 0xE000000;
                        n18 = (int)(bl2 ? 1 : 0);
                        if (n26 == 0) {
                            n26 = (int)(((j30_0)object10).a(bl2) ? 1 : 0);
                            n26 = n26 != 0 ? 0x4000000 : 0x2000000;
                            n22 |= n26;
                        }
                    }
                    n18 = n24 & 0x200;
                    if (n18 == 0) break block67;
                    n18 = 0x30000000;
                    break block68;
                }
                n18 = 0x70000000 & n25;
                if (n18 != 0) break block69;
                n18 = (int)(((j30_0)object10).x(object11) ? 1 : 0);
                n18 = n18 != 0 ? 0x20000000 : 0x10000000;
            }
            n22 |= n18;
        }
        if ((n18 = 0x5B6DB6DB & n22) == (n25 = 306783378) && (n18 = (int)(((j30_0)object10).h() ? 1 : 0)) != 0) {
            ((j30_0)object10).D();
            object7 = lP1;
            n8 = n3;
            object6 = object;
            object5 = hx0_22;
            n17 = (int)(bl2 ? 1 : 0);
            f11 = f7;
            object9 = object8;
        } else {
            boolean bl3;
            Object object14;
            object5 = LP1$a.b;
            Object object15 = n21 != 0 ? object5 : lP1;
            n19 = n19 != 0 ? 1 : n3;
            if (n17 != 0) {
                n17 = 80;
                f8 = n17;
            } else {
                f8 = f7;
            }
            object4 = n15 != 0 ? Nc$a.b : object8;
            n15 = 0;
            object3 = null;
            if (n14 != 0) {
                f6 = 0.0f;
                object14 = new nk2_0(f6, f6, f6, f6);
            } else {
                object14 = object;
            }
            object7 = n10 != 0 ? ComposableSingletons$SwipeRefreshKt.INSTANCE.getLambda-1$swiperefresh_release() : hx0_22;
            n20 = n20 != 0 ? 1 : (int)(bl2 ? 1 : 0);
            object8 = ((j30_0)object10).v();
            object3 = b30$a.a;
            if (object8 == object3) {
                object8 = Qx2.a(ly0_0.f(f.a, (b30_0)object10), (j30_0)object10);
            }
            object8 = ((Q30)object8).a;
            Object object16 = J83.j(object12, (b30_0)object10);
            n14 = (int)(swipeRefreshState.isSwipeInProgress() ? 1 : 0);
            object12 = n14 != 0;
            Object object17 = object7;
            ((j30_0)object10).u(809266041);
            n10 = n22 & 0xE;
            Object object18 = object4;
            n16 = 4;
            f7 = 5.6E-45f;
            Object object19 = object14;
            if (n10 == n16) {
                n16 = 1;
                f7 = Float.MIN_VALUE;
            } else {
                n16 = 0;
                f7 = 0.0f;
                object4 = null;
            }
            object14 = ((j30_0)object10).v();
            Object object20 = object5;
            n18 = 0;
            object5 = null;
            if (n16 != 0 || object14 == object3) {
                object14 = new SwipeRefreshKt$SwipeRefresh$1$1((SwipeRefreshState)object13, null);
                ((j30_0)object10).o(object14);
            }
            object14 = (Function2)object14;
            n16 = 0;
            f7 = 0.0f;
            object4 = null;
            ((j30_0)object10).T(false);
            ly0_0.d((b30_0)object10, object12, (Function2)object14);
            object12 = O30.f;
            object12 = (Vo0)((j30_0)object10).j((H30)object12);
            float f12 = object12.J0(f8);
            ((j30_0)object10).u(809266398);
            n25 = 4;
            if (n10 == n25) {
                n25 = 1;
            } else {
                n25 = 0;
                object14 = null;
            }
            n16 = (int)(((j30_0)object10).J(object8) ? 1 : 0);
            object4 = ((j30_0)object10).v();
            if ((n25 |= n16) != 0 || object4 == object3) {
                object14 = new SwipeRefreshKt$SwipeRefresh$nestedScrollConnection$1$1((ib3_0)object16);
                object4 = new SwipeRefreshNestedScrollConnection((SwipeRefreshState)object13, (i90_0)object8, (Function0)object14);
                ((j30_0)object10).o(object4);
            }
            object4 = (SwipeRefreshNestedScrollConnection)object4;
            object14 = null;
            ((j30_0)object10).T(false);
            ((SwipeRefreshNestedScrollConnection)object4).setEnabled(n19 != 0);
            ((SwipeRefreshNestedScrollConnection)object4).setRefreshTrigger(f12);
            object12 = a.a((LP1)object15, (oU1)object4, null);
            object16 = Nc$a.a;
            object4 = HA.e((Nc)object16, false);
            n25 = ((j30_0)object10).P;
            object3 = ((j30_0)object10).P();
            object12 = a30_0.c((b30_0)object10, (LP1)object12);
            N20.W.getClass();
            object8 = N20$a.b;
            object5 = ((j30_0)object10).a;
            object2 = object15;
            n21 = object5 instanceof mp;
            if (n21 == 0) {
                s20.a();
                throw null;
            }
            ((j30_0)object10).A();
            n21 = (int)(((j30_0)object10).O ? 1 : 0);
            if (n21 != 0) {
                ((j30_0)object10).C((Function0)object8);
            } else {
                ((j30_0)object10).n();
            }
            object15 = N20$a.e;
            Ow3.a((b30_0)object10, object4, (Function2)object15);
            object4 = N20$a.d;
            Ow3.a((b30_0)object10, object3, (Function2)object4);
            object3 = N20$a.f;
            n8 = n19;
            n19 = ((j30_0)object10).O;
            if (n19 != 0 || !(bl3 = Intrinsics.areEqual(object6 = ((j30_0)object10).v(), object13 = Integer.valueOf(n25)))) {
                rk_0.a(n25, (j30_0)object10, n25, (N20$a$a)object3);
            }
            object13 = N20$a.c;
            Ow3.a((b30_0)object10, object12, (Function2)object13);
            object12 = d.a;
            n19 = n22 >> 27 & 0xE;
            object6 = n19;
            object11.invoke(object10, object6);
            if (n20 == 0) {
                object6 = QV.b((LP1)object20);
                object14 = object19;
            } else {
                object14 = object19;
                object6 = object20;
            }
            object6 = h.d((LP1)object6, (mk2_0)object14);
            object6 = ((d)object12).e((LP1)object6);
            if (n20 != 0) {
                object6 = QV.b((LP1)object6);
            }
            int n30 = n20;
            object9 = null;
            object11 = HA.e((Nc)object16, false);
            n20 = ((j30_0)object10).P;
            object = object14;
            object14 = ((j30_0)object10).P();
            object6 = a30_0.c((b30_0)object10, (LP1)object6);
            int n32 = n10;
            n10 = object5 instanceof mp;
            if (n10 == 0) {
                s20.a();
                throw null;
            }
            ((j30_0)object10).A();
            n10 = (int)(((j30_0)object10).O ? 1 : 0);
            if (n10 != 0) {
                ((j30_0)object10).C((Function0)object8);
            } else {
                ((j30_0)object10).n();
            }
            Ow3.a((b30_0)object10, object11, (Function2)object15);
            Ow3.a((b30_0)object10, object14, (Function2)object4);
            n10 = (int)(((j30_0)object10).O ? 1 : 0);
            if (n10 != 0 || (n10 = (int)(Intrinsics.areEqual(object7 = ((j30_0)object10).v(), object11 = Integer.valueOf(n20)) ? 1 : 0)) == 0) {
                rk_0.a(n20, (j30_0)object10, n20, (N20$a$a)object3);
            }
            Ow3.a((b30_0)object10, object6, (Function2)object13);
            object9 = object18;
            object7 = object20;
            object12 = ((d)object12).a((LP1)object20, (Nc)object18);
            n10 = 0;
            object7 = HA.e((Nc)object16, false);
            n19 = ((j30_0)object10).P;
            object11 = ((j30_0)object10).P();
            object12 = a30_0.c((b30_0)object10, (LP1)object12);
            n18 = object5 instanceof mp;
            if (n18 == 0) {
                s20.a();
                throw null;
            }
            ((j30_0)object10).A();
            n18 = (int)(((j30_0)object10).O ? 1 : 0);
            if (n18 != 0) {
                ((j30_0)object10).C((Function0)object8);
            } else {
                ((j30_0)object10).n();
            }
            Ow3.a((b30_0)object10, object7, (Function2)object15);
            Ow3.a((b30_0)object10, object11, (Function2)object4);
            n10 = (int)(((j30_0)object10).O ? 1 : 0);
            if (n10 != 0 || (n10 = (int)(Intrinsics.areEqual(object7 = ((j30_0)object10).v(), object15 = Integer.valueOf(n19)) ? 1 : 0)) == 0) {
                rk_0.a(n19, (j30_0)object10, n19, (N20$a$a)object3);
            }
            Ow3.a((b30_0)object10, object12, (Function2)object13);
            object13 = new xs0_0(f8);
            int n34 = n22 >> 9 & 0x70;
            n34 = n32 | n34;
            n22 = n22 >> 15 & 0x380;
            object12 = n34 |= n22;
            object7 = object17;
            object17.invoke(swipeRefreshState, object13, object10, object12);
            bl3 = true;
            ((j30_0)object10).T(bl3);
            ((j30_0)object10).T(bl3);
            ((j30_0)object10).T(bl3);
            object6 = object;
            object5 = object17;
            f11 = f8;
            n17 = n30;
            object7 = object2;
        }
        object4 = ((j30_0)object10).X();
        if (object4 != null) {
            object10 = object3;
            object13 = swipeRefreshState;
            object12 = function0;
            n10 = n8;
            object11 = function2;
            n25 = n4;
            n24 = n7;
            ((CF2)object4).d = object3 = new SwipeRefreshKt$SwipeRefresh$3(swipeRefreshState, function0, (LP1)object7, n8 != 0, f11, (Nc)object9, (mk2_0)object6, (hx0_2)object5, n17 != 0, function2, n4, n7);
        }
    }

    public static final SwipeRefreshState rememberSwipeRefreshState(boolean bl2, b30_0 b30_02, int n3) {
        b30_02.u(-1963273955);
        n3 = 46087865;
        b30_02.u(n3);
        Object object = b30_02.v();
        b30$a$a b30$a$a = b30$a.a;
        if (object == b30$a$a) {
            object = new SwipeRefreshState(bl2);
            b30_02.o(object);
        }
        object = (SwipeRefreshState)object;
        b30_02.I();
        ((SwipeRefreshState)object).setRefreshing(bl2);
        b30_02.I();
        return object;
    }
}

