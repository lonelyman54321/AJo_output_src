/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.job.JobInfo$Builder
 *  android.graphics.ImageDecoder
 *  android.net.NetworkRequest
 */
import android.app.job.JobInfo;
import android.graphics.ImageDecoder;
import android.net.NetworkRequest;

public final class ud1 {
    public static /* bridge */ /* synthetic */ void a(JobInfo.Builder builder, NetworkRequest networkRequest) {
        builder.setRequiredNetwork(networkRequest);
    }

    public static /* bridge */ /* synthetic */ void b(ImageDecoder imageDecoder, boolean bl2) {
        imageDecoder.setUnpremultipliedRequired(bl2);
    }
}

