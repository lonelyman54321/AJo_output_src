/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.http2;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

public final class StreamResetException
extends IOException {
    public final ta0_2 a;

    public StreamResetException(ta0_2 ta0_22) {
        Intrinsics.checkNotNullParameter((Object)ta0_22, "errorCode");
        CharSequence charSequence = new StringBuilder("stream was reset: ");
        charSequence.append((Object)ta0_22);
        charSequence = charSequence.toString();
        super((String)charSequence);
        this.a = ta0_22;
    }
}

