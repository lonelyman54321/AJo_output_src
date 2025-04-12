/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.ServiceConnection
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.RemoteException
 */
package com.google.android.play.core.assetpacks;

import android.app.Notification;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.play.core.assetpacks.ExtractionForegroundService;
import com.google.android.play.core.assetpacks.cr;
import com.google.android.play.core.assetpacks.internal.k;
import com.google.android.play.core.assetpacks.internal.o;
import java.util.ArrayList;
import java.util.List;

final class cs
implements ServiceConnection {
    private final o a;
    private final List b;
    private final Context c;
    private ExtractionForegroundService d;
    private Notification e;

    public cs(Context context) {
        ArrayList arrayList = new ArrayList("ExtractionForegroundServiceConnection");
        this.a = arrayList;
        this.b = arrayList = new ArrayList();
        this.c = context;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void d() {
        ArrayList arrayList;
        List list;
        List list2 = this.b;
        synchronized (list2) {
            list = this.b;
            arrayList = new ArrayList(list);
            list = this.b;
            list.clear();
        }
        int n3 = arrayList.size();
        list = null;
        int n4 = 0;
        while (n4 < n3) {
            Object object;
            Object[] objectArray;
            Object object2 = (k)arrayList.get(n4);
            try {
                objectArray = new Bundle();
                object = new Bundle();
                ((k)object2).e((Bundle)objectArray, (Bundle)object);
            }
            catch (RemoteException remoteException) {
                object2 = this.a;
                objectArray = new Object[]{};
                object = "Could not resolve Play Store service state update callback.";
                ((o)object2).b((String)object, objectArray);
            }
            ++n4;
        }
        return;
    }

    public final void a(Notification notification) {
        this.e = notification;
    }

    public final void b() {
        Object object = this.a;
        Object[] objectArray = new Object[]{};
        String string2 = "Stopping foreground installation service.";
        ((o)object).a(string2, objectArray);
        this.c.unbindService((ServiceConnection)this);
        object = this.d;
        if (object != null) {
            ((ExtractionForegroundService)((Object)object)).a();
        }
        this.d();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c(k k2) {
        List list = this.b;
        synchronized (list) {
            List list2 = this.b;
            list2.add(k2);
            return;
        }
    }

    public final void onServiceConnected(ComponentName object, IBinder iBinder) {
        object = this.a;
        Object[] objectArray = new Object[]{};
        object.a("Starting foreground installation service.", objectArray);
        object = ((cr)iBinder).a;
        this.d = object;
        objectArray = this.e;
        object.startForeground(-1883842196, (Notification)objectArray);
        this.d();
    }

    public final void onServiceDisconnected(ComponentName componentName) {
    }
}

