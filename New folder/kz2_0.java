/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.PowerManager$WakeLock
 */
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.WorkerParameters$a;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkerStoppedException;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.JobSupport;

/*
 * Renamed from Kz2
 */
public final class kz2_0
implements BV0 {
    public PowerManager.WakeLock a;
    public final Context b;
    public final a c;
    public final Si3 d;
    public final WorkDatabase e;
    public final HashMap f;
    public final HashMap g;
    public final HashMap h;
    public final HashSet i;
    public final ArrayList j;
    public final Object k;

    static {
        qx1.b("Processor");
    }

    public kz2_0(Context object, a a2, Si3 si3, WorkDatabase workDatabase) {
        this.b = object;
        this.c = a2;
        this.d = si3;
        this.e = workDatabase;
        this.g = object;
        super();
        this.f = object;
        super();
        this.i = object;
        super();
        this.j = object;
        this.a = null;
        super();
        this.k = object;
        super();
        this.h = object;
    }

    public static boolean e(WI3 object, int n3) {
        if (object != null) {
            object = ((WI3)object).n;
            WorkerStoppedException workerStoppedException = new WorkerStoppedException(n3);
            ((JobSupport)object).K(workerStoppedException);
            qx1.a().getClass();
            return true;
        }
        qx1.a().getClass();
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(fe0_0 fe0_02) {
        Object object = this.k;
        synchronized (object) {
            ArrayList arrayList = this.j;
            arrayList.add(fe0_02);
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final WI3 b(String object) {
        HashMap hashMap;
        int n3;
        WI3 wI3 = (WI3)this.f.remove(object);
        boolean bl2 = true;
        if (wI3 != null) {
            n3 = 1;
        } else {
            n3 = 0;
            hashMap = null;
        }
        if (n3 == 0) {
            wI3 = (WI3)this.g.remove(object);
        }
        Object object2 = this.h;
        ((HashMap)object2).remove(object);
        if (n3 == 0) return wI3;
        object = this.k;
        synchronized (object) {
            Throwable throwable2;
            block10: {
                hashMap = this.f;
                n3 = hashMap.isEmpty();
                if (bl2 ^= n3) return wI3;
                {
                    Object object3;
                    block11: {
                        catch (Throwable throwable2) {
                            break block10;
                        }
                        {
                            object3 = this.b;
                            n3 = androidx.work.impl.foreground.a.j;
                            object2 = SystemForegroundService.class;
                            hashMap = new Intent((Context)object3, (Class)object2);
                            object3 = "ACTION_STOP_FOREGROUND";
                            hashMap.setAction((String)object3);
                        }
                        try {
                            object3 = this.b;
                            object3.startService((Intent)hashMap);
                            break block11;
                        }
                        catch (Throwable throwable3) {}
                        object3 = qx1.a();
                        object3.getClass();
                    }
                    object3 = this.a;
                    if (object3 == null) return wI3;
                    object3.release();
                    bl2 = false;
                    object3 = null;
                    this.a = null;
                    return wI3;
                }
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final EI3 c(String object) {
        Object object2 = this.k;
        synchronized (object2) {
            try {
                object = this.d((String)object);
                if (object == null) return null;
                return ((WI3)object).a;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final WI3 d(String string2) {
        Object object = (WI3)this.f.get(string2);
        if (object == null) {
            string2 = this.g.get(string2);
            object = string2;
            object = (WI3)((Object)string2);
        }
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean f(String object) {
        Object object2 = this.k;
        synchronized (object2) {
            object = this.d((String)object);
            if (object == null) return false;
            return true;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void g(fe0_0 fe0_02) {
        Object object = this.k;
        synchronized (object) {
            ArrayList arrayList = this.j;
            arrayList.remove(fe0_02);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final boolean h(xb3_0 object, WorkerParameters$a hashSet) {
        WI3$a wI3$a;
        int n3;
        Object object5;
        Object object4;
        Object object3;
        ArrayList arrayList;
        Object object2;
        gI3 gI32;
        block8: {
            gI32 = ((xb3_0)object).a;
            object2 = gI32.a;
            arrayList = new ArrayList();
            object3 = this.e;
            object4 = new Hz2(this, arrayList, (String)object2);
            object5 = object3 = ((FP2)object3).runInTransaction((Callable)object4);
            object5 = (EI3)object3;
            object3 = null;
            if (object5 == null) {
                object = qx1.a();
                gI32.toString();
                object.getClass();
                object = this.d.a();
                hashSet = new HashSet<Object>(this, gI32);
                ((qI3$a)object).execute((Runnable)((Object)hashSet));
                return false;
            }
            Object object6 = this.k;
            // MONITORENTER : object6
            n3 = this.f((String)object2);
            if (n3 == 0) break block8;
            hashSet = this.h;
            hashSet = ((HashMap)((Object)hashSet)).get(object2);
            hashSet = hashSet;
            object2 = hashSet.iterator();
            object2 = object2.next();
            object2 = (xb3_0)object2;
            object2 = ((xb3_0)object2).a;
            int n4 = ((gI3)object2).b;
            n3 = gI32.b;
            if (n4 == n3) {
                hashSet.add(object);
                object = qx1.a();
                gI32.toString();
                object.getClass();
                return false;
            }
            object = this.d;
            object = object.a();
            hashSet = new HashSet<Object>(this, gI32);
            ((qI3$a)object).execute((Runnable)((Object)hashSet));
            // MONITOREXIT : object6
            return false;
        }
        n3 = ((EI3)object5).t;
        int n7 = gI32.b;
        if (n3 != n7) {
            object = this.d;
            object = object.a();
            hashSet = new HashSet<Object>(this, gI32);
            ((qI3$a)object).execute((Runnable)((Object)hashSet));
            // MONITOREXIT : object6
            return false;
        }
        object4 = this.b;
        Object object7 = this.c;
        Si3 si3 = this.d;
        WorkDatabase workDatabase = this.e;
        object3 = wI3$a;
        wI3$a = new WI3$a((Context)object4, (a)object7, si3, this, workDatabase, (EI3)object5, arrayList);
        if (hashSet != null) {
            wI3$a.h = hashSet;
        }
        hashSet = new HashSet<Object>(wI3$a);
        object3 = ((WI3)((Object)hashSet)).e;
        object3 = object3.b();
        object4 = mm0.a();
        object3 = ((kotlin.coroutines.a)object3).plus((CoroutineContext)object4);
        n7 = 0;
        object7 = null;
        object4 = new yi3_2((WI3)((Object)hashSet), null);
        object3 = rv1_1.b((CoroutineContext)object3, (Function2)object4);
        object4 = new Iz2(this, (eK$d)object3, (WI3)((Object)hashSet));
        object7 = this.d;
        object7 = object7.a();
        ((eK$d)object3).addListener((Runnable)object4, (Executor)object7);
        object3 = this.g;
        ((HashMap)object3).put(object2, hashSet);
        hashSet = new HashSet<Object>();
        hashSet.add(object);
        object = this.h;
        ((HashMap)object).put(object2, hashSet);
        // MONITOREXIT : object6
        object = qx1.a();
        gI32.toString();
        object.getClass();
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void i(xb3_0 object, int n3) {
        block5: {
            boolean bl2;
            String string2 = ((xb3_0)object).a.a;
            Object object2 = this.k;
            // MONITORENTER : object2
            Object object3 = this.f;
            object3 = ((HashMap)object3).get(string2);
            if (object3 != null) {
                object = qx1.a();
                object.getClass();
                // MONITOREXIT : object2
                return;
            }
            object3 = this.h;
            object3 = ((HashMap)object3).get(string2);
            if ((object3 = (Set)object3) == null || !(bl2 = object3.contains(object))) break block5;
            object = this.b(string2);
            // MONITOREXIT : object2
            kz2_0.e((WI3)object, n3);
            return;
        }
        // MONITOREXIT : object2
    }
}

