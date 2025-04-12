/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.facebook;

import android.content.Context;
import com.facebook.FacebookSdk;
import com.facebook.a;
import com.facebook.b;
import kotlin.jvm.internal.Intrinsics;

public final class b$a {
    public final b a() {
        Object object;
        block9: {
            object = b.g;
            if (object != null) break block9;
            synchronized (this) {
                Throwable throwable2;
                block10: {
                    block8: {
                        b b2;
                        try {
                            object = b.g;
                            if (object != null) break block8;
                        }
                        catch (Throwable throwable2) {}
                        object = FacebookSdk.a();
                        object = Xv1.a((Context)object);
                        Object object2 = "getInstance(applicationContext)";
                        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
                        object2 = new a();
                        b.g = b2 = new b((Xv1)object, (a)object2);
                        object = b2;
                        break block10;
                    }
                    return object;
                }
                throw throwable2;
            }
        }
        return object;
    }
}

