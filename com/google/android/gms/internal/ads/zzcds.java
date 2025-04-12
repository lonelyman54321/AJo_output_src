/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.text.TextUtils
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewParent
 *  android.view.WindowManager$LayoutParams
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.ImageView
 *  android.widget.TextView
 */
package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.ads.impl.R$string;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbfb;
import com.google.android.gms.internal.ads.zzbfe;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzcdj;
import com.google.android.gms.internal.ads.zzcdk;
import com.google.android.gms.internal.ads.zzcdl;
import com.google.android.gms.internal.ads.zzcdm;
import com.google.android.gms.internal.ads.zzcdn;
import com.google.android.gms.internal.ads.zzcdo;
import com.google.android.gms.internal.ads.zzcdp;
import com.google.android.gms.internal.ads.zzcdq;
import com.google.android.gms.internal.ads.zzcdr;
import com.google.android.gms.internal.ads.zzced;
import com.google.android.gms.internal.ads.zzcee;
import com.google.android.gms.internal.ads.zzcef;
import com.google.android.gms.internal.ads.zzceg;
import com.google.android.gms.internal.ads.zzcew;
import com.google.android.gms.internal.ads.zzfuv;
import com.google.android.gms.internal.ads.zzgge;
import java.util.HashMap;

public final class zzcds
extends FrameLayout
implements zzcdj {
    final zzceg zza;
    private final zzcee zzb;
    private final FrameLayout zzc;
    private final View zzd;
    private final zzbfe zze;
    private final long zzf;
    private final zzcdk zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private String zzn;
    private String[] zzo;
    private Bitmap zzp;
    private final ImageView zzq;
    private boolean zzr;

    public zzcds(Context context, zzcee zzcee2, int n3, boolean bl2, zzbfe zzbfe2, zzced zzced2) {
        long l2;
        zzcdk zzcdk2;
        zzcef zzcef2;
        FrameLayout frameLayout;
        zzcds zzcds2 = this;
        Context context2 = context;
        zzbfe zzbfe3 = zzbfe2;
        super(context);
        this.zzb = zzcee2;
        this.zze = zzbfe2;
        this.zzc = frameLayout = new FrameLayout(context);
        int n4 = -1;
        Object object = new FrameLayout.LayoutParams(n4, n4);
        this.addView((View)frameLayout, (ViewGroup.LayoutParams)object);
        Preconditions.checkNotNull(zzcee2.zzj());
        object = zzcee2.zzj().zza;
        Object object2 = zzcee2.zzn();
        Object object3 = zzcee2.zzdi();
        Object object4 = zzcee2.zzk();
        object = zzcef2;
        Object object5 = context;
        zzcef2 = new zzcef(context, (VersionInfoParcel)object2, (String)object3, zzbfe2, (zzbfb)object4);
        int n7 = 2;
        int n8 = n3;
        if (n3 == n7) {
            boolean bl3 = zzcdl.zza(zzcee2);
            object = zzcdk2;
            object2 = zzcef2;
            object3 = zzcee2;
            zzcdk2 = new zzcew(context, zzcef2, zzcee2, bl2, bl3, zzced2);
        } else {
            zzcef zzcef3;
            boolean bl4 = zzcdl.zza(zzcee2);
            object2 = zzcee2.zzn();
            object3 = zzcee2.zzdi();
            object4 = zzcee2.zzk();
            object = zzcef3;
            zzcef3 = new zzcef(context, (VersionInfoParcel)object2, (String)object3, zzbfe2, (zzbfb)object4);
            object = zzcdk2;
            object2 = zzcee2;
            object4 = zzced2;
            super(context, zzcee2, bl2, bl4, zzced2, zzcef3);
        }
        zzcds2.zzg = zzcdk2;
        super(context2);
        zzcds2.zzd = object;
        object.setBackgroundColor(0);
        int n10 = 17;
        super(n4, n4, n10);
        frameLayout.addView((View)zzcdk2, (ViewGroup.LayoutParams)object5);
        object5 = zzbep.zzF;
        object2 = zzba.zzc();
        object5 = (Boolean)((zzben)object2).zza((zzbeg)object5);
        n8 = (int)(((Boolean)object5).booleanValue() ? 1 : 0);
        if (n8 != 0) {
            object5 = new FrameLayout.LayoutParams(n4, n4);
            frameLayout.addView((View)object, (ViewGroup.LayoutParams)object5);
            frameLayout.bringChildToFront((View)object);
        }
        object = zzbep.zzC;
        object5 = zzba.zzc();
        object = (Boolean)((zzben)object5).zza((zzbeg)object);
        n7 = (int)(((Boolean)object).booleanValue() ? 1 : 0);
        if (n7 != 0) {
            this.zzn();
        }
        object = new ImageView(context2);
        zzcds2.zzq = object;
        object = zzbep.zzH;
        zzcds2.zzf = l2 = ((Long)zzba.zzc().zza((zzbeg)object)).longValue();
        object = zzbep.zzE;
        object5 = zzba.zzc();
        object = (Boolean)((zzben)object5).zza((zzbeg)object);
        n7 = (int)(((Boolean)object).booleanValue() ? 1 : 0);
        zzcds2.zzk = n7;
        if (zzbfe3 != null) {
            n8 = 1;
            object = n8 != n7 ? "0" : "1";
            object5 = "spinner_used";
            zzbfe3.zzd((String)object5, (String)object);
        }
        zzcds2.zza = object = new zzceg(this);
        zzcdk2.zzr(this);
    }

    private final void zzJ() {
        boolean bl2;
        Activity activity = this.zzb.zzi();
        if (activity != null && (bl2 = this.zzi) && !(bl2 = this.zzj)) {
            activity = this.zzb.zzi().getWindow();
            int n3 = 128;
            activity.clearFlags(n3);
            bl2 = false;
            activity = null;
            this.zzi = false;
        }
    }

    private final void zzK(String string2, String ... stringArray) {
        String string3;
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        Object object = this.zzl();
        if (object != null) {
            string3 = "playerId";
            object = ((Integer)object).toString();
            hashMap.put(string3, object);
        }
        hashMap.put("event", string2);
        int n3 = stringArray.length;
        object = null;
        string3 = null;
        String string4 = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            String string5 = stringArray[i3];
            if (string4 == null) {
                string4 = string5;
                continue;
            }
            hashMap.put(string4, string5);
            string4 = null;
        }
        this.zzb.zzd("onVideoEvent", hashMap);
    }

    private final boolean zzL() {
        ViewParent viewParent = this.zzq.getParent();
        return viewParent != null;
    }

    public static /* bridge */ /* synthetic */ void zzm(zzcds zzcds2, String string2, String[] stringArray) {
        zzcds2.zzK(string2, stringArray);
    }

    public final void finalize() {
        Throwable throwable2;
        block8: {
            block7: {
                Object object;
                try {
                    object = this.zza;
                }
                catch (Throwable throwable2) {
                    break block8;
                }
                ((zzceg)object).zza();
                object = this.zzg;
                if (object == null) break block7;
                zzgge zzgge2 = zzcci.zze;
                zzcdm zzcdm2 = new zzcdm((zzcdk)object);
                zzgge2.execute(zzcdm2);
            }
            super.finalize();
            return;
        }
        super.finalize();
        throw throwable2;
    }

    public final void onWindowFocusChanged(boolean bl2) {
        Object object;
        super.onWindowFocusChanged(bl2);
        if (bl2) {
            object = this.zza;
            object.zzb();
        } else {
            long l2;
            object = this.zza;
            object.zza();
            this.zzm = l2 = this.zzl;
        }
        object = zzt.zza;
        zzcdo zzcdo2 = new zzcdo(this, bl2);
        object.post(zzcdo2);
    }

    public final void onWindowVisibilityChanged(int n3) {
        super.onWindowVisibilityChanged(n3);
        if (n3 == 0) {
            zzceg zzceg2 = this.zza;
            zzceg2.zzb();
            n3 = 1;
        } else {
            long l2;
            this.zza.zza();
            this.zzm = l2 = this.zzl;
            n3 = 0;
            Object var2_3 = null;
        }
        zzfuv zzfuv2 = zzt.zza;
        zzcdr zzcdr2 = new zzcdr(this, n3 != 0);
        zzfuv2.post(zzcdr2);
    }

    public final void zzA(int n3) {
        zzcdk zzcdk2 = this.zzg;
        if (zzcdk2 == null) {
            return;
        }
        zzcdk2.zzz(n3);
    }

    public final void zzB(int n3) {
        zzcdk zzcdk2 = this.zzg;
        if (zzcdk2 == null) {
            return;
        }
        zzcdk2.zzA(n3);
    }

    public final void zzC(int n3) {
        Object object = zzbep.zzF;
        zzben zzben2 = zzba.zzc();
        object = (Boolean)zzben2.zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (bl2) {
            this.zzc.setBackgroundColor(n3);
            object = this.zzd;
            object.setBackgroundColor(n3);
        }
    }

    public final void zzD(int n3) {
        zzcdk zzcdk2 = this.zzg;
        if (zzcdk2 == null) {
            return;
        }
        zzcdk2.zzB(n3);
    }

    public final void zzE(String string2, String[] stringArray) {
        this.zzn = string2;
        this.zzo = stringArray;
    }

    public final void zzF(int n3, int n4, int n7, int n8) {
        Object object;
        boolean bl2 = com.google.android.gms.ads.internal.util.zze.zzc();
        if (bl2) {
            String string2 = ";w:";
            object = fQ2.a("Set video bounds to x:", ";y:", string2, n3, n4);
            ((StringBuilder)object).append(n7);
            String string3 = ";h:";
            ((StringBuilder)object).append(string3);
            ((StringBuilder)object).append(n8);
            object = ((StringBuilder)object).toString();
            com.google.android.gms.ads.internal.util.zze.zza((String)object);
        }
        if (n7 != 0 && n8 != 0) {
            object = new FrameLayout.LayoutParams(n7, n8);
            n7 = 0;
            object.setMargins(n3, n4, 0, 0);
            FrameLayout frameLayout = this.zzc;
            frameLayout.setLayoutParams((ViewGroup.LayoutParams)object);
            this.requestLayout();
        }
    }

    public final void zzG(float f5) {
        zzcdk zzcdk2 = this.zzg;
        if (zzcdk2 == null) {
            return;
        }
        zzcdk2.zzb.zze(f5);
        zzcdk2.zzn();
    }

    public final void zzH(float f5, float f6) {
        zzcdk zzcdk2 = this.zzg;
        if (zzcdk2 != null) {
            zzcdk2.zzu(f5, f6);
        }
    }

    public final void zzI() {
        zzcdk zzcdk2 = this.zzg;
        if (zzcdk2 == null) {
            return;
        }
        zzcdk2.zzb.zzd(false);
        zzcdk2.zzn();
    }

    public final void zza() {
        Object object = zzbep.zzbT;
        zzben zzben2 = zzba.zzc();
        object = (Boolean)zzben2.zza((zzbeg)object);
        boolean bl2 = object.booleanValue();
        if (bl2) {
            object = this.zza;
            object.zza();
        }
        object = new String[]{};
        this.zzK("ended", (String)object);
        this.zzJ();
    }

    public final void zzb(String stringArray, String string2) {
        stringArray = new String[]{"what", stringArray, "extra", string2};
        this.zzK("error", stringArray);
    }

    public final void zzc(String stringArray, String string2) {
        stringArray = new String[]{"what", "ExoPlayerAdapter exception", "extra", string2};
        this.zzK("exception", stringArray);
    }

    public final void zzd() {
        String[] stringArray = new String[]{};
        this.zzK("pause", stringArray);
        this.zzJ();
        this.zzh = false;
    }

    /*
     * WARNING - void declaration
     */
    public final void zze() {
        boolean bl2;
        Object object = zzbep.zzbT;
        zzben zzben2 = zzba.zzc();
        object = (Boolean)zzben2.zza((zzbeg)object);
        boolean n3 = (Boolean)object;
        if (n3) {
            object = this.zza;
            ((zzceg)object).zzb();
        }
        object = this.zzb.zzi();
        boolean bl3 = true;
        if (object != null && !(bl2 = this.zzi)) {
            void var3_9;
            object = this.zzb.zzi().getWindow().getAttributes();
            int n4 = ((WindowManager.LayoutParams)object).flags;
            int n7 = 128;
            int n8 = n4 & n7;
            if (n8 != 0) {
                boolean bl4 = true;
            } else {
                boolean bl5 = false;
                object = null;
            }
            this.zzj = var3_9;
            if (var3_9 == false) {
                object = this.zzb.zzi().getWindow();
                object.addFlags(n7);
                this.zzi = bl3;
            }
        }
        this.zzh = bl3;
    }

    public final void zzf() {
        long l2;
        long l3;
        long l4;
        long l7;
        String[] stringArray = this.zzg;
        if (stringArray != null && (l7 = (l4 = (l3 = this.zzm) - (l2 = 0L)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) {
            int n3 = stringArray.zzc();
            float f5 = n3;
            Object object = this.zzg;
            int n4 = ((zzcdk)object).zze();
            int n7 = ((zzcdk)object).zzd();
            float f6 = 1000.0f;
            String string2 = String.valueOf(f5 /= f6);
            String string3 = String.valueOf(n4);
            String string4 = "videoHeight";
            String string5 = String.valueOf(n7);
            String string6 = "duration";
            String string7 = "videoWidth";
            stringArray = new String[]{string6, string2, string7, string3, string4, string5};
            object = "canplaythrough";
            this.zzK((String)object, stringArray);
        }
    }

    public final void zzg() {
        this.zzd.setVisibility(4);
        zzfuv zzfuv2 = zzt.zza;
        zzcdn zzcdn2 = new zzcdn(this);
        zzfuv2.post(zzcdn2);
    }

    public final void zzh() {
        this.zza.zzb();
        zzfuv zzfuv2 = zzt.zza;
        zzcdp zzcdp2 = new zzcdp(this);
        zzfuv2.post(zzcdp2);
    }

    public final void zzi() {
        long l2;
        zzcdq zzcdq2;
        Object object;
        boolean bl2 = this.zzr;
        if (bl2 && (object = this.zzp) != null && !(bl2 = this.zzL())) {
            object = this.zzq;
            zzcdq2 = this.zzp;
            object.setImageBitmap((Bitmap)zzcdq2);
            this.zzq.invalidate();
            object = this.zzc;
            zzcdq2 = this.zzq;
            int n3 = -1;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(n3, n3);
            object.addView((View)zzcdq2, (ViewGroup.LayoutParams)layoutParams);
            object = this.zzc;
            zzcdq2 = this.zzq;
            object.bringChildToFront((View)zzcdq2);
        }
        this.zza.zza();
        this.zzm = l2 = this.zzl;
        object = zzt.zza;
        zzcdq2 = new zzcdq(this);
        object.post((Runnable)zzcdq2);
    }

    public final void zzj(int n3, int n4) {
        Bitmap bitmap;
        zzbeg zzbeg2;
        block3: {
            block2: {
                int n7 = this.zzk;
                if (n7 == 0) break block2;
                zzbeg2 = zzbep.zzG;
                Integer n8 = (Integer)zzba.zzc().zza(zzbeg2);
                int n10 = n8;
                n3 /= n10;
                n10 = 1;
                n3 = Math.max(n3, n10);
                zzben zzben2 = zzba.zzc();
                n7 = (Integer)zzben2.zza(zzbeg2);
                n4 = Math.max(n4 / n7, n10);
                zzbeg2 = this.zzp;
                if (zzbeg2 == null || (n7 = zzbeg2.getWidth()) != n3 || (n7 = (zzbeg2 = this.zzp).getHeight()) != n4) break block3;
            }
            return;
        }
        zzbeg2 = Bitmap.Config.ARGB_8888;
        this.zzp = bitmap = Bitmap.createBitmap((int)n3, (int)n4, (Bitmap.Config)zzbeg2);
        this.zzr = false;
    }

    public final void zzk() {
        Object object;
        Object object2;
        boolean bl2 = this.zzh;
        if (bl2 && (bl2 = this.zzL())) {
            object2 = this.zzc;
            object = this.zzq;
            object2.removeView((View)object);
        }
        if ((object2 = this.zzg) != null && (object2 = this.zzp) != null) {
            long l2;
            long l3;
            object2 = zzu.zzB();
            long l4 = object2.elapsedRealtime();
            Object object3 = this.zzg;
            Bitmap bitmap = this.zzp;
            if ((object3 = object3.getBitmap(bitmap)) != null) {
                boolean bl3;
                this.zzr = bl3 = true;
            }
            object3 = zzu.zzB();
            long l7 = object3.elapsedRealtime() - l4;
            bl2 = com.google.android.gms.ads.internal.util.zze.zzc();
            if (bl2) {
                object2 = new StringBuilder("Spinner frame grab took ");
                ((StringBuilder)object2).append(l7);
                object = "ms";
                ((StringBuilder)object2).append((String)object);
                object2 = ((StringBuilder)object2).toString();
                com.google.android.gms.ads.internal.util.zze.zza((String)object2);
            }
            if ((l3 = (l2 = l7 - (l4 = this.zzf)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) > 0) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Spinner frame grab crossed jank threshold! Suspending spinner.");
                this.zzk = false;
                bl2 = false;
                this.zzp = null;
                object2 = this.zze;
                if (object2 != null) {
                    object = "spinner_jank";
                    object3 = Long.toString(l7);
                    ((zzbfe)object2).zzd((String)object, (String)object3);
                }
            }
        }
    }

    public final Integer zzl() {
        zzcdk zzcdk2 = this.zzg;
        if (zzcdk2 != null) {
            return zzcdk2.zzw();
        }
        return null;
    }

    public final void zzn() {
        Object object = this.zzg;
        if (object == null) {
            return;
        }
        object = object.getContext();
        TextView textView = new TextView((Context)object);
        object = zzu.zzo().zze();
        if (object == null) {
            object = "AdMob - ";
        } else {
            int n3 = R$string.watermark_label_prefix;
            object = object.getString(n3);
        }
        Object object2 = this.zzg;
        object = String.valueOf(object);
        object2 = ((zzcdk)object2).zzj();
        object = ((String)object).concat((String)object2);
        textView.setText((CharSequence)object);
        textView.setTextColor(-65536);
        textView.setBackgroundColor(-256);
        object = this.zzc;
        int n4 = -2;
        object2 = new FrameLayout.LayoutParams(n4, n4, 17);
        object.addView((View)textView, (ViewGroup.LayoutParams)object2);
        this.zzc.bringChildToFront((View)textView);
    }

    public final void zzo() {
        this.zza.zza();
        zzcdk zzcdk2 = this.zzg;
        if (zzcdk2 != null) {
            zzcdk2.zzt();
        }
        this.zzJ();
    }

    public final /* synthetic */ void zzp() {
        String[] stringArray = new String[]{};
        this.zzK("firstFrameRendered", stringArray);
    }

    public final /* synthetic */ void zzq(boolean bl2) {
        String[] stringArray = String.valueOf(bl2);
        stringArray = new String[]{"hasWindowFocus", stringArray};
        this.zzK("windowFocusChanged", stringArray);
    }

    public final void zzr(Integer stringArray) {
        Object object = this.zzg;
        if (object == null) {
            return;
        }
        object = this.zzn;
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (!bl2) {
            object = this.zzg;
            String string2 = this.zzn;
            String[] stringArray2 = this.zzo;
            ((zzcdk)object).zzC(string2, stringArray2, (Integer)stringArray);
            return;
        }
        stringArray = new String[]{};
        this.zzK("no_src", stringArray);
    }

    public final void zzs() {
        zzcdk zzcdk2 = this.zzg;
        if (zzcdk2 == null) {
            return;
        }
        zzcdk2.zzb.zzd(true);
        zzcdk2.zzn();
    }

    public final void zzt() {
        long l2;
        int n3;
        long l3;
        long l4;
        long l7;
        long l8;
        zzcds zzcds2 = this;
        zzcdk zzcdk2 = this.zzg;
        if (zzcdk2 != null && (l8 = (l7 = (l4 = this.zzl) - (l3 = (long)(n3 = zzcdk2.zza()))) == 0L ? 0 : (l7 < 0L ? -1 : 1)) != false && (l8 = (l2 = l3 - (l4 = 0L)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) > 0) {
            float f5 = l3;
            Object object = zzbep.zzbR;
            object = (Boolean)zzba.zzc().zza((zzbeg)object);
            boolean bl2 = (Boolean)object;
            l8 = 1148846080;
            float f6 = 1000.0f;
            f5 /= f6;
            String string2 = "timeupdate";
            if (bl2) {
                String string3 = String.valueOf(f5);
                String string4 = String.valueOf(this.zzg.zzh());
                String string5 = String.valueOf(this.zzg.zzf());
                String string6 = String.valueOf(this.zzg.zzg());
                int n4 = this.zzg.zzb();
                String string7 = String.valueOf(n4);
                l4 = zzu.zzB().currentTimeMillis();
                String string8 = String.valueOf(l4);
                String string9 = "time";
                String string10 = "totalBytes";
                String string11 = "qoeCachedBytes";
                String string12 = "qoeLoadedBytes";
                String string13 = "droppedFrames";
                String string14 = "reportTime";
                String[] stringArray = new String[]{string9, string3, string10, string4, string11, string5, string12, string6, string13, string7, string14, string8};
                this.zzK(string2, stringArray);
            } else {
                object = "time";
                String[] stringArray = String.valueOf(f5);
                stringArray = new String[]{object, stringArray};
                this.zzK(string2, stringArray);
            }
            zzcds2.zzl = l3;
        }
    }

    public final void zzu() {
        zzcdk zzcdk2 = this.zzg;
        if (zzcdk2 == null) {
            return;
        }
        zzcdk2.zzo();
    }

    public final void zzv() {
        zzcdk zzcdk2 = this.zzg;
        if (zzcdk2 == null) {
            return;
        }
        zzcdk2.zzp();
    }

    public final void zzw(int n3) {
        zzcdk zzcdk2 = this.zzg;
        if (zzcdk2 == null) {
            return;
        }
        zzcdk2.zzq(n3);
    }

    public final void zzx(MotionEvent motionEvent) {
        zzcdk zzcdk2 = this.zzg;
        if (zzcdk2 == null) {
            return;
        }
        zzcdk2.dispatchTouchEvent(motionEvent);
    }

    public final void zzy(int n3) {
        zzcdk zzcdk2 = this.zzg;
        if (zzcdk2 == null) {
            return;
        }
        zzcdk2.zzx(n3);
    }

    public final void zzz(int n3) {
        zzcdk zzcdk2 = this.zzg;
        if (zzcdk2 == null) {
            return;
        }
        zzcdk2.zzy(n3);
    }
}

