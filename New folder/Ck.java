/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class Ck {
    /*
     * Enabled aggressive block sorting
     */
    public static final void a(gr3 gr32, LP1 lP1, Function1 function1, Nc nc, Function1 function12, u10 u102, b30_0 object, int n3) {
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        Object object7;
        int n4;
        Object object8 = gr32;
        LP1 lP12 = lP1;
        Function1 function13 = function1;
        Object object9 = nc;
        Function1 function14 = function12;
        int n7 = n3;
        int n8 = 0;
        Object object10 = null;
        int n10 = 1;
        Object object11 = object;
        j30_0 j30_02 = object.g(-114689412);
        int n14 = n3 & 6;
        int n15 = 4;
        if (n14 == 0) {
            n14 = j30_02.J(gr32) ? 1 : 0;
            n14 = n14 != 0 ? 4 : 2;
            n14 |= n7;
        } else {
            n14 = n3;
        }
        int n16 = n7 & 0x30;
        if (n16 == 0) {
            n16 = j30_02.J(lP12) ? 1 : 0;
            n16 = n16 != 0 ? 32 : 16;
            n14 |= n16;
        }
        if ((n16 = n7 & 0x180) == 0) {
            n16 = j30_02.x(function13) ? 1 : 0;
            n16 = n16 != 0 ? 256 : 128;
            n14 |= n16;
        }
        if ((n16 = n7 & 0xC00) == 0) {
            n16 = j30_02.J(object9) ? 1 : 0;
            n16 = n16 != 0 ? 2048 : 1024;
            n14 |= n16;
        }
        if ((n16 = n7 & 0x6000) == 0) {
            n16 = j30_02.x(function14) ? 1 : 0;
            n16 = n16 != 0 ? 16384 : 8192;
            n14 |= n16;
        }
        if ((n16 = 0x30000 & n7) == 0) {
            n16 = j30_02.x(u102) ? 1 : 0;
            n16 = n16 != 0 ? 131072 : 65536;
            n14 |= n16;
        }
        if ((n16 = 0x12493 & n14) == (n4 = 74898) && (n16 = (int)(j30_02.h() ? 1 : 0)) != 0) {
            j30_02.D();
        } else {
            int n17;
            int n18;
            Object object12;
            Object object13;
            Object object14;
            Object object15 = LP1$a.b;
            object7 = O30.l;
            object7 = (bp1_0)((Object)j30_02.j((H30)object7));
            if ((n14 &= 0xE) == n15) {
                n16 = 1;
            } else {
                n16 = 0;
                object7 = null;
            }
            object6 = j30_02.v();
            object5 = b30$a.a;
            if (n16 != 0 || object6 == object5) {
                object6 = new Hk((gr3)object8, (Nc)object9);
                j30_02.o(object6);
            }
            object4 = object6;
            object4 = (Hk)object6;
            if (n14 == n15) {
                n16 = 1;
            } else {
                n16 = 0;
                object7 = null;
            }
            object6 = j30_02.v();
            if (n16 != 0 || object6 == object5) {
                object7 = ((gr3)object8).a.a();
                object6 = new Object[n10];
                object6[0] = object7;
                object7 = new p83_0();
                object6 = tp_2.M((Object[])object6);
                ((p83_0)object7).addAll((Collection)object6);
                j30_02.o(object7);
                object6 = object7;
            }
            object6 = (p83_0)object6;
            if (n14 == n15) {
                n14 = 1;
            } else {
                n14 = 0;
                object3 = null;
            }
            object11 = j30_02.v();
            if (n14 != 0 || object11 == object5) {
                object11 = et2_1.d();
                j30_02.o(object11);
            }
            object7 = object11;
            object7 = (nr1_1)object11;
            object3 = ((gr3)object8).a.a();
            n14 = ((p83_0)object6).contains(object3) ? 1 : 0;
            object11 = ((gr3)object8).a;
            if (n14 == 0) {
                ((p83_0)object6).clear();
                object3 = ((Mr3)object11).a();
                ((p83_0)object6).add(object3);
            }
            if ((n14 = (int)(Intrinsics.areEqual(object3 = ((Mr3)object11).a(), object14 = ((h83_0)(object10 = ((gr3)object8).d)).getValue()) ? 1 : 0)) != 0) {
                n14 = ((p83_0)object6).size();
                if (n14 != (n10 = 1) || (n14 = (int)(Intrinsics.areEqual(object14 = ((p83_0)object6).get(0), object3 = ((Mr3)object11).a()) ? 1 : 0)) == 0) {
                    ((p83_0)object6).clear();
                    object3 = ((Mr3)object11).a();
                    ((p83_0)object6).add(object3);
                }
                if ((n14 = ((dt2_0)object7).e) != (n10 = 1) || (n14 = (int)(((dt2_0)object7).a(object3 = ((Mr3)object11).a()) ? 1 : 0)) != 0) {
                    ((nr1_1)object7).c();
                }
                ((Hk)object4).b = object9;
            }
            if ((n14 = (int)(Intrinsics.areEqual(object3 = ((Mr3)object11).a(), object14 = ((h83_0)object10).getValue()) ? 1 : 0)) != 0 || (n14 = (int)(((p83_0)object6).contains(object3 = ((h83_0)object10).getValue()) ? 1 : 0)) != 0) {
                object13 = object4;
            } else {
                block49: {
                    object3 = ((p83_0)object6).listIterator();
                    n10 = 0;
                    object14 = null;
                    while (true) {
                        object13 = object3;
                        object13 = (ob3_2)object3;
                        boolean bl2 = ((ob3_2)object13).hasNext();
                        object = object3;
                        if (!bl2) break;
                        object3 = ((ob3_2)object13).next();
                        object3 = function14.invoke(object3);
                        object13 = object4;
                        object4 = ((h83_0)object10).getValue();
                        n14 = Intrinsics.areEqual(object3, object4 = function14.invoke(object4)) ? 1 : 0;
                        if (n14 != 0) {
                            n14 = -1;
                            break block49;
                        }
                        n14 = 1;
                        n10 += n14;
                        object3 = object;
                        object4 = object13;
                    }
                    object13 = object4;
                    n14 = -1;
                    n10 = -1;
                }
                if (n10 == n14) {
                    object3 = ((h83_0)object10).getValue();
                    ((p83_0)object6).add(object3);
                } else {
                    object3 = ((h83_0)object10).getValue();
                    ((p83_0)object6).set(n10, object3);
                }
            }
            object3 = ((h83_0)object10).getValue();
            n14 = ((dt2_0)object7).a(object3) ? 1 : 0;
            if (n14 != 0 && (n14 = (int)(((dt2_0)object7).a(object3 = ((Mr3)object11).a()) ? 1 : 0)) != 0) {
                j30_02.K(915535767);
                n14 = 0;
                object3 = null;
                j30_02.T(false);
                object9 = object7;
                object = object6;
                object10 = object5;
                object12 = object13;
            } else {
                n14 = 912931457;
                j30_02.K(n14);
                ((nr1_1)object7).c();
                n8 = ((p83_0)object6).size();
                object14 = null;
                for (n10 = 0; n10 < n8; n10 += n14) {
                    object4 = ((p83_0)object6).get(n10);
                    object3 = object11;
                    object8 = object11;
                    object11 = gr32;
                    object9 = object7;
                    object7 = object4;
                    object = object6;
                    object6 = function1;
                    object2 = object4;
                    object12 = object13;
                    object4 = object13;
                    object10 = object5;
                    object5 = object;
                    ((zk)object3)(gr32, object7, function1, (Hk)object13, (p83_0)object, u102);
                    object3 = v10.c(885640742, (fx0_2)object3, j30_02);
                    ((nr1_1)object9).i(object7, object3);
                    n14 = 1;
                    object8 = gr32;
                    object6 = object;
                    n7 = n3;
                    object7 = object9;
                    object5 = object10;
                    object9 = nc;
                }
                object9 = object7;
                object = object6;
                object10 = object5;
                object12 = object13;
                n14 = 0;
                object3 = null;
                j30_02.T(false);
            }
            object3 = gr32.f();
            object8 = object12;
            n15 = j30_02.J(object12) ? 1 : 0;
            n14 = j30_02.J(object3) | n15;
            object11 = j30_02.v();
            if (n14 != 0 || object11 == object10) {
                object11 = object3 = function13.invoke(object8);
                object11 = (j70_0)object3;
                j30_02.o(object11);
            }
            object11 = (j70_0)object11;
            object8.getClass();
            n14 = j30_02.J(object8) ? 1 : 0;
            object7 = j30_02.v();
            if (n14 != 0 || object7 == object10) {
                object3 = Boolean.FALSE;
                object7 = J83.g(object3);
                j30_02.o(object7);
            }
            object7 = (tr1_0)object7;
            object3 = J83.j(((j70_0)object11).d, j30_02);
            object11 = ((Hk)object8).a;
            object6 = ((gr3)object11).a.a();
            n15 = Intrinsics.areEqual(object6, object11 = ((gr3)object11).d.getValue()) ? 1 : 0;
            if (n15 != 0) {
                object11 = Boolean.FALSE;
                object7.setValue(object11);
            } else {
                object11 = object3.getValue();
                if (object11 != null) {
                    object11 = Boolean.TRUE;
                    object7.setValue(object11);
                }
            }
            object11 = (Boolean)object7.getValue();
            n15 = ((Boolean)object11).booleanValue() ? 1 : 0;
            if (n15 != 0) {
                n15 = 249037309;
                j30_02.K(n15);
                object7 = ya3_0.h;
                n18 = 0;
                object5 = null;
                int n19 = 2;
                object11 = ((Hk)object8).a;
                n4 = 0;
                object4 = j30_02;
                object11 = yr3.a((gr3)object11, (Ws3)object7, null, j30_02, 0, n19);
                n16 = j30_02.J(object11) ? 1 : 0;
                object6 = j30_02.v();
                if (n16 != 0 || object6 == object10) {
                    object7 = (W63)object3.getValue();
                    if (object7 == null || (n16 = (int)(object7.a() ? 1 : 0)) != 0) {
                        object15 = QV.b((LP1)object15);
                    }
                    object7 = object15;
                    object6 = new Hk$b((Hk)object8, (gr3$a)object11, (tr1_0)object3);
                    object6 = object15.then((LP1)object6);
                    j30_02.o(object6);
                }
                object15 = object6;
                object15 = (LP1)object6;
                n14 = 0;
                object3 = null;
                j30_02.T(false);
            } else {
                n14 = 0;
                object3 = null;
                n15 = 249353726;
                j30_02.K(n15);
                j30_02.T(false);
            }
            object3 = object15;
            object3 = lP12.then((LP1)object15);
            object11 = j30_02.v();
            if (object11 == object10) {
                object11 = new Dk((Hk)object8);
                j30_02.o(object11);
            }
            object11 = (Dk)object11;
            n16 = j30_02.P;
            object6 = j30_02.P();
            object3 = a30_0.c(j30_02, (LP1)object3);
            N20.W.getClass();
            object4 = N20$a.b;
            object5 = j30_02.a;
            n18 = object5 instanceof mp;
            if (n18 == 0) {
                s20.a();
                throw null;
            }
            j30_02.A();
            n18 = j30_02.O;
            if (n18 != 0) {
                j30_02.C((Function0)object4);
            } else {
                j30_02.n();
            }
            object4 = N20$a.e;
            Ow3.a(j30_02, object11, (Function2)object4);
            object11 = N20$a.d;
            Ow3.a(j30_02, object6, (Function2)object11);
            object11 = N20$a.f;
            n4 = j30_02.O ? 1 : 0;
            if (n4 != 0 || (n4 = (int)(Intrinsics.areEqual(object6 = j30_02.v(), object4 = Integer.valueOf(n16)) ? 1 : 0)) == 0) {
                rk_0.a(n16, j30_02, n16, (N20$a$a)object11);
            }
            object11 = N20$a.c;
            Ow3.a(j30_02, object3, (Function2)object11);
            j30_02.K(-1491001814);
            n14 = ((p83_0)object).size();
            object11 = null;
            for (n15 = 0; n15 < n14; n15 += n16) {
                object6 = object;
                object7 = ((p83_0)object).get(n15);
                n17 = 1908315325;
                object5 = function14.invoke(object7);
                j30_02.z(n17, object5);
                object7 = (Function2)((dt2_0)object9).b(object7);
                if (object7 == null) {
                    n16 = -971711888;
                    j30_02.K(n16);
                    n17 = 0;
                    object4 = null;
                } else {
                    n17 = 0;
                    object4 = null;
                    n18 = 1908317105;
                    j30_02.K(n18);
                    object5 = 0;
                    object7.invoke(j30_02, object5);
                }
                j30_02.T(false);
                j30_02.T(false);
                n16 = 1;
                object = object6;
            }
            n16 = 1;
            n17 = 0;
            object4 = null;
            j30_02.T(false);
            j30_02.T(n16 != 0);
        }
        object9 = j30_02.X();
        if (object9 != null) {
            object3 = object2;
            object11 = gr32;
            object7 = lP1;
            object6 = function1;
            object4 = nc;
            object5 = function12;
            object2 = new ak_0(gr32, lP1, function1, nc, function12, u102, n3);
            ((CF2)object9).d = object2;
        }
    }
}

