/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.app.KeyguardManager
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.IntentFilter
 *  android.graphics.Rect
 *  android.os.Bundle
 *  android.os.PowerManager
 *  android.util.DisplayMetrics
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 *  android.view.ViewParent
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.view.ViewTreeObserver$OnScrollChangedListener
 *  android.view.WindowManager
 */
package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzcb;
import com.google.android.gms.ads.internal.util.zzcm;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbak;
import com.google.android.gms.internal.ads.zzbal;
import com.google.android.gms.internal.ads.zzbam;
import com.google.android.gms.internal.ads.zzban;
import com.google.android.gms.internal.ads.zzbba;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzcby;
import com.google.android.gms.internal.ads.zzfuv;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public final class zzbao
implements View.OnAttachStateChangeListener,
ViewTreeObserver.OnGlobalLayoutListener,
ViewTreeObserver.OnScrollChangedListener,
Application.ActivityLifecycleCallbacks {
    private static final long zzc;
    BroadcastReceiver zza;
    final WeakReference zzb;
    private final Context zzd;
    private Application zze;
    private final WindowManager zzf;
    private final PowerManager zzg;
    private final KeyguardManager zzh;
    private WeakReference zzi;
    private zzbba zzj;
    private final zzcb zzk;
    private boolean zzl;
    private int zzm;
    private final HashSet zzn;
    private final DisplayMetrics zzo;
    private final Rect zzp;

    static {
        zzbeg zzbeg2 = zzbep.zzbn;
        zzc = (Long)zzba.zzc().zza(zzbeg2);
    }

    public zzbao(Context object, View view) {
        boolean bl2;
        Object object2;
        WindowManager windowManager;
        int n3;
        long l2 = zzc;
        Context context = new zzcb(l2);
        this.zzk = context;
        this.zzl = false;
        this.zzm = n3 = -1;
        this.zzn = context = new HashSet();
        this.zzd = context = object.getApplicationContext();
        this.zzf = windowManager = (WindowManager)object.getSystemService("window");
        this.zzg = object2 = (PowerManager)context.getSystemService("power");
        object2 = (KeyguardManager)object.getSystemService("keyguard");
        this.zzh = object2;
        boolean bl3 = context instanceof Application;
        if (bl3) {
            context = (Application)context;
            this.zze = context;
            super((Application)context, this);
            this.zzj = object2;
        }
        object = object.getResources().getDisplayMetrics();
        this.zzo = object;
        super();
        this.zzp = object;
        ((Rect)object).right = n3 = windowManager.getDefaultDisplay().getWidth();
        context = windowManager.getDefaultDisplay();
        ((Rect)object).bottom = n3 = context.getHeight();
        object = this.zzb;
        if (object != null) {
            object = (View)((Reference)object).get();
        } else {
            bl2 = false;
            object = null;
        }
        if (object != null) {
            object.removeOnAttachStateChangeListener((View.OnAttachStateChangeListener)this);
            this.zzm((View)object);
        }
        this.zzb = object = new WeakReference(view);
        if (view != null) {
            bl2 = view.isAttachedToWindow();
            if (bl2) {
                this.zzl(view);
            }
            view.addOnAttachStateChangeListener((View.OnAttachStateChangeListener)this);
        }
    }

    public static /* bridge */ /* synthetic */ void zzb(zzbao zzbao2, int n3) {
        zzbao2.zzj(3);
    }

    private final int zzh(int n3) {
        float f5 = n3;
        float f6 = this.zzo.density;
        return (int)(f5 / f6);
    }

    private final void zzi(Activity activity, int n3) {
        WeakReference weakReference = this.zzb;
        if (weakReference != null && (activity = activity.getWindow()) != null) {
            weakReference = this.zzb;
            activity = activity.peekDecorView();
            if ((weakReference = (View)weakReference.get()) != null && activity != null && (weakReference = weakReference.getRootView()) == (activity = activity.getRootView())) {
                this.zzm = n3;
            }
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzj(int var1_1) {
        block44: {
            block46: {
                block42: {
                    block43: {
                        block45: {
                            block41: {
                                var2_2 = this;
                                var3_3 = var1_1;
                                var4_4 = this.zzn;
                                var5_7 /* !! */  = var4_4.isEmpty();
                                if (var5_7 /* !! */  != 0) {
                                    return;
                                }
                                var4_4 = this.zzb;
                                if (var4_4 == null) return;
                                var6_8 = var4_4 = var4_4.get();
                                var6_8 = (View)var4_4;
                                var7_9 = new Rect();
                                var8_10 = new Rect();
                                var9_11 = new Rect();
                                var10_12 = new Rect();
                                var5_7 /* !! */  = 2;
                                var11_13 /* !! */  = new int[var5_7 /* !! */ ];
                                var12_14 = new int[var5_7 /* !! */ ];
                                var13_15 = 1;
                                var14_16 = 0;
                                var15_17 = null;
                                if (var6_8 != null) {
                                    var16_18 = var6_8.getGlobalVisibleRect(var8_10);
                                    var17_19 = var6_8.getLocalVisibleRect(var9_11);
                                    var6_8.getHitRect(var10_12);
                                    try {
                                        var6_8.getLocationOnScreen(var11_13 /* !! */ );
                                        var6_8.getLocationInWindow((int[])var12_14);
                                    }
                                    catch (Exception var4_5) {
                                        var18_20 = "Failure getting view location.";
                                        com.google.android.gms.ads.internal.util.client.zzm.zzh((String)var18_20, var4_5);
                                    }
                                    var4_4 = zzbep.zzeR;
                                    var18_20 = zzba.zzc();
                                    var4_4 = (Boolean)var18_20.zza((zzbeg)var4_4);
                                    var5_7 /* !! */  = (int)var4_4.booleanValue();
                                    if (var5_7 /* !! */  != 0) {
                                        var7_9.left = var5_7 /* !! */  = (int)var12_14[0];
                                        var7_9.top = var5_7 /* !! */  = (int)var12_14[var13_15];
                                    } else {
                                        var7_9.left = var5_7 /* !! */  = var11_13 /* !! */ [0];
                                        var7_9.top = var5_7 /* !! */  = var11_13 /* !! */ [var13_15];
                                    }
                                    var5_7 /* !! */  = var7_9.left;
                                    var7_9.right = var19_21 = var6_8.getWidth() + var5_7 /* !! */ ;
                                    var5_7 /* !! */  = var7_9.top;
                                    var7_9.bottom = var19_21 = var6_8.getHeight() + var5_7 /* !! */ ;
                                    var11_13 /* !! */  = (int[])var6_8;
                                } else {
                                    var19_21 = 0;
                                    var11_13 /* !! */  = null;
                                    var16_18 = 0;
                                    var17_19 = 0;
                                }
                                var4_4 = zzbep.zzbq;
                                var12_14 = zzba.zzc();
                                var4_4 = (Boolean)var12_14.zza((zzbeg)var4_4);
                                var5_7 /* !! */  = (int)var4_4.booleanValue();
                                if (var5_7 /* !! */  == 0 || var11_13 /* !! */  == null) break block45;
                                try {
                                    var4_4 = new ArrayList();
                                    var12_14 = var11_13 /* !! */ .getParent();
                                }
                                catch (Exception var4_6) {
                                    break block41;
                                }
                                while ((var20_22 = var12_14 instanceof View) != 0) {
                                    var18_20 = var12_14;
                                    var18_20 = (View)var12_14;
                                    var15_17 = new Rect();
                                    var21_23 = var18_20.isScrollContainer();
                                    if (var21_23 != 0 && (var20_22 = (int)var18_20.getGlobalVisibleRect((Rect)var15_17)) != 0) {
                                        var15_17 = var2_2.zza((Rect)var15_17);
                                        var4_4.add(var15_17);
                                    }
                                    var12_14 = ((ViewParent)var12_14).getParent();
                                    var14_16 = 0;
                                    var15_17 = null;
                                }
lbl76:
                                // 3 sources

                                while (true) {
                                    var22_24 = var4_4;
                                    if (var11_13 /* !! */  == null) break block42;
                                    break block43;
                                    break;
                                }
                            }
                            var12_14 = "PositionWatcher.getParentScrollViewRects";
                            var15_17 = zzu.zzo();
                            var15_17.zzw(var4_6, (String)var12_14);
                            var4_4 = Collections.emptyList();
                            ** GOTO lbl76
                        }
                        var4_4 = Collections.emptyList();
                        ** while (true)
                    }
                    var23_25 = var11_13 /* !! */ .getWindowVisibility();
                    break block46;
                }
                var23_25 = 8;
            }
            var14_16 = var2_2.zzm;
            var20_22 = -1;
            if (var14_16 != var20_22) {
                var23_25 = var14_16;
            }
            zzu.zzp();
            var24_26 = zzt.zzw((View)var11_13 /* !! */ );
            var15_17 = zzbep.zzkC;
            var18_20 = zzba.zzc();
            var15_17 = (Boolean)var18_20.zza((zzbeg)var15_17);
            var14_16 = (int)var15_17.booleanValue();
            if (var14_16 != 0) {
                if (var6_8 != null) {
                    var6_8 = var2_2.zzg;
                    var15_17 = var2_2.zzh;
                    zzu.zzp();
                    var26_27 /* !! */  = zzt.zzS((View)var11_13 /* !! */ , (PowerManager)var6_8, (KeyguardManager)var15_17);
                    if (var26_27 /* !! */  != 0) {
                        if (var16_18) {
                            if (var17_19 != 0) {
                                var6_8 = zzbep.zzkF;
                                var15_17 = zzba.zzc();
                                var6_8 = (Integer)var15_17.zza((zzbeg)var6_8);
                                var27_28 = var6_8.intValue();
                                cfr_temp_0 = var24_26 - var27_28;
                                var26_27 /* !! */  = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                                if (var26_27 /* !! */  >= 0 && var23_25 == 0) lbl-1000:
                                // 2 sources

                                {
                                    while (true) {
                                        var26_27 /* !! */  = 1;
                                        var23_25 = 0;
                                        var12_14 = null;
lbl127:
                                        // 2 sources

                                        while (true) {
                                            var16_18 = 1;
                                            var17_19 = 1;
                                            break block44;
                                            break;
                                        }
                                        break;
                                    }
                                } else lbl-1000:
                                // 2 sources

                                {
                                    while (true) {
                                        var26_27 /* !! */  = 0;
                                        var6_8 = null;
                                        ** continue;
                                        break;
                                    }
                                }
                            }
lbl135:
                            // 3 sources

                            while (true) {
                                var26_27 /* !! */  = 0;
                                var6_8 = null;
                                var16_18 = 1;
                                var17_19 = 0;
                                break block44;
                                break;
                            }
                        }
lbl141:
                        // 3 sources

                        while (true) {
                            var26_27 /* !! */  = 0;
                            var6_8 = null;
                            var16_18 = 0;
                            break block44;
                            break;
                        }
                    }
                }
lbl146:
                // 6 sources

                while (true) {
                    var26_27 /* !! */  = 0;
                    var6_8 = null;
                    break block44;
                    break;
                }
            }
            if (var6_8 == null) ** GOTO lbl146
            var6_8 = var2_2.zzg;
            var15_17 = var2_2.zzh;
            zzu.zzp();
            var26_27 /* !! */  = zzt.zzS((View)var11_13 /* !! */ , (PowerManager)var6_8, (KeyguardManager)var15_17);
            if (var26_27 /* !! */  != 0) ** break;
            ** while (true)
            ** while (!var16_18)
lbl159:
            // 1 sources

            ** while (var17_19 == 0)
lbl160:
            // 1 sources

            ** while (var23_25 != 0)
lbl161:
            // 1 sources

            ** while (true)
        }
        var15_17 = zzbep.zzkH;
        var18_20 = zzba.zzc();
        var15_17 = (Boolean)var18_20.zza((zzbeg)var15_17);
        var14_16 = (int)var15_17.booleanValue();
        if (var14_16 != 0) {
            var15_17 = var2_2.zzg;
            var18_20 = var2_2.zzh;
            zzu.zzp();
            var14_16 = (int)zzt.zzS((View)var11_13 /* !! */ , (PowerManager)var15_17, (KeyguardManager)var18_20);
            if (var13_15 != var14_16) {
                var14_16 = 0;
                var15_17 = null;
            } else {
                var14_16 = 64;
            }
            if (var13_15 != var16_18) {
                var20_22 = 0;
                var18_20 = null;
            } else {
                var20_22 = 8;
            }
            var21_23 = var13_15 != var17_19 ? 0 : 16;
            if (var23_25 == 0) {
                var23_25 = 128;
            } else {
                var23_25 = 0;
                var12_14 = null;
            }
            var4_4 = zzbep.zzkF;
            var29_29 = zzba.zzc();
            var4_4 = (Integer)var29_29.zza((zzbeg)var4_4);
            var30_30 = var4_4.intValue();
            var5_7 /* !! */  = (int)(var24_26 == var30_30 ? 0 : (var24_26 < var30_30 ? -1 : 1));
            if (var5_7 /* !! */  >= 0) {
                var5_7 /* !! */  = 32;
            } else {
                var5_7 /* !! */  = 0;
                var4_4 = null;
            }
            var32_31 = var14_16 | var20_22 | var21_23;
            var5_7 /* !! */  = var5_7 /* !! */  | (var23_25 |= var32_31) | var26_27 /* !! */ ;
            zzu.zzp();
            var23_25 = 0;
            var12_14 = null;
            zzt.zzJ((View)var11_13 /* !! */ , var5_7 /* !! */ , null);
        }
        if (var3_3 == (var23_25 = 1) && (var5_7 /* !! */  = (int)(var4_4 = var2_2.zzk).zzb()) == 0) {
            var5_7 /* !! */  = (int)var2_2.zzl;
            if (var26_27 /* !! */  == var5_7 /* !! */ ) return;
        }
        if (var26_27 /* !! */  == 0 && (var5_7 /* !! */  = (int)var2_2.zzl) == 0) {
            var23_25 = 1;
            if (var3_3 == var23_25) return;
        } else {
            var23_25 = 1;
        }
        var30_30 = zzu.zzB().elapsedRealtime();
        var33_32 = var2_2.zzg;
        var34_33 = var33_32.isScreenOn();
        var35_34 = var11_13 /* !! */  != null && (var3_3 = (int)var11_13 /* !! */ .isAttachedToWindow()) != 0;
        var36_35 = var11_13 /* !! */  != null ? (var3_3 = var11_13 /* !! */ .getWindowVisibility()) : 8;
        var33_32 = var2_2.zzp;
        var37_36 = var2_2.zza((Rect)var33_32);
        var38_37 = var2_2.zza((Rect)var7_9);
        var39_38 = var2_2.zza(var8_10);
        var40_39 = var2_2.zza(var9_11);
        var41_40 = var2_2.zza(var10_12);
        var42_41 = var2_2.zzo.density;
        var4_4 = new zzbam(var30_30, var34_33, var35_34, var36_35, var37_36, var38_37, var39_38, (boolean)var16_18, var40_39, (boolean)var17_19, var24_26, var41_40, var42_41, (boolean)var26_27 /* !! */ , var22_24);
        var33_32 = var2_2.zzn.iterator();
        while (true) {
            if (!(var43_42 = var33_32.hasNext())) {
                var2_2.zzl = var26_27 /* !! */ ;
                return;
            }
            var7_9 = (zzban)var33_32.next();
            var7_9.zzdp((zzbam)var4_4);
        }
    }

    private final void zzk() {
        zzfuv zzfuv2 = zzt.zza;
        zzbak zzbak2 = new zzbak(this);
        zzfuv2.post(zzbak2);
    }

    private final void zzl(View view) {
        Object object;
        boolean bl2 = (view = view.getViewTreeObserver()).isAlive();
        if (bl2) {
            object = new WeakReference(view);
            this.zzi = object;
            view.addOnScrollChangedListener((ViewTreeObserver.OnScrollChangedListener)this);
            view.addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)this);
        }
        if ((view = this.zza) == null) {
            view = new IntentFilter();
            view.addAction("android.intent.action.SCREEN_ON");
            view.addAction("android.intent.action.SCREEN_OFF");
            view.addAction("android.intent.action.USER_PRESENT");
            object = new zzbal(this);
            this.zza = object;
            object = this.zzd;
            zzcm zzcm2 = zzu.zzv();
            BroadcastReceiver broadcastReceiver2 = this.zza;
            zzcm2.zzc((Context)object, broadcastReceiver2, (IntentFilter)view);
        }
        if ((view = this.zze) != null) {
            object = this.zzj;
            try {
                view.registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)object);
                return;
            }
            catch (Exception exception) {
                object = "Error registering activity lifecycle callbacks.";
                com.google.android.gms.ads.internal.util.client.zzm.zzh((String)object, exception);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzm(View object) {
        Object object2;
        block16: {
            block14: {
                IllegalStateException illegalStateException2;
                Object object3;
                block15: {
                    Object object4;
                    block11: {
                        Exception exception2;
                        block13: {
                            block12: {
                                object2 = null;
                                try {
                                    boolean bl2;
                                    object3 = this.zzi;
                                    if (object3 == null) break block11;
                                    object3 = ((Reference)object3).get();
                                    if ((object3 = (ViewTreeObserver)object3) == null || !(bl2 = object3.isAlive())) break block12;
                                    object3.removeOnScrollChangedListener((ViewTreeObserver.OnScrollChangedListener)this);
                                    object3.removeGlobalOnLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)this);
                                }
                                catch (Exception exception2) {
                                    break block13;
                                }
                            }
                            this.zzi = null;
                            break block11;
                        }
                        object4 = "Error while unregistering listeners from the last ViewTreeObserver.";
                        com.google.android.gms.ads.internal.util.client.zzm.zzh((String)object4, exception2);
                    }
                    try {
                        object = object.getViewTreeObserver();
                        boolean bl3 = object.isAlive();
                        if (bl3) {
                            object.removeOnScrollChangedListener((ViewTreeObserver.OnScrollChangedListener)this);
                            object.removeGlobalOnLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)this);
                        }
                    }
                    catch (Exception exception) {
                        object3 = "Error while unregistering listeners from the ViewTreeObserver.";
                        com.google.android.gms.ads.internal.util.client.zzm.zzh((String)object3, exception);
                    }
                    if ((object = this.zza) == null) break block16;
                    try {
                        object = zzu.zzv();
                        object3 = this.zzd;
                        object4 = this.zza;
                        ((zzcm)object).zzd((Context)object3, (BroadcastReceiver)object4);
                        break block14;
                    }
                    catch (Exception exception) {
                    }
                    catch (IllegalStateException illegalStateException2) {
                        break block15;
                    }
                    object3 = "ActiveViewUnit.stopScreenStatusMonitoring";
                    object4 = zzu.zzo();
                    ((zzcby)object4).zzw(exception, (String)object3);
                    break block14;
                }
                object3 = "Failed trying to unregister the receiver";
                com.google.android.gms.ads.internal.util.client.zzm.zzh((String)object3, illegalStateException2);
            }
            this.zza = null;
        }
        if ((object = this.zze) != null) {
            try {
                object2 = this.zzj;
                object.unregisterActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)object2);
                return;
            }
            catch (Exception exception) {
                object2 = "Error registering activity lifecycle callbacks.";
                com.google.android.gms.ads.internal.util.client.zzm.zzh((String)object2, exception);
            }
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.zzi(activity, 0);
        this.zzj(3);
        this.zzk();
    }

    public final void onActivityDestroyed(Activity activity) {
        this.zzj(3);
        this.zzk();
    }

    public final void onActivityPaused(Activity activity) {
        this.zzi(activity, 4);
        this.zzj(3);
        this.zzk();
    }

    public final void onActivityResumed(Activity activity) {
        this.zzi(activity, 0);
        this.zzj(3);
        this.zzk();
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.zzj(3);
        this.zzk();
    }

    public final void onActivityStarted(Activity activity) {
        this.zzi(activity, 0);
        this.zzj(3);
        this.zzk();
    }

    public final void onActivityStopped(Activity activity) {
        this.zzj(3);
        this.zzk();
    }

    public final void onGlobalLayout() {
        this.zzj(2);
        this.zzk();
    }

    public final void onScrollChanged() {
        this.zzj(1);
    }

    public final void onViewAttachedToWindow(View view) {
        this.zzm = -1;
        this.zzl(view);
        this.zzj(3);
    }

    public final void onViewDetachedFromWindow(View view) {
        this.zzm = -1;
        this.zzj(3);
        this.zzk();
        this.zzm(view);
    }

    public final Rect zza(Rect rect) {
        int n3 = rect.left;
        n3 = this.zzh(n3);
        int n4 = rect.top;
        n4 = this.zzh(n4);
        int n7 = rect.right;
        n7 = this.zzh(n7);
        int n8 = rect.bottom;
        n8 = this.zzh(n8);
        Rect rect2 = new Rect(n3, n4, n7, n8);
        return rect2;
    }

    public final void zzc(zzban zzban2) {
        this.zzn.add(zzban2);
        this.zzj(3);
    }

    public final /* synthetic */ void zzd() {
        this.zzj(3);
    }

    public final void zze(zzban zzban2) {
        this.zzn.remove(zzban2);
    }

    public final void zzf() {
        zzcb zzcb2 = this.zzk;
        long l2 = zzc;
        zzcb2.zza(l2);
    }

    public final void zzg(long l2) {
        this.zzk.zza(l2);
    }
}

