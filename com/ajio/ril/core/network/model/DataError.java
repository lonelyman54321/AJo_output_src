/*
 * Decompiled with CFR 0.152.
 */
package com.ajio.ril.core.network.model;

import com.ajio.ril.core.network.model.DataError$ErrorMessage;
import java.io.Serializable;
import java.util.List;

public class DataError
implements Serializable {
    DataError$ErrorMessage error;
    public List errors;
    public boolean isException = false;
    public List wishlistAuthorizationResponse;

    public DataError$ErrorMessage getError() {
        return this.error;
    }

    public DataError$ErrorMessage getErrorMessage() {
        boolean bl2;
        Object object = this.errors;
        if (object == null || (bl2 = object.isEmpty())) {
            object = this.wishlistAuthorizationResponse;
            this.errors = object;
        }
        object = (object = this.errors) != null && !(bl2 = object.isEmpty()) ? (DataError$ErrorMessage)this.errors.get(0) : new DataError$ErrorMessage();
        return object;
    }

    public List getErrors() {
        boolean bl2;
        List list = this.errors;
        if (list != null && !(bl2 = list.isEmpty())) {
            return this.errors;
        }
        return this.wishlistAuthorizationResponse;
    }

    public void setError(DataError$ErrorMessage dataError$ErrorMessage) {
        this.error = dataError$ErrorMessage;
    }

    public void setErrors(List list) {
        this.errors = list;
    }
}

