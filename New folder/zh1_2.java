/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/*
 * Renamed from zh1
 */
public final class zh1_2
implements dz0_2 {
    public final /* synthetic */ KSerializer a;

    public zh1_2(KSerializer kSerializer) {
        this.a = kSerializer;
    }

    public final KSerializer[] childSerializers() {
        KSerializer kSerializer = this.a;
        KSerializer[] kSerializerArray = new KSerializer[]{kSerializer};
        return kSerializerArray;
    }

    public final Object deserialize(Decoder object) {
        Intrinsics.checkNotNullParameter(object, "decoder");
        String string2 = "unsupported".toString();
        object = new IllegalStateException(string2);
        throw object;
    }

    public final SerialDescriptor getDescriptor() {
        String string2 = "unsupported".toString();
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public final void serialize(Encoder object, Object object2) {
        Intrinsics.checkNotNullParameter(object, "encoder");
        object2 = "unsupported".toString();
        object = new IllegalStateException((String)object2);
        throw object;
    }

    public final /* synthetic */ KSerializer[] typeParametersSerializers() {
        return o72_0.b;
    }
}

