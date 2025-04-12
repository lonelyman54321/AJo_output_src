/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.identifier;

public final class AdvertisingIdClient$Info {
    private final String zza;
    private final boolean zzb;

    public AdvertisingIdClient$Info(String string2, boolean bl2) {
        this.zza = string2;
        this.zzb = bl2;
    }

    public String getId() {
        return this.zza;
    }

    public boolean isLimitAdTrackingEnabled() {
        return this.zzb;
    }

    public String toString() {
        String string2 = this.zza;
        boolean bl2 = this.zzb;
        int n3 = String.valueOf(string2).length();
        StringBuilder stringBuilder = new StringBuilder(n3 += 7);
        stringBuilder.append("{");
        stringBuilder.append(string2);
        stringBuilder.append("}");
        stringBuilder.append(bl2);
        return stringBuilder.toString();
    }
}

