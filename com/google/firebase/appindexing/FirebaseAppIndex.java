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
import com.google.firebase.appindexing.Indexable;
import com.google.firebase.appindexing.internal.zzp;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public abstract class FirebaseAppIndex {
    public static final String ACTION_UPDATE_INDEX = "com.google.firebase.appindexing.UPDATE_INDEX";
    public static final String APP_INDEXING_API_TAG = "FirebaseAppIndex";
    public static final String EXTRA_UPDATE_INDEX_REASON = "com.google.firebase.appindexing.extra.REASON";
    public static final int EXTRA_UPDATE_INDEX_REASON_REBUILD = 1;
    public static final int EXTRA_UPDATE_INDEX_REASON_REFRESH = 2;
    private static WeakReference zza;

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static FirebaseAppIndex getInstance(Context object) {
        Class<FirebaseAppIndex> clazz = FirebaseAppIndex.class;
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
                        object2 = (FirebaseAppIndex)object2;
                    }
                    if (object2 == null) {
                        object = object.getApplicationContext();
                        object2 = new zzp((Context)object);
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

    public abstract Task remove(String ... var1);

    public abstract Task removeAll();

    public abstract Task update(Indexable ... var1);
}

