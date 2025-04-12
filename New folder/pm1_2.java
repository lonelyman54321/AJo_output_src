/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;

/*
 * Renamed from Pm1
 */
public final class pm1_2
extends w0_0 {
    public final ArrayList g;

    public pm1_2(ml1_2 arrayList, Function1 function1) {
        Intrinsics.checkNotNullParameter(arrayList, "json");
        Intrinsics.checkNotNullParameter(function1, "nodeConsumer");
        super((ml1_2)((Object)arrayList), function1);
        this.g = arrayList = new ArrayList();
    }

    public final JsonElement U() {
        ArrayList arrayList = this.g;
        JsonArray jsonArray = new JsonArray(arrayList);
        return jsonArray;
    }

    public final void V(String string2, JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(string2, "key");
        Intrinsics.checkNotNullParameter(jsonElement, "element");
        int n3 = Integer.parseInt(string2);
        this.g.add(n3, jsonElement);
    }

    public final String b(SerialDescriptor serialDescriptor, int n3) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "descriptor");
        return String.valueOf(n3);
    }
}

