/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.appindexing.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.appindexing.FirebaseAppIndexingException;
import com.google.firebase.appindexing.FirebaseAppIndexingInvalidArgumentException;
import com.google.firebase.appindexing.FirebaseAppIndexingTooManyArgumentsException;
import com.google.firebase.appindexing.zza;
import com.google.firebase.appindexing.zzb;

public final class zzaf {
    public static FirebaseAppIndexingException zza(Status object, String string2) {
        boolean bl2;
        Preconditions.checkNotNull(object);
        String string3 = ((Status)object).getStatusMessage();
        if (string3 != null && !(bl2 = string3.isEmpty())) {
            string2 = string3;
        }
        int n3 = ((Status)object).getStatusCode();
        switch (n3) {
            default: {
                object = new FirebaseAppIndexingException(string2);
                return object;
            }
            case 17514: {
                object = new zza(string2);
                return object;
            }
            case 17513: {
                object = new zzb(string2);
                return object;
            }
            case 17511: {
                object = new FirebaseAppIndexingTooManyArgumentsException(string2);
                return object;
            }
            case 17510: 
        }
        object = new FirebaseAppIndexingInvalidArgumentException(string2);
        return object;
    }
}

