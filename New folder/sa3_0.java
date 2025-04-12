/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

/*
 * Renamed from SA3
 */
public final class sa3_0
implements ma3_0 {
    public final Ni1 a;
    public final Qi1 b;
    public final int c;
    public final cx0_0 d;
    public int[] e;
    public float[] f;
    public Ol g;
    public Ol h;
    public Ol i;
    public Ol j;
    public float[] k;
    public float[] l;
    public vp_0 m;

    public sa3_0(sr1_0 sr1_02, tr1_1 tr1_12, int n3, dx0_0 dx0_02) {
        this.a = sr1_02;
        this.b = tr1_12;
        this.c = n3;
        this.d = dx0_02;
    }

    public final int a() {
        return this.c;
    }

    public final /* synthetic */ boolean b() {
        return false;
    }

    public final int c() {
        return 0;
    }

    public final Ol d(Ol ol, Ol ol2, Ol ol4) {
        long l2 = this.g(ol, ol2, ol4);
        return this.e(l2, ol, ol2, ol4);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final Ol e(long l2, Ol ol, Ol ol2, Ol ol4) {
        void var32_37;
        int n3;
        Object object;
        float f5;
        int n4;
        int n7;
        float f6;
        String string2;
        float[] fArray;
        Object object2;
        float f7;
        int n8;
        sa3_0 sa3_02 = this;
        long l3 = 1000000L;
        long l4 = l2 / l3;
        long l7 = 0;
        long l8 = l4 - l7;
        int n10 = this.a();
        l4 = n10;
        long l12 = 0L;
        long l14 = (l8 = kotlin.ranges.f.i(l8, l12, l4)) - (l4 = 0L);
        Object object3 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
        if (object3 < 0) {
            return ol4;
        }
        this.j(ol, ol2, ol4);
        Object object4 = this.m;
        String string3 = "velocityVector";
        Object object5 = null;
        if (object4 != null) {
            n10 = (int)l8;
            n8 = this.h(n10);
            f7 = this.i(n8, n10, false);
            object2 = this.m;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("arcSpline");
                n8 = 0;
                object2 = null;
            }
            fArray = sa3_02.l;
            string2 = "slopeArray";
            if (fArray == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                boolean bl2 = false;
                fArray = null;
                f6 = 0.0f;
            }
            object2 = ((vp_0)object2).a;
            vp$a_0 vp$a_0 = object2[0][0];
            float f8 = vp$a_0.a;
            int n14 = 1;
            Object object6 = f7 == f8 ? 0 : (f7 < f8 ? -1 : 1);
            if (object6 < 0) {
                f7 = f8;
            } else {
                n7 = ((vp$a_0[][])object2).length - n14;
                vp$a_0 = object2[n7][0];
                f8 = vp$a_0.b;
                float f11 = f7 - f8;
                n7 = (int)(f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1));
                if (n7 > 0) {
                    n10 = ((vp$a_0[][])object2).length - n14;
                    object4 = object2[n10][0];
                    f7 = ((vp$a_0)object4).b;
                }
            }
            n7 = ((vp$a_0[][])object2).length;
            boolean bl3 = false;
            n4 = 0;
            f5 = 0.0f;
            object = null;
        } else {
            l4 = l8 - 1L;
            long l15 = l4 * l3;
            object4 = this;
            Ol ol5 = ol;
            Ol ol6 = ol2;
            Ol ol7 = ol4;
            ol7 = this.f(l15, ol, ol2, ol4);
            l15 = l8 * l3;
            Ol ol8 = ol7;
            ol7 = ol4;
            object4 = this.f(l15, ol, ol2, ol4);
            int n15 = ol8.b();
            for (n3 = 0; n3 < n15; ++n3) {
                Ol ol9 = sa3_02.h;
                if (ol9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                    boolean bl4 = false;
                    ol9 = null;
                    float f12 = 0.0f;
                }
                float f14 = ol8.a(n3);
                float f15 = ((Ol)object4).a(n3);
                f14 -= f15;
                int n16 = 1148846080;
                f15 = 1000.0f;
                ol9.e(f14 *= f15, n3);
            }
            object4 = sa3_02.h;
            if (object4 != null) return object4;
            Intrinsics.throwUninitializedPropertyAccessException(string3);
            return object5;
        }
        while (var32_37 < n7) {
            int n17;
            int n18 = 0;
            for (int i3 = 0; i3 < (n17 = fArray.length); i3 += 2, ++n18) {
                float f16;
                Object object7 = object2[var32_37][n18];
                float f17 = ((vp$a_0)object7).b;
                float f18 = f7 - f17;
                Object object8 = f18 == 0.0f ? 0 : (f18 < 0.0f ? -1 : 1);
                if (object8 > 0) continue;
                n4 = ((vp$a_0)object7).r;
                if (n4 != 0) {
                    fArray[i3] = f5 = ((vp$a_0)object7).n;
                    n4 = i3 + 1;
                    fArray[n4] = f16 = ((vp$a_0)object7).o;
                } else {
                    ((vp$a_0)object7).c(f7);
                    object = object2[var32_37][n18];
                    fArray[i3] = f5 = ((vp$a_0)object).a();
                    n4 = i3 + 1;
                    object7 = object2[var32_37][n18];
                    fArray[n4] = f16 = ((vp$a_0)object7).b();
                }
                n4 = 1;
                f5 = Float.MIN_VALUE;
            }
            if (n4 != 0) break;
            ++var32_37;
        }
        if ((object4 = (Object)sa3_02.l) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n10 = 0;
            object4 = null;
            f7 = 0.0f;
        }
        n10 = ((Object)object4).length;
        while (n3 < n10) {
            object2 = sa3_02.h;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                n8 = 0;
                object2 = null;
            }
            if ((fArray = sa3_02.l) == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                boolean bl5 = false;
                fArray = null;
                f6 = 0.0f;
            }
            f6 = fArray[n3];
            ((Ol)object2).e(f6, n3);
            ++n3;
        }
        object4 = sa3_02.h;
        if (object4 != null) return object4;
        Intrinsics.throwUninitializedPropertyAccessException(string3);
        return object5;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final Ol f(long l2, Ol ol, Ol ol2, Ol ol4) {
        Object object;
        String string2;
        float f5;
        int n3;
        String string3;
        float f6;
        int n4;
        float f7;
        int n7;
        Object object2;
        Object object3;
        sa3_0 sa3_02;
        block25: {
            void var34_46;
            float f8;
            int n8;
            float f11;
            int n10;
            float f12;
            Object object4;
            float f14;
            int n14;
            Object object5;
            float f15;
            int n15;
            float f16;
            Object object6;
            block29: {
                void var34_44;
                int n16;
                block28: {
                    int n17;
                    int n18;
                    int n19;
                    block26: {
                        float f17;
                        vp$a_0 vp$a_0;
                        block27: {
                            sa3_02 = this;
                            object3 = ol;
                            object2 = ol2;
                            n7 = 1;
                            f7 = Float.MIN_VALUE;
                            long l3 = l2 / 1000000L;
                            n4 = 0;
                            f6 = 0.0f;
                            Object var15_13 = null;
                            object6 = this.b;
                            long l4 = 0;
                            long l7 = l3 - l4;
                            long l8 = 0L;
                            n19 = this.a();
                            long l12 = n19;
                            n18 = (int)(l3 = kotlin.ranges.f.i(l7, l8, l12));
                            n16 = ((Qi1)object6).a(n18);
                            if (n16 != 0) {
                                object3 = ((Qi1)object6).c(n18);
                                Intrinsics.checkNotNull(object3);
                                return ((RA3)object3).a;
                            }
                            n16 = this.c;
                            if (n18 >= n16) {
                                return ol2;
                            }
                            if (n18 <= 0) {
                                return ol;
                            }
                            Object object7 = ol4;
                            this.j(ol, ol2, ol4);
                            object7 = this.m;
                            string3 = "valueVector";
                            if (object7 == null) break block26;
                            n3 = this.h(n18);
                            f5 = this.i(n3, n18, false);
                            object2 = this.m;
                            if (object2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("arcSpline");
                                object2 = null;
                            }
                            object6 = sa3_02.k;
                            string2 = "posArray";
                            if (object6 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(string2);
                                n19 = 0;
                                object6 = null;
                            }
                            object2 = ((vp_0)object2).a;
                            object7 = object2[0][0];
                            f16 = ((vp$a_0)object7).a;
                            float f18 = f5 - f16;
                            Object object8 = f18 == 0.0f ? 0 : (f18 < 0.0f ? -1 : 1);
                            if (object8 < 0) break block27;
                            int n20 = ((vp$a_0[][])object2).length - n7;
                            vp$a_0 = object2[n20][0];
                            f17 = vp$a_0.b;
                            float f19 = f5 - f17;
                            Object object9 = f19 == 0.0f ? 0 : (f19 > 0.0f ? 1 : -1);
                            if (object9 > 0) break block27;
                            n16 = ((vp$a_0[][])object2).length;
                            boolean bl2 = false;
                            f17 = 0.0f;
                            vp$a_0 = null;
                            n15 = 0;
                            f15 = 0.0f;
                            object5 = null;
                            break block28;
                        }
                        n4 = ((vp$a_0[][])object2).length - n7;
                        vp$a_0[] vp$a_0Array = object2[n4];
                        n14 = 0;
                        f14 = 0.0f;
                        object4 = null;
                        vp$a_0 vp$a_02 = vp$a_0Array[0];
                        f6 = vp$a_02.b;
                        float f20 = f5 - f6;
                        n4 = (int)(f20 == 0.0f ? 0 : (f20 > 0.0f ? 1 : -1));
                        if (n4 > 0) {
                            n4 = ((vp$a_0[][])object2).length - n7;
                            n16 = ((Object)object2).length - n7;
                            object = object2[n16][0];
                            f16 = ((vp$a_0)object).b;
                        } else {
                            n4 = 0;
                            f6 = 0.0f;
                            Object var15_20 = null;
                        }
                        f5 -= f16;
                        f7 = 0.0f;
                        object = null;
                        boolean bl3 = false;
                        f17 = 0.0f;
                        vp$a_0 = null;
                        break block29;
                    }
                    n4 = this.h(n18);
                    float f22 = this.i(n4, n18, n7 != 0);
                    Object object10 = this.a;
                    n16 = ((Ni1)object10).a(n4);
                    boolean bl4 = ((Qi1)object6).a(n16);
                    if (bl4) {
                        object3 = ((Qi1)object6).c(n16);
                        Intrinsics.checkNotNull(object3);
                        object3 = ((RA3)object3).a;
                    }
                    n16 = 1;
                    float f23 = Float.MIN_VALUE;
                    n4 += n16;
                    n7 = ((Ni1)object10).a(n4);
                    if ((n4 = (int)(((Qi1)object6).a(n7) ? 1 : 0)) != 0) {
                        object2 = ((Qi1)object6).c(n7);
                        Intrinsics.checkNotNull(object2);
                        object2 = ((RA3)object2).a;
                    }
                    if ((object10 = sa3_02.g) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string3);
                        n7 = 0;
                        f7 = 0.0f;
                        object10 = null;
                    }
                    n7 = ((Ol)object10).b();
                    f6 = 0.0f;
                    Object var15_24 = null;
                    for (n4 = 0; n4 < n7; n4 += n17) {
                        object6 = sa3_02.g;
                        if (object6 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string3);
                            n19 = 0;
                            object6 = null;
                        }
                        f23 = ((Ol)object3).a(n4);
                        float f24 = ((Ol)object2).a(n4);
                        Ws3 ws3 = ya3_0.a;
                        n17 = 1;
                        float f25 = Float.MIN_VALUE;
                        float f26 = ((float)n17 - f22) * f23;
                        f24 = f24 * f22 + f26;
                        ((Ol)object6).e(f24, n4);
                    }
                    object3 = sa3_02.g;
                    if (object3 != null) return object3;
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                    return null;
                }
                while (var34_44 < n16) {
                    int n21;
                    f12 = 0.0f;
                    n10 = 0;
                    f11 = 0.0f;
                    for (n8 = 0; n8 < (n21 = ((Object)object6).length); n8 += 2, n10 += n7) {
                        Object object11 = object2[var34_44][n10];
                        f8 = ((vp$a_0)object11).b;
                        float f27 = f5 - f8;
                        Object object12 = f27 == 0.0f ? 0 : (f27 < 0.0f ? -1 : 1);
                        if (object12 <= 0) {
                            n15 = (int)(((vp$a_0)object11).r ? 1 : 0);
                            if (n15 != 0) {
                                f15 = ((vp$a_0)object11).a;
                                f8 = f5 - f15;
                                f14 = ((vp$a_0)object11).k;
                                f6 = ((vp$a_0)object11).e;
                                f7 = ((vp$a_0)object11).c;
                                f7 = xu0_1.a(f6, f7, f8 *= f14, f7);
                                object6[n8] = f7;
                                n7 = 1;
                                n4 = n8 + 1;
                                f7 = (f5 - f15) * f14;
                                f14 = ((vp$a_0)object11).f;
                                f15 = ((vp$a_0)object11).d;
                                f7 = xu0_1.a(f14, f15, f7, f15);
                                object6[n4] = f7;
                            } else {
                                ((vp$a_0)object11).c(f5);
                                object = object2[var34_44][n10];
                                f6 = ((vp$a_0)object).l;
                                f14 = ((vp$a_0)object).h;
                                f6 *= f14;
                                f14 = ((vp$a_0)object).n;
                                object6[n8] = f6 += f14;
                                n4 = 1;
                                n14 = n8 + 1;
                                f6 = ((vp$a_0)object).m;
                                f15 = ((vp$a_0)object).i;
                                f6 *= f15;
                                f7 = ((vp$a_0)object).o;
                                object6[n14] = f6 += f7;
                            }
                            n15 = 1;
                            f15 = Float.MIN_VALUE;
                        }
                        n7 = 1;
                        f7 = Float.MIN_VALUE;
                        n4 = 0;
                        f6 = 0.0f;
                        Object var15_16 = null;
                    }
                    if (n15 == 0) {
                        var34_44 += n7;
                        n4 = 0;
                        f6 = 0.0f;
                        Object var15_17 = null;
                        continue;
                    }
                    break block25;
                }
                break block25;
            }
            for (n7 = 0; n7 < (n15 = ((Object)object6).length); n7 += 2, ++var34_46) {
                object5 = object2[n4][var34_46];
                n8 = (int)(((vp$a_0)object5).r ? 1 : 0);
                if (n8 != 0) {
                    f12 = ((vp$a_0)object5).a;
                    f11 = f16 - f12;
                    float f28 = ((vp$a_0)object5).k;
                    f8 = ((vp$a_0)object5).e;
                    f14 = ((vp$a_0)object5).c;
                    f14 = xu0_1.a(f8, f14, f11 *= f28, f14);
                    f11 = ((vp$a_0)object5).n * f5 + f14;
                    object6[n7] = f11;
                    n14 = 1;
                    n10 = n7 + 1;
                    f14 = (f16 - f12) * f28;
                    f12 = ((vp$a_0)object5).f;
                    f28 = ((vp$a_0)object5).d;
                    f14 = xu0_1.a(f12, f28, f14, f28);
                    f15 = ((vp$a_0)object5).o * f5 + f14;
                    object6[n10] = f15;
                } else {
                    ((vp$a_0)object5).c(f16);
                    object4 = object2[n4][var34_46];
                    f15 = ((vp$a_0)object4).l;
                    f12 = ((vp$a_0)object4).h;
                    f15 *= f12;
                    f12 = ((vp$a_0)object4).n;
                    f14 = ((vp$a_0)object4).a() * f5 + (f15 += f12);
                    object6[n7] = f14;
                    n14 = 1;
                    n15 = n7 + 1;
                    object4 = object2[n4][var34_46];
                    f12 = ((vp$a_0)object4).m;
                    f11 = ((vp$a_0)object4).i;
                    f12 *= f11;
                    f11 = ((vp$a_0)object4).o;
                    f14 = ((vp$a_0)object4).b() * f5 + (f12 += f11);
                    object6[n15] = f14;
                }
                n14 = 0;
                f14 = 0.0f;
                object4 = null;
            }
        }
        if ((object3 = (Object)sa3_02.k) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            f5 = 0.0f;
            object3 = null;
        }
        n3 = ((Object)object3).length;
        f6 = 0.0f;
        Object var15_23 = null;
        for (n4 = 0; n4 < n3; n4 += n7) {
            object2 = sa3_02.g;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                object2 = null;
            }
            if ((object = (Object)sa3_02.k) == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n7 = 0;
                f7 = 0.0f;
                object = null;
            }
            f7 = (float)object[n4];
            ((Ol)object2).e(f7, n4);
            n7 = 1;
            f7 = Float.MIN_VALUE;
        }
        object3 = sa3_02.g;
        if (object3 != null) return object3;
        Intrinsics.throwUninitializedPropertyAccessException(string3);
        return null;
    }

    public final long g(Ol ol, Ol ol2, Ol ol4) {
        return (long)this.a() * 1000000L;
    }

    public final int h(int n3) {
        Object object = this.a;
        int n4 = ((Ni1)object).b;
        if (n4 >= 0) {
            int n7;
            block5: {
                n4 += -1;
                int n8 = 0;
                while (n8 <= n4) {
                    n7 = n8 + n4 >>> 1;
                    int n10 = ((Ni1)object).a(n7);
                    if (n10 < n3) {
                        n8 = n7 + 1;
                        continue;
                    }
                    if (n10 > n3) {
                        n4 = n7 + -1;
                        continue;
                    }
                    break block5;
                }
                n7 = -(++n8);
            }
            if (n7 < (n3 = -1)) {
                n7 = -(n7 + 2);
            }
            return n7;
        }
        CharSequence charSequence = new StringBuilder("fromIndex(0) > toIndex(");
        charSequence.append(n4);
        charSequence.append(')');
        charSequence = charSequence.toString();
        object = new IllegalArgumentException((String)charSequence);
        throw object;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final float i(int n3, int n4, boolean bl2) {
        float f5;
        float f6;
        Object object = this.a;
        int n7 = ((Ni1)object).b + -1;
        long l2 = 1000L;
        if (n3 >= n7) {
            f6 = n4;
        } else {
            n7 = ((Ni1)object).a(n3);
            ++n3;
            n3 = ((Ni1)object).a(n3);
            if (n4 == n7) {
                f6 = n7;
            } else {
                n3 -= n7;
                object = (RA3)this.b.c(n7);
                if (object == null || (object = ((RA3)object).b) == null) {
                    object = this.d;
                }
                f5 = n4 -= n7;
                f6 = n3;
                f5 /= f6;
                f5 = object.a(f5);
                if (bl2) {
                    return f5;
                }
                f6 *= f5;
                f5 = n7;
                f6 += f5;
            }
        }
        f5 = l2;
        return f6 / f5;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void j(Ol object, Ol object2, Ol object3) {
        block21: {
            Object object4;
            float f5;
            int n3;
            int n4;
            int n7;
            Ni1 ni1;
            Qi1 qi1;
            Object object5;
            int n8;
            Object object6;
            block20: {
                boolean bl2;
                object6 = this.m;
                n8 = 1;
                if (object6 != null) {
                    bl2 = true;
                } else {
                    bl2 = false;
                    object6 = null;
                }
                object5 = this.g;
                qi1 = this.b;
                ni1 = this.a;
                if (object5 == null) {
                    float f6;
                    object5 = Pl.b((Ol)object);
                    this.g = object5;
                    this.h = object3 = Pl.b((Ol)object3);
                    n7 = ni1.b;
                    object5 = new float[n7];
                    for (n4 = 0; n4 < n7; ++n4) {
                        n3 = ni1.a(n4);
                        f6 = n3;
                        long l2 = 1000L;
                        f5 = l2;
                        object5[n4] = f6 /= f5;
                    }
                    this.f = (float[])object5;
                    n7 = ni1.b;
                    object5 = new int[n7];
                    for (n4 = 0; n4 < n7; ++n4) {
                        n3 = ni1.a(n4);
                        object4 = (RA3)qi1.c(n3);
                        if (object4 != null) {
                            n3 = ((RA3)object4).c;
                        } else {
                            n3 = 0;
                            f6 = 0.0f;
                            object4 = null;
                        }
                        if (n3 != 0) {
                            bl2 = true;
                        }
                        object5[n4] = n3;
                    }
                    this.e = (int[])object5;
                }
                if (!bl2) {
                    return;
                }
                object3 = this.m;
                bl2 = false;
                object6 = null;
                if (object3 == null) break block20;
                object3 = this.i;
                if (object3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("lastInitialValue");
                    n7 = 0;
                    object3 = null;
                }
                if ((n7 = (int)(Intrinsics.areEqual(object3, object) ? 1 : 0)) == 0) break block20;
                object3 = this.j;
                if (object3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("lastTargetValue");
                    n7 = 0;
                    object3 = null;
                }
                if ((n7 = (int)(Intrinsics.areEqual(object3, object2) ? 1 : 0)) != 0) break block21;
            }
            this.i = object;
            this.j = object2;
            n7 = ((Ol)object).b() % 2;
            n8 = ((Ol)object).b() + n7;
            object3 = new float[n8];
            this.k = (float[])object3;
            object3 = new float[n8];
            this.l = (float[])object3;
            n7 = ni1.b;
            object5 = new float[n7][];
            for (n4 = 0; n4 < n7; ++n4) {
                block24: {
                    float[] fArray;
                    block25: {
                        float f7;
                        int n10;
                        float f8;
                        block26: {
                            block27: {
                                int n14;
                                block22: {
                                    block23: {
                                        n3 = ni1.a(n4);
                                        if (n3 != 0) break block22;
                                        n14 = (int)(qi1.a(n3) ? 1 : 0);
                                        if (n14 != 0) break block23;
                                        object4 = new float[n8];
                                        f5 = 0.0f;
                                        fArray = null;
                                        for (n14 = 0; n14 < n8; ++n14) {
                                            f8 = ((Ol)object).a(n14);
                                            object4[n14] = f8;
                                        }
                                        break block24;
                                    }
                                    fArray = new float[n8];
                                    object4 = qi1.c(n3);
                                    Intrinsics.checkNotNull(object4);
                                    object4 = ((RA3)object4).a;
                                    f8 = 0.0f;
                                    for (n10 = 0; n10 < n8; ++n10) {
                                        fArray[n10] = f7 = ((Ol)object4).a(n10);
                                    }
                                    break block25;
                                }
                                n14 = this.c;
                                if (n3 != n14) break block26;
                                n14 = (int)(qi1.a(n3) ? 1 : 0);
                                if (n14 != 0) break block27;
                                object4 = new float[n8];
                                f5 = 0.0f;
                                fArray = null;
                                for (n14 = 0; n14 < n8; ++n14) {
                                    f8 = ((Ol)object2).a(n14);
                                    object4[n14] = f8;
                                }
                                break block24;
                            }
                            fArray = new float[n8];
                            object4 = qi1.c(n3);
                            Intrinsics.checkNotNull(object4);
                            object4 = ((RA3)object4).a;
                            f8 = 0.0f;
                            for (n10 = 0; n10 < n8; ++n10) {
                                fArray[n10] = f7 = ((Ol)object4).a(n10);
                            }
                            break block25;
                        }
                        fArray = new float[n8];
                        object4 = qi1.c(n3);
                        Intrinsics.checkNotNull(object4);
                        object4 = ((RA3)object4).a;
                        f8 = 0.0f;
                        for (n10 = 0; n10 < n8; ++n10) {
                            fArray[n10] = f7 = ((Ol)object4).a(n10);
                        }
                    }
                    object4 = fArray;
                }
                object5[n4] = object4;
            }
            object2 = this.e;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("modes");
                object2 = null;
            }
            if ((object3 = (Object)this.f) == null) {
                object3 = "times";
                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            } else {
                object6 = object3;
            }
            this.m = object = new vp_0((int[])object2, (float[])object6, (float[][])object5);
        }
    }
}

