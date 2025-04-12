/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbhj;
import com.google.android.gms.internal.ads.zzbhs;
import com.google.android.gms.internal.ads.zzbhv;
import com.google.android.gms.internal.ads.zzbio;
import com.google.android.gms.internal.ads.zzdlo;
import com.google.android.gms.internal.ads.zzdlq;
import com.google.android.gms.internal.ads.zzdlt;
import com.google.android.gms.internal.ads.zzdmt;
import com.google.android.gms.internal.ads.zzdpz;
import com.google.android.gms.internal.ads.zzehg;
import com.google.android.gms.internal.ads.zzfoj;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class zzdqa
extends zzbio {
    private final Context zza;
    private final zzdlt zzb;
    private zzdmt zzc;
    private zzdlo zzd;

    public zzdqa(Context context, zzdlt zzdlt2, zzdmt zzdmt2, zzdlo zzdlo2) {
        this.zza = context;
        this.zzb = zzdlt2;
        this.zzc = zzdmt2;
        this.zzd = zzdlo2;
    }

    public static /* bridge */ /* synthetic */ zzdlo zzc(zzdqa zzdqa2) {
        return zzdqa2.zzd;
    }

    private final zzbhj zzd(String object) {
        object = new zzdpz(this, "_videoMediaView");
        return object;
    }

    public final zzdq zze() {
        return this.zzb.zzj();
    }

    public final zzbhs zzf() {
        Object object;
        try {
            object = this.zzd;
        }
        catch (NullPointerException nullPointerException) {
            zzu.zzo().zzw(nullPointerException, "InternalNativeCustomTemplateAdShim.getMediaContent");
            return null;
        }
        object = ((zzdlo)object).zzc();
        return ((zzdlq)object).zza();
    }

    public final zzbhv zzg(String string2) {
        return (zzbhv)this.zzb.zzh().get(string2);
    }

    public final IObjectWrapper zzh() {
        return ObjectWrapper.wrap(this.zza);
    }

    public final String zzi() {
        return this.zzb.zzA();
    }

    public final String zzj(String string2) {
        return (String)this.zzb.zzi().get(string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final List zzk() {
        NullPointerException nullPointerException2;
        block5: {
            int n3;
            String[] stringArray;
            int n4;
            Object object;
            Object object2;
            try {
                int n7;
                object2 = this.zzb;
                object2 = ((zzdlt)object2).zzh();
                object = this.zzb;
                object = ((zzdlt)object).zzi();
                int n8 = ((a53)object2).c;
                n4 = ((a53)object).c;
                stringArray = new String[n8 += n4];
                n4 = 0;
                n3 = 0;
                for (int i3 = 0; i3 < (n7 = ((a53)object2).c); ++n3, ++i3) {
                    Object object3 = ((a53)object2).h(i3);
                    stringArray[n3] = object3 = (String)object3;
                }
            }
            catch (NullPointerException nullPointerException2) {
                break block5;
            }
            while (true) {
                int n10;
                if (n4 >= (n10 = ((a53)object).c)) {
                    return Arrays.asList(stringArray);
                }
                object2 = ((a53)object).h(n4);
                stringArray[n3] = object2 = (String)object2;
                ++n3;
                ++n4;
            }
        }
        zzu.zzo().zzw(nullPointerException2, "InternalNativeCustomTemplateAdShim.getAvailableAssetNames");
        return new ArrayList();
    }

    public final void zzl() {
        zzdlo zzdlo2 = this.zzd;
        if (zzdlo2 != null) {
            zzdlo2.zzb();
        }
        this.zzd = null;
        this.zzc = null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzm() {
        NullPointerException nullPointerException2;
        block5: {
            boolean bl2;
            Object object;
            Object object2;
            try {
                object2 = this.zzb;
                object2 = ((zzdlt)object2).zzC();
                object = "Google";
                bl2 = Objects.equals(object2, object);
                if (bl2) {
                    object2 = "Illegal argument specified for omid partner name.";
                    zzm.zzj((String)object2);
                    return;
                }
            }
            catch (NullPointerException nullPointerException2) {
                break block5;
            }
            bl2 = TextUtils.isEmpty((CharSequence)object2);
            if (bl2) {
                object2 = "Not starting OMID session. OM partner name has not been configured.";
                zzm.zzj((String)object2);
                return;
            }
            object = this.zzd;
            if (object != null) {
                ((zzdlo)object).zzf((String)object2, false);
            }
            return;
        }
        zzu.zzo().zzw(nullPointerException2, "InternalNativeCustomTemplateAdShim.initializeDisplayOpenMeasurement");
    }

    public final void zzn(String string2) {
        zzdlo zzdlo2 = this.zzd;
        if (zzdlo2 != null) {
            zzdlo2.zzF(string2);
        }
    }

    public final void zzo() {
        zzdlo zzdlo2 = this.zzd;
        if (zzdlo2 != null) {
            zzdlo2.zzI();
        }
    }

    public final void zzp(IObjectWrapper object) {
        Object object2;
        boolean bl2 = (object = ObjectWrapper.unwrap((IObjectWrapper)object)) instanceof View;
        if (bl2 && (object2 = this.zzb.zzu()) != null && (object2 = this.zzd) != null) {
            object = (View)object;
            ((zzdlo)object2).zzJ((View)object);
        }
    }

    public final boolean zzq() {
        boolean bl2;
        Object object = this.zzd;
        if (object != null && !(bl2 = ((zzdlo)object).zzW())) {
            return false;
        }
        object = this.zzb.zzr();
        if (object == null) {
            return false;
        }
        object = this.zzb.zzs();
        return object == null;
    }

    public final boolean zzr(IObjectWrapper object) {
        boolean bl2;
        Object object2;
        boolean bl3 = (object = ObjectWrapper.unwrap((IObjectWrapper)object)) instanceof ViewGroup;
        if (bl3 && (object2 = this.zzc) != null && (bl2 = ((zzdmt)object2).zzf((ViewGroup)(object = (ViewGroup)object)))) {
            object = this.zzb.zzq();
            object2 = this.zzd("_videoMediaView");
            object.zzar((zzbhj)object2);
            return true;
        }
        return false;
    }

    public final boolean zzs(IObjectWrapper object) {
        boolean bl2;
        Object object2;
        boolean bl3 = (object = ObjectWrapper.unwrap((IObjectWrapper)object)) instanceof ViewGroup;
        if (bl3 && (object2 = this.zzc) != null && (bl2 = ((zzdmt)object2).zzg((ViewGroup)(object = (ViewGroup)object)))) {
            object = this.zzb.zzs();
            object2 = this.zzd("_videoMediaView");
            object.zzar((zzbhj)object2);
            return true;
        }
        return false;
    }

    public final boolean zzt() {
        Object object = this.zzb.zzu();
        if (object != null) {
            Object object2 = zzu.zzA();
            object = ((zzehg)object).zza();
            object2.zzk((zzfoj)object);
            object = this.zzb.zzr();
            if (object != null) {
                object = this.zzb.zzr();
                object2 = new Jp();
                String string2 = "onSdkLoaded";
                object.zzd(string2, (Map)object2);
            }
            return true;
        }
        zzm.zzj("Trying to start OMID session before creation.");
        return false;
    }
}

