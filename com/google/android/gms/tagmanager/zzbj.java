/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.tagmanager;

import com.google.android.gms.tagmanager.CustomTagProvider;
import com.google.android.gms.tagmanager.CustomVariableProvider;
import com.google.android.gms.tagmanager.zzbk;
import com.google.android.gms.tagmanager.zzca;
import java.util.Map;

final class zzbj
extends zzca {
    public final String zzb(String string2, Map map2) {
        Object object = zzbk.zzd();
        boolean bl2 = object.containsKey(string2);
        if (!bl2) {
            object = (CustomVariableProvider)zzbk.zzb(string2, CustomVariableProvider.class);
            Map map3 = zzbk.zzd();
            map3.put(string2, object);
        } else {
            string2 = zzbk.zzd().get(string2);
            object = string2;
            object = (CustomVariableProvider)((Object)string2);
        }
        if (object != null) {
            return object.getValue(map2);
        }
        return null;
    }

    public final void zzc(String string2, Map map2) {
        Object object = zzbk.zzc();
        boolean bl2 = object.containsKey(string2);
        if (!bl2) {
            object = (CustomTagProvider)zzbk.zzb(string2, CustomTagProvider.class);
            Map map3 = zzbk.zzc();
            map3.put(string2, object);
        } else {
            string2 = zzbk.zzc().get(string2);
            object = string2;
            object = (CustomTagProvider)((Object)string2);
        }
        if (object != null) {
            object.execute(map2);
        }
    }
}

