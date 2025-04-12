/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.res.AssetFileDescriptor
 *  android.content.res.AssetManager
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  android.graphics.drawable.BitmapDrawable
 *  android.graphics.drawable.Drawable
 *  android.net.Uri
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.ParcelFileDescriptor
 *  android.util.DisplayMetrics
 */
package com.bumptech.glide;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import com.bumptech.glide.Registry;
import com.bumptech.glide.a;
import com.bumptech.glide.b$b;
import com.bumptech.glide.d;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.a$a;
import com.bumptech.glide.load.data.c$a;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public final class e {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Registry a(a a2, List list, yo yo2) {
        int n3;
        boolean bl2;
        Object object;
        Class<ByteBuffer> clazz = a2;
        Object object2 = yo2;
        Object object3 = a2.b;
        Object object4 = a2.d;
        Object object5 = object4.getApplicationContext();
        object4 = object4.h;
        Registry registry = new Registry();
        Object object6 = new Object();
        Object object7 = registry.g;
        synchronized (object7) {
            object = ((Nd1)object7).a;
            ((ArrayList)object).add(object6);
        }
        int n4 = Build.VERSION.SDK_INT;
        int n7 = 27;
        if (n4 >= n7) {
            object7 = new Object();
            registry.i((ImageHeaderParser)object7);
        }
        object7 = object5.getResources();
        object = registry.f();
        Object object8 = ((a)((Object)clazz)).e;
        Class<Uri> clazz2 = new Class<Uri>(object5, (ArrayList)object, (ny_0)object3, (Kp)object8);
        Object object9 = new Object();
        Class<BitmapDrawable> clazz3 = new Class<BitmapDrawable>((ny_0)object3, (FB3$e)object9);
        Object object10 = registry.f();
        Object object11 = object7.getDisplayMetrics();
        object9 = new vs0((ArrayList)object10, (DisplayMetrics)object11, (ny_0)object3, (Kp)object8);
        int n8 = 28;
        if (n4 >= n8 && (bl2 = (object4 = ((d)object4).a).containsKey(object11 = b$b.class))) {
            object4 = new ai1();
            object11 = new bf_1();
        } else {
            object11 = new af_1((vs0)object9);
            object4 = new td3_0((vs0)object9, (Kp)object8);
        }
        Object object12 = "Animation";
        object10 = ByteBuffer.class;
        object2 = Drawable.class;
        clazz = InputStream.class;
        Object object13 = clazz2;
        int n10 = 28;
        if (n4 >= n10) {
            n3 = n4;
            object6 = new Qk((ArrayList)object, (Kp)object8);
            clazz2 = new Class<Uri>((Qk)object6);
            registry.d((String)object12, clazz, (Class)object2, (BK2)((Object)clazz2));
            clazz2 = new Class<Uri>((ArrayList)object, (Kp)object8);
            object6 = new Qk$b((Qk)((Object)clazz2));
            registry.d((String)object12, (Class)object10, (Class)object2, (BK2)object6);
        } else {
            n3 = n4;
        }
        object6 = new dk2_1((Context)object5);
        clazz2 = new Class<Uri>((Kp)object8);
        Object object14 = object2;
        object2 = new Mx();
        Class<BitmapDrawable> clazz4 = object2;
        object2 = new Object();
        Class<BitmapDrawable> clazz5 = object2;
        ContentResolver contentResolver = object5.getContentResolver();
        object2 = new Object();
        registry.a((Class)object10, (Ez0)object2);
        object2 = new ud3_0((Kp)object8);
        registry.a(clazz, (Ez0)object2);
        object2 = "Bitmap";
        Object object15 = object5;
        object5 = Bitmap.class;
        registry.d((String)object2, (Class)object10, (Class)object5, (BK2)object11);
        registry.d((String)object2, clazz, (Class)object5, (BK2)object4);
        Object object16 = object6;
        object6 = "robolectric";
        Object object17 = object12;
        object12 = Build.FINGERPRINT;
        n4 = ((String)object6).equals(object12) ^ 1;
        String string2 = object12;
        object12 = ParcelFileDescriptor.class;
        if (n4 != 0) {
            object6 = new Pm2((vs0)object9);
            registry.d((String)object2, (Class)object12, (Class)object5, (BK2)object6);
        }
        object9 = new Object();
        object6 = new fb3_0((ny_0)object3, (FB3$e)object9);
        object9 = AssetFileDescriptor.class;
        registry.d((String)object2, (Class)object9, (Class)object5, (BK2)object6);
        registry.d((String)object2, (Class)object12, (Class)object5, (BK2)((Object)clazz3));
        object6 = Zv3$a.a;
        registry.c((Class)object5, (Class)object5, (CP1)object6);
        Class<AssetFileDescriptor> clazz6 = object9;
        object9 = new Object();
        registry.d((String)object2, (Class)object5, (Class)object5, (BK2)object9);
        registry.b((Class)object5, (ek2_0)((Object)clazz2));
        object9 = new tx_1((Resources)object7, (BK2)object11);
        object11 = "BitmapDrawable";
        Class<BitmapDrawable> clazz7 = object2;
        object2 = BitmapDrawable.class;
        registry.d((String)object11, (Class)object10, (Class)object2, (BK2)object9);
        object9 = new tx_1((Resources)object7, (BK2)object4);
        registry.d((String)object11, clazz, (Class)object2, (BK2)object9);
        object4 = new tx_1((Resources)object7, (BK2)((Object)clazz3));
        registry.d((String)object11, (Class)object12, (Class)object2, (BK2)object4);
        object4 = new ux_1((ny_0)object3, (wx_0)((Object)clazz2));
        registry.b((Class)object2, (ek2_0)object4);
        clazz2 = object13;
        object4 = new Wd3((ArrayList)object, (ff_1)object13, (Kp)object8);
        object = yz0_2.class;
        clazz3 = object17;
        registry.d((String)object17, clazz, (Class)object, (BK2)object4);
        registry.d((String)object17, (Class)object10, (Class)object, (BK2)object13);
        object4 = new Object();
        registry.b((Class)object, (ek2_0)object4);
        object4 = wz0_0.class;
        registry.c((Class)object4, (Class)object4, (CP1)object6);
        clazz2 = new Class<Uri>((ny_0)object3);
        clazz3 = clazz7;
        registry.d((String)((Object)clazz7), (Class)object4, (Class)object5, (BK2)((Object)clazz2));
        object4 = "legacy_append";
        clazz2 = Uri.class;
        clazz3 = object14;
        object9 = object16;
        registry.d((String)object4, clazz2, (Class)object14, (BK2)object16);
        object11 = new xk2_0((dk2_1)object16, (ny_0)object3);
        registry.d((String)object4, clazz2, (Class)object5, (BK2)object11);
        object9 = new Object();
        registry.j((a$a)object9);
        object9 = new Object();
        object11 = File.class;
        registry.c((Class)object11, (Class)object10, (CP1)object9);
        object13 = object;
        object = new Object();
        object9 = new xL0$a((xL0$d)object);
        registry.c((Class)object11, clazz, (CP1)object9);
        object = new Object();
        registry.d((String)object4, (Class)object11, (Class)object11, (BK2)object);
        object9 = new Object();
        object = new xL0$a((xL0$d)object9);
        registry.c((Class)object11, (Class)object12, (CP1)object);
        registry.c((Class)object11, (Class)object11, (CP1)object6);
        object = new c$a((Kp)object8);
        registry.j((a$a)object);
        object = "robolectric";
        object8 = string2;
        boolean bl3 = ((String)object).equals(string2) ^ true;
        if (bl3) {
            object = new Object();
            registry.j((a$a)object);
        }
        object8 = object15;
        object = new Fq0$c((Context)object15);
        object9 = new Fq0$a((Context)object15);
        object14 = object3;
        object3 = new Fq0$b((Context)object15);
        object15 = object2;
        object2 = Integer.TYPE;
        registry.c((Class)object2, clazz, (CP1)object);
        object16 = object5;
        object5 = Integer.class;
        registry.c((Class)object5, clazz, (CP1)object);
        object = clazz6;
        registry.c((Class)object2, clazz6, (CP1)object9);
        registry.c((Class)object5, clazz6, (CP1)object9);
        registry.c((Class)object2, clazz3, (CP1)object3);
        registry.c((Class)object5, clazz3, (CP1)object3);
        object3 = new TK2$b((Context)object8);
        registry.c(clazz2, clazz, (CP1)object3);
        object3 = new TK2$a((Context)object8);
        registry.c(clazz2, clazz6, (CP1)object3);
        object3 = new NK2$c((Resources)object7);
        object9 = new NK2$a((Resources)object7);
        object17 = object4;
        object4 = new NK2$b((Resources)object7);
        registry.c((Class)object5, clazz2, (CP1)object3);
        registry.c((Class)object2, clazz2, (CP1)object3);
        registry.c((Class)object5, clazz6, (CP1)object9);
        registry.c((Class)object2, clazz6, (CP1)object9);
        registry.c((Class)object5, clazz, (CP1)object4);
        registry.c((Class)object2, clazz, (CP1)object4);
        object2 = new wi0$c();
        object3 = String.class;
        registry.c((Class)object3, clazz, (CP1)object2);
        object2 = new wi0$c();
        registry.c(clazz2, clazz, (CP1)object2);
        object2 = new Object();
        registry.c((Class)object3, clazz, (CP1)object2);
        object2 = new Object();
        registry.c((Class)object3, (Class)object12, (CP1)object2);
        object2 = new Object();
        registry.c((Class)object3, clazz6, (CP1)object2);
        object3 = object8.getAssets();
        object2 = new gq$c((AssetManager)object3);
        registry.c(clazz2, clazz, (CP1)object2);
        object3 = object8.getAssets();
        object2 = new gq$b((AssetManager)object3);
        registry.c(clazz2, clazz6, (CP1)object2);
        object2 = new EN1$a((Context)object8);
        registry.c(clazz2, clazz, (CP1)object2);
        object2 = new GN1$a((Context)object8);
        registry.c(clazz2, clazz, (CP1)object2);
        int n14 = 29;
        int n15 = n3;
        if (n3 >= n14) {
            object2 = new lC2$a((Context)object8, clazz);
            registry.c(clazz2, clazz, (CP1)object2);
            object2 = new lC2$a((Context)object8, (Class)object12);
            registry.c(clazz2, (Class)object12, (CP1)object2);
        }
        object4 = contentResolver;
        object2 = new ax3$d(contentResolver);
        registry.c(clazz2, clazz, (CP1)object2);
        object2 = new ax3$b(contentResolver);
        registry.c(clazz2, (Class)object12, (CP1)object2);
        object2 = new ax3$a(contentResolver);
        registry.c(clazz2, (Class)object, (CP1)object2);
        object2 = new Object();
        registry.c(clazz2, clazz, (CP1)object2);
        object2 = new Object();
        registry.c(URL.class, clazz, (CP1)object2);
        object2 = new DN1$a((Context)object8);
        registry.c(clazz2, (Class)object11, (CP1)object2);
        object2 = new Da1$a();
        registry.c(a01.class, clazz, (CP1)object2);
        object2 = new Object();
        object4 = byte[].class;
        registry.c((Class)object4, (Class)object10, (CP1)object2);
        object2 = new Object();
        registry.c((Class)object4, clazz, (CP1)object2);
        registry.c(clazz2, clazz2, (CP1)object6);
        registry.c(clazz3, clazz3, (CP1)object6);
        clazz = new Class<ByteBuffer>();
        object2 = object17;
        registry.d((String)object17, clazz3, clazz3, (BK2)((Object)clazz));
        clazz = new Class<ByteBuffer>((Resources)object7);
        object5 = object15;
        object2 = object16;
        registry.k((Class)object16, (Class)object15, (RK2)((Object)clazz));
        clazz = clazz4;
        registry.k((Class)object16, (Class)object4, (RK2)((Object)clazz4));
        object = object14;
        clazz2 = clazz5;
        object6 = new Tt0((ny_0)object14, (Mx)((Object)clazz4), (pr0_0)((Object)clazz5));
        registry.k(clazz3, (Class)object4, (RK2)object6);
        clazz = object13;
        registry.k((Class)object13, (Class)object4, (RK2)((Object)clazz5));
        int n16 = 23;
        if (n15 >= n16) {
            object3 = new Object();
            clazz = new Class<ByteBuffer>((ny_0)object14, (FB3$e)object3);
            object4 = "legacy_append";
            registry.d((String)object4, ByteBuffer.class, (Class)object16, (BK2)((Object)clazz));
            object2 = new tx_1((Resources)object7, (BK2)((Object)clazz));
            clazz = ByteBuffer.class;
            object3 = "legacy_append";
            registry.d((String)object3, clazz, (Class)object15, (BK2)object2);
        }
        clazz = list.iterator();
        while ((n14 = (int)(clazz.hasNext() ? 1 : 0)) != 0) {
            object2 = (SZ0)clazz.next();
            object3 = a2;
            try {
                object2.a((Context)object8, a2, registry);
            }
            catch (AbstractMethodError abstractMethodError) {
                object2 = object2.getClass().getName();
                object2 = "Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ".concat((String)object2);
                clazz = new Class<ByteBuffer>((String)object2, (Throwable)abstractMethodError);
                throw clazz;
            }
        }
        object3 = a2;
        clazz = yo2;
        if (yo2 != null) {
            yo2.a((Context)object8, a2, registry);
        }
        return registry;
    }
}

