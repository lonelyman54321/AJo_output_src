/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/*
 * Renamed from uz2
 */
public final class uz2_2
extends ev1_2 {
    public final String c;

    public uz2_2(SerialDescriptor object) {
        Intrinsics.checkNotNullParameter(object, "primitive");
        super((SerialDescriptor)object);
        StringBuilder stringBuilder = new StringBuilder();
        object = object.h();
        stringBuilder.append((String)object);
        stringBuilder.append("Array");
        this.c = object = stringBuilder.toString();
    }

    public final String h() {
        return this.c;
    }
}

