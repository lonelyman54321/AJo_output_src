/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

public final class zzfje
implements Cloneable {
    public boolean zza;
    public boolean zzb;

    public final zzfje zza() {
        Object object;
        try {
            object = super.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            object = new AssertionError();
            throw object;
        }
        return (zzfje)object;
    }
}

