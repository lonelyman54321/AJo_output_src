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
 *  android.content.ContextWrapper
 *  android.content.IntentFilter
 *  android.graphics.Rect
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.IBinder
 *  android.os.Looper
 *  android.os.PowerManager
 *  android.os.SystemClock
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.view.ViewTreeObserver$OnScrollChangedListener
 *  android.view.WindowManager$LayoutParams
 */
package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.PowerManager;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.zzaxt;
import com.google.android.gms.internal.ads.zzaxx;
import com.google.android.gms.internal.ads.zzayh;
import com.google.android.gms.internal.ads.zzayj;
import com.google.android.gms.internal.ads.zzayk;
import java.lang.ref.WeakReference;

public final class zzayl
implements View.OnAttachStateChangeListener,
ViewTreeObserver.OnGlobalLayoutListener,
ViewTreeObserver.OnScrollChangedListener,
Application.ActivityLifecycleCallbacks {
    private static final Handler zza;
    private final Context zzb;
    private Application zzc;
    private final PowerManager zzd;
    private final KeyguardManager zze;
    private BroadcastReceiver zzf;
    private final zzaxx zzg;
    private WeakReference zzh;
    private WeakReference zzi;
    private zzaxt zzj;
    private byte zzk;
    private int zzl;
    private long zzm;

    static {
        Handler handler;
        Looper looper = Looper.getMainLooper();
        zza = handler = new Handler(looper);
    }

    public zzayl(Context context, zzaxx object) {
        long l2;
        int n3 = -1;
        this.zzk = (byte)n3;
        this.zzl = n3;
        this.zzm = l2 = (long)-3;
        this.zzb = context = context.getApplicationContext();
        this.zzg = object;
        object = (PowerManager)context.getSystemService("power");
        this.zzd = object;
        object = (KeyguardManager)context.getSystemService("keyguard");
        this.zze = object;
        boolean bl2 = context instanceof Application;
        if (bl2) {
            context = (Application)context;
            this.zzc = context;
            super((Application)context, this);
            this.zzj = object;
        }
        this.zzd(null);
    }

    public static /* bridge */ /* synthetic */ void zzc(zzayl zzayl2) {
        zzayl2.zzf();
    }

    private final void zze(Activity activity, int n3) {
        WeakReference weakReference = this.zzi;
        if (weakReference != null && (activity = activity.getWindow()) != null) {
            activity = activity.peekDecorView();
            weakReference = this.zzb();
            if (weakReference != null && activity != null && (weakReference = weakReference.getRootView()) == (activity = activity.getRootView())) {
                this.zzl = n3;
            }
        }
    }

    private final void zzf() {
        block19: {
            Rect rect;
            int n3;
            long l2;
            int n4;
            WeakReference weakReference;
            int n7;
            block20: {
                block21: {
                    WindowManager.LayoutParams layoutParams;
                    Object object;
                    int n8;
                    block18: {
                        n7 = 1;
                        weakReference = this.zzi;
                        if (weakReference == null) break block19;
                        weakReference = this.zzb();
                        n4 = -1;
                        l2 = -3;
                        if (weakReference == null) {
                            this.zzm = l2;
                            this.zzk = (byte)n4;
                            return;
                        }
                        n3 = weakReference.getVisibility();
                        n8 = 0;
                        n3 = n3 != 0 ? 1 : 0;
                        int n10 = weakReference.isShown();
                        if (n10 == 0) {
                            n3 |= 2;
                        }
                        if ((object = this.zzd) != null && (n10 = object.isScreenOn()) == 0) {
                            n3 |= 4;
                        }
                        if ((n10 = ((zzaxx)((Object)(object = this.zzg))).zza()) != 0) break block20;
                        object = this.zze;
                        if (object == null || (n10 = object.inKeyguardRestrictedInputMode()) == 0) break block21;
                        n10 = zzayh.zza;
                        object = weakReference.getRootView();
                        if (object == null) {
                            object = weakReference;
                        }
                        object = object.getContext();
                        while (true) {
                            int n14 = object instanceof ContextWrapper;
                            layoutParams = null;
                            if (n14 == 0 || n8 >= (n14 = 10)) break;
                            n14 = object instanceof Activity;
                            if (n14 != 0) {
                                object = (Activity)object;
                                break block18;
                            }
                            object = ((ContextWrapper)object).getBaseContext();
                            n8 += n7;
                        }
                        n10 = 0;
                        object = null;
                    }
                    if (object == null) break block21;
                    rect = object.getWindow();
                    if (rect != null) {
                        layoutParams = rect.getAttributes();
                    }
                    if (layoutParams == null) break block21;
                    n7 = layoutParams.flags;
                    n8 = 524288;
                    if ((n7 &= n8) != 0) break block20;
                }
                n3 |= 8;
            }
            if ((n7 = weakReference.getGlobalVisibleRect(rect = new Rect())) == 0) {
                n3 |= 0x10;
            }
            if ((n7 = weakReference.getLocalVisibleRect(rect = new Rect())) == 0) {
                n3 |= 0x20;
            }
            n7 = weakReference.getWindowVisibility();
            int n15 = this.zzl;
            if (n15 != n4) {
                n7 = n15;
            }
            if (n7 != 0) {
                n3 |= 0x40;
            }
            if ((n7 = (int)this.zzk) != n3) {
                long l3;
                n7 = (byte)n3;
                this.zzk = (byte)n7;
                if (n3 == 0) {
                    l3 = SystemClock.elapsedRealtime();
                } else {
                    l3 = n3;
                    l3 = l2 - l3;
                }
                this.zzm = l3;
            }
        }
    }

    private final void zzg() {
        Handler handler = zza;
        zzayj zzayj2 = new zzayj(this);
        handler.post((Runnable)zzayj2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzh(View view) {
        boolean bl2 = (view = view.getViewTreeObserver()).isAlive();
        if (bl2) {
            WeakReference<View> weakReference;
            this.zzh = weakReference = new WeakReference<View>(view);
            view.addOnScrollChangedListener((ViewTreeObserver.OnScrollChangedListener)this);
            view.addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)this);
        }
        if ((view = this.zzf) == null) {
            view = new IntentFilter();
            view.addAction("android.intent.action.SCREEN_ON");
            view.addAction("android.intent.action.SCREEN_OFF");
            view.addAction("android.intent.action.USER_PRESENT");
            zzayk zzayk2 = new zzayk(this);
            this.zzf = zzayk2;
            Context context = this.zzb;
            context.registerReceiver((BroadcastReceiver)zzayk2, (IntentFilter)view);
        }
        if ((view = this.zzc) == null) return;
        try {
            zzaxt zzaxt2 = this.zzj;
            view.registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)zzaxt2);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzi(View view) {
        WeakReference weakReference;
        zzaxt zzaxt2 = null;
        try {
            weakReference = this.zzh;
            if (weakReference != null) {
                boolean bl2;
                weakReference = weakReference.get();
                if ((weakReference = (ViewTreeObserver)weakReference) != null && (bl2 = weakReference.isAlive())) {
                    weakReference.removeOnScrollChangedListener(this);
                    weakReference.removeGlobalOnLayoutListener(this);
                }
                this.zzh = null;
            }
        }
        catch (Exception exception) {}
        try {
            view = view.getViewTreeObserver();
            boolean bl3 = view.isAlive();
            if (bl3) {
                view.removeOnScrollChangedListener((ViewTreeObserver.OnScrollChangedListener)this);
                view.removeGlobalOnLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)this);
            }
        }
        catch (Exception exception) {}
        if ((view = this.zzf) != null) {
            try {
                weakReference = this.zzb;
                weakReference.unregisterReceiver((BroadcastReceiver)view);
            }
            catch (Exception exception) {}
            this.zzf = null;
        }
        if ((view = this.zzc) == null) return;
        try {
            zzaxt2 = this.zzj;
            view.unregisterActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)zzaxt2);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.zze(activity, 0);
        this.zzf();
    }

    public final void onActivityDestroyed(Activity activity) {
        this.zzf();
    }

    public final void onActivityPaused(Activity activity) {
        this.zze(activity, 4);
        this.zzf();
    }

    public final void onActivityResumed(Activity activity) {
        this.zze(activity, 0);
        this.zzf();
        this.zzg();
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.zzf();
    }

    public final void onActivityStarted(Activity activity) {
        this.zze(activity, 0);
        this.zzf();
    }

    public final void onActivityStopped(Activity activity) {
        this.zzf();
    }

    public final void onGlobalLayout() {
        this.zzf();
    }

    public final void onScrollChanged() {
        this.zzf();
    }

    public final void onViewAttachedToWindow(View view) {
        this.zzl = -1;
        this.zzh(view);
        this.zzf();
    }

    public final void onViewDetachedFromWindow(View view) {
        this.zzl = -1;
        this.zzf();
        this.zzg();
        this.zzi(view);
    }

    public final long zza() {
        View view;
        long l2 = this.zzm;
        long l3 = -2;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object <= 0 && (view = this.zzb()) == null) {
            this.zzm = l2 = (long)-3;
        }
        return this.zzm;
    }

    public final View zzb() {
        WeakReference weakReference = this.zzi;
        if (weakReference != null) {
            return (View)weakReference.get();
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void zzd(View view) {
        long l2;
        WeakReference<View> weakReference;
        View view2 = this.zzb();
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener((View.OnAttachStateChangeListener)this);
            this.zzi(view2);
        }
        this.zzi = weakReference = new WeakReference<View>(view);
        if (view != null) {
            int n3;
            int n4;
            IBinder iBinder = view.getWindowToken();
            if (iBinder != null || (n4 = view.getWindowVisibility()) != (n3 = 8)) {
                this.zzh(view);
            }
            view.addOnAttachStateChangeListener((View.OnAttachStateChangeListener)this);
            l2 = -2;
        } else {
            l2 = -3;
        }
        this.zzm = l2;
    }
}

