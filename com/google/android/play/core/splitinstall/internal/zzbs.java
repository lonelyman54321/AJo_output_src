/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.os.Build$VERSION
 *  android.os.LocaleList
 */
package com.google.android.play.core.splitinstall.internal;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public final class zzbs {
    private final Context zza;

    public zzbs(Context context) {
        this.zza = context;
    }

    private static String zzb(Locale object) {
        String string2 = ((Locale)object).getLanguage();
        String string3 = ((Locale)object).getCountry();
        boolean bl2 = string3.isEmpty();
        if (bl2) {
            object = "";
        } else {
            object = String.valueOf(((Locale)object).getCountry());
            string3 = "_";
            object = string3.concat((String)object);
        }
        return String.valueOf(string2).concat((String)object);
    }

    public final List zza() {
        Configuration configuration = this.zza.getResources().getConfiguration();
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 24;
        if (n3 >= n4) {
            int n7;
            configuration = Zm.b(configuration);
            n4 = Xh.a((LocaleList)configuration);
            ArrayList<String> arrayList = new ArrayList<String>(n4);
            for (n4 = 0; n4 < (n7 = Xh.a((LocaleList)configuration)); ++n4) {
                String string2 = zzbs.zzb(Yh.a((LocaleList)configuration, n4));
                arrayList.add(string2);
            }
            return arrayList;
        }
        return Collections.singletonList(zzbs.zzb(configuration.locale));
    }
}

