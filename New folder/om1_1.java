/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;

/*
 * Renamed from Om1
 */
public final class om1_1
extends s0_0 {
    public final JsonArray f;
    public final int g;
    public int h;

    public om1_1(ml1_2 ml1_22, JsonArray jsonArray) {
        int n3;
        Intrinsics.checkNotNullParameter(ml1_22, "json");
        Intrinsics.checkNotNullParameter(jsonArray, "value");
        super(ml1_22, jsonArray, null);
        this.f = jsonArray;
        this.g = n3 = jsonArray.a.size();
        this.h = -1;
    }

    public final String Q(SerialDescriptor serialDescriptor, int n3) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "descriptor");
        return String.valueOf(n3);
    }

    public final JsonElement V(String string2) {
        Intrinsics.checkNotNullParameter(string2, "tag");
        int n3 = Integer.parseInt(string2);
        return (JsonElement)this.f.a.get(n3);
    }

    public final JsonElement X() {
        return this.f;
    }

    public final int m(SerialDescriptor serialDescriptor) {
        String string2 = "descriptor";
        Intrinsics.checkNotNullParameter(serialDescriptor, string2);
        int n3 = this.h;
        int n4 = this.g + -1;
        if (n3 < n4) {
            this.h = ++n3;
            return n3;
        }
        return -1;
    }
}

