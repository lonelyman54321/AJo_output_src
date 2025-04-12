/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer.source;

import androidx.media3.datasource.DataSource;
import androidx.media3.exoplayer.upstream.Loader$c;
import java.io.IOException;
import java.util.Arrays;

public final class t$b
implements Loader$c {
    public final long a;
    public final ti0_1 b;
    public final yc3 c;
    public byte[] d;

    public t$b(ti0_1 object, DataSource dataSource) {
        long l2;
        this.a = l2 = Iv1.b.getAndIncrement();
        this.b = object;
        this.c = object = new yc3(dataSource);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        Throwable throwable2;
        yc3 yc32;
        block12: {
            long l2;
            yc32 = this.c;
            yc32.b = l2 = 0L;
            try {
                int n3;
                Object object = this.b;
                yc32.a((ti0_1)object);
                int n4 = 0;
                object = null;
                while (n4 != (n3 = -1)) {
                    int n7;
                    l2 = yc32.b;
                    n3 = (int)l2;
                    object = this.d;
                    if (object == null) {
                        n4 = 1024;
                        object = new byte[n4];
                        this.d = (byte[])object;
                    } else {
                        n7 = ((Object)object).length;
                        if (n3 == n7) {
                            n7 = ((Object)object).length * 2;
                            object = Arrays.copyOf((byte[])object, n7);
                            this.d = (byte[])object;
                        }
                    }
                    object = this.d;
                    n7 = ((Object)object).length - n3;
                    n4 = yc32.read((byte[])object, n3, n7);
                }
            }
            catch (Throwable throwable2) {
                break block12;
            }
            try {
                yc32.close();
                return;
            }
            catch (IOException iOException) {
                return;
            }
        }
        try {
            yc32.close();
        }
        catch (IOException iOException) {
            throw throwable2;
        }
        throw throwable2;
    }

    public final void b() {
    }
}

