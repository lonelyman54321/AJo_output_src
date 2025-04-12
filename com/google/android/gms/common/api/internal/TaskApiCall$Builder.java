/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.zacu;
import com.google.android.gms.common.api.internal.zacv;
import com.google.android.gms.common.api.internal.zacw;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.BiConsumer;

public class TaskApiCall$Builder {
    private RemoteCall zaa;
    private boolean zab = true;
    private Feature[] zac;
    private int zad = 0;

    private TaskApiCall$Builder() {
    }

    public /* synthetic */ TaskApiCall$Builder(zacw zacw2) {
    }

    public static /* bridge */ /* synthetic */ RemoteCall zaa(TaskApiCall$Builder taskApiCall$Builder) {
        return taskApiCall$Builder.zaa;
    }

    public TaskApiCall build() {
        boolean bl2;
        Object object = this.zaa;
        if (object != null) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        Preconditions.checkArgument(bl2, "execute parameter required");
        Feature[] featureArray = this.zac;
        boolean bl3 = this.zab;
        int n3 = this.zad;
        object = new zacv(this, featureArray, bl3, n3);
        return object;
    }

    public TaskApiCall$Builder execute(BiConsumer biConsumer) {
        zacu zacu2 = new zacu(biConsumer);
        this.zaa = zacu2;
        return this;
    }

    public TaskApiCall$Builder run(RemoteCall remoteCall) {
        this.zaa = remoteCall;
        return this;
    }

    public TaskApiCall$Builder setAutoResolveMissingFeatures(boolean bl2) {
        this.zab = bl2;
        return this;
    }

    public TaskApiCall$Builder setFeatures(Feature ... featureArray) {
        this.zac = featureArray;
        return this;
    }

    public TaskApiCall$Builder setMethodKey(int n3) {
        this.zad = n3;
        return this;
    }
}

