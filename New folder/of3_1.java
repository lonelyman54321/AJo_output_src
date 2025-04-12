/*
 * Decompiled with CFR 0.152.
 */
import java.util.AbstractList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.markers.KMutableList;
import kotlin.ranges.f;

/*
 * Renamed from of3
 */
public final class of3_1
implements List,
KMutableList {
    public final p83_0 a;
    public final int b;
    public int c;
    public int d;

    public of3_1(p83_0 p83_02, int n3, int n4) {
        int n7;
        this.a = p83_02;
        this.b = n3;
        this.c = n7 = p83_02.c();
        this.d = n4 -= n3;
    }

    public final void a() {
        int n3;
        Object object = this.a;
        int n4 = ((p83_0)object).c();
        if (n4 == (n3 = this.c)) {
            return;
        }
        object = new ConcurrentModificationException();
        throw object;
    }

    public final void add(int n3, Object object) {
        int n4;
        this.a();
        int n7 = this.b + n3;
        p83_0 p83_02 = this.a;
        p83_02.add(n7, object);
        this.d = n4 = this.d + 1;
        this.c = n3 = p83_02.c();
    }

    public final boolean add(Object object) {
        this.a();
        int n3 = this.d;
        int n4 = this.b + n3;
        p83_0 p83_02 = this.a;
        p83_02.add(n4, object);
        int n7 = this.d;
        n4 = 1;
        this.d = n7 += n4;
        this.c = n7 = p83_02.c();
        return n4 != 0;
    }

    public final boolean addAll(int n3, Collection collection) {
        this.a();
        int n4 = this.b;
        n3 += n4;
        p83_0 p83_02 = this.a;
        n3 = (int)(p83_02.addAll(n3, collection) ? 1 : 0);
        if (n3 != 0) {
            int n7;
            int n8 = this.d;
            this.d = n7 = collection.size() + n8;
            this.c = n7 = p83_02.c();
        }
        return n3 != 0;
    }

    public final boolean addAll(Collection collection) {
        int n3 = this.d;
        return this.addAll(n3, collection);
    }

    /*
     * Exception decompiling
     */
    public final void clear() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 15[TRYBLOCK] [17 : 288->297)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public final boolean contains(Object object) {
        int n3 = this.indexOf(object);
        if (n3 >= 0) {
            n3 = 1;
        } else {
            n3 = 0;
            object = null;
        }
        return n3 != 0;
    }

    public final boolean containsAll(Collection object) {
        boolean bl2;
        block4: {
            Iterable iterable;
            boolean bl3;
            block3: {
                object = (Iterable)object;
                bl3 = object instanceof Collection;
                bl2 = true;
                if (!bl3) break block3;
                iterable = object;
                iterable = (Collection)object;
                bl3 = iterable.isEmpty();
                if (bl3) break block4;
            }
            object = object.iterator();
            while (bl3 = object.hasNext()) {
                iterable = object.next();
                bl3 = this.contains(iterable);
                if (bl3) continue;
                bl2 = false;
                break;
            }
        }
        return bl2;
    }

    public final Object get(int n3) {
        this.a();
        int n4 = this.d;
        Q83.a(n3, n4);
        n4 = this.b + n3;
        return this.a.get(n4);
    }

    public final int indexOf(Object object) {
        int n3;
        this.a();
        int n4 = this.d;
        int n7 = this.b;
        mi1_2 mi1_22 = f.m(n7, n4 += n7).iterator();
        while ((n3 = mi1_22.hasNext()) != 0) {
            mi1_2 mi1_23 = mi1_22;
            mi1_23 = mi1_22;
            n3 = mi1_23.nextInt();
            Object object2 = this.a.get(n3);
            boolean bl2 = Intrinsics.areEqual(object, object2);
            if (!bl2) continue;
            return n3 - n7;
        }
        return -1;
    }

    public final boolean isEmpty() {
        int n3 = this.d;
        n3 = n3 == 0 ? 1 : 0;
        return n3 != 0;
    }

    public final Iterator iterator() {
        return this.listIterator(0);
    }

    public final int lastIndexOf(Object object) {
        this.a();
        int n3 = this.d;
        int n4 = this.b;
        for (n3 = n3 + n4 + -1; n3 >= n4; n3 += -1) {
            Object object2 = this.a.get(n3);
            boolean bl2 = Intrinsics.areEqual(object, object2);
            if (!bl2) continue;
            return n3 - n4;
        }
        return -1;
    }

    public final ListIterator listIterator() {
        return this.listIterator(0);
    }

    public final ListIterator listIterator(int n3) {
        this.a();
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = n3 += -1;
        of3$a of3$a = new of3$a(ref$IntRef, this);
        return of3$a;
    }

    public final Object remove(int n3) {
        int n4;
        this.a();
        int n7 = this.b + n3;
        p83_0 p83_02 = this.a;
        Object object = p83_02.remove(n7);
        this.d = n4 = this.d + -1;
        this.c = n3 = p83_02.c();
        return object;
    }

    public final boolean remove(Object object) {
        int n3 = this.indexOf(object);
        if (n3 >= 0) {
            this.remove(n3);
            n3 = 1;
        } else {
            n3 = 0;
            object = null;
        }
        return n3 != 0;
    }

    public final boolean removeAll(Collection object) {
        boolean bl2;
        object = object.iterator();
        block0: while (true) {
            boolean bl3;
            bl2 = false;
            while (bl3 = object.hasNext()) {
                Object e2 = object.next();
                bl3 = this.remove(e2);
                if (!bl3 && !bl2) continue block0;
                bl2 = true;
            }
            break;
        }
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final boolean retainAll(Collection collection) {
        int n3;
        int n4;
        p83_0 p83_02;
        int n7;
        block12: {
            Throwable throwable2;
            block15: {
                boolean bl2;
                n7 = 1;
                this.a();
                p83_02 = this.a;
                int n8 = this.b;
                int n10 = this.d + n8;
                n4 = p83_02.size();
                do {
                    v83_0 v83_02;
                    block14: {
                        Object object;
                        block13: {
                            Object object2 = Q83.a;
                            // MONITORENTER : object2
                            object = p83_02.a;
                            String string2 = "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>";
                            Intrinsics.checkNotNull(object, string2);
                            object = A83.i((Rb3)object);
                            int n14 = ((P83$a)object).d;
                            object = ((P83$a)object).c;
                            Object object3 = Unit.a;
                            // MONITOREXIT : object2
                            Intrinsics.checkNotNull(object);
                            object3 = object.b();
                            ((AbstractList)object3).subList(n8, n10).retainAll(collection);
                            object3 = ((nr2)object3).d();
                            bl2 = Intrinsics.areEqual(object3, object);
                            if (bl2) break block12;
                            object = p83_02.a;
                            Intrinsics.checkNotNull(object, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                            Object object4 = A83.c;
                            // MONITORENTER : object4
                            v83_02 = A83.k();
                            object = A83.x((Rb3)object, p83_02, v83_02);
                            object = (P83$a)object;
                            // MONITORENTER : object2
                            try {
                                int n15 = ((P83$a)object).d;
                                if (n15 != n14) break block13;
                                ((P83$a)object).c = object3;
                                ((P83$a)object).d = n15 += n7;
                                ((P83$a)object).e = n14 = ((P83$a)object).e + n7;
                                bl2 = true;
                                break block14;
                            }
                            catch (Throwable throwable2) {
                                break block15;
                            }
                        }
                        bl2 = false;
                        object = null;
                    }
                    // MONITOREXIT : object2
                    // MONITOREXIT : object4
                    A83.o(v83_02, p83_02);
                } while (!bl2);
                break block12;
            }
            // MONITOREXIT : object2
            throw throwable2;
        }
        if ((n4 -= (n3 = p83_02.size())) > 0) {
            collection = this.a;
            this.c = n3 = ((p83_0)collection).c();
            this.d = n3 = this.d - n4;
        }
        if (n4 <= 0) return 0 != 0;
        return n7 != 0;
    }

    public final Object set(int n3, Object object) {
        int n4;
        int n7 = this.d;
        Q83.a(n3, n7);
        this.a();
        n7 = this.b;
        p83_0 p83_02 = this.a;
        Object object2 = p83_02.set(n3 += n7, object);
        this.c = n4 = p83_02.c();
        return object2;
    }

    public final int size() {
        return this.d;
    }

    public final List subList(int n3, int n4) {
        of3_1 of3_12;
        int n7;
        if (n3 >= 0 && n3 <= n4 && n4 <= (n7 = this.d)) {
            n7 = 1;
        } else {
            n7 = 0;
            of3_12 = null;
        }
        if (n7 != 0) {
            this.a();
            int n8 = this.b;
            p83_0 p83_02 = this.a;
            of3_12 = new of3_1(p83_02, n3 += n8, n4 += n8);
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
}

