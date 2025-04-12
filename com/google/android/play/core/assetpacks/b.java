/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.os.Bundle
 */
package com.google.android.play.core.assetpacks;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import com.google.android.play.core.assetpacks.ExtractionForegroundService;
import com.google.android.play.core.assetpacks.bm;
import com.google.android.play.core.assetpacks.cs;
import com.google.android.play.core.assetpacks.ep;
import com.google.android.play.core.assetpacks.internal.ai;
import com.google.android.play.core.assetpacks.internal.i;
import com.google.android.play.core.assetpacks.internal.k;
import com.google.android.play.core.assetpacks.internal.o;
import com.google.android.play.core.assetpacks.l;

final class b
extends i {
    private final o a;
    private final Context b;
    private final bm c;
    private final l d;
    private final cs e;
    private final ep f;

    public b(Context context, bm bm3, l l2, cs cs2, ep ep2) {
        o o3;
        this.a = o3 = new o("AssetPackExtractionService");
        this.b = context;
        this.c = bm3;
        this.d = l2;
        this.e = cs2;
        this.f = ep2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void d(Bundle object, k object2) {
        int n3 = 1;
        Object object3 = null;
        synchronized (this) {
            Throwable throwable2;
            block6: {
                block5: {
                    int n4;
                    Object object4;
                    try {
                        object4 = this.a;
                        Object object5 = "updateServiceState AIDL call";
                        Object[] objectArray = new Object[]{};
                        ((o)object4).a((String)object5, objectArray);
                        object4 = this.b;
                        n4 = ai.b((Context)object4);
                        if (n4 == 0 || (n4 = ai.a((Context)(object4 = this.b))) == 0) break block5;
                        object4 = "action_type";
                        n4 = object.getInt((String)object4);
                        object5 = this.e;
                        ((cs)object5).c((k)object2);
                        if (n4 == n3) {
                            object2 = this.f;
                            ((ep)object2).b((Bundle)object);
                            object2 = this.d;
                            ((l)object2).g(n3 != 0);
                            object2 = this.e;
                            object3 = this.f;
                            object = ((ep)object3).a((Bundle)object);
                            ((cs)object2).a((Notification)object);
                            object = this.b;
                            object2 = ExtractionForegroundService.class;
                            object3 = new Intent((Context)object, object2);
                            object = this.b;
                            object2 = this.e;
                            object.bindService((Intent)object3, (ServiceConnection)object2, n3);
                            return;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    int n7 = 2;
                    if (n4 == n7) {
                        object = this.d;
                        ((l)object).g(false);
                        object = this.e;
                        ((cs)object).b();
                        return;
                    }
                    object = this.a;
                    object4 = n4;
                    Object[] objectArray = new Object[n3];
                    objectArray[0] = object4;
                    object3 = "Unknown action type received: %d";
                    ((o)object).b((String)object3, objectArray);
                    object = new Bundle();
                    ((k)object2).d((Bundle)object);
                    return;
                }
                object = new Bundle();
                ((k)object2).d((Bundle)object);
                return;
            }
            throw throwable2;
        }
    }

    public final void b(Bundle object, k k2) {
        object = this.a;
        Object[] objectArray = new Object[]{};
        String string2 = "clearAssetPackStorage AIDL call";
        ((o)object).a(string2, objectArray);
        object = this.b;
        boolean bl2 = ai.b((Context)object);
        if (bl2 && (bl2 = ai.a((Context)(object = this.b)))) {
            this.c.z();
            object = new Bundle();
            k2.c((Bundle)object);
            return;
        }
        object = new Bundle();
        k2.d((Bundle)object);
    }

    public final void c(Bundle bundle, k k2) {
        this.d(bundle, k2);
    }
}

