/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.repo;

import com.ajio.ril.core.network.model.DataError;
import com.ril.ajio.data.repo.DataCallback$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class DataCallback {
    public static final int $stable = 0;
    public static final DataCallback$Companion Companion;
    public static final int FAILURE = 1;
    public static final int LOADING = 2;
    public static final int LOADING_COMPLETED = 3;
    public static final int SUCCESS;
    private Object data;
    private DataError error;
    private Object extraErrorData;
    private boolean isNewData;
    private int status;

    static {
        DataCallback$Companion dataCallback$Companion;
        Companion = dataCallback$Companion = new DataCallback$Companion(null);
        $stable = 8;
    }

    public DataCallback(int n3, Object object, DataError dataError, Object object2) {
        this.data = object;
        this.status = n3;
        this.error = dataError;
        this.extraErrorData = object2;
        this.isNewData = true;
    }

    public /* synthetic */ DataCallback(int n3, Object object, DataError dataError, Object object2, int n4, DefaultConstructorMarker defaultConstructorMarker) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            n3 = 1;
        }
        if ((n7 = n4 & 2) != 0) {
            object = null;
        }
        if ((n7 = n4 & 4) != 0) {
            dataError = null;
        }
        if ((n4 &= 8) != 0) {
            object2 = null;
        }
        this(n3, object, dataError, object2);
    }

    public final Object getData() {
        return this.data;
    }

    public final DataError getError() {
        return this.error;
    }

    public final Object getExtraErrorData() {
        return this.extraErrorData;
    }

    public final int getStatus() {
        return this.status;
    }

    public final boolean isNewData() {
        return this.isNewData;
    }

    public final void setData(Object object) {
        this.data = object;
    }

    public final void setError(DataError dataError) {
        this.error = dataError;
    }

    public final void setExtraErrorData(Object object) {
        this.extraErrorData = object;
    }

    public final void setNewData(boolean bl2) {
        this.isNewData = bl2;
    }

    public final void setStatus(int n3) {
        this.status = n3;
    }
}

