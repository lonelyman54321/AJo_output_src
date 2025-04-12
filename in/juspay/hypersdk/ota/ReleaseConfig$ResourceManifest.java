/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package in.juspay.hypersdk.ota;

import in.juspay.hypersdk.ota.ReleaseConfig$Resource;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.json.JSONObject;

public final class ReleaseConfig$ResourceManifest
implements List,
KMappedMarker {
    private final List entries;

    public ReleaseConfig$ResourceManifest(List list) {
        Intrinsics.checkNotNullParameter(list, "entries");
        this.entries = list;
    }

    private final List component1() {
        return this.entries;
    }

    public static /* synthetic */ ReleaseConfig$ResourceManifest copy$default(ReleaseConfig$ResourceManifest releaseConfig$ResourceManifest, List list, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            list = releaseConfig$ResourceManifest.entries;
        }
        return releaseConfig$ResourceManifest.copy(list);
    }

    public void add(int n3, ReleaseConfig$Resource releaseConfig$Resource) {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw unsupportedOperationException;
    }

    public boolean add(ReleaseConfig$Resource object) {
        object = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw object;
    }

    public boolean addAll(int n3, Collection collection) {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw unsupportedOperationException;
    }

    public boolean addAll(Collection object) {
        object = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw object;
    }

    public void clear() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw unsupportedOperationException;
    }

    public boolean contains(ReleaseConfig$Resource releaseConfig$Resource) {
        Intrinsics.checkNotNullParameter(releaseConfig$Resource, "element");
        return this.entries.contains(releaseConfig$Resource);
    }

    public boolean containsAll(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        return this.entries.containsAll(collection);
    }

    public final ReleaseConfig$ResourceManifest copy(List list) {
        Intrinsics.checkNotNullParameter(list, "entries");
        ReleaseConfig$ResourceManifest releaseConfig$ResourceManifest = new ReleaseConfig$ResourceManifest(list);
        return releaseConfig$ResourceManifest;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ReleaseConfig$ResourceManifest;
        if (!bl3) {
            return false;
        }
        object = (ReleaseConfig$ResourceManifest)object;
        List list = this.entries;
        object = ((ReleaseConfig$ResourceManifest)object).entries;
        boolean bl4 = Intrinsics.areEqual(list, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public ReleaseConfig$Resource get(int n3) {
        return (ReleaseConfig$Resource)this.entries.get(n3);
    }

    public final ReleaseConfig$Resource getResource(String string2) {
        Object t3;
        block1: {
            boolean bl2;
            Intrinsics.checkNotNullParameter(string2, "name");
            Iterator iterator = this.entries.iterator();
            while (bl2 = iterator.hasNext()) {
                Object object = t3 = iterator.next();
                object = ((ReleaseConfig$Resource)t3).getName();
                boolean bl3 = Intrinsics.areEqual(object, string2);
                if (!bl3) continue;
                break block1;
            }
            bl2 = false;
            t3 = null;
        }
        return (ReleaseConfig$Resource)t3;
    }

    public int getSize() {
        return this.entries.size();
    }

    public int hashCode() {
        return ((Object)this.entries).hashCode();
    }

    public int indexOf(ReleaseConfig$Resource releaseConfig$Resource) {
        Intrinsics.checkNotNullParameter(releaseConfig$Resource, "element");
        return this.entries.indexOf(releaseConfig$Resource);
    }

    public boolean isEmpty() {
        return this.entries.isEmpty();
    }

    public Iterator iterator() {
        return this.entries.iterator();
    }

    public int lastIndexOf(ReleaseConfig$Resource releaseConfig$Resource) {
        Intrinsics.checkNotNullParameter(releaseConfig$Resource, "element");
        return this.entries.lastIndexOf(releaseConfig$Resource);
    }

    public ListIterator listIterator() {
        return this.entries.listIterator();
    }

    public ListIterator listIterator(int n3) {
        return this.entries.listIterator(n3);
    }

    public ReleaseConfig$Resource remove(int n3) {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw unsupportedOperationException;
    }

    public boolean remove(Object object) {
        object = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw object;
    }

    public boolean removeAll(Collection object) {
        object = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw object;
    }

    public void replaceAll(UnaryOperator object) {
        object = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw object;
    }

    public boolean retainAll(Collection object) {
        object = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw object;
    }

    public ReleaseConfig$Resource set(int n3, ReleaseConfig$Resource releaseConfig$Resource) {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw unsupportedOperationException;
    }

    public void sort(Comparator object) {
        object = new UnsupportedOperationException("Operation is not supported for read-only collection");
        throw object;
    }

    public List subList(int n3, int n4) {
        return this.entries.subList(n3, n4);
    }

    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    public Object[] toArray(Object[] objectArray) {
        Intrinsics.checkNotNullParameter(objectArray, "array");
        return CollectionToArray.toArray(this, objectArray);
    }

    public final JSONObject toJSON() {
        boolean bl2;
        JSONObject jSONObject = new JSONObject();
        Iterator iterator = this.entries.iterator();
        while (bl2 = iterator.hasNext()) {
            ReleaseConfig$Resource releaseConfig$Resource = (ReleaseConfig$Resource)iterator.next();
            String string2 = releaseConfig$Resource.getName();
            releaseConfig$Resource = releaseConfig$Resource.toJSON();
            jSONObject.put(string2, (Object)releaseConfig$Resource);
        }
        return jSONObject;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("ResourceManifest(entries=");
        List list = this.entries;
        stringBuilder.append(list);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

