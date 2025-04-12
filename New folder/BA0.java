/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;

public abstract class BA0
extends n23 {
    public BA0(FP2 fP2) {
        Intrinsics.checkNotNullParameter(fP2, "database");
        super(fP2);
    }

    public abstract void bind(bg3_0 var1, Object var2);

    public final void insert(Iterable object) {
        Throwable throwable2;
        bg3_0 bg3_02;
        block7: {
            block6: {
                Intrinsics.checkNotNullParameter(object, "entities");
                bg3_02 = this.acquire();
                try {
                    object = object.iterator();
                }
                catch (Throwable throwable2) {
                    break block7;
                }
                while (true) {
                    boolean bl2 = object.hasNext();
                    if (!bl2) break block6;
                    break;
                }
                {
                    Object e2 = object.next();
                    this.bind(bg3_02, e2);
                    bg3_02.Z();
                    continue;
                }
            }
            this.release(bg3_02);
            return;
        }
        this.release(bg3_02);
        throw throwable2;
    }

    public final void insert(Object object) {
        bg3_0 bg3_02 = this.acquire();
        try {
            this.bind(bg3_02, object);
            bg3_02.Z();
            return;
        }
        finally {
            this.release(bg3_02);
        }
    }

    public final void insert(Object[] objectArray) {
        Throwable throwable2;
        bg3_0 bg3_02;
        block5: {
            Intrinsics.checkNotNullParameter(objectArray, "entities");
            bg3_02 = this.acquire();
            int n3 = objectArray.length;
            for (int i3 = 0; i3 < n3; ++i3) {
                Object object;
                try {
                    object = objectArray[i3];
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                this.bind(bg3_02, object);
                bg3_02.Z();
                continue;
            }
            this.release(bg3_02);
            return;
        }
        this.release(bg3_02);
        throw throwable2;
    }

    public final long insertAndReturnId(Object object) {
        bg3_0 bg3_02 = this.acquire();
        try {
            this.bind(bg3_02, object);
            long l2 = bg3_02.Z();
            return l2;
        }
        finally {
            this.release(bg3_02);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long[] insertAndReturnIdsArray(Collection object) {
        Intrinsics.checkNotNullParameter(object, "entities");
        bg3_0 bg3_02 = this.acquire();
        try {
            int n3 = object.size();
            long[] lArray = new long[n3];
            object = (Iterable)object;
            object = object.iterator();
            int n4 = 0;
            while (true) {
                long l2;
                boolean bl2;
                if (!(bl2 = object.hasNext())) {
                    this.release(bg3_02);
                    return lArray;
                }
                Object e2 = object.next();
                int n7 = n4 + 1;
                if (n4 < 0) {
                    xx_2.n();
                    object = null;
                    throw null;
                }
                this.bind(bg3_02, e2);
                lArray[n4] = l2 = bg3_02.Z();
                n4 = n7;
            }
        }
        catch (Throwable throwable) {}
        this.release(bg3_02);
        throw throwable;
    }

    public final long[] insertAndReturnIdsArray(Object[] objectArray) {
        Throwable throwable2;
        Intrinsics.checkNotNullParameter(objectArray, "entities");
        bg3_0 bg3_02 = this.acquire();
        int n3 = objectArray.length;
        long[] lArray = new long[n3];
        int n4 = objectArray.length;
        int n7 = 0;
        for (int i3 = 0; i3 < n4; ++i3) {
            int n8;
            Object object;
            try {
                object = objectArray[i3];
                n8 = n7 + 1;
            }
            catch (Throwable throwable2) {
            }
            this.bind(bg3_02, object);
            long l2 = bg3_02.Z();
            lArray[n7] = l2;
            n7 = n8;
            continue;
        }
        this.release(bg3_02);
        return lArray;
        this.release(bg3_02);
        throw throwable2;
    }

    public final Long[] insertAndReturnIdsArrayBox(Collection collection) {
        Throwable throwable2;
        bg3_0 bg3_02;
        block8: {
            Intrinsics.checkNotNullParameter(collection, "entities");
            bg3_02 = this.acquire();
            Iterator iterator = collection.iterator();
            int n3 = collection.size();
            Long[] longArray = new Long[n3];
            for (int i3 = 0; i3 < n3; ++i3) {
                Object object;
                try {
                    object = iterator.next();
                }
                catch (Throwable throwable2) {
                    break block8;
                }
                this.bind(bg3_02, object);
                long l2 = bg3_02.Z();
                object = l2;
                longArray[i3] = object;
                continue;
            }
            this.release(bg3_02);
            return longArray;
        }
        this.release(bg3_02);
        throw throwable2;
    }

    public final Long[] insertAndReturnIdsArrayBox(Object[] objectArray) {
        Throwable throwable2;
        bg3_0 bg3_02;
        block8: {
            Intrinsics.checkNotNullParameter(objectArray, "entities");
            bg3_02 = this.acquire();
            Iterator iterator = ArrayIteratorKt.iterator(objectArray);
            int n3 = objectArray.length;
            Long[] longArray = new Long[n3];
            for (int i3 = 0; i3 < n3; ++i3) {
                Object object;
                try {
                    object = iterator.next();
                }
                catch (Throwable throwable2) {
                    break block8;
                }
                this.bind(bg3_02, object);
                long l2 = bg3_02.Z();
                object = l2;
                longArray[i3] = object;
                continue;
            }
            this.release(bg3_02);
            return longArray;
        }
        this.release(bg3_02);
        throw throwable2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final List insertAndReturnIdsList(Collection object) {
        Intrinsics.checkNotNullParameter(object, "entities");
        bg3_0 bg3_02 = this.acquire();
        try {
            vu1_2 vu1_22 = new vu1_2();
            object = (Iterable)object;
            object = object.iterator();
            while (true) {
                boolean bl2;
                if (!(bl2 = object.hasNext())) {
                    object = a.a(vu1_22);
                    this.release(bg3_02);
                    return object;
                }
                Object object2 = object.next();
                this.bind(bg3_02, object2);
                long l2 = bg3_02.Z();
                object2 = l2;
                vu1_22.add(object2);
            }
        }
        catch (Throwable throwable) {}
        this.release(bg3_02);
        throw throwable;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final List insertAndReturnIdsList(Object[] object) {
        Intrinsics.checkNotNullParameter(object, "entities");
        bg3_0 bg3_02 = this.acquire();
        try {
            vu1_2 vu1_22 = new vu1_2();
            int n3 = ((Object[])object).length;
            int n4 = 0;
            while (true) {
                if (n4 >= n3) {
                    object = a.a(vu1_22);
                    this.release(bg3_02);
                    return object;
                }
                Object object2 = object[n4];
                this.bind(bg3_02, object2);
                long l2 = bg3_02.Z();
                object2 = l2;
                vu1_22.add(object2);
                ++n4;
            }
        }
        catch (Throwable throwable) {}
        this.release(bg3_02);
        throw throwable;
    }
}

