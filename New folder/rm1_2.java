/*
 * Decompiled with CFR 0.152.
 */
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/*
 * Renamed from Rm1
 */
public final class rm1_2
extends nm1_2 {
    public String h;
    public boolean i;

    public rm1_2() {
        throw null;
    }

    public final JsonElement U() {
        LinkedHashMap linkedHashMap = this.g;
        JsonObject jsonObject = new JsonObject(linkedHashMap);
        return jsonObject;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void V(String object, JsonElement jsonElement) {
        String string2 = "key";
        Intrinsics.checkNotNullParameter(object, string2);
        object = "element";
        Intrinsics.checkNotNullParameter(jsonElement, (String)object);
        boolean bl2 = this.i;
        if (bl2) {
            bl2 = jsonElement instanceof JsonPrimitive;
            if (bl2) {
                jsonElement = (JsonPrimitive)jsonElement;
                this.h = object = ((JsonPrimitive)jsonElement).a();
                bl2 = false;
                object = null;
                this.i = false;
                return;
            }
            bl2 = jsonElement instanceof JsonObject;
            if (bl2) throw HT2.b(bm1_2.b);
            bl2 = jsonElement instanceof JsonArray;
            if (bl2) {
                throw HT2.b(nl1_2.b);
            }
            object = new NoWhenBranchMatchedException();
            throw object;
        }
        object = this.g;
        string2 = this.h;
        if (string2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tag");
            string2 = null;
        }
        object.put(string2, jsonElement);
        this.i = bl2 = true;
    }
}

