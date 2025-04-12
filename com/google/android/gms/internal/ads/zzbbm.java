/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.ActivityManager
 *  android.app.ActivityManager$RunningAppProcessInfo
 *  android.app.KeyguardManager
 *  android.graphics.Rect
 *  android.os.PowerManager
 *  android.os.Process
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.ViewGroup
 *  android.webkit.WebView
 *  android.widget.EditText
 *  android.widget.TextView
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.graphics.Rect;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.ads.zzbbc;
import com.google.android.gms.internal.ads.zzbbd;
import com.google.android.gms.internal.ads.zzbbh;
import com.google.android.gms.internal.ads.zzbbi;
import com.google.android.gms.internal.ads.zzbbk;
import com.google.android.gms.internal.ads.zzbbl;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbgb;
import com.google.android.gms.internal.ads.zzchd;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzbbm
extends Thread {
    private boolean zza;
    private boolean zzb;
    private final Object zzc;
    private final zzbbd zzd;
    private final int zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final String zzm;
    private final boolean zzn;
    private final boolean zzo;
    private final boolean zzp;

    public zzbbm() {
        int n3;
        Object object = new zzbbd();
        this.zza = false;
        this.zzb = false;
        this.zzd = object;
        this.zzc = object = new Object();
        this.zzf = n3 = ((Long)zzbgb.zzd.zze()).intValue();
        this.zzg = n3 = ((Long)zzbgb.zza.zze()).intValue();
        this.zzh = n3 = ((Long)zzbgb.zze.zze()).intValue();
        this.zzi = n3 = ((Long)zzbgb.zzc.zze()).intValue();
        object = zzbep.zzR;
        this.zzj = n3 = ((Integer)zzba.zzc().zza((zzbeg)object)).intValue();
        object = zzbep.zzS;
        this.zzk = n3 = ((Integer)zzba.zzc().zza((zzbeg)object)).intValue();
        object = zzbep.zzT;
        this.zzl = n3 = ((Integer)zzba.zzc().zza((zzbeg)object)).intValue();
        this.zze = n3 = ((Long)zzbgb.zzf.zze()).intValue();
        object = zzbep.zzV;
        this.zzm = object = (String)zzba.zzc().zza((zzbeg)object);
        object = zzbep.zzW;
        n3 = (int)(((Boolean)zzba.zzc().zza((zzbeg)object)).booleanValue() ? 1 : 0);
        this.zzn = n3;
        object = zzbep.zzX;
        n3 = (int)(((Boolean)zzba.zzc().zza((zzbeg)object)).booleanValue() ? 1 : 0);
        this.zzo = n3;
        object = zzbep.zzY;
        n3 = (int)(((Boolean)zzba.zzc().zza((zzbeg)object)).booleanValue() ? 1 : 0);
        this.zzp = n3;
        this.setName("ContentFetchTask");
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        while (true) {
            block25: {
                block22: {
                    block21: {
                        var1_1 = zzu.zzb();
                        var1_1 = var1_1.zzb();
                        if (var1_1 == null) ** GOTO lbl68
                        var2_6 = "activity";
                        var2_6 = var1_1.getSystemService((String)var2_6);
                        var2_6 = (ActivityManager)var2_6;
                        var3_8 = "keyguard";
                        var3_8 = var1_1.getSystemService((String)var3_8);
                        var3_8 = (KeyguardManager)var3_8;
                        if (var2_6 == null || var3_8 == null || (var2_6 = var2_6.getRunningAppProcesses()) == null) ** GOTO lbl68
                        var2_6 = var2_6.iterator();
                        while ((var4_9 = var2_6.hasNext()) != 0) {
                            var5_10 /* !! */  = var2_6.next();
                            var5_10 /* !! */  = (ActivityManager.RunningAppProcessInfo)var5_10 /* !! */ ;
                            var6_11 = Process.myPid();
                            if (var6_11 != (var7_12 = var5_10 /* !! */ .pid)) continue;
                            var8_13 = var5_10 /* !! */ .importance;
                            var4_9 = 100;
                            if (var8_13 != var4_9 || (var8_13 = (int)var3_8.inKeyguardRestrictedInputMode()) != 0) ** GOTO lbl68
                            var2_6 = "power";
                            var1_1 = var1_1.getSystemService((String)var2_6);
                            if ((var1_1 = (PowerManager)var1_1) == null || (var9_14 = (int)var1_1.isScreenOn()) == 0) ** GOTO lbl68
                        }
                        ** GOTO lbl68
                        {
                            ** try [egrp 1[TRYBLOCK] [19, 18 : 173->200)] { 
lbl27:
                            // 1 sources

                            ** GOTO lbl37
lbl-1000:
                            // 1 sources

                            {
                                catch (Exception var1_2) {
                                    break block21;
                                }
lbl30:
                                // 1 sources

                                catch (InterruptedException var1_3) {
                                    break block22;
                                }
                                {
                                    block26: {
                                        block23: {
                                            catch (Throwable var1_5) {
                                                var2_6 = zzu.zzo();
                                                var3_8 = "ContentFetchTask.isInForeground";
                                                var2_6.zzw(var1_5, (String)var3_8);
                                                break block23;
                                            }
lbl37:
                                            // 1 sources

                                            var1_1 = zzu.zzb();
                                            var1_1 = var1_1.zza();
                                            if (var1_1 == null) {
                                                var1_1 = "ContentFetchThread: no activity. Sleeping.";
                                                com.google.android.gms.ads.internal.util.client.zzm.zze((String)var1_1);
                                                this.zzf();
                                                break block26;
                                            } else {
                                                block24: {
                                                    var8_13 = 0;
                                                    var2_6 = null;
                                                    try {
                                                        var3_8 = var1_1.getWindow();
                                                        if (var3_8 == null) break block24;
                                                        var3_8 = var1_1.getWindow();
                                                        if ((var3_8 = var3_8.getDecorView()) != null) {
                                                            var1_1 = var1_1.getWindow();
                                                            var1_1 = var1_1.getDecorView();
                                                            var10_15 = 0x1020002;
                                                            var2_6 = var1_1.findViewById(var10_15);
                                                        }
                                                        break block24;
                                                    }
                                                    catch (Exception var1_4) {}
                                                    var3_8 = zzu.zzo();
                                                    var5_10 /* !! */  = "ContentFetchTask.extractContent";
                                                    var3_8.zzw(var1_4, (String)var5_10 /* !! */ );
                                                    var1_1 = "Failed getting root view of activity. Content not extracted.";
                                                    com.google.android.gms.ads.internal.util.client.zzm.zze((String)var1_1);
                                                }
                                                if (var2_6 != null) {
                                                    var1_1 = new zzbbi(this, (View)var2_6);
                                                    var2_6.post((Runnable)var1_1);
                                                }
                                            }
                                            break block26;
                                        }
                                        var1_1 = "ContentFetchTask: sleeping";
                                        com.google.android.gms.ads.internal.util.client.zzm.zze((String)var1_1);
                                        this.zzf();
                                    }
                                    var9_14 = this.zze * 1000;
                                    break;
                                }
                            }
                        }
                        var11_16 = var9_14;
                        {
                            Thread.sleep(var11_16);
                            break block25;
                        }
                    }
                    com.google.android.gms.ads.internal.util.client.zzm.zzh("Error in ContentFetchTask", var1_2);
                    var2_6 = "ContentFetchTask.run";
                    var3_8 = zzu.zzo();
                    var3_8.zzw(var1_2, (String)var2_6);
                    break block25;
                }
                var2_6 = "Error in ContentFetchTask";
                com.google.android.gms.ads.internal.util.client.zzm.zzh((String)var2_6, var1_3);
            }
            var1_1 = this.zzc;
            synchronized (var1_1) {
                try {
                    while ((var8_13 = this.zzb) != 0) {
                        var2_6 = "ContentFetchTask: waiting";
                        try {
                            com.google.android.gms.ads.internal.util.client.zzm.zze((String)var2_6);
                            var2_6 = this.zzc;
                            var2_6.wait();
                        }
                        catch (InterruptedException v0) {
                        }
                    }
                }
                catch (Throwable var2_7) {
                    break;
                }
            }
        }
        {
            throw var2_7;
        }
    }

    public final zzbbc zza() {
        zzbbd zzbbd2 = this.zzd;
        boolean bl2 = this.zzp;
        return zzbbd2.zza(bl2);
    }

    public final zzbbl zzb(View object, zzbbc zzbbc2) {
        if (object != null) {
            Object object2 = new Rect();
            int n3 = object.getGlobalVisibleRect((Rect)object2);
            int n4 = object instanceof TextView;
            int n7 = 1;
            if (n4 != 0 && (n4 = object instanceof EditText) == 0) {
                object2 = object;
                object2 = ((TextView)object).getText();
                boolean bl2 = TextUtils.isEmpty((CharSequence)object2);
                if (!bl2) {
                    String string2 = object2.toString();
                    float f5 = object.getX();
                    float f6 = object.getY();
                    float f7 = object.getWidth();
                    float f8 = object.getHeight();
                    zzbbc2.zzk(string2, n3 != 0, f5, f6, f7, f8);
                    object = new zzbbl(this, n7, 0);
                    return object;
                }
            } else {
                n4 = object instanceof WebView;
                if (n4 != 0 && (n4 = object instanceof zzchd) == 0) {
                    object = (WebView)object;
                    n4 = PlatformVersion.isAtLeastKitKat();
                    if (n4 != 0) {
                        zzbbc2.zzh();
                        object2 = new zzbbk(this, zzbbc2, (WebView)object, n3 != 0);
                        object.post((Runnable)object2);
                        object = new zzbbl(this, 0, n7);
                        return object;
                    }
                } else {
                    n4 = object instanceof ViewGroup;
                    if (n4 != 0) {
                        int n8;
                        object = (ViewGroup)object;
                        n4 = 0;
                        object2 = null;
                        int n10 = 0;
                        for (int i3 = 0; i3 < (n8 = object.getChildCount()); ++i3) {
                            Object object3 = object.getChildAt(i3);
                            object3 = this.zzb((View)object3, zzbbc2);
                            n3 = object3.zza;
                            n4 += n3;
                            n8 = object3.zzb;
                            n10 += n8;
                        }
                        object = new zzbbl(this, n4, n10);
                        return object;
                    }
                }
            }
        }
        object = new zzbbl(this, 0, 0);
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzc(View object) {
        Exception exception2;
        block6: {
            zzbbc zzbbc2;
            block9: {
                block5: {
                    int n3;
                    block8: {
                        block7: {
                            int n4;
                            block4: {
                                try {
                                    String string2;
                                    int n7 = this.zzf;
                                    int n8 = this.zzg;
                                    int n10 = this.zzh;
                                    int n14 = this.zzi;
                                    int n15 = this.zzj;
                                    int n16 = this.zzk;
                                    int n17 = this.zzl;
                                    boolean bl2 = this.zzo;
                                    Object object2 = zzbbc2;
                                    zzbbc2 = new zzbbc(n7, n8, n10, n14, n15, n16, n17, bl2);
                                    object2 = zzu.zzb();
                                    object2 = ((zzbbh)object2).zzb();
                                    if (object2 == null || (n7 = (int)(TextUtils.isEmpty((CharSequence)(string2 = this.zzm)) ? 1 : 0)) != 0) break block4;
                                    string2 = object2.getResources();
                                    Object object3 = zzbep.zzU;
                                    Object object4 = zzba.zzc();
                                    object3 = ((zzben)object4).zza((zzbeg)object3);
                                    object3 = (String)object3;
                                    object4 = "id";
                                    object2 = object2.getPackageName();
                                    n4 = string2.getIdentifier((String)object3, (String)object4, (String)object2);
                                    object2 = object.getTag(n4);
                                    if ((object2 = (String)object2) != null && (n4 = (int)(((String)object2).equals(string2 = this.zzm) ? 1 : 0)) != 0) break block5;
                                }
                                catch (Exception exception2) {
                                    break block6;
                                }
                            }
                            object = this.zzb((View)object, zzbbc2);
                            zzbbc2.zzm();
                            n4 = ((zzbbl)object).zza;
                            if (n4 == 0 && (n4 = ((zzbbl)object).zzb) == 0) break block5;
                            n3 = ((zzbbl)object).zzb;
                            if (n3 != 0) break block7;
                            n3 = zzbbc2.zzc();
                            if (n3 == 0) break block5;
                            break block8;
                        }
                        if (n3 != 0) break block9;
                    }
                    object = this.zzd;
                    n3 = (int)(((zzbbd)object).zzd(zzbbc2) ? 1 : 0);
                    if (n3 == 0) break block9;
                }
                return;
            }
            object = this.zzd;
            ((zzbbd)object).zzb(zzbbc2);
            return;
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzh("Exception in fetchContentOnUIThread", exception2);
        zzu.zzo().zzw(exception2, "ContentFetchTask.fetchContent");
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzd(zzbbc var1_1, WebView var2_3, String var3_4, boolean var4_5) {
        block10: {
            block9: {
                var1_1.zzg();
                try {
                    var5_6 = TextUtils.isEmpty((CharSequence)var3_4);
                    if (!var5_6) {
                        var6_7 = new JSONObject(var3_4);
                        var3_4 = "text";
                        var7_8 = var6_7.optString(var3_4);
                        var8_9 = this.zzn;
                        if (var8_9 != 0 || (var8_9 = TextUtils.isEmpty((CharSequence)(var3_4 = var2_3.getTitle()))) != 0) break block9;
                        var3_4 = var2_3.getTitle();
                        var6_7 = new StringBuilder();
                        var6_7.append(var3_4);
                        var3_4 = "\n";
                        var6_7.append(var3_4);
                        var6_7.append(var7_8);
                        var9_10 = var6_7.toString();
                        var10_11 = var2_3.getX();
                        var11_13 = var2_3.getY();
                        var8_9 = var2_3.getWidth();
                    }
                    ** GOTO lbl43
                }
                catch (Throwable var1_2) {
                    break block10;
                }
                catch (JSONException v0) {
                    com.google.android.gms.ads.internal.util.client.zzm.zze("Json string may be malformed.");
                    return;
                }
                var12_15 = var8_9;
                {
                    var13_16 = var2_3.getHeight();
                }
                var14_17 = var13_16;
                var1_1.zzl(var9_10, var4_5, var10_11, var11_13, var12_15, var14_17);
                ** GOTO lbl43
            }
            var15_18 = var2_3.getX();
            var16_19 = var2_3.getY();
            var8_9 = var2_3.getWidth();
            var10_12 = var8_9;
            {
                var13_16 = var2_3.getHeight();
            }
            var11_14 = var13_16;
            {
                var1_1.zzl(var7_8, var4_5, var15_18, var16_19, var10_12, var11_14);
lbl43:
                // 3 sources

                if ((var13_16 = var1_1.zzo()) != 0) {
                    var2_3 = this.zzd;
                    var2_3.zzc(var1_1);
                }
                return;
            }
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzf("Failed to get webview content.", var1_2);
        zzu.zzo().zzw(var1_2, "ContentFetchTask.processWebViewContent");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zze() {
        Object object = this.zzc;
        synchronized (object) {
            try {
                boolean bl2 = this.zza;
                if (bl2) {
                    String string2 = "Content hash thread already started, quitting...";
                    com.google.android.gms.ads.internal.util.client.zzm.zze(string2);
                    return;
                }
                this.zza = bl2 = true;
                // MONITOREXIT @DISABLED, blocks:[0, 2] lbl11 : MonitorExitStatement: MONITOREXIT : var1_1
                this.start();
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzf() {
        Object object = this.zzc;
        synchronized (object) {
            boolean bl2;
            this.zzb = bl2 = true;
            String string2 = "ContentFetchThread: paused, pause = true";
            com.google.android.gms.ads.internal.util.client.zzm.zze(string2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzg() {
        Object object = this.zzc;
        synchronized (object) {
            Object object2 = null;
            this.zzb = false;
            object2 = this.zzc;
            object2.notifyAll();
            object2 = "ContentFetchThread: wakeup";
            com.google.android.gms.ads.internal.util.client.zzm.zze((String)object2);
            return;
        }
    }

    public final boolean zzh() {
        return this.zzb;
    }
}

