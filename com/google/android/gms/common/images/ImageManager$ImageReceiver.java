/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.ParcelFileDescriptor
 *  android.os.Parcelable
 *  android.os.ResultReceiver
 */
package com.google.android.gms.common.images;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.google.android.gms.common.images.ImageManager;
import com.google.android.gms.common.images.zaa;
import com.google.android.gms.common.images.zag;
import com.google.android.gms.common.internal.Asserts;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;

final class ImageManager$ImageReceiver
extends ResultReceiver {
    final /* synthetic */ ImageManager zaa;
    private final Uri zab;
    private final ArrayList zac;

    public ImageManager$ImageReceiver(ImageManager object, Uri uri) {
        this.zaa = object;
        Looper looper = Looper.getMainLooper();
        super(looper);
        super((Handler)object);
        this.zab = uri;
        super();
        this.zac = object;
    }

    public static /* bridge */ /* synthetic */ ArrayList zaa(ImageManager$ImageReceiver imageManager$ImageReceiver) {
        return imageManager$ImageReceiver.zac;
    }

    public final void onReceiveResult(int n3, Bundle object) {
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor)object.getParcelable("com.google.android.gms.extra.fileDescriptor");
        object = this.zaa;
        Uri uri = this.zab;
        ExecutorService executorService = ImageManager.zai((ImageManager)object);
        zaa zaa2 = new zaa((ImageManager)object, uri, parcelFileDescriptor);
        executorService.execute(zaa2);
    }

    public final void zab(zag zag2) {
        Asserts.checkMainThread("ImageReceiver.addImageRequest() must be called in the main thread");
        this.zac.add(zag2);
    }

    public final void zac(zag zag2) {
        Asserts.checkMainThread("ImageReceiver.removeImageRequest() must be called in the main thread");
        this.zac.remove(zag2);
    }

    public final void zad() {
        Intent intent = new Intent("com.google.android.gms.common.images.LOAD_IMAGE");
        intent.setPackage("com.google.android.gms");
        Uri uri = this.zab;
        intent.putExtra("com.google.android.gms.extras.uri", (Parcelable)uri);
        intent.putExtra("com.google.android.gms.extras.resultReceiver", (Parcelable)this);
        intent.putExtra("com.google.android.gms.extras.priority", 3);
        ImageManager.zaa(this.zaa).sendBroadcast(intent);
    }
}

