/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences$Editor
 */
import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from rI3
 */
public final class ri3_0
extends XO1 {
    public final Context a;

    public ri3_0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super(9, 10);
        this.a = context;
    }

    public final void migrate(xg3_1 xg3_12) {
        Object object;
        int n3 = 1;
        int n4 = 2;
        Intrinsics.checkNotNullParameter(xg3_12, "db");
        xg3_12.o("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        Context context = this.a;
        Object object2 = context.getSharedPreferences("androidx.work.util.preferences", 0);
        Object object3 = "reschedule_needed";
        boolean bl2 = object2.contains((String)object3);
        Object[] objectArray = "last_cancel_all_time_ms";
        if (bl2 || (bl2 = object2.contains((String)objectArray))) {
            long l2 = 0L;
            long l3 = object2.getLong((String)objectArray, l2);
            bl2 = object2.getBoolean((String)object3, false);
            if (bl2) {
                l2 = 1L;
            }
            xg3_12.i();
            object = l3;
            Object[] objectArray2 = new Object[n4];
            objectArray2[0] = objectArray;
            objectArray2[n3] = object;
            xg3_12.n0(objectArray2);
            object = l2;
            objectArray = new Object[n4];
            objectArray[0] = object3;
            objectArray[n3] = object;
            xg3_12.n0(objectArray);
            object2 = object2.edit();
            object2 = object2.clear();
            object2.apply();
            xg3_12.y();
        }
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(xg3_12, "sqLiteDatabase");
        context = context.getSharedPreferences("androidx.work.util.id", 0);
        object2 = "next_job_scheduler_id";
        int n7 = context.contains((String)object2);
        if (n7 != 0 || (n7 = context.contains((String)object2)) != 0) {
            n7 = context.getInt((String)object2, 0);
            object = "next_alarm_manager_id";
            int n8 = context.getInt((String)object, 0);
            xg3_12.i();
            object3 = n7;
            Object[] objectArray3 = new Object[n4];
            objectArray3[0] = object2;
            objectArray3[n3] = object3;
            xg3_12.n0(objectArray3);
            object2 = n8;
            Object[] objectArray4 = new Object[n4];
            objectArray4[0] = object;
            objectArray4[n3] = object2;
            xg3_12.n0(objectArray4);
            SharedPreferences.Editor editor = context.edit();
            editor = editor.clear();
            editor.apply();
            xg3_12.y();
        }
        return;
        finally {
            xg3_12.F();
        }
        finally {
            xg3_12.F();
        }
    }
}

