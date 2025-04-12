/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.IntentFilter
 *  android.os.Handler
 *  android.os.Looper
 */
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class sV1 {
    public static sV1 e;
    public final Handler a;
    public final CopyOnWriteArrayList b;
    public final Object c;
    public int d;

    public sV1(Context context) {
        Object object;
        Object object2 = Looper.getMainLooper();
        this.a = object = new Handler(object2);
        this.b = object;
        super();
        this.c = object;
        this.d = 0;
        super();
        object.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        super(this);
        context.registerReceiver((BroadcastReceiver)object2, (IntentFilter)object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(sV1 sV12, int n3) {
        int n4;
        Iterator iterator = sV12.c;
        synchronized (iterator) {
            try {
                n4 = sV12.d;
                if (n4 == n3) {
                    return;
                }
                sV12.d = n3;
                // MONITOREXIT @DISABLED, blocks:[0, 2] lbl9 : MonitorExitStatement: MONITOREXIT : var2_3
                iterator = sV12.b.iterator();
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
        while ((n4 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            WeakReference weakReference = (WeakReference)iterator.next();
            Object object = (sV1$a)weakReference.get();
            if (object != null) {
                object.a(n3);
                continue;
            }
            object = sV12.b;
            ((CopyOnWriteArrayList)object).remove(weakReference);
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sV1 b(Context object) {
        Class<sV1> clazz = sV1.class;
        synchronized (clazz) {
            try {
                sV1 sV12 = e;
                if (sV12 != null) return e;
                e = sV12 = new sV1((Context)object);
                return e;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int c() {
        Object object = this.c;
        synchronized (object) {
            return this.d;
        }
    }
}

