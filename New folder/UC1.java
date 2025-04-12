/*
 * Decompiled with CFR 0.152.
 */
import java.util.AbstractCollection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

public final class UC1 {
    public final x30_0 a;
    public final HashMap b;
    public final LinkedHashSet c;
    public int d;
    public int e;
    public int f;

    public UC1() {
        Cloneable cloneable;
        this.a = cloneable;
        this.b = cloneable = new Cloneable(0, 0.75f);
        super();
        this.c = cloneable;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object a(Object object) {
        x30_0 x30_02 = this.a;
        synchronized (x30_02) {
            Throwable throwable2;
            block4: {
                int n3;
                try {
                    HashMap hashMap = this.b;
                    hashMap = hashMap.get(object);
                    if (hashMap != null) {
                        int n4;
                        LinkedHashSet linkedHashSet = this.c;
                        ((AbstractCollection)linkedHashSet).remove(object);
                        linkedHashSet = this.c;
                        ((AbstractCollection)linkedHashSet).add(object);
                        this.e = n4 = this.e + 1;
                        return hashMap;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                this.f = n3 = this.f + 1;
                return null;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object b(Object object, Object object2) {
        if (object != null && object2 != null) {
            x30_0 x30_02 = this.a;
            synchronized (x30_02) {
                try {
                    int n3;
                    this.d = n3 = this.d() + 1;
                    Cloneable cloneable = this.b;
                    object2 = ((HashMap)cloneable).put(object, object2);
                    if (object2 != null) {
                        this.d = n3 = this.d() + -1;
                    }
                    if ((n3 = (int)(((AbstractCollection)((Object)(cloneable = this.c))).contains(object) ? 1 : 0)) != 0) {
                        cloneable = this.c;
                        ((AbstractCollection)((Object)cloneable)).remove(object);
                    }
                    cloneable = this.c;
                    ((AbstractCollection)((Object)cloneable)).add(object);
                    // MONITOREXIT @DISABLED, blocks:[0, 1, 5] lbl17 : MonitorExitStatement: MONITOREXIT : var3_4
                    this.e();
                    return object2;
                }
                catch (Throwable throwable) {}
                throw throwable;
            }
        }
        throw null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object c(Object object) {
        x30_0 x30_02 = this.a;
        synchronized (x30_02) {
            Throwable throwable2;
            block4: {
                HashMap hashMap;
                block3: {
                    try {
                        int n3;
                        hashMap = this.b;
                        hashMap = hashMap.remove(object);
                        LinkedHashSet linkedHashSet = this.c;
                        ((AbstractCollection)linkedHashSet).remove(object);
                        if (hashMap == null) break block3;
                        this.d = n3 = this.d() + -1;
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                object = Unit.a;
                return hashMap;
            }
            throw throwable2;
        }
    }

    public final int d() {
        x30_0 x30_02 = this.a;
        synchronized (x30_02) {
            int n3 = this.d;
            return n3;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void e() {
        Object object;
        Object object2;
        while (true) {
            Object object3;
            int n3;
            x30_0 x30_02 = this.a;
            // MONITORENTER : x30_02
            int n4 = this.d();
            if (n4 < 0 || (n4 = (int)(((HashMap)(object2 = this.b)).isEmpty() ? 1 : 0)) != 0 && (n4 = this.d()) != 0 || (n4 = (int)(((HashMap)(object2 = this.b)).isEmpty() ? 1 : 0)) != (n3 = ((AbstractCollection)(object = this.c)).isEmpty())) break;
            n4 = this.d();
            if (n4 > (n3 = 16) && (n4 = (int)(((HashMap)(object2 = this.b)).isEmpty() ? 1 : 0)) == 0) {
                object2 = this.c;
                object2 = CollectionsKt.K((Iterable)object2);
                object = this.b;
                if ((object = ((HashMap)object).get(object2)) == null) {
                    object = "inconsistent state";
                    object2 = new IllegalStateException((String)object);
                    throw object2;
                }
                object3 = this.b;
                object3 = TypeIntrinsics.asMutableMap(object3);
                object3.remove(object2);
                object3 = this.c;
                object3 = TypeIntrinsics.asMutableCollection(object3);
                object3.remove(object2);
                int n7 = this.d();
                Intrinsics.checkNotNull(object2);
                Intrinsics.checkNotNull(object);
                this.d = n7 += -1;
            } else {
                n4 = 0;
                object2 = null;
                n3 = 0;
                object = null;
            }
            object3 = Unit.a;
            if (object2 == null && object == null) {
                return;
            }
            Intrinsics.checkNotNull(object2);
            Intrinsics.checkNotNull(object);
        }
        object = "map/keySet size inconsistency";
        object2 = new IllegalStateException((String)object);
        throw object2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String toString() {
        String string2 = "LruCache[maxSize=16,hits=";
        x30_0 x30_02 = this.a;
        synchronized (x30_02) {
            Throwable throwable2;
            block5: {
                int n3;
                block6: {
                    block4: {
                        int n4;
                        try {
                            n3 = this.e;
                            n4 = this.f + n3;
                            if (n4 == 0) break block4;
                            n3 *= 100;
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                        n3 /= n4;
                        break block6;
                    }
                    n3 = 0;
                }
                StringBuilder stringBuilder = new StringBuilder(string2);
                int n7 = this.e;
                stringBuilder.append(n7);
                string2 = ",misses=";
                stringBuilder.append(string2);
                n7 = this.f;
                stringBuilder.append(n7);
                string2 = ",hitRate=";
                stringBuilder.append(string2);
                stringBuilder.append(n3);
                string2 = "%]";
                stringBuilder.append(string2);
                return stringBuilder.toString();
            }
            throw throwable2;
        }
    }
}

