/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.ServiceConnection
 *  android.os.RemoteException
 */
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.RemoteException;

public final class Vf0
extends ag0 {
    public final /* synthetic */ Context a;

    public Vf0(Context context) {
        this.a = context;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onCustomTabsServiceConnected(ComponentName object, Wf0 wf0) {
        wf0.getClass();
        try {
            object = wf0.a;
            long l2 = 0L;
            object.warmup(l2);
        }
        catch (RemoteException remoteException) {}
        this.a.unbindService((ServiceConnection)this);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
    }
}

