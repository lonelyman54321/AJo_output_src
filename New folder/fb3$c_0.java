/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.AssetFileDescriptor
 *  android.media.MediaExtractor
 *  android.media.MediaMetadataRetriever
 */
import android.content.res.AssetFileDescriptor;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import java.io.FileDescriptor;

/*
 * Renamed from FB3$c
 */
public final class fb3$c_0
implements FB3$e {
    public final void a(MediaExtractor mediaExtractor, Object object) {
        object = (AssetFileDescriptor)object;
        FileDescriptor fileDescriptor = object.getFileDescriptor();
        long l2 = object.getStartOffset();
        long l3 = object.getLength();
        mediaExtractor.setDataSource(fileDescriptor, l2, l3);
    }

    public final void b(MediaMetadataRetriever mediaMetadataRetriever, Object object) {
        object = (AssetFileDescriptor)object;
        FileDescriptor fileDescriptor = object.getFileDescriptor();
        long l2 = object.getStartOffset();
        long l3 = object.getLength();
        mediaMetadataRetriever.setDataSource(fileDescriptor, l2, l3);
    }
}

