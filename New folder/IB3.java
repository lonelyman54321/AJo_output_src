/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaDataSource
 */
import android.media.MediaDataSource;
import java.nio.ByteBuffer;

public final class IB3
extends MediaDataSource {
    public final /* synthetic */ ByteBuffer a;

    public IB3(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    public final void close() {
    }

    public final long getSize() {
        return this.a.limit();
    }

    public final int readAt(long l2, byte[] byArray, int n3, int n4) {
        ByteBuffer byteBuffer = this.a;
        int n7 = byteBuffer.limit();
        long l3 = n7;
        long l4 = l2 - l3;
        long l7 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (l7 >= 0) {
            return -1;
        }
        byteBuffer = this.a;
        int n8 = (int)l2;
        byteBuffer.position(n8);
        int n10 = this.a.remaining();
        n10 = Math.min(n4, n10);
        this.a.get(byArray, n3, n10);
        return n10;
    }
}

