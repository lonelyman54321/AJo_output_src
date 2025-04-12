/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.PowerManager$WakeLock
 */
package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmDispatcher;
import androidx.work.impl.background.systemalarm.SystemAlarmDispatcher$AddRunnable;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemalarm.a;
import androidx.work.impl.utils.SerialExecutorImpl;
import androidx.work.impl.utils.WorkTimer;
import androidx.work.impl.utils.WorkTimer$WorkTimerRunnable;
import androidx.work.impl.utils.WorkTimer$a;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.Executor;
import kotlinx.coroutines.JobSupport;

public final class c
implements t82,
WorkTimer$a {
    public final Context a;
    public final int b;
    public final gI3 c;
    public final SystemAlarmDispatcher d;
    public final MH3 e;
    public final Object f;
    public int g;
    public final VZ2 h;
    public final Executor i;
    public PowerManager.WakeLock j;
    public boolean k;
    public final xb3_0 l;
    public final kotlinx.coroutines.c m;
    public volatile xl1_2 n;

    static {
        qx1.b("DelayMetCommandHandler");
    }

    public c(Context object, int n3, SystemAlarmDispatcher object2, xb3_0 xb3_02) {
        this.a = object;
        this.b = n3;
        this.d = object2;
        object = xb3_02.a;
        this.c = object;
        this.l = xb3_02;
        object = ((SystemAlarmDispatcher)object2).e.j;
        Object object3 = ((SystemAlarmDispatcher)object2).b;
        this.h = object2 = object3.c();
        this.i = object2 = object3.a();
        this.m = object3 = object3.b();
        this.e = object3 = new MH3((aq3)object);
        this.k = false;
        this.g = 0;
        this.f = object;
    }

    public static void b(c object) {
        Object object2 = ((c)object).c;
        Object object3 = ((gI3)object2).a;
        int n3 = ((c)object).g;
        int n4 = 2;
        if (n3 < n4) {
            ((c)object).g = n4;
            qx1.a().getClass();
            n3 = androidx.work.impl.background.systemalarm.a.f;
            Object object4 = ((c)object).a;
            Class<SystemAlarmService> clazz = SystemAlarmService.class;
            object3 = new Intent(object4, clazz);
            object3.setAction("ACTION_STOP_WORK");
            androidx.work.impl.background.systemalarm.a.e((Intent)object3, (gI3)object2);
            SystemAlarmDispatcher systemAlarmDispatcher = ((c)object).d;
            int n7 = ((c)object).b;
            Object object5 = new SystemAlarmDispatcher$AddRunnable(n7, (Intent)object3, systemAlarmDispatcher);
            object = ((c)object).i;
            object.execute((Runnable)object5);
            object3 = systemAlarmDispatcher.d;
            object5 = ((gI3)object2).a;
            n3 = (int)(((kz2_0)object3).f((String)object5) ? 1 : 0);
            if (n3 != 0) {
                qx1.a().getClass();
                object3 = new Intent(object4, clazz);
                object4 = "ACTION_SCHEDULE_WORK";
                object3.setAction((String)object4);
                androidx.work.impl.background.systemalarm.a.e((Intent)object3, (gI3)object2);
                object2 = new SystemAlarmDispatcher$AddRunnable(n7, (Intent)object3, systemAlarmDispatcher);
                object.execute((Runnable)object2);
            } else {
                object = qx1.a();
                object.getClass();
            }
        } else {
            object = qx1.a();
            object.getClass();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void c(c object) {
        int n3 = ((c)object).g;
        if (n3 != 0) {
            qx1 qx12 = qx1.a();
            object = ((c)object).c;
            Objects.toString(object);
            qx12.getClass();
            return;
        }
        ((c)object).g = 1;
        Object object2 = qx1.a();
        Objects.toString(((c)object).c);
        object2.getClass();
        object2 = ((c)object).d.d;
        Object object3 = ((c)object).l;
        Object object4 = null;
        n3 = (int)(((kz2_0)object2).h((xb3_0)object3, null) ? 1 : 0);
        if (n3 != 0) {
            object2 = ((c)object).d.c;
            object3 = ((c)object).c;
            object4 = ((WorkTimer)object2).d;
            synchronized (object4) {
                Object object5 = qx1.a();
                Objects.toString(object3);
                object5.getClass();
                ((WorkTimer)object2).a((gI3)object3);
                object5 = new WorkTimer$WorkTimerRunnable((WorkTimer)object2, (gI3)object3);
                HashMap hashMap = ((WorkTimer)object2).b;
                hashMap.put(object3, object5);
                hashMap = ((WorkTimer)object2).c;
                hashMap.put(object3, object);
                object = ((WorkTimer)object2).a;
                long l2 = 600000L;
                ((Sm0)object).b(l2, (Runnable)object5);
                return;
            }
        }
        ((c)object).e();
    }

    public final void a(gI3 object) {
        qx1 qx12 = qx1.a();
        Objects.toString(object);
        qx12.getClass();
        object = new co0(this);
        ((SerialExecutorImpl)this.h).execute((Runnable)object);
    }

    public final void d(EI3 object, k60_0 object2) {
        boolean bl2 = object2 instanceof k60$a;
        object2 = this.h;
        if (bl2) {
            int n3 = 1;
            object = new vt_0(this, n3);
            object2 = (SerialExecutorImpl)object2;
            ((SerialExecutorImpl)object2).execute((Runnable)object);
        } else {
            object = new co0(this);
            object2 = (SerialExecutorImpl)object2;
            ((SerialExecutorImpl)object2).execute((Runnable)object);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e() {
        Object object = this.f;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                boolean bl2;
                gI3 gI32;
                Object object2;
                block4: {
                    try {
                        object2 = this.n;
                        if (object2 == null) break block4;
                        object2 = this.n;
                        gI32 = null;
                        ((JobSupport)object2).d(null);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                object2 = this.d;
                object2 = ((SystemAlarmDispatcher)object2).c;
                gI32 = this.c;
                ((WorkTimer)object2).a(gI32);
                object2 = this.j;
                if (object2 != null && (bl2 = object2.isHeld())) {
                    object2 = qx1.a();
                    gI32 = this.j;
                    Objects.toString(gI32);
                    gI32 = this.c;
                    Objects.toString(gI32);
                    object2.getClass();
                    object2 = this.j;
                    object2.release();
                }
                return;
            }
            throw throwable2;
        }
    }

    public final void f() {
        boolean bl2;
        Object object = this.c.a;
        Object object2 = this.a;
        Object object3 = nn_2.a((String)object, " (");
        int n3 = this.b;
        ((StringBuilder)object3).append(n3);
        String string2 = ")";
        ((StringBuilder)object3).append(string2);
        object3 = ((StringBuilder)object3).toString();
        object2 = QE3.a((Context)object2, (String)object3);
        this.j = object2;
        object2 = qx1.a();
        object3 = this.j;
        Objects.toString(object3);
        object2.getClass();
        this.j.acquire();
        object2 = this.d.e.c.f();
        object = object2.i((String)object);
        if (object == null) {
            object = this.h;
            object2 = new co0(this);
            ((SerialExecutorImpl)object).execute((Runnable)object2);
            return;
        }
        this.k = bl2 = ((EI3)object).e();
        if (!bl2) {
            qx1.a().getClass();
            object = this.h;
            int n4 = 1;
            object2 = new vt_0(this, n4);
            object = (SerialExecutorImpl)object;
            ((SerialExecutorImpl)object).execute((Runnable)object2);
        } else {
            object2 = this.e;
            object3 = this.m;
            this.n = object = OH3.a((MH3)object2, (EI3)object, (kotlinx.coroutines.c)object3, this);
        }
    }

    public final void g(boolean bl2) {
        boolean bl3;
        Intent intent;
        Object object = qx1.a();
        Object object2 = this.c;
        Objects.toString(object2);
        object.getClass();
        this.e();
        object = SystemAlarmService.class;
        int n3 = this.b;
        SystemAlarmDispatcher systemAlarmDispatcher = this.d;
        Executor executor = this.i;
        Context context = this.a;
        if (bl2) {
            int n4 = androidx.work.impl.background.systemalarm.a.f;
            intent = new Intent(context, (Class)object);
            String string2 = "ACTION_SCHEDULE_WORK";
            intent.setAction(string2);
            androidx.work.impl.background.systemalarm.a.e(intent, (gI3)object2);
            object2 = new SystemAlarmDispatcher$AddRunnable(n3, intent, systemAlarmDispatcher);
            executor.execute((Runnable)object2);
        }
        if (bl3 = this.k) {
            int n7 = androidx.work.impl.background.systemalarm.a.f;
            intent = new Intent(context, (Class)object);
            intent.setAction("ACTION_CONSTRAINTS_CHANGED");
            object = new SystemAlarmDispatcher$AddRunnable(n3, intent, systemAlarmDispatcher);
            executor.execute((Runnable)object);
        }
    }
}

