/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.View
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.google.android.gms.internal.ads.zzfon;
import com.google.android.gms.internal.ads.zzfoq;
import com.google.android.gms.internal.ads.zzfpe;
import com.google.android.gms.internal.ads.zzfph;
import com.google.android.gms.internal.ads.zzfpn;
import com.google.android.gms.internal.ads.zzfpo;
import com.google.android.gms.internal.ads.zzfpp;
import com.google.android.gms.internal.ads.zzfpy;
import com.google.android.gms.internal.ads.zzfpz;
import com.google.android.gms.internal.ads.zzfqe;
import com.google.android.gms.internal.ads.zzfqg;
import com.google.android.gms.internal.ads.zzfqh;
import com.google.android.gms.internal.ads.zzfqi;
import com.google.android.gms.internal.ads.zzfqj;
import com.google.android.gms.internal.ads.zzfqk;
import com.google.android.gms.internal.ads.zzfql;
import com.google.android.gms.internal.ads.zzfqm;
import com.google.android.gms.internal.ads.zzfqn;
import com.google.android.gms.internal.ads.zzfqr;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzfqo
implements zzfpn {
    private static final zzfqo zza;
    private static final Handler zzb;
    private static Handler zzc;
    private static final Runnable zzd;
    private static final Runnable zze;
    private final List zzf;
    private int zzg;
    private boolean zzh;
    private final List zzi;
    private final zzfpp zzj;
    private final zzfqh zzk;
    private final zzfqi zzl;
    private long zzm;

    static {
        Object object = new zzfqo();
        zza = object;
        Looper looper = Looper.getMainLooper();
        object = new Handler(looper);
        zzb = object;
        zzc = null;
        zzd = object = new zzfqk();
        zze = object = new zzfql();
    }

    public zzfqo() {
        Object object = new ArrayList();
        this.zzf = object;
        this.zzh = false;
        object = new ArrayList();
        this.zzi = object;
        this.zzk = object = new zzfqh();
        this.zzj = object = new zzfpp();
        zzfqr zzfqr2 = new zzfqr();
        this.zzl = object = new zzfqi(zzfqr2);
    }

    public static /* bridge */ /* synthetic */ Handler zzb() {
        return zzc;
    }

    public static /* bridge */ /* synthetic */ zzfqi zzc(zzfqo zzfqo2) {
        return zzfqo2.zzl;
    }

    public static zzfqo zzd() {
        return zza;
    }

    public static /* bridge */ /* synthetic */ Runnable zze() {
        return zze;
    }

    public static /* bridge */ /* synthetic */ Runnable zzf() {
        return zzd;
    }

    public static /* bridge */ /* synthetic */ void zzg(zzfqo object) {
        Object object2;
        Object object3;
        Object object4;
        boolean bl2;
        long l2;
        boolean bl3;
        ((zzfqo)object).zzg = 0;
        Object object5 = ((zzfqo)object).zzi;
        object5.clear();
        ((zzfqo)object).zzh = false;
        Object object6 = zzfpe.zza().zzb().iterator();
        while (bl3 = object6.hasNext()) {
            object5 = (zzfon)object6.next();
        }
        ((zzfqo)object).zzm = l2 = System.nanoTime();
        object6 = ((zzfqo)object).zzk;
        ((zzfqh)object6).zzi();
        l2 = System.nanoTime();
        zzfpo zzfpo2 = ((zzfqo)object).zzj.zza();
        Object object7 = ((zzfqo)object).zzk.zze();
        int n3 = ((HashSet)object7).size();
        boolean bl4 = false;
        Object object8 = null;
        if (n3 > 0) {
            object7 = ((zzfqo)object).zzk.zze().iterator();
            while (bl2 = object7.hasNext()) {
                object4 = (String)object7.next();
                object3 = zzfpo2.zza(null);
                Object object9 = ((zzfqo)object).zzk.zza((String)object4);
                object2 = ((zzfqo)object).zzj.zzb();
                String string2 = ((zzfqo)object).zzk.zzc((String)object4);
                if (string2 != null) {
                    object9 = object2.zza((View)object9);
                    zzfpy.zzb((JSONObject)object9, (String)object4);
                    object2 = "notVisibleReason";
                    try {
                        object9.put((String)object2, (Object)string2);
                    }
                    catch (JSONException jSONException) {
                        string2 = "Error with setting not visible reason";
                        zzfpz.zza(string2, (Exception)((Object)jSONException));
                    }
                    zzfpy.zzc(object3, (JSONObject)object9);
                }
                zzfpy.zzf(object3);
                object9 = new HashSet();
                ((HashSet)object9).add(object4);
                object4 = ((zzfqo)object).zzl;
                ((zzfqi)object4).zzc((JSONObject)object3, (HashSet)object9, l2);
            }
        }
        if ((n3 = ((HashSet)(object7 = ((zzfqo)object).zzk.zzf())).size()) > 0) {
            object7 = zzfpo2.zza(null);
            int n4 = 1;
            object2 = null;
            bl2 = false;
            object8 = object;
            object3 = object7;
            ((zzfqo)object).zzk(null, zzfpo2, (JSONObject)object7, n4, false);
            zzfpy.zzf((JSONObject)object7);
            object8 = ((zzfqo)object).zzl;
            object4 = ((zzfqo)object).zzk.zzf();
            ((zzfqi)object8).zzd((JSONObject)object7, (HashSet)object4, l2);
        } else {
            object6 = ((zzfqo)object).zzl;
            ((zzfqi)object6).zzb();
        }
        object6 = ((zzfqo)object).zzk;
        ((zzfqh)object6).zzg();
        l2 = System.nanoTime();
        long l3 = ((zzfqo)object).zzm;
        l2 -= l3;
        object7 = ((zzfqo)object).zzf;
        n3 = object7.size();
        if (n3 > 0) {
            object = ((zzfqo)object).zzf.iterator();
            while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                object7 = (zzfqn)object.next();
                object8 = TimeUnit.NANOSECONDS;
                ((TimeUnit)((Object)object8)).toMillis(l2);
                object7.zzb();
                bl4 = object7 instanceof zzfqm;
                if (!bl4) continue;
                object7 = (zzfqm)object7;
                object7.zza();
            }
        }
    }

    private final void zzk(View view, zzfpo zzfpo2, JSONObject jSONObject, int n3, boolean bl2) {
        boolean bl3;
        int n4 = 1;
        if (n3 == n4) {
            bl3 = true;
        } else {
            n4 = 0;
            bl3 = false;
        }
        zzfpo2.zzb(view, jSONObject, this, bl3, bl2);
    }

    private static final void zzl() {
        Handler handler = zzc;
        if (handler != null) {
            Runnable runnable2 = zze;
            handler.removeCallbacks(runnable2);
            handler = null;
            zzc = null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(View object, zzfpo object2, JSONObject object3, boolean bl2) {
        int n3;
        int n4;
        Object object4 = zzfqe.zza((View)object);
        if (object4 != null) return;
        object4 = this.zzk;
        int n7 = ((zzfqh)object4).zzk((View)object);
        if (n7 == (n4 = 3)) {
            return;
        }
        JSONObject jSONObject = object2.zza((View)object);
        zzfpy.zzc((JSONObject)object3, jSONObject);
        object3 = this.zzk.zzd((View)object);
        n4 = 1;
        if (object3 != null) {
            zzfpy.zzb(jSONObject, (String)object3);
            n3 = this.zzk.zzj((View)object);
            object = n3 != 0;
            object2 = "hasWindowFocus";
            try {
                jSONObject.put((String)object2, object);
            }
            catch (JSONException jSONException) {
                object2 = "Error with setting has window focus";
                zzfpz.zza((String)object2, (Exception)((Object)jSONException));
            }
            object = this.zzk;
            ((zzfqh)object).zzh();
        } else {
            boolean bl3;
            int n8;
            Object object5;
            object3 = this.zzk.zzb((View)object);
            if (object3 != null) {
                object5 = ((zzfqg)object3).zza();
                JSONArray jSONArray = new JSONArray();
                object3 = ((zzfqg)object3).zzb();
                n8 = object3.size();
                for (int i3 = 0; i3 < n8; ++i3) {
                    String string2 = (String)object3.get(i3);
                    jSONArray.put((Object)string2);
                }
                object3 = "isFriendlyObstructionFor";
                try {
                    jSONObject.put((String)object3, (Object)jSONArray);
                    object3 = "friendlyObstructionClass";
                    String string3 = ((zzfph)object5).zzd();
                    jSONObject.put((String)object3, (Object)string3);
                    object3 = "friendlyObstructionPurpose";
                    zzfoq zzfoq2 = ((zzfph)object5).zza();
                    jSONObject.put((String)object3, (Object)zzfoq2);
                    object3 = "friendlyObstructionReason";
                    object5 = ((zzfph)object5).zzc();
                    jSONObject.put((String)object3, object5);
                }
                catch (JSONException jSONException) {
                    object5 = "Error with setting friendly obstruction";
                    zzfpz.zza((String)object5, (Exception)((Object)jSONException));
                }
                bl3 = true;
            } else {
                bl3 = false;
                object3 = null;
            }
            n8 = bl2 || bl3 ? 1 : 0;
            object5 = object;
            Object object6 = object2;
            this.zzk((View)object, (zzfpo)object2, jSONObject, n7, n8 != 0);
        }
        this.zzg = n3 = this.zzg + n4;
    }

    public final void zzh() {
        zzfqo.zzl();
    }

    public final void zzi() {
        Handler handler = zzc;
        if (handler == null) {
            Object object = Looper.getMainLooper();
            zzc = handler = new Handler(object);
            object = zzd;
            handler.post((Runnable)object);
            handler = zzc;
            object = zze;
            long l2 = 200L;
            handler.postDelayed((Runnable)object, l2);
        }
    }

    public final void zzj() {
        zzfqo.zzl();
        this.zzf.clear();
        Handler handler = zzb;
        zzfqj zzfqj2 = new zzfqj(this);
        handler.post((Runnable)zzfqj2);
    }
}

