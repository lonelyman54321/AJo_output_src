/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.ColorFilter
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.PorterDuffColorFilter
 *  android.os.Build$VERSION
 */
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.compose.foundation.layout.j;
import androidx.compose.ui.draw.b;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from Rc1
 */
public final class rc1_0 {
    public static final LP1 a;

    static {
        LP1$a lP1$a = LP1$a.b;
        float f5 = 24;
        a = j.h(lP1$a, f5);
    }

    public static final void a(Ke1 ke1, String string2, LP1 lP1, long l2, b30_0 b30_02, int n3, int n4) {
        int n7 = n4 & 4;
        if (n7 != 0) {
            lP1 = LP1$a.b;
        }
        LP1 lP12 = lP1;
        int n8 = 8;
        if ((n4 &= n8) != 0) {
            Object object = w60_0.a;
            object = (OX)b30_02.j((H30)object);
            l2 = ((OX)object).a;
            Object object2 = s60_0.a;
            object2 = (Number)b30_02.j((H30)object2);
            float f5 = ((Number)object2).floatValue();
            l2 = OX.b(l2, f5);
        }
        FA3 fA3 = GA3.b(ke1, b30_02);
        int n10 = n3 & 0x70 | n8;
        n8 = n3 & 0x380;
        n10 |= n8;
        n8 = n3 & 0x1C00;
        int n14 = n10 | n8;
        rc1_0.b(fA3, string2, lP12, l2, b30_02, n14, 0);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static final void b(im2 im22, String string2, LP1 object, long l2, b30_0 b30_02, int n3, int n4) {
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        long l3;
        int n7;
        Object object7;
        int n8;
        String string3;
        block27: {
            void var27_26;
            int n10;
            Object object8;
            long l4;
            LP1$a lP1$a;
            int n14;
            int n15;
            Object object9;
            int n16;
            float f5;
            int n17;
            float f6;
            int n18;
            block34: {
                block35: {
                    block32: {
                        boolean bl2;
                        block33: {
                            block31: {
                                int n19;
                                block29: {
                                    block30: {
                                        block28: {
                                            block26: {
                                                block25: {
                                                    string3 = string2;
                                                    n8 = n3;
                                                    bl2 = true;
                                                    n18 = 4;
                                                    f6 = 5.6E-45f;
                                                    int n20 = -1142959010;
                                                    object7 = b30_02.g(n20);
                                                    int n21 = n3 & 6;
                                                    if (n21 == 0) {
                                                        n17 = ((j30_0)object7).x(im22) ? 1 : 0;
                                                        if (n17 != 0) {
                                                            n17 = 4;
                                                            f5 = 5.6E-45f;
                                                        } else {
                                                            n17 = 2;
                                                            f5 = 2.8E-45f;
                                                        }
                                                        n17 |= n8;
                                                    } else {
                                                        n17 = n3;
                                                    }
                                                    n7 = n8 & 0x30;
                                                    n16 = 32;
                                                    if (n7 == 0) {
                                                        n7 = ((j30_0)object7).J(string3) ? 1 : 0;
                                                        n7 = n7 != 0 ? 32 : 16;
                                                        n17 |= n7;
                                                    }
                                                    if ((n18 = n4 & 4) != 0) {
                                                        n17 |= 0x180;
                                                    } else {
                                                        n7 = n8 & 0x180;
                                                        if (n7 == 0) {
                                                            object9 = object;
                                                            n15 = ((j30_0)object7).J(object) ? 1 : 0;
                                                            n15 = n15 != 0 ? 256 : 128;
                                                        }
                                                    }
                                                    object9 = object;
                                                    break block25;
                                                    n17 |= n15;
                                                }
                                                n15 = n8 & 0xC00;
                                                n19 = 2048;
                                                if (n15 == 0) {
                                                    n15 = n4 & 8;
                                                    l3 = l2;
                                                    n15 = n15 == 0 && (n15 = (int)(((j30_0)object7).d(l2) ? 1 : 0)) != 0 ? 2048 : 1024;
                                                    n17 |= n15;
                                                } else {
                                                    l3 = l2;
                                                }
                                                n15 = n17 & 0x493;
                                                n14 = 1170;
                                                if (n15 != n14 || (n15 = (int)(((j30_0)object7).h() ? 1 : 0)) == 0) break block26;
                                                ((j30_0)object7).D();
                                                object6 = object9;
                                                break block27;
                                            }
                                            ((j30_0)object7).r0();
                                            n15 = n8 & 1;
                                            lP1$a = LP1$a.b;
                                            if (n15 == 0 || (n15 = (int)(((j30_0)object7).c0() ? 1 : 0)) != 0) break block28;
                                            ((j30_0)object7).D();
                                            n18 = n4 & 8;
                                            if (n18 == 0) break block29;
                                            break block30;
                                        }
                                        if (n18 != 0) {
                                            object9 = lP1$a;
                                        }
                                        if ((n18 = n4 & 8) == 0) break block29;
                                        object5 = w60_0.a;
                                        l3 = ((OX)((j30_0)object7).j((H30)object5)).a;
                                        object5 = s60_0.a;
                                        object5 = (Number)((j30_0)object7).j((H30)object5);
                                        f6 = ((Number)object5).floatValue();
                                        l3 = OX.b(l3, f6);
                                    }
                                    n17 &= 0xFFFFE3FF;
                                }
                                object5 = object9;
                                l4 = l3;
                                ((j30_0)object7).U();
                                n7 = n17 & 0x1C00 ^ 0xC00;
                                if (n7 > n19 && (n7 = (int)(((j30_0)object7).d(l3) ? 1 : 0)) != 0 || (n7 = n17 & 0xC00) == n19) {
                                    n7 = 1;
                                } else {
                                    n7 = 0;
                                    object9 = null;
                                }
                                object4 = ((j30_0)object7).v();
                                object8 = b30$a.a;
                                if (n7 == 0 && object4 != object8) break block31;
                                object = object5;
                                long l7 = OX.l;
                                bl2 = OX.c(l4, l7);
                                if (!bl2) break block32;
                                break block33;
                            }
                            object = object5;
                            break block34;
                        }
                        bl2 = false;
                        object3 = null;
                        break block35;
                    }
                    n18 = Build.VERSION.SDK_INT;
                    n15 = 29;
                    n10 = 5;
                    if (n18 >= n15) {
                        object5 = gy_0.a.a(l4, n10);
                    } else {
                        n15 = zx_0.i(l4);
                        object9 = Lf.b(n10);
                        object5 = new PorterDuffColorFilter(n15, (PorterDuff.Mode)object9);
                    }
                    object3 = new ay_1(l4, n10, (ColorFilter)object5);
                }
                object4 = object3;
                ((j30_0)object7).o(object3);
            }
            object3 = object4;
            object3 = (TX)object4;
            if (string3 != null) {
                f6 = 9.180955E-4f;
                ((j30_0)object7).K(980462681);
                n18 = n17 & 0x70;
                if (n18 == n16) {
                    n18 = 1;
                    f6 = Float.MIN_VALUE;
                } else {
                    n18 = 0;
                    f6 = 0.0f;
                    object5 = null;
                }
                object6 = ((j30_0)object7).v();
                if (n18 != 0 || object6 == object8) {
                    object6 = new Rc1$b(string3);
                    ((j30_0)object7).o(object6);
                }
                object6 = (Function1)object6;
                object5 = CY2.b(lP1$a, false, (Function1)object6);
                ((j30_0)object7).T(false);
            } else {
                n18 = 980601995;
                f6 = 9.2620467E-4f;
                ((j30_0)object7).K(n18);
                ((j30_0)object7).T(false);
                object5 = lP1$a;
            }
            object6 = ji1.a;
            long l8 = im22.getIntrinsicSize-NH-jbRc();
            long l12 = 9205357640488583168L;
            n17 = C63.a(l8, l12) ? 1 : 0;
            if (n17 != 0 || (n17 = (int)(Float.isInfinite(f5 = C63.d(l8 = im22.getIntrinsicSize-NH-jbRc())) ? 1 : 0)) != 0 && (n17 = (int)(Float.isInfinite(f5 = C63.b(l8)) ? 1 : 0)) != 0) {
                LP1 lP1 = a;
            }
            object6 = object;
            object9 = object.then((LP1)var27_26);
            object8 = i70$a.b;
            n15 = 0;
            object4 = null;
            n10 = 0;
            n14 = 22;
            object2 = im22;
            object3 = b.a((LP1)object9, im22, null, (i70_0)object8, 0.0f, (TX)object3, n14).then((LP1)object5);
            n18 = 0;
            f6 = 0.0f;
            object5 = null;
            HA.a((LP1)object3, (b30_0)object7, 0);
            l3 = l4;
        }
        object2 = ((j30_0)object7).X();
        if (object2 != null) {
            object3 = object4;
            object5 = im22;
            string3 = string2;
            object7 = object6;
            n8 = n3;
            n7 = n4;
            object4 = new rc1$a_0(im22, string2, (LP1)object6, l3, n3, n4);
            ((CF2)object2).d = object4;
        }
    }
}

