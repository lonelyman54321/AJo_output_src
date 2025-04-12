/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.json;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject$Companion;

public final class JsonObject
extends JsonElement
implements Map,
KMappedMarker {
    public static final JsonObject$Companion Companion;
    public final Map a;

    static {
        JsonObject$Companion jsonObject$Companion;
        Companion = jsonObject$Companion = new JsonObject$Companion();
    }

    public JsonObject(Map map2) {
        Intrinsics.checkNotNullParameter(map2, "content");
        this.a = map2;
    }

    public final void clear() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw unsupportedOperationException;
    }

    public final boolean containsKey(Object object) {
        boolean bl2 = object instanceof String;
        if (!bl2) {
            return false;
        }
        object = (String)object;
        Intrinsics.checkNotNullParameter(object, "key");
        return this.a.containsKey(object);
    }

    public final boolean containsValue(Object object) {
        boolean bl2 = object instanceof JsonElement;
        if (!bl2) {
            return false;
        }
        object = (JsonElement)object;
        Intrinsics.checkNotNullParameter(object, "value");
        return this.a.containsValue(object);
    }

    public final Set entrySet() {
        return this.a.entrySet();
    }

    public final boolean equals(Object object) {
        return Intrinsics.areEqual(this.a, object);
    }

    public final Object get(Object object) {
        boolean bl2 = object instanceof String;
        if (!bl2) {
            return null;
        }
        object = (String)object;
        Intrinsics.checkNotNullParameter(object, "key");
        return (JsonElement)this.a.get(object);
    }

    public final int hashCode() {
        return ((Object)this.a).hashCode();
    }

    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    public final Set keySet() {
        return this.a.keySet();
    }

    public final void putAll(Map object) {
        object = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw object;
    }

    public final Object remove(Object object) {
        object = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw object;
    }

    public final boolean remove(Object object, Object object2) {
        object = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw object;
    }

    public final void replaceAll(BiFunction object) {
        object = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw object;
    }

    public final int size() {
        return this.a.size();
    }

    public final String toString() {
        Set set;
        Iterable iterable = set = this.a.entrySet();
        iterable = set;
        am1_1 am1_12 = new Object();
        return CollectionsKt.R(iterable, ",", "{", "}", am1_12, 24);
    }

    public final Collection values() {
        return this.a.values();
    }
}

