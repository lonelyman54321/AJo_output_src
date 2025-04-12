/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.ActivityManager$RunningTaskInfo
 *  android.content.ComponentName
 */
import android.app.ActivityManager;
import android.content.ComponentName;

/*
 * Renamed from JK3
 */
public final class jk3_1 {
    public static /* bridge */ /* synthetic */ ComponentName a(ActivityManager.RunningTaskInfo runningTaskInfo) {
        return runningTaskInfo.topActivity;
    }
}

