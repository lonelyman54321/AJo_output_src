/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/*
 * Renamed from ys3
 */
public final class ys3_0
implements KSerializer {
    public final KSerializer a;
    public final KSerializer b;
    public final KSerializer c;
    public final pz2_1 d;

    public ys3_0(KSerializer object, KSerializer object2, KSerializer kSerializer) {
        Intrinsics.checkNotNullParameter(object, "aSerializer");
        Intrinsics.checkNotNullParameter(object2, "bSerializer");
        Intrinsics.checkNotNullParameter(kSerializer, "cSerializer");
        this.a = object;
        this.b = object2;
        this.c = kSerializer;
        object = new SerialDescriptor[]{};
        object2 = new k9_0(this, 5);
        this.d = object = uz2_1.b("kotlin.Triple", object, (Function1)object2);
    }

    public final Object deserialize(Decoder object) {
        int n3;
        int n4;
        Object object2;
        Intrinsics.checkNotNullParameter(object, "decoder");
        Object object3 = this.d;
        object = object.c((SerialDescriptor)object3);
        Object object4 = object2 = ps3_0.a;
        Object object5 = object2;
        Object object6 = object2;
        while ((n4 = object.m((SerialDescriptor)object3)) != (n3 = -1)) {
            KSerializer kSerializer;
            n3 = 0;
            if (n4 != 0) {
                int n7 = 1;
                if (n4 != n7) {
                    int n8 = 2;
                    if (n4 == n8) {
                        kSerializer = this.c;
                        object6 = object.v((SerialDescriptor)object3, n8, kSerializer, null);
                        continue;
                    }
                    object3 = hj0_0.a(n4, "Unexpected index ");
                    object = new IllegalArgumentException((String)object3);
                    throw object;
                }
                object5 = this.b;
                object5 = object.v((SerialDescriptor)object3, n7, (qp0_2)object5, null);
                continue;
            }
            kSerializer = this.a;
            object4 = object.v((SerialDescriptor)object3, 0, kSerializer, null);
        }
        object.d((SerialDescriptor)object3);
        if (object4 != object2) {
            if (object5 != object2) {
                if (object6 != object2) {
                    object = new xs3_0(object4, object5, object6);
                    return object;
                }
                object = new IllegalArgumentException("Element 'third' is missing");
                throw object;
            }
            object = new IllegalArgumentException("Element 'second' is missing");
            throw object;
        }
        object = new IllegalArgumentException("Element 'first' is missing");
        throw object;
    }

    public final SerialDescriptor getDescriptor() {
        return this.d;
    }

    public final void serialize(Encoder object, Object object2) {
        object2 = (xs3_0)object2;
        Intrinsics.checkNotNullParameter(object, "encoder");
        Intrinsics.checkNotNullParameter(object2, "value");
        pz2_1 pz2_12 = this.d;
        object = object.c(pz2_12);
        Object object3 = ((xs3_0)object2).a;
        KSerializer kSerializer = this.a;
        object.H(pz2_12, 0, kSerializer, object3);
        object3 = ((xs3_0)object2).b;
        kSerializer = this.b;
        object.H(pz2_12, 1, kSerializer, object3);
        object2 = ((xs3_0)object2).c;
        KSerializer kSerializer2 = this.c;
        object.H(pz2_12, 2, kSerializer2, object2);
        object.d(pz2_12);
    }
}

