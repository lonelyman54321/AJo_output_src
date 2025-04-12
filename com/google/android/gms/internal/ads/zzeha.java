/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.webkit.WebView
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzchs;
import com.google.android.gms.internal.ads.zzego;
import com.google.android.gms.internal.ads.zzegp;
import com.google.android.gms.internal.ads.zzegq;
import com.google.android.gms.internal.ads.zzegr;
import com.google.android.gms.internal.ads.zzegs;
import com.google.android.gms.internal.ads.zzegt;
import com.google.android.gms.internal.ads.zzegu;
import com.google.android.gms.internal.ads.zzegv;
import com.google.android.gms.internal.ads.zzegw;
import com.google.android.gms.internal.ads.zzegx;
import com.google.android.gms.internal.ads.zzegy;
import com.google.android.gms.internal.ads.zzegz;
import com.google.android.gms.internal.ads.zzehb;
import com.google.android.gms.internal.ads.zzehc;
import com.google.android.gms.internal.ads.zzehd;
import com.google.android.gms.internal.ads.zzehg;
import com.google.android.gms.internal.ads.zzfoh;
import com.google.android.gms.internal.ads.zzfoj;
import com.google.android.gms.internal.ads.zzfok;
import com.google.android.gms.internal.ads.zzfol;
import com.google.android.gms.internal.ads.zzfoo;
import com.google.android.gms.internal.ads.zzfor;
import com.google.android.gms.internal.ads.zzfou;
import com.google.android.gms.internal.ads.zzfov;
import com.google.android.gms.internal.ads.zzfow;
import java.util.Objects;

