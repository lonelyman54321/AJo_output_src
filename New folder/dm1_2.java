/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;

/*
 * Renamed from Dm1
 */
public final class dm1_2
extends s0_0 {
    public final JsonElement f;

    public dm1_2(ml1_2 ml1_22, JsonElement jsonElement, String string2) {
        Intrinsics.checkNotNullParameter(ml1_22, "json");
        Intrinsics.checkNotNullParameter(jsonElement, "value");
        super(ml1_22, jsonElement, string2);
        this.f = jsonElement;
        this.a.add("primitive");
    }

    public final JsonElement V(String object) {
        Intrinsics.checkNotNullParameter(object, "tag");
        String string2 = "primitive";
        if (object == string2) {
            return this.f;
        }
        string2 = "This input can only handle primitives with 'primitive' tag".toString();
        object = new IllegalArgumentException(string2);
        throw object;
    }

    public final JsonElement X() {
        return this.f;
    }

    public final int m(SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "descriptor");
        return 0;
    }
}

