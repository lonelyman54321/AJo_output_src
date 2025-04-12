/*
 * Decompiled with CFR 0.152.
 */
package kotlinx.serialization.json;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlinx.serialization.json.JsonArray$Companion;
import kotlinx.serialization.json.JsonElement;

public final class JsonArray
extends JsonElement
implements List,
KMappedMarker {
    public static final JsonArray$Companion Companion;
    public final List a;

    static {
        JsonArray$Companion jsonArray$Companion;
        Companion = jsonArray$Companion = new JsonArray$Companion();
    }

    public JsonArray(List list) {
        Intrinsics.checkNotNullParameter(list, "content");
        this.a = list;
    }

    public final boolean addAll(int n3, Collection collection) {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw unsupportedOperationException;
    }

    public final boolean addAll(Collection object) {
        object = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw object;
    }

    public final void clear() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw unsupportedOperationException;
    }

    public final boolean contains(Object object) {
        boolean bl2 = object instanceof JsonElement;
        if (!bl2) {
            return false;
        }
        object = (JsonElement)object;
        Intrinsics.checkNotNullParameter(object, "element");
        return this.a.contains(object);
    }

    public final boolean containsAll(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        return this.a.containsAll(collection);
    }

    public final boolean equals(Object object) {
        return Intrinsics.areEqual(this.a, object);
    }

    public final Object get(int n3) {
        return (JsonElement)this.a.get(n3);
    }

    public final int hashCode() {
        return ((Object)this.a).hashCode();
    }

    public final int indexOf(Object object) {
        boolean bl2 = object instanceof JsonElement;
        if (!bl2) {
            return -1;
        }
        object = (JsonElement)object;
        Intrinsics.checkNotNullParameter(object, "element");
        return this.a.indexOf(object);
    }

    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    public final Iterator iterator() {
        return this.a.iterator();
    }

    public final int lastIndexOf(Object object) {
        boolean bl2 = object instanceof JsonElement;
        if (!bl2) {
            return -1;
        }
        object = (JsonElement)object;
        Intrinsics.checkNotNullParameter(object, "element");
        return this.a.lastIndexOf(object);
    }

    public final ListIterator listIterator() {
        return this.a.listIterator();
    }

    public final ListIterator listIterator(int n3) {
        return this.a.listIterator(n3);
    }

    public final boolean remove(Object object) {
        object = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw object;
    }

    public final boolean removeAll(Collection object) {
        object = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw object;
    }

    public final void replaceAll(UnaryOperator object) {
        object = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw object;
    }

    public final boolean retainAll(Collection object) {
        object = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw object;
    }

    public final int size() {
        return this.a.size();
    }

    public final void sort(Comparator object) {
        object = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw object;
    }

    public final List subList(int n3, int n4) {
        return this.a.subList(n3, n4);
    }

    public final Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    public final Object[] toArray(Object[] objectArray) {
        Intrinsics.checkNotNullParameter(objectArray, "array");
        return CollectionToArray.toArray(this, objectArray);
    }

    public final String toString() {
        List list = this.a;
        return CollectionsKt.R(list, ",", "[", "]", null, 56);
    }
}

