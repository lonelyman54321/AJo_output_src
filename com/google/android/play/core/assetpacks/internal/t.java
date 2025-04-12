/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ServiceConnection
 */
package com.google.android.play.core.assetpacks.internal;

import android.content.ServiceConnection;
import com.google.android.play.core.assetpacks.internal.o;
import com.google.android.play.core.assetpacks.internal.p;
import com.google.android.play.core.assetpacks.internal.z;
import java.util.concurrent.atomic.AtomicInteger;

final class t
extends p {
    final /* synthetic */ z a;

    public t(z z5) {
        this.a = z5;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        Object object = z.g(this.a);
        synchronized (object) {
            Throwable throwable2;
            block6: {
                Object object2;
                Object[] objectArray;
                Object object3;
                block5: {
                    try {
                        object3 = this.a;
                        object3 = z.i((z)object3);
                        int n3 = ((AtomicInteger)object3).get();
                        objectArray = null;
                        if (n3 <= 0) break block5;
                        object3 = this.a;
                        n3 = ((AtomicInteger)(object3 = z.i((z)object3))).decrementAndGet();
                        if (n3 > 0) {
                            object3 = this.a;
                            object3 = z.f((z)object3);
                            String string2 = "Leaving the connection open for other ongoing calls.";
                            objectArray = new Object[]{};
                            ((o)object3).d(string2, objectArray);
                            return;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                }
                if ((object2 = z.d((z)(object3 = this.a))) != null) {
                    object3 = z.f((z)object3);
                    object2 = "Unbind from service.";
                    Object[] objectArray2 = new Object[]{};
                    ((o)object3).d((String)object2, objectArray2);
                    object3 = this.a;
                    object2 = z.a((z)object3);
                    object3 = z.b((z)object3);
                    object2.unbindService((ServiceConnection)object3);
                    object3 = this.a;
                    z.m((z)object3, false);
                    object3 = this.a;
                    objectArray = null;
                    z.n((z)object3, null);
                    object3 = this.a;
                    z.l((z)object3, null);
                }
                object3 = this.a;
                z.p((z)object3);
                return;
            }
            throw throwable2;
        }
    }
}

