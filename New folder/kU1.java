/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import androidx.navigation.d;
import androidx.navigation.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public abstract class kU1 {
    public final ReentrantLock a;
    public final kb3_2 b;
    public final kb3_2 c;
    public boolean d;
    public final ge2_2 e;
    public final ge2_2 f;

    public kU1() {
        kb3_2 kb3_22;
        Object object = new ReentrantLock(true);
        this.a = object;
        this.b = object = lb3_2.a(mz0_2.a);
        this.c = kb3_22 = lb3_2.a(vz0_2.a);
        this.e = object = ms0_1.b((kb3_2)object);
        this.f = object = ms0_1.b(kb3_22);
    }

    public abstract d a(i var1, Bundle var2);

    public void b(d d2) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(d2, "entry");
        kb3_2 kb3_22 = this.c;
        Object object = (Set)kb3_22.getValue();
        Intrinsics.checkNotNullParameter(object, "<this>");
        int n3 = eh1_2.c(object.size());
        LinkedHashSet linkedHashSet = new LinkedHashSet(n3);
        object = ((Iterable)object).iterator();
        n3 = 0;
        boolean bl3 = false;
        while (bl2 = object.hasNext()) {
            boolean bl4;
            Object e2 = object.next();
            boolean bl5 = true;
            if (!bl3 && (bl4 = Intrinsics.areEqual(e2, d2))) {
                bl3 = true;
                bl5 = false;
            }
            if (!bl5) continue;
            linkedHashSet.add(e2);
        }
        kb3_22.getClass();
        kb3_22.k(null, linkedHashSet);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void c(d object, boolean bl2) {
        Throwable throwable2;
        ReentrantLock reentrantLock;
        block6: {
            ArrayList arrayList;
            kb3_2 kb3_22;
            Intrinsics.checkNotNullParameter(object, "popUpTo");
            reentrantLock = this.a;
            reentrantLock.lock();
            try {
                boolean bl3;
                kb3_22 = this.b;
                Iterator iterator = kb3_22.getValue();
                iterator = (Iterable)((Object)iterator);
                arrayList = new ArrayList();
                iterator = iterator.iterator();
                while (bl3 = iterator.hasNext()) {
                    Object t3;
                    Object object2 = t3 = iterator.next();
                    object2 = (d)t3;
                    boolean bl4 = Intrinsics.areEqual(object2, object) ^ true;
                    if (bl4) {
                        arrayList.add(t3);
                        continue;
                    }
                    break;
                }
            }
            catch (Throwable throwable2) {
                break block6;
            }
            kb3_22.getClass();
            object = null;
            kb3_22.k(null, arrayList);
            object = Unit.a;
            reentrantLock.unlock();
            return;
        }
        reentrantLock.unlock();
        throw throwable2;
    }

    public void d(d d2, boolean bl2) {
        Object object;
        Object object2;
        kb3_2 kb3_22;
        block7: {
            Object object3;
            ge2_2 ge2_22;
            boolean bl3;
            block9: {
                block8: {
                    Intrinsics.checkNotNullParameter(d2, "popUpTo");
                    kb3_22 = this.c;
                    object2 = (Iterable)kb3_22.getValue();
                    bl3 = object2 instanceof Collection;
                    ge2_22 = this.e;
                    if (!bl3) break block8;
                    object3 = object2;
                    object3 = (Collection)object2;
                    bl3 = object3.isEmpty();
                    if (bl3) break block9;
                }
                object2 = object2.iterator();
                block0: while (bl3 = object2.hasNext()) {
                    block11: {
                        block10: {
                            object3 = (d)object2.next();
                            if (object3 != d2) continue;
                            object2 = (Iterable)ge2_22.a.getValue();
                            bl3 = object2 instanceof Collection;
                            if (!bl3) break block10;
                            object3 = object2;
                            object3 = (Collection)object2;
                            bl3 = object3.isEmpty();
                            if (bl3) break block11;
                        }
                        object2 = ((Iterable)object2).iterator();
                        while (bl3 = object2.hasNext()) {
                            object3 = (d)object2.next();
                            if (object3 != d2) continue;
                            break block0;
                        }
                    }
                    return;
                }
            }
            object2 = q03_0.i((Set)kb3_22.getValue(), d2);
            kb3_22.getClass();
            bl3 = false;
            object3 = null;
            kb3_22.k(null, object2);
            object2 = (List)ge2_22.a.getValue();
            int n3 = object2.size();
            object2 = object2.listIterator(n3);
            while ((n3 = (int)(object2.hasPrevious() ? 1 : 0)) != 0) {
                List list;
                int n4;
                Object object4 = object = object2.previous();
                object4 = (d)object;
                int n7 = Intrinsics.areEqual(object4, d2);
                if (n7 != 0 || (n4 = ((List)ge2_22.a.getValue()).lastIndexOf(object4)) >= (n7 = (list = (List)ge2_22.a.getValue()).lastIndexOf(d2))) continue;
                break block7;
            }
            n3 = 0;
            object = null;
        }
        object = (d)object;
        if (object != null) {
            object2 = q03_0.i((Set)kb3_22.getValue(), object);
            kb3_22.getClass();
            kb3_22.k(null, object2);
        }
        this.c(d2, bl2);
    }

    public void e(d object) {
        Intrinsics.checkNotNullParameter(object, "entry");
        kb3_2 kb3_22 = this.c;
        object = q03_0.i((Set)kb3_22.getValue(), object);
        kb3_22.getClass();
        kb3_22.k(null, object);
    }

    public void f(d object) {
        Intrinsics.checkNotNullParameter(object, "backStackEntry");
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            kb3_2 kb3_22 = this.b;
            Object object2 = kb3_22.getValue();
            object2 = (Collection)object2;
            object = CollectionsKt.X((Collection)object2, object);
            kb3_22.getClass();
            object2 = null;
            kb3_22.k(null, object);
            object = Unit.a;
            return;
        }
        finally {
            reentrantLock.unlock();
        }
    }
}

