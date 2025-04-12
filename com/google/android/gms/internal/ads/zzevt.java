/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.pm.PackageInfo
 *  android.os.Bundle
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbhk;
import com.google.android.gms.internal.ads.zzbnz;
import com.google.android.gms.internal.ads.zzevp;
import com.google.android.gms.internal.ads.zzevq;
import com.google.android.gms.internal.ads.zzevr;
import com.google.android.gms.internal.ads.zzevs;
import com.google.android.gms.internal.ads.zzevu;
import com.google.android.gms.internal.ads.zzexw;
import com.google.android.gms.internal.ads.zzfho;
import com.google.android.gms.internal.ads.zzgge;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;

public final class zzevt
implements zzexw {
    private final zzgge zza;
    private final zzfho zzb;
    private final PackageInfo zzc;
    private final zzg zzd;

    public zzevt(zzgge zzgge2, zzfho zzfho2, PackageInfo packageInfo, zzg zzg2) {
        this.zza = zzgge2;
        this.zzb = zzfho2;
        this.zzc = packageInfo;
        this.zzd = zzg2;
    }

    public static /* synthetic */ zzevu zzc(zzevt object) {
        ArrayList arrayList = ((zzevt)object).zzb.zzg;
        if (arrayList == null) {
            object = new zzevq();
        } else {
            boolean bl2 = arrayList.isEmpty();
            if (bl2) {
                object = new zzevr();
            } else {
                zzevs zzevs2 = new zzevs((zzevt)object, arrayList);
                object = zzevs2;
            }
        }
        return object;
    }

    public final int zza() {
        return 26;
    }

    public final ListenableFuture zzb() {
        zzevp zzevp2 = new zzevp(this);
        return this.zza.zzb(zzevp2);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final /* synthetic */ void zzd(ArrayList object, Bundle bundle) {
        String string2;
        int n3;
        Object object2;
        block17: {
            block22: {
                block18: {
                    String string3;
                    block20: {
                        String string4;
                        block21: {
                            int n4;
                            block19: {
                                boolean bl2;
                                void var4_14;
                                boolean bl3;
                                int n7 = 3;
                                bundle.putInt("native_version", n7);
                                bundle.putStringArrayList("native_templates", (ArrayList)object);
                                object = this.zzb.zzh;
                                bundle.putStringArrayList("native_custom_templates", (ArrayList)object);
                                object = this.zzb.zzi;
                                int n8 = ((zzbhk)object).zza;
                                object2 = "any";
                                string3 = "landscape";
                                string4 = "portrait";
                                String string5 = "unknown";
                                n4 = 2;
                                n3 = 1;
                                if (n8 > n7) {
                                    int n10;
                                    bundle.putBoolean("enable_native_media_orientation", n3 != 0);
                                    object = this.zzb.zzi;
                                    int n14 = ((zzbhk)object).zzh;
                                    object = n14 != n3 ? (n14 != n4 ? (n14 != n7 ? (n14 != (n10 = 4) ? string5 : "square") : string4) : string3) : object2;
                                    n10 = string5.equals(object);
                                    if (n10 == 0) {
                                        String string6 = "native_media_orientation";
                                        bundle.putString(string6, (String)object);
                                    }
                                }
                                object = this.zzb.zzi;
                                int n15 = ((zzbhk)object).zzc;
                                if (n15 != 0) {
                                    object2 = n15 != n3 ? (n15 != n4 ? string5 : string3) : string4;
                                }
                                if (!(bl3 = string5.equals(object2))) {
                                    object = "native_image_orientation";
                                    bundle.putString((String)object, (String)object2);
                                }
                                boolean bl4 = this.zzb.zzi.zzd;
                                bundle.putBoolean("native_multiple_images", bl4);
                                object = this.zzb.zzi;
                                object2 = "use_custom_mute";
                                boolean bl5 = ((zzbhk)object).zzg;
                                bundle.putBoolean((String)object2, bl5);
                                object = this.zzb.zzi;
                                int n16 = ((zzbhk)object).zzi;
                                if (n16 != 0) {
                                    boolean bl6 = ((zzbhk)object).zzj;
                                    bundle.putBoolean("sccg_tap", bl6);
                                    object = this.zzb.zzi;
                                    object2 = "sccg_dir";
                                    int n17 = ((zzbhk)object).zzi;
                                    bundle.putInt((String)object2, n17);
                                }
                                if ((object = this.zzc) == null) {
                                    boolean bl7 = false;
                                    object = null;
                                } else {
                                    int n18 = ((PackageInfo)object).versionCode;
                                }
                                object2 = this.zzd;
                                int n19 = object2.zza();
                                if (var4_14 > n19) {
                                    this.zzd.zzt();
                                    object2 = this.zzd;
                                    object2.zzw((int)var4_14);
                                }
                                object = this.zzd.zzq();
                                boolean bl8 = false;
                                object2 = null;
                                if (object != null && (object = object.optJSONArray(string3 = this.zzb.zzf)) != null) {
                                    object2 = object.toString();
                                }
                                if (!(bl2 = TextUtils.isEmpty((CharSequence)object2))) {
                                    object = "native_advanced_settings";
                                    bundle.putString((String)object, (String)object2);
                                }
                                object = this.zzb;
                                int n20 = ((zzfho)object).zzk;
                                if (n20 > n3) {
                                    object2 = "max_num_ads";
                                    bundle.putInt((String)object2, n20);
                                }
                                if ((object = this.zzb.zzb) == null) break block17;
                                object2 = ((zzbnz)object).zzc;
                                boolean bl9 = TextUtils.isEmpty((CharSequence)object2);
                                if (!bl9) break block18;
                                int n21 = ((zzbnz)object).zza;
                                string3 = "p";
                                string4 = "l";
                                if (n21 < n4) break block19;
                                int n22 = ((zzbnz)object).zzd;
                                if (n22 != n4 && n22 == n7) break block20;
                                break block21;
                            }
                            int n24 = ((zzbnz)object).zzb;
                            if (n24 == n3) break block21;
                            if (n24 == n4) break block20;
                            string2 = "Instream ad video aspect ratio ";
                            object2 = new StringBuilder(string2);
                            ((StringBuilder)object2).append(n24);
                            ((StringBuilder)object2).append(" is wrong.");
                            object = ((StringBuilder)object2).toString();
                            zzm.zzg((String)object);
                        }
                        string3 = string4;
                    }
                    object = "ia_var";
                    bundle.putString((String)object, string3);
                    break block22;
                }
                object = ((zzbnz)object).zzc;
                object2 = "ad_tag";
                bundle.putString((String)object2, (String)object);
            }
            object = "instr";
            bundle.putBoolean((String)object, n3 != 0);
        }
        if ((object = this.zzb.zza()) != null) {
            object = "has_delayed_banner_listener";
            bundle.putBoolean((String)object, n3 != 0);
        }
        object = zzbep.zzlO;
        object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        boolean bl10 = (Boolean)object;
        if (bl10) {
            object = this.zzb.zzi.zzf;
            if (object != null) {
                object = new Bundle();
                boolean bl11 = this.zzb.zzi.zzf.zza;
                object.putBoolean("startMuted", bl11);
                boolean bl12 = this.zzb.zzi.zzf.zzc;
                object.putBoolean("clickToExpandRequested", bl12);
                boolean bl13 = this.zzb.zzi.zzf.zzb;
                string2 = "customControlsRequested";
                object.putBoolean(string2, bl13);
                object2 = "video";
                bundle.putBundle((String)object2, (Bundle)object);
            }
            boolean bl14 = this.zzb.zzi.zzb;
            bundle.putBoolean("disable_image_loading", bl14);
            object = this.zzb.zzi;
            object2 = "preferred_ad_choices_position";
            int n25 = ((zzbhk)object).zze;
            bundle.putInt((String)object2, n25);
        }
    }
}

