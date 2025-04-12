/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.util.LruCache
 */
package in.juspay.hypersdk.mystique;

import android.graphics.Bitmap;
import android.util.LruCache;

public class BitmapCache {
    private static BitmapCache bitmapCache;
    private LruCache bitmapStore;

    private BitmapCache() {
        this.initializeCache(50);
    }

    public static BitmapCache getInstance() {
        BitmapCache bitmapCache = BitmapCache.bitmapCache;
        if (bitmapCache == null) {
            BitmapCache.bitmapCache = bitmapCache = new BitmapCache();
        }
        return BitmapCache.bitmapCache;
    }

    public void clear() {
        this.bitmapStore.evictAll();
    }

    public Bitmap get(String string2) {
        return (Bitmap)this.bitmapStore.get((Object)string2);
    }

    public void getSize() {
        this.bitmapStore.size();
    }

    public void initializeCache(int n3) {
        LruCache lruCache;
        this.bitmapStore = lruCache = new LruCache(n3);
    }

    public void put(String string2, Bitmap bitmap) {
        this.bitmapStore.put((Object)string2, (Object)bitmap);
    }
}

