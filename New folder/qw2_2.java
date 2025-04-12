/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/*
 * Renamed from qw2
 */
public final class qw2_2
extends l1_0 {
    public final yn1_2 a;
    public List b;
    public final rq1_2 c;

    public qw2_2() {
        throw null;
    }

    public qw2_2(yn1_2 object) {
        Intrinsics.checkNotNullParameter(object, "baseClass");
        this.a = object;
        this.b = object = mz0_2.a;
        object = et1_2.PUBLICATION;
        ae1_0 ae1_02 = new ae1_0(this, 1);
        object = yr1_2.a((et1_2)((Object)object), ae1_02);
        this.c = object;
    }

    public final yn1_2 c() {
        return this.a;
    }

    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor)this.c.getValue();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("kotlinx.serialization.PolymorphicSerializer(baseClass: ");
        yn1_2 yn1_22 = this.a;
        stringBuilder.append(yn1_22);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

