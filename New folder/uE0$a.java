/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaDataSource
 */
import android.media.MediaDataSource;
import java.io.IOException;
import java.io.InputStream;

public final class uE0$a
extends MediaDataSource {
    public long a;
    public final /* synthetic */ uE0$f b;

    public uE0$a(uE0$f f5) {
        this.b = f5;
    }

    public final void close() {
    }

    public final long getSize() {
        return -1;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int readAt(long l2, byte[] byArray, int n3, int n4) {
        if (n4 == 0) {
            return 0;
        }
        long l3 = 0L;
        int n7 = -1;
        Object object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (object < 0) {
            return n7;
        }
        try {
            long l4 = this.a;
            long l7 = l4 == l2 ? 0 : (l4 < l2 ? -1 : 1);
            if (l7 != false) {
                InputStream inputStream;
                Object object2 = l4 == l3 ? 0 : (l4 < l3 ? -1 : 1);
                if (object2 >= 0) {
                    inputStream = this.b;
                    inputStream = ((uE0$b)inputStream).a;
                    l3 = inputStream.available();
                    long l8 = l2 - (l4 += l3);
                    Object object3 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
                    if (object3 >= 0) {
                        return n7;
                    }
                }
                inputStream = this.b;
                ((uE0$f)inputStream).b(l2);
                this.a = l2;
            }
            InputStream inputStream = this.b;
            inputStream = ((uE0$b)inputStream).a;
            int n8 = inputStream.available();
            if (n4 > n8) {
                inputStream = this.b;
                inputStream = ((uE0$b)inputStream).a;
                n4 = inputStream.available();
            }
            if ((n8 = ((uE0$b)(inputStream = this.b)).read(byArray, n3, n4)) >= 0) {
                long l12 = this.a;
                long l14 = n8;
                this.a = l12 += l14;
                return n8;
            }
        }
        catch (IOException iOException) {}
        this.a = -1;
        return n7;
    }
}

