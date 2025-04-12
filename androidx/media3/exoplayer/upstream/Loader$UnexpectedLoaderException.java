/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer.upstream;

import java.io.IOException;

public final class Loader$UnexpectedLoaderException
extends IOException {
    public Loader$UnexpectedLoaderException(Throwable throwable) {
        CharSequence charSequence = new StringBuilder("Unexpected ");
        CharSequence charSequence2 = throwable.getClass().getSimpleName();
        charSequence.append((String)charSequence2);
        charSequence2 = throwable.getMessage();
        if (charSequence2 != null) {
            super(": ");
            String string2 = throwable.getMessage();
            ((StringBuilder)charSequence2).append(string2);
            charSequence2 = ((StringBuilder)charSequence2).toString();
        } else {
            charSequence2 = "";
        }
        charSequence.append((String)charSequence2);
        charSequence = charSequence.toString();
        super((String)charSequence, throwable);
    }
}

