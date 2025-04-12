/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.BitmapFactory
 *  android.graphics.Shader$TileMode
 *  android.graphics.drawable.BitmapDrawable
 *  android.graphics.drawable.Drawable
 *  android.text.TextUtils
 *  android.util.Base64
 *  android.view.GestureDetector
 *  android.view.GestureDetector$OnGestureListener
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnTouchListener
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.view.ViewTreeObserver$OnScrollChangedListener
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzbz;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbao;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbhs;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzccv;
import com.google.android.gms.internal.ads.zzdlo;
import com.google.android.gms.internal.ads.zzdlq;
import com.google.android.gms.internal.ads.zzdmo;
import com.google.android.gms.internal.ads.zzdmv;
import com.google.android.gms.internal.ads.zzdnp;
import com.google.android.gms.internal.ads.zzgbc;
import com.google.android.gms.internal.ads.zzgge;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class zzdmp
extends zzbhy
implements ViewTreeObserver.OnGlobalLayoutListener,
ViewTreeObserver.OnScrollChangedListener,
zzdnp {
    public static final zzgbc zza = zzgbc.zzp("2011", "1009", "3010");
    private final String zzb;
    private Map zzc;
    private FrameLayout zzd;
    private FrameLayout zze;
    private final zzgge zzf;
    private View zzg;
    private final int zzh;
    private zzdlo zzi;
    private zzbao zzj;
    private IObjectWrapper zzk;
    private zzbhs zzl;
    private boolean zzm;
    private boolean zzn;
    private GestureDetector zzo;

    public zzdmp(FrameLayout frameLayout, FrameLayout object, int n3) {
        int n4;
        Object object2 = new HashMap();
        this.zzc = object2;
        this.zzk = null;
        this.zzn = false;
        this.zzd = frameLayout;
        this.zze = object;
        this.zzh = n4 = 241806000;
        object = frameLayout.getClass().getCanonicalName();
        object2 = "com.google.android.gms.ads.formats.NativeContentAdView";
        n3 = (int)(((String)object2).equals(object) ? 1 : 0);
        if (n3 != 0) {
            object = "1007";
        } else {
            object2 = "com.google.android.gms.ads.formats.NativeAppInstallAdView";
            n3 = (int)(((String)object2).equals(object) ? 1 : 0);
            if (n3 != 0) {
                object = "2009";
            } else {
                object2 = "com.google.android.gms.ads.formats.UnifiedNativeAdView";
                ((String)object2).equals(object);
                object = "3012";
            }
        }
        this.zzb = object;
        zzu.zzx();
        zzccv.zza((View)frameLayout, this);
        zzu.zzx();
        zzccv.zzb((View)frameLayout, this);
        object = zzcci.zze;
        this.zzf = object;
        object2 = this.zzd.getContext();
        FrameLayout frameLayout2 = this.zzd;
        super((Context)object2, (View)frameLayout2);
        this.zzj = object;
        frameLayout.setOnTouchListener((View.OnTouchListener)this);
        frameLayout.setOnClickListener((View.OnClickListener)this);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzt(String object) {
        synchronized (this) {
            Throwable throwable2;
            block8: {
                FrameLayout frameLayout;
                block6: {
                    int n3;
                    BitmapDrawable bitmapDrawable;
                    Object object2;
                    block7: {
                        try {
                            object2 = this.zze;
                            object2 = object2.getContext();
                            frameLayout = new FrameLayout((Context)object2);
                            int n4 = -1;
                            object2 = new FrameLayout.LayoutParams(n4, n4);
                            frameLayout.setLayoutParams((ViewGroup.LayoutParams)object2);
                            object2 = this.zze;
                            object2 = object2.getContext();
                            n4 = 0;
                            bitmapDrawable = null;
                            frameLayout.setClickable(false);
                            frameLayout.setFocusable(false);
                            n3 = TextUtils.isEmpty((CharSequence)object);
                            if (n3 != 0) break block6;
                            Context context = object2.getApplicationContext();
                            if (context == null) break block7;
                            object2 = object2.getApplicationContext();
                        }
                        catch (Throwable throwable2) {
                            break block8;
                        }
                    }
                    if ((object2 = object2.getResources()) != null && (object2 = object2.getDisplayMetrics()) != null) {
                        try {
                            object = Base64.decode((String)object, (int)0);
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            object2 = "Encountered invalid base64 watermark.";
                            com.google.android.gms.ads.internal.util.client.zzm.zzk((String)object2, illegalArgumentException);
                            break block6;
                        }
                        n3 = ((Object)object).length;
                        object = BitmapFactory.decodeByteArray((byte[])object, (int)0, (int)n3);
                        bitmapDrawable = new BitmapDrawable((Bitmap)object);
                        int n7 = object2.densityDpi;
                        bitmapDrawable.setTargetDensity(n7);
                        object = Shader.TileMode.REPEAT;
                        bitmapDrawable.setTileModeXY((Shader.TileMode)object, (Shader.TileMode)object);
                        frameLayout.setBackground((Drawable)bitmapDrawable);
                    }
                }
                object = this.zze;
                object.addView((View)frameLayout);
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
    private final void zzu() {
        synchronized (this) {
            zzdmo zzdmo2 = new zzdmo(this);
            zzgge zzgge2 = this.zzf;
            zzgge2.execute(zzdmo2);
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzv() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    Object object = zzbep.zzlA;
                    zzben zzben2 = zzba.zzc();
                    object = zzben2.zza((zzbeg)object);
                    object = (Boolean)object;
                    int n3 = ((Boolean)object).booleanValue();
                    if (n3 != 0 && (n3 = ((zzdlo)(object = this.zzi)).zza()) != 0) {
                        zzben2 = this.zzd;
                        zzben2 = zzben2.getContext();
                        zzdlo zzdlo2 = this.zzi;
                        zzdmv zzdmv2 = new zzdmv(zzdlo2, this);
                        object = new GestureDetector((Context)zzben2, (GestureDetector.OnGestureListener)zzdmv2);
                        this.zzo = object;
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
    public final void onClick(View view) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    boolean bl2;
                    zzdlo zzdlo2 = this.zzi;
                    if (zzdlo2 != null && (bl2 = zzdlo2.zzU())) {
                        zzdlo2 = this.zzi;
                        zzdlo2.zzv();
                        zzdlo zzdlo3 = this.zzi;
                        FrameLayout frameLayout = this.zzd;
                        Map map2 = this.zzl();
                        Map map3 = this.zzm();
                        zzdlo3.zzD(view, (View)frameLayout, map2, map3, false);
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
                    zzdlo zzdlo2 = this.zzi;
                    if (zzdlo2 != null) {
                        FrameLayout frameLayout = this.zzd;
                        Map map2 = this.zzl();
                        Map map3 = this.zzm();
                        boolean bl2 = zzdlo.zzX((View)frameLayout);
                        zzdlo2.zzB((View)frameLayout, map2, map3, bl2);
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
                    zzdlo zzdlo2 = this.zzi;
                    if (zzdlo2 != null) {
                        FrameLayout frameLayout = this.zzd;
                        Map map2 = this.zzl();
                        Map map3 = this.zzm();
                        boolean bl2 = zzdlo.zzX((View)frameLayout);
                        zzdlo2.zzB((View)frameLayout, map2, map3, bl2);
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
    public final boolean onTouch(View object, MotionEvent motionEvent) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        Object object2 = this.zzi;
                        if (object2 == null) break block4;
                        FrameLayout frameLayout = this.zzd;
                        ((zzdlo)object2).zzK((View)object, motionEvent, (View)frameLayout);
                        object = zzbep.zzlA;
                        object2 = zzba.zzc();
                        object = ((zzben)object2).zza((zzbeg)object);
                        object = (Boolean)object;
                        int n3 = ((Boolean)object).booleanValue();
                        if (n3 == 0 || (object = this.zzo) == null || (n3 = ((zzdlo)(object = this.zzi)).zza()) == 0) break block4;
                        object = this.zzo;
                        object.onTouchEvent(motionEvent);
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
    public final IObjectWrapper zzb(String object) {
        synchronized (this) {
            object = this.zzg((String)object);
            return ObjectWrapper.wrap(object);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzc() {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                boolean bl2;
                block5: {
                    try {
                        bl2 = this.zzn;
                        if (!bl2) break block5;
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    return;
                }
                Object object = this.zzi;
                if (object != null) {
                    ((zzdlo)object).zzS(this);
                    this.zzi = null;
                }
                object = this.zzc;
                object.clear();
                object = this.zzd;
                object.removeAllViews();
                object = this.zze;
                object.removeAllViews();
                this.zzc = null;
                this.zzd = null;
                this.zze = null;
                this.zzg = null;
                this.zzj = null;
                this.zzn = bl2 = true;
                return;
            }
            throw throwable2;
        }
    }

    public final void zzd(IObjectWrapper iObjectWrapper) {
        iObjectWrapper = (MotionEvent)ObjectWrapper.unwrap(iObjectWrapper);
        FrameLayout frameLayout = this.zzd;
        this.onTouch((View)frameLayout, (MotionEvent)iObjectWrapper);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzdv(String string2, IObjectWrapper object) {
        synchronized (this) {
            object = ObjectWrapper.unwrap((IObjectWrapper)object);
            object = (View)object;
            boolean bl2 = true;
            this.zzq(string2, (View)object, bl2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzdw(IObjectWrapper object) {
        synchronized (this) {
            zzdlo zzdlo2 = this.zzi;
            object = ObjectWrapper.unwrap((IObjectWrapper)object);
            object = (View)object;
            zzdlo2.zzM((View)object);
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzdx(zzbhs zzbhs2) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                block5: {
                    try {
                        boolean bl2 = this.zzn;
                        if (bl2) break block5;
                        this.zzm = bl2 = true;
                        this.zzl = zzbhs2;
                        Object object = this.zzi;
                        if (object != null) {
                            object = ((zzdlo)object).zzc();
                            ((zzdlq)object).zzb(zzbhs2);
                            return;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
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
    public final void zzdy(IObjectWrapper iObjectWrapper) {
        synchronized (this) {
            boolean bl2 = this.zzn;
            if (bl2) {
                return;
            }
            this.zzk = iObjectWrapper;
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzdz(IObjectWrapper object) {
        synchronized (this) {
            Throwable throwable2;
            block11: {
                boolean bl2;
                block10: {
                    try {
                        bl2 = this.zzn;
                        if (!bl2) break block10;
                    }
                    catch (Throwable throwable2) {
                        break block11;
                    }
                    return;
                }
                bl2 = (object = ObjectWrapper.unwrap((IObjectWrapper)object)) instanceof zzdlo;
                if (!bl2) {
                    object = "Not an instance of native engine. This is most likely a transient error";
                    com.google.android.gms.ads.internal.util.client.zzm.zzj((String)object);
                    return;
                }
                Object object2 = this.zzi;
                if (object2 != null) {
                    ((zzdlo)object2).zzS(this);
                }
                this.zzu();
                this.zzi = object = (zzdlo)object;
                ((zzdlo)object).zzR(this);
                object = this.zzi;
                object2 = this.zzd;
                ((zzdlo)object).zzJ((View)object2);
                object = this.zzi;
                object2 = this.zze;
                ((zzdlo)object).zzu((View)object2);
                boolean bl3 = this.zzm;
                if (bl3) {
                    object = this.zzi;
                    object = ((zzdlo)object).zzc();
                    object2 = this.zzl;
                    ((zzdlq)object).zzb((zzbhs)object2);
                }
                object = zzbep.zzdT;
                object2 = zzba.zzc();
                object = ((zzben)object2).zza((zzbeg)object);
                bl3 = (Boolean)(object = (Boolean)object);
                if (bl3) {
                    object = this.zzi;
                    bl3 = TextUtils.isEmpty((CharSequence)(object = ((zzdlo)object).zzg()));
                    if (!bl3) {
                        object = this.zzi;
                        object = ((zzdlo)object).zzg();
                        this.zzt((String)object);
                    }
                }
                this.zzv();
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void zze(IObjectWrapper iObjectWrapper, int n3) {
        // MONITORENTER : this
        // MONITOREXIT : this
    }

    public final /* synthetic */ View zzf() {
        return this.zzd;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final View zzg(String object) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    boolean bl2 = this.zzn;
                    if (!bl2) {
                        Map map2 = this.zzc;
                        object = map2.get(object);
                        if ((object = (WeakReference)object) == null) return null;
                        object = ((Reference)object).get();
                        return (View)object;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return null;
            }
            throw throwable2;
        }
    }

    public final FrameLayout zzh() {
        return this.zze;
    }

    public final zzbao zzi() {
        return this.zzj;
    }

    public final IObjectWrapper zzj() {
        return this.zzk;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String zzk() {
        synchronized (this) {
            return this.zzb;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Map zzl() {
        synchronized (this) {
            return this.zzc;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Map zzm() {
        synchronized (this) {
            return this.zzc;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final Map zzn() {
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
    public final JSONObject zzo() {
        synchronized (this) {
            try {
                zzdlo zzdlo2 = this.zzi;
                if (zzdlo2 == null) return null;
                FrameLayout frameLayout = this.zzd;
                Map map2 = this.zzl();
                Map map3 = this.zzm();
                return zzdlo2.zzi((View)frameLayout, map2, map3);
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
    public final JSONObject zzp() {
        synchronized (this) {
            try {
                zzdlo zzdlo2 = this.zzi;
                if (zzdlo2 == null) return null;
                FrameLayout frameLayout = this.zzd;
                Map map2 = this.zzl();
                Map map3 = this.zzm();
                return zzdlo2.zzk((View)frameLayout, map2, map3);
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
    public final void zzq(String string2, View object, boolean bl2) {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                block6: {
                    boolean bl3;
                    try {
                        bl2 = this.zzn;
                        if (bl2) break block6;
                        if (object == null) {
                            object = this.zzc;
                            object.remove(string2);
                            return;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                    Object object2 = this.zzc;
                    WeakReference<Object> weakReference = new WeakReference<Object>(object);
                    object2.put(string2, weakReference);
                    object2 = "1098";
                    bl2 = ((String)object2).equals(string2);
                    if (!bl2 && !(bl3 = ((String)(object2 = "3011")).equals(string2))) {
                        bl3 = this.zzh;
                        if (bl3 = (boolean)zzbz.zzi((int)(bl3 ? 1 : 0))) {
                            object.setOnTouchListener((View.OnTouchListener)this);
                        }
                        bl3 = true;
                        object.setClickable(bl3);
                        object.setOnClickListener((View.OnClickListener)this);
                        return;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    public final FrameLayout zzr() {
        return this.zzd;
    }

    public final /* synthetic */ void zzs() {
        Context context;
        View view = this.zzg;
        if (view == null) {
            context = this.zzd.getContext();
            this.zzg = view = new View(context);
            int n3 = -1;
            context = new FrameLayout.LayoutParams(n3, 0);
            view.setLayoutParams((ViewGroup.LayoutParams)context);
        }
        if ((view = this.zzd) != (context = this.zzg.getParent())) {
            view = this.zzd;
            context = this.zzg;
            view.addView((View)context);
        }
    }
}

