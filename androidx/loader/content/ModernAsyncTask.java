/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 */
package androidx.loader.content;

import android.os.Handler;
import android.os.Looper;
import androidx.loader.content.ModernAsyncTask$3;
import androidx.loader.content.ModernAsyncTask$a;
import androidx.loader.content.ModernAsyncTask$b;
import androidx.loader.content.ModernAsyncTask$d;
import androidx.loader.content.ModernAsyncTask$e;
import androidx.loader.content.ModernAsyncTask$f;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class ModernAsyncTask {
    public static final ThreadPoolExecutor f;
    public static ModernAsyncTask$e g;
    public final ModernAsyncTask$b a;
    public final FutureTask b;
    public volatile ModernAsyncTask$f c;
    public final AtomicBoolean d;
    public final AtomicBoolean e;

    static {
        ThreadPoolExecutor threadPoolExecutor;
        ModernAsyncTask$a modernAsyncTask$a = new ModernAsyncTask$a();
        LinkedBlockingQueue<Runnable> linkedBlockingQueue = new LinkedBlockingQueue<Runnable>(10);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f = threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1L, timeUnit, linkedBlockingQueue, modernAsyncTask$a);
    }

    public ModernAsyncTask() {
        Object object;
        this.c = object = ModernAsyncTask$f.PENDING;
        this.d = object;
        super();
        this.e = object;
        super(this);
        this.a = object;
        ModernAsyncTask$3 modernAsyncTask$3 = new ModernAsyncTask$3(this, (ModernAsyncTask$b)object);
        this.b = modernAsyncTask$3;
    }

    public abstract Object a();

    public void b(Object object) {
    }

    public void c(Object object) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void d(Object object) {
        Object[] objectArray;
        int n3 = 1;
        Object object2 = ModernAsyncTask.class;
        // MONITORENTER : object2
        ModernAsyncTask$e modernAsyncTask$e = g;
        if (modernAsyncTask$e == null) {
            objectArray = Looper.getMainLooper();
            g = modernAsyncTask$e = new Handler((Looper)objectArray);
        }
        modernAsyncTask$e = g;
        // MONITOREXIT : object2
        objectArray = new Object[n3];
        objectArray[0] = object;
        object2 = new ModernAsyncTask$d(this, objectArray);
        modernAsyncTask$e.obtainMessage(n3, object2).sendToTarget();
    }
}

