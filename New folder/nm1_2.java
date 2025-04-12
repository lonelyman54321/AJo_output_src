/*
 * Decompiled with CFR 0.152.
 */
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/*
 * Renamed from Nm1
 */
public class nm1_2
extends w0_0 {
    public final LinkedHashMap g;

    public nm1_2(ml1_2 linkedHashMap, Function1 function1) {
        Intrinsics.checkNotNullParameter(linkedHashMap, "json");
        Intrinsics.checkNotNullParameter(function1, "nodeConsumer");
        super((ml1_2)((Object)linkedHashMap), function1);
        this.g = linkedHashMap = new LinkedHashMap();
    }

    public JsonElement U() {
        LinkedHashMap linkedHashMap = this.g;
        JsonObject jsonObject = new JsonObject(linkedHashMap);
        return jsonObject;
    }

    public void V(String string2, JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(string2, "key");
        Intrinsics.checkNotNullParameter(jsonElement, "element");
        this.g.put(string2, jsonElement);
    }

    public final void r(SerialDescriptor serialDescriptor, int n3, b03_0 b03_02, Object object) {
        block3: {
            block2: {
                Intrinsics.checkNotNullParameter(serialDescriptor, "descriptor");
                Object object2 = "serializer";
                Intrinsics.checkNotNullParameter(b03_02, (String)object2);
                if (object != null) break block2;
                object2 = this.d;
                boolean bl2 = ((sl1_2)object2).f;
                if (!bl2) break block3;
            }
            super.r(serialDescriptor, n3, b03_02, object);
        }
    }
}

