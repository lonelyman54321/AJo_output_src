/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 */
package com.google.android.play.core.assetpacks;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.assetpacks.AssetPackState;
import com.google.android.play.core.assetpacks.az;
import com.google.android.play.core.assetpacks.ba;
import com.google.android.play.core.assetpacks.bb;
import com.google.android.play.core.assetpacks.ci;
import com.google.android.play.core.assetpacks.da;
import com.google.android.play.core.assetpacks.dd;
import com.google.android.play.core.assetpacks.dt;
import com.google.android.play.core.assetpacks.er;
import com.google.android.play.core.assetpacks.internal.aq;
import com.google.android.play.core.assetpacks.internal.n;
import com.google.android.play.core.assetpacks.internal.o;
import com.google.android.play.core.assetpacks.z;
import java.util.concurrent.Executor;

final class bc
extends n {
    private final dt c;
    private final da d;
    private final ci e;
    private final dd f;
    private final er g;
    private final Handler h;
    private final aq i;
    private final aq j;
    private final aq k;

    public bc(Context context, dt dt2, da da3, aq aq2, dd dd2, ci ci2, aq aq4, aq aq5, er er2) {
        o o3 = new o("AssetPackServiceListenerRegistry");
        IntentFilter intentFilter = new IntentFilter("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE");
        super(o3, intentFilter, context);
        o3 = Looper.getMainLooper();
        super((Looper)o3);
        this.h = context;
        this.c = dt2;
        this.d = da3;
        this.i = aq2;
        this.f = dd2;
        this.e = ci2;
        this.j = aq4;
        this.k = aq5;
        this.g = er2;
    }

    public static /* synthetic */ void a(bc object, Bundle bundle) {
        dt dt2 = ((bc)object).c;
        boolean bl2 = dt2.p(bundle);
        if (bl2) {
            object = ((bc)object).d;
            ((da)object).a();
        }
    }

    public static /* synthetic */ void b(bc object, Bundle bundle, AssetPackState assetPackState) {
        Object object2 = ((bc)object).c;
        boolean bl2 = ((dt)object2).o(bundle);
        if (bl2) {
            bundle = ((bc)object).h;
            object2 = new az((bc)object, assetPackState);
            bundle.post((Runnable)object2);
            object = (z)((bc)object).i.a();
            object.f();
        }
    }

    public final void c(Context object, Intent objectArray) {
        int n3;
        Object object2;
        boolean bl2;
        int n4 = 1;
        Object object3 = null;
        Object object4 = objectArray.getBundleExtra("com.google.android.play.core.FLAGS");
        if (object4 != null && (bl2 = object4.getBoolean((String)(object2 = "enableWorkManager")))) {
            return;
        }
        object4 = "com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE";
        if ((objectArray = objectArray.getBundleExtra((String)object4)) == null) {
            object = this.a;
            objectArray = new Object[]{};
            ((o)object).b("Empty bundle received from broadcast.", objectArray);
            return;
        }
        object4 = objectArray.getStringArrayList("pack_names");
        if (object4 != null && (n3 = object4.size()) == n4) {
            object4 = (String)object4.get(0);
            object2 = this.f;
            er er2 = this.g;
            object4 = AssetPackState.b((Bundle)objectArray, (String)object4, (dd)object2, er2);
            object2 = this.a;
            object = new Object[n4];
            object[0] = object4;
            object3 = "ListenerRegistryBroadcastReceiver.onReceive: %s";
            ((o)object2).a((String)object3, (Object[])object);
            object = (PendingIntent)objectArray.getParcelable("confirmation_intent");
            if (object != null) {
                object3 = this.e;
                ((ci)object3).b((PendingIntent)object);
            }
            object = (Executor)this.k.a();
            object3 = new ba(this, (Bundle)objectArray, (AssetPackState)object4);
            object.execute((Runnable)object3);
            object = (Executor)this.j.a();
            object3 = new bb(this, (Bundle)objectArray);
            object.execute((Runnable)object3);
            return;
        }
        object = this.a;
        objectArray = new Object[]{};
        ((o)object).b("Corrupt bundle received from broadcast.", objectArray);
    }
}

