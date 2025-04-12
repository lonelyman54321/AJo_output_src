/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class kQ2
implements al1_1,
eq2_0 {
    public final zp$e a;
    public final Nc$c b;

    public kQ2(zp$e zp$e, Gx$b gx$b) {
        this.a = zp$e;
        this.b = gx$b;
    }

    public final int a(Rj1 rj1, List list, int n3) {
        int n4;
        zp$e zp$e = this.a;
        float f5 = zp$e.a();
        int n7 = rj1.e0(f5);
        int n8 = list.isEmpty();
        if (n8 == 0) {
            n8 = list.size();
            int n10 = 0;
            int n14 = 0;
            float f6 = 0.0f;
            for (n4 = 0; n4 < n8; ++n4) {
                Qj1 qj1 = (Qj1)list.get(n4);
                hQ2 hQ22 = dq2_0.a(qj1);
                float f7 = dq2_0.b(hQ22);
                int n15 = qj1.P(n3);
                float f8 = f7 - 0.0f;
                Object object = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
                if (object == false) {
                    n14 += n15;
                    continue;
                }
                float f11 = f7 - 0.0f;
                object = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
                if (object <= 0) continue;
                f6 += f7;
                float f12 = (float)n15 / f7;
                n15 = Math.round(f12);
                n10 = Math.max(n10, n15);
            }
            float f14 = (float)n10 * f6;
            n3 = Math.round(f14) + n14;
            int n16 = (list.size() + -1) * n7;
            n4 = n16 + n3;
        }
        return n4;
    }

    public final void b(int n3, int[] nArray, int[] nArray2, dl1_1 dl1_12) {
        bp1_0 bp1_02 = dl1_12.getLayoutDirection();
        this.a.b(dl1_12, n3, nArray, bp1_02, nArray2);
    }

    public final bl1_0 c(dl1_1 dl1_12, List list, long l2) {
        int n3 = c60.k(l2);
        int n4 = c60.j(l2);
        int n7 = c60.i(l2);
        int n8 = c60.h(l2);
        float f5 = this.a.a();
        int n10 = dl1_12.e0(f5);
        Ns2[] ns2Array = new Ns2[list.size()];
        int n14 = list.size();
        return gq2_0.a(this, n3, n4, n7, n8, n10, dl1_12, list, ns2Array, n14);
    }

    public final int d(Ns2 ns2) {
        return ns2.b;
    }

    public final int e(Ns2 ns2) {
        return ns2.a;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof kQ2;
        if (!bl3) {
            return false;
        }
        object = (kQ2)object;
        zp$e zp$e = this.a;
        Object object2 = ((kQ2)object).a;
        bl3 = Intrinsics.areEqual(zp$e, object2);
        if (!bl3) {
            return false;
        }
        object2 = this.b;
        object = ((kQ2)object).b;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    /*
     * WARNING - void declaration
     */
    public final long f(int n3, int n4, int n7, boolean bl2) {
        long l2;
        if (!bl2) {
            l2 = f60.a(n3, n4, 0, n7);
        } else {
            void var4_8;
            int n8 = 262142;
            n3 = Math.min(n3, n8);
            int n10 = -1 >>> 1;
            if ((n4 = n4 == n10 ? -1 >>> 1 : Math.min(n4, n8)) == n10) {
                int n14 = n3;
            } else {
                int n15 = n4;
            }
            int n16 = f60.c((int)var4_8);
            if (n7 != n10) {
                n10 = Math.min(n16, n7);
            }
            n7 = Math.min(n16, 0);
            l2 = f60.a(n3, n4, n7, n10);
        }
        return l2;
    }

    public final bl1_0 g(Ns2[] ns2Array, dl1_1 dl1_12, int n3, int[] nArray, int n4, int n7) {
        jq2_0 jq2_02 = new jq2_0(ns2Array, this, n7, n3, nArray);
        return cl1_0.a(dl1_12, n4, n7, jq2_02);
    }

    public final int h(Rj1 rj1, List list, int n3) {
        int n4;
        zp$e zp$e = this.a;
        float f5 = zp$e.a();
        int n7 = rj1.e0(f5);
        int n8 = list.isEmpty();
        if (n8 == 0) {
            n8 = list.size();
            int n10 = 0;
            int n14 = 0;
            float f6 = 0.0f;
            for (n4 = 0; n4 < n8; ++n4) {
                Qj1 qj1 = (Qj1)list.get(n4);
                hQ2 hQ22 = dq2_0.a(qj1);
                float f7 = dq2_0.b(hQ22);
                int n15 = qj1.N(n3);
                float f8 = f7 - 0.0f;
                Object object = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
                if (object == false) {
                    n14 += n15;
                    continue;
                }
                float f11 = f7 - 0.0f;
                object = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
                if (object <= 0) continue;
                f6 += f7;
                float f12 = (float)n15 / f7;
                n15 = Math.round(f12);
                n10 = Math.max(n10, n15);
            }
            float f14 = (float)n10 * f6;
            n3 = Math.round(f14) + n14;
            int n16 = (list.size() + -1) * n7;
            n4 = n16 + n3;
        }
        return n4;
    }

    public final int hashCode() {
        int n3 = this.a.hashCode() * 31;
        return this.b.hashCode() + n3;
    }

    public final int i(Rj1 rj1, List list, int n3) {
        Object object = this.a;
        float f5 = object.a();
        int n4 = rj1.e0(f5);
        int n7 = list.isEmpty();
        int n8 = 0;
        if (n7 == 0) {
            float f6;
            int n10;
            n4 = Math.min((list.size() + -1) * n4, n3);
            n7 = list.size();
            int n14 = 0;
            float f7 = 0.0f;
            hQ2 hQ22 = null;
            Object object2 = 0;
            float f8 = 0.0f;
            int n15 = 0;
            while (true) {
                n10 = -1 >>> 1;
                if (n14 >= n7) break;
                Qj1 qj1 = (Qj1)list.get(n14);
                hQ2 hQ23 = dq2_0.a(qj1);
                float f11 = dq2_0.b(hQ23);
                float f12 = f11 - 0.0f;
                Object object3 = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
                if (object3 == false) {
                    int n16;
                    if (n3 == n10) {
                        n16 = -1 >>> 1;
                        f11 = 0.0f / 0.0f;
                    } else {
                        n16 = n3 - n4;
                    }
                    n10 = Math.min(qj1.P(n10), n16);
                    n4 += n10;
                    n10 = qj1.v(n10);
                    n15 = Math.max(n15, n10);
                } else {
                    float f14 = f11 - 0.0f;
                    n10 = (int)(f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1));
                    if (n10 > 0) {
                        f8 += f11;
                    }
                }
                ++n14;
            }
            float f15 = f8 - 0.0f;
            n7 = (int)(f15 == 0.0f ? 0 : (f15 < 0.0f ? -1 : 1));
            if (n7 == 0) {
                n4 = 0;
                f6 = 0.0f;
                rj1 = null;
            } else if (n3 == n10) {
                n4 = -1 >>> 1;
                f6 = 0.0f / 0.0f;
            } else {
                f6 = (float)Math.max(n3 -= n4, 0) / f8;
                n4 = Math.round(f6);
            }
            n3 = list.size();
            while (n8 < n3) {
                object = (Qj1)list.get(n8);
                hQ22 = dq2_0.a((Qj1)object);
                f7 = dq2_0.b(hQ22);
                float f16 = f7 - 0.0f;
                object2 = f16 == 0.0f ? 0 : (f16 > 0.0f ? 1 : -1);
                if (object2 > 0) {
                    if (n4 != n10) {
                        f8 = (float)n4 * f7;
                        n14 = Math.round(f8);
                    } else {
                        n14 = -1 >>> 1;
                        f7 = 0.0f / 0.0f;
                    }
                    n7 = object.v(n14);
                    n15 = Math.max(n15, n7);
                }
                ++n8;
            }
            n8 = n15;
        }
        return n8;
    }

    public final int j(Rj1 rj1, List list, int n3) {
        Object object = this.a;
        float f5 = object.a();
        int n4 = rj1.e0(f5);
        int n7 = list.isEmpty();
        int n8 = 0;
        if (n7 == 0) {
            float f6;
            int n10;
            n4 = Math.min((list.size() + -1) * n4, n3);
            n7 = list.size();
            int n14 = 0;
            float f7 = 0.0f;
            hQ2 hQ22 = null;
            Object object2 = 0;
            float f8 = 0.0f;
            int n15 = 0;
            while (true) {
                n10 = -1 >>> 1;
                if (n14 >= n7) break;
                Qj1 qj1 = (Qj1)list.get(n14);
                hQ2 hQ23 = dq2_0.a(qj1);
                float f11 = dq2_0.b(hQ23);
                float f12 = f11 - 0.0f;
                Object object3 = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
                if (object3 == false) {
                    int n16;
                    if (n3 == n10) {
                        n16 = -1 >>> 1;
                        f11 = 0.0f / 0.0f;
                    } else {
                        n16 = n3 - n4;
                    }
                    n10 = Math.min(qj1.P(n10), n16);
                    n4 += n10;
                    n10 = qj1.I(n10);
                    n15 = Math.max(n15, n10);
                } else {
                    float f14 = f11 - 0.0f;
                    n10 = (int)(f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1));
                    if (n10 > 0) {
                        f8 += f11;
                    }
                }
                ++n14;
            }
            float f15 = f8 - 0.0f;
            n7 = (int)(f15 == 0.0f ? 0 : (f15 < 0.0f ? -1 : 1));
            if (n7 == 0) {
                n4 = 0;
                f6 = 0.0f;
                rj1 = null;
            } else if (n3 == n10) {
                n4 = -1 >>> 1;
                f6 = 0.0f / 0.0f;
            } else {
                f6 = (float)Math.max(n3 -= n4, 0) / f8;
                n4 = Math.round(f6);
            }
            n3 = list.size();
            while (n8 < n3) {
                object = (Qj1)list.get(n8);
                hQ22 = dq2_0.a((Qj1)object);
                f7 = dq2_0.b(hQ22);
                float f16 = f7 - 0.0f;
                object2 = f16 == 0.0f ? 0 : (f16 > 0.0f ? 1 : -1);
                if (object2 > 0) {
                    if (n4 != n10) {
                        f8 = (float)n4 * f7;
                        n14 = Math.round(f8);
                    } else {
                        n14 = -1 >>> 1;
                        f7 = 0.0f / 0.0f;
                    }
                    n7 = object.I(n14);
                    n15 = Math.max(n15, n7);
                }
                ++n8;
            }
            n8 = n15;
        }
        return n8;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("RowMeasurePolicy(horizontalArrangement=");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(", verticalAlignment=");
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

