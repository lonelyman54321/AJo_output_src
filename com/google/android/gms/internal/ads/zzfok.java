/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfoo;
import com.google.android.gms.internal.ads.zzfor;
import com.google.android.gms.internal.ads.zzfov;
import com.google.android.gms.internal.ads.zzfpy;
import com.google.android.gms.internal.ads.zzfqd;
import org.json.JSONObject;

public final class zzfok {
    private final zzfov zza;
    private final zzfov zzb;
    private final boolean zzc;
    private final zzfoo zzd;
    private final zzfor zze;

    private zzfok(zzfoo enum_, zzfor zzfor2, zzfov zzfov2, zzfov zzfov3, boolean bl2) {
        this.zzd = enum_;
        this.zze = zzfor2;
        this.zza = zzfov2;
        this.zzb = zzfov3 == null ? (enum_ = zzfov.zzc) : zzfov3;
        this.zzc = bl2;
    }

    public static zzfok zza(zzfoo object, zzfor zzfor2, zzfov zzfov2, zzfov zzfov3, boolean bl2) {
        zzfqd.zzc(object, "CreativeType is null");
        zzfqd.zzc((Object)zzfor2, "ImpressionType is null");
        zzfqd.zzc((Object)zzfov2, "Impression owner is null");
        Object object2 = zzfov.zzc;
        if (zzfov2 != object2) {
            object2 = zzfoo.zza;
            String string2 = "ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript";
            if (object == object2 && zzfov2 == (object2 = zzfov.zza)) {
                object = new IllegalArgumentException(string2);
                throw object;
            }
            object2 = zzfor.zza;
            if (zzfor2 == object2 && zzfov2 == (object2 = zzfov.zza)) {
                object = new IllegalArgumentException(string2);
                throw object;
            }
            object2 = new zzfok((zzfoo)((Object)object), zzfor2, zzfov2, zzfov3, bl2);
            return object2;
        }
        object = new IllegalArgumentException("Impression owner is none");
        throw object;
    }

    public final JSONObject zzb() {
        JSONObject jSONObject = new JSONObject();
        Enum enum_ = this.zza;
        zzfpy.zze(jSONObject, "impressionOwner", enum_);
        enum_ = this.zzb;
        zzfpy.zze(jSONObject, "mediaEventsOwner", enum_);
        enum_ = this.zzd;
        zzfpy.zze(jSONObject, "creativeType", enum_);
        enum_ = this.zze;
        zzfpy.zze(jSONObject, "impressionType", enum_);
        Boolean bl2 = this.zzc;
        zzfpy.zze(jSONObject, "isolateVerificationScripts", bl2);
        return jSONObject;
    }
}

