/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/*
 * Renamed from l1
 */
public abstract class l1_0
implements KSerializer {
    public qp0_2 a(s30_0 s30_02, String string2) {
        Intrinsics.checkNotNullParameter(s30_02, "decoder");
        s30_02 = s30_02.a();
        yn1_2 yn1_22 = this.c();
        return ((i0_0)s30_02).N(yn1_22, string2);
    }

    public b03_0 b(Encoder object, Object object2) {
        Intrinsics.checkNotNullParameter(object, "encoder");
        Intrinsics.checkNotNullParameter(object2, "value");
        object = object.a();
        yn1_2 yn1_22 = this.c();
        return ((i0_0)object).O(yn1_22, object2);
    }

    public abstract yn1_2 c();

    public final Object deserialize(Decoder object) {
        int n3;
        Object object2;
        int n4;
        Intrinsics.checkNotNullParameter(object, "decoder");
        Object object3 = this.getDescriptor();
        object = object.c((SerialDescriptor)object3);
        Object object4 = new Ref$ObjectRef();
        String string2 = null;
        int n7 = 0;
        Object object5 = null;
        while ((n4 = object.m((SerialDescriptor)(object2 = this.getDescriptor()))) != (n3 = -1)) {
            SerialDescriptor serialDescriptor;
            if (n4 != 0) {
                n7 = 1;
                if (n4 != n7) {
                    string2 = "Invalid index in polymorphic deserialization of ";
                    object3 = new StringBuilder(string2);
                    object4 = (String)((Ref$ObjectRef)object4).element;
                    if (object4 == null) {
                        object4 = "unknown class";
                    }
                    ((StringBuilder)object3).append((String)object4);
                    ((StringBuilder)object3).append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                    ((StringBuilder)object3).append(n4);
                    object3 = ((StringBuilder)object3).toString();
                    object = new IllegalArgumentException((String)object3);
                    throw object;
                }
                object5 = ((Ref$ObjectRef)object4).element;
                if (object5 != null) {
                    ((Ref$ObjectRef)object4).element = object5;
                    object5 = (String)object5;
                    object5 = pr0_0.c(this, (s30_0)object, (String)object5);
                    serialDescriptor = this.getDescriptor();
                    object5 = object.v(serialDescriptor, n4, (qp0_2)object5, null);
                    continue;
                }
                object3 = "Cannot read polymorphic value before its type token".toString();
                object = new IllegalArgumentException((String)object3);
                throw object;
            }
            serialDescriptor = this.getDescriptor();
            ((Ref$ObjectRef)object4).element = object2 = object.l(serialDescriptor, n4);
        }
        if (object5 != null) {
            Intrinsics.checkNotNull(object5, "null cannot be cast to non-null type T of kotlinx.serialization.internal.AbstractPolymorphicSerializer");
            object.d((SerialDescriptor)object3);
            return object5;
        }
        object = new StringBuilder("Polymorphic value has not been read for class ");
        object3 = (String)((Ref$ObjectRef)object4).element;
        ((StringBuilder)object).append((String)object3);
        object = ((StringBuilder)object).toString();
        object = object.toString();
        object3 = new IllegalArgumentException((String)object);
        throw object3;
    }

    public final void serialize(Encoder object, Object object2) {
        Intrinsics.checkNotNullParameter(object, "encoder");
        Intrinsics.checkNotNullParameter(object2, "value");
        b03_0 b03_02 = pr0_0.d(this, (Encoder)object, object2);
        SerialDescriptor serialDescriptor = this.getDescriptor();
        object = object.c(serialDescriptor);
        SerialDescriptor serialDescriptor2 = this.getDescriptor();
        String string2 = b03_02.getDescriptor().h();
        object.s(serialDescriptor2, string2);
        serialDescriptor2 = this.getDescriptor();
        Intrinsics.checkNotNull(b03_02, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        object.H(serialDescriptor2, 1, b03_02, object2);
        object.d(serialDescriptor);
    }
}

