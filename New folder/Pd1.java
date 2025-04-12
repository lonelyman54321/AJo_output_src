/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.draw.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class Pd1 {
    /*
     * Enabled aggressive block sorting
     */
    public static final void a(im2 im22, String string2, LP1 lP1, Nc nc, i70_0 i70_02, float f5, TX tX, b30_0 b30_02, int n3, int n4) {
        Object object;
        TX tX3;
        float f6;
        Object object2;
        Object object3;
        Object object4;
        int n7;
        TX tX4;
        int n8;
        int n10;
        float f7;
        int n14;
        int n15;
        Object object5;
        int n16;
        Object object6;
        int n17;
        float f8;
        int n18;
        Object object7;
        int n19;
        int n20;
        int n21;
        Object object8;
        Object object9;
        int n22;
        String string3;
        block38: {
            block37: {
                block36: {
                    block35: {
                        block34: {
                            block33: {
                                block32: {
                                    block31: {
                                        block30: {
                                            string3 = string2;
                                            n22 = n3;
                                            int n24 = 1142754848;
                                            object9 = b30_02;
                                            object8 = b30_02.g(n24);
                                            n21 = n3 & 6;
                                            if (n21 == 0) {
                                                object9 = im22;
                                                n20 = ((j30_0)object8).x(im22) ? 1 : 0;
                                                n20 = n20 != 0 ? 4 : 2;
                                                n20 |= n22;
                                            } else {
                                                object9 = im22;
                                                n20 = n3;
                                            }
                                            n19 = n22 & 0x30;
                                            if (n19 == 0) {
                                                n19 = ((j30_0)object8).J(string3) ? 1 : 0;
                                                n19 = n19 != 0 ? 32 : 16;
                                                n20 |= n19;
                                            }
                                            if ((n19 = n4 & 4) == 0) break block30;
                                            n20 |= 0x180;
                                            break block31;
                                        }
                                        int n25 = n22 & 0x180;
                                        if (n25 != 0) break block31;
                                        object7 = lP1;
                                        n18 = ((j30_0)object8).J(lP1) ? 1 : 0;
                                        if (n18 == 0) break block32;
                                        n18 = 256;
                                        f8 = 3.59E-43f;
                                        break block33;
                                    }
                                    object7 = lP1;
                                    break block34;
                                }
                                n18 = 128;
                                f8 = 1.8E-43f;
                            }
                            n20 |= n18;
                        }
                        n18 = n4 & 8;
                        if (n18 != 0) {
                            n20 |= 0xC00;
                        } else {
                            n17 = n22 & 0xC00;
                            if (n17 == 0) {
                                object6 = nc;
                                n16 = ((j30_0)object8).J(nc) ? 1 : 0;
                                n16 = n16 != 0 ? 2048 : 1024;
                            }
                        }
                        object6 = nc;
                        break block35;
                        n20 |= n16;
                    }
                    n16 = n4 & 0x10;
                    if (n16 != 0) {
                        n20 |= 0x6000;
                    } else {
                        int n26 = n22 & 0x6000;
                        if (n26 == 0) {
                            object5 = i70_02;
                            n15 = ((j30_0)object8).J(i70_02) ? 1 : 0;
                            n15 = n15 != 0 ? 16384 : 8192;
                        }
                    }
                    object5 = i70_02;
                    break block36;
                    n20 |= n15;
                }
                n15 = n4 & 0x20;
                n14 = 196608;
                f7 = 2.75506E-40f;
                if (n15 != 0) {
                    n20 |= n14;
                } else if ((n14 &= n22) == 0) {
                    f7 = f5;
                    n10 = ((j30_0)object8).b(f5) ? 1 : 0;
                    n10 = n10 != 0 ? 131072 : 65536;
                }
                f7 = f5;
                break block37;
                n20 |= n10;
            }
            n10 = n4 & 0x40;
            n8 = 0x180000;
            if (n10 != 0) {
                n20 |= n8;
            } else if ((n8 &= n22) == 0) {
                tX4 = tX;
                n7 = ((j30_0)object8).J(tX) ? 1 : 0;
                n7 = n7 != 0 ? 0x100000 : 524288;
            }
            tX4 = tX;
            break block38;
            n20 |= n7;
        }
        n7 = 599187;
        int n27 = n20 & n7;
        n21 = 599186;
        if (n27 == n21 && (n21 = (int)(((j30_0)object8).h() ? 1 : 0)) != 0) {
            ((j30_0)object8).D();
            object4 = object7;
            object3 = object6;
            object2 = object5;
            f6 = f7;
            tX3 = tX4;
        } else {
            object9 = LP1$a.b;
            if (n19 != 0) {
                object7 = object9;
            }
            object3 = n18 != 0 ? Nc$a.e : object6;
            object2 = n16 != 0 ? i70$a.b : object5;
            if (n15 != 0) {
                n18 = 1065353216;
                f8 = 1.0f;
            } else {
                f8 = f7;
            }
            n7 = 0;
            TX tX5 = n10 != 0 ? null : tX4;
            n8 = 1;
            n17 = 0;
            object6 = null;
            if (string3 != null) {
                ((j30_0)object8).K(1040258775);
                n16 = 32;
                if ((n20 &= 0x70) == n16) {
                    n20 = 1;
                } else {
                    n20 = 0;
                    object4 = null;
                }
                object = ((j30_0)object8).v();
                if (n20 != 0 || object == (object4 = b30$a.a)) {
                    object = new Pd1$c(string3);
                    ((j30_0)object8).o(object);
                }
                object = (Function1)object;
                object9 = CY2.b((LP1)object9, false, (Function1)object);
                ((j30_0)object8).T(false);
            } else {
                n20 = 1040398089;
                ((j30_0)object8).K(n20);
                ((j30_0)object8).T(false);
            }
            object6 = QV.b(object7.then((LP1)object9));
            n21 = 2;
            object = im22;
            object5 = object3;
            Object object10 = object2;
            f7 = f8;
            n20 = 1;
            n8 = n21;
            object9 = b.a((LP1)object6, im22, (Nc)object3, (i70_0)object2, f8, tX5, n21);
            object6 = Pd1$a.a;
            n16 = ((j30_0)object8).P;
            object9 = a30_0.c((b30_0)object8, (LP1)object9);
            object5 = ((j30_0)object8).P();
            N20.W.getClass();
            object10 = N20$a.b;
            mp mp2 = ((j30_0)object8).a;
            n14 = mp2 instanceof mp;
            if (n14 == 0) {
                s20.a();
                throw null;
            }
            ((j30_0)object8).A();
            n14 = ((j30_0)object8).O ? 1 : 0;
            if (n14 != 0) {
                ((j30_0)object8).C((Function0)object10);
            } else {
                ((j30_0)object8).n();
            }
            object10 = N20$a.e;
            Ow3.a((b30_0)object8, object6, (Function2)object10);
            object6 = N20$a.d;
            Ow3.a((b30_0)object8, object5, (Function2)object6);
            object6 = N20$a.c;
            Ow3.a((b30_0)object8, object9, (Function2)object6);
            object9 = N20$a.f;
            n17 = ((j30_0)object8).O ? 1 : 0;
            if (n17 != 0 || (n17 = (int)(Intrinsics.areEqual(object6 = ((j30_0)object8).v(), object5 = Integer.valueOf(n16)) ? 1 : 0)) == 0) {
                rk_0.a(n16, (j30_0)object8, n16, (N20$a$a)object9);
            }
            ((j30_0)object8).T(n20 != 0);
            object4 = object7;
            f6 = f8;
            tX3 = tX5;
        }
        object = ((j30_0)object8).X();
        if (object != null) {
            object8 = object5;
            object9 = im22;
            string3 = string2;
            n22 = n3;
            n17 = n4;
            ((CF2)object).d = object5 = new Pd1$b(im22, string2, (LP1)object4, (Nc)object3, (i70_0)object2, f6, tX3, n3, n4);
        }
    }
}

