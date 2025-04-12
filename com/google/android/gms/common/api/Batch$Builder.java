/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Batch;
import com.google.android.gms.common.api.BatchResultToken;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import java.util.ArrayList;
import java.util.List;

public final class Batch$Builder {
    private final List zaa;
    private final GoogleApiClient zab;

    public Batch$Builder(GoogleApiClient googleApiClient) {
        ArrayList arrayList;
        this.zaa = arrayList = new ArrayList();
        this.zab = googleApiClient;
    }

    public BatchResultToken add(PendingResult pendingResult) {
        int n3 = this.zaa.size();
        BatchResultToken batchResultToken = new BatchResultToken(n3);
        this.zaa.add(pendingResult);
        return batchResultToken;
    }

    public Batch build() {
        List list = this.zaa;
        GoogleApiClient googleApiClient = this.zab;
        Batch batch = new Batch(list, googleApiClient, null);
        return batch;
    }
}

