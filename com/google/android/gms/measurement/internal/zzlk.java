/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Bundle
 *  android.text.TextUtils
 */
package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzeb;
import com.google.android.gms.measurement.internal.zzai;
import com.google.android.gms.measurement.internal.zzbn;
import com.google.android.gms.measurement.internal.zzfx;
import com.google.android.gms.measurement.internal.zzgo;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzhv;
import com.google.android.gms.measurement.internal.zzju;
import com.google.android.gms.measurement.internal.zzll;
import com.google.android.gms.measurement.internal.zzln;
import com.google.android.gms.measurement.internal.zznw;
import com.google.android.gms.measurement.internal.zznx;
import com.google.android.gms.measurement.internal.zznz;
import com.google.android.gms.measurement.internal.zzpn;
import com.google.android.gms.measurement.internal.zzu;

final class zzlk
implements Application.ActivityLifecycleCallbacks,
zzll {
    private final /* synthetic */ zzju zza;

    public zzlk(zzju zzju2) {
        this.zza = zzju2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* synthetic */ void zza(zzlk zzlk2, boolean bl2, Uri object, String string2, String string3) {
        RuntimeException runtimeException2;
        block15: {
            boolean bl3;
            Object object2;
            String string4;
            String string5;
            String string6;
            String string7;
            String string8;
            String string9;
            CharSequence charSequence;
            Object object3;
            Object object4;
            String string10;
            block14: {
                block13: {
                    string10 = "gclid=";
                    object4 = "https://google.com/search?";
                    object3 = zzlk2.zza;
                    ((zzju)object3).zzv();
                    try {
                        object3 = zzlk2.zza;
                        object3 = ((zzju)object3).zzs();
                        boolean bl4 = TextUtils.isEmpty((CharSequence)string3);
                        charSequence = "_cis";
                        string9 = "Activity created with data 'referrer' without required params";
                        string8 = "utm_medium";
                        string7 = "utm_source";
                        string6 = "utm_campaign";
                        string5 = "gclid";
                        if (!bl4) {
                            bl4 = string3.contains(string5);
                            if (bl4 || (bl4 = string3.contains(string4 = "gbraid")) || (bl4 = string3.contains(string6)) || (bl4 = string3.contains(string7)) || (bl4 = string3.contains(string8)) || (bl4 = string3.contains(string4 = "utm_id")) || (bl4 = string3.contains(string4 = "dclid")) || (bl4 = string3.contains(string4 = "srsltid")) || (bl4 = string3.contains(string4 = "sfmc_id"))) break block13;
                            object4 = ((zzpn)object3).zzj();
                            object4 = ((zzgo)object4).zzc();
                            ((zzgq)object4).zza(string9);
                        }
                        object4 = null;
                        break block14;
                    }
                    catch (RuntimeException runtimeException2) {
                        break block15;
                    }
                }
                object4 = ((String)object4).concat(string3);
                object4 = Uri.parse((String)object4);
                if ((object4 = ((zzpn)object3).zza((Uri)object4)) != null) {
                    object3 = "referrer";
                    object4.putString((String)charSequence, (String)object3);
                }
            }
            object3 = "_cmp";
            if (bl2) {
                object2 = zzlk2.zza;
                object2 = ((zzju)object2).zzs();
                if ((object2 = ((zzpn)object2).zza((Uri)object)) != null) {
                    object = "intent";
                    object2.putString((String)charSequence, (String)object);
                    bl3 = object2.containsKey(string5);
                    if (!bl3 && object4 != null && (bl3 = object4.containsKey(string5))) {
                        object = "_cer";
                        string4 = object4.getString(string5);
                        charSequence = new StringBuilder(string10);
                        ((StringBuilder)charSequence).append(string4);
                        string10 = ((StringBuilder)charSequence).toString();
                        object2.putString((String)object, string10);
                    }
                    object = zzlk2.zza;
                    ((zzju)object).zzc(string2, (String)object3, (Bundle)object2);
                    object = zzlk2.zza;
                    object = ((zzju)object).zza;
                    ((zzu)object).zza(string2, (Bundle)object2);
                }
            }
            if (bl2 = TextUtils.isEmpty((CharSequence)string3)) {
                return;
            }
            object2 = zzlk2.zza;
            object2 = ((zzju)object2).zzj();
            object2 = ((zzgo)object2).zzc();
            object = "Activity created with referrer";
            ((zzgq)object2).zza((String)object, string3);
            object2 = zzlk2.zza;
            object2 = ((zzju)object2).zze();
            object = zzbn.zzca;
            bl2 = ((zzai)object2).zza((zzfx)object);
            bl3 = true;
            string10 = "_ldl";
            string4 = "auto";
            if (bl2) {
                if (object4 != null) {
                    object2 = zzlk2.zza;
                    ((zzju)object2).zzc(string2, (String)object3, (Bundle)object4);
                    object2 = zzlk2.zza;
                    object2 = ((zzju)object2).zza;
                    ((zzu)object2).zza(string2, (Bundle)object4);
                } else {
                    object2 = zzlk2.zza;
                    object2 = ((zzju)object2).zzj();
                    object2 = ((zzgo)object2).zzc();
                    string2 = "Referrer does not contain valid parameters";
                    ((zzgq)object2).zza(string2, string3);
                }
                object2 = zzlk2.zza;
                ((zzju)object2).zza(string4, string10, null, bl3);
                return;
            }
            bl2 = string3.contains(string5);
            if (bl2 && ((bl2 = string3.contains(string6)) || (bl2 = string3.contains(string7)) || (bl2 = string3.contains(string8)) || (bl2 = string3.contains((CharSequence)(object2 = "utm_term"))) || (bl2 = string3.contains((CharSequence)(object2 = "utm_content"))))) {
                bl2 = TextUtils.isEmpty((CharSequence)string3);
                if (!bl2) {
                    object2 = zzlk2.zza;
                    ((zzju)object2).zza(string4, string10, (Object)string3, bl3);
                }
                return;
            }
            object2 = zzlk2.zza;
            object2 = ((zzju)object2).zzj();
            object2 = ((zzgo)object2).zzc();
            ((zzgq)object2).zza(string9);
            return;
        }
        zzlk2.zza.zzj().zzg().zza("Throwable caught in handleReferrerForOnActivityCreated", runtimeException2);
    }

    public final void onActivityCreated(Activity object, Bundle bundle) {
        object = zzeb.zza(object);
        this.zza((zzeb)object, bundle);
    }

    public final void onActivityDestroyed(Activity object) {
        object = zzeb.zza(object);
        this.zza((zzeb)object);
    }

    public final void onActivityPaused(Activity object) {
        object = zzeb.zza(object);
        this.zzb((zzeb)object);
    }

    public final void onActivityResumed(Activity object) {
        object = zzeb.zza(object);
        this.zzc((zzeb)object);
    }

    public final void onActivitySaveInstanceState(Activity object, Bundle bundle) {
        object = zzeb.zza(object);
        this.zzb((zzeb)object, bundle);
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void zza(zzeb zzeb2) {
        this.zza.zzp().zza(zzeb2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(zzeb zzeb2, Bundle bundle) {
        Throwable throwable2;
        block12: {
            RuntimeException runtimeException2;
            Object object;
            block11: {
                Object object2;
                block10: {
                    object2 = this.zza;
                    object2 = ((zzju)object2).zzj();
                    object2 = ((zzgo)object2).zzq();
                    object = "onActivityCreated";
                    ((zzgq)object2).zza((String)object);
                    object2 = zzeb2.zzc;
                    if (object2 != null) break block10;
                    this.zza.zzp().zza(zzeb2, bundle);
                    return;
                }
                try {
                    boolean bl2;
                    boolean bl3;
                    Object object3;
                    boolean bl4;
                    object = object2.getData();
                    if (object == null || !(bl4 = object.isHierarchical())) {
                        object = object2.getExtras();
                        if (object != null && !(bl4 = TextUtils.isEmpty((CharSequence)(object = object.getString((String)(object3 = "com.android.vending.referral_url")))))) {
                            object = Uri.parse((String)object);
                        } else {
                            bl3 = false;
                            object = null;
                        }
                    }
                    Object object4 = object;
                    if (object == null || !(bl3 = object.isHierarchical())) break block11;
                    object = this.zza;
                    ((zzju)object).zzs();
                    boolean bl5 = zzpn.zza((Intent)object2);
                    object2 = bl5 ? "gs" : "auto";
                    Object object5 = object2;
                    object2 = "referrer";
                    String string2 = object4.getQueryParameter((String)object2);
                    if (bundle == null) {
                        bl5 = true;
                        bl2 = true;
                    } else {
                        bl5 = false;
                        object2 = null;
                        bl2 = false;
                    }
                    object2 = this.zza;
                    object2 = ((zzju)object2).zzl();
                    object3 = object;
                    object = new zzln(this, bl2, (Uri)object4, (String)object5, string2);
                    ((zzhv)object2).zzb((Runnable)object);
                }
                catch (Throwable throwable2) {
                    break block12;
                }
                catch (RuntimeException runtimeException2) {}
                this.zza.zzp().zza(zzeb2, bundle);
                return;
            }
            this.zza.zzp().zza(zzeb2, bundle);
            return;
            {
                object = this.zza;
                object = ((zzju)object).zzj();
                object = ((zzgo)object).zzg();
                String string3 = "Throwable caught in onActivityCreated";
                ((zzgq)object).zza(string3, runtimeException2);
                this.zza.zzp().zza(zzeb2, bundle);
                return;
            }
        }
        this.zza.zzp().zza(zzeb2, bundle);
        throw throwable2;
    }

    public final void zzb(zzeb object) {
        this.zza.zzp().zzb((zzeb)object);
        object = this.zza.zzr();
        long l2 = ((zznx)object).zzb().elapsedRealtime();
        zzhv zzhv2 = ((zznx)object).zzl();
        zznz zznz2 = new zznz((zznx)object, l2);
        zzhv2.zzb(zznz2);
    }

    public final void zzb(zzeb zzeb2, Bundle bundle) {
        this.zza.zzp().zzb(zzeb2, bundle);
    }

    public final void zzc(zzeb zzeb2) {
        zznx zznx2 = this.zza.zzr();
        long l2 = zznx2.zzb().elapsedRealtime();
        zzhv zzhv2 = zznx2.zzl();
        zznw zznw2 = new zznw(zznx2, l2);
        zzhv2.zzb(zznw2);
        this.zza.zzp().zzc(zzeb2);
    }
}

