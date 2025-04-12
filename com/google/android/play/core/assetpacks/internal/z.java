/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.os.Handler
 *  android.os.HandlerThread
 *  android.os.IBinder$DeathRecipient
 *  android.os.IInterface
 *  android.os.Looper
 *  android.os.RemoteException
 */
package com.google.android.play.core.assetpacks.internal;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.assetpacks.ab;
import com.google.android.play.core.assetpacks.internal.aa;
import com.google.android.play.core.assetpacks.internal.o;
import com.google.android.play.core.assetpacks.internal.p;
import com.google.android.play.core.assetpacks.internal.q;
import com.google.android.play.core.assetpacks.internal.r;
import com.google.android.play.core.assetpacks.internal.s;
import com.google.android.play.core.assetpacks.internal.t;
import com.google.android.play.core.assetpacks.internal.u;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public final class z {
    private static final Map a;
    private final Context b;
    private final o c;
    private final String d;
    private final List e;
    private final Set f;
    private final Object g;
    private boolean h;
    private final Intent i;
    private final WeakReference j;
    private final IBinder.DeathRecipient k;
    private final AtomicInteger l;
    private ServiceConnection m;
    private IInterface n;

    static {
        HashMap hashMap;
        a = hashMap = new HashMap();
    }

    public z(Context object, o o3, String string2, Intent intent, ab object2, u u3) {
        object2 = new ArrayList();
        this.e = object2;
        this.f = object2;
        this.g = object2 = new Object();
        object2 = new q(this);
        this.k = object2;
        this.l = object2 = new AtomicInteger(0);
        this.b = object;
        this.c = o3;
        this.d = string2;
        this.i = intent;
        super(null);
        this.j = object;
    }

    public static /* bridge */ /* synthetic */ Context a(z z5) {
        return z5.b;
    }

    public static /* bridge */ /* synthetic */ ServiceConnection b(z z5) {
        return z5.m;
    }

    public static /* bridge */ /* synthetic */ IInterface d(z z5) {
        return z5.n;
    }

    public static /* bridge */ /* synthetic */ o f(z z5) {
        return z5.c;
    }

    public static /* bridge */ /* synthetic */ Object g(z z5) {
        return z5.g;
    }

    public static /* bridge */ /* synthetic */ List h(z z5) {
        return z5.e;
    }

    public static /* bridge */ /* synthetic */ AtomicInteger i(z z5) {
        return z5.l;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* synthetic */ void j(z z5) {
        Object object = z5.c;
        Object object2 = "reportBinderDeath";
        Object object3 = null;
        Object[] objectArray = new Object[]{};
        ((o)object).d((String)object2, objectArray);
        object = (u)z5.j.get();
        if (object != null) {
            object2 = z5.c;
            object3 = new Object[]{};
            objectArray = "calling onBinderDied";
            ((o)object2).d((String)objectArray, object3);
            object.a();
        } else {
            boolean bl2;
            object = z5.c;
            object2 = z5.d;
            int n3 = 1;
            objectArray = new Object[n3];
            objectArray[0] = object2;
            object2 = "%s : Binder has died.";
            ((o)object).d((String)object2, objectArray);
            object = z5.e.iterator();
            while (bl2 = object.hasNext()) {
                object2 = (p)object.next();
                object3 = z5.v();
                ((p)object2).c((Exception)object3);
            }
            object = z5.e;
            object.clear();
        }
        object = z5.g;
        synchronized (object) {
            z5.w();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* synthetic */ void k(z object, TaskCompletionSource taskCompletionSource, Task object2) {
        object2 = ((z)object).g;
        synchronized (object2) {
            object = ((z)object).f;
            object.remove(taskCompletionSource);
            return;
        }
    }

    public static /* bridge */ /* synthetic */ void l(z z5, ServiceConnection serviceConnection2) {
        z5.m = null;
    }

    public static /* bridge */ /* synthetic */ void m(z z5, boolean bl2) {
        z5.h = false;
    }

    public static /* bridge */ /* synthetic */ void n(z z5, IInterface iInterface) {
        z5.n = iInterface;
    }

    public static /* bridge */ /* synthetic */ void o(z z5, TaskCompletionSource taskCompletionSource) {
        z5.f.add(taskCompletionSource);
        Task task2 = taskCompletionSource.getTask();
        r r5 = new r(z5, taskCompletionSource);
        task2.addOnCompleteListener(r5);
    }

    public static /* bridge */ /* synthetic */ void p(z z5) {
        z5.w();
    }

    public static /* bridge */ /* synthetic */ void q(z object, p iterator) {
        int n3;
        Object object2 = ((z)object).n;
        Object object3 = null;
        if (object2 == null && (n3 = ((z)object).h) == 0) {
            object2 = ((z)object).c;
            Object object4 = new Object[]{};
            ((o)object2).d("Initiate binding to the service.", (Object[])object4);
            ((z)object).e.add(iterator);
            object2 = null;
            iterator = new Iterator((z)object, null);
            ((z)object).m = iterator;
            n3 = 1;
            ((z)object).h = n3;
            object4 = ((z)object).b;
            Intent intent = ((z)object).i;
            boolean bl2 = object4.bindService(intent, (ServiceConnection)iterator, n3);
            if (!bl2) {
                iterator = ((z)object).c;
                object2 = new Object[]{};
                object4 = "Failed to bind to the service.";
                ((o)((Object)iterator)).d((String)object4, (Object[])object2);
                ((z)object).h = false;
                iterator = ((z)object).e.iterator();
                while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                    object2 = (p)iterator.next();
                    object3 = new aa();
                    ((p)object2).c((Exception)object3);
                }
                object = ((z)object).e;
                object.clear();
            }
            return;
        }
        n3 = ((z)object).h;
        if (n3 != 0) {
            object2 = ((z)object).c;
            object3 = new Object[]{};
            ((o)object2).d("Waiting to bind to the service.", object3);
            ((z)object).e.add(iterator);
            return;
        }
        ((p)((Object)iterator)).run();
    }

    public static /* bridge */ /* synthetic */ void r(z object) {
        o o3 = ((z)object).c;
        Object[] objectArray = null;
        Object[] objectArray2 = new Object[]{};
        String string2 = "linkToDeath";
        o3.d(string2, objectArray2);
        try {
            o3 = ((z)object).n;
        }
        catch (RemoteException remoteException) {
            object = ((z)object).c;
            objectArray = new Object[]{};
            ((o)object).c(remoteException, "linkToDeath failed", objectArray);
            return;
        }
        o3 = o3.asBinder();
        objectArray2 = ((z)object).k;
        o3.linkToDeath((IBinder.DeathRecipient)objectArray2, 0);
    }

    public static /* bridge */ /* synthetic */ void s(z z5) {
        o o3 = z5.c;
        Object[] objectArray = new Object[]{};
        o3.d("unlinkToDeath", objectArray);
        o3 = z5.n.asBinder();
        z5 = z5.k;
        o3.unlinkToDeath((IBinder.DeathRecipient)z5, 0);
    }

    private final RemoteException v() {
        String string2 = String.valueOf(this.d);
        string2 = string2.concat(" : Binder has died.");
        RemoteException remoteException = new RemoteException(string2);
        return remoteException;
    }

    private final void w() {
        boolean bl2;
        Iterator iterator = this.f.iterator();
        while (bl2 = iterator.hasNext()) {
            TaskCompletionSource taskCompletionSource = (TaskCompletionSource)iterator.next();
            RemoteException remoteException = this.v();
            taskCompletionSource.trySetException((Exception)((Object)remoteException));
        }
        this.f.clear();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Handler c() {
        Map map2 = a;
        synchronized (map2) {
            Throwable throwable2;
            block4: {
                String string2;
                block3: {
                    try {
                        string2 = this.d;
                        boolean bl2 = map2.containsKey(string2);
                        if (bl2) break block3;
                        String string3 = this.d;
                        int n3 = 10;
                        string2 = new HandlerThread(string3, n3);
                        ((Thread)((Object)string2)).start();
                        string3 = this.d;
                        string2 = string2.getLooper();
                        Handler handler = new Handler((Looper)string2);
                        map2.put(string3, handler);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                string2 = this.d;
                string2 = map2.get(string2);
                return (Handler)string2;
            }
            throw throwable2;
        }
    }

    public final IInterface e() {
        return this.n;
    }

    public final void t(p p2, TaskCompletionSource taskCompletionSource) {
        TaskCompletionSource taskCompletionSource2 = p2.b();
        s s7 = new s(this, taskCompletionSource2, taskCompletionSource, p2);
        this.c().post((Runnable)s7);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void u(TaskCompletionSource object) {
        Object object2 = this.g;
        synchronized (object2) {
            Set set = this.f;
            set.remove(object);
        }
        object = new t(this);
        this.c().post((Runnable)object);
    }
}

