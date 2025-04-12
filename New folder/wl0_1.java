/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.a;
import kotlin.time.b;

/*
 * Renamed from WL0
 */
public final class wl0_1 {
    public static final long f;
    public static final LinkedHashSet g;
    public static final HashMap h;
    public static final Object i;
    public final jl0_1 a;
    public final ml0_2 b;
    public final yf1_2 c;
    public final fm0_0 d;
    public final pt1_2 e;

    static {
        Object object = kotlin.time.a.b;
        aw0_1 aw0_12 = aw0_1.DAYS;
        f = kotlin.time.a.c(kotlin.time.b.f(14, aw0_12));
        object = new LinkedHashSet();
        g = object;
        object = new HashMap();
        h = object;
        i = object = new Object();
    }

    public wl0_1(jl0_1 jl0_12, ml0_2 ml0_22, yf1_2 yf1_22, fm0_0 fm0_02, pt1_2 pt1_22) {
        Intrinsics.checkNotNullParameter(jl0_12, "cleanupStrategy");
        Intrinsics.checkNotNullParameter(ml0_22, "preloaderStrategy");
        Intrinsics.checkNotNullParameter(yf1_22, "inAppAssetsStore");
        Intrinsics.checkNotNullParameter(fm0_02, "fileStore");
        Intrinsics.checkNotNullParameter(pt1_22, "legacyInAppsStore");
        this.a = jl0_12;
        this.b = ml0_22;
        this.c = yf1_22;
        this.d = fm0_02;
        this.e = pt1_22;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void a(wl0_1 object, Pair object2, ps0_1 ps0_12) {
        object.getClass();
        object = g;
        boolean bl2 = object.isEmpty();
        if (bl2) {
            return;
        }
        Object object3 = i;
        synchronized (object3) {
            Throwable throwable2;
            block5: {
                try {
                    HashMap hashMap = h;
                    object2 = ((Pair)object2).a;
                    hashMap.put(object2, ps0_12);
                    object = object.iterator();
                    boolean bl3 = object.hasNext();
                    if (bl3) break block5;
                    object = Unit.a;
                }
                catch (Throwable throwable2) {}
                return;
            }
            object = object.next();
            object = (qs0_1)object;
            object.getClass();
            object = null;
            throw null;
            throw throwable2;
        }
    }

    public final void b(ArrayList object) {
        Object object2;
        Object object3;
        int n3;
        Object object4;
        String string2 = "urls";
        Intrinsics.checkNotNullParameter(object, string2);
        long l2 = System.currentTimeMillis();
        pt1_2 pt1_22 = this.e;
        Object object5 = pt1_22.a;
        String string3 = "last_assets_cleanup";
        long l3 = ((vi_2)object5).c(string3);
        l3 = l2 - l3;
        long l4 = f;
        long l7 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
        if (l7 < 0) {
            return;
        }
        object5 = this.d.a.b();
        if (object5 == null || (object5 = object5.keySet()) == null) {
            object5 = vz0_2.a;
        }
        if ((object4 = this.c.a.b()) == null || (object4 = object4.keySet()) == null) {
            object4 = vz0_2.a;
        }
        object4 = (Iterable)object4;
        object5 = q03_0.h(object5, object4);
        object4 = new yl0_2(this, 0);
        int n4 = eh1_2.c(yx_2.o((Iterable)object, 10));
        if (n4 < (n3 = 16)) {
            n4 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(n4);
        object = object.iterator();
        while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            object3 = object.next();
            object2 = object3;
            object2 = (String)object3;
            linkedHashMap.put(object3, object2);
        }
        object = CollectionsKt.n0((Iterable)object5);
        object5 = new ArrayList();
        object = object.iterator();
        while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            object3 = object.next();
            object2 = object3;
            object2 = (String)object3;
            boolean bl2 = linkedHashMap.containsKey(object2);
            boolean bl3 = true;
            bl2 ^= bl3;
            long l8 = ((Number)(object2 = (Number)((yl0_2)object4).invoke(object2))).longValue();
            long l12 = l2 - l8;
            n3 = (int)(l12 == 0L ? 0 : (l12 < 0L ? -1 : 1));
            if (n3 <= 0) {
                bl3 = false;
            }
            if (!bl2 || !bl3) continue;
            ((ArrayList)object5).add(object3);
        }
        object = new xl0_2(this);
        this.a.a((ArrayList)object5, (xl0_2)object);
        pt1_22.a.g(l2, string3);
    }

    public final void c(ArrayList arrayList, Function1 function1, Function1 function12, Function1 function13) {
        Intrinsics.checkNotNullParameter(arrayList, "urlMeta");
        Intrinsics.checkNotNullParameter(function1, "completionCallback");
        Intrinsics.checkNotNullParameter(function12, "successBlock");
        Intrinsics.checkNotNullParameter(function13, "failureBlock");
        bm0_1 bm0_12 = new bm0_1(this, function12);
        zl0_1 zl0_12 = new zl0_1(this, function13);
        am0_1 am0_12 = new am0_1(this);
        this.b.a(arrayList, bm0_12, zl0_12, am0_12, function1);
    }
}

