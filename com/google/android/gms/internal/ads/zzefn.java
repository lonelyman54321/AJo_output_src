/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 */
package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import com.google.android.gms.internal.ads.zzefr;

final class zzefn
extends zzefr {
    private final String zza;
    private final String zzb;
    private final Drawable zzc;

    public zzefn(String object, String string2, Drawable drawable2) {
        if (object != null) {
            this.zza = object;
            if (string2 != null) {
                this.zzb = string2;
                this.zzc = drawable2;
                return;
            }
            object = new NullPointerException("Null imageUrl");
            throw object;
        }
        object = new NullPointerException("Null advertiserName");
        throw object;
    }

    public final boolean equals(Object object) {
        block4: {
            boolean bl2;
            block6: {
                String string2;
                block5: {
                    String string3;
                    bl2 = true;
                    if (object == this) {
                        return bl2;
                    }
                    boolean bl3 = object instanceof zzefr;
                    if (!bl3 || !(bl3 = (string2 = this.zza).equals(string3 = ((zzefr)(object = (zzefr)object)).zzb())) || !(bl3 = (string2 = this.zzb).equals(string3 = ((zzefr)object).zzc()))) break block4;
                    string2 = this.zzc;
                    if (string2 != null) break block5;
                    if ((object = ((zzefr)object).zza()) != null) break block4;
                    break block6;
                }
                boolean bl4 = string2.equals(object = ((zzefr)object).zza());
                if (!bl4) break block4;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        String string2 = this.zza;
        int n3 = string2.hashCode();
        int n4 = 1000003;
        n3 ^= n4;
        String string3 = this.zzb;
        n3 *= n4;
        int n7 = string3.hashCode();
        n3 ^= n7;
        string3 = this.zzc;
        if (string3 == null) {
            n7 = 0;
            string3 = null;
        } else {
            n7 = string3.hashCode();
        }
        return n3 * n4 ^ n7;
    }

    public final String toString() {
        String string2 = String.valueOf(this.zzc);
        StringBuilder stringBuilder = new StringBuilder("OfflineAdAssets{advertiserName=");
        String string3 = this.zza;
        stringBuilder.append(string3);
        stringBuilder.append(", imageUrl=");
        string3 = this.zzb;
        return ko_0.a(stringBuilder, string3, ", icon=", string2, "}");
    }

    public final Drawable zza() {
        return this.zzc;
    }

    public final String zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzb;
    }
}

