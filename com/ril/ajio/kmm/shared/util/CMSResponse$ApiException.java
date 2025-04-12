/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.util;

import com.ril.ajio.kmm.shared.util.CMSResponse;
import kotlin.jvm.internal.Intrinsics;

public final class CMSResponse$ApiException
extends CMSResponse {
    private final Exception exception;

    public CMSResponse$ApiException(Exception exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        super(false, 1, null);
        this.exception = exception;
    }

    public static /* synthetic */ CMSResponse$ApiException copy$default(CMSResponse$ApiException cMSResponse$ApiException, Exception exception, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            exception = cMSResponse$ApiException.exception;
        }
        return cMSResponse$ApiException.copy(exception);
    }

    public final Exception component1() {
        return this.exception;
    }

    public final CMSResponse$ApiException copy(Exception exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        CMSResponse$ApiException cMSResponse$ApiException = new CMSResponse$ApiException(exception);
        return cMSResponse$ApiException;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof CMSResponse$ApiException;
        if (!bl3) {
            return false;
        }
        object = (CMSResponse$ApiException)object;
        Exception exception = this.exception;
        object = ((CMSResponse$ApiException)object).exception;
        boolean bl4 = Intrinsics.areEqual(exception, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Exception getException() {
        return this.exception;
    }

    public int hashCode() {
        return this.exception.hashCode();
    }

    public String toString() {
        Exception exception = this.exception;
        StringBuilder stringBuilder = new StringBuilder("ApiException(exception=");
        stringBuilder.append(exception);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

