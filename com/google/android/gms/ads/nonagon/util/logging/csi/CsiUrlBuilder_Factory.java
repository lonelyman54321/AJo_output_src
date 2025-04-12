/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.nonagon.util.logging.csi;

import com.google.android.gms.ads.nonagon.util.logging.csi.CsiUrlBuilder;
import com.google.android.gms.ads.nonagon.util.logging.csi.zza;
import com.google.android.gms.internal.ads.zzhkp;

public final class CsiUrlBuilder_Factory
implements zzhkp {
    public static CsiUrlBuilder_Factory create() {
        return zza.zza();
    }

    public static CsiUrlBuilder newInstance() {
        CsiUrlBuilder csiUrlBuilder = new CsiUrlBuilder();
        return csiUrlBuilder;
    }

    public CsiUrlBuilder get() {
        return CsiUrlBuilder_Factory.newInstance();
    }
}

