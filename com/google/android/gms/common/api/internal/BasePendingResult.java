/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 *  android.os.Message
 *  android.os.RemoteException
 */
package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResult$StatusListener;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.TransformedResult;
import com.google.android.gms.common.api.internal.BasePendingResult$CallbackHandler;
import com.google.android.gms.common.api.internal.zada;
import com.google.android.gms.common.api.internal.zadb;
import com.google.android.gms.common.api.internal.zaq;
import com.google.android.gms.common.api.internal.zas;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.common.internal.Preconditions;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public abstract class BasePendingResult
extends PendingResult {
    static final ThreadLocal zaa;
    public static final /* synthetic */ int zad;
    private zas resultGuardian;
    protected final BasePendingResult$CallbackHandler zab;
    protected final WeakReference zac;
    private final Object zae;
    private final CountDownLatch zaf;
    private final ArrayList zag;
    private ResultCallback zah;
    private final AtomicReference zai;
    private Result zaj;
    private Status zak;
    private volatile boolean zal;
    private boolean zam;
    private boolean zan;
    private ICancelToken zao;
    private volatile zada zap;
    private boolean zaq;

    static {
        zaq zaq2 = new zaq();
        zaa = zaq2;
    }

    public BasePendingResult() {
        Object object = new Object();
        this.zae = object;
        object = new Object(1);
        this.zaf = object;
        this.zag = object = new Object();
        this.zai = object;
        this.zaq = false;
        Looper looper = Looper.getMainLooper();
        super(looper);
        this.zab = object;
        super(null);
        this.zac = object;
    }

    public BasePendingResult(Looper object) {
        Object object2 = new Object();
        this.zae = object2;
        object2 = new Object(1);
        this.zaf = object2;
        this.zag = object2 = new Object();
        this.zai = object2;
        this.zaq = false;
        super((Looper)object);
        this.zab = object2;
        super(null);
        this.zac = object;
    }

    public BasePendingResult(GoogleApiClient googleApiClient) {
        BasePendingResult$CallbackHandler basePendingResult$CallbackHandler;
        Object object = new Object();
        this.zae = object;
        int n3 = 1;
        object = new CountDownLatch(n3);
        this.zaf = object;
        object = new ArrayList();
        this.zag = object;
        this.zai = object;
        object = null;
        this.zaq = false;
        object = googleApiClient != null ? googleApiClient.getLooper() : Looper.getMainLooper();
        this.zab = basePendingResult$CallbackHandler = new BasePendingResult$CallbackHandler((Looper)object);
        super(googleApiClient);
        this.zac = object;
    }

    public BasePendingResult(BasePendingResult$CallbackHandler object) {
        Serializable serializable = new Serializable();
        this.zae = serializable;
        serializable = new Serializable(1);
        this.zaf = serializable;
        this.zag = serializable = new Serializable();
        this.zai = serializable;
        this.zaq = false;
        this.zab = object = (BasePendingResult$CallbackHandler)((Object)Preconditions.checkNotNull(object, "CallbackHandler must not be null"));
        super(null);
        this.zac = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final Result zaa() {
        Result result2;
        Object object = this.zae;
        synchronized (object) {
            boolean bl2 = this.zal;
            boolean bl3 = true;
            String string2 = "Result has already been consumed.";
            Preconditions.checkState(bl2 ^= bl3, string2);
            bl2 = this.isReady();
            string2 = "Result is not ready.";
            Preconditions.checkState(bl2, string2);
            result2 = this.zaj;
            string2 = null;
            this.zaj = null;
            this.zah = null;
            this.zal = bl3;
        }
        object = this.zai.getAndSet(null);
        if (object != null) {
            object = ((zadb)object).zaa.zab;
            object.remove(this);
        }
        return (Result)Preconditions.checkNotNull(result2);
    }

    private final void zab(Result object) {
        Result result2;
        int n3;
        this.zaj = object;
        object = object.getStatus();
        this.zak = object;
        object = null;
        this.zao = null;
        Object object2 = this.zaf;
        ((CountDownLatch)object2).countDown();
        int n4 = this.zam;
        if (n4 != 0) {
            this.zah = null;
        } else {
            object2 = this.zah;
            if (object2 == null) {
                object2 = this.zaj;
                n4 = object2 instanceof Releasable;
                if (n4 != 0) {
                    this.resultGuardian = object2 = new zas(this, null);
                }
            } else {
                object = this.zab;
                n3 = 2;
                object.removeMessages(n3);
                object = this.zab;
                result2 = this.zaa();
                ((BasePendingResult$CallbackHandler)((Object)object)).zaa((ResultCallback)object2, result2);
            }
        }
        object = this.zag;
        n4 = object.size();
        result2 = null;
        for (n3 = 0; n3 < n4; ++n3) {
            PendingResult$StatusListener pendingResult$StatusListener = (PendingResult$StatusListener)object.get(n3);
            Status status = this.zak;
            pendingResult$StatusListener.onComplete(status);
        }
        this.zag.clear();
    }

    public static /* bridge */ /* synthetic */ Result zaj(BasePendingResult basePendingResult) {
        return basePendingResult.zaj;
    }

    public static void zal(Result object) {
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
    public final void addStatusListener(PendingResult$StatusListener pendingResult$StatusListener) {
        Object object;
        boolean bl2;
        if (pendingResult$StatusListener != null) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        Object object2 = "Callback cannot be null.";
        Preconditions.checkArgument(bl2, object2);
        object = this.zae;
        synchronized (object) {
            Throwable throwable2;
            block7: {
                block6: {
                    block5: {
                        try {
                            boolean bl3 = this.isReady();
                            if (!bl3) break block5;
                            object2 = this.zak;
                            pendingResult$StatusListener.onComplete((Status)object2);
                            break block6;
                        }
                        catch (Throwable throwable2) {
                            break block7;
                        }
                    }
                    object2 = this.zag;
                    ((ArrayList)object2).add(pendingResult$StatusListener);
                }
                return;
            }
            throw throwable2;
        }
    }

    public final Result await() {
        Preconditions.checkNotMainThread("await must not be called on the UI thread");
        boolean bl2 = this.zal;
        boolean bl3 = true;
        String string2 = "Result has already been consumed";
        Preconditions.checkState(bl2 ^= bl3, string2);
        Object object = this.zap;
        if (object != null) {
            bl3 = false;
        }
        object = "Cannot await if then() has been called.";
        Preconditions.checkState(bl3, object);
        object = this.zaf;
        try {
            ((CountDownLatch)object).await();
        }
        catch (InterruptedException interruptedException) {
            object = Status.RESULT_INTERRUPTED;
            this.forceFailureUnlessReady((Status)object);
        }
        Preconditions.checkState(this.isReady(), "Result is not ready.");
        return this.zaa();
    }

    public final Result await(long l2, TimeUnit timeUnit) {
        block7: {
            Object object;
            long l3 = 0L;
            long l4 = l2 - l3;
            Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object2 > 0) {
                object = "await must not be called on the UI thread when time is greater than zero.";
                Preconditions.checkNotMainThread((String)object);
            }
            boolean bl2 = this.zal;
            boolean bl3 = true;
            String string2 = "Result has already been consumed.";
            Preconditions.checkState(bl2 ^= bl3, string2);
            object = this.zap;
            if (object != null) {
                bl3 = false;
            }
            object = "Cannot await if then() has been called.";
            Preconditions.checkState(bl3, object);
            object = this.zaf;
            boolean bl4 = ((CountDownLatch)object).await(l2, timeUnit);
            if (bl4) break block7;
            Status status = Status.RESULT_TIMEOUT;
            try {
                this.forceFailureUnlessReady(status);
            }
            catch (InterruptedException interruptedException) {
                status = Status.RESULT_INTERRUPTED;
                this.forceFailureUnlessReady(status);
            }
        }
        Preconditions.checkState(this.isReady(), "Result is not ready.");
        return this.zaa();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cancel() {
        Object object = this.zae;
        synchronized (object) {
            Throwable throwable22;
            block8: {
                block7: {
                    try {
                        boolean bl2 = this.zam;
                        if (bl2 || (bl2 = this.zal)) break block7;
                        Object object2 = this.zao;
                        if (object2 != null) {
                            try {
                                object2.cancel();
                            }
                            catch (RemoteException remoteException) {}
                        }
                        object2 = this.zaj;
                        BasePendingResult.zal((Result)object2);
                        this.zam = bl2 = true;
                        object2 = Status.RESULT_CANCELED;
                        object2 = this.createFailedResult((Status)object2);
                        this.zab((Result)object2);
                        return;
                    }
                    catch (Throwable throwable22) {
                        break block8;
                    }
                }
                return;
            }
            throw throwable22;
        }
    }

    public abstract Result createFailedResult(Status var1);

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void forceFailureUnlessReady(Status result2) {
        Object object = this.zae;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        boolean bl2;
                        boolean bl3 = this.isReady();
                        if (bl3) break block3;
                        result2 = this.createFailedResult((Status)result2);
                        this.setResult(result2);
                        this.zan = bl2 = true;
                    }
                    catch (Throwable throwable2) {
                        break block4;
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
    public final boolean isCanceled() {
        Object object = this.zae;
        synchronized (object) {
            return this.zam;
        }
    }

    public final boolean isReady() {
        long l2;
        CountDownLatch countDownLatch = this.zaf;
        long l3 = countDownLatch.getCount();
        long l4 = l3 - (l2 = 0L);
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        return object == false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void setCancelToken(ICancelToken iCancelToken) {
        Object object = this.zae;
        synchronized (object) {
            this.zao = iCancelToken;
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void setResult(Result result2) {
        Object object = this.zae;
        synchronized (object) {
            Throwable throwable2;
            block6: {
                block5: {
                    String string2;
                    boolean bl2;
                    try {
                        bl2 = this.zan;
                        if (bl2 || (bl2 = this.zam)) break block5;
                        this.isReady();
                        bl2 = this.isReady() ^ true;
                        string2 = "Results have already been set";
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    {
                        Preconditions.checkState(bl2, string2);
                        bl2 = this.zal ^ true;
                        string2 = "Result has already been consumed";
                    }
                    Preconditions.checkState(bl2, string2);
                    this.zab(result2);
                    return;
                }
                BasePendingResult.zal(result2);
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
    public final void setResultCallback(ResultCallback resultCallback) {
        Object object = this.zae;
        synchronized (object) {
            Throwable throwable2;
            if (resultCallback == null) {
                resultCallback = null;
                try {
                    this.zah = null;
                    return;
                }
                catch (Throwable throwable2) {}
            } else {
                Result result2;
                boolean bl2 = this.zal;
                boolean bl3 = true;
                String string2 = "Result has already been consumed.";
                Preconditions.checkState(bl2 ^= bl3, string2);
                Object object2 = this.zap;
                if (object2 != null) {
                    bl3 = false;
                    result2 = null;
                }
                object2 = "Cannot set callbacks if then() has been called.";
                Preconditions.checkState(bl3, object2);
                bl2 = this.isCanceled();
                if (bl2) {
                    return;
                }
                bl2 = this.isReady();
                if (bl2) {
                    object2 = this.zab;
                    result2 = this.zaa();
                    ((BasePendingResult$CallbackHandler)((Object)object2)).zaa(resultCallback, result2);
                } else {
                    this.zah = resultCallback;
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
    public final void setResultCallback(ResultCallback object, long l2, TimeUnit timeUnit) {
        Object object2 = this.zae;
        synchronized (object2) {
            Throwable throwable2;
            if (object == null) {
                object = null;
                try {
                    this.zah = null;
                    return;
                }
                catch (Throwable throwable2) {}
            } else {
                boolean bl2 = this.zal;
                boolean bl3 = true;
                String string2 = "Result has already been consumed.";
                Preconditions.checkState(bl2 ^= bl3, string2);
                Object object3 = this.zap;
                if (object3 != null) {
                    bl3 = false;
                }
                object3 = "Cannot set callbacks if then() has been called.";
                Preconditions.checkState(bl3, object3);
                bl2 = this.isCanceled();
                if (bl2) {
                    return;
                }
                bl2 = this.isReady();
                if (bl2) {
                    BasePendingResult$CallbackHandler basePendingResult$CallbackHandler = this.zab;
                    Result result2 = this.zaa();
                    basePendingResult$CallbackHandler.zaa((ResultCallback)object, result2);
                } else {
                    this.zah = object;
                    object = this.zab;
                    l2 = timeUnit.toMillis(l2);
                    int n3 = 2;
                    timeUnit = object.obtainMessage(n3, this);
                    object.sendMessageDelayed((Message)timeUnit, l2);
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
        boolean bl2 = this.zal;
        boolean bl3 = true;
        Object object2 = "Result has already been consumed.";
        Preconditions.checkState(bl2 ^= bl3, object2);
        Object object3 = this.zae;
        synchronized (object3) {
            Throwable throwable2;
            block9: {
                boolean bl4;
                Object object4;
                try {
                    object2 = this.zap;
                    boolean bl5 = false;
                    object4 = null;
                    if (object2 == null) {
                        bl4 = true;
                    } else {
                        bl4 = false;
                        object2 = null;
                    }
                    String string2 = "Cannot call then() twice.";
                    Preconditions.checkState(bl4, string2);
                    object2 = this.zah;
                    if (object2 == null) {
                        bl5 = true;
                    }
                    object2 = "Cannot call then() if callbacks are set.";
                    Preconditions.checkState(bl5, object2);
                    bl4 = this.zam ^ bl3;
                    object4 = "Cannot call then() if result was canceled.";
                }
                catch (Throwable throwable2) {
                    break block9;
                }
                Preconditions.checkState(bl4, object4);
                this.zaq = bl3;
                object2 = this.zac;
                Object object5 = new zada((WeakReference)object2);
                this.zap = object5;
                object5 = this.zap;
                object = ((zada)object5).then((ResultTransform)object);
                bl3 = this.isReady();
                if (bl3) {
                    object5 = this.zab;
                    object2 = this.zap;
                    object4 = this.zaa();
                    ((BasePendingResult$CallbackHandler)((Object)object5)).zaa((ResultCallback)object2, (Result)object4);
                } else {
                    object5 = this.zap;
                    this.zah = object5;
                }
                return object;
            }
            throw throwable2;
        }
    }

    public final void zak() {
        Boolean bl2;
        boolean bl3 = this.zaq;
        boolean bl4 = true;
        if (!bl3 && !(bl3 = (bl2 = (Boolean)zaa.get()).booleanValue())) {
            bl4 = false;
        }
        this.zaq = bl4;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zam() {
        Object object = this.zae;
        synchronized (object) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        Object object2 = this.zac;
                        object2 = ((Reference)object2).get();
                        object2 = (GoogleApiClient)object2;
                        if (object2 == null) break block3;
                        boolean bl2 = this.zaq;
                        if (bl2) return this.isCanceled();
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                this.cancel();
                return this.isCanceled();
            }
            throw throwable2;
        }
    }

    public final void zan(zadb zadb2) {
        this.zai.set(zadb2);
    }
}

