/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from OG1
 */
public final class og1_2
extends c1_0 {
    public final ng1_2 a;

    public og1_2(ng1_2 ng1_22) {
        Intrinsics.checkNotNullParameter(ng1_22, "backing");
        this.a = ng1_22;
    }

    public final int a() {
        return this.a.i;
    }

    public final boolean add(Object object) {
        Intrinsics.checkNotNullParameter((Map.Entry)object, "element");
        object = new UnsupportedOperationException();
        throw object;
    }

    public final boolean addAll(Collection object) {
        Intrinsics.checkNotNullParameter(object, "elements");
        object = new UnsupportedOperationException();
        throw object;
    }

    public final boolean c(Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "element");
        return this.a.g(entry);
    }

    public final void clear() {
        this.a.clear();
    }

    public final boolean containsAll(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        return this.a.f(collection);
    }

    public final boolean d(Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "element");
        ng1_2 ng1_22 = this.a;
        ng1_22.getClass();
        Intrinsics.checkNotNullParameter(entry, "entry");
        ng1_22.e();
        Object k2 = entry.getKey();
        int n3 = ng1_22.i(k2);
        boolean bl2 = false;
        if (n3 >= 0) {
            Object object = ng1_22.b;
            Intrinsics.checkNotNull(object);
            object = object[n3];
            entry = entry.getValue();
            boolean bl3 = Intrinsics.areEqual(object, entry);
            if (bl3) {
                ng1_22.n(n3);
                bl2 = true;
            }
        }
        return bl2;
    }

    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    public final Iterator iterator() {
        ng1_2 ng1_22 = this.a;
        ng1_22.getClass();
        Intrinsics.checkNotNullParameter(ng1_22, "map");
        ng1$b_0 ng1$b_0 = new NG1$d(ng1_22);
        return ng1$b_0;
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

