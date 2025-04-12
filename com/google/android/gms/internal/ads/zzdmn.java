/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnTouchListener
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.view.ViewTreeObserver$OnScrollChangedListener
 *  android.widget.FrameLayout
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbao;
import com.google.android.gms.internal.ads.zzbie;
import com.google.android.gms.internal.ads.zzccv;
import com.google.android.gms.internal.ads.zzdlo;
import com.google.android.gms.internal.ads.zzdnp;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class zzdmn
extends zzbie
implements ViewTreeObserver.OnGlobalLayoutListener,
ViewTreeObserver.OnScrollChangedListener,
zzdnp {
    private final WeakReference zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;
    private zzdlo zze;
    private zzbao zzf;

    public zzdmn(View view, HashMap object, HashMap entry) {
        boolean bl2;
        Object object2;
        Object object3;
        boolean bl3;
        Object object4 = new HashMap();
        this.zzb = object4;
        object4 = new HashMap();
        this.zzc = object4;
        object4 = new HashMap();
        this.zzd = object4;
        view.setOnTouchListener((View.OnTouchListener)this);
        view.setOnClickListener((View.OnClickListener)this);
        zzu.zzx();
        zzccv.zza(view, this);
        zzu.zzx();
        zzccv.zzb(view, this);
        object4 = new WeakReference(view);
        this.zza = object4;
        object = object.entrySet().iterator();
        while (bl3 = object.hasNext()) {
            boolean bl4;
            object4 = (Map.Entry)object.next();
            object3 = (String)object4.getKey();
            if ((object4 = (View)object4.getValue()) == null) continue;
            object2 = this.zzb;
            WeakReference<Object> weakReference = new WeakReference<Object>(object4);
            object2.put(object3, weakReference);
            object2 = "1098";
            boolean bl5 = ((String)object2).equals(object3);
            if (bl5 || (bl4 = ((String)(object2 = "3011")).equals(object3))) continue;
            object4.setOnTouchListener((View.OnTouchListener)this);
            bl4 = true;
            object4.setClickable(bl4);
            object4.setOnClickListener((View.OnClickListener)this);
        }
        object = this.zzd;
        object4 = this.zzb;
        object.putAll(object4);
        object = entry.entrySet().iterator();
        while (bl2 = object.hasNext()) {
            entry = object.next();
            object4 = (View)entry.getValue();
            if (object4 == null) continue;
            object3 = this.zzc;
            entry = (String)entry.getKey();
            object2 = new Object(object4);
            object3.put(entry, object2);
            object4.setOnTouchListener((View.OnTouchListener)this);
            bl2 = false;
            entry = null;
            object4.setClickable(false);
        }
        object = this.zzd;
        entry = this.zzc;
        object.putAll(entry);
        object = view.getContext();
        this.zzf = entry = new zzbao((Context)object, view);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onClick(View view) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    zzdlo zzdlo2 = this.zze;
                    if (zzdlo2 != null) {
                        View view2 = this.zzf();
                        Map map2 = this.zzl();
                        Map map3 = this.zzm();
                        boolean bl2 = true;
                        zzdlo2.zzD(view, view2, map2, map3, bl2);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onGlobalLayout() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    zzdlo zzdlo2 = this.zze;
                    if (zzdlo2 != null) {
                        View view = this.zzf();
                        Map map2 = this.zzl();
                        Map map3 = this.zzm();
                        View view2 = this.zzf();
                        boolean bl2 = zzdlo.zzX(view2);
                        zzdlo2.zzB(view, map2, map3, bl2);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onScrollChanged() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    zzdlo zzdlo2 = this.zze;
                    if (zzdlo2 != null) {
                        View view = this.zzf();
                        Map map2 = this.zzl();
                        Map map3 = this.zzm();
                        View view2 = this.zzf();
                        boolean bl2 = zzdlo.zzX(view2);
                        zzdlo2.zzB(view, map2, map3, bl2);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        zzdlo zzdlo2 = this.zze;
                        if (zzdlo2 == null) break block4;
                        View view2 = this.zzf();
                        zzdlo2.zzK(view, motionEvent, view2);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return false;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzb(IObjectWrapper object) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                block5: {
                    Object object2;
                    try {
                        object2 = this.zze;
                        if (object2 == null) break block5;
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    boolean bl2 = (object = ObjectWrapper.unwrap((IObjectWrapper)object)) instanceof View;
                    if (!bl2) {
                        object2 = "Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object";
                        zzm.zzj((String)object2);
                    }
                    object2 = this.zze;
                    object = (View)object;
                    ((zzdlo)object2).zzM((View)object);
                    return;
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzc(IObjectWrapper object) {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                try {
                    object = ObjectWrapper.unwrap((IObjectWrapper)object);
                }
                catch (Throwable throwable2) {
                    break block7;
                }
                boolean bl2 = object instanceof zzdlo;
                if (!bl2) {
                    object = "Not an instance of InternalNativeAd. This is most likely a transient error";
                    zzm.zzj((String)object);
                    return;
                }
                zzdlo zzdlo2 = this.zze;
                if (zzdlo2 != null) {
                    zzdlo2.zzS(this);
                }
                if (bl2 = ((zzdlo)(object = (zzdlo)object)).zzT()) {
                    this.zze = object;
                    ((zzdlo)object).zzR(this);
                    object = this.zze;
                    zzdlo2 = this.zzf();
                    ((zzdlo)object).zzJ((View)zzdlo2);
                    return;
                }
                object = "Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.";
                zzm.zzg((String)object);
                return;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzd() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    zzdlo zzdlo2 = this.zze;
                    if (zzdlo2 != null) {
                        zzdlo2.zzS(this);
                        zzdlo2 = null;
                        this.zze = null;
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return;
            }
            throw throwable2;
        }
    }

    public final View zzf() {
        return (View)this.zza.get();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final View zzg(String object) {
        synchronized (this) {
            Map map2 = this.zzd;
            object = map2.get(object);
            object = (WeakReference)object;
            if (object == null) {
                return null;
            }
            object = ((Reference)object).get();
            return (View)object;
        }
    }

    public final FrameLayout zzh() {
        return null;
    }

    public final zzbao zzi() {
        return this.zzf;
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final IObjectWrapper zzj() {
        // MONITORENTER : this
        // MONITOREXIT : this
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final String zzk() {
        // MONITORENTER : this
        // MONITOREXIT : this
        return "1007";
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Map zzl() {
        synchronized (this) {
            return this.zzd;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Map zzm() {
        synchronized (this) {
            return this.zzb;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Map zzn() {
        synchronized (this) {
            return this.zzc;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final JSONObject zzo() {
        // MONITORENTER : this
        // MONITOREXIT : this
        return null;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final JSONObject zzp() {
        synchronized (this) {
            try {
                zzdlo zzdlo2 = this.zze;
                if (zzdlo2 == null) return null;
                View view = this.zzf();
                Map map2 = this.zzl();
                Map map3 = this.zzm();
                return zzdlo2.zzk(view, map2, map3);
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzq(String string2, View view, boolean bl2) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    Object object = new WeakReference(view);
                    WeakReference<View> weakReference = this.zzd;
                    weakReference.put(string2, object);
                    object = "1098";
                    bl2 = ((String)object).equals(string2);
                    if (!bl2 && !(bl2 = ((String)(object = "3011")).equals(string2))) {
                        object = this.zzb;
                        weakReference = new WeakReference<View>(view);
                        object.put(string2, weakReference);
                        boolean bl3 = true;
                        view.setClickable(bl3);
                        view.setOnClickListener((View.OnClickListener)this);
                        view.setOnTouchListener((View.OnTouchListener)this);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return;
            }
            throw throwable2;
        }
    }
}

