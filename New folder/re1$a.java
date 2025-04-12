/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedInputStream;
import java.net.HttpURLConnection;

public final class re1$a
extends BufferedInputStream {
    public HttpURLConnection a;

    public final void close() {
        super.close();
        lz3_0.l(this.a);
    }
}

