/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzadu;
import com.google.android.gms.internal.ads.zzaea;
import com.google.android.gms.internal.ads.zzaiy;
import com.google.android.gms.internal.ads.zzakd;
import com.google.android.gms.internal.ads.zzakj;
import com.google.android.gms.internal.ads.zzalt;
import com.google.android.gms.internal.ads.zzgbc;
import java.util.Map;

public final class zzcgp
implements zzaea {
    public final /* synthetic */ zzadu[] zza(Uri object, Map object2) {
        zzadu[] zzaduArray;
        object = new zzakj();
        object2 = new zzaiy();
        zzalt zzalt2 = zzalt.zza;
        zzgbc zzgbc2 = zzgbc.zzm();
        zzadu[] zzaduArray2 = zzaduArray;
        zzaduArray = new zzakd(zzalt2, 32, null, null, zzgbc2, null);
        zzaduArray2 = new zzadu[]{object, object2, zzaduArray};
        return zzaduArray2;
    }
}

