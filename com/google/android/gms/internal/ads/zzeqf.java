/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewParent
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzeqd;
import com.google.android.gms.internal.ads.zzeqe;
import com.google.android.gms.internal.ads.zzeqg;
import com.google.android.gms.internal.ads.zzexw;
import com.google.android.gms.internal.ads.zzfho;
import com.google.android.gms.internal.ads.zzgge;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public final class zzeqf
implements zzexw {
    private final zzgge zza;
    private final zzgge zzb;
    private final Context zzc;
    private final zzfho zzd;
    private final View zze;

    public zzeqf(zzgge zzgge2, zzgge zzgge3, Context context, zzfho zzfho2, ViewGroup viewGroup) {
        this.zza = zzgge2;
        this.zzb = zzgge3;
        this.zzc = context;
        this.zzd = zzfho2;
        this.zze = viewGroup;
    }

    private final List zze() {
        ViewParent viewParent;
        ArrayList<ViewParent> arrayList = new ArrayList<ViewParent>();
        View view = this.zze;
        while (view != null && (viewParent = view.getParent()) != null) {
            int n3;
            ViewParent viewParent2;
            boolean bl2 = viewParent instanceof ViewGroup;
            if (bl2) {
                viewParent2 = viewParent;
                viewParent2 = (ViewGroup)viewParent;
                n3 = viewParent2.indexOfChild(view);
            } else {
                n3 = -1;
            }
            viewParent2 = new Bundle();
            String string2 = viewParent.getClass().getName();
            String string3 = "type";
            viewParent2.putString(string3, string2);
            string2 = "index_of_child";
            viewParent2.putInt(string2, n3);
            arrayList.add(viewParent2);
            n3 = viewParent instanceof View;
            if (n3 == 0) break;
            view = viewParent;
            view = (View)viewParent;
        }
        return arrayList;
    }

    public final int zza() {
        return 3;
    }

    public final ListenableFuture zzb() {
        zzbep.zza(this.zzc);
        Object object = zzbep.zzla;
        Object object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (bl2) {
            object = this.zzb;
            object2 = new zzeqd(this);
            return object.zzb((Callable)object2);
        }
        object = this.zza;
        object2 = new zzeqe(this);
        return object.zzb((Callable)object2);
    }

    public final /* synthetic */ zzeqg zzc() {
        Object object = this.zzd;
        Context context = this.zzc;
        object = ((zzfho)object).zze;
        List list = this.zze();
        zzeqg zzeqg2 = new zzeqg(context, (zzq)object, list);
        return zzeqg2;
    }

    public final /* synthetic */ zzeqg zzd() {
        Object object = this.zzd;
        Context context = this.zzc;
        object = ((zzfho)object).zze;
        List list = this.zze();
        zzeqg zzeqg2 = new zzeqg(context, (zzq)object, list);
        return zzeqg2;
    }
}

