/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzjm;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqz;
import java.util.Locale;

public final class zzny
implements zzjm {
    public final zzqo zzd(zzhx object, zzqo ... object2) {
        boolean bl2 = false;
        object = null;
        boolean bl3 = object2 != null;
        Preconditions.checkArgument(bl3);
        int n3 = ((zzqo[])object2).length;
        if (n3 == 0) {
            bl2 = true;
        }
        Preconditions.checkArgument(bl2);
        object = Locale.getDefault();
        object2 = "";
        if (object == null) {
            object = new zzqz((String)object2);
            return object;
        }
        if ((object = ((Locale)object).getLanguage()) == null) {
            object = new zzqz((String)object2);
            return object;
        }
        object = ((String)object).toLowerCase();
        object2 = new zzqz((String)object);
        return object2;
    }
}

