/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.ActivityManager
 *  android.app.ActivityManager$RunningAppProcessInfo
 *  android.content.Context
 *  android.os.AsyncTask
 */
import android.app.ActivityManager;
import android.content.Context;
import android.os.AsyncTask;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

public final class AH$a
extends AsyncTask {
    public final Object doInBackground(Object[] object) {
        object = (Context[])object;
        Intrinsics.checkNotNullParameter(object, "params");
        boolean bl2 = false;
        object = object[0].getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(object, "context");
        Iterator iterator = object.getSystemService("activity");
        String string2 = "null cannot be cast to non-null type android.app.ActivityManager";
        Intrinsics.checkNotNull(iterator, string2);
        iterator = ((ActivityManager)iterator).getRunningAppProcesses();
        if (iterator != null) {
            boolean bl3;
            object = object.getPackageName();
            iterator = iterator.iterator();
            while (bl3 = iterator.hasNext()) {
                string2 = (ActivityManager.RunningAppProcessInfo)iterator.next();
                int n3 = ((ActivityManager.RunningAppProcessInfo)string2).importance;
                int n4 = 100;
                if (n3 != n4 || !(bl3 = Intrinsics.areEqual(string2 = ((ActivityManager.RunningAppProcessInfo)string2).processName, object))) continue;
                bl2 = true;
                break;
            }
        }
        return bl2;
    }
}

