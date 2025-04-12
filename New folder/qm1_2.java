/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/*
 * Renamed from Qm1
 */
public final class qm1_2
extends mm1_1 {
    public final JsonObject j;
    public final List k;
    public final int l;
    public int m;

    public qm1_2(ml1_2 object, JsonObject jsonObject) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "json");
        Intrinsics.checkNotNullParameter(jsonObject, "value");
        super((ml1_2)object, jsonObject, null, 12);
        this.j = jsonObject;
        this.k = object = CollectionsKt.k0(jsonObject.a.keySet());
        this.l = n3 = object.size() * 2;
        this.m = -1;
    }

    public final String Q(SerialDescriptor serialDescriptor, int n3) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "descriptor");
        return (String)this.k.get(n3 /= 2);
    }

    public final JsonElement V(String object) {
        Object object2 = "tag";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        int n3 = this.m % 2;
        if (n3 == 0) {
            object = bm1_1.b((String)object);
        } else {
            object2 = this.j;
            object = (JsonElement)fh1_2.g(object, (Map)object2);
        }
        return object;
    }

    public final JsonElement X() {
        return this.j;
    }

    public final JsonObject a0() {
        return this.j;
    }

    public final void d(SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "descriptor");
    }

    public final int m(SerialDescriptor serialDescriptor) {
        String string2 = "descriptor";
        Intrinsics.checkNotNullParameter(serialDescriptor, string2);
        int n3 = this.m;
        int n4 = this.l + -1;
        if (n3 < n4) {
            this.m = ++n3;
            return n3;
        }
        return -1;
    }
}

