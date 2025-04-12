/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from QG1
 */
public final class qg1_2
extends d1_0 {
    public final ng1_2 a;

    public qg1_2(ng1_2 ng1_22) {
        Intrinsics.checkNotNullParameter(ng1_22, "backing");
        this.a = ng1_22;
    }

    public final int a() {
        return this.a.i;
    }

    public final boolean add(Object object) {
        object = new UnsupportedOperationException();
        throw object;
    }

    public final boolean addAll(Collection object) {
        Intrinsics.checkNotNullParameter(object, "elements");
        object = new UnsupportedOperationException();
        throw object;
    }

    public final void clear() {
        this.a.clear();
    }

    public final boolean contains(Object object) {
        return this.a.containsValue(object);
    }

    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    public final Iterator iterator() {
        ng1_2 ng1_22 = this.a;
        ng1_22.getClass();
        Intrinsics.checkNotNullParameter(ng1_22, "map");
        NG1$f nG1$f = new NG1$d(ng1_22);
        return nG1$f;
    }

    /*
     * WARNING - void declaration
     */
    public final boolean remove(Object object) {
        void var3_6;
        ng1_2 ng1_22 = this.a;
        ng1_22.e();
        int bl2 = ng1_22.j(object);
        if (bl2 < 0) {
            boolean bl3 = false;
            object = null;
        } else {
            ng1_22.n(bl2);
            boolean bl4 = true;
        }
        return (boolean)var3_6;
    }

    public final boolean removeAll(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        this.a.e();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        this.a.e();
        return super.retainAll(collection);
    }
}

