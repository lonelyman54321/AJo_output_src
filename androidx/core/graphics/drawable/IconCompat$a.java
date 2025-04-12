/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.BitmapFactory
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Icon
 *  android.net.Uri
 *  android.os.Build$VERSION
 */
package androidx.core.graphics.drawable;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.graphics.drawable.IconCompat$b;
import androidx.core.graphics.drawable.IconCompat$c;
import androidx.core.graphics.drawable.IconCompat$d;
import java.io.InputStream;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;

public final class IconCompat$a {
    public static IconCompat a(Object object) {
        object.getClass();
        int n3 = IconCompat$a.d(object);
        int n4 = 2;
        if (n3 != n4) {
            n4 = 4;
            if (n3 != n4) {
                n4 = 6;
                if (n3 != n4) {
                    IconCompat iconCompat = new IconCompat(-1);
                    iconCompat.b = object;
                    return iconCompat;
                }
                object = IconCompat$a.e(object);
                Object object2 = IconCompat.k;
                object.getClass();
                object = object.toString();
                object.getClass();
                object2 = new IconCompat(n4);
                object2.b = object;
                return object2;
            }
            object = IconCompat$a.e(object);
            Object object3 = IconCompat.k;
            object.getClass();
            object = object.toString();
            object.getClass();
            object3 = new IconCompat(n4);
            object3.b = object;
            return object3;
        }
        String string2 = IconCompat$a.c(object);
        int n7 = IconCompat$a.b(object);
        return IconCompat.d(null, string2, n7);
    }

    public static int b(Object object) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 28;
        if (n3 >= n4) {
            return IconCompat$c.a(object);
        }
        n3 = 0;
        GenericDeclaration genericDeclaration = object.getClass();
        String string2 = "getResId";
        genericDeclaration = ((Class)genericDeclaration).getMethod(string2, null);
        object = ((Method)genericDeclaration).invoke(object, null);
        object = (Integer)object;
        try {
            return (Integer)object;
        }
        catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException reflectiveOperationException) {
            return 0;
        }
    }

    public static String c(Object object) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 28;
        if (n3 >= n4) {
            return IconCompat$c.b(object);
        }
        n3 = 0;
        GenericDeclaration genericDeclaration = object.getClass();
        String string2 = "getResPackage";
        genericDeclaration = ((Class)genericDeclaration).getMethod(string2, null);
        object = ((Method)genericDeclaration).invoke(object, null);
        try {
            return (String)object;
        }
        catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException reflectiveOperationException) {
            return null;
        }
    }

    public static int d(Object object) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 28;
        if (n3 >= n4) {
            return IconCompat$c.c(object);
        }
        n3 = -1;
        Object object2 = object.getClass();
        String string2 = "getType";
        object2 = ((Class)object2).getMethod(string2, null);
        object2 = ((Method)object2).invoke(object, null);
        object2 = (Integer)object2;
        try {
            return (Integer)object2;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            Objects.toString(object);
            return n3;
        }
        catch (InvocationTargetException invocationTargetException) {
            Objects.toString(object);
            return n3;
        }
        catch (IllegalAccessException illegalAccessException) {
            Objects.toString(object);
            return n3;
        }
    }

    public static Uri e(Object object) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 28;
        if (n3 >= n4) {
            return IconCompat$c.d(object);
        }
        n3 = 0;
        GenericDeclaration genericDeclaration = object.getClass();
        String string2 = "getUri";
        genericDeclaration = ((Class)genericDeclaration).getMethod(string2, null);
        object = ((Method)genericDeclaration).invoke(object, null);
        try {
            return (Uri)object;
        }
        catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException reflectiveOperationException) {
            return null;
        }
    }

    public static Drawable f(Icon icon, Context context) {
        return icon.loadDrawable(context);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static Icon g(IconCompat var0, Context var1_1) {
        var2_2 = var0.a;
        var3_3 = 0;
        var4_4 = 26;
        switch (var2_2) {
            default: {
                var0 = new IllegalArgumentException("Unknown type");
                throw var0;
            }
            case 6: {
                var2_2 = Build.VERSION.SDK_INT;
                var5_5 = 30;
                if (var2_2 < var5_5) ** GOTO lbl14
                var1_1 /* !! */  = IconCompat$d.a(var0.j());
                ** GOTO lbl52
lbl14:
                // 1 sources

                if (var1_1 /* !! */  == null) ** GOTO lbl25
                if ((var1_1 /* !! */  = var0.k(var1_1 /* !! */ )) == null) ** GOTO lbl18
                var1_1 /* !! */  = var2_2 >= var4_4 ? IconCompat$b.b(BitmapFactory.decodeStream((InputStream)var1_1 /* !! */ )) : Icon.createWithBitmap((Bitmap)IconCompat.c(BitmapFactory.decodeStream((InputStream)var1_1 /* !! */ ), false));
                ** GOTO lbl52
lbl18:
                // 1 sources

                var6_6 = new StringBuilder("Cannot load adaptive icon from uri: ");
                var0 = var0.j();
                var6_6.append(var0);
                var0 = var6_6.toString();
                var1_1 /* !! */  = new IllegalStateException((String)var0);
                throw var1_1 /* !! */ ;
lbl25:
                // 1 sources

                var6_7 = new StringBuilder("Context is required to resolve the file uri of the icon: ");
                var0 = var0.j();
                var6_7.append(var0);
                var0 = var6_7.toString();
                var1_1 /* !! */  = new IllegalArgumentException((String)var0);
                throw var1_1 /* !! */ ;
            }
            case 5: {
                var7_9 = Build.VERSION.SDK_INT;
                var1_1 /* !! */  = var7_9 >= var4_4 ? IconCompat$b.b((Bitmap)var0.b) : Icon.createWithBitmap((Bitmap)IconCompat.c((Bitmap)var0.b, false));
                ** GOTO lbl52
            }
            case 4: {
                var1_1 /* !! */  = Icon.createWithContentUri((String)((String)var0.b));
                ** GOTO lbl52
            }
            case 3: {
                var1_1 /* !! */  = (Context)((byte[])var0.b);
                var2_2 = var0.e;
                var3_3 = var0.f;
                var1_1 /* !! */  = Icon.createWithData((byte[])var1_1 /* !! */ , (int)var2_2, (int)var3_3);
                ** GOTO lbl52
            }
            case 2: {
                var1_1 /* !! */  = var0.g();
                var2_2 = var0.e;
                var1_1 /* !! */  = Icon.createWithResource((String)var1_1 /* !! */ , (int)var2_2);
                ** GOTO lbl52
            }
            case 1: {
                var1_1 /* !! */  = Icon.createWithBitmap((Bitmap)((Bitmap)var0.b));
lbl52:
                // 7 sources

                var6_8 = var0.g;
                if (var6_8 != null) {
                    var1_1 /* !! */ .setTintList(var6_8);
                }
                if ((var0 = var0.h) != (var6_8 = IconCompat.k)) {
                    var1_1 /* !! */ .setTintMode((PorterDuff.Mode)var0);
                }
                return var1_1 /* !! */ ;
            }
            case -1: 
        }
        return (Icon)var0.b;
    }
}

