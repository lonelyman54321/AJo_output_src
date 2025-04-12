/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.install;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.play.core.install.model.zza;
import java.util.Locale;

public class InstallException
extends ApiException {
    public InstallException(int n3) {
        Object object = Locale.getDefault();
        Object object2 = n3;
        String string2 = zza.zza(n3);
        int n4 = 2;
        Object[] objectArray = new Object[n4];
        objectArray[0] = object2;
        int n7 = 1;
        objectArray[n7] = string2;
        object2 = "Install Error(%d): %s";
        object = String.format((Locale)object, (String)object2, objectArray);
        Status status = new Status(n3, (String)object);
        super(status);
        if (n3 != 0) {
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("errorCode should not be 0.");
        throw illegalArgumentException;
    }

    public int getErrorCode() {
        return super.getStatusCode();
    }
}

