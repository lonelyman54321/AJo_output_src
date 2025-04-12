/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer.source;

import java.io.IOException;

public final class ClippingMediaSource$IllegalClippingException
extends IOException {
    public ClippingMediaSource$IllegalClippingException(int n3) {
        this(n3, -9223372036854775807L, -9223372036854775807L);
    }

    public ClippingMediaSource$IllegalClippingException(int n3, long l2, long l3) {
        CharSequence charSequence;
        String string2 = "Illegal clipping: ";
        StringBuilder stringBuilder = new StringBuilder(string2);
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                int n7 = 2;
                if (n3 != n7) {
                    charSequence = "unknown";
                } else {
                    long l4 = -9223372036854775807L;
                    long l7 = l2 - l4;
                    n3 = (int)(l7 == 0L ? 0 : (l7 < 0L ? -1 : 1));
                    if (n3 == 0 || (n3 = (int)(l3 == l4 ? 0 : (l3 < l4 ? -1 : 1))) == 0) {
                        n4 = 0;
                        string2 = null;
                    }
                    ct3.f(n4 != 0);
                    string2 = "start exceeds end. Start time: ";
                    super(string2);
                    ((StringBuilder)charSequence).append(l2);
                    String string3 = ", End time: ";
                    ((StringBuilder)charSequence).append(string3);
                    ((StringBuilder)charSequence).append(l3);
                    charSequence = ((StringBuilder)charSequence).toString();
                }
            } else {
                charSequence = "not seekable to start";
            }
        } else {
            charSequence = "invalid period count";
        }
        stringBuilder.append((String)charSequence);
        charSequence = stringBuilder.toString();
        super((String)charSequence);
    }
}

