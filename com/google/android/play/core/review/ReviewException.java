/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.review;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.play.core.review.model.zza;
import java.util.Locale;

public class ReviewException
extends ApiException {
    public ReviewException(int n3) {
        Object object = Locale.getDefault();
        Integer n4 = n3;
        String string2 = zza.zza(n3);
        Object[] objectArray = new Object[]{n4, string2};
        object = String.format((Locale)object, "Review Error(%d): %s", objectArray);
        Status status = new Status(n3, (String)object);
        super(status);
    }

    public int getErrorCode() {
        return super.getStatusCode();
    }
}

