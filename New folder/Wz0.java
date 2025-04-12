/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 */
import android.os.Build;
import androidx.work.a;
import androidx.work.b;
import androidx.work.b$a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class Wz0 {
    /*
     * Unable to fully structure code
     */
    public static final void a(WorkDatabase var0, a var1_1, qh3_2 var2_2) {
        var3_3 = 1;
        Intrinsics.checkNotNullParameter(var0, "workDatabase");
        Intrinsics.checkNotNullParameter(var1_1, "configuration");
        var4_4 = "continuation";
        Intrinsics.checkNotNullParameter(var2_2, (String)var4_4);
        var5_5 = Build.VERSION.SDK_INT;
        var6_6 = 24;
        if (var5_5 < var6_6) {
            return;
        }
        var4_4 = new qh3_2[var3_3];
        var4_4[0] = var2_2;
        var2_2 = xx_2.j(var4_4);
        var5_5 = 0;
        var4_4 = null;
        while ((var6_6 = var2_2.isEmpty() ^ var3_3) != 0) {
            var7_7 = (qh3_2)cx_2.y((List)var2_2);
            var8_8 = var7_7.d;
            var9_9 = "current.work";
            Intrinsics.checkNotNullExpressionValue(var8_8, (String)var9_9);
            var8_8 = (Iterable)var8_8;
            var10_10 = var8_8 instanceof Collection;
            if (var10_10 == 0) ** GOTO lbl-1000
            var9_9 = var8_8;
            var9_9 = (Collection)var8_8;
            var10_10 = var9_9.isEmpty();
            if (var10_10 != 0) {
                var10_10 = 0;
                var9_9 = null;
            } else lbl-1000:
            // 2 sources

            {
                var8_8 = ((Iterable)var8_8).iterator();
                var10_10 = 0;
                var9_9 = null;
                while (var11_11 = var8_8.hasNext()) {
                    var12_12 = ((CI3)var8_8.next()).b.j;
                    var11_11 = var12_12.f();
                    if (!var11_11 || (var10_10 += var3_3) >= 0) continue;
                    xx_2.m();
                    throw null;
                }
            }
            var5_5 += var10_10;
            var7_7 = var7_7.g;
            if (var7_7 == null) continue;
            var7_7 = (Collection)var7_7;
            var2_2.addAll(var7_7);
        }
        if (var5_5 == 0) {
            return;
        }
        var13_13 = (var0 = var0.f()).B();
        var15_15 = var13_13 + var5_5;
        if (var15_15 <= (var14_14 = var1_1.j)) {
            return;
        }
        var0 = fQ2.a("Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: ", ";\nalready enqueued count: ", ";\ncurrent enqueue operation count: ", var14_14, var13_13);
        var0 = g30.a(var5_5, ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed.", (StringBuilder)var0);
        var2_2 = new IllegalArgumentException((String)var0);
        throw var2_2;
    }

    public static final EI3 b(EI3 eI3) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(eI3, "workSpec");
        Object object = eI3.j;
        Class<ConstraintTrackingWorker> clazz = ConstraintTrackingWorker.class;
        Object object2 = clazz.getName();
        Object object3 = eI3.c;
        boolean bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3 && ((bl3 = ((b60)object).e) || (bl2 = ((b60)object).f))) {
            object = new b$a();
            object2 = eI3.e;
            Intrinsics.checkNotNullParameter(object2, "data");
            object2 = ((b)object2).a;
            ((b$a)object).c((Map)object2);
            String string2 = "androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME";
            Intrinsics.checkNotNullParameter(string2, "key");
            ((b$a)object).a.put(string2, object3);
            object3 = ((b$a)object).a();
            object2 = clazz.getName();
            Intrinsics.checkNotNullExpressionValue(object2, "name");
            return EI3.b(eI3, null, null, (String)object2, (b)object3, 0, 0L, 0, 0, 0L, 0, 0xFFFFEB);
        }
        return eI3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final EI3 c(List list, EI3 eI3) {
        EI3 eI32;
        block16: {
            int n3;
            Object object = list;
            eI32 = eI3;
            Intrinsics.checkNotNullParameter(list, "schedulers");
            Class clazz = "workSpec";
            Intrinsics.checkNotNullParameter(eI3, (String)((Object)clazz));
            Intrinsics.checkNotNullParameter(eI3, (String)((Object)clazz));
            clazz = eI3.e;
            Class<?> clazz2 = "androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME";
            int n4 = ((b)((Object)clazz)).e((String)((Object)clazz2));
            Object object2 = eI3.e;
            boolean bl2 = ((b)object2).e("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME");
            b b2 = eI3.e;
            String string2 = "androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME";
            boolean bl3 = b2.e(string2);
            if (n4 == 0 && bl2 && bl3) {
                clazz = new Class();
                object2 = eI3.e;
                Intrinsics.checkNotNullParameter(object2, "data");
                object2 = ((b)object2).a;
                ((b$a)((Object)clazz)).c((Map)object2);
                object2 = eI3.c;
                Intrinsics.checkNotNullParameter(clazz2, "key");
                ((b$a)((Object)clazz)).a.put(clazz2, object2);
                b2 = ((b$a)((Object)clazz)).a();
                int n7 = 0xFFFFEB;
                n4 = 0;
                clazz = null;
                n3 = 0;
                clazz2 = null;
                object2 = "androidx.work.multiprocess.RemoteListenableDelegatingWorker";
                string2 = null;
                long l2 = 0L;
                long l3 = 0L;
                eI32 = EI3.b(eI3, null, null, (String)object2, b2, 0, l2, 0, 0, l3, 0, n7);
            }
            if ((n3 = 23) <= (n4 = Build.VERSION.SDK_INT) && n4 < (n3 = 26)) {
                return Wz0.b(eI32);
            }
            n3 = 22;
            if (n4 > n3) return eI32;
            clazz = "androidx.work.impl.background.gcm.GcmScheduler";
            clazz = Class.forName((String)((Object)clazz));
            object = (Iterable)object;
            n3 = object instanceof Collection;
            if (n3 != 0) {
                clazz2 = object;
                clazz2 = (Collection)object;
                n3 = (int)(clazz2.isEmpty() ? 1 : 0);
                if (n3 != 0) break block16;
            }
            try {
                object = ((Iterable)object).iterator();
            }
            catch (ClassNotFoundException classNotFoundException) {
                return eI32;
            }
            while (true) {
                n3 = (int)(object.hasNext() ? 1 : 0);
                if (n3 == 0) return eI32;
                clazz2 = object.next();
                clazz2 = (mt2_0)((Object)clazz2);
                clazz2 = clazz2.getClass();
                if ((n3 = (int)(clazz.isAssignableFrom(clazz2) ? 1 : 0)) == 0) continue;
                break;
            }
            return Wz0.b(eI32);
        }
        return eI32;
    }
}

