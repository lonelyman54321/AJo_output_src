/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.BitmapFactory
 *  android.net.Uri
 *  android.os.Handler
 *  android.os.Looper
 */
package com.facebook.internal;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.facebook.FacebookException;
import com.facebook.internal.ImageDownloader$CacheReadWorkItem;
import com.facebook.internal.ImageDownloader$DownloadImageWorkItem;
import com.facebook.internal.ImageDownloader$a;
import com.facebook.internal.ImageDownloader$b;
import com.facebook.internal.c;
import com.facebook.internal.c$a;
import com.facebook.internal.d;
import com.facebook.internal.d$b;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class ImageDownloader {
    public static final ImageDownloader a;
    public static Handler b;
    public static final d c;
    public static final d d;
    public static final HashMap e;

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        hashMap = new HashMap(8);
        c = hashMap;
        hashMap = new HashMap(2);
        d = hashMap;
        e = hashMap = new HashMap();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void a(ImageDownloader$b var0) {
        block28: {
            block24: {
                block23: {
                    block25: {
                        block26: {
                            block27: {
                                var1_5 = ImageDownloader.a;
                                var2_6 /* !! */  = null;
                                var3_7 = true;
                                try {
                                    var5_9 /* !! */  = var0.a;
                                    var5_9 /* !! */  = var5_9 /* !! */ .toString();
                                    var4_8 = new URL((String)var5_9 /* !! */ );
                                    var4_8 = var4_8.openConnection();
                                    var5_9 /* !! */  = "null cannot be cast to non-null type java.net.HttpURLConnection";
                                    Intrinsics.checkNotNull(var4_8, (String)var5_9 /* !! */ );
                                    var4_8 = (HttpURLConnection)var4_8;
                                }
                                catch (Throwable var0_3) {
                                    var4_8 = null;
                                    break block23;
                                }
                                catch (IOException var8_17) {
                                    var4_8 = null;
                                    var6_11 = false;
                                    var5_9 /* !! */  = null;
                                    break block24;
                                }
                                try {
                                    var4_8.setInstanceFollowRedirects(false);
                                    var6_10 = var4_8.getResponseCode();
                                    var7_12 = 200;
                                    if (var6_10 == var7_12) ** GOTO lbl-1000
                                    var7_12 = 301;
                                    if (var6_10 == var7_12 || var6_10 == (var7_12 = 302)) ** GOTO lbl56
                                    var5_9 /* !! */  = var4_8.getErrorStream();
                                }
lbl81:
                                // 2 sources

                                catch (Throwable var0_2) {
                                    break block23;
                                }
lbl30:
                                // 2 sources

                                while (true) {
                                    var2_6 /* !! */  = var5_9 /* !! */ ;
                                    break block25;
                                    break;
                                }
                                {
                                    catch (IOException var8_15) {
                                        var6_10 = 0;
                                        var5_9 /* !! */  = null;
                                        break block24;
                                    }
                                    {
                                        var8_13 = new StringBuilder();
                                        if (var5_9 /* !! */  != null) {
                                            var9_18 = new InputStreamReader((InputStream)var5_9 /* !! */ );
                                            var10_19 = 128;
                                            var11_20 = new char[var10_19];
                                            while ((var12_21 = var9_18.read(var11_20, 0, var10_19)) > 0) {
                                                var8_13.append(var11_20, 0, var12_21);
                                            }
                                            lz3_0.e((Closeable)var9_18);
                                        } else {
                                            var9_18 = "Unexpected error while downloading an image.";
                                            var8_13.append((String)var9_18);
                                        }
                                        var8_13 = var8_13.toString();
                                        var9_18 = new FacebookException((String)var8_13);
                                        var7_12 = 0;
                                        var8_13 = null;
                                        ** GOTO lbl30
                                    }
lbl56:
                                    // 1 sources

                                    var13_22 = "location";
                                    ** try [egrp 3[TRYBLOCK] [45 : 267->452)] { 
lbl58:
                                    // 1 sources

                                    try {
                                        var13_22 = var4_8.getHeaderField((String)var13_22);
                                        var6_10 = (int)lz3_0.A((String)var13_22);
                                        if (var6_10 != 0) break block26;
                                        var13_22 = Uri.parse((String)var13_22);
                                        var5_9 /* !! */  = var0.a;
                                        ox3.a(var5_9 /* !! */ , (Uri)var13_22);
                                        var5_9 /* !! */  = ImageDownloader.g(var0);
                                        if (var5_9 /* !! */  == null || (var7_12 = (int)var5_9 /* !! */ .c) != 0) break block26;
                                        var5_9 /* !! */  = var5_9 /* !! */ .a;
                                        var9_18 = "redirectUri";
                                        Intrinsics.checkNotNullExpressionValue(var13_22, (String)var9_18);
                                        var9_18 = var0.b;
                                        var8_13 = new ImageDownloader$b((Uri)var13_22, var9_18);
                                        break block27;
                                    }
                                    catch (IOException var8_16) {
                                    }
lbl73:
                                    // 2 sources

                                    while (true) {
                                        var6_10 = 0;
                                        var5_9 /* !! */  = null;
                                        var3_7 = false;
                                        var13_22 = null;
                                        break block24;
                                        break;
                                    }
                                }
                            }
                            try {
                                var13_22 = new ImageDownloader$CacheReadWorkItem((ImageDownloader$b)var8_13, false);
                                var9_18 = ImageDownloader.d;
                                ImageDownloader.e((c)var5_9 /* !! */ , (ImageDownloader$b)var8_13, (d)var9_18, (Runnable)var13_22);
                            }
                            catch (IOException var13_23) {
                                ** continue;
                            }
lbl91:
                            // 1 sources

                            while (true) {
                                var8_13 = var13_23;
                                ** continue;
                                break;
                            }
                        }
                        var7_12 = 0;
                        var8_13 = null;
                        var9_18 = null;
                        var3_7 = false;
                        var13_22 = null;
                        break block25;
lbl-1000:
                        // 1 sources

                        {
                            var5_9 /* !! */  = re1_0.c((HttpURLConnection)var4_8);
                        }
                        {
                            var8_13 = BitmapFactory.decodeStream((InputStream)var5_9 /* !! */ );
                            var9_18 = null;
                            ** continue;
                        }
                    }
                    lz3_0.e((Closeable)var2_6 /* !! */ );
                    lz3_0.l((URLConnection)var4_8);
                    var2_6 /* !! */  = var8_13;
                    break block28;
                }
                lz3_0.e(var2_6 /* !! */ );
                lz3_0.l((URLConnection)var4_8);
                throw var0_4;
            }
            lz3_0.e((Closeable)var5_9 /* !! */ );
            lz3_0.l((URLConnection)var4_8);
            var9_18 = var8_13;
        }
        if (var3_7) {
            var1_5.f(var0, (Exception)var9_18, (Bitmap)var2_6 /* !! */ , false);
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void b(ImageDownloader$b var0, boolean var1_5) {
        block26: {
            block29: {
                block27: {
                    var2_6 = ImageDownloader.a;
                    var3_7 = null;
                    var4_8 = false;
                    if (!var1_5) ** GOTO lbl-1000
                    var5_9 /* !! */  = var0.a;
                    var6_13 = ox3.a;
                    var7_14 /* !! */  = ox3.b;
                    if (var5_9 /* !! */  != null) {
                        var5_9 /* !! */  = var5_9 /* !! */ .toString();
                        Intrinsics.checkNotNullExpressionValue(var5_9 /* !! */ , "uri.toString()");
                        var8_15 = new HashSet();
                        var8_15.add(var5_9 /* !! */ );
                        try {
                            var9_16 = ox3.b();
                            var10_17 = var9_16.a((String)var5_9 /* !! */ , (String)var7_14 /* !! */ );
                            var11_18 = false;
                            var12_20 /* !! */  = null;
                            var13_21 = false;
                            var14_22 = null;
                        }
                        catch (Throwable var0_3) {
                            break block26;
                        }
                        catch (IOException var5_12) {
                            var11_19 = false;
                            var12_20 /* !! */  = null;
                            ** GOTO lbl-1000
                        }
                    } else lbl-1000:
                    // 3 sources

                    {
                        while (true) {
                            var1_5 = false;
                            var5_9 /* !! */  = null;
                            break block27;
                            break;
                        }
                    }
                    while (var10_17 != null) {
                        block28: {
                            var14_22 = new InputStreamReader((InputStream)var10_17);
                            var15_23 = 128;
                            var12_20 /* !! */  = new char[var15_23];
                            var16_24 = new StringBuilder();
                            var17_25 = var14_22.read(var12_20 /* !! */ , 0, var15_23);
                            while (var17_25 > 0) {
                                var16_24.append(var12_20 /* !! */ , 0, var17_25);
                                var17_25 = var14_22.read(var12_20 /* !! */ , 0, var15_23);
                            }
                            lz3_0.e(var14_22);
                            var10_17 = var16_24.toString();
                            var12_20 /* !! */  = (char[])"urlBuilder.toString()";
                            Intrinsics.checkNotNullExpressionValue(var10_17, (String)var12_20 /* !! */ );
                            var11_18 = var8_15.contains(var10_17);
                            if (!var11_18) break block28;
                            var18_27 = Intrinsics.areEqual(var10_17, var5_9 /* !! */ );
                            if (var18_27) {
                                var12_20 /* !! */  = (char[])var14_22;
                                var13_21 = true;
                                break;
                            }
                            var5_9 /* !! */  = sx1.d;
                            var5_9 /* !! */  = Ax1.CACHE;
                            var7_14 /* !! */  = "A loop detected in UrlRedirectCache";
                            sx1$a.c((Ax1)var5_9 /* !! */ , var6_13, (String)var7_14 /* !! */ );
                            lz3_0.e(var14_22);
                            ** GOTO lbl-1000
                        }
                        try {
                            var8_15.add(var10_17);
                            var5_9 /* !! */  = var9_16.a((String)var10_17, (String)var7_14 /* !! */ );
                        }
                        catch (Throwable var0_1) {
                            var3_7 = var14_22;
                            break block26;
                        }
                        catch (IOException var5_10) {
                            var12_20 /* !! */  = (char[])var14_22;
                            ** GOTO lbl-1000
                        }
                        var12_20 /* !! */  = (char[])var14_22;
                        var13_21 = true;
                        var19_26 = var10_17;
                        var10_17 = var5_9 /* !! */ ;
                        var5_9 /* !! */  = var19_26;
                    }
                    if (!var13_21) break block29;
                    try {
                        var5_9 /* !! */  = Uri.parse((String)var5_9 /* !! */ );
                    }
                    catch (Throwable var0_2) {
                        var3_7 = var12_20 /* !! */ ;
                        break block26;
                    }
                    catch (IOException var5_11) {}
                    lz3_0.e(var12_20 /* !! */ );
                }
                ** if (var5_9 /* !! */  == null) goto lbl-1000
lbl-1000:
                // 1 sources

                {
                    if ((var5_9 /* !! */  = re1_0.b((Uri)var5_9 /* !! */ )) != null) {
                        var4_8 = true;
                    } else {
                        ** GOTO lbl89
                    }
lbl89:
                    // 3 sources

                    ** GOTO lbl93
                }
lbl-1000:
                // 2 sources

                {
                    var1_5 = false;
                    var5_9 /* !! */  = null;
                }
lbl93:
                // 2 sources

                if (!var4_8) {
                    var5_9 /* !! */  = re1_0.b(var0.a);
                }
                if (var5_9 /* !! */  != null) {
                    var6_13 = BitmapFactory.decodeStream((InputStream)var5_9 /* !! */ );
                    lz3_0.e((Closeable)var5_9 /* !! */ );
                    var2_6.f(var0, null, (Bitmap)var6_13, var4_8);
                    return;
                }
                var5_9 /* !! */  = ImageDownloader.g(var0);
                if (var5_9 /* !! */  != null) {
                    var3_7 = var5_9 /* !! */ .a;
                }
                if (var5_9 /* !! */  == null) return;
                var1_5 = var5_9 /* !! */ .c;
                if (var1_5 != false) return;
                if (var3_7 == null) return;
                var5_9 /* !! */  = new ImageDownloader$DownloadImageWorkItem(var0);
                var2_6 = ImageDownloader.c;
                ImageDownloader.e((c)var3_7, var0, (d)var2_6, (Runnable)var5_9 /* !! */ );
                return;
lbl-1000:
                // 3 sources

                {
                    var7_14 /* !! */  = sx1.d;
                    var7_14 /* !! */  = Ax1.CACHE;
                    var8_15 = new StringBuilder();
                    var9_16 = "IOException when accessing cache: ";
                    var8_15.append((String)var9_16);
                    var5_9 /* !! */  = var5_9 /* !! */ .getMessage();
                    var8_15.append((String)var5_9 /* !! */ );
                    var5_9 /* !! */  = var8_15.toString();
                    sx1$a.c((Ax1)var7_14 /* !! */ , var6_13, (String)var5_9 /* !! */ );
                }
            }
            lz3_0.e(var12_20 /* !! */ );
            ** while (true)
        }
        lz3_0.e((Closeable)var3_7);
        throw var0_4;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void c(c object) {
        Intrinsics.checkNotNullParameter(object, "request");
        Object object2 = ((c)object).a;
        object = ((c)object).d;
        Object object3 = new ImageDownloader$b((Uri)object2, object);
        object = e;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                block3: {
                    boolean bl2;
                    block4: {
                        try {
                            boolean bl3;
                            object2 = ((HashMap)object).get(object3);
                            object2 = (ImageDownloader$a)object2;
                            if (object2 == null) break block3;
                            d$b d$b = object2.b;
                            if (d$b == null || !(bl3 = d$b.cancel())) break block4;
                            ((HashMap)object).remove(object3);
                            break block3;
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    object2.c = bl2 = true;
                }
                object3 = Unit.a;
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void d(c object) {
        Object object2 = ((c)object).a;
        Object object3 = ((c)object).d;
        Object object4 = new ImageDownloader$b((Uri)object2, object3);
        object2 = e;
        synchronized (object2) {
            Throwable throwable2;
            block6: {
                block5: {
                    block4: {
                        try {
                            object3 = ((HashMap)object2).get(object4);
                            object3 = (ImageDownloader$a)object3;
                            if (object3 == null) break block4;
                            object4 = "<set-?>";
                            Intrinsics.checkNotNullParameter(object, (String)object4);
                            ((ImageDownloader$a)object3).a = object;
                            object = null;
                            ((ImageDownloader$a)object3).c = false;
                            object = ((ImageDownloader$a)object3).b;
                            if (object != null) {
                                object.a();
                                object = Unit.a;
                            }
                            break block5;
                        }
                        catch (Throwable throwable2) {
                            break block6;
                        }
                    }
                    boolean bl2 = ((c)object).c;
                    ImageDownloader$CacheReadWorkItem imageDownloader$CacheReadWorkItem = new ImageDownloader$CacheReadWorkItem((ImageDownloader$b)object4, bl2);
                    object3 = d;
                    ImageDownloader.e((c)object, (ImageDownloader$b)object4, (d)object3, imageDownloader$CacheReadWorkItem);
                    object = Unit.a;
                }
                return;
            }
            throw throwable2;
        }
    }

    public static void e(c object, ImageDownloader$b imageDownloader$b, d d2, Runnable runnable2) {
        HashMap hashMap = e;
        synchronized (hashMap) {
            String string2 = "request";
            Intrinsics.checkNotNullParameter(object, string2);
            ImageDownloader$a imageDownloader$a = new Object();
            imageDownloader$a.a = object;
            hashMap.put(imageDownloader$b, imageDownloader$a);
            imageDownloader$a.b = object = com.facebook.internal.d.a(d2, runnable2);
            object = Unit.a;
            return;
        }
    }

    public static ImageDownloader$a g(ImageDownloader$b object) {
        HashMap hashMap = e;
        synchronized (hashMap) {
            object = hashMap.remove(object);
            object = (ImageDownloader$a)object;
            return object;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void f(ImageDownloader$b object, Exception exception, Bitmap bitmap, boolean bl2) {
        Object object2;
        if ((object = ImageDownloader.g((ImageDownloader$b)object)) == null) return;
        boolean bl3 = ((ImageDownloader$a)object).c;
        if (bl3) return;
        c c2 = ((ImageDownloader$a)object).a;
        object = c2 != null ? c2.b : null;
        Object object3 = object;
        if (object == null) return;
        // MONITORENTER : this
        object = b;
        if (object == null) {
            object2 = Looper.getMainLooper();
            object = new Handler(object2);
            b = object;
        }
        object = b;
        // MONITOREXIT : this
        if (object == null) return;
        object2 = new Md1(c2, exception, bl2, bitmap, (c$a)object3);
        object.post((Runnable)object2);
    }
}

