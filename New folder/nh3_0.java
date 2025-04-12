/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 */
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemalarm.a;

/*
 * Renamed from nh3
 */
public final class nh3_0
implements mt2_0 {
    public final Context a;

    static {
        qx1.b("SystemAlarmScheduler");
    }

    public nh3_0(Context context) {
        this.a = context = context.getApplicationContext();
    }

    public final void b(String string2) {
        Context context = this.a;
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", string2);
        context.startService(intent);
    }

    public final void c(EI3 ... eI3Array) {
        for (EI3 eI3 : eI3Array) {
            qx1 qx12 = qx1.a();
            String string2 = eI3.a;
            qx12.getClass();
            gI3 object = JI3.a(eI3);
            Context context = this.a;
            qx12 = new Intent(context, SystemAlarmService.class);
            string2 = "ACTION_SCHEDULE_WORK";
            qx12.setAction(string2);
            androidx.work.impl.background.systemalarm.a.e((Intent)qx12, object);
            context.startService((Intent)qx12);
        }
    }

    public final boolean e() {
        return true;
    }
}

