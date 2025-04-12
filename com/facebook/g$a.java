/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.facebook;

import android.content.Context;
import com.facebook.FacebookSdk;
import com.facebook.g;
import kotlin.jvm.internal.Intrinsics;

public final class g$a {
    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final g a() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                Object object;
                block4: {
                    try {
                        object = g.e;
                        if (object != null) break block4;
                        object = FacebookSdk.a();
                        object = Xv1.a((Context)object);
                        Object object2 = "getInstance(applicationContext)";
                        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
                        fb2_0 fb2_02 = new fb2_0();
                        g.e = object2 = new g((Xv1)object, fb2_02);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                if ((object = g.e) != null) return object;
                object = "instance";
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
                return null;
            }
            throw throwable2;
        }
    }
}

