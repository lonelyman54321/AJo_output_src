/*
 * Decompiled with CFR 0.152.
 */
package com.facebook;

import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import kotlin.jvm.internal.Intrinsics;

public final class FacebookServiceException
extends FacebookException {
    private static final long serialVersionUID = 1L;
    public final FacebookRequestError b;

    public FacebookServiceException(FacebookRequestError facebookRequestError, String string2) {
        Intrinsics.checkNotNullParameter(facebookRequestError, "requestError");
        super(string2);
        this.b = facebookRequestError;
    }

    public final String toString() {
        CharSequence charSequence = new StringBuilder("{FacebookServiceException: httpResponseCode: ");
        Object object = this.b;
        int n3 = ((FacebookRequestError)object).a;
        charSequence.append(n3);
        charSequence.append(", facebookErrorCode: ");
        n3 = ((FacebookRequestError)object).b;
        charSequence.append(n3);
        charSequence.append(", facebookErrorType: ");
        String string2 = ((FacebookRequestError)object).d;
        charSequence.append(string2);
        charSequence.append(", message: ");
        object = ((FacebookRequestError)object).a();
        charSequence.append((String)object);
        charSequence.append("}");
        charSequence = charSequence.toString();
        Intrinsics.checkNotNullExpressionValue(charSequence, "StringBuilder()\n        \u2026(\"}\")\n        .toString()");
        return charSequence;
    }
}

