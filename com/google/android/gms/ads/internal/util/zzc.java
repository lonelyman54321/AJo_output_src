/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.internal.util.client.zzl;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzb;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

final class zzc
extends zzb {
    private final Context zza;

    public zzc(Context context) {
        this.zza = context;
    }

    public final void zza() {
        CharSequence charSequence;
        boolean bl2;
        block6: {
            Object var1_6;
            Context context = this.zza;
            try {
                bl2 = AdvertisingIdClient.getIsAdIdFakeForDebugLogging(context);
                break block6;
            }
            catch (GooglePlayServicesRepairableException googlePlayServicesRepairableException) {
            }
            catch (GooglePlayServicesNotAvailableException googlePlayServicesNotAvailableException) {
            }
            catch (IllegalStateException illegalStateException) {
            }
            catch (IOException iOException) {
                // empty catch block
            }
            charSequence = "Fail to get isAdIdFakeForDebugLogging";
            zzm.zzh((String)charSequence, var1_6);
            bl2 = false;
            var1_6 = null;
        }
        zzl.zzj(bl2);
        charSequence = new StringBuilder("Update ad debug logging enablement as ");
        ((StringBuilder)charSequence).append(bl2);
        zzm.zzj(((StringBuilder)charSequence).toString());
    }
}

