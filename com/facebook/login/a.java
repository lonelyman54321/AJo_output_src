/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.os.RemoteException
 */
package com.facebook.login;

import android.content.ComponentName;
import android.os.RemoteException;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;

public final class a
extends ag0 {
    public static Wf0 a;
    public static bg0 b;
    public static final ReentrantLock c;

    static {
        ReentrantLock reentrantLock;
        c = reentrantLock = new ReentrantLock();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onCustomTabsServiceConnected(ComponentName object, Wf0 object2) {
        String string2 = "name";
        Intrinsics.checkNotNullParameter(object, string2);
        object = "newClient";
        Intrinsics.checkNotNullParameter(object2, (String)object);
        object2.getClass();
        try {
            object = ((Wf0)object2).a;
            long l2 = 0L;
            object.warmup(l2);
        }
        catch (RemoteException remoteException) {}
        a = object2;
        object = c;
        ((ReentrantLock)object).lock();
        object2 = b;
        if (object2 == null && (object2 = a) != null) {
            string2 = null;
            b = object2 = ((Wf0)object2).b(null);
        }
        ((ReentrantLock)object).unlock();
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        Intrinsics.checkNotNullParameter(componentName, "componentName");
    }
}

