/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaExtractor
 *  android.media.MediaMetadataRetriever
 */
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import java.nio.ByteBuffer;

/*
 * Renamed from FB3$d
 */
public final class fb3$d_0
implements FB3$e {
    public final void a(MediaExtractor mediaExtractor, Object object) {
        object = (ByteBuffer)object;
        IB3 iB3 = new IB3((ByteBuffer)object);
        HB3.a(mediaExtractor, iB3);
    }

    public final void b(MediaMetadataRetriever mediaMetadataRetriever, Object object) {
        object = (ByteBuffer)object;
        IB3 iB3 = new IB3((ByteBuffer)object);
        GB3.a(mediaMetadataRetriever, iB3);
    }
}

