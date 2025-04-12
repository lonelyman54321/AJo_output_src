/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.os.SystemClock
 */
package com.google.android.gms.common.images;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import com.google.android.gms.common.images.ImageManager;
import com.google.android.gms.common.images.ImageManager$ImageReceiver;
import com.google.android.gms.common.images.zad;
import com.google.android.gms.common.images.zaf;
import com.google.android.gms.common.images.zag;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.internal.base.zam;
import java.util.HashSet;

final class zab
implements Runnable {
    final /* synthetic */ ImageManager zaa;
    private final zag zab;

    public zab(ImageManager imageManager, zag zag2) {
        this.zaa = imageManager;
        this.zab = zag2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        Object object;
        Object object2;
        Asserts.checkMainThread("LoadImageRunnable must be executed on the main thread");
        Object object3 = ImageManager.zag(this.zaa);
        Object object4 = this.zab;
        object3 = (ImageManager$ImageReceiver)((Object)object3.get(object4));
        if (object3 != null) {
            object4 = this.zaa;
            object2 = this.zab;
            ImageManager.zag((ImageManager)object4).remove(object2);
            object4 = this.zab;
            ((ImageManager$ImageReceiver)((Object)object3)).zac((zag)object4);
        }
        object3 = this.zab;
        object4 = ((zag)object3).zaa;
        object2 = ((zad)object4).zaa;
        boolean bl2 = true;
        if (object2 == null) {
            object4 = this.zaa;
            object2 = ImageManager.zaa((ImageManager)object4);
            object4 = ImageManager.zac((ImageManager)object4);
            ((zag)object3).zab((Context)object2, (zam)object4, bl2);
            return;
        }
        object3 = (Long)ImageManager.zaf(this.zaa).get(object2);
        if (object3 != null) {
            long l2 = SystemClock.elapsedRealtime();
            long l3 = (Long)object3;
            long l4 = (l2 -= l3) - (l3 = 3600000L);
            Object object5 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object5 < 0) {
                object3 = this.zab;
                object4 = this.zaa;
                object2 = ImageManager.zaa((ImageManager)object4);
                object4 = ImageManager.zac((ImageManager)object4);
                ((zag)object3).zab((Context)object2, (zam)object4, bl2);
                return;
            }
            object3 = this.zaa;
            object2 = ((zad)object4).zaa;
            object3 = ImageManager.zaf((ImageManager)object3);
            object3.remove(object2);
        }
        object3 = this.zab;
        Uri uri = null;
        ((zag)object3).zaa(null, false, bl2, false);
        object3 = this.zaa;
        object2 = ((zad)object4).zaa;
        object3 = (ImageManager$ImageReceiver)((Object)ImageManager.zah((ImageManager)object3).get(object2));
        if (object3 == null) {
            object3 = this.zaa;
            object2 = ((zad)object4).zaa;
            object = new ImageManager$ImageReceiver((ImageManager)object3, (Uri)object2);
            object3 = this.zaa;
            object2 = ((zad)object4).zaa;
            ImageManager.zah((ImageManager)object3).put(object2, object);
            object3 = object;
        }
        object2 = this.zab;
        ((ImageManager$ImageReceiver)((Object)object3)).zab((zag)object2);
        object2 = this.zab;
        bl2 = object2 instanceof zaf;
        if (!bl2) {
            object = ImageManager.zag(this.zaa);
            object.put(object2, object3);
        }
        object2 = ImageManager.zad();
        synchronized (object2) {
            Throwable throwable2;
            block10: {
                block9: {
                    try {
                        object = ImageManager.zae();
                        uri = ((zad)object4).zaa;
                        bl2 = ((HashSet)object).contains(uri);
                        if (bl2) break block9;
                        object = ImageManager.zae();
                        object4 = ((zad)object4).zaa;
                        ((HashSet)object).add(object4);
                        ((ImageManager$ImageReceiver)((Object)object3)).zad();
                    }
                    catch (Throwable throwable2) {
                        break block10;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }
}

