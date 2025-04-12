/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.internal.ads.zzfoq;
import com.google.android.gms.internal.ads.zzfph;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class zzfpi {
    private static final Pattern zza = Pattern.compile("^[a-zA-Z0-9 ]+$");
    private final List zzb;

    public zzfpi() {
        ArrayList arrayList;
        this.zzb = arrayList = new ArrayList();
    }

    public final List zza() {
        return this.zzb;
    }

    public final void zzb(View object, zzfoq zzfoq2, String object2) {
        if (object != null) {
            object2 = zza;
            String string2 = "Ad overlay";
            boolean bl2 = ((Matcher)(object2 = ((Pattern)object2).matcher(string2))).matches();
            if (bl2) {
                zzfph zzfph2;
                block4: {
                    boolean bl3;
                    object2 = this.zzb.iterator();
                    while (bl3 = object2.hasNext()) {
                        zzfph2 = (zzfph)object2.next();
                        Object t3 = zzfph2.zzb().get();
                        if (t3 != object) continue;
                        break block4;
                    }
                    bl3 = false;
                    zzfph2 = null;
                }
                if (zzfph2 == null) {
                    object2 = this.zzb;
                    zzfph2 = new zzfph((View)object, zzfoq2, string2);
                    object2.add(zzfph2);
                }
                return;
            }
            object = new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            throw object;
        }
        object = new IllegalArgumentException("FriendlyObstruction is null");
        throw object;
    }

    public final void zzc() {
        this.zzb.clear();
    }
}

