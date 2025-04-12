/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableList;

/*
 * Renamed from P83
 */
public final class p83_0
implements pb3_0,
List,
RandomAccess,
KMutableList {
    public P83$a a;

    public p83_0() {
        s73_0 s73_02 = s73_0.c;
        P83$a p83$a = new P83$a(s73_02);
        Object object = A83.b.a();
        if (object != null) {
            int n3;
            object = new P83$a(s73_02);
            ((Rb3)object).a = n3 = 1;
            p83$a.b = object;
        }
        this.a = p83$a;
    }

    public final P83$a a() {
        P83$a p83$a = this.a;
        Intrinsics.checkNotNull(p83$a, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return (P83$a)A83.u(p83$a, this);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void add(int n3, Object object) {
        Throwable throwable2;
        block14: {
            boolean bl2;
            int n4 = 1;
            do {
                v83_0 v83_02;
                block13: {
                    Object object2;
                    block12: {
                        Object object3 = Q83.a;
                        // MONITORENTER : object3
                        object2 = this.a;
                        String string2 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>";
                        Intrinsics.checkNotNull(object2, string2);
                        object2 = A83.i((Rb3)object2);
                        int n7 = ((P83$a)object2).d;
                        object2 = ((P83$a)object2).c;
                        Object object4 = Unit.a;
                        // MONITOREXIT : object3
                        Intrinsics.checkNotNull(object2);
                        object4 = object2.add(n3, object);
                        bl2 = Intrinsics.areEqual(object4, object2);
                        if (bl2) {
                            return;
                        }
                        object2 = this.a;
                        Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                        Object object5 = A83.c;
                        // MONITORENTER : object5
                        v83_02 = A83.k();
                        object2 = A83.x((Rb3)object2, this, v83_02);
                        object2 = (P83$a)object2;
                        // MONITORENTER : object3
                        try {
                            int n8 = ((P83$a)object2).d;
                            if (n8 != n7) break block12;
                            ((P83$a)object2).c = object4;
                            ((P83$a)object2).e = n7 = ((P83$a)object2).e + n4;
                            ((P83$a)object2).d = n8 += n4;
                            bl2 = true;
                            break block13;
                        }
                        catch (Throwable throwable2) {
                            break block14;
                        }
                    }
                    bl2 = false;
                    object2 = null;
                }
                // MONITOREXIT : object3
                // MONITOREXIT : object5
                A83.o(v83_02, this);
            } while (!bl2);
            return;
        }
        // MONITOREXIT : object3
        throw throwable2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final boolean add(Object object) {
        Throwable throwable2;
        block13: {
            boolean bl2;
            int n3 = 1;
            do {
                v83_0 v83_02;
                block12: {
                    Object object2 = Q83.a;
                    // MONITORENTER : object2
                    Object object3 = this.a;
                    String string2 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>";
                    Intrinsics.checkNotNull(object3, string2);
                    object3 = A83.i((Rb3)object3);
                    int n4 = ((P83$a)object3).d;
                    object3 = ((P83$a)object3).c;
                    Object object4 = Unit.a;
                    // MONITOREXIT : object2
                    Intrinsics.checkNotNull(object3);
                    object4 = object3.add(object);
                    boolean bl3 = Intrinsics.areEqual(object4, object3);
                    bl2 = false;
                    if (bl3) {
                        return 0 != 0;
                    }
                    object3 = this.a;
                    Intrinsics.checkNotNull(object3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    Object object5 = A83.c;
                    // MONITORENTER : object5
                    v83_02 = A83.k();
                    object3 = A83.x((Rb3)object3, this, v83_02);
                    object3 = (P83$a)object3;
                    // MONITORENTER : object2
                    try {
                        int n7 = ((P83$a)object3).d;
                        if (n7 != n4) break block12;
                        ((P83$a)object3).c = object4;
                        ((P83$a)object3).e = n4 = ((P83$a)object3).e + n3;
                        ((P83$a)object3).d = n7 += n3;
                        bl2 = true;
                    }
                    catch (Throwable throwable2) {
                        break block13;
                    }
                }
                // MONITOREXIT : object2
                // MONITOREXIT : object5
                A83.o(v83_02, this);
            } while (!bl2);
            return n3 != 0;
        }
        // MONITOREXIT : object2
        throw throwable2;
    }

    public final boolean addAll(int n3, Collection collection) {
        P83$b p83$b = new P83$b(n3, collection);
        return this.d(p83$b);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final boolean addAll(Collection collection) {
        Throwable throwable2;
        block13: {
            boolean bl2;
            int n3 = 1;
            do {
                v83_0 v83_02;
                block12: {
                    Object object = Q83.a;
                    // MONITORENTER : object
                    Object object2 = this.a;
                    String string2 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>";
                    Intrinsics.checkNotNull(object2, string2);
                    object2 = A83.i((Rb3)object2);
                    int n4 = ((P83$a)object2).d;
                    object2 = ((P83$a)object2).c;
                    Object object3 = Unit.a;
                    // MONITOREXIT : object
                    Intrinsics.checkNotNull(object2);
                    object3 = object2.addAll(collection);
                    boolean bl3 = Intrinsics.areEqual(object3, object2);
                    bl2 = false;
                    if (bl3) {
                        return 0 != 0;
                    }
                    object2 = this.a;
                    Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    Object object4 = A83.c;
                    // MONITORENTER : object4
                    v83_02 = A83.k();
                    object2 = A83.x((Rb3)object2, this, v83_02);
                    object2 = (P83$a)object2;
                    // MONITORENTER : object
                    try {
                        int n7 = ((P83$a)object2).d;
                        if (n7 != n4) break block12;
                        ((P83$a)object2).c = object3;
                        ((P83$a)object2).e = n4 = ((P83$a)object2).e + n3;
                        ((P83$a)object2).d = n7 += n3;
                        bl2 = true;
                    }
                    catch (Throwable throwable2) {
                        break block13;
                    }
                }
                // MONITOREXIT : object
                // MONITOREXIT : object4
                A83.o(v83_02, this);
            } while (!bl2);
            return n3 != 0;
        }
        // MONITOREXIT : object
        throw throwable2;
    }

    public final int c() {
        P83$a p83$a = this.a;
        Intrinsics.checkNotNull(p83$a, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((P83$a)A83.i((Rb3)p83$a)).e;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void clear() {
        v83_0 v83_02;
        Rb3 rb3 = this.a;
        Intrinsics.checkNotNull(rb3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        Object object = A83.c;
        synchronized (object) {
            v83_02 = A83.k();
            rb3 = A83.x(rb3, this, v83_02);
            Object object2 = Q83.a;
            synchronized (object2) {
                int n3;
                s73_0 s73_02 = s73_0.c;
                rb3.c = s73_02;
                rb3.d = n3 = rb3.d + 1;
                rb3.e = n3 = rb3.e + 1;
            }
        }
        A83.o(v83_02, this);
    }

    public final boolean contains(Object object) {
        return this.a().c.contains(object);
    }

    public final boolean containsAll(Collection collection) {
        return this.a().c.containsAll(collection);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final boolean d(Function1 function1) {
        Throwable throwable2;
        block13: {
            Object object;
            boolean bl2;
            int n3 = 1;
            do {
                v83_0 v83_02;
                block12: {
                    Object object2;
                    block11: {
                        Object object3 = Q83.a;
                        // MONITORENTER : object3
                        object2 = this.a;
                        String string2 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>";
                        Intrinsics.checkNotNull(object2, string2);
                        object2 = A83.i((Rb3)object2);
                        int n4 = ((P83$a)object2).d;
                        object2 = ((P83$a)object2).c;
                        Object object4 = Unit.a;
                        // MONITOREXIT : object3
                        Intrinsics.checkNotNull(object2);
                        object4 = object2.b();
                        object = function1.invoke(object4);
                        object4 = ((nr2)object4).d();
                        bl2 = Intrinsics.areEqual(object4, object2);
                        if (bl2) return (Boolean)object;
                        object2 = this.a;
                        Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                        Object object5 = A83.c;
                        // MONITORENTER : object5
                        v83_02 = A83.k();
                        object2 = A83.x((Rb3)object2, this, v83_02);
                        object2 = (P83$a)object2;
                        // MONITORENTER : object3
                        try {
                            int n7 = ((P83$a)object2).d;
                            if (n7 != n4) break block11;
                            ((P83$a)object2).c = object4;
                            ((P83$a)object2).d = n7 += n3;
                            ((P83$a)object2).e = n4 = ((P83$a)object2).e + n3;
                            bl2 = true;
                            break block12;
                        }
                        catch (Throwable throwable2) {
                            break block13;
                        }
                    }
                    bl2 = false;
                    object2 = null;
                }
                // MONITOREXIT : object3
                // MONITOREXIT : object5
                A83.o(v83_02, this);
            } while (!bl2);
            return (Boolean)object;
        }
        // MONITOREXIT : object3
        throw throwable2;
    }

    public final void g(Rb3 rb3) {
        P83$a p83$a = this.a;
        rb3.b = p83$a;
        Intrinsics.checkNotNull(rb3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        rb3 = (P83$a)rb3;
        this.a = rb3;
    }

    public final Object get(int n3) {
        return this.a().c.get(n3);
    }

    public final Rb3 h() {
        return this.a;
    }

    public final /* synthetic */ Rb3 i(Rb3 rb3, Rb3 rb32, Rb3 rb33) {
        return null;
    }

    public final int indexOf(Object object) {
        return this.a().c.indexOf(object);
    }

    public final boolean isEmpty() {
        return this.a().c.isEmpty();
    }

    public final Iterator iterator() {
        return this.listIterator();
    }

    public final int lastIndexOf(Object object) {
        return this.a().c.lastIndexOf(object);
    }

    public final ListIterator listIterator() {
        ob3_2 ob3_22 = new ob3_2(this, 0);
        return ob3_22;
    }

    public final ListIterator listIterator(int n3) {
        ob3_2 ob3_22 = new ob3_2(this, n3);
        return ob3_22;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final Object remove(int n3) {
        Throwable throwable2;
        block14: {
            boolean bl2;
            int n4 = 1;
            Object object = this.get(n3);
            do {
                v83_0 v83_02;
                block13: {
                    Object object2;
                    block12: {
                        Object object3 = Q83.a;
                        // MONITORENTER : object3
                        object2 = this.a;
                        String string2 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>";
                        Intrinsics.checkNotNull(object2, string2);
                        object2 = A83.i((Rb3)object2);
                        int n7 = ((P83$a)object2).d;
                        object2 = ((P83$a)object2).c;
                        Object object4 = Unit.a;
                        // MONITOREXIT : object3
                        Intrinsics.checkNotNull(object2);
                        object4 = object2.k(n3);
                        bl2 = Intrinsics.areEqual(object4, object2);
                        if (bl2) {
                            return object;
                        }
                        object2 = this.a;
                        Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                        Object object5 = A83.c;
                        // MONITORENTER : object5
                        v83_02 = A83.k();
                        object2 = A83.x((Rb3)object2, this, v83_02);
                        object2 = (P83$a)object2;
                        // MONITORENTER : object3
                        try {
                            int n8 = ((P83$a)object2).d;
                            if (n8 != n7) break block12;
                            ((P83$a)object2).c = object4;
                            ((P83$a)object2).e = n7 = ((P83$a)object2).e + n4;
                            ((P83$a)object2).d = n8 += n4;
                            bl2 = true;
                            break block13;
                        }
                        catch (Throwable throwable2) {
                            break block14;
                        }
                    }
                    bl2 = false;
                    object2 = null;
                }
                // MONITOREXIT : object3
                // MONITOREXIT : object5
                A83.o(v83_02, this);
            } while (!bl2);
            return object;
        }
        // MONITOREXIT : object3
        throw throwable2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final boolean remove(Object object) {
        Throwable throwable2;
        block13: {
            boolean bl2;
            int n3 = 1;
            do {
                v83_0 v83_02;
                block12: {
                    Object object2 = Q83.a;
                    // MONITORENTER : object2
                    Object object3 = this.a;
                    String string2 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>";
                    Intrinsics.checkNotNull(object3, string2);
                    object3 = A83.i((Rb3)object3);
                    int n4 = ((P83$a)object3).d;
                    object3 = ((P83$a)object3).c;
                    Object object4 = Unit.a;
                    // MONITOREXIT : object2
                    Intrinsics.checkNotNull(object3);
                    object4 = object3.remove(object);
                    boolean bl3 = Intrinsics.areEqual(object4, object3);
                    bl2 = false;
                    if (bl3) {
                        return 0 != 0;
                    }
                    object3 = this.a;
                    Intrinsics.checkNotNull(object3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    Object object5 = A83.c;
                    // MONITORENTER : object5
                    v83_02 = A83.k();
                    object3 = A83.x((Rb3)object3, this, v83_02);
                    object3 = (P83$a)object3;
                    // MONITORENTER : object2
                    try {
                        int n7 = ((P83$a)object3).d;
                        if (n7 != n4) break block12;
                        ((P83$a)object3).c = object4;
                        ((P83$a)object3).e = n4 = ((P83$a)object3).e + n3;
                        ((P83$a)object3).d = n7 += n3;
                        bl2 = true;
                    }
                    catch (Throwable throwable2) {
                        break block13;
                    }
                }
                // MONITOREXIT : object2
                // MONITOREXIT : object5
                A83.o(v83_02, this);
            } while (!bl2);
            return n3 != 0;
        }
        // MONITOREXIT : object2
        throw throwable2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final boolean removeAll(Collection collection) {
        Throwable throwable2;
        block13: {
            boolean bl2;
            int n3 = 1;
            do {
                v83_0 v83_02;
                block12: {
                    Object object = Q83.a;
                    // MONITORENTER : object
                    Object object2 = this.a;
                    String string2 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>";
                    Intrinsics.checkNotNull(object2, string2);
                    object2 = A83.i((Rb3)object2);
                    int n4 = ((P83$a)object2).d;
                    object2 = ((P83$a)object2).c;
                    Object object3 = Unit.a;
                    // MONITOREXIT : object
                    Intrinsics.checkNotNull(object2);
                    object3 = object2.removeAll(collection);
                    boolean bl3 = Intrinsics.areEqual(object3, object2);
                    bl2 = false;
                    if (bl3) {
                        return 0 != 0;
                    }
                    object2 = this.a;
                    Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    Object object4 = A83.c;
                    // MONITORENTER : object4
                    v83_02 = A83.k();
                    object2 = A83.x((Rb3)object2, this, v83_02);
                    object2 = (P83$a)object2;
                    // MONITORENTER : object
                    try {
                        int n7 = ((P83$a)object2).d;
                        if (n7 != n4) break block12;
                        ((P83$a)object2).c = object3;
                        ((P83$a)object2).e = n4 = ((P83$a)object2).e + n3;
                        ((P83$a)object2).d = n7 += n3;
                        bl2 = true;
                    }
                    catch (Throwable throwable2) {
                        break block13;
                    }
                }
                // MONITOREXIT : object
                // MONITOREXIT : object4
                A83.o(v83_02, this);
            } while (!bl2);
            return n3 != 0;
        }
        // MONITOREXIT : object
        throw throwable2;
    }

    public final boolean retainAll(Collection collection) {
        P83$c p83$c = new P83$c(collection);
        return this.d(p83$c);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final Object set(int n3, Object object) {
        Throwable throwable2;
        block14: {
            boolean bl2;
            int n4 = 1;
            Object object2 = this.get(n3);
            do {
                v83_0 v83_02;
                block13: {
                    Object object3;
                    block12: {
                        Object object4 = Q83.a;
                        // MONITORENTER : object4
                        object3 = this.a;
                        String string2 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>";
                        Intrinsics.checkNotNull(object3, string2);
                        object3 = A83.i((Rb3)object3);
                        int n7 = ((P83$a)object3).d;
                        object3 = ((P83$a)object3).c;
                        Object object5 = Unit.a;
                        // MONITOREXIT : object4
                        Intrinsics.checkNotNull(object3);
                        object5 = object3.set(n3, object);
                        bl2 = Intrinsics.areEqual(object5, object3);
                        if (bl2) {
                            return object2;
                        }
                        object3 = this.a;
                        Intrinsics.checkNotNull(object3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                        Object object6 = A83.c;
                        // MONITORENTER : object6
                        v83_02 = A83.k();
                        object3 = A83.x((Rb3)object3, this, v83_02);
                        object3 = (P83$a)object3;
                        // MONITORENTER : object4
                        try {
                            int n8 = ((P83$a)object3).d;
                            if (n8 != n7) break block12;
                            ((P83$a)object3).c = object5;
                            ((P83$a)object3).d = n8 += n4;
                            bl2 = true;
                            break block13;
                        }
                        catch (Throwable throwable2) {
                            break block14;
                        }
                    }
                    bl2 = false;
                    object3 = null;
                }
                // MONITOREXIT : object4
                // MONITOREXIT : object6
                A83.o(v83_02, this);
            } while (!bl2);
            return object2;
        }
        // MONITOREXIT : object4
        throw throwable2;
    }

    public final int size() {
        return this.a().c.size();
    }

    public final List subList(int n3, int n4) {
        of3_1 of3_12;
        int n7;
        if (n3 >= 0 && n3 <= n4 && n4 <= (n7 = this.size())) {
            n7 = 1;
        } else {
            n7 = 0;
            of3_12 = null;
        }
        if (n7 != 0) {
            of3_12 = new of3_1(this, n3, n4);
            return of3_12;
        }
        sn2.b("fromIndex or toIndex are out of bounds");
        throw null;
    }

    public final Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    public final Object[] toArray(Object[] objectArray) {
        return CollectionToArray.toArray(this, objectArray);
    }

    public final String toString() {
        Object object = this.a;
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        object = (P83$a)A83.i((Rb3)object);
        StringBuilder stringBuilder = new StringBuilder("SnapshotStateList(value=");
        object = ((P83$a)object).c;
        stringBuilder.append(object);
        stringBuilder.append(")@");
        int n3 = this.hashCode();
        stringBuilder.append(n3);
        return stringBuilder.toString();
    }
}

