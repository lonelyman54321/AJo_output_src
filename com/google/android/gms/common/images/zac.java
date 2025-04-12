/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.net.Uri
 *  android.os.SystemClock
 */
package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.SystemClock;
import com.google.android.gms.common.images.ImageManager;
import com.google.android.gms.common.images.ImageManager$ImageReceiver;
import com.google.android.gms.common.images.zaf;
import com.google.android.gms.common.images.zag;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.internal.base.zam;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;

final class zac
implements Runnable {
    final /* synthetic */ ImageManager zaa;
    private final Uri zab;
    private final Bitmap zac;
    private final CountDownLatch zad;

    public zac(ImageManager imageManager, Uri uri, Bitmap bitmap, boolean bl2, CountDownLatch countDownLatch) {
        this.zaa = imageManager;
        this.zab = uri;
        this.zac = bitmap;
        this.zad = countDownLatch;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        Uri uri;
        Asserts.checkMainThread("OnBitmapLoadedRunnable must be executed in the main thread");
        Object object = ImageManager.zah(this.zaa);
        Object object2 = this.zab;
        object = (ImageManager$ImageReceiver)((Object)object.remove(object2));
        if (object != null) {
            object = ImageManager$ImageReceiver.zaa((ImageManager$ImageReceiver)((Object)object));
            int n3 = ((ArrayList)object).size();
            uri = null;
            for (int i3 = 0; i3 < n3; ++i3) {
                Context context;
                zag zag2 = (zag)((ArrayList)object).get(i3);
                Object object3 = this.zac;
                if (object3 != null) {
                    context = ImageManager.zaa(this.zaa);
                    zag2.zac(context, (Bitmap)object3, false);
                } else {
                    object3 = this.zaa;
                    context = this.zab;
                    object3 = ImageManager.zaf((ImageManager)object3);
                    long l2 = SystemClock.elapsedRealtime();
                    Long l3 = l2;
                    object3.put(context, l3);
                    object3 = this.zaa;
                    context = ImageManager.zaa((ImageManager)object3);
                    object3 = ImageManager.zac((ImageManager)object3);
                    zag2.zab(context, (zam)object3, false);
                }
                boolean bl2 = zag2 instanceof zaf;
                if (bl2) continue;
                object3 = ImageManager.zag(this.zaa);
                object3.remove(zag2);
            }
        }
        this.zad.countDown();
        object = ImageManager.zad();
        synchronized (object) {
            object2 = ImageManager.zae();
            uri = this.zab;
            ((HashSet)object2).remove(uri);
            return;
        }
    }
}

