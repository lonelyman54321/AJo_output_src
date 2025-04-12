/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.d;
import androidx.media3.common.d$a;
import java.util.Arrays;
import java.util.Collections;

public final class n5
implements qy0_0 {
    public static final byte[] w;
    public final boolean a;
    public final Vm2 b;
    public final Xm2 c;
    public final String d;
    public final int e;
    public String f;
    public wp3 g;
    public wp3 h;
    public int i;
    public int j;
    public int k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public long r;
    public int s;
    public long t;
    public wp3 u;
    public long v;

    static {
        byte[] byArray;
        byte[] byArray2 = byArray = new byte[3];
        byArray[0] = 73;
        byArray2[1] = 68;
        byArray2[2] = 51;
        w = byArray;
    }

    public n5(boolean bl2, String string2, int n3) {
        long l2;
        int n4;
        int n7 = 7;
        byte[] byArray = new byte[n7];
        Object object = new Vm2(byArray, n7);
        this.b = object;
        byte[] byArray2 = Arrays.copyOf(w, 10);
        this.c = object = new Xm2(byArray2);
        this.i = 0;
        this.j = 0;
        this.k = 256;
        this.n = n4 = -1;
        this.o = n4;
        this.r = l2 = -9223372036854775807L;
        this.t = l2;
        this.a = bl2;
        this.d = string2;
        this.e = n3;
    }

    public final void a(Xm2 xm2) {
        n5 n52 = this;
        Object object = xm2;
        int n3 = 0;
        int n4 = 7;
        int n7 = 2;
        int n8 = 1;
        Object object2 = this.g;
        object2.getClass();
        int n10 = gz3.a;
        while ((n10 = xm2.a()) > 0) {
            block17: {
                byte[] byArray;
                Object object3;
                int n14;
                int n15;
                Object object4;
                int n16;
                n10 = n52.i;
                int n17 = 256;
                int n18 = 4;
                int n19 = 3;
                int n20 = 13;
                Object object5 = n52.c;
                Vm2 vm2 = n52.b;
                if (n10 != 0) {
                    if (n10 != n8) {
                        long l2;
                        n16 = 10;
                        if (n10 != n7) {
                            int n21;
                            long l3;
                            if (n10 != n19) {
                                if (n10 == n18) {
                                    n10 = xm2.a();
                                    n18 = n52.s;
                                    n19 = n52.j;
                                    n10 = Math.min(n10, n18 -= n19);
                                    object4 = n52.u;
                                    object4.f(n10, (Xm2)object);
                                    n52.j = n18 = n52.j + n10;
                                    n10 = n52.s;
                                    if (n18 != n10) continue;
                                    long l4 = n52.t;
                                    long l7 = -9223372036854775807L;
                                    long l8 = l4 - l7;
                                    n10 = (int)(l8 == 0L ? 0 : (l8 < 0L ? -1 : 1));
                                    if (n10 != 0) {
                                        n10 = 1;
                                    } else {
                                        n10 = 0;
                                        object2 = null;
                                    }
                                    ct3.f(n10 != 0);
                                    object4 = n52.u;
                                    l3 = n52.t;
                                    int n22 = n52.s;
                                    n21 = 1;
                                    n16 = 0;
                                    n15 = 0;
                                    object4.a(l3, n21, n22, 0, null);
                                    l4 = n52.t;
                                    l7 = n52.v;
                                    n52.t = l4 += l7;
                                    n52.i = 0;
                                    n52.j = 0;
                                    n52.k = n17;
                                    continue;
                                }
                                object = new IllegalStateException();
                                throw object;
                            }
                            n10 = (int)(n52.l ? 1 : 0);
                            n17 = 5;
                            n10 = n10 != 0 ? 7 : 5;
                            object5 = vm2.a;
                            n15 = xm2.a();
                            n14 = n52.j;
                            n14 = n10 - n14;
                            n14 = Math.min(n15, n14);
                            n15 = n52.j;
                            ((Xm2)object).g(n15, (byte[])object5, n14);
                            n52.j = n21 = n52.j + n14;
                            if (n21 != n10) continue;
                            vm2.m(0);
                            n14 = (int)(n52.q ? 1 : 0);
                            if (n14 == 0) {
                                long l12;
                                String string2;
                                n14 = vm2.g(n7) + n8;
                                if (n14 != n7) {
                                    object5 = "Detected audio object type: ";
                                    object2 = new StringBuilder((String)object5);
                                    ((StringBuilder)object2).append(n14);
                                    ((StringBuilder)object2).append(", but assuming AAC LC.");
                                    object3 = ((StringBuilder)object2).toString();
                                    Cx.f((String)object3);
                                    n14 = 2;
                                }
                                vm2.o(n17);
                                n10 = vm2.g(n19);
                                n17 = n52.o;
                                n14 = n14 << n19 & 0xF8;
                                n21 = n17 >> 1 & n4;
                                n14 = (byte)(n14 | n21);
                                n17 = n17 << n4 & 0x80;
                                n10 = (byte)(n10 << n19 & 0x78 | n17);
                                byArray = new byte[n7];
                                byArray[0] = n14;
                                byArray[n8] = n10;
                                object3 = new Vm2;
                                object3(byArray, n7);
                                object3 = y0.b((Vm2)object3, false);
                                object2 = new d$a();
                                ((d$a)object2).a = string2 = n52.f;
                                ((d$a)object2).n = string2 = ip1_0.l("audio/mp4a-latm");
                                ((d$a)object2).j = string2 = object3.c;
                                ((d$a)object2).C = n19 = object3.b;
                                ((d$a)object2).D = n14 = object3.a;
                                object3 = Collections.singletonList(byArray);
                                ((d$a)object2).q = object3;
                                object3 = n52.d;
                                ((d$a)object2).d = object3;
                                ((d$a)object2).f = n14 = n52.e;
                                object3 = new d;
                                object3((d$a)object2);
                                n10 = object3.E;
                                long l14 = n10;
                                n52.r = l12 = 1024000000L / l14;
                                object2 = n52.g;
                                object2.d((d)object3);
                                n52.q = n8;
                            } else {
                                vm2.o(n16);
                            }
                            vm2.o(n18);
                            n14 = vm2.g(n20);
                            n10 = n14 + -7;
                            n17 = (int)(n52.l ? 1 : 0);
                            if (n17 != 0) {
                                n10 = n14 + -9;
                            }
                            object3 = n52.g;
                            l3 = n52.r;
                            n52.i = n18;
                            n52.j = 0;
                            n52.u = object3;
                            n52.v = l3;
                            n52.s = n10;
                            continue;
                        }
                        object3 = ((Xm2)object5).a;
                        n10 = xm2.a();
                        n17 = n52.j;
                        n17 = 10 - n17;
                        n10 = Math.min(n10, n17);
                        n17 = n52.j;
                        ((Xm2)object).g(n17, (byte[])object3, n10);
                        n52.j = n14 = n52.j + n10;
                        if (n14 != n16) continue;
                        n52.h.f(n16, (Xm2)object5);
                        n14 = 6;
                        ((Xm2)object5).I(n14);
                        object3 = n52.h;
                        n10 = ((Xm2)object5).v() + n16;
                        n52.i = n18;
                        n52.j = n16;
                        n52.u = object3;
                        n52.v = l2 = 0L;
                        n52.s = n10;
                        continue;
                    }
                    n14 = xm2.a();
                    if (n14 == 0) continue;
                    object3 = vm2.a;
                    object2 = ((Xm2)object).a;
                    n20 = ((Xm2)object).b;
                    object3[0] = n10 = (int)object2[n20];
                    vm2.m(n7);
                    n14 = vm2.g(n18);
                    n10 = n52.o;
                    n18 = -1;
                    if (n10 != n18 && n14 != n10) {
                        n52.m = false;
                        n52.i = 0;
                        n52.j = 0;
                        n52.k = n17;
                        continue;
                    }
                    n10 = (int)(n52.m ? 1 : 0);
                    if (n10 == 0) {
                        n52.m = n8;
                        n52.n = n10 = n52.p;
                        n52.o = n14;
                    }
                    n52.i = n19;
                    n52.j = 0;
                    continue;
                }
                object3 = ((Xm2)object).a;
                n10 = ((Xm2)object).b;
                n16 = ((Xm2)object).c;
                while (n10 < n16) {
                    byte[] byArray2;
                    block30: {
                        block31: {
                            block25: {
                                block26: {
                                    block27: {
                                        block28: {
                                            block29: {
                                                block24: {
                                                    block18: {
                                                        block23: {
                                                            block19: {
                                                                byte[] byArray3;
                                                                block22: {
                                                                    int n24;
                                                                    char c2;
                                                                    int n25;
                                                                    block21: {
                                                                        block20: {
                                                                            n15 = n10 + 1;
                                                                            n17 = object3[n10];
                                                                            n19 = n17 & 0xFF;
                                                                            n4 = n52.k;
                                                                            n20 = 512;
                                                                            if (n4 != n20) break block18;
                                                                            n4 = (byte)n19 & 0xFF;
                                                                            n25 = 65280;
                                                                            n4 = n25 | n4;
                                                                            c2 = (char)-10;
                                                                            n20 = (char)-16;
                                                                            if ((n4 &= c2) != n20) break block18;
                                                                            n4 = (int)(n52.m ? 1 : 0);
                                                                            if (n4 != 0) break block19;
                                                                            n4 = -1;
                                                                            n24 = n10 + -1;
                                                                            ((Xm2)object).I(n10);
                                                                            byte[] byArray4 = vm2.a;
                                                                            n20 = xm2.a();
                                                                            if (n20 < n8) break block18;
                                                                            ((Xm2)object).g(0, byArray4, n8);
                                                                            vm2.m(n18);
                                                                            n4 = vm2.g(n8);
                                                                            n20 = n52.n;
                                                                            n18 = -1;
                                                                            if (n20 != n18 && n4 != n20) break block18;
                                                                            n20 = n52.o;
                                                                            if (n20 == n18) break block20;
                                                                            object4 = vm2.a;
                                                                            n20 = xm2.a();
                                                                            if (n20 < n8) break block19;
                                                                            ((Xm2)object).g(0, (byte[])object4, n8);
                                                                            vm2.m(n7);
                                                                            n18 = 4;
                                                                            n20 = vm2.g(n18);
                                                                            n7 = n52.o;
                                                                            if (n20 != n7) break block18;
                                                                            ((Xm2)object).I(n15);
                                                                            break block21;
                                                                        }
                                                                        n18 = 4;
                                                                    }
                                                                    byArray3 = vm2.a;
                                                                    n20 = xm2.a();
                                                                    if (n20 < n18) break block19;
                                                                    ((Xm2)object).g(0, byArray3, n18);
                                                                    vm2.m(14);
                                                                    n20 = vm2.g(13);
                                                                    n7 = 7;
                                                                    if (n20 < n7) break block18;
                                                                    byArray3 = ((Xm2)object).a;
                                                                    n18 = ((Xm2)object).c;
                                                                    if ((n20 = n24 + n20) >= n18) break block19;
                                                                    n3 = byArray3[n20];
                                                                    byArray2 = object3;
                                                                    n14 = -1;
                                                                    if (n3 != n14) break block22;
                                                                    if ((n20 += n8) == n18) break block23;
                                                                    n3 = byArray3[n20];
                                                                    n7 = n3 & 0xFF;
                                                                    n18 = (char)-16;
                                                                    if ((n7 = (n25 | n7) & c2) != n18) break block24;
                                                                    n3 &= 8;
                                                                    n7 = 3;
                                                                    if ((n3 >>= n7) != n4) break block24;
                                                                    break block23;
                                                                }
                                                                n4 = 73;
                                                                if (n3 != n4 || (n3 = n20 + 1) != n18 && ((n3 = byArray3[n3]) != (n4 = 68) || (n20 += (n3 = 2)) != n18 && (n3 = byArray3[n20]) != (n4 = 51))) break block24;
                                                                break block23;
                                                            }
                                                            n14 = -1;
                                                        }
                                                        n3 = n17 & 8;
                                                        n4 = 3;
                                                        n52.p = n3 >>= n4;
                                                        n3 = n17 & 1;
                                                        n3 = n3 == 0 ? 1 : 0;
                                                        n52.l = n3;
                                                        n3 = (int)(n52.m ? 1 : 0);
                                                        if (n3 == 0) {
                                                            n52.i = n8;
                                                            n3 = 0;
                                                            n52.j = 0;
                                                        } else {
                                                            n3 = 0;
                                                            n52.i = n4 = 3;
                                                            n52.j = 0;
                                                        }
                                                        ((Xm2)object).I(n15);
                                                        n3 = 2;
                                                        n17 = 0;
                                                        byArray = null;
                                                        break block17;
                                                    }
                                                    byArray2 = object3;
                                                    n14 = -1;
                                                }
                                                if ((n4 = (n3 = n52.k) | n19) == (n7 = 329)) break block25;
                                                n7 = 511;
                                                if (n4 == n7) break block26;
                                                n7 = 836;
                                                if (n4 == n7) break block27;
                                                n7 = 1075;
                                                if (n4 == n7) break block28;
                                                n4 = 256;
                                                if (n3 == n4) break block29;
                                                n52.k = n4;
                                                n3 = 2;
                                                n7 = 3;
                                                n17 = 0;
                                                byArray = null;
                                                break block30;
                                            }
                                            n3 = 2;
                                            n7 = 3;
                                            n17 = 0;
                                            byArray = null;
                                            break block31;
                                        }
                                        n52.i = n3 = 2;
                                        n52.j = n7 = 3;
                                        n17 = 0;
                                        byArray = null;
                                        n52.s = 0;
                                        ((Xm2)object5).I(0);
                                        ((Xm2)object).I(n15);
                                        break block17;
                                    }
                                    n3 = 2;
                                    n4 = 256;
                                    n7 = 3;
                                    n17 = 0;
                                    byArray = null;
                                    n52.k = n10 = 1024;
                                    break block31;
                                }
                                n3 = 2;
                                n4 = 256;
                                n7 = 3;
                                n10 = 512;
                                n17 = 0;
                                byArray = null;
                                n52.k = n10;
                                break block31;
                            }
                            n3 = 2;
                            n4 = 256;
                            n7 = 3;
                            n17 = 0;
                            byArray = null;
                            n52.k = n10 = 768;
                        }
                        n10 = n15;
                    }
                    object3 = byArray2;
                    n3 = 0;
                    n4 = 7;
                    n7 = 2;
                    n17 = 256;
                    n18 = 4;
                    n19 = 3;
                    n20 = 13;
                }
                n3 = 2;
                n14 = -1;
                n17 = 0;
                byArray = null;
                ((Xm2)object).I(n10);
            }
            n3 = 0;
            n4 = 7;
            n7 = 2;
        }
    }

    public final void c() {
        this.t = -9223372036854775807L;
        this.m = false;
        this.i = 0;
        this.j = 0;
        this.k = 256;
    }

    public final void d(boolean bl2) {
    }

    public final void e(gi0_0 object, Gs3$d object2) {
        ((Gs3$d)object2).a();
        ((Gs3$d)object2).b();
        Object object3 = ((Gs3$d)object2).e;
        this.f = object3;
        ((Gs3$d)object2).b();
        int n3 = ((Gs3$d)object2).d;
        int n4 = 1;
        this.g = object3 = object.n(n3, n4);
        this.u = object3;
        n3 = (int)(this.a ? 1 : 0);
        if (n3 != 0) {
            ((Gs3$d)object2).a();
            ((Gs3$d)object2).b();
            n3 = ((Gs3$d)object2).d;
            n4 = 5;
            this.h = object = object.n(n3, n4);
            object3 = new d$a();
            ((Gs3$d)object2).b();
            ((d$a)object3).a = object2 = ((Gs3$d)object2).e;
            ((d$a)object3).n = object2 = ip1_0.l("application/id3");
            object2 = new d((d$a)object3);
            object.d((d)object2);
        } else {
            this.h = object = new jq0_0();
        }
    }

    public final void f(int n3, long l2) {
        this.t = l2;
    }
}

