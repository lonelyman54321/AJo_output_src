/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.google.android.play.core.assetpacks.a;
import com.google.android.play.core.assetpacks.cm;
import com.google.android.play.core.assetpacks.internal.ag;
import com.google.android.play.core.assetpacks.p;

public final class d {
    private static a a;

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static a a(Context object) {
        Class<d> clazz = d.class;
        synchronized (clazz) {
            try {
                Object object2 = a;
                if (object2 != null) return a;
                p p2 = null;
                object2 = new cm(null);
                object = ag.a(object);
                p2 = new p((Context)object);
                ((cm)object2).b(p2);
                object = ((cm)object2).a();
                a = object;
                return a;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

