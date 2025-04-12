/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.firebase.appindexing.internal;

import android.content.Context;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.appindexing.FirebaseAppIndex;
import com.google.firebase.appindexing.FirebaseAppIndexingInvalidArgumentException;
import com.google.firebase.appindexing.Indexable;
import com.google.firebase.appindexing.internal.Thing;
import com.google.firebase.appindexing.internal.zzj;
import com.google.firebase.appindexing.internal.zzo;
import com.google.firebase.appindexing.internal.zzz;

public final class zzp
extends FirebaseAppIndex {
    final zzo zza;
    private final GoogleApi zzb;
    private final Context zzc;

    public zzp(Context object) {
        zzj zzj2 = new zzj((Context)object);
        this.zzb = zzj2;
        this.zzc = object;
        super(zzj2);
        this.zza = object;
    }

    public final Task remove(String ... stringArray) {
        zzz zzz2 = new zzz(3, null, stringArray, null, null, null, null);
        return this.zza.zza(zzz2);
    }

    public final Task removeAll() {
        zzz zzz2 = new zzz(4, null, null, null, null, null, null);
        return this.zza.zza(zzz2);
    }

    /*
     * Loose catch block
     */
    public final Task update(Indexable ... object) {
        Thing[] thingArray;
        if (object == null) {
            object = null;
            thingArray = null;
        } else {
            int n3 = ((Indexable[])object).length;
            Thing[] thingArray2 = new Thing[n3];
            System.arraycopy(object, 0, thingArray2, 0, n3);
            thingArray = thingArray2;
        }
        if (thingArray == null) {
            String string2 = "Indexables cannot be null.";
            object = new FirebaseAppIndexingInvalidArgumentException(string2);
            return Tasks.forException((Exception)object);
        }
        object = new zzz(1, thingArray, null, null, null, null, null);
        return this.zza.zza((zzz)object);
        catch (ArrayStoreException arrayStoreException) {
            object = new FirebaseAppIndexingInvalidArgumentException("Custom Indexable-objects are not allowed. Please use the 'Indexables'-class for creating the objects.");
            return Tasks.forException((Exception)object);
        }
    }
}

