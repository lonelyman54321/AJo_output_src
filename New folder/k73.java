/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public final class k73 {
    public final l73 a;
    public final int[] b;
    public final int c;
    public final Object[] d;
    public final int e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public final fj1 j;
    public int k;
    public int l;
    public int m;
    public boolean n;

    public k73(l73 object) {
        int n3;
        int n4;
        this.a = object;
        int[] nArray = ((l73)object).a;
        this.b = nArray;
        this.c = n4 = ((l73)object).b;
        Object[] objectArray = ((l73)object).c;
        this.d = objectArray;
        this.e = n3 = ((l73)object).d;
        this.h = n4;
        this.i = -1;
        this.j = object = new fj1();
    }

    public final Ae a(int n3) {
        Ae ae2;
        ArrayList arrayList = this.a.h;
        int n4 = this.c;
        if ((n4 = n73.q(arrayList, n3, n4)) < 0) {
            ae2 = new Ae(n3);
            n3 = -(++n4);
            arrayList.add(n3, ae2);
        } else {
            Object e2 = arrayList.get(n4);
            ae2 = e2;
            ae2 = (Ae)e2;
        }
        return ae2;
    }

    public final Object b(int[] object, int n3) {
        boolean bl2 = n73.f(object, n3);
        if (bl2) {
            Object[] objectArray = this.d;
            int n4 = n73.b(object, n3);
            object = objectArray[n4];
        } else {
            object = b30$a.a;
        }
        return object;
    }

    public final void c() {
        int n3;
        boolean bl2;
        this.f = bl2 = true;
        l73 l732 = this.a;
        l732.getClass();
        l73 l733 = this.a;
        if (l733 == l732 && (n3 = l732.e) > 0) {
            l732.e = n3 += -1;
            return;
        }
        p30_0.c("Unexpected reader close()");
        throw null;
    }

    public final void d() {
        int n3 = this.k;
        if (n3 == 0) {
            n3 = this.g;
            int n4 = this.h;
            int n7 = 1;
            if ((n3 = n3 == n4 ? 1 : 0) != 0) {
                n3 = this.i;
                int[] nArray = this.b;
                this.i = n3 = n73.l(nArray, n3);
                int n8 = this.c;
                int n10 = n3 < 0 ? n8 : n73.e(nArray, n3) + n3;
                this.h = n10;
                fj1 fj12 = this.j;
                n10 = fj12.a();
                if (n10 < 0) {
                    this.l = 0;
                    this.m = 0;
                } else {
                    this.l = n10;
                    if (n3 >= (n8 -= n7)) {
                        n3 = this.e;
                    } else {
                        n3 += n7;
                        n3 = n73.d(nArray, n3);
                    }
                    this.m = n3;
                }
            } else {
                p30_0.c("endGroup() not called at the end of a group");
                throw null;
            }
        }
    }

    public final Object e() {
        Object object;
        int n3 = this.g;
        int n4 = this.h;
        if (n3 < n4) {
            int[] nArray = this.b;
            object = this.b(nArray, n3);
        } else {
            n3 = 0;
            object = 0;
        }
        return object;
    }

    public final int f() {
        int n3 = this.g;
        int n4 = this.h;
        if (n3 < n4) {
            n3 *= 5;
            int[] nArray = this.b;
            n3 = nArray[n3];
        } else {
            n3 = 0;
        }
        return n3;
    }

    public final Object g(int n3, int n4) {
        int[] nArray = this.b;
        int n7 = n73.m(nArray, n3);
        int n8 = this.c;
        if (++n3 < n8) {
            n3 = n3 * 5 + 4;
            n3 = nArray[n3];
        } else {
            n3 = this.e;
        }
        Object object = (n7 += n4) < n3 ? this.d[n7] : b30$a.a;
        return object;
    }

    public final Object h() {
        int n3;
        int n4 = this.k;
        if (n4 <= 0 && (n4 = this.l) < (n3 = this.m)) {
            this.n = true;
            this.l = n3 = n4 + 1;
            return this.d[n4];
        }
        this.n = false;
        return b30$a.a;
    }

    public final Object i(int n3) {
        Object object;
        Object[] objectArray = this.b;
        boolean bl2 = n73.h(objectArray, n3);
        if (bl2) {
            bl2 = n73.h(objectArray, n3);
            if (bl2) {
                n3 = n3 * 5 + 4;
                n3 = objectArray[n3];
                objectArray = this.d;
                object = objectArray[n3];
            } else {
                object = b30$a.a;
            }
        } else {
            n3 = 0;
            object = null;
        }
        return object;
    }

    public final Object j(int[] object, int n3) {
        boolean bl2 = n73.g(object, n3);
        if (bl2) {
            Object[] objectArray = this.d;
            int n4 = n73.k(object, n3);
            object = objectArray[n4];
        } else {
            boolean bl3 = false;
            object = null;
        }
        return object;
    }

    public final void k(int n3) {
        int[] nArray;
        int n4 = this.k;
        if (n4 == 0) {
            n4 = 1;
        } else {
            n4 = 0;
            nArray = null;
        }
        if (n4 != 0) {
            this.g = n3;
            nArray = this.b;
            int n7 = this.c;
            n3 = n3 < n7 ? n73.l(nArray, n3) : -1;
            this.i = n3;
            this.h = n3 < 0 ? n7 : (n4 = n73.e(nArray, n3) + n3);
            this.l = 0;
            this.m = 0;
            return;
        }
        p30_0.c("Cannot reposition while in an empty region");
        throw null;
    }

    public final int l() {
        int n3 = this.k;
        int n4 = 1;
        if ((n3 = n3 == 0 ? 1 : 0) != 0) {
            int n7;
            n3 = this.g;
            int[] nArray = this.b;
            if ((n3 = (int)(n73.h(nArray, n3) ? 1 : 0)) == 0) {
                n3 = this.g;
                n4 = n73.j(nArray, n3);
            }
            n3 = this.g;
            this.g = n7 = n73.e(nArray, n3) + n3;
            return n4;
        }
        p30_0.c("Cannot skip while in an empty region");
        throw null;
    }

    public final void m() {
        int n3 = this.k;
        n3 = n3 == 0 ? 1 : 0;
        if (n3 != 0) {
            this.g = n3 = this.h;
            this.l = 0;
            this.m = 0;
            return;
        }
        p30_0.c("Cannot skip the enclosing group while in an empty region");
        throw null;
    }

    public final void n() {
        int n3 = this.k;
        if (n3 <= 0) {
            n3 = this.i;
            int n4 = this.g;
            int[] nArray = this.b;
            int n7 = n73.l(nArray, n4);
            int n8 = 1;
            if ((n3 = n7 == n3 ? 1 : 0) != 0) {
                n3 = this.l;
                n7 = this.m;
                fj1 fj12 = this.j;
                if (n3 == 0 && n7 == 0) {
                    n3 = -1;
                    fj12.b(n3);
                } else {
                    fj12.b(n3);
                }
                this.i = n4;
                this.h = n3 = n73.e(nArray, n4) + n4;
                this.g = n3 = n4 + 1;
                this.l = n7 = n73.m(nArray, n4);
                n7 = this.c - n8;
                n3 = n4 >= n7 ? this.e : n73.d(nArray, n3);
                this.m = n3;
            } else {
                sn2.b("Invalid slot table detected");
                throw null;
            }
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SlotReader(current=");
        int n3 = this.g;
        stringBuilder.append(n3);
        stringBuilder.append(", key=");
        n3 = this.f();
        stringBuilder.append(n3);
        stringBuilder.append(", parent=");
        n3 = this.i;
        stringBuilder.append(n3);
        stringBuilder.append(", end=");
        n3 = this.h;
        return tu.a(stringBuilder, n3, ')');
    }
}

