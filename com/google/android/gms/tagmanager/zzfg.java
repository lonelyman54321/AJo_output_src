/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.tagmanager;

import com.google.android.gms.tagmanager.TagManager;
import com.google.android.gms.tagmanager.zzaq;
import java.util.Map;

final class zzfg
implements zzaq {
    final /* synthetic */ TagManager zza;

    public zzfg(TagManager tagManager) {
        this.zza = tagManager;
    }

    public final void zza(Map object) {
        Object object2 = "event";
        if ((object = object.get(object2)) != null) {
            object2 = this.zza;
            object = object.toString();
            TagManager.zzb((TagManager)object2, (String)object);
        }
    }
}

