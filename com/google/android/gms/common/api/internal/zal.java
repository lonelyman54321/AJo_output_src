/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Set;

public final class zal {
    private final Jp zaa;
    private final Jp zab;
    private final TaskCompletionSource zac;
    private int zad;
    private boolean zae;

    public zal(Iterable object) {
        int n3;
        Object object2 = new Jp();
        this.zab = object2;
        this.zac = object2 = new TaskCompletionSource();
        boolean bl2 = false;
        this.zae = false;
        this.zaa = object2 = new Jp();
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            object2 = (HasApiKey)object.next();
            Jp jp = this.zaa;
            object2 = object2.getApiKey();
            jp.put(object2, (Object)null);
        }
        this.zad = n3 = ((Jp$c)this.zaa.keySet()).a.c;
    }

    public final Task zaa() {
        return this.zac.getTask();
    }

    public final Set zab() {
        return this.zaa.keySet();
    }

    public final void zac(ApiKey object, ConnectionResult object2, String string2) {
        int n3;
        this.zaa.put(object, object2);
        Jp jp = this.zab;
        jp.put(object, string2);
        this.zad = n3 = this.zad + -1;
        n3 = (int)(((ConnectionResult)object2).isSuccess() ? 1 : 0);
        if (n3 == 0) {
            n3 = 1;
            this.zae = n3;
        }
        if ((n3 = this.zad) == 0) {
            n3 = (int)(this.zae ? 1 : 0);
            if (n3 != 0) {
                object = this.zaa;
                object2 = new AvailabilityException((Jp)object);
                this.zac.setException((Exception)object2);
                return;
            }
            object = this.zac;
            object2 = this.zab;
            ((TaskCompletionSource)object).setResult(object2);
        }
    }
}

