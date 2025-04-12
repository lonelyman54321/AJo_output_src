/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.Resources$NotFoundException
 *  android.text.TextUtils
 */
package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.R$string;
import com.google.android.gms.common.internal.Preconditions;

public final class zzhw {
    private final Resources zza;
    private final String zzb;

    public zzhw(Context object, String string2) {
        Resources resources;
        Preconditions.checkNotNull(object);
        this.zza = resources = object.getResources();
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (!bl2) {
            this.zzb = string2;
            return;
        }
        object = zzhw.zza(object);
        this.zzb = object;
    }

    public static String zza(Context object) {
        Resources resources = object.getResources();
        int n3 = R$string.common_google_play_services_unknown_issue;
        try {
            object = resources.getResourcePackageName(n3);
        }
        catch (Resources.NotFoundException notFoundException) {
            object = object.getPackageName();
        }
        return object;
    }

    public final String zza(String string2) {
        Resources resources = this.zza;
        String string3 = "string";
        String string4 = this.zzb;
        int n3 = resources.getIdentifier(string2, string3, string4);
        resources = null;
        if (n3 == 0) {
            return null;
        }
        try {
            string3 = this.zza;
        }
        catch (Resources.NotFoundException notFoundException) {
            return null;
        }
        return string3.getString(n3);
    }
}

