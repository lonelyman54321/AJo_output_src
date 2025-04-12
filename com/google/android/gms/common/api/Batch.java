/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api;

import com.google.android.gms.common.api.BatchResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.zab;
import com.google.android.gms.common.api.zac;
import java.util.List;

public final class Batch
extends BasePendingResult {
    private int zae;
    private boolean zaf;
    private boolean zag;
    private final PendingResult[] zah;
    private final Object zai;

    public /* synthetic */ Batch(List object, GoogleApiClient pendingResultArray, zac object2) {
        super((GoogleApiClient)pendingResultArray);
        int n3;
        pendingResultArray = new Object();
        this.zai = pendingResultArray;
        this.zae = n3 = object.size();
        pendingResultArray = new PendingResult[n3];
        this.zah = pendingResultArray;
        int n4 = object.isEmpty();
        if (n4 == 0) {
            pendingResultArray = null;
            for (n3 = 0; n3 < (n4 = object.size()); ++n3) {
                this.zah[n3] = object2 = (PendingResult)object.get(n3);
                zab zab2 = new zab(this);
                ((PendingResult)object2).addStatusListener(zab2);
            }
            return;
        }
        object2 = Status.RESULT_SUCCESS;
        object = new BatchResult((Status)object2, pendingResultArray);
        this.setResult((Result)object);
    }

    public static /* bridge */ /* synthetic */ int zaa(Batch batch) {
        return batch.zae;
    }

    public static /* bridge */ /* synthetic */ Object zab(Batch batch) {
        return batch.zai;
    }

    public static /* bridge */ /* synthetic */ void zac(Batch batch, boolean bl2) {
        batch.zaf = true;
    }

    public static /* bridge */ /* synthetic */ void zad(Batch batch, boolean bl2) {
        batch.zag = true;
    }

    public static /* bridge */ /* synthetic */ void zae(Batch batch, int n3) {
        batch.zae = n3;
    }

    public static /* synthetic */ void zaf(Batch batch) {
        super.cancel();
    }

    public static /* bridge */ /* synthetic */ boolean zag(Batch batch) {
        return batch.zaf;
    }

    public static /* bridge */ /* synthetic */ boolean zah(Batch batch) {
        return batch.zag;
    }

    public static /* bridge */ /* synthetic */ PendingResult[] zai(Batch batch) {
        return batch.zah;
    }

    public void cancel() {
        Object object;
        int n3;
        super.cancel();
        for (int i3 = 0; i3 < (n3 = ((PendingResult[])(object = this.zah)).length); ++i3) {
            object = object[i3];
            ((PendingResult)object).cancel();
        }
    }

    public BatchResult createFailedResult(Status status) {
        PendingResult[] pendingResultArray = this.zah;
        BatchResult batchResult = new BatchResult(status, pendingResultArray);
        return batchResult;
    }
}

