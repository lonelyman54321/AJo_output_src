/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.firebase.appindexing;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.firebase.appindexing.Action;
import com.google.firebase.appindexing.internal.zzt;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public abstract class FirebaseUserActions {
    public static final String APP_INDEXING_API_TAG = "FirebaseUserActions";
    private static WeakReference zza;

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static FirebaseUserActions getInstance(Context object) {
        Class<FirebaseUserActions> clazz = FirebaseUserActions.class;
        synchronized (clazz) {
            Throwable throwable2;
            block7: {
                Object object2;
                try {
                    Preconditions.checkNotNull(object);
                    object2 = zza;
                    if (object2 == null) {
                        object2 = null;
                    } else {
                        object2 = ((Reference)object2).get();
                        object2 = (FirebaseUserActions)object2;
                    }
                    if (object2 == null) {
                        object = object.getApplicationContext();
                        object2 = new zzt((Context)object);
                        object = new WeakReference(object2);
                        zza = object;
                        return object2;
                    }
                }
                catch (Throwable throwable2) {
                    break block7;
                }
                return object2;
            }
            throw throwable2;
        }
    }

    public abstract Task end(Action var1);

    public abstract Task start(Action var1);
}

