/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.f$c;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.ExoTimeoutException;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from eF0
 */
public final class ef0_0
implements vv1$a {
    public static yn1_2 a(Class object, String string2, String string3, String string4) {
        object = rn1_2.c((Class)object);
        Intrinsics.checkNotNullParameter(object, string2);
        Intrinsics.checkNotNullParameter(object, string3);
        Intrinsics.checkNotNullParameter(object, string4);
        return object;
    }

    public void invoke(Object object) {
        object = (f$c)object;
        ExoTimeoutException exoTimeoutException = new RuntimeException("Player release timed out.");
        ExoPlaybackException exoPlaybackException = new ExoPlaybackException(2, exoTimeoutException, 1003);
        object.p(exoPlaybackException);
    }
}

