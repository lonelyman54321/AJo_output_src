/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import okio.AsyncTimeout;

/*
 * Renamed from Z83
 */
public final class z83_0
extends AsyncTimeout {
    public final Socket m;

    public z83_0(Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        this.m = socket;
    }

    public final IOException j(IOException iOException) {
        String string2 = "timeout";
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException(string2);
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    public final void k() {
        String string2 = "Failed to close timed out socket ";
        Socket socket = this.m;
        try {
            socket.close();
        }
        catch (AssertionError assertionError) {
            boolean bl2 = o72_0.c(assertionError);
            if (bl2) {
                Logger logger = p72_0.a;
                Level level = Level.WARNING;
                StringBuilder stringBuilder = new StringBuilder(string2);
                stringBuilder.append(socket);
                string2 = stringBuilder.toString();
                logger.log(level, string2, (Throwable)((Object)assertionError));
            }
            throw assertionError;
        }
        catch (Exception exception) {
            Logger logger = p72_0.a;
            Level level = Level.WARNING;
            StringBuilder stringBuilder = new StringBuilder(string2);
            stringBuilder.append(socket);
            string2 = stringBuilder.toString();
            logger.log(level, string2, exception);
        }
    }
}

