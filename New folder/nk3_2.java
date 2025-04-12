/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.AppOpsManager
 *  android.app.AppOpsManager$OnOpActiveChangedListener
 */
import android.app.AppOpsManager;
import java.util.concurrent.Executor;

/*
 * Renamed from nK3
 */
public final class nk3_2 {
    public static /* bridge */ /* synthetic */ void a(AppOpsManager appOpsManager, String[] stringArray, Executor executor, AppOpsManager.OnOpActiveChangedListener onOpActiveChangedListener) {
        appOpsManager.startWatchingActive(stringArray, executor, onOpActiveChangedListener);
    }
}

