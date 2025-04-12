/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.AlarmManager
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Build$VERSION
 */
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemalarm.a;
import kotlin.jvm.internal.Intrinsics;

public final class Gc {
    public static final /* synthetic */ int a;

    static {
        qx1.b("Alarms");
    }

    public static void a(Context context, gI3 gI32, int n3) {
        AlarmManager alarmManager = (AlarmManager)context.getSystemService("alarm");
        Intent intent = new Intent(context, SystemAlarmService.class);
        String string2 = "ACTION_DELAY_MET";
        intent.setAction(string2);
        androidx.work.impl.background.systemalarm.a.e(intent, gI32);
        int n4 = Build.VERSION.SDK_INT;
        int n7 = 23;
        n4 = n4 >= n7 ? 0x24000000 : 0x20000000;
        context = PendingIntent.getService((Context)context, (int)n3, (Intent)intent, (int)n4);
        if (context != null && alarmManager != null) {
            qx1 qx12 = qx1.a();
            gI32.toString();
            qx12.getClass();
            alarmManager.cancel((PendingIntent)context);
        }
    }

    public static void b(Context context, WorkDatabase object, gI3 gI32, long l2) {
        th3_1 th3_12 = ((WorkDatabase)object).c();
        Object object2 = th3_12.c(gI32);
        if (object2 != null) {
            int n3 = ((sh3_0)object2).c;
            Gc.a(context, gI32, n3);
            Gc.c(context, gI32, n3, l2);
        } else {
            object2 = new ad1_0((WorkDatabase)object);
            zc1_0 zc1_02 = new zc1_0((ad1_0)object2);
            object = ((FP2)object).runInTransaction(zc1_02);
            Intrinsics.checkNotNullExpressionValue(object, "workDatabase.runInTransa\u2026NAGER_ID_KEY) }\n        )");
            object = (Number)object;
            int n4 = ((Number)object).intValue();
            Intrinsics.checkNotNullParameter(gI32, "generationalId");
            int n7 = gI32.b;
            String string2 = gI32.a;
            object2 = new sh3_0(string2, n7, n4);
            th3_12.d((sh3_0)object2);
            Gc.c(context, gI32, n4, l2);
        }
    }

    public static void c(Context context, gI3 gI32, int n3, long l2) {
        AlarmManager alarmManager = (AlarmManager)context.getSystemService("alarm");
        int n4 = Build.VERSION.SDK_INT;
        int n7 = 23;
        n4 = n4 >= n7 ? 0xC000000 : 0x8000000;
        n7 = androidx.work.impl.background.systemalarm.a.f;
        Intent intent = new Intent(context, SystemAlarmService.class);
        String string2 = "ACTION_DELAY_MET";
        intent.setAction(string2);
        androidx.work.impl.background.systemalarm.a.e(intent, gI32);
        context = PendingIntent.getService((Context)context, (int)n3, (Intent)intent, (int)n4);
        if (alarmManager != null) {
            gI32 = null;
            alarmManager.setExact(0, l2, (PendingIntent)context);
        }
    }
}

