/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlin.text.g;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/*
 * Renamed from um1
 */
public final class um1_2
implements KSerializer {
    public static final um1_2 a;
    public static final yz2_1 b;

    static {
        um1_2 um1_22;
        a = um1_22 = new Object();
        wz2$i wz2$i = wz2$i.a;
        b = uz2_1.a("kotlinx.serialization.json.JsonLiteral", wz2$i);
    }

    public final Object deserialize(Decoder object) {
        CharSequence charSequence = "decoder";
        Intrinsics.checkNotNullParameter(object, (String)charSequence);
        object = ZS2.c((Decoder)object).b();
        boolean bl2 = object instanceof tm1_1;
        if (bl2) {
            return (tm1_1)object;
        }
        charSequence = new StringBuilder("Unexpected JSON element, expected JsonLiteral, had ");
        yn1_2 yn1_22 = Reflection.getOrCreateKotlinClass(object.getClass());
        ((StringBuilder)charSequence).append(yn1_22);
        charSequence = ((StringBuilder)charSequence).toString();
        throw HT2.d(object.toString(), -1, (String)charSequence);
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    public final void serialize(Encoder encoder, Object object) {
        object = (tm1_1)object;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Object object2 = "value";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        ZS2.b(encoder);
        boolean bl2 = ((tm1_1)object).a;
        String string2 = ((tm1_1)object).c;
        if (bl2) {
            encoder.N(string2);
        } else {
            object = ((tm1_1)object).b;
            if (object != null) {
                encoder = encoder.o((SerialDescriptor)object);
                encoder.N(string2);
            } else {
                object = StringsKt.l0(string2);
                if (object != null) {
                    long l2 = ((Number)object).longValue();
                    encoder.q(l2);
                } else {
                    object = g.e(string2);
                    if (object != null) {
                        xe_1.t(mt3_0.b);
                        object2 = qt3_0.b;
                        encoder = encoder.o((SerialDescriptor)object2);
                        long l3 = ((mt3_0)object).a;
                        encoder.q(l3);
                    } else {
                        object = je3_2.d(string2);
                        if (object != null) {
                            double d2 = ((Number)object).doubleValue();
                            encoder.f(d2);
                        } else {
                            Intrinsics.checkNotNullParameter(string2, "<this>");
                            object = "true";
                            boolean bl3 = Intrinsics.areEqual(string2, object);
                            if (bl3) {
                                object = Boolean.TRUE;
                            } else {
                                object = "false";
                                bl3 = Intrinsics.areEqual(string2, object);
                                if (bl3) {
                                    object = Boolean.FALSE;
                                } else {
                                    bl3 = false;
                                    object = null;
                                }
                            }
                            if (object != null) {
                                bl3 = (Boolean)object;
                                encoder.x(bl3);
                            } else {
                                encoder.N(string2);
                            }
                        }
                    }
                }
            }
        }
    }
}

