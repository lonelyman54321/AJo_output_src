/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentCallbacks2
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.graphics.Bitmap
 *  android.graphics.drawable.Drawable
 *  android.os.Looper
 *  android.util.Log
 */
package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.Log;
import com.bumptech.glide.RequestManager$1;
import com.bumptech.glide.RequestManager$b;
import com.bumptech.glide.manager.a;
import com.bumptech.glide.manager.b;
import com.bumptech.glide.manager.c;
import com.bumptech.glide.manager.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class RequestManager
implements ComponentCallbacks2,
ku1_0 {
    public static final fk2_0 k;
    public static final fk2_0 l;
    public final com.bumptech.glide.a a;
    public final Context b;
    public final fu1_0 c;
    public final iK2 d;
    public final eK2 e;
    public final oi3_0 f;
    public final Runnable g;
    public final a h;
    public final CopyOnWriteArrayList i;
    public fk2_0 j;

    static {
        Object object = new fk2_0();
        k = (fk2_0)((fk2_0)((uw_0)object).i(Bitmap.class)).r();
        object = new fk2_0();
        l = (fk2_0)((fk2_0)((uw_0)object).i(yz0_2.class)).r();
        object = Nq0.b;
        Object object2 = new fk2_0();
        object = (fk2_0)object2.j((Nq0)object);
        object2 = Az2.LOW;
        object = (fk2_0)((fk2_0)((uw_0)object).y((Az2)((Object)object2))).E(true);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public RequestManager(com.bumptech.glide.a object, fu1_0 copyOnWriteArrayList, eK2 object2, Context object3) {
        block9: {
            boolean bl2;
            Object object4 = new iK2();
            b b2 = ((com.bumptech.glide.a)object).g;
            Object object5 = new oi3_0();
            this.f = object5;
            this.g = object5 = new RequestManager$1(this);
            this.a = object;
            this.c = copyOnWriteArrayList;
            this.e = object2;
            this.d = object4;
            this.b = object3;
            object2 = object3.getApplicationContext();
            object3 = new RequestManager$b(this, (iK2)object4);
            ((d)b2).getClass();
            object4 = "android.permission.ACCESS_NETWORK_STATE";
            int n3 = t70.checkSelfPermission((Context)object2, (String)object4);
            boolean bl3 = false;
            b2 = null;
            if (n3 == 0) {
                n3 = 1;
            } else {
                n3 = 0;
                object4 = null;
            }
            String string2 = "ConnectivityMonitor";
            int n4 = 3;
            Log.isLoggable((String)string2, (int)n4);
            object4 = n3 != 0 ? new c((Context)object2, (RequestManager$b)object3) : new Object();
            this.h = object4;
            object2 = ((com.bumptech.glide.a)object).h;
            // MONITORENTER : object2
            object3 = ((com.bumptech.glide.a)object).h;
            boolean bl4 = ((ArrayList)object3).contains(this);
            if (bl4) break block9;
            object3 = ((com.bumptech.glide.a)object).h;
            ((ArrayList)object3).add(this);
            // MONITOREXIT : object2
            object2 = dz3.a;
            object2 = Looper.myLooper();
            object3 = Looper.getMainLooper();
            if (object2 == object3) {
                bl3 = true;
            }
            if (bl2 = bl3 ^ true) {
                object2 = dz3.f();
                object2.post((Runnable)object5);
            } else {
                copyOnWriteArrayList.b(this);
            }
            copyOnWriteArrayList.b((ku1_0)object4);
            object2 = ((com.bumptech.glide.a)object).d.e;
            this.i = copyOnWriteArrayList = new CopyOnWriteArrayList(object2);
            object = ((com.bumptech.glide.a)object).d.a();
            this.s((fk2_0)object);
            return;
        }
        copyOnWriteArrayList = "Cannot register already registered manager";
        object = new IllegalStateException((String)((Object)copyOnWriteArrayList));
        throw object;
    }

    public rj2_0 b(Class clazz) {
        com.bumptech.glide.a a2 = this.a;
        Context context = this.b;
        rj2_0 rj2_02 = new rj2_0(a2, this, clazz, context);
        return rj2_02;
    }

    public rj2_0 f() {
        rj2_0 rj2_02 = this.b(Bitmap.class);
        fk2_0 fk2_02 = k;
        return rj2_02.M(fk2_02);
    }

    public rj2_0 j() {
        return this.b(Drawable.class);
    }

    public rj2_0 k() {
        rj2_0 rj2_02 = this.b(yz0_2.class);
        fk2_0 fk2_02 = l;
        return rj2_02.M(fk2_02);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void l(ki3_1 ki3_12) {
        if (ki3_12 == null) {
            return;
        }
        boolean bl2 = this.t(ki3_12);
        LJ2 lJ2 = ki3_12.getRequest();
        if (bl2) return;
        Iterator iterator = this.a;
        ArrayList arrayList = ((com.bumptech.glide.a)((Object)iterator)).h;
        synchronized (arrayList) {
            try {
                Object object;
                boolean bl3;
                iterator = ((com.bumptech.glide.a)((Object)iterator)).h;
                iterator = ((ArrayList)((Object)iterator)).iterator();
                do {
                    if (!(bl3 = iterator.hasNext())) {
                        // MONITOREXIT @DISABLED, blocks:[0, 2, 4, 5] lbl14 : MonitorExitStatement: MONITOREXIT : var5_6
                        if (lJ2 == null) return;
                        bl2 = false;
                        iterator = null;
                        ki3_12.g(null);
                        lJ2.clear();
                        return;
                    }
                    object = iterator.next();
                } while (!(bl3 = ((RequestManager)(object = (RequestManager)object)).t(ki3_12)));
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void m() {
        synchronized (this) {
            try {
                Object object = this.f;
                object = ((oi3_0)object).a;
                object = dz3.e((Collection)object);
                object = ((ArrayList)object).iterator();
                while (true) {
                    boolean bl2;
                    if (!(bl2 = object.hasNext())) {
                        object = this.f;
                        object = ((oi3_0)object).a;
                        object.clear();
                        return;
                    }
                    Object object2 = object.next();
                    object2 = (ki3_1)object2;
                    this.l((ki3_1)object2);
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public rj2_0 n(x31_0 x31_02) {
        return this.j().U(x31_02);
    }

    public rj2_0 o(Integer n3) {
        return this.j().T(n3);
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onDestroy() {
        synchronized (this) {
            Object object = this.f;
            ((oi3_0)object).onDestroy();
            this.m();
            object = this.d;
            Object object2 = ((iK2)object).a;
            object2 = dz3.e((Collection)object2);
            object2 = ((ArrayList)object2).iterator();
            while (true) {
                boolean bl2;
                if (!(bl2 = object2.hasNext())) {
                    object = ((iK2)object).b;
                    ((HashSet)object).clear();
                    object = this.c;
                    object.c(this);
                    object = this.c;
                    object2 = this.h;
                    object.c((ku1_0)object2);
                    object = this.g;
                    object2 = dz3.f();
                    object2.removeCallbacks((Runnable)object);
                    object = this.a;
                    ((com.bumptech.glide.a)object).d(this);
                    return;
                }
                Object object3 = object2.next();
                object3 = (LJ2)object3;
                ((iK2)object).a((LJ2)object3);
            }
        }
    }

    public final void onLowMemory() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onStart() {
        synchronized (this) {
            this.r();
            oi3_0 oi3_02 = this.f;
            oi3_02.onStart();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onStop() {
        synchronized (this) {
            oi3_0 oi3_02 = this.f;
            oi3_02.onStop();
            this.q();
            return;
        }
    }

    public final void onTrimMemory(int n3) {
    }

    public rj2_0 p(String string2) {
        return this.j().V(string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void q() {
        synchronized (this) {
            boolean bl2;
            iK2 iK22 = this.d;
            iK22.c = bl2 = true;
            Object object = iK22.a;
            object = dz3.e((Collection)object);
            object = ((ArrayList)object).iterator();
            boolean bl3;
            while (bl3 = object.hasNext()) {
                Object object2 = object.next();
                boolean bl4 = (object2 = (LJ2)object2).isRunning();
                if (!bl4) continue;
                object2.pause();
                HashSet hashSet = iK22.b;
                hashSet.add(object2);
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void r() {
        synchronized (this) {
            Object object = this.d;
            Object object2 = null;
            ((iK2)object).c = false;
            object2 = ((iK2)object).a;
            object2 = dz3.e((Collection)object2);
            object2 = ((ArrayList)object2).iterator();
            while (true) {
                boolean bl2;
                if (!(bl2 = object2.hasNext())) {
                    object = ((iK2)object).b;
                    ((HashSet)object).clear();
                    return;
                }
                Object object3 = object2.next();
                boolean bl3 = (object3 = (LJ2)object3).d();
                if (bl3 || (bl3 = object3.isRunning())) continue;
                object3.j();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void s(fk2_0 uw_02) {
        synchronized (this) {
            uw_02 = uw_02.g();
            uw_02 = uw_02.d();
            uw_02 = (fk2_0)uw_02;
            this.j = uw_02;
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean t(ki3_1 ki3_12) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                boolean bl2;
                Object object;
                block5: {
                    try {
                        object = ki3_12.getRequest();
                        bl2 = true;
                        if (object != null) break block5;
                    }
                    catch (Throwable throwable2) {}
                    return bl2;
                }
                iK2 iK22 = this.d;
                boolean bl3 = iK22.a((LJ2)object);
                if (!bl3) break block6;
                object = this.f;
                object = ((oi3_0)object).a;
                object.remove(ki3_12);
                bl3 = false;
                object = null;
                ki3_12.g(null);
                return bl2;
            }
            return false;
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String toString() {
        synchronized (this) {
            CharSequence charSequence = new StringBuilder();
            Object object = super.toString();
            charSequence.append((String)object);
            object = "{tracker=";
            charSequence.append((String)object);
            object = this.d;
            charSequence.append(object);
            object = ", treeNode=";
            charSequence.append((String)object);
            object = this.e;
            charSequence.append(object);
            object = "}";
            charSequence.append((String)object);
            return charSequence.toString();
        }
    }
}

