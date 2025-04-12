/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from we0
 */
public final class we0_1 {
    /*
     * Enabled aggressive block sorting
     */
    public static final void a(gr3 gr32, LP1 lP1, un0_0 un0_02, Function1 function1, u10 u102, b30_0 b30_02, int n3) {
        Object object;
        Lambda lambda;
        Object object2;
        Object object3;
        int n4;
        u10 u103;
        un0_0 un0_03;
        LP1 lP12;
        Object object4;
        block40: {
            Object object5;
            int n7;
            int n8;
            long[] lArray;
            int n10;
            int n14;
            Object object6;
            Object object7;
            Object object8;
            Object object9;
            int n15;
            block37: {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState;
                Object object10;
                int n16;
                block38: {
                    block39: {
                        int n17;
                        object4 = gr32;
                        lP12 = lP1;
                        un0_03 = un0_02;
                        u103 = u102;
                        n4 = n3;
                        int n18 = 679005231;
                        object3 = b30_02;
                        object2 = b30_02.g(n18);
                        n15 = n3 & 6;
                        n16 = 4;
                        if (n15 == 0) {
                            n15 = (int)(((j30_0)object2).J(gr32) ? 1 : 0);
                            n15 = n15 != 0 ? 4 : 2;
                            n15 |= n4;
                        } else {
                            n15 = n3;
                        }
                        int n19 = n4 & 0x30;
                        if (n19 == 0) {
                            n19 = (int)(((j30_0)object2).J(lP12) ? 1 : 0);
                            n19 = n19 != 0 ? 32 : 16;
                            n15 |= n19;
                        }
                        if ((n19 = n4 & 0x180) == 0) {
                            n19 = (int)(((j30_0)object2).x(un0_03) ? 1 : 0);
                            n19 = n19 != 0 ? 256 : 128;
                            n15 |= n19;
                        }
                        n15 |= 0xC00;
                        n19 = n4 & 0x6000;
                        if (n19 == 0) {
                            n19 = (int)(((j30_0)object2).x(u103) ? 1 : 0);
                            n19 = n19 != 0 ? 16384 : 8192;
                            n15 |= n19;
                        }
                        if ((n19 = n15 & 0x2493) != (n17 = 9362) || (n19 = (int)(((j30_0)object2).h() ? 1 : 0)) == 0) break block39;
                        ((j30_0)object2).D();
                        object3 = function1;
                        gr3 gr33 = object4;
                        LP1 lP13 = lP12;
                        break block40;
                    }
                    lambda = pe0_1.c;
                    object9 = ((j30_0)object2).v();
                    object10 = b30$a.a;
                    object8 = ((gr3)object4).a;
                    if (object9 == object10) {
                        object9 = new p83_0();
                        object7 = ((Mr3)object8).a();
                        ((p83_0)object9).add(object7);
                        ((j30_0)object2).o(object9);
                    }
                    object9 = (p83_0)object9;
                    object7 = ((j30_0)object2).v();
                    if (object7 == object10) {
                        object7 = et2_1.d();
                        ((j30_0)object2).o(object7);
                    }
                    object7 = (nr1_1)object7;
                    object8 = ((Mr3)object8).a();
                    parcelableSnapshotMutableState = ((gr3)object4).d;
                    object6 = parcelableSnapshotMutableState.getValue();
                    n14 = Intrinsics.areEqual(object8, object6);
                    int n20 = 1;
                    n10 = 0;
                    lArray = null;
                    if (n14 != 0) {
                        ((j30_0)object2).K(860660313);
                        n14 = ((p83_0)object9).size();
                        if (n14 == n20 && (n14 = (int)(Intrinsics.areEqual(object8 = ((p83_0)object9).get(0), object6 = parcelableSnapshotMutableState.getValue()) ? 1 : 0)) != 0) {
                            n15 = 860984945;
                            ((j30_0)object2).K(n15);
                            ((j30_0)object2).T(false);
                        } else {
                            n14 = 860794667;
                            ((j30_0)object2).K(n14);
                            if ((n15 &= 0xE) == n16) {
                                n15 = 1;
                            } else {
                                n15 = 0;
                                object3 = null;
                            }
                            object = ((j30_0)object2).v();
                            if (n15 != 0 || object == object10) {
                                object = new qe0_1((gr3)object4);
                                ((j30_0)object2).o(object);
                            }
                            object = (Function1)object;
                            cx_2.w((List)object9, (Function1)object);
                            ((nr1_1)object7).c();
                            ((j30_0)object2).T(false);
                        }
                        ((j30_0)object2).T(false);
                    } else {
                        n15 = 860990897;
                        ((j30_0)object2).K(n15);
                        ((j30_0)object2).T(false);
                    }
                    object3 = parcelableSnapshotMutableState.getValue();
                    if (object3 != null) {
                        object7.getClass();
                        n16 = object3.hashCode();
                    } else {
                        n16 = 0;
                        object = null;
                    }
                    int n21 = (n16 *= -862048943) << 16;
                    n16 ^= n21;
                    n21 = n16 & 0x7F;
                    n14 = ((dt2_0)object7).d;
                    n16 = n16 >>> 7 & n14;
                    n20 = 0;
                    object6 = null;
                    while (true) {
                        int n22;
                        block41: {
                            int n24;
                            block36: {
                                long l2;
                                long l3;
                                lArray = ((dt2_0)object7).a;
                                int n25 = n16 >> 3;
                                int n26 = n16 & 7;
                                n4 = n26 << 3;
                                long l4 = lArray[n25] >>> n4;
                                n24 = 1;
                                long l7 = lArray[++n25];
                                n10 = 64 - n4;
                                long l8 = l7 << n10;
                                long l12 = -((long)n4) >> 63 & l8;
                                l12 = l4 | l12;
                                n4 = n20;
                                long l14 = n21;
                                long l15 = 0x101010101010101L;
                                l14 = l14 * l15 ^ l12;
                                l15 = l14 - l15;
                                l14 ^= (long)-1;
                                l14 = l15 & l14;
                                l15 = -9187201950435737472L;
                                l14 &= l15;
                                n22 = n21;
                                while ((l3 = (l2 = l14 - (l7 = 0L)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) != false) {
                                    n24 = Long.numberOfTrailingZeros(l14) >> 3;
                                    object10 = ((dt2_0)object7).b[n24 = n16 + n24 & n14];
                                    n21 = (int)(Intrinsics.areEqual(object10, object3) ? 1 : 0);
                                    if (n21 == 0) {
                                        l7 = l14 - 1L;
                                        l14 &= l7;
                                        continue;
                                    }
                                    break block36;
                                }
                                l14 = (l12 ^ (long)-1) << 6;
                                long l16 = (l12 = l12 & l14 & l15) - l7;
                                n21 = (int)(l16 == 0L ? 0 : (l16 < 0L ? -1 : 1));
                                if (n21 == 0) break block41;
                                n24 = -1;
                            }
                            if (n24 >= 0) {
                                n8 = 1;
                            } else {
                                n8 = 0;
                                object4 = null;
                            }
                            if (n8 == 0) break;
                            n7 = 0;
                            lP12 = null;
                            object10 = gr32;
                            n8 = 861812273;
                            ((j30_0)object2).K(n8);
                            ((j30_0)object2).T(false);
                            break block37;
                        }
                        object10 = gr32;
                        object6 = lP1;
                        n8 = 1;
                        n10 = 0;
                        lArray = null;
                        n7 = n4 + 8;
                        n16 = n16 + n7 & n14;
                        n4 = n3;
                        object4 = gr32;
                        n21 = n22;
                        n20 = n7;
                        lP12 = lP1;
                    }
                    n8 = 861052122;
                    ((j30_0)object2).K(n8);
                    object4 = ((p83_0)object9).listIterator();
                    n7 = 0;
                    lP12 = null;
                    while (true) {
                        object3 = object4;
                        object3 = (ob3_2)object4;
                        n4 = (int)(((ob3_2)object3).hasNext() ? 1 : 0);
                        if (n4 == 0) break;
                        object3 = ((ob3_2)object3).next();
                        lambda.getClass();
                        object5 = parcelableSnapshotMutableState.getValue();
                        n15 = (int)(Intrinsics.areEqual(object3, object5) ? 1 : 0);
                        if (n15 != 0) {
                            n8 = -1;
                            break block38;
                        }
                        ++n7;
                    }
                    n8 = -1;
                    n7 = -1;
                }
                if (n7 == n8) {
                    object4 = parcelableSnapshotMutableState.getValue();
                    ((p83_0)object9).add(object4);
                } else {
                    object4 = parcelableSnapshotMutableState.getValue();
                    ((p83_0)object9).set(n7, object4);
                }
                ((nr1_1)object7).c();
                n8 = ((p83_0)object9).size();
                lP12 = null;
                for (n7 = 0; n7 < n8; ++n7) {
                    object3 = ((p83_0)object9).get(n7);
                    object10 = gr32;
                    object5 = new ue0_2(gr32, un0_03, object3, u103);
                    n16 = -1426421288;
                    object5 = v10.c(n16, (fx0_2)object5, (b30_0)object2);
                    ((nr1_1)object7).i(object3, object5);
                }
                n7 = 0;
                lP12 = null;
                object10 = gr32;
                ((j30_0)object2).T(false);
            }
            object4 = HA.e(Nc$a.a, false);
            n7 = ((j30_0)object2).P;
            object3 = ((j30_0)object2).P();
            object6 = lP1;
            object5 = a30_0.c((b30_0)object2, lP1);
            N20.W.getClass();
            object = N20$a.b;
            object8 = ((j30_0)object2).a;
            n14 = object8 instanceof mp;
            if (n14 == 0) {
                s20.a();
                throw null;
            }
            ((j30_0)object2).A();
            n14 = (int)(((j30_0)object2).O ? 1 : 0);
            if (n14 != 0) {
                ((j30_0)object2).C((Function0)object);
            } else {
                ((j30_0)object2).n();
            }
            object = N20$a.e;
            Ow3.a((b30_0)object2, object4, (Function2)object);
            object4 = N20$a.d;
            Ow3.a((b30_0)object2, object3, (Function2)object4);
            object4 = N20$a.f;
            n15 = (int)(((j30_0)object2).O ? 1 : 0);
            if (n15 != 0 || (n15 = (int)(Intrinsics.areEqual(object3 = ((j30_0)object2).v(), object = Integer.valueOf(n7)) ? 1 : 0)) == 0) {
                rk_0.a(n7, (j30_0)object2, n7, (N20$a$a)object4);
            }
            object4 = N20$a.c;
            Ow3.a((b30_0)object2, object5, (Function2)object4);
            ((j30_0)object2).K(-187482432);
            n8 = ((p83_0)object9).size();
            lP12 = null;
            for (n7 = 0; n7 < n8; ++n7) {
                object3 = ((p83_0)object9).get(n7);
                lambda.getClass();
                n4 = -1081873445;
                ((j30_0)object2).z(n4, object3);
                object3 = (Function2)((dt2_0)object7).b(object3);
                if (object3 == null) {
                    n15 = 821713034;
                    ((j30_0)object2).K(n15);
                    n10 = 0;
                    lArray = null;
                } else {
                    n10 = 0;
                    lArray = null;
                    n4 = -1081871785;
                    ((j30_0)object2).K(n4);
                    object5 = 0;
                    object3.invoke(object2, object5);
                }
                ((j30_0)object2).T(false);
                ((j30_0)object2).T(false);
            }
            n10 = 0;
            lArray = null;
            ((j30_0)object2).T(false);
            n8 = 1;
            ((j30_0)object2).T(n8 != 0);
            object3 = lambda;
        }
        object = ((j30_0)object2).X();
        if (object != null) {
            object2 = lambda;
            object4 = gr32;
            lP12 = lP1;
            un0_03 = un0_02;
            u103 = u102;
            n4 = n3;
            lambda = new ve0_2(gr32, lP1, un0_02, (Function1)object3, u102, n3);
            ((CF2)object).d = lambda;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static final void b(Boolean bl2, LP1 lP1, un0_0 un0_02, String string2, u10 u102, b30_0 b30_02, int n3) {
        Object object;
        Object object2;
        Object object3;
        boolean bl3;
        int n4;
        int n7;
        int n8 = n3;
        int n10 = -310686752;
        Object object4 = b30_02;
        Object object5 = b30_02.g(n10);
        int n14 = n3 & 6;
        if (n14 == 0) {
            n14 = n3 & 8;
            n14 = n14 == 0 ? (int)(((j30_0)object5).J(bl2) ? 1 : 0) : (int)(((j30_0)object5).x(bl2) ? 1 : 0);
            n14 = n14 != 0 ? 4 : 2;
            n14 |= n8;
        } else {
            n14 = n3;
        }
        n14 |= 0x30;
        int n15 = n8 & 0x180;
        if (n15 == 0) {
            void var13_16;
            boolean n74 = ((j30_0)object5).x(un0_02);
            if (n74) {
                int n16 = 256;
            } else {
                int n17 = 128;
            }
            n14 |= var13_16;
        }
        n14 |= 0xC00;
        int n18 = n8 & 0x6000;
        if (n18 == 0) {
            void var13_21;
            boolean bl4 = ((j30_0)object5).x(u102);
            if (bl4) {
                int n19 = 16384;
            } else {
                int n20 = 8192;
            }
            n14 |= var13_21;
        }
        if ((n7 = n14 & 0x2493) == (n4 = 9362) && (bl3 = ((j30_0)object5).h())) {
            ((j30_0)object5).D();
            object4 = lP1;
            object3 = string2;
        } else {
            object3 = LP1$a.b;
            n4 = n14 & 0xE;
            int n21 = n14 >> 6 & 0x70;
            String string3 = "Crossfade";
            object2 = yr3.d(bl2, string3, (b30_0)object5, n4 |= n21, 0);
            n21 = 58352;
            int n22 = n14 & n21;
            object = object3;
            we0_1.a((gr3)object2, (LP1)object3, un0_02, null, u102, (b30_0)object5, n22);
            object4 = object3;
            object3 = string3;
        }
        object2 = ((j30_0)object5).X();
        if (object2 != null) {
            object5 = object;
            n8 = n3;
            object = new oe0_1(bl2, (LP1)object4, un0_02, (String)object3, u102, n3);
            ((CF2)object2).d = object;
        }
    }
}

