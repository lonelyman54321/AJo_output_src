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
import androidx.lifecycle.LifecycleService;
import androidx.work.impl.background.systemalarm.SystemAlarmDispatcher;
import androidx.work.impl.background.systemalarm.SystemAlarmDispatcher$a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;

public class SystemAlarmService
extends LifecycleService
implements SystemAlarmDispatcher$a {
    public SystemAlarmDispatcher b;
    public boolean c;

    static {
        qx1.b("SystemAlarmService");
    }

    public final void a() {
        boolean bl2;
        this.c = bl2 = true;
        qx1.a().getClass();
        Object object = new LinkedHashMap();
        Object object2 = RE3.a;
        synchronized (object2) {
            boolean bl3;
            Object object3 = RE3.b;
            object.putAll(object3);
            object3 = Unit.a;
            object = ((LinkedHashMap)object).entrySet().iterator();
            while (bl3 = object.hasNext()) {
                object2 = (Map.Entry)object.next();
                object3 = (PowerManager.WakeLock)object2.getKey();
                object2 = (String)object2.getValue();
                if (object3 == null || (bl3 = object3.isHeld()) != bl2) continue;
                object2 = qx1.a();
                object2.getClass();
            }
            this.stopSelf();
            return;
            finally {
            }
        }
    }

    public final void onCreate() {
        super.onCreate();
        Object object = new SystemAlarmDispatcher((Context)this);
        this.b = object;
        SystemAlarmDispatcher$a systemAlarmDispatcher$a = ((SystemAlarmDispatcher)object).i;
        if (systemAlarmDispatcher$a != null) {
            object = qx1.a();
            object.getClass();
        } else {
            ((SystemAlarmDispatcher)object).i = this;
        }
        this.c = false;
    }

    public final void onDestroy() {
        super.onDestroy();
        this.c = true;
        SystemAlarmDispatcher systemAlarmDispatcher = this.b;
        systemAlarmDispatcher.getClass();
        qx1.a().getClass();
        systemAlarmDispatcher.d.g(systemAlarmDispatcher);
        systemAlarmDispatcher.i = null;
    }

    public final int onStartCommand(Intent intent, int n3, int n4) {
        Object object;
        super.onStartCommand(intent, n3, n4);
        n3 = (int)(this.c ? 1 : 0);
        if (n3 != 0) {
            qx1.a().getClass();
            object = this.b;
            object.getClass();
            qx1.a().getClass();
            ((SystemAlarmDispatcher)object).d.g((fe0_0)object);
            ((SystemAlarmDispatcher)object).i = null;
            object = new SystemAlarmDispatcher((Context)this);
            this.b = object;
            SystemAlarmDispatcher$a systemAlarmDispatcher$a = ((SystemAlarmDispatcher)object).i;
            if (systemAlarmDispatcher$a != null) {
                object = qx1.a();
                object.getClass();
            } else {
                ((SystemAlarmDispatcher)object).i = this;
            }
            n3 = 0;
            object = null;
            this.c = false;
        }
        if (intent != null) {
            object = this.b;
            ((SystemAlarmDispatcher)object).b(n4, intent);
        }
        return 3;
    }
}

