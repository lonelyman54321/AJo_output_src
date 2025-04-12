/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from mo0
 */
public abstract class mo0_0
extends LP1$c {
    public final int n;
    public LP1$c o;

    public mo0_0() {
        int n3;
        this.n = n3 = c42_0.f(this);
    }

    public final void h1() {
        super.h1();
        LP1$c lP1$c = this.o;
        while (lP1$c != null) {
            w32_0 w32_02 = this.h;
            lP1$c.q1(w32_02);
            boolean bl2 = lP1$c.m;
            if (!bl2) {
                lP1$c.h1();
            }
            lP1$c = lP1$c.f;
        }
    }

    public final void i1() {
        LP1$c lP1$c = this.o;
        while (lP1$c != null) {
            lP1$c.i1();
            lP1$c = lP1$c.f;
        }
        super.i1();
    }

    public final void m1() {
        super.m1();
        LP1$c lP1$c = this.o;
        while (lP1$c != null) {
            lP1$c.m1();
            lP1$c = lP1$c.f;
        }
    }

    public final void n1() {
        LP1$c lP1$c = this.o;
        while (lP1$c != null) {
            lP1$c.n1();
            lP1$c = lP1$c.f;
        }
        super.n1();
    }

    public final void o1() {
        super.o1();
        LP1$c lP1$c = this.o;
        while (lP1$c != null) {
            lP1$c.o1();
            lP1$c = lP1$c.f;
        }
    }

    public final void p1(LP1$c lP1$c) {
        this.a = lP1$c;
        LP1$c lP1$c2 = this.o;
        while (lP1$c2 != null) {
            lP1$c2.p1(lP1$c);
            lP1$c2 = lP1$c2.f;
        }
    }

    public final void q1(w32_0 w32_02) {
        this.h = w32_02;
        LP1$c lP1$c = this.o;
        while (lP1$c != null) {
            lP1$c.q1(w32_02);
            lP1$c = lP1$c.f;
        }
    }

    public final void r1(fo0 object) {
        Object object2 = object.e();
        LP1$c lP1$c = null;
        if (object2 != object) {
            boolean bl2;
            boolean bl3 = object instanceof LP1$c;
            if (bl3) {
                object = (LP1$c)object;
            } else {
                bl2 = false;
                object = null;
            }
            if (object != null) {
                lP1$c = ((LP1$c)object).e;
            }
            if (object2 == (object = this.a) && (bl2 = Intrinsics.areEqual(lP1$c, this))) {
                return;
            }
            object2 = "Cannot delegate to an already delegated node".toString();
            object = new IllegalStateException((String)object2);
            throw object;
        }
        int n3 = ((LP1$c)object2).m ^ 1;
        if (n3 != 0) {
            LP1$c lP1$c2;
            int n4;
            int n7;
            object = this.a;
            ((LP1$c)object2).p1((LP1$c)object);
            n3 = this.c;
            ((LP1$c)object2).c = n7 = c42_0.g((LP1$c)object2);
            int n8 = this.c;
            int n10 = n7 & 2;
            if (n10 != 0 && (n4 = n8 & 2) != 0 && (n4 = this instanceof rp1_1) == 0) {
                object = new StringBuilder("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: ");
                ((StringBuilder)object).append(this);
                ((StringBuilder)object).append("\nDelegate Node: ");
                ((StringBuilder)object).append(object2);
                bh1_1.c(((StringBuilder)object).toString());
                throw null;
            }
            ((LP1$c)object2).f = lP1$c2 = this.o;
            this.o = object2;
            ((LP1$c)object2).e = this;
            n7 |= n8;
            n8 = 0;
            this.t1(n7, false);
            n7 = (int)(((LP1$c)this).m ? 1 : 0);
            if (n7 != 0) {
                if (n10 != 0 && (n3 &= 2) == 0) {
                    object = go0.f((fo0)((fo0)this)).y;
                    LP1$c lP1$c3 = ((LP1$c)this).a;
                    lP1$c3.q1(null);
                    ((T32)object).g();
                } else {
                    object = ((LP1$c)this).h;
                    this.q1((w32_0)object);
                }
                ((LP1$c)object2).h1();
                ((LP1$c)object2).n1();
                c42_0.a((LP1$c)object2);
            }
            return;
        }
        bh1_1.c("Cannot delegate to an already attached node");
        throw null;
    }

    public final void s1(fo0 object) {
        Object object2 = this.o;
        StringBuilder stringBuilder = null;
        boolean bl2 = false;
        Object object3 = null;
        while (object2 != null) {
            if (object2 == object) {
                int n3 = ((LP1$c)object2).m;
                int n4 = 2;
                if (n3 != 0) {
                    if (n3 != 0) {
                        n3 = -1;
                        c42_0.b((LP1$c)object2, n3, n4);
                        ((LP1$c)object2).o1();
                        ((LP1$c)object2).i1();
                    } else {
                        bh1_1.c("autoInvalidateRemovedNode called on unattached node");
                        throw null;
                    }
                }
                ((LP1$c)object2).p1((LP1$c)object2);
                n3 = 0;
                object = null;
                ((LP1$c)object2).d = 0;
                if (object3 == null) {
                    this.o = object = ((LP1$c)object2).f;
                } else {
                    ((LP1$c)object3).f = object = ((LP1$c)object2).f;
                }
                ((LP1$c)object2).f = null;
                ((LP1$c)object2).e = null;
                n3 = this.c;
                int n7 = c42_0.g(this);
                this.t1(n7, true);
                bl2 = this.m;
                if (bl2 && (n3 &= n4) != 0 && (n3 = n7 & 2) == 0) {
                    object = go0.f((fo0)this).y;
                    object2 = this.a;
                    ((LP1$c)object2).q1(null);
                    ((T32)object).g();
                }
                return;
            }
            LP1$c lP1$c = ((LP1$c)object2).f;
            object3 = object2;
            object2 = lP1$c;
        }
        stringBuilder = new StringBuilder("Could not find delegate: ");
        stringBuilder.append(object);
        object = stringBuilder.toString().toString();
        object2 = new IllegalStateException((String)object);
        throw object2;
    }

    /*
     * WARNING - void declaration
     */
    public final void t1(int n3, boolean bl2) {
        int n4 = this.c;
        this.c = n3;
        if (n4 != n3) {
            boolean bl3;
            LP1$c lP1$c = this.a;
            if (lP1$c == this) {
                this.d = n3;
            }
            if (bl3 = this.m) {
                void var2_5;
                LP1$c lP1$c2;
                LP1$c lP1$c3 = this;
                while (lP1$c3 != null) {
                    int n7 = lP1$c3.c;
                    lP1$c3.c = n3 |= n7;
                    if (lP1$c3 == lP1$c) break;
                    lP1$c3 = lP1$c3.e;
                }
                if (bl2 && lP1$c3 == lP1$c) {
                    lP1$c.c = n3 = c42_0.g(lP1$c);
                }
                if (lP1$c3 != null && (lP1$c2 = lP1$c3.f) != null) {
                    int n8 = lP1$c2.d;
                } else {
                    boolean bl4 = false;
                    lP1$c2 = null;
                }
                n3 |= var2_5;
                while (lP1$c3 != null) {
                    int n10 = lP1$c3.c;
                    lP1$c3.d = n3 |= n10;
                    lP1$c3 = lP1$c3.e;
                }
            }
        }
    }
}

