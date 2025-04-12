/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhh;
import com.google.android.gms.internal.ads.zzhv;
import java.io.IOException;
import java.util.Map;

public final class zzhx
extends zzhv {
    public final int zzd;
    public final String zze;
    public final Map zzf;
    public final byte[] zzg;

    public zzhx(int n3, String string2, IOException iOException, Map map2, zzhh zzhh2, byte[] byArray) {
        String string3 = hj0_0.a(n3, "Response code: ");
        super(string3, iOException, zzhh2, 2004, 1);
        this.zzd = n3;
        this.zze = string2;
        this.zzf = map2;
        this.zzg = byArray;
    }
}

