/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;

public final class IA
implements al1_1 {
    public final Nc a;
    public final boolean b;

    public IA(Nc nc, boolean bl2) {
        this.a = nc;
        this.b = bl2;
    }

    public final /* synthetic */ int a(Rj1 rj1, List list, int n3) {
        return ZK1.b(this, rj1, list, n3);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final bl1_0 c(dl1_1 dl1_12, List list, long l2) {
        int n3;
        int n4;
        Object object;
        int n7;
        ia$b_0 ia$b_0;
        int n8;
        xk1_0 xk1_02;
        int n10;
        Object object2;
        boolean bl2;
        long l3;
        dl1_1 dl1_13 = dl1_12;
        Object object3 = list;
        int n14 = 1;
        int n15 = list.isEmpty();
        if (n15 != 0) {
            n14 = c60.k(l2);
            n15 = c60.j(l2);
            object3 = ia$a_0.c;
            return cl1_0.a(dl1_12, n14, n15, (Function1)object3);
        }
        n15 = this.b;
        if (n15 != 0) {
            l3 = l2;
        } else {
            bl2 = false;
            object2 = null;
            n10 = 0;
            xk1_02 = null;
            n8 = 0;
            ia$b_0 = null;
            n7 = 0;
            object = null;
            n4 = 10;
            l3 = c60.b(l2, 0, 0, 0, 0, n4);
        }
        n15 = list.size();
        int n16 = 0;
        Object object4 = null;
        if (n15 == n14) {
            int n17;
            int n18;
            Object object5;
            void var22_25;
            Object e2 = object3.get(0);
            object3 = e2;
            object3 = (xk1_0)e2;
            HashMap hashMap = HA.a;
            Object object6 = object3.B();
            int n19 = object6 instanceof ga_0;
            if (n19 != 0) {
                ga_0 ga_02 = (ga_0)object6;
            } else {
                n15 = 0;
                Object var22_24 = null;
            }
            if (var22_25 != null) {
                n15 = (int)(var22_25.o ? 1 : 0);
            } else {
                n15 = 0;
                Object var22_26 = null;
            }
            if (n15 == 0) {
                object5 = object3.Q(l3);
                n15 = c60.k(l2);
                n18 = ((Ns2)object5).a;
                n15 = Math.max(n15, n18);
                n18 = c60.j(l2);
                n17 = ((Ns2)object5).b;
                n18 = Math.max(n18, n17);
            } else {
                n15 = c60.k(l2);
                n18 = c60.j(l2);
                n17 = c60.k(l2);
                n19 = c60.j(l2);
                if (n17 < 0 || n19 < 0) {
                    n14 = 0;
                    object5 = null;
                }
                if (n14 == 0) {
                    object5 = new StringBuilder("width(");
                    ((StringBuilder)object5).append(n17);
                    ((StringBuilder)object5).append(") and height(");
                    ((StringBuilder)object5).append(n19);
                    ((StringBuilder)object5).append(") must be >= 0");
                    hz0.a(((StringBuilder)object5).toString());
                    throw null;
                }
                long l4 = f60.i(n17, n17, n19, n19);
                object5 = object3.Q(l4);
            }
            n19 = n15;
            int n20 = n18;
            Object object7 = object5;
            object5 = ia$b_0;
            n17 = n15;
            n16 = n18;
            ia$b_0 = new ia$b_0((Ns2)object7, (xk1_0)object3, dl1_12, n15, n18, this);
            return cl1_0.a(dl1_13, n15, n18, ia$b_0);
        }
        n15 = list.size();
        Ns2[] ns2Array = new Ns2[n15];
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = n3 = c60.k(l2);
        Ref$IntRef ref$IntRef2 = new Ref$IntRef();
        ref$IntRef2.element = n8 = c60.j(l2);
        n8 = list.size();
        object = null;
        bl2 = false;
        object2 = null;
        for (n7 = 0; n7 < n8; n7 += n14) {
            xk1_02 = (xk1_0)object3.get(n7);
            Object object8 = HA.a;
            object8 = xk1_02.B();
            n16 = object8 instanceof ga_0;
            if (n16 != 0) {
                object8 = (ga_0)object8;
            } else {
                n4 = 0;
                object8 = null;
            }
            if (object8 != null) {
                n16 = (int)(((ga_0)object8).o ? 1 : 0);
            } else {
                n16 = 0;
                object4 = null;
            }
            if (n16 == 0) {
                ns2Array[n7] = object4 = xk1_02.Q(l3);
                n10 = ref$IntRef.element;
                n4 = ((Ns2)object4).a;
                ref$IntRef.element = n10 = Math.max(n10, n4);
                n10 = ref$IntRef2.element;
                n16 = ((Ns2)object4).b;
                ref$IntRef2.element = n16 = Math.max(n10, n16);
            } else {
                bl2 = true;
            }
            n16 = 0;
            object4 = null;
        }
        if (bl2) {
            int n21 = ref$IntRef.element;
            int n22 = -1 >>> 1;
            if (n21 != n22) {
                n16 = n21;
            } else {
                n16 = 0;
                object4 = null;
            }
            n8 = ref$IntRef2.element;
            n22 = n8 != n22 ? n8 : 0;
            l3 = f60.a(n16, n21, n22, n8);
            n16 = list.size();
            ia$b_0 = null;
            for (n8 = 0; n8 < n16; n8 += n14) {
                object = (xk1_0)object3.get(n8);
                object2 = HA.a;
                object2 = object.B();
                n10 = object2 instanceof ga_0;
                if (n10 != 0) {
                    object2 = (ga_0)object2;
                } else {
                    bl2 = false;
                    object2 = null;
                }
                if (object2 != null) {
                    bl2 = ((ga_0)object2).o;
                } else {
                    bl2 = false;
                    object2 = null;
                }
                if (!bl2) continue;
                ns2Array[n8] = object = object.Q(l3);
            }
        }
        n8 = ref$IntRef.element;
        n7 = ref$IntRef2.element;
        ia$c_0 ia$c_0 = object2;
        object3 = list;
        object4 = ref$IntRef2;
        object2 = new ia$c_0(ns2Array, list, dl1_12, ref$IntRef, ref$IntRef2, this);
        return cl1_0.a(dl1_13, n8, n7, (Function1)object2);
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof IA;
        if (!bl3) {
            return false;
        }
        object = (IA)object;
        Nc nc = this.a;
        Nc nc2 = ((IA)object).a;
        bl3 = Intrinsics.areEqual(nc, nc2);
        if (!bl3) {
            return false;
        }
        bl3 = this.b;
        boolean bl4 = ((IA)object).b;
        if (bl3 != bl4) {
            return false;
        }
        return bl2;
    }

    public final /* synthetic */ int h(Rj1 rj1, List list, int n3) {
        return ZK1.d(this, rj1, list, n3);
    }

    public final int hashCode() {
        Nc nc = this.a;
        int n3 = nc.hashCode() * 31;
        int n4 = this.b;
        n4 = n4 != 0 ? 1231 : 1237;
        return n3 + n4;
    }

    public final /* synthetic */ int i(Rj1 rj1, List list, int n3) {
        return ZK1.a(this, rj1, list, n3);
    }

    public final /* synthetic */ int j(Rj1 rj1, List list, int n3) {
        return ZK1.c(this, rj1, list, n3);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("BoxMeasurePolicy(alignment=");
        Nc nc = this.a;
        stringBuilder.append(nc);
        stringBuilder.append(", propagateMinConstraints=");
        boolean bl2 = this.b;
        return AR.a(stringBuilder, bl2, ')');
    }
}

