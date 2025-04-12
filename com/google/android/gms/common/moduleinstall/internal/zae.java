/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.IInterface
 */
package com.google.android.gms.common.moduleinstall.internal;

import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;

public interface zae
extends IInterface {
    public void zab(Status var1);

    public void zac(Status var1, ModuleInstallIntentResponse var2);

    public void zad(Status var1, ModuleInstallResponse var2);

    public void zae(Status var1, ModuleAvailabilityResponse var2);
}

