/*
 * Decompiled with CFR 0.152.
 */
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.json.internal.JsonEncodingException;

/*
 * Renamed from W0
 */
public abstract class w0_0
extends js1_1
implements km1_2 {
    public final ml1_2 b;
    public final Function1 c;
    public final sl1_2 d;
    public String e;
    public String f;

    public w0_0(ml1_2 object, Function1 function1) {
        this.b = object;
        this.c = function1;
        this.d = object = ((ml1_2)object).a;
    }

    public final Encoder A(Object object, SerialDescriptor object2) {
        object = (String)object;
        Intrinsics.checkNotNullParameter(object, "tag");
        Object object3 = "inlineDescriptor";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        boolean bl2 = ee3_1.a((SerialDescriptor)object2);
        if (bl2) {
            object2 = new v0_0(this, (String)object);
        } else {
            Object object4 = "<this>";
            Intrinsics.checkNotNullParameter(object2, (String)object4);
            bl2 = object2.isInline();
            if (bl2 && (bl2 = Intrinsics.areEqual(object2, object4 = bm1_1.a))) {
                object2 = object3 = new u0_0(this, (String)object, (SerialDescriptor)object2);
            } else {
                Intrinsics.checkNotNullParameter(object2, (String)object3);
                this.a.add(object);
                object2 = this;
            }
        }
        return object2;
    }

    public final void B(b03_0 object, Object object2) {
        block9: {
            Object object3;
            boolean bl2;
            Object object4;
            Object object5;
            Object object6;
            block15: {
                Object object7;
                block12: {
                    block14: {
                        block13: {
                            block11: {
                                block10: {
                                    block8: {
                                        Intrinsics.checkNotNullParameter(object, "serializer");
                                        object6 = CollectionsKt.T(this.a);
                                        object5 = this.b;
                                        if (object6 != null) break block8;
                                        object6 = object.getDescriptor();
                                        object4 = ((ml1_2)object5).b;
                                        bl2 = (object4 = (object6 = qj3_2.a((SerialDescriptor)object6, (i0_0)object4)).getKind()) instanceof wz2_2;
                                        if (!bl2 && (object6 = object6.getKind()) != (object4 = XZ2$b.a)) break block8;
                                        object4 = this.c;
                                        object6 = new em1_2((ml1_2)object5, (Function1)object4);
                                        ((w0_0)object6).B((b03_0)object, object2);
                                        break block9;
                                    }
                                    object6 = ((ml1_2)object5).a;
                                    bl2 = ((sl1_2)object6).i;
                                    if (!bl2) break block10;
                                    object.serialize(this, object2);
                                    break block9;
                                }
                                bl2 = object instanceof l1_0;
                                if (!bl2) break block11;
                                object6 = ((sl1_2)object6).p;
                                object3 = su_1.NONE;
                                if (object6 == object3) break block12;
                                break block13;
                            }
                            object6 = ((sl1_2)object6).p;
                            object3 = ow2$a.$EnumSwitchMapping$0;
                            object7 = ((Enum)object6).ordinal();
                            Object object8 = 1;
                            if ((object7 = (Object)((Object)object3[object7])) == object8 || object7 == (object8 = 2)) break block12;
                            object8 = 3;
                            if (object7 != object8) break block14;
                            object6 = object.getDescriptor().getKind();
                            object8 = Intrinsics.areEqual(object6, object3 = Ye3$a.a);
                            if (object8 == 0 && (object7 = (Object)Intrinsics.areEqual(object6, object3 = Ye3$d.a)) == 0) break block12;
                        }
                        object6 = object.getDescriptor();
                        object6 = ow2_2.b((ml1_2)object5, (SerialDescriptor)object6);
                        break block15;
                    }
                    object = new NoWhenBranchMatchedException();
                    throw object;
                }
                object7 = 0;
                object6 = null;
            }
            if (bl2) {
                object5 = object;
                object5 = (l1_0)object;
                if (object2 != null) {
                    object5 = pr0_0.d((l1_0)object5, this, object2);
                    if (object6 != null) {
                        bl2 = object instanceof fu2_2;
                        if (bl2) {
                            object4 = object5.getDescriptor();
                            object3 = "<this>";
                            Intrinsics.checkNotNullParameter(object4, (String)object3);
                            object4 = kt2_2.a((SerialDescriptor)object4);
                            bl2 = object4.contains(object6);
                            if (bl2) {
                                ((fu2_2)object).getClass();
                                throw null;
                            }
                        }
                        object = object5.getDescriptor().getKind();
                        ow2_2.a((xz2_1)object);
                    }
                    Intrinsics.checkNotNull(object5, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.encodePolymorphically>");
                    object = object5;
                } else {
                    object = new StringBuilder("Value for serializer ");
                    object2 = object5.getDescriptor();
                    ((StringBuilder)object).append(object2);
                    ((StringBuilder)object).append(" should always be non-null. Please report issue to the kotlinx.serialization tracker.");
                    object = ((StringBuilder)object).toString();
                    object = object.toString();
                    object2 = new IllegalArgumentException((String)object);
                    throw object2;
                }
            }
            if (object6 != null) {
                object5 = object.getDescriptor().h();
                this.e = object6;
                this.f = object5;
            }
            object.serialize(this, object2);
        }
    }

    public final void D() {
    }

    public final void G(int n3, Object object) {
        object = (String)object;
        Intrinsics.checkNotNullParameter(object, "tag");
        JsonPrimitive jsonPrimitive = bm1_1.a(n3);
        this.V((String)object, jsonPrimitive);
    }

    public final boolean I(SerialDescriptor serialDescriptor, int n3) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "descriptor");
        return this.d.a;
    }

    public final void O(long l2, Object object) {
        object = (String)object;
        Intrinsics.checkNotNullParameter(object, "tag");
        JsonPrimitive jsonPrimitive = bm1_1.a(l2);
        this.V((String)object, jsonPrimitive);
    }

    public final void P(Object object, short s7) {
        object = (String)object;
        Intrinsics.checkNotNullParameter(object, "tag");
        JsonPrimitive jsonPrimitive = bm1_1.a(s7);
        this.V((String)object, jsonPrimitive);
    }

    public final void Q(Object object, String object2) {
        object = (String)object;
        Intrinsics.checkNotNullParameter(object, "tag");
        Intrinsics.checkNotNullParameter(object2, "value");
        object2 = bm1_1.b((String)object2);
        this.V((String)object, (JsonElement)object2);
    }

    public final void R(SerialDescriptor object) {
        Intrinsics.checkNotNullParameter(object, "descriptor");
        object = this.U();
        this.c.invoke(object);
    }

    public abstract JsonElement U();

    public abstract void V(String var1, JsonElement var2);

    public final i0_0 a() {
        return this.b.b;
    }

    public String b(SerialDescriptor serialDescriptor, int n3) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        ml1_2 ml1_22 = this.b;
        Intrinsics.checkNotNullParameter(ml1_22, "json");
        xm1_2.e(ml1_22, serialDescriptor);
        return serialDescriptor.e(n3);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final u30_0 c(SerialDescriptor object) {
        Intrinsics.checkNotNullParameter(object, "descriptor");
        Object object2 = CollectionsKt.T(this.a);
        object2 = object2 == null ? this.c : new t0_0(this);
        Object object3 = object.getKind();
        Object object4 = Ye3$b.a;
        boolean bl2 = Intrinsics.areEqual(object3, object4);
        Object object5 = this.b;
        if (!bl2 && !(bl2 = object3 instanceof nw2_2)) {
            object4 = Ye3$c.a;
            boolean bl3 = Intrinsics.areEqual(object3, object4);
            if (bl3) {
                XZ2$b xZ2$b;
                bl3 = false;
                object3 = object.g(0);
                object4 = ((ml1_2)object5).b;
                boolean bl4 = (object4 = (object3 = qj3_2.a((SerialDescriptor)object3, (i0_0)object4)).getKind()) instanceof wz2_2;
                if (!bl4 && !(bl2 = Intrinsics.areEqual(object4, xZ2$b = XZ2$b.a))) {
                    object4 = ((ml1_2)object5).a;
                    bl2 = ((sl1_2)object4).d;
                    if (!bl2) throw HT2.b((SerialDescriptor)object3);
                    object3 = new pm1_2((ml1_2)object5, (Function1)object2);
                } else {
                    boolean bl5;
                    Intrinsics.checkNotNullParameter(object5, "json");
                    object4 = "nodeConsumer";
                    Intrinsics.checkNotNullParameter(object2, (String)object4);
                    object3 = new nm1_2((ml1_2)object5, (Function1)object2);
                    ((rm1_2)object3).i = bl5 = true;
                }
            } else {
                object3 = new nm1_2((ml1_2)object5, (Function1)object2);
            }
        } else {
            object3 = new pm1_2((ml1_2)object5, (Function1)object2);
        }
        object2 = this.e;
        if (object2 == null) return (u30_0)object3;
        bl2 = object3 instanceof rm1_2;
        if (bl2) {
            object4 = object3;
            object4 = (rm1_2)object3;
            object5 = "key";
            object2 = bm1_1.b((String)object2);
            ((rm1_2)object4).V((String)object5, (JsonElement)object2);
            object2 = this.f;
            if (object2 == null) {
                object2 = object.h();
            }
            object = bm1_1.b((String)object2);
            object2 = "value";
            ((rm1_2)object4).V((String)object2, (JsonElement)object);
        } else {
            object4 = this.f;
            if (object4 == null) {
                object4 = object.h();
            }
            object = bm1_1.b((String)object4);
            ((w0_0)object3).V((String)object2, (JsonElement)object);
        }
        object = null;
        this.e = null;
        this.f = null;
        return (u30_0)object3;
    }

    public final void h(Object object, boolean bl2) {
        object = (String)object;
        Intrinsics.checkNotNullParameter(object, "tag");
        Boolean bl3 = bl2;
        Object object2 = bm1_1.a;
        object2 = new tm1_1(bl3, false, null);
        this.V((String)object, (JsonElement)object2);
    }

    public final void j(Object object, byte by2) {
        object = (String)object;
        Intrinsics.checkNotNullParameter(object, "tag");
        JsonPrimitive jsonPrimitive = bm1_1.a(by2);
        this.V((String)object, jsonPrimitive);
    }

    public final void k(Object object, char c2) {
        object = (String)object;
        Intrinsics.checkNotNullParameter(object, "tag");
        JsonPrimitive jsonPrimitive = bm1_1.b(String.valueOf(c2));
        this.V((String)object, jsonPrimitive);
    }

    public final void l(Object object, double d2) {
        object = (String)object;
        Intrinsics.checkNotNullParameter(object, "tag");
        Object object2 = bm1_1.a(d2);
        this.V((String)object, (JsonElement)object2);
        object2 = this.d;
        boolean bl2 = ((sl1_2)object2).k;
        if (!bl2 && ((bl2 = Double.isInfinite(d2)) || (bl2 = Double.isNaN(d2)))) {
            Double d5 = d2;
            String string2 = this.U().toString();
            Intrinsics.checkNotNullParameter(d5, "value");
            Intrinsics.checkNotNullParameter(object, "key");
            Intrinsics.checkNotNullParameter(string2, "output");
            object = HT2.h(d5, (String)object, string2);
            object2 = new JsonEncodingException((String)object);
            throw object2;
        }
    }

    public final void n(Object object, SerialDescriptor object2, int n3) {
        object = (String)object;
        Intrinsics.checkNotNullParameter(object, "tag");
        Intrinsics.checkNotNullParameter(object2, "enumDescriptor");
        object2 = bm1_1.b(object2.e(n3));
        this.V((String)object, (JsonElement)object2);
    }

    public final Encoder o(SerialDescriptor object) {
        Intrinsics.checkNotNullParameter(object, "descriptor");
        Object object2 = CollectionsKt.T(this.a);
        if (object2 != null) {
            object2 = this.e;
            if (object2 != null) {
                this.f = object2 = object.h();
            }
            object = super.o((SerialDescriptor)object);
        } else {
            ml1_2 ml1_22 = this.b;
            Function1 function1 = this.c;
            object2 = new em1_2(ml1_22, function1);
            object = ((w0_0)object2).o((SerialDescriptor)object);
        }
        return object;
    }

    public final void p(Object object, float f5) {
        object = (String)object;
        Intrinsics.checkNotNullParameter(object, "tag");
        Object object2 = bm1_1.a(Float.valueOf(f5));
        this.V((String)object, (JsonElement)object2);
        object2 = this.d;
        boolean bl2 = ((sl1_2)object2).k;
        if (!bl2 && ((bl2 = Float.isInfinite(f5)) || (bl2 = Float.isNaN(f5)))) {
            Float f6 = Float.valueOf(f5);
            object2 = this.U().toString();
            Intrinsics.checkNotNullParameter(f6, "value");
            Intrinsics.checkNotNullParameter(object, "key");
            Intrinsics.checkNotNullParameter(object2, "output");
            object = HT2.h(f6, (String)object, (String)object2);
            JsonEncodingException jsonEncodingException = new JsonEncodingException((String)object);
            throw jsonEncodingException;
        }
    }

    public final void u() {
        Object object = (String)CollectionsKt.T(this.a);
        if (object == null) {
            object = this.c;
            JsonNull jsonNull = JsonNull.INSTANCE;
            object.invoke(jsonNull);
            return;
        }
        Intrinsics.checkNotNullParameter(object, "tag");
        JsonNull jsonNull = JsonNull.INSTANCE;
        this.V((String)object, jsonNull);
    }
}

