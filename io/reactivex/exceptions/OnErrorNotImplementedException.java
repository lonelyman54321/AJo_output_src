/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.exceptions;

public final class OnErrorNotImplementedException
extends RuntimeException {
    private static final long serialVersionUID = -6298857009889503852L;

    public OnErrorNotImplementedException(Throwable throwable) {
        String string2 = "The exception was not handled due to missing onError handler in the subscribe() method call. Further reading: https://github.com/ReactiveX/RxJava/wiki/Error-Handling | ";
        CharSequence charSequence = new StringBuilder(string2);
        charSequence.append(throwable);
        charSequence = charSequence.toString();
        if (throwable == null) {
        }
        super((String)charSequence, throwable);
    }
}

