/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.repo;

import com.ajio.ril.core.network.model.DataError;
import com.ril.ajio.data.repo.DataCallback;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class DataCallback$Companion {
    private DataCallback$Companion() {
    }

    public /* synthetic */ DataCallback$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final DataCallback onFailed(DataError dataError) {
        Intrinsics.checkNotNullParameter(dataError, "errorData");
        DataCallback dataCallback = new DataCallback(1, null, dataError, null, 8, null);
        return dataCallback;
    }

    public final DataCallback onFailed(DataError dataError, Object object) {
        Intrinsics.checkNotNullParameter(dataError, "dataError");
        Intrinsics.checkNotNullParameter(object, "extraErrorData");
        DataCallback dataCallback = new DataCallback(1, null, dataError, object);
        return dataCallback;
    }

    public final DataCallback onLoadingCompleted() {
        DataCallback dataCallback = new DataCallback(3, null, null, null, 8, null);
        return dataCallback;
    }

    public final DataCallback onSuccess(Object object) {
        DataCallback dataCallback = new DataCallback(0, object, null, null, 8, null);
        return dataCallback;
    }
}

