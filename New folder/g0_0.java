/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/*
 * Renamed from G0
 */
public abstract class g0_0
implements KSerializer {
    public abstract Object a();

    public abstract int b(Object var1);

    public abstract Iterator c(Object var1);

    public abstract int d(Object var1);

    public Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return this.e(decoder);
    }

    public final Object e(Decoder object) {
        boolean bl2;
        boolean bl3;
        Intrinsics.checkNotNullParameter(object, "decoder");
        Object object2 = this.a();
        int n3 = this.b(object2);
        SerialDescriptor serialDescriptor = this.getDescriptor();
        object = object.c(serialDescriptor);
        while ((bl3 = object.m(serialDescriptor = this.getDescriptor())) != (bl2 = -1 != 0)) {
            bl2 = true;
            this.f((s30_0)object, (int)((bl3 += n3) ? 1 : 0), object2, bl2);
        }
        SerialDescriptor serialDescriptor2 = this.getDescriptor();
        object.d(serialDescriptor2);
        return this.h(object2);
    }

    public abstract void f(s30_0 var1, int var2, Object var3, boolean var4);

    public abstract Object g(Object var1);

    public abstract Object h(Object var1);
}

