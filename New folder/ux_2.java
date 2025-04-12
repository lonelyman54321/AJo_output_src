/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/*
 * Renamed from uX
 */
public abstract class ux_2
extends g0_0 {
    public final KSerializer a;

    public ux_2(KSerializer kSerializer) {
        this.a = kSerializer;
    }

    public void f(s30_0 object, int n3, Object object2, boolean bl2) {
        Intrinsics.checkNotNullParameter(object, "decoder");
        SerialDescriptor serialDescriptor = this.getDescriptor();
        KSerializer kSerializer = this.a;
        object = object.v(serialDescriptor, n3, kSerializer, null);
        this.i(n3, object2, object);
    }

    public abstract void i(int var1, Object var2, Object var3);

    public void serialize(Encoder object, Object object2) {
        String string2 = "encoder";
        Intrinsics.checkNotNullParameter(object, string2);
        int n3 = this.d(object2);
        SerialDescriptor serialDescriptor = this.getDescriptor();
        object = object.i(serialDescriptor, n3);
        object2 = this.c(object2);
        for (int i3 = 0; i3 < n3; ++i3) {
            SerialDescriptor serialDescriptor2 = this.getDescriptor();
            Object e2 = object2.next();
            KSerializer kSerializer = this.a;
            object.H(serialDescriptor2, i3, kSerializer, e2);
        }
        object.d(serialDescriptor);
    }
}

