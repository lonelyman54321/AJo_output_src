/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 *  android.text.TextUtils
 */
package androidx.media3.exoplayer;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.d;
import androidx.media3.exoplayer.source.j$b;
import java.io.Serializable;

public final class ExoPlaybackException
extends PlaybackException {
    public final int c;
    public final String d;
    public final int e;
    public final d f;
    public final int g;
    public final j$b h;
    public final boolean i;

    static {
        f4.b(1001, 1002, 1003, 1004, 1005);
        gz3.D(1006);
    }

    public ExoPlaybackException(int n3, Throwable throwable, int n4) {
        this(n3, throwable, n4, null, -1, null, 4, false);
    }

    /*
     * Enabled aggressive block sorting
     */
    public ExoPlaybackException(int n3, Throwable throwable, int n4, String string2, int n7, d d2, int n8, boolean bl2) {
        Serializable serializable;
        Object object;
        int n10;
        block9: {
            block7: {
                block6: {
                    block10: {
                        block11: {
                            int n14;
                            block8: {
                                if (n3 == 0) break block7;
                                n14 = 3;
                                n10 = 1;
                                if (n3 == n10) break block8;
                                object = n3 != n14 ? "Unexpected runtime error" : "Remote error";
                                break block9;
                            }
                            serializable = new StringBuilder();
                            ((StringBuilder)serializable).append(string2);
                            ((StringBuilder)serializable).append(" error, index=");
                            ((StringBuilder)serializable).append(n7);
                            ((StringBuilder)serializable).append(", format=");
                            ((StringBuilder)serializable).append(d2);
                            String string3 = ", format_supported=";
                            ((StringBuilder)serializable).append(string3);
                            if (n8 == 0) break block10;
                            if (n8 == n10) break block11;
                            n10 = 2;
                            if (n8 != n10) {
                                if (n8 != n14) {
                                    n14 = 4;
                                    if (n8 != n14) {
                                        IllegalStateException illegalStateException = new IllegalStateException();
                                        throw illegalStateException;
                                    }
                                    object = "YES";
                                    break block6;
                                } else {
                                    object = "NO_EXCEEDS_CAPABILITIES";
                                }
                                break block6;
                            } else {
                                object = "NO_UNSUPPORTED_DRM";
                            }
                            break block6;
                        }
                        object = "NO_UNSUPPORTED_TYPE";
                        break block6;
                    }
                    object = "NO";
                }
                ((StringBuilder)serializable).append((String)object);
                object = ((StringBuilder)serializable).toString();
                break block9;
            }
            object = "Source error";
        }
        String string4 = null;
        n10 = (int)(TextUtils.isEmpty(null) ? 1 : 0);
        if (n10 == 0) {
            string4 = ": null";
            object = Ft2.a((String)object, string4);
        }
        string4 = object;
        long l2 = SystemClock.elapsedRealtime();
        object = this;
        serializable = throwable;
        this(string4, throwable, n4, n3, string2, n7, d2, n8, null, l2, bl2);
    }

    public ExoPlaybackException(String string2, Throwable throwable, int n3, int n4, String string3, int n7, d d2, int n8, j$b j$b, long l2, boolean bl2) {
        ExoPlaybackException exoPlaybackException = this;
        int n10 = n4;
        boolean bl3 = bl2;
        super(string2, throwable, n3, l2);
        int n14 = 0;
        int n15 = 1;
        int n16 = bl2 && n4 != n15 ? 0 : 1;
        ct3.a(n16 != 0);
        if (throwable != null || n10 == (n16 = 3)) {
            n14 = 1;
        }
        ct3.a(n14 != 0);
        exoPlaybackException.c = n10;
        exoPlaybackException.d = string3;
        n14 = n7;
        exoPlaybackException.e = n7;
        exoPlaybackException.f = d2;
        n14 = n8;
        exoPlaybackException.g = n8;
        exoPlaybackException.h = j$b;
        exoPlaybackException.i = bl3;
    }
}

