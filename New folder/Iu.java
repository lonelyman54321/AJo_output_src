/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class Iu {
    public static final float a;
    public static final float b;
    public static final long c;
    public static final float d;
    public static final float e;
    public static final float f;

    static {
        float f5;
        a = f5 = (float)4;
        b = 8;
        c = Em3.f(10);
        d = f5;
        e = -((float)6);
        f = -f5;
    }

    public static final void a(LP1 lP1, long l2, long l3, gx0_2 gx0_22, b30_0 b30_02, int n3, int n4) {
        block27: {
            Object object;
            long l4;
            int n7;
            Object object2;
            int n8;
            gx0_2 gx0_23;
            long l7;
            block26: {
                float f5;
                int n10;
                float f6;
                int n14;
                int n15;
                Object object3;
                block25: {
                    block24: {
                        block20: {
                            block23: {
                                block22: {
                                    block21: {
                                        l7 = l2;
                                        gx0_23 = gx0_22;
                                        n8 = n3;
                                        int n16 = 1133484502;
                                        object3 = b30_02;
                                        object2 = b30_02.g(n16);
                                        n15 = n3 & 6;
                                        n14 = 2;
                                        if (n15 == 0) {
                                            n15 = ((j30_0)object2).J(lP1) ? 1 : 0;
                                            if (n15 != 0) {
                                                n15 = 4;
                                                f6 = 5.6E-45f;
                                            } else {
                                                n15 = 2;
                                                f6 = 2.8E-45f;
                                            }
                                            n15 |= n8;
                                        } else {
                                            n15 = n3;
                                        }
                                        n7 = n8 & 0x30;
                                        if (n7 == 0) {
                                            n7 = ((j30_0)object2).d(l7) ? 1 : 0;
                                            n7 = n7 != 0 ? 32 : 16;
                                            n15 |= n7;
                                        }
                                        if ((n7 = n8 & 0x180) != 0) break block20;
                                        n7 = n4 & 4;
                                        if (n7 != 0) break block21;
                                        l4 = l3;
                                        n10 = ((j30_0)object2).d(l3) ? 1 : 0;
                                        if (n10 == 0) break block22;
                                        n10 = 256;
                                        f5 = 3.59E-43f;
                                        break block23;
                                    }
                                    l4 = l3;
                                }
                                n10 = 128;
                                f5 = 1.8E-43f;
                            }
                            n15 |= n10;
                            break block24;
                        }
                        l4 = l3;
                    }
                    n10 = n8 & 0xC00;
                    if (n10 == 0) {
                        n10 = ((j30_0)object2).x(gx0_23) ? 1 : 0;
                        if (n10 != 0) {
                            n10 = 2048;
                            f5 = 2.87E-42f;
                        } else {
                            n10 = 1024;
                            f5 = 1.435E-42f;
                        }
                        n15 |= n10;
                    }
                    n10 = 1170;
                    f5 = 1.64E-42f;
                    if ((n15 &= 0x493) != n10 || (n15 = (int)(((j30_0)object2).h() ? 1 : 0)) == 0) break block25;
                    ((j30_0)object2).D();
                    break block26;
                }
                ((j30_0)object2).r0();
                n15 = n8 & 1;
                if (n15 != 0 && (n15 = (int)(((j30_0)object2).c0() ? 1 : 0)) == 0) {
                    ((j30_0)object2).D();
                } else {
                    n15 = n4 & 4;
                    if (n15 != 0) {
                        l4 = mz_0.b(l7, (b30_0)object2);
                    }
                }
                ((j30_0)object2).U();
                f6 = gx0_23 != null ? b : a;
                object = SP2.a(f6);
                float f7 = n14;
                object3 = QV.a(androidx.compose.foundation.a.b(j.a(lP1, f6 *= f7, f6), l7, (i13)object), (i13)object);
                f5 = d;
                object3 = h.g((LP1)object3, f5, 0.0f, n14);
                Object object4 = Nc$a.k;
                object = zp.d;
                int n17 = 54;
                f7 = 7.6E-44f;
                object4 = iQ2.a((zp$e)object, (Gx$b)object4, (b30_0)object2, n17);
                n10 = ((j30_0)object2).P;
                Object object5 = ((j30_0)object2).P();
                object3 = a30_0.c((b30_0)object2, (LP1)object3);
                N20.W.getClass();
                Serializable serializable = N20$a.b;
                mp mp2 = ((j30_0)object2).a;
                boolean bl2 = mp2 instanceof mp;
                if (!bl2) break block27;
                ((j30_0)object2).A();
                bl2 = ((j30_0)object2).O;
                if (bl2) {
                    ((j30_0)object2).C((Function0)((Object)serializable));
                } else {
                    ((j30_0)object2).n();
                }
                serializable = N20$a.e;
                Ow3.a((b30_0)object2, object4, (Function2)((Object)serializable));
                object4 = N20$a.d;
                Ow3.a((b30_0)object2, object5, (Function2)object4);
                object4 = N20$a.f;
                n17 = ((j30_0)object2).O ? 1 : 0;
                if (n17 != 0 || (n17 = (int)(Intrinsics.areEqual(object5 = ((j30_0)object2).v(), serializable = Integer.valueOf(n10)) ? 1 : 0)) == 0) {
                    rk_0.a(n10, (j30_0)object2, n10, (N20$a$a)object4);
                }
                object4 = N20$a.c;
                Ow3.a((b30_0)object2, object3, (Function2)object4);
                n15 = 0;
                f6 = 0.0f;
                object3 = null;
                if (gx0_23 != null) {
                    n14 = 1448079226;
                    ((j30_0)object2).K(n14);
                    object4 = w60_0.a;
                    object = new OX(l4);
                    object4 = ((nw0_1)object4).c(object);
                    object = new Iu$a(gx0_23);
                    object = v10.c(1784526485, (fx0_2)object, (b30_0)object2);
                    n17 = 56;
                    f7 = 7.8E-44f;
                    L30.a((MB2)object4, (Function2)object, (b30_0)object2, n17);
                    ((j30_0)object2).T(false);
                } else {
                    n14 = 1448429030;
                    ((j30_0)object2).K(n14);
                    ((j30_0)object2).T(false);
                }
                n15 = 1;
                f6 = Float.MIN_VALUE;
                ((j30_0)object2).T(n15 != 0);
            }
            CF2 cF2 = ((j30_0)object2).X();
            if (cF2 != null) {
                object2 = object;
                l7 = l2;
                gx0_23 = gx0_22;
                n8 = n3;
                n7 = n4;
                cF2.d = object = new Iu$b(lP1, l2, l4, gx0_22, n3, n4);
            }
            return;
        }
        s20.a();
        throw null;
    }

    public static final void b(u10 u102, LP1 lP1, u10 u103, b30_0 b30_02, int n3) {
        block18: {
            block19: {
                block20: {
                    Object object;
                    int n4;
                    Object object2;
                    Object object3;
                    u10 u104;
                    u10 u105;
                    block17: {
                        Object object4;
                        Object object5;
                        int n7;
                        int n8;
                        int n10;
                        block16: {
                            u105 = u102;
                            u104 = u103;
                            n10 = n3;
                            int n14 = 859805272;
                            object3 = b30_02;
                            object2 = b30_02.g(n14);
                            n8 = n3 & 6;
                            if (n8 == 0) {
                                n8 = ((j30_0)object2).x(u102) ? 1 : 0;
                                n8 = n8 != 0 ? 4 : 2;
                                n8 |= n10;
                            } else {
                                n8 = n3;
                            }
                            n8 |= 0x30;
                            n4 = n10 & 0x180;
                            if (n4 == 0) {
                                n4 = ((j30_0)object2).x(u104) ? 1 : 0;
                                n4 = n4 != 0 ? 256 : 128;
                                n8 |= n4;
                            }
                            if ((n4 = n8 & 0x93) != (n7 = 146) || (n4 = (int)(((j30_0)object2).h() ? 1 : 0)) == 0) break block16;
                            ((j30_0)object2).D();
                            object = lP1;
                            break block17;
                        }
                        Object object6 = LP1$a.b;
                        Object object7 = ju_0.a;
                        int n15 = ((j30_0)object2).P;
                        Object object8 = ((j30_0)object2).P();
                        LP1 lP12 = a30_0.c((b30_0)object2, (LP1)object6);
                        N20.W.getClass();
                        Serializable serializable = N20$a.b;
                        mp mp2 = ((j30_0)object2).a;
                        boolean bl2 = mp2 instanceof mp;
                        if (!bl2) break block18;
                        ((j30_0)object2).A();
                        bl2 = ((j30_0)object2).O;
                        if (bl2) {
                            ((j30_0)object2).C((Function0)((Object)serializable));
                        } else {
                            ((j30_0)object2).n();
                        }
                        N20$a$b n20$a$b = N20$a.e;
                        Ow3.a((b30_0)object2, object7, n20$a$b);
                        object7 = N20$a.d;
                        Ow3.a((b30_0)object2, object8, (Function2)object7);
                        object8 = N20$a.f;
                        int n16 = ((j30_0)object2).O;
                        if (n16 != 0 || (n16 = Intrinsics.areEqual(object5 = ((j30_0)object2).v(), object4 = Integer.valueOf(n15))) == 0) {
                            rk_0.a(n15, (j30_0)object2, n15, (N20$a$a)object8);
                        }
                        N20$a$c n20$a$c = N20$a.c;
                        Ow3.a((b30_0)object2, lP12, n20$a$c);
                        lP12 = androidx.compose.ui.layout.a.b("anchor");
                        object5 = Nc$a.e;
                        int n17 = n8 << 3 & 0x1C00 | 0x36;
                        Object object9 = null;
                        object5 = HA.e((Nc)object5, false);
                        int n18 = ((j30_0)object2).P;
                        LP1$a lP1$a = object6;
                        object6 = ((j30_0)object2).P();
                        lP12 = a30_0.c((b30_0)object2, lP12);
                        n10 = mp2 instanceof mp;
                        if (n10 == 0) break block19;
                        ((j30_0)object2).A();
                        n10 = ((j30_0)object2).O ? 1 : 0;
                        if (n10 != 0) {
                            ((j30_0)object2).C((Function0)((Object)serializable));
                        } else {
                            ((j30_0)object2).n();
                        }
                        Ow3.a((b30_0)object2, object5, n20$a$b);
                        Ow3.a((b30_0)object2, object6, (Function2)object7);
                        n10 = ((j30_0)object2).O ? 1 : 0;
                        if (n10 != 0 || (n10 = (int)(Intrinsics.areEqual(object = ((j30_0)object2).v(), object6 = Integer.valueOf(n18)) ? 1 : 0)) == 0) {
                            rk_0.a(n18, (j30_0)object2, n18, (N20$a$a)object8);
                        }
                        Ow3.a((b30_0)object2, lP12, n20$a$c);
                        object = androidx.compose.foundation.layout.d.a;
                        object6 = n17 >> 6 & 0x70 | 6;
                        u104.invoke(object, object2, object6);
                        n4 = 1;
                        ((j30_0)object2).T(n4 != 0);
                        lP12 = androidx.compose.ui.layout.a.b("badge");
                        n8 = n8 << 9 & 0x1C00 | 6;
                        object9 = Nc$a.a;
                        object5 = null;
                        object9 = HA.e((Nc)object9, false);
                        n16 = ((j30_0)object2).P;
                        object4 = ((j30_0)object2).P();
                        lP12 = a30_0.c((b30_0)object2, lP12);
                        boolean bl3 = mp2 instanceof mp;
                        if (!bl3) break block20;
                        ((j30_0)object2).A();
                        bl3 = ((j30_0)object2).O;
                        if (bl3) {
                            ((j30_0)object2).C((Function0)((Object)serializable));
                        } else {
                            ((j30_0)object2).n();
                        }
                        Ow3.a((b30_0)object2, object9, n20$a$b);
                        Ow3.a((b30_0)object2, object4, (Function2)object7);
                        n7 = ((j30_0)object2).O;
                        if (n7 != 0 || (n7 = Intrinsics.areEqual(object7 = ((j30_0)object2).v(), serializable = Integer.valueOf(n16))) == 0) {
                            rk_0.a(n16, (j30_0)object2, n16, (N20$a$a)object8);
                        }
                        Ow3.a((b30_0)object2, lP12, n20$a$c);
                        n8 = n8 >> 6 & 0x70 | 6;
                        object3 = n8;
                        u105.invoke(object, object2, object3);
                        ((j30_0)object2).T(n4 != 0);
                        ((j30_0)object2).T(n4 != 0);
                        object = lP1$a;
                    }
                    object2 = ((j30_0)object2).X();
                    if (object2 != null) {
                        n4 = n3;
                        ((CF2)object2).d = object3 = new ku_1(u105, (LP1)object, u104, n3);
                    }
                    return;
                }
                s20.a();
                throw null;
            }
            s20.a();
            throw null;
        }
        s20.a();
        throw null;
    }
}