public final class zzeha
implements zzehb {
    public static /* synthetic */ zzehg zzc(String object, String object2, String object3, zzehc enum_, String object4, WebView webView, String string2, String object5, zzehd zzehd2) {
        object = zzfow.zza("Google", object2);
        object2 = zzeha.zzp("javascript");
        object3 = zzeha.zzn(((zzehc)enum_).toString());
        object5 = zzfov.zzc;
        if (object2 == object5) {
            zzm.zzj("Omid html session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (object3 == null) {
            object = String.valueOf(enum_);
            zzm.zzj("Omid html session error; Unable to parse creative type: ".concat((String)object));
            return null;
        }
        enum_ = zzeha.zzp(object4);
        zzfoo zzfoo2 = zzfoo.zzd;
        if (object3 == zzfoo2 && enum_ == object5) {
            object = String.valueOf(object4);
            zzm.zzj("Omid html session error; Video events owner unknown for video creative: ".concat((String)object));
            return null;
        }
        object = zzfol.zzb((zzfow)object, webView, string2, "");
        object4 = zzeha.zzo(zzehd2.toString());
        object2 = zzfoj.zza(zzfok.zza((zzfoo)((Object)object3), (zzfor)((Object)object4), (zzfov)((Object)object2), (zzfov)enum_, true), (zzfol)object);
        object3 = new zzehg((zzfoj)object2, (zzfol)object);
        return object3;
    }

    public static /* synthetic */ zzehg zzd(String object, String object2, String object3, String object4, zzehc enum_, WebView webView, String string2, String object5, zzehd zzehd2) {
        object = zzfow.zza((String)object, object2);
        object2 = zzeha.zzp("javascript");
        object3 = zzeha.zzp(object4);
        object5 = zzeha.zzn(((zzehc)enum_).toString());
        zzfov zzfov2 = zzfov.zzc;
        if (object2 == zzfov2) {
            zzm.zzj("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (object5 == null) {
            object = String.valueOf(enum_);
            zzm.zzj("Omid js session error; Unable to parse creative type: ".concat((String)object));
            return null;
        }
        enum_ = zzfoo.zzd;
        if (object5 == enum_ && object3 == zzfov2) {
            object = String.valueOf(object4);
            zzm.zzj("Omid js session error; Video events owner unknown for video creative: ".concat((String)object));
            return null;
        }
        object = zzfol.zzc((zzfow)object, webView, string2, "");
        object4 = zzeha.zzo(zzehd2.toString());
        object2 = zzfoj.zza(zzfok.zza((zzfoo)((Object)object5), (zzfor)((Object)object4), (zzfov)((Object)object2), (zzfov)((Object)object3), true), (zzfol)object);
        object3 = new zzehg((zzfoj)object2, (zzfol)object);
        return object3;
    }

    /*
     * Unable to fully structure code
     */
    private static zzfoo zzn(String var0) {
        block7: {
            block5: {
                block6: {
                    var1_1 = var0.hashCode();
                    var2_2 = -382745961;
                    var3_3 = 2;
                    var4_4 = 1;
                    if (var1_1 == var2_2) break block5;
                    var2_2 = 112202875;
                    if (var1_1 == var2_2) break block6;
                    var2_2 = 714893483;
                    if (var1_1 != var2_2 || (var6_8 = (int)var0.equals(var5_5 = "nativeDisplay")) == 0) ** GOTO lbl-1000
                    var6_8 = 1;
                    break block7;
                }
                var5_6 = "video";
                var6_8 = (int)var0.equals(var5_6);
                if (var6_8 == 0) ** GOTO lbl-1000
                var6_8 = 2;
                break block7;
            }
            var5_7 = "htmlDisplay";
            var6_8 = var0.equals(var5_7);
            if (var6_8 != 0) {
                var6_8 = 0;
                var0 = null;
            } else lbl-1000:
            // 3 sources

            {
                var6_8 = -1;
            }
        }
        if (var6_8 != 0) {
            if (var6_8 != var4_4) {
                if (var6_8 != var3_3) {
                    return null;
                }
                return zzfoo.zzd;
            }
            return zzfoo.zzc;
        }
        return zzfoo.zzb;
    }

    /*
     * Unable to fully structure code
     */
    private static zzfor zzo(String var0) {
        block7: {
            block5: {
                block6: {
                    var1_1 = var0.hashCode();
                    var2_2 = -1104128070;
                    var3_3 = 1;
                    var4_4 = 2;
                    if (var1_1 == var2_2) break block5;
                    var2_2 = 1318088141;
                    if (var1_1 == var2_2) break block6;
                    var2_2 = 1988248512;
                    if (var1_1 != var2_2 || (var6_8 = (int)var0.equals(var5_5 = "onePixel")) == 0) ** GOTO lbl-1000
                    var6_8 = 2;
                    break block7;
                }
                var5_6 = "definedByJavascript";
                var6_8 = (int)var0.equals(var5_6);
                if (var6_8 == 0) ** GOTO lbl-1000
                var6_8 = 1;
                break block7;
            }
            var5_7 = "beginToRender";
            var6_8 = var0.equals(var5_7);
            if (var6_8 != 0) {
                var6_8 = 0;
                var0 = null;
            } else lbl-1000:
            // 3 sources

            {
                var6_8 = -1;
            }
        }
        if (var6_8 != 0) {
            if (var6_8 != var3_3) {
                if (var6_8 != var4_4) {
                    return zzfor.zzb;
                }
                return zzfor.zze;
            }
            return zzfor.zza;
        }
        return zzfor.zzd;
    }

    private static zzfov zzp(String string2) {
        String string3 = "native";
        boolean bl2 = string3.equals(string2);
        if (bl2) {
            return zzfov.zza;
        }
        string3 = "javascript";
        boolean bl3 = string3.equals(string2);
        if (bl3) {
            return zzfov.zzb;
        }
        return zzfov.zzc;
    }

    private static final Object zzq(zzegz zzegz2) {
        try {
            return zzegz2.zza();
        }
        catch (RuntimeException runtimeException) {
            zzu.zzo().zzv(runtimeException, "omid exception");
            return null;
        }
    }

    private static final void zzr(Runnable runnable2) {
        try {
            runnable2.run();
            return;
        }
        catch (RuntimeException runtimeException) {
            zzu.zzo().zzv(runtimeException, "omid exception");
            return;
        }
    }

    public final zzehg zza(String string2, WebView webView, String string3, String string4, String string5, zzehd zzehd2, zzehc zzehc2, String string6) {
        Object object = zzbep.zzeZ;
        Object object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (bl2 && (bl2 = zzfoh.zzb())) {
            object2 = object;
            object = new zzegp("Google", string2, "javascript", zzehc2, string5, webView, string6, "", zzehd2);
            return (zzehg)zzeha.zzq((zzegz)object);
        }
        return null;
    }

    public final zzehg zzb(String string2, WebView webView, String string3, String string4, String string5, String string6, zzehd zzehd2, zzehc zzehc2, String string7) {
        Object object = zzbep.zzeZ;
        Object object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (bl2 && (bl2 = zzfoh.zzb())) {
            object2 = object;
            object = new zzegs(string6, string2, "javascript", string5, zzehc2, webView, string7, "", zzehd2);
            return (zzehg)zzeha.zzq((zzegz)object);
        }
        return null;
    }

    public final zzfou zze(VersionInfoParcel versionInfoParcel, WebView webView, boolean bl2) {
        zzegx zzegx2 = new zzegx(versionInfoParcel, webView, true);
        return (zzfou)zzeha.zzq(zzegx2);
    }

    public final String zzf(Context object) {
        object = zzbep.zzeZ;
        zzben zzben2 = zzba.zzc();
        object = (Boolean)zzben2.zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (!bl2) {
            return null;
        }
        object = new zzegv();
        return (String)zzeha.zzq((zzegz)object);
    }

    public final void zzg(zzfoj zzfoj2, View view) {
        zzego zzego2 = new zzego(zzfoj2, view);
        zzeha.zzr(zzego2);
    }

    public final void zzh(zzfou zzfou2, View view) {
        zzegu zzegu2 = new zzegu(zzfou2, view);
        zzeha.zzr(zzegu2);
    }

    public final void zzi(zzfoj zzfoj2) {
        zzegy zzegy2 = new zzegy(zzfoj2);
        zzeha.zzr(zzegy2);
    }

    public final void zzj(zzfoj zzfoj2, View view) {
        zzegq zzegq2 = new zzegq(zzfoj2, view);
        zzeha.zzr(zzegq2);
    }

    public final void zzk(zzfoj zzfoj2) {
        Object object = zzbep.zzeZ;
        zzben zzben2 = zzba.zzc();
        object = (Boolean)zzben2.zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (bl2 && (bl2 = zzfoh.zzb())) {
            Objects.requireNonNull(zzfoj2);
            object = new zzegr(zzfoj2);
            zzeha.zzr((Runnable)object);
        }
    }

    public final boolean zzl(Context object) {
        boolean bl2;
        Object object2 = zzbep.zzeZ;
        object2 = (Boolean)zzba.zzc().zza((zzbeg)object2);
        boolean bl3 = (Boolean)object2;
        if (!bl3) {
            zzm.zzj("Omid flag is disabled");
            return false;
        }
        object2 = new zzegt((Context)object);
        return (object = (Boolean)zzeha.zzq((zzegz)object2)) != null && (bl2 = ((Boolean)object).booleanValue());
    }

    public final void zzm(zzfou zzfou2, zzchs zzchs2) {
        zzegw zzegw2 = new zzegw(zzfou2, zzchs2);
        zzeha.zzr(zzegw2);
    }
}

