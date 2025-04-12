/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzfxm;
import com.google.android.gms.internal.ads.zzfyh;

public final class zzht
implements zzfyh {
    public final boolean zza(Object object) {
        boolean bl2;
        String string2;
        boolean bl3;
        return (object = (String)object) != null && !(bl3 = TextUtils.isEmpty((CharSequence)(object = zzfxm.zza((String)object)))) && (!(bl3 = ((String)object).contains(string2 = "text")) || (bl3 = ((String)object).contains(string2 = "text/vtt"))) && !(bl3 = ((String)object).contains(string2 = "html")) && !(bl2 = ((String)object).contains(string2 = "xml"));
    }
}

