/*
 * Decompiled with CFR 0.152.
 */
package com.facebook;

import com.facebook.FacebookException;
import kotlin.jvm.internal.Intrinsics;

public final class FacebookDialogException
extends FacebookException {
    public static final long serialVersionUID = 1L;
    public final int b;
    public final String c;

    public FacebookDialogException(String string2, int n3, String string3) {
        super(string2);
        this.b = n3;
        this.c = string3;
    }

    public final String toString() {
        CharSequence charSequence = new StringBuilder("{FacebookDialogException: errorCode: ");
        int n3 = this.b;
        charSequence.append(n3);
        charSequence.append(", message: ");
        String string2 = this.getMessage();
        charSequence.append(string2);
        charSequence.append(", url: ");
        string2 = this.c;
        charSequence.append(string2);
        charSequence.append("}");
        charSequence = charSequence.toString();
        Intrinsics.checkNotNullExpressionValue(charSequence, "StringBuilder()\n        \u2026(\"}\")\n        .toString()");
        return charSequence;
    }
}

