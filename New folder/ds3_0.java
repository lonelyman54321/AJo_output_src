/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonObject;

/*
 * Renamed from ds3
 */
public final class ds3_0 {
    public static final Object a(ml1_2 ml1_22, String string2, JsonObject jsonObject, qp0_2 qp0_22) {
        Intrinsics.checkNotNullParameter(ml1_22, "<this>");
        Intrinsics.checkNotNullParameter(string2, "discriminator");
        Intrinsics.checkNotNullParameter(jsonObject, "element");
        Intrinsics.checkNotNullParameter(qp0_22, "deserializer");
        SerialDescriptor serialDescriptor = qp0_22.getDescriptor();
        mm1_1 mm1_12 = new mm1_1(ml1_22, jsonObject, string2, serialDescriptor);
        return mm1_12.e(qp0_22);
    }
}

