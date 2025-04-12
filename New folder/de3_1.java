/*
 * Decompiled with CFR 0.152.
 */
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/*
 * Renamed from de3
 */
public final class de3_1
extends k0_0
implements km1_2 {
    public final c30_0 a;
    public final ml1_2 b;
    public final pj3_2 c;
    public final km1_2[] d;
    public final i0_0 e;
    public final sl1_2 f;
    public boolean g;
    public String h;
    public String i;

    public de3_1(c30_0 object, ml1_2 object2, pj3_2 pj3_22, km1_2[] km1_2Array) {
        Intrinsics.checkNotNullParameter(object, "composer");
        Intrinsics.checkNotNullParameter(object2, "json");
        String string2 = "mode";
        Intrinsics.checkNotNullParameter((Object)pj3_22, string2);
        this.a = object;
        this.b = object2;
        this.c = pj3_22;
        this.d = km1_2Array;
        this.e = object = ((ml1_2)object2).b;
        this.f = object = ((ml1_2)object2).a;
        int n3 = pj3_22.ordinal();
        if (km1_2Array != null && ((object2 = km1_2Array[n3]) != null || object2 != this)) {
            km1_2Array[n3] = this;
        }
    }

    public final void B(b03_0 object, Object object2) {
        block9: {
            Object object3;
            boolean bl2;
            Object object4;
            Object object5;
            block14: {
                block11: {
                    block13: {
                        block12: {
                            block10: {
                                block8: {
                                    Intrinsics.checkNotNullParameter(object, "serializer");
                                    object5 = this.b;
                                    object4 = ((ml1_2)object5).a;
                                    bl2 = object4.i;
                                    if (!bl2) break block8;
                                    object.serialize(this, object2);
                                    break block9;
                                }
                                bl2 = object instanceof l1_0;
                                if (!bl2) break block10;
                                object4 = object4.p;
                                object3 = su_1.NONE;
                                if (object4 == object3) break block11;
                                break block12;
                            }
                            object4 = object4.p;
                            object3 = ow2$a.$EnumSwitchMapping$0;
                            Object object6 = ((Enum)object4).ordinal();
                            Object object7 = 1;
                            if ((object6 = (Object)((Object)object3[object6])) == object7 || object6 == (object7 = 2)) break block11;
                            object7 = 3;
                            if (object6 != object7) break block13;
                            object4 = object.getDescriptor().getKind();
                            object7 = Intrinsics.areEqual(object4, object3 = Ye3$a.a);
                            if (object7 == 0 && (object6 = (Object)Intrinsics.areEqual(object4, object3 = Ye3$d.a)) == 0) break block11;
                        }
                        object4 = object.getDescriptor();
                        object5 = ow2_2.b((ml1_2)object5, (SerialDescriptor)object4);
                        break block14;
                    }
                    object = new NoWhenBranchMatchedException();
                    throw object;
                }
                object5 = null;
            }
            if (bl2) {
                object4 = object;
                object4 = (l1_0)object;
                if (object2 != null) {
                    object4 = pr0_0.d((l1_0)object4, this, object2);
                    if (object5 != null) {
                        bl2 = object instanceof fu2_2;
                        if (bl2) {
                            Object object8 = object4.getDescriptor();
                            object3 = "<this>";
                            Intrinsics.checkNotNullParameter(object8, (String)object3);
                            object8 = kt2_2.a((SerialDescriptor)object8);
                            bl2 = object8.contains(object5);
                            if (bl2) {
                                ((fu2_2)object).getClass();
                                throw null;
                            }
                        }
                        object = object4.getDescriptor().getKind();
                        ow2_2.a((xz2_1)object);
                    }
                    Intrinsics.checkNotNull(object4, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.encodePolymorphically>");
                    object = object4;
                } else {
                    object = new StringBuilder("Value for serializer ");
                    object2 = object4.getDescriptor();
                    ((StringBuilder)object).append(object2);
                    ((StringBuilder)object).append(" should always be non-null. Please report issue to the kotlinx.serialization tracker.");
                    object = ((StringBuilder)object).toString();
                    object = object.toString();
                    object2 = new IllegalArgumentException((String)object);
                    throw object2;
                }
            }
            if (object5 != null) {
                object4 = object.getDescriptor().h();
                this.h = object5;
                this.i = object4;
            }
            object.serialize(this, object2);
        }
    }

    public final void C(char c2) {
        String string2 = String.valueOf(c2);
        this.N(string2);
    }

    public final boolean I(SerialDescriptor serialDescriptor, int n3) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "descriptor");
        return this.f.a;
    }

    public final void J(int n3) {
        boolean bl2 = this.g;
        if (bl2) {
            String string2 = String.valueOf(n3);
            this.N(string2);
        } else {
            c30_0 c30_02 = this.a;
            c30_02.f(n3);
        }
    }

    public final void N(String string2) {
        Intrinsics.checkNotNullParameter(string2, "value");
        this.a.j(string2);
    }

    public final void R(SerialDescriptor object, int n3) {
        Intrinsics.checkNotNullParameter(object, "descriptor");
        Object object2 = de3$a_0.$EnumSwitchMapping$0;
        Object object3 = this.c;
        int c2 = object3.ordinal();
        int n4 = object2[c2];
        char c3 = ',';
        int n7 = 1;
        c30_0 c30_02 = this.a;
        if (n4 != n7) {
            char c5 = ':';
            int n8 = 2;
            if (n4 != n8) {
                n8 = 3;
                if (n4 != n8) {
                    n4 = (int)(c30_02.b ? 1 : 0);
                    if (n4 == 0) {
                        c30_02.e(c3);
                    }
                    c30_02.b();
                    Intrinsics.checkNotNullParameter(object, "<this>");
                    object2 = "json";
                    object3 = this.b;
                    Intrinsics.checkNotNullParameter(object3, (String)object2);
                    xm1_2.e((ml1_2)object3, (SerialDescriptor)object);
                    object = object.e(n3);
                    this.N((String)object);
                    c30_02.e(c5);
                    c30_02.k();
                } else {
                    if (n3 == 0) {
                        this.g = n7;
                    }
                    if (n3 == n7) {
                        c30_02.e(c3);
                        c30_02.k();
                        this.g = false;
                    }
                }
            } else {
                boolean bl3 = c30_02.b;
                if (!bl3) {
                    if ((n3 %= n8) == 0) {
                        c30_02.e(c3);
                        c30_02.b();
                    } else {
                        c30_02.e(c5);
                        c30_02.k();
                        n7 = 0;
                    }
                    this.g = n7;
                } else {
                    this.g = n7;
                    c30_02.b();
                }
            }
        } else {
            boolean bl2 = c30_02.b;
            if (!bl2) {
                c30_02.e(c3);
            }
            c30_02.b();
        }
    }

    public final i0_0 a() {
        return this.e;
    }

    public final u30_0 c(SerialDescriptor object) {
        Object object2;
        Intrinsics.checkNotNullParameter(object, "descriptor");
        ml1_2 ml1_22 = this.b;
        pj3_2 pj3_22 = qj3_2.b(ml1_22, (SerialDescriptor)object);
        int n3 = pj3_22.begin;
        c30_0 c30_02 = this.a;
        if (n3 != 0) {
            c30_02.e((char)n3);
            c30_02.a();
        }
        if ((object2 = this.h) != null) {
            String string2 = this.i;
            if (string2 == null) {
                string2 = object.h();
            }
            c30_02.b();
            this.N((String)object2);
            c30_02.e(':');
            c30_02.k();
            this.N(string2);
            object = null;
            this.h = null;
            this.i = null;
        }
        if ((object = this.c) == pj3_22) {
            return this;
        }
        object = this.d;
        if (object == null || (object2 = object[n3 = pj3_22.ordinal()]) == null) {
            object2 = new de3_1(c30_02, ml1_22, pj3_22, (km1_2[])object);
        }
        return object2;
    }

    public final void d(SerialDescriptor object) {
        Object object2 = "descriptor";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = this.c;
        char c2 = ((pj3_2)((Object)object)).end;
        if (c2 != '\u0000') {
            object2 = this.a;
            ((c30_0)object2).l();
            ((c30_0)object2).c();
            char c3 = ((pj3_2)((Object)object)).end;
            ((c30_0)object2).e(c3);
        }
    }

    public final void f(double d2) {
        Object object;
        boolean bl2 = this.g;
        c30_0 c30_02 = this.a;
        if (bl2) {
            object = String.valueOf(d2);
            this.N((String)object);
        } else {
            object = c30_02.a;
            String string2 = String.valueOf(d2);
            object.c(string2);
        }
        object = this.f;
        bl2 = ((sl1_2)object).k;
        if (!bl2 && ((bl2 = Double.isInfinite(d2)) || (bl2 = Double.isNaN(d2)))) {
            Double d5 = d2;
            throw HT2.a(c30_02.a.toString(), d5);
        }
    }

    public final void g(byte by2) {
        boolean bl2 = this.g;
        if (bl2) {
            String string2 = String.valueOf(by2);
            this.N(string2);
        } else {
            c30_0 c30_02 = this.a;
            c30_02.d(by2);
        }
    }

    public final void m(SerialDescriptor object, int n3) {
        Intrinsics.checkNotNullParameter(object, "enumDescriptor");
        object = object.e(n3);
        this.N((String)object);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Encoder o(SerialDescriptor object) {
        String string2 = "descriptor";
        Intrinsics.checkNotNullParameter(object, string2);
        boolean bl2 = ee3_1.a((SerialDescriptor)object);
        pj3_2 pj3_22 = this.c;
        ml1_2 ml1_22 = this.b;
        c30_0 c30_02 = this.a;
        if (bl2) {
            boolean bl3 = c30_02 instanceof f30_0;
            if (bl3) return new de3_1(c30_02, ml1_22, pj3_22, null);
            object = c30_02.a;
            boolean bl4 = this.g;
            object = (lm1_2)object;
            c30_02 = new f30_0((lm1_2)object, bl4);
            return new de3_1(c30_02, ml1_22, pj3_22, null);
        }
        Object object2 = "<this>";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        bl2 = object.isInline();
        if (bl2 && (bl2 = Intrinsics.areEqual(object, object2 = bm1_1.a))) {
            boolean bl5 = c30_02 instanceof e30_0;
            if (bl5) return new de3_1(c30_02, ml1_22, pj3_22, null);
            object = c30_02.a;
            boolean bl6 = this.g;
            object = (lm1_2)object;
            c30_02 = new e30_0((lm1_2)object, bl6);
            return new de3_1(c30_02, ml1_22, pj3_22, null);
        }
        object2 = this.h;
        if (object2 != null) {
            this.i = object = object.h();
            return this;
        }
        Intrinsics.checkNotNullParameter(object, string2);
        return this;
    }

    public final void q(long l2) {
        boolean bl2 = this.g;
        if (bl2) {
            String string2 = String.valueOf(l2);
            this.N(string2);
        } else {
            c30_0 c30_02 = this.a;
            c30_02.g(l2);
        }
    }

    public final void r(SerialDescriptor serialDescriptor, int n3, b03_0 b03_02, Object object) {
        block3: {
            block2: {
                Intrinsics.checkNotNullParameter(serialDescriptor, "descriptor");
                Object object2 = "serializer";
                Intrinsics.checkNotNullParameter(b03_02, (String)object2);
                if (object != null) break block2;
                object2 = this.f;
                boolean bl2 = ((sl1_2)object2).f;
                if (!bl2) break block3;
            }
            super.r(serialDescriptor, n3, b03_02, object);
        }
    }

    public final void u() {
        this.a.h("null");
    }

    public final void w(short s7) {
        boolean bl2 = this.g;
        if (bl2) {
            String string2 = String.valueOf(s7);
            this.N(string2);
        } else {
            c30_0 c30_02 = this.a;
            c30_02.i(s7);
        }
    }

    public final void x(boolean bl2) {
        boolean bl3 = this.g;
        if (bl3) {
            String string2 = String.valueOf(bl2);
            this.N(string2);
        } else {
            wj1_2 wj1_22 = this.a.a;
            String string3 = String.valueOf(bl2);
            wj1_22.c(string3);
        }
    }

    public final void z(float f5) {
        Object object;
        boolean bl2 = this.g;
        c30_0 c30_02 = this.a;
        if (bl2) {
            object = String.valueOf(f5);
            this.N((String)object);
        } else {
            object = c30_02.a;
            String string2 = String.valueOf(f5);
            object.c(string2);
        }
        object = this.f;
        bl2 = ((sl1_2)object).k;
        if (!bl2 && ((bl2 = Float.isInfinite(f5)) || (bl2 = Float.isNaN(f5)))) {
            Float f6 = Float.valueOf(f5);
            throw HT2.a(c30_02.a.toString(), f6);
        }
    }
}

