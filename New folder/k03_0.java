/*
 * Decompiled with CFR 0.152.
 */
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from K03
 */
public final class k03_0
extends g1_0
implements Serializable {
    public static final k03_0 b;
    public final ng1_2 a;

    static {
        k03_0 k03_02;
        ng1_2.n.getClass();
        ng1_2 ng1_22 = ng1_2.o;
        b = k03_02 = new k03_0(ng1_22);
    }

    public k03_0() {
        ng1_2 ng1_22 = new ng1_2();
        this(ng1_22);
    }

    public k03_0(ng1_2 ng1_22) {
        Intrinsics.checkNotNullParameter(ng1_22, "backing");
        this.a = ng1_22;
    }

    private final Object writeReplace() {
        Serializable serializable = this.a;
        boolean bl2 = serializable.m;
        if (bl2) {
            serializable = new c03_0(1, this);
            return serializable;
        }
        serializable = new NotSerializableException("The set cannot be serialized while it is being built.");
        throw serializable;
    }

    public final int a() {
        return this.a.i;
    }

    public final boolean add(Object object) {
        ng1_2 ng1_22 = this.a;
        int n3 = ng1_22.a(object);
        if (n3 >= 0) {
            n3 = 1;
        } else {
            n3 = 0;
            object = null;
        }
        return n3 != 0;
    }

    public final boolean addAll(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        this.a.e();
        return super.addAll(collection);
    }

    public final void clear() {
        this.a.clear();
    }

    public final boolean contains(Object object) {
        return this.a.containsKey(object);
    }

    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    public final Iterator iterator() {
        ng1_2 ng1_22 = this.a;
        ng1_22.getClass();
        Intrinsics.checkNotNullParameter(ng1_22, "map");
        NG1$e nG1$e = new NG1$d(ng1_22);
        return nG1$e;
    }

    /*
     * WARNING - void declaration
     */
    public final boolean remove(Object object) {
        void var3_7;
        int n3;
        ng1_2 ng1_22 = this.a;
        ng1_22.e();
        int bl2 = ng1_22.i(object);
        if (bl2 < 0) {
            n3 = -1;
        } else {
            ng1_22.n(bl2);
        }
        if (n3 >= 0) {
            boolean bl3 = true;
        } else {
            boolean bl4 = false;
            object = null;
        }
        return (boolean)var3_7;
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

