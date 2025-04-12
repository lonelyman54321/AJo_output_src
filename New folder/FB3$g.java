/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaExtractor
 *  android.media.MediaMetadataRetriever
 *  android.os.ParcelFileDescriptor
 */
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import java.io.FileDescriptor;

public final class FB3$g
implements FB3$e {
    public final void a(MediaExtractor mediaExtractor, Object object) {
        object = ((ParcelFileDescriptor)object).getFileDescriptor();
        mediaExtractor.setDataSource((FileDescriptor)object);
    }

    public final void b(MediaMetadataRetriever mediaMetadataRetriever, Object object) {
        object = ((ParcelFileDescriptor)object).getFileDescriptor();
        mediaMetadataRetriever.setDataSource((FileDescriptor)object);
    }
}

