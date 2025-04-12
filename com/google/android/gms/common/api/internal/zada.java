/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 */
package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultCallbacks;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.TransformedResult;
import com.google.android.gms.common.api.internal.zaco;
import com.google.android.gms.common.api.internal.zacy;
import com.google.android.gms.common.api.internal.zacz;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public final class zada
extends TransformedResult
implements ResultCallback {
    private ResultTransform zaa = null;
    private zada zab = null;
    private volatile ResultCallbacks zac = null;
    private PendingResult zad = null;
    private final Object zae;
    private Status zaf;
    private final WeakReference zag;
    private final zacz zah;
    private boolean zai;

    public zada(WeakReference object) {
        zacz zacz2;
        Object object2;
        this.zae = object2 = new Object();
        this.zaf = null;
        this.zai = false;
        Preconditions.checkNotNull(object, "GoogleApiClient reference must not be null");
        this.zag = object;
        object = (GoogleApiClient)((Reference)object).get();
        object = object != null ? ((GoogleApiClient)object).getLooper() : Looper.getMainLooper();
        this.zah = zacz2 = new zacz(this, (Looper)object);
    }

    public static /* bridge */ /* synthetic */ ResultTransform zaa(zada zada2) {
        return zada2.zaa;
    }

    public static /* bridge */ /* synthetic */ zacz zab(zada zada2) {
        return zada2.zah;
    }

    public static /* bridge */ /* synthetic */ zada zac(zada zada2) {
        return zada2.zab;
    }

    public static /* bridge */ /* synthetic */ Object zad(zada zada2) {
        return zada2.zae;
    }

    public static /* bridge */ /* synthetic */ WeakReference zae(zada zada2) {
        return zada2.zag;
    }

    public static /* bridge */ /* synthetic */ void zaf(zada zada2, Result result2) {
        zada.zan(result2);
    }

    public static /* bridge */ /* synthetic */ void zag(zada zada2, Status status) {
        zada2.zaj(status);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zaj(Status status) {
        Object object = this.zae;
        synchronized (object) {
            this.zaf = status;
            this.zal(status);
            return;
        }
    }

    private final void zak() {
        Object object = this.zaa;
        if (object != null || (object = this.zac) != null) {
            ResultTransform resultTransform;
            object = (GoogleApiClient)this.zag.get();
            boolean bl2 = this.zai;
            if (!bl2 && (resultTransform = this.zaa) != null && object != null) {
                boolean bl3;
                ((GoogleApiClient)object).zao(this);
                this.zai = bl3 = true;
            }
            if ((object = this.zaf) != null) {
                this.zal((Status)object);
                return;
            }
            object = this.zad;
            if (object != null) {
                ((PendingResult)object).setResultCallback(this);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zal(Status object) {
        Object object2 = this.zae;
        synchronized (object2) {
            Throwable throwable2;
            block6: {
                block5: {
                    Object object3;
                    block4: {
                        try {
                            object3 = this.zaa;
                            if (object3 == null) break block4;
                            object = ((ResultTransform)object3).onFailure((Status)object);
                            object3 = "onFailure must not return null";
                            object = Preconditions.checkNotNull(object, object3);
                            object = (Status)object;
                            object3 = this.zab;
                            object3 = Preconditions.checkNotNull(object3);
                            object3 = (zada)object3;
                            super.zaj((Status)object);
                            break block5;
                        }
                        catch (Throwable throwable2) {
                            break block6;
                        }
                    }
                    boolean bl2 = this.zam();
                    if (bl2) {
                        object3 = this.zac;
                        object3 = Preconditions.checkNotNull(object3);
                        object3 = (ResultCallbacks)object3;
                        ((ResultCallbacks)object3).onFailure((Status)object);
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    private final boolean zam() {
        GoogleApiClient googleApiClient = (GoogleApiClient)this.zag.get();
        ResultCallbacks resultCallbacks = this.zac;
        return resultCallbacks != null && googleApiClient != null;
    }

    private static final void zan(Result object) {
        boolean bl2 = object instanceof Releasable;
        if (bl2) {
            Object object2 = object;
            object2 = (Releasable)object;
            try {
                object2.release();
                return;
            }
            catch (RuntimeException runtimeException) {
                object = String.valueOf(object);
                object2 = "Unable to release ";
                ((String)object2).concat((String)object);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void andFinally(ResultCallbacks resultCallbacks) {
        Object object = this.zae;
        synchronized (object) {
            boolean bl2;
            Object object2 = this.zac;
            boolean bl3 = false;
            if (object2 == null) {
                bl2 = true;
            } else {
                bl2 = false;
                object2 = null;
            }
            String string2 = "Cannot call andFinally() twice.";
            Preconditions.checkState(bl2, string2);
            object2 = this.zaa;
            if (object2 == null) {
                bl3 = true;
            }
            object2 = "Cannot call then() and andFinally() on the same TransformedResult.";
            Preconditions.checkState(bl3, object2);
            this.zac = resultCallbacks;
            this.zak();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onResult(Result result2) {
        Object object = this.zae;
        synchronized (object) {
            Throwable throwable2;
            block7: {
                block6: {
                    Object object2;
                    block4: {
                        boolean bl2;
                        block5: {
                            try {
                                object2 = result2.getStatus();
                                bl2 = ((Status)object2).isSuccess();
                                if (!bl2) break block4;
                                object2 = this.zaa;
                                if (object2 == null) break block5;
                                object2 = zaco.zaa();
                                zacy zacy2 = new zacy(this, result2);
                                object2.submit(zacy2);
                                break block6;
                            }
                            catch (Throwable throwable2) {
                                break block7;
                            }
                        }
                        bl2 = this.zam();
                        if (bl2) {
                            object2 = this.zac;
                            object2 = Preconditions.checkNotNull(object2);
                            object2 = (ResultCallbacks)object2;
                            ((ResultCallbacks)object2).onSuccess(result2);
                        }
                        break block6;
                    }
                    object2 = result2.getStatus();
                    this.zaj((Status)object2);
                    zada.zan(result2);
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
    public final TransformedResult then(ResultTransform object) {
        Object object2 = this.zae;
        synchronized (object2) {
            boolean bl2;
            Object object3 = this.zaa;
            boolean bl3 = false;
            if (object3 == null) {
                bl2 = true;
            } else {
                bl2 = false;
                object3 = null;
            }
            String string2 = "Cannot call then() twice.";
            Preconditions.checkState(bl2, string2);
            object3 = this.zac;
            if (object3 == null) {
                bl3 = true;
            }
            object3 = "Cannot call then() and andFinally() on the same TransformedResult.";
            Preconditions.checkState(bl3, object3);
            this.zaa = object;
            object3 = this.zag;
            this.zab = object = new zada((WeakReference)object3);
            this.zak();
            return object;
        }
    }

    public final void zah() {
        this.zac = null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zai(PendingResult pendingResult) {
        Object object = this.zae;
        synchronized (object) {
            this.zad = pendingResult;
            this.zak();
            return;
        }
    }
}

