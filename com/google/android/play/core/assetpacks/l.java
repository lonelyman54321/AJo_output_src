/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentSender
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Parcelable
 */
package com.google.android.play.core.assetpacks;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import androidx.activity.result.IntentSenderRequest;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.assetpacks.AssetLocation;
import com.google.android.play.core.assetpacks.AssetPackException;
import com.google.android.play.core.assetpacks.AssetPackLocation;
import com.google.android.play.core.assetpacks.AssetPackManager;
import com.google.android.play.core.assetpacks.AssetPackState;
import com.google.android.play.core.assetpacks.AssetPackStateUpdateListener;
import com.google.android.play.core.assetpacks.AssetPackStates;
import com.google.android.play.core.assetpacks.bc;
import com.google.android.play.core.assetpacks.bh;
import com.google.android.play.core.assetpacks.bm;
import com.google.android.play.core.assetpacks.bt;
import com.google.android.play.core.assetpacks.ci;
import com.google.android.play.core.assetpacks.dd;
import com.google.android.play.core.assetpacks.dt;
import com.google.android.play.core.assetpacks.e;
import com.google.android.play.core.assetpacks.er;
import com.google.android.play.core.assetpacks.f;
import com.google.android.play.core.assetpacks.g;
import com.google.android.play.core.assetpacks.h;
import com.google.android.play.core.assetpacks.i;
import com.google.android.play.core.assetpacks.internal.ad;
import com.google.android.play.core.assetpacks.internal.aq;
import com.google.android.play.core.assetpacks.internal.n;
import com.google.android.play.core.assetpacks.internal.o;
import com.google.android.play.core.assetpacks.j;
import com.google.android.play.core.assetpacks.k;
import com.google.android.play.core.assetpacks.model.b;
import com.google.android.play.core.assetpacks.z;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

