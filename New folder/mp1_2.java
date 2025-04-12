/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.ParserException;
import androidx.media3.common.d;
import androidx.media3.common.d$a;
import java.util.Collections;

/*
 * Renamed from mp1
 */
public final class mp1_2
implements qy0_0 {
    public final String a;
    public final int b;
    public final Xm2 c;
    public final Vm2 d;
    public wp3 e;
    public String f;
    public d g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public long r;
    public int s;
    public long t;
    public int u;
    public String v;

    public mp1_2(String object, int n3) {
        Vm2 vm2;
        this.a = object;
        this.b = n3;
        this.c = object = new Xm2(1024);
        object = ((Xm2)object).a;
        int n4 = ((Object)object).length;
        this.d = vm2 = new Vm2((byte[])object, n4);
        this.l = -9223372036854775807L;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a(Xm2 xm2) {
        mp1_2 mp1_22 = this;
        Object object = this.e;
        ct3.h(object);
        while (true) {
            int n3;
            int n4;
            int n7;
            block35: {
                int n8;
                int n10;
                block36: {
                    Vm2 vm2;
                    Xm2 xm22;
                    int n14;
                    block37: {
                        block42: {
                            Object object2;
                            long l2;
                            block41: {
                                block38: {
                                    block39: {
                                        long l3;
                                        block34: {
                                            block40: {
                                                long l4;
                                                Object object3;
                                                Object object4;
                                                int n15;
                                                if ((n7 = xm2.a()) <= 0) {
                                                    return;
                                                }
                                                n7 = mp1_22.h;
                                                n4 = 1;
                                                n3 = 86;
                                                if (n7 == 0) break block35;
                                                n10 = 2;
                                                n8 = 0;
                                                Object object5 = null;
                                                if (n7 == n4) break block36;
                                                n3 = 3;
                                                n14 = 8;
                                                xm22 = mp1_22.c;
                                                vm2 = mp1_22.d;
                                                if (n7 == n10) break block37;
                                                if (n7 != n3) {
                                                    object = new IllegalStateException();
                                                    throw object;
                                                }
                                                n7 = xm2.a();
                                                int n16 = mp1_22.j;
                                                int n17 = mp1_22.i;
                                                n7 = Math.min(n7, n16 -= n17);
                                                byte[] byArray = vm2.a;
                                                n17 = mp1_22.i;
                                                xm2.g(n17, byArray, n7);
                                                mp1_22.i = n16 = mp1_22.i + n7;
                                                n7 = mp1_22.j;
                                                if (n16 != n7) continue;
                                                vm2.m(0);
                                                n7 = (int)(vm2.f() ? 1 : 0);
                                                n16 = 0;
                                                byArray = null;
                                                if (n7 != 0) break block38;
                                                mp1_22.m = n4;
                                                n7 = vm2.g(n4);
                                                n17 = n7 == n4 ? vm2.g(n4) : 0;
                                                mp1_22.n = n17;
                                                if (n17 != 0) {
                                                    throw ParserException.a(null, null);
                                                }
                                                if (n7 == n4) {
                                                    n17 = (vm2.g(n10) + n4) * 8;
                                                    vm2.g(n17);
                                                }
                                                if ((n17 = (int)(vm2.f() ? 1 : 0)) == 0) {
                                                    throw ParserException.a(null, null);
                                                }
                                                n17 = 6;
                                                mp1_22.o = n15 = vm2.g(n17);
                                                n15 = 4;
                                                int n18 = vm2.g(n15);
                                                int n19 = vm2.g(n3);
                                                if (n18 != 0 || n19 != 0) break block39;
                                                if (n7 == 0) {
                                                    n18 = vm2.e();
                                                    n19 = vm2.b();
                                                    object4 = y0.b(vm2, n4 != 0);
                                                    object5 = ((y0$a)object4).c;
                                                    mp1_22.v = object5;
                                                    mp1_22.s = n8 = ((y0$a)object4).a;
                                                    mp1_22.u = n8 = ((y0$a)object4).b;
                                                    n8 = vm2.b();
                                                    vm2.m(n18);
                                                    object5 = new byte[((n19 -= n8) + 7) / n14];
                                                    vm2.h(n19, (byte[])object5);
                                                    Object object6 = new d$a();
                                                    ((d$a)object6).a = object3 = mp1_22.f;
                                                    ((d$a)object6).n = object3 = ip1_0.l("audio/mp4a-latm");
                                                    ((d$a)object6).j = object3 = mp1_22.v;
                                                    ((d$a)object6).C = n19 = mp1_22.u;
                                                    ((d$a)object6).D = n19 = mp1_22.s;
                                                    object5 = Collections.singletonList(object5);
                                                    ((d$a)object6).q = object5;
                                                    ((d$a)object6).d = object5 = mp1_22.a;
                                                    ((d$a)object6).f = n8 = mp1_22.b;
                                                    object5 = new d((d$a)object6);
                                                    object6 = mp1_22.g;
                                                    n18 = (int)(((d)object5).equals(object6) ? 1 : 0);
                                                    if (n18 == 0) {
                                                        mp1_22.g = object5;
                                                        n18 = ((d)object5).E;
                                                        l4 = n18;
                                                        long l7 = 1024000000L;
                                                        mp1_22.t = l4 = l7 / l4;
                                                        object6 = mp1_22.e;
                                                        object6.d((d)object5);
                                                    }
                                                } else {
                                                    int n20;
                                                    n8 = (vm2.g(n10) + n4) * 8;
                                                    l4 = vm2.g(n8);
                                                    n8 = (int)l4;
                                                    n18 = vm2.b();
                                                    object3 = y0.b(vm2, n4 != 0);
                                                    mp1_22.v = object4 = ((y0$a)object3).c;
                                                    mp1_22.s = n20 = ((y0$a)object3).a;
                                                    mp1_22.u = n19 = ((y0$a)object3).b;
                                                    n19 = vm2.b();
                                                    vm2.o(n8 -= (n18 -= n19));
                                                }
                                                mp1_22.p = n8 = vm2.g(n3);
                                                if (n8 == 0) break block40;
                                                if (n8 != n4) {
                                                    if (n8 != n3 && n8 != n15 && n8 != (n3 = 5)) {
                                                        if (n8 != n17 && n8 != (n3 = 7)) {
                                                            object = new IllegalStateException();
                                                            throw object;
                                                        }
                                                        vm2.o(n4);
                                                        break block34;
                                                    } else {
                                                        vm2.o(n17);
                                                    }
                                                    break block34;
                                                } else {
                                                    n3 = 9;
                                                    vm2.o(n3);
                                                }
                                                break block34;
                                            }
                                            vm2.o(n14);
                                        }
                                        n3 = (int)(vm2.f() ? 1 : 0);
                                        mp1_22.q = n3;
                                        mp1_22.r = l3 = 0L;
                                        if (n3 != 0) {
                                            if (n7 == n4) {
                                                n7 = (vm2.g(n10) + n4) * 8;
                                                n7 = vm2.g(n7);
                                                mp1_22.r = l2 = (long)n7;
                                            } else {
                                                do {
                                                    n7 = (int)(vm2.f() ? 1 : 0);
                                                    l2 = mp1_22.r << n14;
                                                    n8 = vm2.g(n14);
                                                    l3 = n8;
                                                    mp1_22.r = l2 += l3;
                                                } while (n7 != 0);
                                            }
                                        }
                                        if ((n7 = (int)(vm2.f() ? 1 : 0)) != 0) {
                                            vm2.o(n14);
                                        }
                                        break block41;
                                    }
                                    throw ParserException.a(null, null);
                                }
                                n7 = (int)(mp1_22.m ? 1 : 0);
                                if (n7 == 0) break block42;
                            }
                            if ((n7 = mp1_22.n) != 0) {
                                throw ParserException.a(null, null);
                            }
                            n7 = mp1_22.o;
                            if (n7 != 0) {
                                throw ParserException.a(null, null);
                            }
                            n7 = mp1_22.p;
                            if (n7 != 0) {
                                throw ParserException.a(null, null);
                            }
                            n7 = 0;
                            object = null;
                            do {
                                n3 = vm2.g(n14);
                                n7 += n3;
                            } while (n3 == (n10 = 255));
                            n3 = vm2.e();
                            n10 = n3 & 7;
                            if (n10 == 0) {
                                xm22.I(n3 >>= 3);
                            } else {
                                object2 = xm22.a;
                                n10 = n7 * 8;
                                vm2.h(n10, (byte[])object2);
                                n3 = 0;
                                object2 = null;
                                xm22.I(0);
                            }
                            object2 = mp1_22.e;
                            object2.f(n7, xm22);
                            l2 = mp1_22.l;
                            long l8 = -9223372036854775807L;
                            long l12 = l2 == l8 ? 0 : (l2 < l8 ? -1 : 1);
                            if (l12 == false) {
                                n4 = 0;
                                Object var35_31 = null;
                            }
                            ct3.f(n4 != 0);
                            wp3 wp32 = mp1_22.e;
                            l2 = mp1_22.l;
                            int n21 = 1;
                            wp32.a(l2, n21, n7, 0, null);
                            long l14 = mp1_22.l;
                            l2 = mp1_22.t;
                            mp1_22.l = l14 += l2;
                            n7 = (int)(mp1_22.q ? 1 : 0);
                            if (n7 != 0) {
                                l14 = mp1_22.r;
                                n4 = (int)l14;
                                vm2.o(n4);
                            }
                        }
                        n7 = 0;
                        object = null;
                        mp1_22.h = 0;
                        continue;
                    }
                    n7 = (mp1_22.k & 0xFFFFFF1F) << n14;
                    n4 = xm2.w();
                    mp1_22.j = n7 |= n4;
                    byte[] byArray = xm22.a;
                    n4 = byArray.length;
                    if (n7 > n4) {
                        xm22.F(n7);
                        object = xm22.a;
                        vm2.getClass();
                        n4 = ((Object)object).length;
                        vm2.k(n4, (byte[])object);
                    }
                    n7 = 0;
                    object = null;
                    mp1_22.i = 0;
                    mp1_22.h = n3;
                    continue;
                }
                n7 = xm2.w();
                n4 = n7 & 0xE0;
                if (n4 == (n8 = 224)) {
                    mp1_22.k = n7;
                    mp1_22.h = n10;
                    continue;
                }
                if (n7 == n3) continue;
                n7 = 0;
                object = null;
                mp1_22.h = 0;
                continue;
            }
            n7 = xm2.w();
            if (n7 != n3) continue;
            mp1_22.h = n4;
        }
    }

    public final void c() {
        this.h = 0;
        this.l = -9223372036854775807L;
        this.m = false;
    }

    public final void d(boolean bl2) {
    }

    public final void e(gi0_0 object, Gs3$d gs3$d) {
        gs3$d.a();
        gs3$d.b();
        int n3 = gs3$d.d;
        this.e = object = object.n(n3, 1);
        gs3$d.b();
        this.f = object = gs3$d.e;
    }

    public final void f(int n3, long l2) {
        this.l = l2;
    }
}

