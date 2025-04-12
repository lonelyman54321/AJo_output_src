/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 */
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import java.util.concurrent.Executor;

/*
 * Renamed from g50
 */
public final class g50_0 {
    public static /* bridge */ /* synthetic */ boolean a(Context context, Intent intent, ServiceConnection serviceConnection2, int n3, Executor executor) {
        return context.bindService(intent, n3, executor, serviceConnection2);
    }
}

