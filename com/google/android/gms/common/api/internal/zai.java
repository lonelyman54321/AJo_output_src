/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 */
package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zaad;
import com.google.android.gms.common.api.internal.zabq;

public abstract class zai {
    public final int zac;

    public zai(int n3) {
        this.zac = n3;
    }

    public static /* bridge */ /* synthetic */ Status zah(RemoteException object) {
        Object object2 = new StringBuilder();
        String string2 = ((Object)object).getClass().getSimpleName();
        ((StringBuilder)object2).append(string2);
        ((StringBuilder)object2).append(": ");
        object = object.getLocalizedMessage();
        ((StringBuilder)object2).append((String)object);
        object = ((StringBuilder)object2).toString();
        object2 = new Status(19, (String)object);
        return object2;
    }

    public abstract void zad(Status var1);

    public abstract void zae(Exception var1);

    public abstract void zaf(zabq var1);

    public abstract void zag(zaad var1, boolean var2);
}

