/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/*
 * Renamed from vz2
 */
public abstract class vz2_2
extends ux_2 {
    public final uz2_2 b;

    public vz2_2(KSerializer object) {
        uz2_2 uz2_22;
        Intrinsics.checkNotNullParameter(object, "primitiveSerializer");
        super((KSerializer)object);
        object = object.getDescriptor();
        this.b = uz2_22 = new uz2_2((SerialDescriptor)object);
    }

    public final Object a() {
        Object object = this.j();
        return (tz2_1)this.g(object);
    }

    public final int b(Object object) {
        object = (tz2_1)object;
        Intrinsics.checkNotNullParameter(object, "<this>");
        return ((tz2_1)object).d();
    }

    public final Iterator c(Object object) {
        String string2 = "This method lead to boxing and must not be used, use writeContents instead".toString();
        object = new IllegalStateException(string2);
        throw object;
    }

    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return this.e(decoder);
    }

    public final SerialDescriptor getDescriptor() {
        return this.b;
    }

    public final Object h(Object object) {
        object = (tz2_1)object;
        Intrinsics.checkNotNullParameter(object, "<this>");
        return ((tz2_1)object).a();
    }

    public final void i(int n3, Object object, Object object2) {
        Intrinsics.checkNotNullParameter((tz2_1)object, "<this>");
        object = "This method lead to boxing and must not be used, use Builder.append instead".toString();
        IllegalStateException illegalStateException = new IllegalStateException((String)object);
        throw illegalStateException;
    }

    public abstract Object j();

    public abstract void k(u30_0 var1, Object var2, int var3);

    public final void serialize(Encoder object, Object object2) {
        Intrinsics.checkNotNullParameter(object, "encoder");
        int n3 = this.d(object2);
        uz2_2 uz2_22 = this.b;
        object = object.i(uz2_22, n3);
        this.k((u30_0)object, object2, n3);
        object.d(uz2_22);
    }
}

