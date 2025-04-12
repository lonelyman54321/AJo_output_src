/*
 * Decompiled with CFR 0.152.
 */
package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.p$c;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

public abstract class c
extends AbstractList
implements p$c {
    public boolean a = true;

    public final void a() {
        boolean bl2 = this.a;
        if (bl2) {
            return;
        }
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public boolean add(Object object) {
        this.a();
        return super.add(object);
    }

    public boolean addAll(int n3, Collection collection) {
        this.a();
        return super.addAll(n3, collection);
    }

    public boolean addAll(Collection collection) {
        this.a();
        return super.addAll(collection);
    }

    public void clear() {
        this.a();
        super.clear();
    }

    public boolean equals(Object object) {
        int n3;
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        int n4 = object instanceof List;
        if (n4 == 0) {
            return false;
        }
        n4 = object instanceof RandomAccess;
        if (n4 == 0) {
            return super.equals(object);
        }
        object = (List)object;
        n4 = this.size();
        if (n4 != (n3 = object.size())) {
            return false;
        }
        for (n3 = 0; n3 < n4; ++n3) {
            Object e2;
            Object e5 = this.get(n3);
            boolean bl3 = e5.equals(e2 = object.get(n3));
            if (bl3) continue;
            return false;
        }
        return bl2;
    }

    public int hashCode() {
        int n3 = this.size();
        int n4 = 1;
        for (int i3 = 0; i3 < n3; ++i3) {
            n4 *= 31;
            Object e2 = this.get(i3);
            int n7 = e2.hashCode();
            n4 += n7;
        }
        return n4;
    }

    public final boolean isModifiable() {
        return this.a;
    }

    public final void makeImmutable() {
        this.a = false;
    }

    public boolean remove(Object object) {
        this.a();
        return super.remove(object);
    }

    public final boolean removeAll(Collection collection) {
        this.a();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection collection) {
        this.a();
        return super.retainAll(collection);
    }
}

