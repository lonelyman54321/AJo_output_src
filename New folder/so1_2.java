/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/*
 * Renamed from so1
 */
public abstract class so1_2
implements KSerializer {
    public final KSerializer a;
    public final KSerializer b;

    public so1_2(KSerializer kSerializer, KSerializer kSerializer2) {
        this.a = kSerializer;
        this.b = kSerializer2;
    }

    public abstract Object a(Object var1);

    public abstract Object b(Object var1);

    public abstract Object c(Object var1, Object var2);

    public final Object deserialize(Decoder object) {
        int n3;
        SerialDescriptor serialDescriptor;
        int n4;
        Object object2;
        Intrinsics.checkNotNullParameter(object, "decoder");
        Object object3 = this.getDescriptor();
        object = object.c((SerialDescriptor)object3);
        Object object4 = object2 = ps3_0.a;
        Object object5 = object2;
        while ((n4 = object.m(serialDescriptor = this.getDescriptor())) != (n3 = -1)) {
            KSerializer kSerializer;
            n3 = 0;
            if (n4 != 0) {
                int n7 = 1;
                if (n4 == n7) {
                    serialDescriptor = this.getDescriptor();
                    kSerializer = this.b;
                    object5 = object.v(serialDescriptor, n7, kSerializer, null);
                    continue;
                }
                object3 = hj0_0.a(n4, "Invalid index: ");
                object = new IllegalArgumentException((String)object3);
                throw object;
            }
            object4 = this.getDescriptor();
            n4 = 0;
            serialDescriptor = null;
            kSerializer = this.a;
            object4 = object.v((SerialDescriptor)object4, 0, kSerializer, null);
        }
        if (object4 != object2) {
            if (object5 != object2) {
                object2 = this.c(object4, object5);
                object.d((SerialDescriptor)object3);
                return object2;
            }
            object = new IllegalArgumentException("Element 'value' is missing");
            throw object;
        }
        object = new IllegalArgumentException("Element 'key' is missing");
        throw object;
    }

    public final void serialize(Encoder object, Object object2) {
        Intrinsics.checkNotNullParameter(object, "encoder");
        SerialDescriptor serialDescriptor = this.getDescriptor();
        object = object.c(serialDescriptor);
        serialDescriptor = this.getDescriptor();
        Object object3 = this.a(object2);
        KSerializer kSerializer = this.a;
        object.H(serialDescriptor, 0, kSerializer, object3);
        serialDescriptor = this.getDescriptor();
        object2 = this.b(object2);
        KSerializer kSerializer2 = this.b;
        object.H(serialDescriptor, 1, kSerializer2, object2);
        object2 = this.getDescriptor();
        object.d((SerialDescriptor)object2);
    }
}

