/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Batch;
import com.google.android.gms.common.api.BatchResult;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResult$StatusListener;
import com.google.android.gms.common.api.Status;

final class zab
implements PendingResult$StatusListener {
    final /* synthetic */ Batch zaa;

    public zab(Batch batch) {
        this.zaa = batch;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onComplete(Status object) {
        Object object2 = Batch.zab(this.zaa);
        synchronized (object2) {
            Throwable throwable2;
            block12: {
                boolean bl2;
                int n3;
                Batch batch;
                try {
                    batch = this.zaa;
                    n3 = batch.isCanceled();
                    if (n3 != 0) {
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block12;
                }
                n3 = ((Status)object).isCanceled();
                boolean bl3 = true;
                if (n3 != 0) {
                    object = this.zaa;
                    Batch.zad((Batch)object, bl3);
                } else {
                    bl2 = ((Status)object).isSuccess();
                    if (!bl2) {
                        object = this.zaa;
                        Batch.zac((Batch)object, bl3);
                    }
                }
                object = this.zaa;
                n3 = Batch.zaa((Batch)object) + -1;
                Batch.zae((Batch)object, n3);
                object = this.zaa;
                n3 = Batch.zaa((Batch)object);
                if (n3 == 0) {
                    n3 = (int)(Batch.zah((Batch)object) ? 1 : 0);
                    if (n3 != 0) {
                        Batch.zaf((Batch)object);
                    } else {
                        bl2 = Batch.zag((Batch)object);
                        if (bl2) {
                            n3 = 13;
                            object = new Status(n3);
                        } else {
                            object = Status.RESULT_SUCCESS;
                        }
                        batch = this.zaa;
                        PendingResult[] pendingResultArray = Batch.zai(batch);
                        BatchResult batchResult = new BatchResult((Status)object, pendingResultArray);
                        batch.setResult(batchResult);
                    }
                }
                return;
            }
            throw throwable2;
        }
    }
}

