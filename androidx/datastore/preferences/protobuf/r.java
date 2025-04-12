/*
 * Decompiled with CFR 0.152.
 */
package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.K;
import androidx.datastore.preferences.protobuf.K$b;
import androidx.datastore.preferences.protobuf.c;
import androidx.datastore.preferences.protobuf.p;
import androidx.datastore.preferences.protobuf.p$c;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class r
extends c
implements Dt1,
RandomAccess {
    public final ArrayList b;

    static {
        r r5 = new r(10);
        r5.a = false;
    }

    public r(int n3) {
        ArrayList arrayList = new ArrayList(n3);
        this(arrayList);
    }

    public r(ArrayList arrayList) {
        this.b = arrayList;
    }

    public final void add(int n3, Object object) {
        object = (String)object;
        this.a();
        this.b.add(n3, object);
        this.modCount = n3 = this.modCount + 1;
    }

    public final boolean addAll(int n3, Collection collection) {
        int n4;
        this.a();
        boolean bl2 = collection instanceof Dt1;
        if (bl2) {
            collection = ((Dt1)collection).getUnderlyingElements();
        }
        n3 = (int)(this.b.addAll(n3, collection) ? 1 : 0);
        this.modCount = n4 = this.modCount + 1;
        return n3 != 0;
    }

    public final boolean addAll(Collection collection) {
        int n3 = this.b.size();
        return this.addAll(n3, collection);
    }

    public final void clear() {
        int n3;
        this.a();
        this.b.clear();
        this.modCount = n3 = this.modCount + 1;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final Object get(int n3) {
        Object object;
        void var3_9;
        ArrayList arrayList = this.b;
        Object e2 = arrayList.get(n3);
        int n4 = e2 instanceof String;
        if (n4 != 0) {
            String string2 = (String)e2;
            return var3_9;
        }
        n4 = e2 instanceof DF;
        if (n4 != 0) {
            DF dF = (DF)e2;
            dF.getClass();
            object = p.a;
            n4 = dF.size();
            object = n4 == 0 ? "" : dF.g();
            boolean bl2 = dF.e();
            if (bl2) {
                arrayList.set(n3, object);
            }
        } else {
            byte[] byArray = (byte[])e2;
            Object object2 = p.a;
            object = new String(byArray, (Charset)object2);
            object2 = K.a;
            K$b k$b = K.a;
            int n7 = byArray.length;
            int n8 = k$b.c(byArray, 0, n7);
            if (n8 == 0) {
                arrayList.set(n3, object);
            }
        }
        Object object3 = object;
        return var3_9;
    }

    public final Object getRaw(int n3) {
        return this.b.get(n3);
    }

    public final List getUnderlyingElements() {
        return Collections.unmodifiableList(this.b);
    }

    public final Dt1 getUnmodifiableView() {
        boolean bl2 = this.a;
        if (bl2) {
            fw3 fw32 = new fw3(this);
            return fw32;
        }
        return this;
    }

    public final p$c mutableCopyWithCapacity(int n3) {
        ArrayList arrayList = this.b;
        int n4 = arrayList.size();
        if (n3 >= n4) {
            ArrayList arrayList2 = new ArrayList(n3);
            arrayList2.addAll(arrayList);
            r r5 = new r(arrayList2);
            return r5;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        throw illegalArgumentException;
    }

    public final void n(DF dF) {
        int n3;
        this.a();
        this.b.add(dF);
        this.modCount = n3 = this.modCount + 1;
    }

    public final Object remove(int n3) {
        int n4;
        this.a();
        Object object = this.b;
        Object object2 = object.remove(n3);
        this.modCount = n4 = this.modCount + 1;
        n4 = object2 instanceof String;
        if (n4 != 0) {
            object2 = (String)object2;
        } else {
            n4 = object2 instanceof DF;
            if (n4 != 0) {
                object2 = (DF)object2;
                object2.getClass();
                object = p.a;
                n4 = ((DF)object2).size();
                object2 = n4 == 0 ? "" : ((DF)object2).g();
            } else {
                object2 = (byte[])object2;
                Charset charset = p.a;
                object2 = object = new String((byte[])object2, charset);
            }
        }
        return object2;
    }

    public final Object set(int n3, Object object) {
        object = (String)object;
        this.a();
        Object object2 = this.b;
        Object object3 = object2.set(n3, object);
        int n4 = object3 instanceof String;
        if (n4 != 0) {
            object3 = (String)object3;
        } else {
            n4 = object3 instanceof DF;
            if (n4 != 0) {
                object3 = (DF)object3;
                object3.getClass();
                object = p.a;
                n4 = ((DF)object3).size();
                object3 = n4 == 0 ? "" : ((DF)object3).g();
            } else {
                object3 = (byte[])object3;
                object2 = p.a;
                object3 = object = new String((byte[])object3, (Charset)object2);
            }
        }
        return object3;
    }

    public final int size() {
        return this.b.size();
    }
}

