/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 *  android.os.Message
 */
package com.google.android.gms.tagmanager;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tagmanager.Container;
import com.google.android.gms.tagmanager.ContainerHolder;
import com.google.android.gms.tagmanager.ContainerHolder$ContainerAvailableListener;
import com.google.android.gms.tagmanager.TagManager;
import com.google.android.gms.tagmanager.zzv;
import com.google.android.gms.tagmanager.zzw;

final class zzx
implements ContainerHolder {
    private final Looper zza;
    private Container zzb;
    private Container zzc;
    private final Status zzd;
    private zzw zze;
    private zzv zzf;
    private boolean zzg;
    private TagManager zzh;

    public zzx(Status status) {
        this.zzd = status;
        this.zza = null;
    }

    public zzx(TagManager tagManager, Looper object, Container container, zzv zzv2) {
        this.zzh = tagManager;
        if (object == null) {
            object = Looper.getMainLooper();
        }
        this.zza = object;
        this.zzb = container;
        this.zzf = zzv2;
        object = Status.RESULT_SUCCESS;
        this.zzd = object;
        tagManager.zza(this);
    }

    private final void zzf() {
        zzw zzw2 = this.zze;
        if (zzw2 != null) {
            String string2 = this.zzc.zzc();
            int n3 = 1;
            string2 = zzw2.obtainMessage(n3, string2);
            zzw2.sendMessage((Message)string2);
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Container getContainer() {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                block5: {
                    try {
                        boolean bl2 = this.zzg;
                        if (!bl2) break block5;
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    return null;
                }
                Container container = this.zzc;
                if (container == null) return this.zzb;
                this.zzb = container;
                this.zzc = null;
                return this.zzb;
            }
            throw throwable2;
        }
    }

    public final Status getStatus() {
        return this.zzd;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void refresh() {
        synchronized (this) {
            boolean bl2 = this.zzg;
            if (bl2) {
                return;
            }
            zzv zzv2 = this.zzf;
            zzv2.zzb();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void release() {
        synchronized (this) {
            boolean bl2 = this.zzg;
            if (bl2) {
                return;
            }
            this.zzg = bl2 = true;
            Object object = this.zzh;
            ((TagManager)object).zzc(this);
            object = this.zzb;
            ((Container)object).zze();
            bl2 = false;
            object = null;
            this.zzb = null;
            this.zzc = null;
            this.zzf = null;
            this.zze = null;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void setContainerAvailableListener(ContainerHolder$ContainerAvailableListener object) {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                zzw zzw2;
                block6: {
                    try {
                        boolean bl2 = this.zzg;
                        if (!bl2) break block6;
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                    return;
                }
                if (object == null) {
                    object = null;
                    this.zze = null;
                    return;
                }
                Looper looper = this.zza;
                this.zze = zzw2 = new zzw(this, (ContainerHolder$ContainerAvailableListener)object, looper);
                object = this.zzc;
                if (object != null) {
                    this.zzf();
                    return;
                }
                return;
            }
            throw throwable2;
        }
    }

    public final String zza() {
        boolean bl2 = this.zzg;
        if (bl2) {
            return "";
        }
        return this.zzb.getContainerId();
    }

    public final String zzb() {
        boolean bl2 = this.zzg;
        if (bl2) {
            return "";
        }
        return this.zzf.zza();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzc(Container container) {
        synchronized (this) {
            boolean bl2 = this.zzg;
            if (bl2) {
                return;
            }
            this.zzc = container;
            this.zzf();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzd(String string2) {
        synchronized (this) {
            boolean bl2 = this.zzg;
            if (bl2) {
                return;
            }
            Container container = this.zzb;
            container.zzd(string2);
            return;
        }
    }

    public final void zze(String string2) {
        boolean bl2 = this.zzg;
        if (bl2) {
            return;
        }
        this.zzf.zzc(string2);
    }
}

