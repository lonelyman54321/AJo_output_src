/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public final class zzfic {
    public static Bundle zza(Bundle bundle, String string2) {
        if ((bundle = bundle.getBundle(string2)) == null) {
            bundle = new Bundle();
        }
        return bundle;
    }

    public static void zzb(Bundle bundle, String string2, Bundle bundle2) {
        if (bundle2 != null) {
            bundle.putBundle(string2, bundle2);
        }
    }

    public static void zzc(Bundle bundle, String string2, String string3) {
        if (string3 != null) {
            bundle.putString(string2, string3);
        }
    }

    public static void zzd(Bundle bundle, String string2, List list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList(list);
            bundle.putStringArrayList(string2, arrayList);
        }
    }

    public static void zze(Bundle bundle, String string2, int n3, boolean bl2) {
        if (bl2) {
            bundle.putInt(string2, n3);
        }
    }

    public static void zzf(Bundle bundle, String string2, String string3, boolean bl2) {
        if (bl2 && string3 != null) {
            bundle.putString(string2, string3);
        }
    }

    public static void zzg(Bundle bundle, String string2, boolean bl2, boolean bl3) {
        if (bl3) {
            bundle.putBoolean(string2, bl2);
        }
    }
}

