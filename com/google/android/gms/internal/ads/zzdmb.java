/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnTouchListener
 *  android.widget.ImageView$ScaleType
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.client.zzcs;
import com.google.android.gms.ads.internal.client.zzcw;
import com.google.android.gms.internal.ads.zzbjp;
import java.util.Map;
import org.json.JSONObject;

public interface zzdmb {
    public boolean zzA();

    public boolean zzB();

    public boolean zzC(Bundle var1);

    public int zza();

    public JSONObject zze(View var1, Map var2, Map var3, ImageView.ScaleType var4);

    public JSONObject zzf(View var1, Map var2, Map var3, ImageView.ScaleType var4);

    public void zzg();

    public void zzh();

    public void zzi();

    public void zzj(zzcw var1);

    public void zzk(View var1, View var2, Map var3, Map var4, boolean var5, ImageView.ScaleType var6);

    public void zzl(String var1);

    public void zzm(Bundle var1);

    public void zzo(View var1, View var2, Map var3, Map var4, boolean var5, ImageView.ScaleType var6, int var7);

    public void zzp();

    public void zzq(View var1, Map var2, Map var3, ImageView.ScaleType var4);

    public void zzr();

    public void zzs(View var1, MotionEvent var2, View var3);

    public void zzt(Bundle var1);

    public void zzu(View var1);

    public void zzv();

    public void zzw(zzcs var1);

    public void zzx(zzbjp var1);

    public void zzy(View var1, Map var2, Map var3, View.OnTouchListener var4, View.OnClickListener var5);

    public void zzz(View var1, Map var2);
}

