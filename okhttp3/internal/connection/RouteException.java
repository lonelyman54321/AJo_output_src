/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.connection;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

public final class RouteException
extends RuntimeException {
    public final IOException a;
    public IOException b;

    public RouteException(IOException iOException) {
        Intrinsics.checkNotNullParameter(iOException, "firstConnectException");
        super(iOException);
        this.a = iOException;
        this.b = iOException;
    }
}

