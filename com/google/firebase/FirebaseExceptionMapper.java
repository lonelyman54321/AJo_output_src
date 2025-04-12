/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.firebase.FirebaseApiNotAvailableException;
import com.google.firebase.FirebaseException;

public class FirebaseExceptionMapper
implements StatusExceptionMapper {
    public final Exception getException(Status object) {
        int n3;
        int n4 = ((Status)object).getStatusCode();
        if (n4 == (n3 = 8)) {
            object = ((Status)object).zza();
            FirebaseException firebaseException = new FirebaseException((String)object);
            return firebaseException;
        }
        object = ((Status)object).zza();
        FirebaseApiNotAvailableException firebaseApiNotAvailableException = new FirebaseApiNotAvailableException((String)object);
        return firebaseApiNotAvailableException;
    }
}

