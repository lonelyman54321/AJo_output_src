/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/*
 * Renamed from s62
 */
public final class s62_0
implements KSerializer {
    public final Object a;
    public final mz0_2 b;
    public final rq1_2 c;

    public s62_0(Object object) {
        Intrinsics.checkNotNullParameter("kotlin.Unit", "serialName");
        Intrinsics.checkNotNullParameter(object, "objectInstance");
        this.a = object;
        this.b = object = mz0_2.a;
        object = et1_2.PUBLICATION;
        r62_0 r62_02 = new r62_0(this);
        object = yr1_2.a((et1_2)((Object)object), r62_02);
        this.c = object;
    }

    public final Object deserialize(Decoder object) {
        Intrinsics.checkNotNullParameter(object, "decoder");
        Object object2 = this.getDescriptor();
        object = object.c((SerialDescriptor)object2);
        Object object3 = this.getDescriptor();
        int n3 = object.m((SerialDescriptor)object3);
        int n4 = -1;
        if (n3 == n4) {
            object3 = Unit.a;
            object.d((SerialDescriptor)object2);
            return this.a;
        }
        object2 = hj0_0.a(n3, "Unexpected index ");
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor)this.c.getValue();
    }

    public final void serialize(Encoder object, Object object2) {
        Intrinsics.checkNotNullParameter(object, "encoder");
        Intrinsics.checkNotNullParameter(object2, "value");
        object2 = this.getDescriptor();
        object = object.c((SerialDescriptor)object2);
        object2 = this.getDescriptor();
        object.d((SerialDescriptor)object2);
    }
}

