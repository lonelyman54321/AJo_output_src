/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;

/*
 * Renamed from Em1
 */
public final class em1_2
extends w0_0 {
    public JsonElement g;

    public em1_2(ml1_2 ml1_22, Function1 function1) {
        Intrinsics.checkNotNullParameter(ml1_22, "json");
        Intrinsics.checkNotNullParameter(function1, "nodeConsumer");
        super(ml1_22, function1);
        this.a.add("primitive");
    }

    public final JsonElement U() {
        Object object = this.g;
        if (object != null) {
            return object;
        }
        String string2 = "Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?".toString();
        object = new IllegalArgumentException(string2);
        throw object;
    }

    public final void V(String object, JsonElement object2) {
        Intrinsics.checkNotNullParameter(object, "key");
        Intrinsics.checkNotNullParameter(object2, "element");
        String string2 = "primitive";
        if (object == string2) {
            object = this.g;
            if (object == null) {
                this.g = object2;
                this.c.invoke(object2);
                return;
            }
            object2 = "Primitive element was already recorded. Does call to .encodeXxx happen more than once?".toString();
            object = new IllegalArgumentException((String)object2);
            throw object;
        }
        object2 = "This output can only consume primitives with 'primitive' tag".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }
}

