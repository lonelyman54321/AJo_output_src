/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Service
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.os.AsyncTask
 *  android.os.Build$VERSION
 *  android.os.IBinder
 */
package androidx.core.app;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import androidx.core.app.JobIntentService$a;
import androidx.core.app.JobIntentService$b;
import androidx.core.app.JobIntentService$c;
import androidx.core.app.JobIntentService$e;
import androidx.core.app.JobIntentService$f;
import androidx.core.app.JobIntentService$g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executor;

public abstract class JobIntentService
extends Service {
    public static final Object f;
    public static final HashMap g;
    public JobIntentService$e a;
    public JobIntentService$g b;
    public JobIntentService$a c;
    public boolean d;
    public final ArrayList e;

    static {
        HashMap hashMap = new HashMap();
        f = hashMap;
        g = hashMap = new HashMap();
    }

    public JobIntentService() {
        ArrayList arrayList = null;
        this.d = false;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 26;
        if (n3 >= n4) {
            n3 = 0;
            arrayList = null;
            this.e = null;
        } else {
            this.e = arrayList = new ArrayList();
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static JobIntentService$g b(Context object, ComponentName componentName, boolean bl2, int n3) {
        void var1_2;
        HashMap hashMap = g;
        JobIntentService$g jobIntentService$g = (JobIntentService$g)hashMap.get(var1_2);
        if (jobIntentService$g == null) {
            void var8_10;
            int n4 = Build.VERSION.SDK_INT;
            int n7 = 26;
            if (n4 >= n7) {
                void var3_4;
                void var2_3;
                if (var2_3 == false) {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Can't be here without a job id");
                    throw illegalArgumentException;
                }
                JobIntentService$f jobIntentService$f = new JobIntentService$f((Context)object, (ComponentName)var1_2, (int)var3_4);
            } else {
                JobIntentService$b jobIntentService$b = new JobIntentService$b((Context)object, (ComponentName)var1_2);
            }
            jobIntentService$g = var8_10;
            hashMap.put(var1_2, var8_10);
        }
        return jobIntentService$g;
    }

    public final void a(boolean bl2) {
        Object object = this.c;
        if (object == null) {
            object = new JobIntentService$a(this);
            this.c = object;
            object = this.b;
            if (object != null && bl2) {
                ((JobIntentService$g)object).d();
            }
            JobIntentService$a jobIntentService$a = this.c;
            object = AsyncTask.THREAD_POOL_EXECUTOR;
            Object[] objectArray = new Void[]{};
            jobIntentService$a.executeOnExecutor((Executor)object, objectArray);
        }
    }

    public abstract void c(Intent var1);

    public void d() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e() {
        ArrayList arrayList = this.e;
        if (arrayList == null) return;
        synchronized (arrayList) {
            Throwable throwable2;
            block5: {
                block4: {
                    Object object;
                    int n3;
                    block3: {
                        n3 = 0;
                        object = null;
                        try {
                            this.c = null;
                            object = this.e;
                            if (object == null || (n3 = ((ArrayList)object).size()) <= 0) break block3;
                            n3 = 0;
                            object = null;
                            this.a(false);
                            break block4;
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    n3 = (int)(this.d ? 1 : 0);
                    if (n3 != 0) return;
                    object = this.b;
                    ((JobIntentService$g)object).c();
                }
                return;
            }
            throw throwable2;
        }
    }

    public final IBinder onBind(Intent object) {
        object = this.a;
        if (object != null) {
            return om.a((JobIntentService$e)((Object)object));
        }
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 26;
        if (n3 >= n4) {
            JobIntentService$e jobIntentService$e;
            this.a = jobIntentService$e = new JobIntentService$e(this);
            this.b = null;
        } else {
            this.a = null;
            Class<?> clazz = ((Object)((Object)this)).getClass();
            Object object = new ComponentName((Context)this, clazz);
            n4 = 0;
            clazz = null;
            object = JobIntentService.b((Context)this, object, false, 0);
            this.b = object;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onDestroy() {
        super.onDestroy();
        ArrayList arrayList = this.e;
        if (arrayList == null) return;
        synchronized (arrayList) {
            boolean bl2;
            this.d = bl2 = true;
            JobIntentService$g jobIntentService$g = this.b;
            jobIntentService$g.c();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int onStartCommand(Intent intent, int n3, int n4) {
        ArrayList arrayList = this.e;
        if (arrayList == null) {
            return 2;
        }
        this.b.e();
        arrayList = this.e;
        synchronized (arrayList) {
            ArrayList arrayList2 = this.e;
            if (intent == null) {
                intent = new Intent();
            }
            JobIntentService$c jobIntentService$c = new JobIntentService$c(this, intent, n4);
            arrayList2.add(jobIntentService$c);
            boolean bl2 = true;
            this.a(bl2);
            return 3;
        }
    }
}

