/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.ImageDownload;

public final class Ld1
implements Runnable {
    public final /* synthetic */ ImageDownload a;
    public final /* synthetic */ TaskCompletionSource b;

    public /* synthetic */ Ld1(ImageDownload imageDownload, TaskCompletionSource taskCompletionSource) {
        this.a = imageDownload;
        this.b = taskCompletionSource;
    }

    public final void run() {
        ImageDownload imageDownload = this.a;
        TaskCompletionSource taskCompletionSource = this.b;
        ImageDownload.a(imageDownload, taskCompletionSource);
    }
}

