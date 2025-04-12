/*
 * Decompiled with CFR 0.152.
 */
import com.airbnb.lottie.LottieAnimationView;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

/*
 * Renamed from MB1
 */
public final class mb1_0
implements EC1 {
    public final void onResult(Object object) {
        object = (Throwable)object;
        Object object2 = LottieAnimationView.n;
        object2 = wz3.a;
        boolean bl2 = object instanceof SocketException;
        if (!(bl2 || (bl2 = object instanceof ClosedChannelException) || (bl2 = object instanceof InterruptedIOException) || (bl2 = object instanceof ProtocolException) || (bl2 = object instanceof SSLException) || (bl2 = object instanceof UnknownHostException) || (bl2 = object instanceof UnknownServiceException))) {
            object2 = new IllegalStateException("Unable to parse composition", (Throwable)object);
            throw object2;
        }
        rx1.c("Unable to load composition.", (Throwable)object);
    }
}

