/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Looper
 *  android.text.TextUtils
 */
package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmDispatcher$1;
import androidx.work.impl.background.systemalarm.SystemAlarmDispatcher$AddRunnable;
import androidx.work.impl.background.systemalarm.SystemAlarmDispatcher$a;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemalarm.a;
import androidx.work.impl.utils.WorkTimer;
import java.util.ArrayList;
import java.util.Objects;

public final class SystemAlarmDispatcher
implements fe0_0 {
    public static final /* synthetic */ int k;
    public final Context a;
    public final Si3 b;
    public final WorkTimer c;
    public final kz2_0 d;
    public final ni3_1 e;
    public final a f;
    public final ArrayList g;
    public Intent h;
    public SystemAlarmDispatcher$a i;
    public final ii3_0 j;

    static {
        qx1.b("SystemAlarmDispatcher");
    }

    public SystemAlarmDispatcher(Context object) {
        Object object2 = object.getApplicationContext();
        this.a = object2;
        Object object3 = new ab3_0();
        jh3_1 jh3_12 = new jh3_1((ab3_0)object3);
        object = ni3_1.i(object);
        this.e = object;
        xj2_2 xj2_22 = object.b.d;
        this.f = object3 = new a((Context)object2, xj2_22, jh3_12);
        object3 = object.b.g;
        super((Sm0)object3);
        this.c = object2;
        object2 = object.f;
        this.d = object2;
        object = object.d;
        this.b = object;
        this.j = object3 = new ki3_2((kz2_0)object2, (Si3)object);
        ((kz2_0)object2).a(this);
        super();
        this.g = object;
        this.h = null;
    }

    public static void c() {
        Thread thread2;
        Object object = Looper.getMainLooper().getThread();
        if (object == (thread2 = Thread.currentThread())) {
            return;
        }
        object = new IllegalStateException("Needs to be invoked on the main thread.");
        throw object;
    }

    public final void a(gI3 gI32, boolean bl2) {
        qI3$a qI3$a = this.b.a();
        Context context = this.a;
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", bl2);
        androidx.work.impl.background.systemalarm.a.e(intent, gI32);
        SystemAlarmDispatcher$AddRunnable systemAlarmDispatcher$AddRunnable = new SystemAlarmDispatcher$AddRunnable(0, intent, this);
        qI3$a.execute(systemAlarmDispatcher$AddRunnable);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(int n3, Intent intent) {
        Object object = qx1.a();
        Objects.toString(intent);
        object.getClass();
        SystemAlarmDispatcher.c();
        object = intent.getAction();
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (bl2) {
            qx1.a().getClass();
            return;
        }
        Object object2 = "ACTION_CONSTRAINTS_CHANGED";
        boolean bl3 = ((String)object2).equals(object);
        if (bl3 && (bl3 = this.d())) {
            return;
        }
        object = "KEY_START_ID";
        intent.putExtra((String)object, n3);
        ArrayList arrayList = this.g;
        synchronized (arrayList) {
            Throwable throwable2;
            block7: {
                try {
                    object = this.g;
                    bl3 = ((ArrayList)object).isEmpty() ^ true;
                }
                catch (Throwable throwable2) {
                    break block7;
                }
                object2 = this.g;
                ((ArrayList)object2).add(intent);
                if (!bl3) {
                    this.e();
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean d() {
        String string2 = "ACTION_CONSTRAINTS_CHANGED";
        SystemAlarmDispatcher.c();
        ArrayList arrayList = this.g;
        synchronized (arrayList) {
            try {
                Object object;
                boolean bl2;
                Object object2 = this.g;
                object2 = ((ArrayList)object2).iterator();
                do {
                    if (!(bl2 = object2.hasNext())) {
                        return false;
                    }
                    object = object2.next();
                    object = (Intent)object;
                } while (!(bl2 = string2.equals(object = object.getAction())));
                return true;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final void e() {
        SystemAlarmDispatcher.c();
        Context context = this.a;
        Object object = "ProcessCommand";
        context = QE3.a(context, (String)object);
        try {
            context.acquire();
            object = this.e;
            object = ((ni3_1)object).d;
            SystemAlarmDispatcher$1 systemAlarmDispatcher$1 = new SystemAlarmDispatcher$1(this);
            object.d(systemAlarmDispatcher$1);
            return;
        }
        finally {
            context.release();
        }
    }
}

