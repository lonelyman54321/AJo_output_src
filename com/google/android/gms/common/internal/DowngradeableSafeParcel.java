/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.internal;

import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public abstract class DowngradeableSafeParcel
extends AbstractSafeParcelable
implements ReflectedParcelable {
    private static final Object zza;
    private boolean zzb = false;

    static {
        Object object;
        zza = object = new Object();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static boolean canUnparcelSafely(String object) {
        object = zza;
        // MONITORENTER : object
        // MONITOREXIT : object
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static Integer getUnparcelClientVersion() {
        Object object = zza;
        // MONITORENTER : object
        // MONITOREXIT : object
        return null;
    }

    public abstract boolean prepareForClientVersion(int var1);

    public void setShouldDowngrade(boolean bl2) {
        this.zzb = bl2;
    }

    public boolean shouldDowngrade() {
        return this.zzb;
    }
}

