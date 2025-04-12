/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.BitmapFactory
 *  android.net.Uri
 *  android.os.Handler
 *  android.os.ParcelFileDescriptor
 */
package com.google.android.gms.common.images;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.images.ImageManager;
import com.google.android.gms.common.images.zac;
import com.google.android.gms.common.internal.Asserts;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;

final class zaa
implements Runnable {
    final /* synthetic */ ImageManager zaa;
    private final Uri zab;
    private final ParcelFileDescriptor zac;

    public zaa(ImageManager imageManager, Uri uri, ParcelFileDescriptor parcelFileDescriptor) {
        this.zaa = imageManager;
        this.zab = uri;
        this.zac = parcelFileDescriptor;
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        boolean bl2;
        Bitmap bitmap;
        int n3;
        Object object;
        block8: {
            void var3_5;
            boolean bl3;
            block7: {
                Asserts.checkNotMainThread("LoadBitmapFromDiskRunnable can't be executed in the main thread");
                object = this.zac;
                n3 = 1;
                Object var3_3 = null;
                bl3 = false;
                String string2 = null;
                if (object != null) {
                    try {
                        object = object.getFileDescriptor();
                        Bitmap bitmap2 = BitmapFactory.decodeFileDescriptor((FileDescriptor)object);
                    }
                    catch (OutOfMemoryError outOfMemoryError) {
                        object = String.valueOf(this.zab);
                        string2 = "OOM while loading bitmap for uri: ";
                        string2.concat((String)object);
                        bl3 = true;
                    }
                    object = this.zac;
                    object.close();
                    break block7;
                }
                bitmap = null;
                bl2 = false;
                break block8;
                catch (IOException iOException) {}
            }
            bitmap = var3_5;
            bl2 = bl3;
        }
        object = new CountDownLatch(n3);
        ImageManager imageManager = this.zaa;
        Uri uri = this.zab;
        Handler handler = ImageManager.zab(imageManager);
        zac zac2 = new zac(imageManager, uri, bitmap, bl2, (CountDownLatch)object);
        handler.post((Runnable)zac2);
        try {
            ((CountDownLatch)object).await();
            return;
        }
        catch (InterruptedException interruptedException) {
            object = String.valueOf(this.zab);
            "Latch interrupted while posting ".concat((String)object);
            return;
        }
    }
}

