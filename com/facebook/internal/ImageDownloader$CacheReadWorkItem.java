/*
 * Decompiled with CFR 0.152.
 */
package com.facebook.internal;

import com.facebook.internal.ImageDownloader;
import com.facebook.internal.ImageDownloader$b;
import kotlin.jvm.internal.Intrinsics;

final class ImageDownloader$CacheReadWorkItem
implements Runnable {
    public final ImageDownloader$b a;
    public final boolean b;

    public ImageDownloader$CacheReadWorkItem(ImageDownloader$b imageDownloader$b, boolean bl2) {
        Intrinsics.checkNotNullParameter(imageDownloader$b, "key");
        this.a = imageDownloader$b;
        this.b = bl2;
    }

    public final void run() {
        Object object;
        block9: {
            boolean bl2 = td0.b(this);
            if (bl2) {
                return;
            }
            bl2 = td0.b(this);
            if (!bl2) break block9;
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
        boolean bl3 = this.b;
        ImageDownloader.b((ImageDownloader$b)object, bl3);
    }
}

