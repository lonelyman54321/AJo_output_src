/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnCancelListener
 *  android.content.DialogInterface$OnClickListener
 *  android.content.Intent
 *  android.graphics.PointF
 *  android.net.Uri
 *  android.net.Uri$Builder
 *  android.os.Handler
 *  android.text.TextUtils
 *  android.view.MotionEvent
 *  android.view.ViewConfiguration
 *  android.view.WindowManager$BadTokenException
 */
package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzae;
import com.google.android.gms.ads.internal.util.zzaf;
import com.google.android.gms.ads.internal.util.zzag;
import com.google.android.gms.ads.internal.util.zzah;
import com.google.android.gms.ads.internal.util.zzai;
import com.google.android.gms.ads.internal.util.zzaj;
import com.google.android.gms.ads.internal.util.zzak;
import com.google.android.gms.ads.internal.util.zzal;
import com.google.android.gms.ads.internal.util.zzam;
import com.google.android.gms.ads.internal.util.zzan;
import com.google.android.gms.ads.internal.util.zzao;
import com.google.android.gms.ads.internal.util.zzap;
import com.google.android.gms.ads.internal.util.zzaq;
import com.google.android.gms.ads.internal.util.zzar;
import com.google.android.gms.ads.internal.util.zzas;
import com.google.android.gms.ads.internal.util.zzat;
import com.google.android.gms.ads.internal.util.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzdxw;
import com.google.android.gms.internal.ads.zzdya;
import com.google.android.gms.internal.ads.zzgge;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public final class zzau {
    private final Context zza;
    private final zzdya zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private int zzg = 0;
    private int zzh;
    private PointF zzi;
    private PointF zzj;
    private Handler zzk;
    private Runnable zzl;

    public zzau(Context object) {
        int n3;
        zzah zzah2 = new zzah(this);
        this.zzl = zzah2;
        this.zza = object;
        this.zzh = n3 = ViewConfiguration.get((Context)object).getScaledTouchSlop();
        zzu.zzt().zzb();
        object = zzu.zzt().zza();
        this.zzk = object;
        object = zzu.zzs().zza();
        this.zzb = object;
    }

    public zzau(Context context, String string2) {
        this(context);
        this.zzc = string2;
    }

    private final void zzs(Context context) {
        Object object = new ArrayList();
        Object object2 = "None";
        int n3 = 1;
        int n4 = zzau.zzu(object, (String)object2, n3 != 0);
        int n7 = zzau.zzu(object, "Shake", n3 != 0);
        int n8 = zzau.zzu(object, "Flick", n3 != 0);
        zzdxw zzdxw2 = zzdxw.zza;
        zzdxw2 = this.zzb.zza();
        int n10 = zzdxw2.ordinal();
        int n14 = n10 != n3 ? (n10 != (n3 = 2) ? n4 : n8) : n7;
        zzu.zzp();
        context = zzt.zzK(context);
        AtomicInteger atomicInteger = new AtomicInteger(n14);
        context.setTitle((CharSequence)"Setup gesture");
        object2 = new String[]{};
        object = object.toArray((T[])object2);
        object2 = new zzap(atomicInteger);
        context.setSingleChoiceItems(object, n14, (DialogInterface.OnClickListener)object2);
        object = new zzaq(this);
        context.setNegativeButton((CharSequence)"Dismiss", (DialogInterface.OnClickListener)object);
        object = new zzar(this, atomicInteger, n14, n7, n8);
        context.setPositiveButton((CharSequence)"Save", (DialogInterface.OnClickListener)object);
        object = new zzas(this);
        context.setOnCancelListener((DialogInterface.OnCancelListener)object);
        context.create().show();
    }

    private final boolean zzt(float f5, float f6, float f7, float f8) {
        int n3;
        float f11;
        PointF pointF = this.zzi;
        float f12 = (f5 = Math.abs(pointF.x - f5)) - (f11 = (float)(n3 = this.zzh));
        Object object = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
        if (object < 0) {
            int n4;
            PointF pointF2 = this.zzi;
            f5 = Math.abs(pointF2.y - f6);
            float f14 = f5 - (f6 = (float)(n4 = this.zzh));
            object = f14 == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1);
            if (object < 0) {
                pointF2 = this.zzj;
                f5 = Math.abs(pointF2.x - f7);
                float f15 = f5 - (f6 = (float)(n4 = this.zzh));
                object = f15 == 0.0f ? 0 : (f15 < 0.0f ? -1 : 1);
                if (object < 0) {
                    pointF2 = this.zzj;
                    f5 = Math.abs(pointF2.y - f8);
                    float f16 = f5 - (f6 = (float)(n4 = this.zzh));
                    object = f16 == 0.0f ? 0 : (f16 < 0.0f ? -1 : 1);
                    if (object < 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static final int zzu(List list, String string2, boolean bl2) {
        int n3 = -1;
        if (!bl2) {
            return n3;
        }
        list.add(string2);
        return list.size() + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(100);
        stringBuilder.append("{Dialog: ");
        String string2 = this.zzc;
        stringBuilder.append(string2);
        stringBuilder.append(",DebugSignal: ");
        string2 = this.zzf;
        stringBuilder.append(string2);
        stringBuilder.append(",AFMA Version: ");
        string2 = this.zze;
        stringBuilder.append(string2);
        stringBuilder.append(",Ad Unit ID: ");
        string2 = this.zzd;
        return h30_0.a(stringBuilder, string2, "}");
    }

    public final /* synthetic */ void zza() {
        Context context = this.zza;
        this.zzs(context);
    }

    public final /* synthetic */ void zzb() {
        Context context = this.zza;
        this.zzs(context);
    }

    public final /* synthetic */ void zzc(zzgge zzgge2) {
        String string2;
        String string3;
        Object object;
        Object object2 = zzu.zzs();
        boolean bl2 = ((zzay)object2).zzj((Context)(object = this.zza), string3 = this.zzd, string2 = this.zze);
        if (!bl2) {
            zzgge2 = this.zza;
            object2 = zzu.zzs();
            object = this.zzd;
            string3 = this.zze;
            ((zzay)object2).zzd((Context)zzgge2, (String)object, string3);
            return;
        }
        object2 = new zzan(this);
        zzgge2.execute((Runnable)object2);
    }

    public final /* synthetic */ void zzd(zzgge zzgge2) {
        String string2;
        String string3;
        Object object;
        Object object2 = zzu.zzs();
        boolean bl2 = ((zzay)object2).zzj((Context)(object = this.zza), string3 = this.zzd, string2 = this.zze);
        if (!bl2) {
            zzgge2 = this.zza;
            object2 = zzu.zzs();
            object = this.zzd;
            string3 = this.zze;
            ((zzay)object2).zzd((Context)zzgge2, (String)object, string3);
            return;
        }
        object2 = new zzam(this);
        zzgge2.execute((Runnable)object2);
    }

    public final /* synthetic */ void zze() {
        zzay zzay2 = zzu.zzs();
        Context context = this.zza;
        zzay2.zzc(context);
    }

    public final /* synthetic */ void zzf() {
        zzay zzay2 = zzu.zzs();
        Context context = this.zza;
        zzay2.zzc(context);
    }

    public final /* synthetic */ void zzg() {
        this.zzg = 4;
        this.zzr();
    }

    public final /* synthetic */ void zzh(AtomicInteger object, int n3, int n4, int n7, DialogInterface dialogInterface, int n8) {
        int n10 = ((AtomicInteger)object).get();
        if (n10 != n3) {
            n3 = ((AtomicInteger)object).get();
            if (n3 == n4) {
                object = this.zzb;
                zzdxw zzdxw2 = zzdxw.zzb;
                ((zzdya)object).zzm(zzdxw2);
            } else {
                int n14 = ((AtomicInteger)object).get();
                if (n14 == n7) {
                    object = this.zzb;
                    zzdxw zzdxw3 = zzdxw.zzc;
                    ((zzdya)object).zzm(zzdxw3);
                } else {
                    object = this.zzb;
                    zzdxw zzdxw4 = zzdxw.zza;
                    ((zzdya)object).zzm(zzdxw4);
                }
            }
        }
        this.zzr();
    }

    public final /* synthetic */ void zzi(String string2, DialogInterface dialogInterface, int n3) {
        zzu.zzp();
        dialogInterface = new Intent("android.intent.action.SEND");
        string2 = Intent.createChooser((Intent)dialogInterface.setType("text/plain").putExtra("android.intent.extra.TEXT", string2), (CharSequence)"Share via");
        zzt.zzT(this.zza, (Intent)string2);
    }

    public final /* synthetic */ void zzj(int n3, int n4, int n7, int n8, int n10, DialogInterface object, int n14) {
        if (n14 == n3) {
            Object object2;
            Object object3 = this.zza;
            n3 = object3 instanceof Activity;
            if (n3 == 0) {
                zzm.zzi("Can not create dialog without Activity Context");
                return;
            }
            object3 = this.zzc;
            n4 = (int)(TextUtils.isEmpty((CharSequence)object3) ? 1 : 0);
            Object object4 = "No debug information";
            if (n4 == 0) {
                object3 = ((String)object3).replaceAll("\\+", "%20");
                object2 = new Uri.Builder();
                object3 = object2.encodedQuery((String)object3).build();
                object2 = new StringBuilder();
                zzu.zzp();
                object3 = zzt.zzP((Uri)object3);
                Iterator iterator = object3.keySet().iterator();
                while ((n10 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                    String string2 = (String)iterator.next();
                    ((StringBuilder)object2).append(string2);
                    object = " = ";
                    ((StringBuilder)object2).append((String)object);
                    string2 = (String)object3.get(string2);
                    ((StringBuilder)object2).append(string2);
                    string2 = "\n\n";
                    ((StringBuilder)object2).append(string2);
                }
                object3 = ((StringBuilder)object2).toString().trim();
                n4 = (int)(TextUtils.isEmpty((CharSequence)object3) ? 1 : 0);
                if (n4 == 0) {
                    object4 = object3;
                }
            }
            zzu.zzp();
            object3 = zzt.zzK(this.zza);
            object3.setMessage((CharSequence)object4);
            object3.setTitle((CharSequence)"Ad Information");
            object2 = new zzaj(this, (String)object4);
            object3.setPositiveButton((CharSequence)"Share", (DialogInterface.OnClickListener)object2);
            object2 = new zzak();
            object3.setNegativeButton((CharSequence)"Close", (DialogInterface.OnClickListener)object2);
            object3.create().show();
            return;
        }
        if (n14 == n4) {
            zzm.zze("Debug mode [Creative Preview] selected.");
            zzgge zzgge2 = zzcci.zza;
            zzai zzai2 = new zzai(this);
            zzgge2.execute(zzai2);
            return;
        }
        if (n14 == n7) {
            zzm.zze("Debug mode [Troubleshooting] selected.");
            zzgge zzgge3 = zzcci.zza;
            zzag zzag2 = new zzag(this);
            zzgge3.execute(zzag2);
            return;
        }
        if (n14 == n8) {
            Object object5 = this.zzb;
            zzgge zzgge4 = zzcci.zze;
            zzgge zzgge5 = zzcci.zza;
            n3 = (int)(((zzdya)object5).zzq() ? 1 : 0);
            if (n3 != 0) {
                object5 = new zzat(this);
                zzgge4.execute((Runnable)object5);
                return;
            }
            object5 = new zzaf(this, zzgge4);
            zzgge5.execute((Runnable)object5);
            return;
        }
        if (n14 == n10) {
            Object object6 = this.zzb;
            zzgge zzgge6 = zzcci.zze;
            zzgge zzgge7 = zzcci.zza;
            n3 = (int)(((zzdya)object6).zzq() ? 1 : 0);
            if (n3 != 0) {
                object6 = new zzae(this);
                zzgge6.execute((Runnable)object6);
                return;
            }
            object6 = new zzal(this, zzgge6);
            zzgge7.execute((Runnable)object6);
        }
    }

    public final /* synthetic */ void zzk() {
        zzay zzay2 = zzu.zzs();
        String string2 = this.zzd;
        String string3 = this.zze;
        String string4 = this.zzf;
        boolean bl2 = zzay2.zzm();
        Context context = this.zza;
        boolean bl3 = zzay2.zzj(context, string2, string3);
        zzay2.zzh(bl3);
        bl3 = zzay2.zzm();
        if (bl3) {
            if (!bl2 && !(bl2 = TextUtils.isEmpty((CharSequence)string4))) {
                zzay2.zze(context, string3, string4, string2);
            }
            zzm.zze("Device is linked for debug signals.");
            zzay2.zzi(context, "The device is successfully linked for troubleshooting.", false, true);
            return;
        }
        zzay2.zzd(context, string2, string3);
    }

    public final /* synthetic */ void zzl() {
        zzay zzay2 = zzu.zzs();
        Context context = this.zza;
        String string2 = this.zzd;
        String string3 = this.zze;
        boolean bl2 = zzay2.zzk(context, string2, string3);
        boolean bl3 = true;
        if (!bl2) {
            zzay2.zzi(context, "In-app preview failed to load because of a system error. Please try again later.", bl3, bl3);
            return;
        }
        String string4 = zzay2.zza;
        bl2 = "2".equals(string4);
        if (bl2) {
            zzm.zze("Creative is not pushed for this device.");
            zzay2.zzi(context, "There was no creative pushed from DFP to the device.", false, false);
            return;
        }
        String string5 = "1";
        string4 = zzay2.zza;
        bl2 = string5.equals(string4);
        if (bl2) {
            zzm.zze("The app is not linked for creative preview.");
            zzay2.zzd(context, string2, string3);
            return;
        }
        string3 = "0";
        string2 = zzay2.zza;
        boolean bl4 = string3.equals(string2);
        if (bl4) {
            zzm.zze("Device is linked for in app preview.");
            string2 = "The device is successfully linked for creative preview.";
            zzay2.zzi(context, string2, false, bl3);
        }
    }

    public final void zzm(MotionEvent motionEvent) {
        block7: {
            Runnable runnable2;
            int n3;
            block9: {
                float f5;
                float f6;
                int n4;
                float f7;
                int n7;
                int n8;
                float f8;
                int n10;
                int n14;
                int n15;
                block8: {
                    n15 = motionEvent.getActionMasked();
                    n14 = motionEvent.getHistorySize();
                    n10 = motionEvent.getPointerCount();
                    f8 = 0.0f;
                    if (n15 == 0) {
                        PointF pointF;
                        this.zzg = 0;
                        float f11 = motionEvent.getX(0);
                        float f12 = motionEvent.getY(0);
                        this.zzi = pointF = new PointF(f11, f12);
                        return;
                    }
                    n8 = this.zzg;
                    n3 = -1;
                    if (n8 == n3) break block7;
                    n7 = 5;
                    f7 = 7.0E-45f;
                    n4 = 1;
                    if (n8 != 0) break block8;
                    if (n15 == n7) {
                        Object object;
                        this.zzg = n7;
                        float f14 = motionEvent.getX(n4);
                        float f15 = motionEvent.getY(n4);
                        this.zzj = object = new PointF(f14, f15);
                        motionEvent = this.zzk;
                        object = this.zzl;
                        zzbeg zzbeg2 = zzbep.zzeG;
                        long l2 = (Long)zzba.zzc().zza(zzbeg2);
                        motionEvent.postDelayed((Runnable)object, l2);
                        return;
                    }
                    break block7;
                }
                if (n8 != n7) break block7;
                n8 = 2;
                float f16 = 2.8E-45f;
                if (n10 != n8) break block9;
                if (n15 != n8) break block7;
                float f17 = 0.0f;
                runnable2 = null;
                n10 = 0;
                for (n15 = 0; n15 < n14; ++n15) {
                    f16 = motionEvent.getHistoricalX(0, n15);
                    f7 = motionEvent.getHistoricalY(0, n15);
                    float f18 = motionEvent.getHistoricalX(n4, n15);
                    float f19 = motionEvent.getHistoricalY(n4, n15);
                    n8 = this.zzt(f16, f7, f18, f19) ^ n4;
                    n10 |= n8;
                }
                f17 = motionEvent.getX();
                boolean bl2 = this.zzt(f17, f6 = motionEvent.getY(), f8 = motionEvent.getX(n4), f5 = motionEvent.getY(n4));
                if (bl2 && n10 == 0) break block7;
            }
            this.zzg = n3;
            motionEvent = this.zzk;
            runnable2 = this.zzl;
            motionEvent.removeCallbacks(runnable2);
        }
    }

    public final void zzn(String string2) {
        this.zzd = string2;
    }

    public final void zzo(String string2) {
        this.zze = string2;
    }

    public final void zzp(String string2) {
        this.zzc = string2;
    }

    public final void zzq(String string2) {
        this.zzf = string2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzr() {
        WindowManager.BadTokenException badTokenException2;
        block6: {
            Object object;
            try {
                object = this.zza;
            }
            catch (WindowManager.BadTokenException badTokenException2) {
                break block6;
            }
            boolean bl2 = object instanceof Activity;
            if (!bl2) {
                object = "Can not create dialog without Activity Context";
                zzm.zzi((String)object);
                return;
            }
            object = zzu.zzs();
            object = ((zzay)object).zzb();
            bl2 = TextUtils.isEmpty((CharSequence)object);
            Object object2 = "Creative preview (enabled)";
            Object object3 = "Creative preview";
            boolean bl3 = true;
            if (bl3 == bl2) {
                object2 = object3;
            }
            object = zzu.zzs();
            bl2 = ((zzay)object).zzm();
            object3 = "Troubleshooting (enabled)";
            String string2 = "Troubleshooting";
            if (bl3 != bl2) {
                object3 = string2;
            }
            object = new ArrayList();
            string2 = "Ad information";
            int n3 = zzau.zzu((List)object, string2, bl3);
            int n4 = zzau.zzu((List)object, (String)object2, bl3);
            int n7 = zzau.zzu((List)object, (String)object3, bl3);
            object2 = zzbep.zzjj;
            object3 = zzba.zzc();
            object2 = ((zzben)object3).zza((zzbeg)object2);
            object2 = (Boolean)object2;
            boolean bl4 = (Boolean)object2;
            object3 = "Open ad inspector";
            int n8 = zzau.zzu((List)object, (String)object3, bl4);
            object3 = "Ad inspector settings";
            int n10 = zzau.zzu((List)object, (String)object3, bl4);
            zzu.zzp();
            object2 = this.zza;
            object2 = zzt.zzK((Context)object2);
            object3 = "Select a debug mode";
            object3 = object2.setTitle((CharSequence)object3);
            bl3 = false;
            Object object4 = null;
            object4 = new String[]{};
            object = ((ArrayList)object).toArray((T[])object4);
            object = (CharSequence[])object;
            object4 = new zzao(this, n3, n4, n7, n8, n10);
            object3.setItems((CharSequence[])object, (DialogInterface.OnClickListener)object4);
            object = object2.create();
            object.show();
            return;
        }
        com.google.android.gms.ads.internal.util.zze.zzb("", badTokenException2);
    }
}

