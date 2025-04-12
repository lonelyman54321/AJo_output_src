/*
 * Decompiled with CFR 0.152.
 */
package com.facebook;

import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.f;
import kotlin.jvm.internal.Intrinsics;

public final class FacebookGraphResponseException
extends FacebookException {
    public final f b;

    public FacebookGraphResponseException(f f5, String string2) {
        super(string2);
        this.b = f5;
    }

    public final String toString() {
        Object object = this.b;
        object = object != null ? ((f)object).c : null;
        StringBuilder stringBuilder = new StringBuilder("{FacebookGraphResponseException: ");
        String string2 = this.getMessage();
        if (string2 != null) {
            stringBuilder.append(string2);
            string2 = " ";
            stringBuilder.append(string2);
        }
        if (object != null) {
            stringBuilder.append("httpResponseCode: ");
            int n3 = ((FacebookRequestError)object).a;
            stringBuilder.append(n3);
            stringBuilder.append(", facebookErrorCode: ");
            n3 = ((FacebookRequestError)object).b;
            stringBuilder.append(n3);
            stringBuilder.append(", facebookErrorType: ");
            string2 = ((FacebookRequestError)object).d;
            stringBuilder.append(string2);
            string2 = ", message: ";
            stringBuilder.append(string2);
            object = ((FacebookRequestError)object).a();
            stringBuilder.append((String)object);
            object = "}";
            stringBuilder.append((String)object);
        }
        object = stringBuilder.toString();
        Intrinsics.checkNotNullExpressionValue(object, "errorStringBuilder.toString()");
        return object;
    }
}

