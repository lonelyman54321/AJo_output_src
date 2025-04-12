/*
 * Decompiled with CFR 0.152.
 */
package com.facebook.internal;

import com.facebook.internal.ImageDownloader;
import com.facebook.internal.ImageDownloader$b;
import kotlin.jvm.internal.Intrinsics;

final class ImageDownloader$DownloadImageWorkItem
implements Runnable {
    public final ImageDownloader$b a;

    public ImageDownloader$DownloadImageWorkItem(ImageDownloader$b imageDownloader$b) {
        Intrinsics.checkNotNullParameter(imageDownloader$b, "key");
        this.a = imageDownloader$b;
    }

    public final void run() {
        Object object;
        block8: {
            boolean bl2 = td0.b(this);
            if (bl2) {
                return;
            }
            bl2 = td0.b(this);
            if (!bl2) break block8;
            return;
        }
        try {
            object = ImageDownloader.a;
        }
        catch (Throwable throwable) {
            try {
                td0.a(this, throwable);
                return;
            }
            catch (Throwable throwable2) {
                td0.a(this, throwable2);
                return;
            }
        }
        object = this.a;
        ImageDownloader.a((ImageDownloader$b)object);
    }
}

