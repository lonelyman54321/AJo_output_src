/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer.audio;

import androidx.media3.common.d;

public final class AudioSink$InitializationException
extends Exception {
    public final int a;
    public final boolean b;

    public AudioSink$InitializationException(int n3, int n4, int n7, int n8, d d2, boolean bl2, RuntimeException runtimeException) {
        String string2 = " Config(";
        String string3 = ", ";
        CharSequence charSequence = fQ2.a("AudioTrack init failed ", string2, string3, n3, n4);
        String string4 = ") ";
        m10.a(charSequence, n7, string3, n8, string4);
        charSequence.append(d2);
        String string5 = bl2 ? " (recoverable)" : "";
        charSequence.append(string5);
        charSequence = charSequence.toString();
        super((String)charSequence, runtimeException);
        this.a = n3;
        this.b = bl2;
    }
}

