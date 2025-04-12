/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.os.Handler
 *  android.os.Looper
 *  android.widget.ImageView
 */
package com.google.android.gms.common.images;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import com.google.android.gms.common.images.ImageManager$OnImageLoadedListener;
import com.google.android.gms.common.images.zab;
import com.google.android.gms.common.images.zae;
import com.google.android.gms.common.images.zaf;
import com.google.android.gms.common.images.zag;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.internal.base.zam;
import com.google.android.gms.internal.base.zat;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ExecutorService;

public final class ImageManager {
    private static final Object zaa;
    private static final HashSet zab;
    private static ImageManager zac;
    private final Context zad;
    private final Handler zae;
    private final ExecutorService zaf;
    private final zam zag;
    private final Map zah;
    private final Map zai;
    private final Map zaj;

    static {
        HashSet hashSet = new HashSet();
        zaa = hashSet;
        zab = hashSet = new HashSet();
    }

    private ImageManager(Context object, boolean bl2) {
        this.zad = object = object.getApplicationContext();
        Looper looper = Looper.getMainLooper();
        super(looper);
        this.zae = object;
        object = zat.zaa().zab(4, 2);
        this.zaf = object;
        super();
        this.zag = object;
        super();
        this.zah = object;
        super();
        this.zai = object;
        super();
        this.zaj = object;
    }

    public static ImageManager create(Context context) {
        ImageManager imageManager = zac;
        if (imageManager == null) {
            zac = imageManager = new ImageManager(context, false);
        }
        return zac;
    }

    public static /* bridge */ /* synthetic */ Context zaa(ImageManager imageManager) {
        return imageManager.zad;
    }

    public static /* bridge */ /* synthetic */ Handler zab(ImageManager imageManager) {
        return imageManager.zae;
    }

    public static /* bridge */ /* synthetic */ zam zac(ImageManager imageManager) {
        return imageManager.zag;
    }

    public static /* bridge */ /* synthetic */ Object zad() {
        return zaa;
    }

    public static /* bridge */ /* synthetic */ HashSet zae() {
        return zab;
    }

    public static /* bridge */ /* synthetic */ Map zaf(ImageManager imageManager) {
        return imageManager.zaj;
    }

    public static /* bridge */ /* synthetic */ Map zag(ImageManager imageManager) {
        return imageManager.zah;
    }

    public static /* bridge */ /* synthetic */ Map zah(ImageManager imageManager) {
        return imageManager.zai;
    }

    public static /* bridge */ /* synthetic */ ExecutorService zai(ImageManager imageManager) {
        return imageManager.zaf;
    }

    public void loadImage(ImageView imageView, int n3) {
        zae zae2 = new zae(imageView, n3);
        this.zaj(zae2);
    }

    public void loadImage(ImageView imageView, Uri uri) {
        zae zae2 = new zae(imageView, uri);
        this.zaj(zae2);
    }

    public void loadImage(ImageView imageView, Uri uri, int n3) {
        zae zae2 = new zae(imageView, uri);
        zae2.zab = n3;
        this.zaj(zae2);
    }

    public void loadImage(ImageManager$OnImageLoadedListener imageManager$OnImageLoadedListener, Uri uri) {
        zaf zaf2 = new zaf(imageManager$OnImageLoadedListener, uri);
        this.zaj(zaf2);
    }

    public void loadImage(ImageManager$OnImageLoadedListener imageManager$OnImageLoadedListener, Uri uri, int n3) {
        zaf zaf2 = new zaf(imageManager$OnImageLoadedListener, uri);
        zaf2.zab = n3;
        this.zaj(zaf2);
    }

    public final void zaj(zag zag2) {
        Asserts.checkMainThread("ImageManager.loadImage() must be called in the main thread");
        zab zab2 = new zab(this, zag2);
        zab2.run();
    }
}