final class l
implements AssetPackManager {
    private static final o a;
    private final bm b;
    private final bc c;
    private final bh d;
    private final ad e;
    private final dt f;
    private final dd g;
    private final ci h;
    private final er i;
    private final Handler j;
    private boolean k;
    private final aq l;
    private final aq m;

    static {
        o o3;
        a = o3 = new o("AssetPackManager");
    }

    public l(bm bm3, aq aq2, bc bc2, bh bh2, ad ad2, dt dt2, dd dd2, ci ci2, aq aq4, er er2) {
        Handler handler;
        Looper looper = Looper.getMainLooper();
        this.j = handler = new Handler(looper);
        this.b = bm3;
        this.l = aq2;
        this.c = bc2;
        this.d = bh2;
        this.e = ad2;
        this.f = dt2;
        this.g = dd2;
        this.h = ci2;
        this.m = aq4;
        this.i = er2;
    }

    public static /* bridge */ /* synthetic */ ci b(l l2) {
        return l2.h;
    }

    public static /* synthetic */ void c(l l2) {
        l2.b.y();
        l2.b.w();
        l2.b.x();
    }

    public static /* synthetic */ void d(l object, String string2, TaskCompletionSource taskCompletionSource) {
        bm bm3 = ((l)object).b;
        boolean bl2 = bm3.D(string2);
        if (bl2) {
            taskCompletionSource.setResult(null);
            ((z)((l)object).l.a()).j(string2);
            return;
        }
        string2 = cP.a("Failed to remove pack ", string2, ".");
        object = new IOException(string2);
        taskCompletionSource.setException((Exception)object);
    }

    public static /* synthetic */ void e(l object) {
        Object object2 = (z)((l)object).l.a();
        Object object3 = ((l)object).b.u();
        object2 = object2.d((Map)object3);
        object3 = (Executor)((l)object).m.a();
        bm bm3 = ((l)object).b;
        Objects.requireNonNull(bm3);
        e e2 = new e(bm3);
        object2 = ((Task)object2).addOnSuccessListener((Executor)object3, (OnSuccessListener)e2);
        object = (Executor)((l)object).m.a();
        object3 = new f();
        ((Task)object2).addOnFailureListener((Executor)object, (OnFailureListener)object3);
    }

    public static /* synthetic */ void f(Exception object) {
        o o3 = a;
        Object[] objectArray = new Object[]{object};
        object = String.format("Could not sync active asset packs. %s", objectArray);
        objectArray = new Object[]{};
        o3.e((String)object, objectArray);
    }

    private final Task h(Activity activity) {
        Intent intent = new Intent((Context)activity, PlayCoreDialogWrapperActivity.class);
        Object object = this.h.a();
        intent.putExtra("confirmation_intent", (Parcelable)object);
        object = new TaskCompletionSource();
        Handler handler = this.j;
        k k2 = new k(this, handler, (TaskCompletionSource)object);
        intent.putExtra("result_receiver", (Parcelable)k2);
        activity.startActivity(intent);
        return ((TaskCompletionSource)object).getTask();
    }

    private final void i() {
        Executor executor = (Executor)this.m.a();
        g g3 = new g(this);
        executor.execute(g3);
    }

    public final int a(int n3, String string2) {
        bm bm3 = this.b;
        boolean bl2 = bm3.G(string2);
        int n4 = 4;
        if (!bl2 && n3 == n4) {
            return 8;
        }
        bm3 = this.b;
        boolean bl3 = bm3.G(string2);
        if (bl3 && n3 != n4) {
            return n4;
        }
        return n3;
    }

    public final AssetPackStates cancel(List list) {
        boolean bl2;
        l l2 = this;
        Object object = list;
        Map map2 = this.f.h(list);
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        Iterator iterator = list.iterator();
        while (bl2 = iterator.hasNext()) {
            int n3;
            int n4;
            String string2 = (String)iterator.next();
            Object object2 = (Integer)map2.get(string2);
            if (object2 == null) {
                n4 = 0;
                object2 = null;
                n3 = 0;
            } else {
                n3 = n4 = ((Integer)object2).intValue();
            }
            String string3 = "";
            String string4 = "";
            long l3 = 0L;
            long l4 = 0L;
            double d2 = 0.0;
            object2 = string2;
            object2 = AssetPackState.a(string2, n3, 0, l3, l4, d2, 0, string3, string4);
            hashMap.put(string2, object2);
        }
        ((z)l2.l.a()).e((List)object);
        object = new bt(0L, hashMap);
        return object;
    }

    public final void clearListeners() {
        this.d.a();
        this.c.d();
    }

    public final Task fetch(List object) {
        Map map2 = this.b.u();
        Object object2 = new ArrayList(object);
        boolean bl2 = ((ArrayList)object2).isEmpty();
        if (bl2) {
            long l2;
            String string2;
            String string3;
            map2 = new Bundle();
            bl2 = false;
            map2.putInt("session_id", 0);
            object2 = "error_code";
            map2.putInt((String)object2, 0);
            Iterator iterator = object.iterator();
            while (true) {
                boolean bl3 = iterator.hasNext();
                string3 = "bytes_downloaded";
                string2 = "total_bytes_to_download";
                l2 = 0L;
                if (!bl3) break;
                String string4 = (String)iterator.next();
                String string5 = com.google.android.play.core.assetpacks.model.b.a("status", string4);
                int n3 = 4;
                map2.putInt(string5, n3);
                string5 = com.google.android.play.core.assetpacks.model.b.a(object2, string4);
                map2.putInt(string5, 0);
                string2 = com.google.android.play.core.assetpacks.model.b.a(string2, string4);
                map2.putLong(string2, l2);
                string4 = com.google.android.play.core.assetpacks.model.b.a(string3, string4);
                map2.putLong(string4, l2);
            }
            object2 = new ArrayList(object);
            map2.putStringArrayList("pack_names", (ArrayList)object2);
            map2.putLong(string2, l2);
            map2.putLong(string3, l2);
            object = this.g;
            object2 = this.i;
            return Tasks.forResult(AssetPackStates.a((Bundle)map2, (dd)object, (er)object2));
        }
        return ((z)this.l.a()).c((List)object2, map2);
    }

    public final void g(boolean bl2) {
        bc bc2 = this.c;
        boolean bl3 = bc2.i();
        bc2.f(bl2);
        if (bl2 && !bl3) {
            this.i();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final AssetLocation getAssetLocation(String string2, String string3) {
        j j3;
        Object object;
        boolean bl2 = this.k;
        int n3 = 1;
        if (!bl2) {
            object = (Executor)this.m.a();
            j3 = new j(this);
            object.execute(j3);
            this.k = n3;
        }
        object = this.b;
        bl2 = ((bm)object).G(string2);
        j3 = null;
        if (bl2) {
            try {
                object = this.b;
            }
            catch (IOException iOException) {
                return null;
            }
            object = ((bm)object).f(string2);
        } else {
            object = this.e.a();
            bl2 = object.contains(string2);
            if (!bl2) return null;
            object = AssetPackLocation.a();
        }
        if (object == null) {
            return null;
        }
        int n4 = ((AssetPackLocation)object).packStorageMethod();
        if (n4 == n3) {
            object = this.b;
            List list = ((bm)object).s(string2);
            return ((bm)object).d(string2, string3, list);
        }
        n4 = ((AssetPackLocation)object).packStorageMethod();
        if (n4 == 0) {
            return this.b.e(string2, string3, (AssetPackLocation)object);
        }
        object = a;
        Object[] objectArray = new Object[2];
        objectArray[0] = string3;
        objectArray[n3] = string2;
        ((o)object).a("The asset %s is not present in Asset Pack %s", objectArray);
        return null;
    }

    public final AssetPackLocation getPackLocation(String string2) {
        j j3;
        Object object;
        boolean bl2 = this.k;
        if (!bl2) {
            object = (Executor)this.m.a();
            j3 = new j(this);
            object.execute(j3);
            this.k = bl2 = true;
        }
        object = this.b;
        bl2 = ((bm)object).G(string2);
        j3 = null;
        if (bl2) {
            try {
                object = this.b;
            }
            catch (IOException iOException) {
                return null;
            }
            return ((bm)object).f(string2);
        }
        object = this.e.a();
        boolean bl3 = object.contains(string2);
        if (bl3) {
            return AssetPackLocation.a();
        }
        return null;
    }

    public final Map getPackLocations() {
        boolean bl2;
        Map map2 = this.b.v();
        HashMap<String, AssetPackLocation> hashMap = new HashMap<String, AssetPackLocation>();
        Iterator iterator = this.e.a().iterator();
        while (bl2 = iterator.hasNext()) {
            String string2 = (String)iterator.next();
            AssetPackLocation assetPackLocation = AssetPackLocation.a();
            hashMap.put(string2, assetPackLocation);
        }
        map2.putAll(hashMap);
        return map2;
    }

    public final Task getPackStates(List list) {
        z z5 = (z)this.l.a();
        h h3 = new h(this);
        Map map2 = this.b.u();
        return z5.b(list, h3, map2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void registerListener(AssetPackStateUpdateListener assetPackStateUpdateListener) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    Object object = this.d;
                    ((bh)object).b(assetPackStateUpdateListener);
                    object = this.c;
                    boolean bl2 = ((n)object).i();
                    ((n)object).e(assetPackStateUpdateListener);
                    if (!bl2) {
                        this.i();
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return;
            }
            throw throwable2;
        }
    }

    public final Task removePack(String string2) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        Executor executor = (Executor)this.m.a();
        i i3 = new i(this, string2, taskCompletionSource);
        executor.execute(i3);
        return taskCompletionSource.getTask();
    }

    public final Task showCellularDataConfirmation(Activity object) {
        if (object == null) {
            object = new AssetPackException(-3);
            return Tasks.forException((Exception)object);
        }
        PendingIntent pendingIntent = this.h.a();
        if (pendingIntent == null) {
            object = new AssetPackException(-12);
            return Tasks.forException((Exception)object);
        }
        return this.h((Activity)object);
    }

    public final boolean showCellularDataConfirmation(I3 i3) {
        PendingIntent pendingIntent;
        if (i3 != null && (pendingIntent = this.h.a()) != null) {
            pendingIntent = this.h.a().getIntentSender();
            Intrinsics.checkNotNullParameter(pendingIntent, "intentSender");
            IntentSenderRequest intentSenderRequest = new IntentSenderRequest((IntentSender)pendingIntent, null, 0, 0);
            i3.a(intentSenderRequest);
            return true;
        }
        return false;
    }

    public final Task showConfirmationDialog(Activity object) {
        if (object == null) {
            object = new AssetPackException(-3);
            return Tasks.forException((Exception)object);
        }
        PendingIntent pendingIntent = this.h.a();
        if (pendingIntent == null) {
            object = new AssetPackException(-14);
            return Tasks.forException((Exception)object);
        }
        return this.h((Activity)object);
    }

    public final boolean showConfirmationDialog(I3 i3) {
        PendingIntent pendingIntent;
        if (i3 != null && (pendingIntent = this.h.a()) != null) {
            pendingIntent = this.h.a().getIntentSender();
            Intrinsics.checkNotNullParameter(pendingIntent, "intentSender");
            IntentSenderRequest intentSenderRequest = new IntentSenderRequest((IntentSender)pendingIntent, null, 0, 0);
            i3.a(intentSenderRequest);
            return true;
        }
        return false;
    }

    public final void unregisterListener(AssetPackStateUpdateListener assetPackStateUpdateListener) {
        this.d.c(assetPackStateUpdateListener);
        this.c.g(assetPackStateUpdateListener);
    }
}

