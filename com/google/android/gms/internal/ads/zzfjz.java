/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

public final class zzfjz
implements Cloneable {
    public boolean zza;
    public int zzb;

    public final zzfjz zza() {
        Object object;
        try {
            object = super.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            object = new AssertionError();
            throw object;
        }
        return (zzfjz)object;
    }
}

