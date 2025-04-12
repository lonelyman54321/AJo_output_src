/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.RemoteException
 *  android.util.AttributeSet
 *  android.widget.FrameLayout
 *  android.widget.ImageView$ScaleType
 */
package com.google.android.gms.ads.nativead;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.ads.nativead.zzb;
import com.google.android.gms.ads.nativead.zzc;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public class MediaView
extends FrameLayout {
    private MediaContent zza;
    private boolean zzb;
    private ImageView.ScaleType zzc;
    private boolean zzd;
    private zzb zze;
    private zzc zzf;

    public MediaView(Context context) {
        super(context);
    }

    public MediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MediaView(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
    }

    public MediaView(Context context, AttributeSet attributeSet, int n3, int n4) {
        super(context, attributeSet, n3, n4);
    }

    public MediaContent getMediaContent() {
        return this.zza;
    }

    public void setImageScaleType(ImageView.ScaleType scaleType) {
        boolean bl2;
        this.zzd = bl2 = true;
        this.zzc = scaleType;
        Object object = this.zzf;
        if (object != null) {
            object = ((zzc)object).zza;
            ((NativeAdView)((Object)object)).zzc(scaleType);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setMediaContent(MediaContent object) {
        RemoteException remoteException2;
        block9: {
            block10: {
                boolean bl2;
                block8: {
                    Object object2;
                    block7: {
                        boolean bl3;
                        this.zzb = bl3 = true;
                        this.zza = object;
                        object2 = this.zze;
                        if (object2 != null) {
                            object2 = ((zzb)object2).zza;
                            ((NativeAdView)((Object)object2)).zzb((MediaContent)object);
                        }
                        if (object == null) {
                            return;
                        }
                        try {
                            object2 = object.zza();
                            if (object2 == null) return;
                            boolean bl4 = object.hasVideoContent();
                            if (!bl4) break block7;
                            object = ObjectWrapper.wrap((Object)this);
                            bl2 = object2.zzs((IObjectWrapper)object);
                            break block8;
                        }
                        catch (RemoteException remoteException2) {
                            break block9;
                        }
                    }
                    bl2 = object.zzb();
                    if (!bl2) break block10;
                    object = ObjectWrapper.wrap((Object)this);
                    bl2 = object2.zzr((IObjectWrapper)object);
                }
                if (bl2) return;
            }
            this.removeAllViews();
            return;
        }
        this.removeAllViews();
        zzm.zzh("", remoteException2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(zzb object) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    this.zze = object;
                    boolean bl2 = this.zzb;
                    if (bl2) {
                        MediaContent mediaContent = this.zza;
                        object = ((zzb)object).zza;
                        ((NativeAdView)((Object)object)).zzb(mediaContent);
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
    public final void zzb(zzc object) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    this.zzf = object;
                    boolean bl2 = this.zzd;
                    if (bl2) {
                        ImageView.ScaleType scaleType = this.zzc;
                        object = ((zzc)object).zza;
                        ((NativeAdView)((Object)object)).zzc(scaleType);
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

