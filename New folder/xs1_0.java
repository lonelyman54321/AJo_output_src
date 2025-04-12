/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Xs1
 */
public final class xs1_0
implements Js1,
gs1_0 {
    public final int a;
    public final List b;
    public final boolean c;
    public final Nc$b d;
    public final Nc$c e;
    public final bp1_0 f;
    public final boolean g;
    public final int h;
    public final int i;
    public final int j;
    public final long k;
    public final Object l;
    public final Object m;
    public final LazyLayoutItemAnimator n;
    public final long o;
    public int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public boolean u;
    public int v;
    public int w;
    public int x;
    public final int[] y;

    public xs1_0() {
        throw null;
    }

    public xs1_0(int n3, List list, boolean bl2, Nc$b nc$b, Nc$c nc$c, bp1_0 bp1_02, boolean bl3, int n4, int n7, int n8, long l2, Object object, Object object2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long l3) {
        xs1_0 xs1_02 = this;
        Object object3 = list;
        int n10 = n3;
        this.a = n3;
        this.b = list;
        n10 = (int)(bl2 ? 1 : 0);
        this.c = bl2;
        this.d = nc$b;
        this.e = nc$c;
        this.f = bp1_02;
        n10 = (int)(bl3 ? 1 : 0);
        this.g = bl3;
        n10 = n4;
        this.h = n4;
        n10 = n7;
        this.i = n7;
        n10 = n8;
        this.j = n8;
        this.k = l2;
        this.l = object;
        this.m = object2;
        this.n = lazyLayoutItemAnimator;
        this.o = l3;
        this.r = 1;
        this.v = -1 << -1;
        n10 = list.size();
        int n14 = 0;
        int n15 = 0;
        int n16 = 0;
        for (int i3 = 0; i3 < n10; ++i3) {
            Ns2 ns2 = (Ns2)list.get(i3);
            boolean bl4 = xs1_02.c;
            int n17 = bl4 ? ns2.b : ns2.a;
            n15 += n17;
            int n18 = !bl4 ? ns2.b : ns2.a;
            n16 = Math.max(n16, n18);
        }
        xs1_02.q = n15;
        int n19 = xs1_02.j;
        if ((n15 += n19) >= 0) {
            n14 = n15;
        }
        xs1_02.s = n14;
        xs1_02.t = n16;
        object3 = new int[xs1_02.b.size() * 2];
        xs1_02.y = (int[])object3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int a(long l2) {
        int n3 = this.c;
        if (n3 != 0) {
            long l3 = 0xFFFFFFFFL;
            l2 &= l3;
            return (int)l2;
        }
        n3 = 32;
        l2 >>= n3;
        return (int)l2;
    }

    public final long b() {
        return this.o;
    }

    public final int c() {
        return this.b.size();
    }

    public final int d() {
        return this.r;
    }

    public final void e(Ns2$a ns2$a, boolean bl2) {
        xs1_0 xs1_02 = this;
        Object object = ns2$a;
        int n3 = this.v;
        int n4 = -1 << -1;
        if (n3 != n4) {
            Object object2 = this.b;
            n4 = object2.size();
            for (int i3 = 0; i3 < n4; ++i3) {
                Serializable serializable;
                long l2;
                long l3;
                int n7;
                List list;
                Ns2 ns2 = (Ns2)object2.get(i3);
                int n8 = xs1_02.w;
                boolean bl3 = xs1_02.c;
                int n10 = bl3 ? ns2.b : ns2.a;
                n8 -= n10;
                n10 = xs1_02.x;
                long l4 = xs1_02.l(i3);
                Object object3 = xs1_02.n;
                Object object4 = xs1_02.l;
                object3 = ((LazyLayoutItemAnimator)object3).a(i3, object4);
                object4 = null;
                if (object3 != null) {
                    if (bl2) {
                        ((Gr1)object3).r = l4;
                        list = object2;
                        n7 = n4;
                    } else {
                        l3 = ((Gr1)object3).r;
                        list = object2;
                        n7 = n4;
                        l2 = Gr1.s;
                        n3 = (int)(Si1.b(l3, l2) ? 1 : 0);
                        if (n3 == 0) {
                            l4 = ((Gr1)object3).r;
                        }
                        object2 = (Si1)((Gr1)object3).q.getValue();
                        l2 = ((Si1)object2).a;
                        l2 = Si1.d(l4, l2);
                        int n14 = xs1_02.a(l4);
                        if ((n14 <= n8 && (n14 = xs1_02.a(l2)) <= n8 || (n8 = xs1_02.a(l4)) >= n10 && (n8 = xs1_02.a(l2)) >= n10) && (n8 = (int)((serializable = (Boolean)((Gr1)object3).h.getValue()).booleanValue() ? 1 : 0)) != 0) {
                            serializable = new jr1_2((Gr1)object3, null);
                            n10 = 3;
                            i90_0 i90_02 = ((Gr1)object3).a;
                            Ae3.d(i90_02, null, null, (Function2)((Object)serializable), n10);
                        }
                        l4 = l2;
                    }
                    object4 = ((Gr1)object3).n;
                } else {
                    list = object2;
                    n7 = n4;
                }
                n3 = (int)(xs1_02.g ? 1 : 0);
                if (n3 != 0) {
                    long l7;
                    n3 = 32;
                    if (bl3) {
                        l2 = l4 >> n3;
                        n4 = (int)l2;
                    } else {
                        l2 = l4 >> n3;
                        n4 = (int)l2;
                        n3 = xs1_02.v - n4;
                        n4 = bl3 ? ns2.b : ns2.a;
                        n4 = n3 - n4;
                    }
                    l3 = 0xFFFFFFFFL;
                    if (bl3) {
                        l7 = l4 & l3;
                        n3 = (int)l7;
                        n8 = xs1_02.v - n3;
                        n3 = bl3 ? ns2.b : ns2.a;
                        n8 -= n3;
                    } else {
                        l7 = l4 & l3;
                        n8 = (int)l7;
                    }
                    l4 = Ti1.a(n4, n8);
                }
                l2 = xs1_02.k;
                l2 = Si1.d(l4, l2);
                if (!bl2 && object3 != null) {
                    ((Gr1)object3).m = l2;
                }
                if (bl3) {
                    if (object4 != null) {
                        ns2$a.getClass();
                        Ns2$a.a((Ns2$a)object, ns2);
                        long l8 = ns2.e;
                        l2 = Si1.d(l2, l8);
                        n8 = 0;
                        serializable = null;
                        ns2.j0(l2, 0.0f, (W01)object4);
                    } else {
                        Ns2$a.k((Ns2$a)object, ns2, l2);
                    }
                } else if (object4 != null) {
                    Ns2$a.i((Ns2$a)object, ns2, l2, (W01)object4);
                } else {
                    Ns2$a.h((Ns2$a)object, ns2, l2);
                }
                object2 = list;
                n4 = n7;
            }
            return;
        }
        String string2 = "position() should be called first".toString();
        object = new IllegalArgumentException(string2);
        throw object;
    }

    public final boolean f() {
        return this.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void g(int n3, int n4, int n7) {
        this.p = n3;
        boolean bl2 = this.c;
        int n8 = bl2 ? n7 : n4;
        this.v = n8;
        List list = this.b;
        int n10 = list.size();
        int n14 = 0;
        while (true) {
            int n15;
            int n16;
            int n17;
            Object object;
            if (n14 >= n10) {
                this.w = n3 = -this.h;
                n3 = this.v;
                n4 = this.i;
                this.x = n3 += n4;
                return;
            }
            Ns2 ns2 = (Ns2)list.get(n14);
            int n18 = n14 * 2;
            int[] nArray = this.y;
            if (bl2) {
                object = this.d;
                if (object == null) {
                    String string2 = "null horizontalAlignment when isVertical == true".toString();
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
                    throw illegalArgumentException;
                }
                n17 = ns2.a;
                bp1_0 bp1_02 = this.f;
                nArray[n18] = n16 = object.a(n17, n4, bp1_02);
                nArray[++n18] = n3;
                n15 = ns2.b;
            } else {
                nArray[n18] = n3;
                ++n18;
                object = this.e;
                if (object == null) {
                    String string3 = "null verticalAlignment when isVertical == false".toString();
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string3);
                    throw illegalArgumentException;
                }
                n17 = ns2.b;
                nArray[n18] = n16 = object.a(n17, n7);
                n15 = ns2.a;
            }
            n3 += n15;
            ++n14;
        }
    }

    public final int getIndex() {
        return this.a;
    }

    public final Object getKey() {
        return this.l;
    }

    public final int getOffset() {
        return this.p;
    }

    public final int getSize() {
        return this.q;
    }

    public final void h(int n3, int n4, int n7, int n8) {
        this.g(n3, n7, n8);
    }

    public final int i() {
        return this.s;
    }

    public final Object j(int n3) {
        return ((Ns2)this.b.get(n3)).B();
    }

    public final void k() {
        this.u = true;
    }

    public final long l(int n3) {
        int[] nArray = this.y;
        int n4 = nArray[n3 *= 2];
        ++n3;
        n3 = nArray[n3];
        return Ti1.a(n4, n3);
    }

    public final int m() {
        return 0;
    }
}

