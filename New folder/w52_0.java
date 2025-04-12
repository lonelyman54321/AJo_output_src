/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/*
 * Renamed from W52
 */
public final class w52_0
implements KSerializer {
    public final KSerializer a;
    public final mz2_2 b;

    public w52_0(KSerializer object) {
        mz2_2 mz2_22;
        Intrinsics.checkNotNullParameter(object, "serializer");
        this.a = object;
        object = object.getDescriptor();
        this.b = mz2_22 = new mz2_2((SerialDescriptor)object);
    }

    public final Object deserialize(Decoder object) {
        Object object2 = "decoder";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        boolean bl2 = object.A();
        if (bl2) {
            object2 = this.a;
            object = object.e((qp0_2)object2);
        } else {
            object = null;
        }
        return object;
    }

    public final boolean equals(Object object) {
        Object object2;
        Class<w52_0> clazz;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (clazz = w52_0.class) == (object2 = object.getClass())) {
            object = (w52_0)object;
            object2 = this.a;
            object = ((w52_0)object).a;
            boolean bl3 = Intrinsics.areEqual(object2, object);
            if (!bl3) {
                return false;
            }
            return bl2;
        }
        return false;
    }

    public final SerialDescriptor getDescriptor() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void serialize(Encoder encoder, Object object) {
        Object object2 = "encoder";
        Intrinsics.checkNotNullParameter(encoder, (String)object2);
        if (object != null) {
            encoder.D();
            object2 = this.a;
            encoder.B((b03_0)object2, object);
        } else {
            encoder.u();
        }
    }
}

