/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.content.res.Resources$NotFoundException
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.BitmapShader
 *  android.graphics.Canvas
 *  android.graphics.Matrix
 *  android.graphics.Paint
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Shader
 *  android.graphics.Shader$TileMode
 *  android.graphics.drawable.Icon
 *  android.net.Uri
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.text.TextUtils
 */
package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat$a;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class IconCompat
extends CustomVersionedParcelable {
    public static final PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;
    public int a;
    public Object b;
    public byte[] c;
    public Parcelable d;
    public int e;
    public int f;
    public ColorStateList g;
    public PorterDuff.Mode h;
    public String i;
    public String j;

    public IconCompat() {
        PorterDuff.Mode mode;
        this.a = -1;
        this.c = null;
        this.d = null;
        this.e = 0;
        this.f = 0;
        this.g = null;
        this.h = mode = k;
        this.i = null;
    }

    public IconCompat(int n3) {
        PorterDuff.Mode mode;
        this.c = null;
        this.d = null;
        this.e = 0;
        this.f = 0;
        this.g = null;
        this.h = mode = k;
        this.i = null;
        this.a = n3;
    }

    public static IconCompat b(Bundle object) {
        String string2;
        int n3;
        String string3 = "type";
        int n4 = object.getInt(string3);
        IconCompat iconCompat = new IconCompat(n4);
        iconCompat.e = n3 = object.getInt("int1");
        iconCompat.f = n3 = object.getInt("int2");
        iconCompat.j = string2 = object.getString("string1");
        string2 = "tint_list";
        boolean bl2 = object.containsKey(string2);
        if (bl2) {
            string2 = (ColorStateList)object.getParcelable(string2);
            iconCompat.g = string2;
        }
        if (bl2 = object.containsKey(string2 = "tint_mode")) {
            string2 = PorterDuff.Mode.valueOf((String)object.getString(string2));
            iconCompat.h = string2;
        }
        string2 = "obj";
        switch (n4) {
            default: {
                return null;
            }
            case 3: {
                object = object.getByteArray(string2);
                iconCompat.b = object;
                break;
            }
            case 2: 
            case 4: 
            case 6: {
                object = object.getString(string2);
                iconCompat.b = object;
                break;
            }
            case -1: 
            case 1: 
            case 5: {
                object = object.getParcelable(string2);
                iconCompat.b = object;
            }
        }
        return iconCompat;
    }

    public static Bitmap c(Bitmap bitmap, boolean bl2) {
        float f5;
        float f6;
        int n3 = bitmap.getWidth();
        int n4 = bitmap.getHeight();
        float f7 = Math.min(n3, n4);
        n4 = 1059760811;
        float f8 = 0.6666667f;
        n3 = (int)(f7 *= f8);
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        config = Bitmap.createBitmap((int)n3, (int)n3, (Bitmap.Config)config);
        Canvas canvas = new Canvas((Bitmap)config);
        int n7 = 3;
        Paint paint = new Paint(n7);
        float f11 = n3;
        float f12 = 0.5f * f11;
        float f14 = 0.9166667f * f12;
        if (bl2) {
            int n8 = 1009429163;
            float f15 = 0.010416667f * f11;
            paint.setColor(0);
            f6 = 0.0f;
            int n10 = 0x3D000000;
            f5 = 0.03125f;
            paint.setShadowLayer(f15, 0.0f, f11 *= 0.020833334f, n10);
            canvas.drawCircle(f12, f12, f14, paint);
            n7 = 0x1E000000;
            f11 = 6.7762636E-21f;
            paint.setShadowLayer(f15, 0.0f, 0.0f, n7);
            canvas.drawCircle(f12, f12, f14, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        tileMode = new Matrix();
        f6 = -(bitmap.getWidth() - n3);
        f5 = 2.0f;
        float f16 = (float)(-(bitmap.getHeight() - n3)) / f5;
        tileMode.setTranslate(f6 /= f5, f16);
        bitmapShader.setLocalMatrix((Matrix)tileMode);
        paint.setShader((Shader)bitmapShader);
        canvas.drawCircle(f12, f12, f14, paint);
        canvas.setBitmap(null);
        return config;
    }

    public static IconCompat d(Resources object, String string2, int n3) {
        string2.getClass();
        if (n3 != 0) {
            int n4 = 2;
            IconCompat iconCompat = new IconCompat(n4);
            iconCompat.e = n3;
            if (object != null) {
                try {
                    object = object.getResourceName(n3);
                }
                catch (Resources.NotFoundException notFoundException) {
                    object = new IllegalArgumentException("Icon resource cannot be found");
                    throw object;
                }
                iconCompat.b = object;
            } else {
                iconCompat.b = string2;
            }
            iconCompat.j = string2;
            return iconCompat;
        }
        object = new IllegalArgumentException("Drawable resource ID must not be 0");
        throw object;
    }

    public static Resources h(Context object, String string2) {
        block4: {
            String string3 = "android";
            int n3 = string3.equals(string2);
            if (n3 != 0) {
                return Resources.getSystem();
            }
            object = object.getPackageManager();
            n3 = 8192;
            try {
                string3 = object.getApplicationInfo(string2, n3);
                if (string3 == null) break block4;
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                object = new StringBuilder("Unable to find pkg=");
                ((StringBuilder)object).append(string2);
                ((StringBuilder)object).append(" for icon");
                return null;
            }
            return object.getResourcesForApplication((ApplicationInfo)string3);
        }
        return null;
    }

    public final Bitmap e() {
        int n3;
        int n4 = this.a;
        int n7 = -1;
        if (n4 == n7 && (n7 = Build.VERSION.SDK_INT) >= (n3 = 23)) {
            Object object = this.b;
            n7 = object instanceof Bitmap;
            if (n7) {
                return (Bitmap)object;
            }
            return null;
        }
        n7 = 1;
        if (n4 == n7) {
            return (Bitmap)this.b;
        }
        n3 = 5;
        if (n4 == n3) {
            return IconCompat.c((Bitmap)this.b, n7 != 0);
        }
        CharSequence charSequence = new StringBuilder("called getBitmap() on ");
        charSequence.append(this);
        charSequence = charSequence.toString();
        IllegalStateException illegalStateException = new IllegalStateException((String)charSequence);
        throw illegalStateException;
    }

    public final int f() {
        int n3;
        int n4 = this.a;
        int n7 = -1;
        if (n4 == n7 && (n7 = Build.VERSION.SDK_INT) >= (n3 = 23)) {
            return IconCompat$a.b(this.b);
        }
        n7 = 2;
        if (n4 == n7) {
            return this.e;
        }
        CharSequence charSequence = new StringBuilder("called getResId() on ");
        charSequence.append(this);
        charSequence = charSequence.toString();
        IllegalStateException illegalStateException = new IllegalStateException((String)charSequence);
        throw illegalStateException;
    }

    public final String g() {
        int n3;
        int n4;
        int n7 = this.a;
        int n8 = -1;
        if (n7 == n8 && (n4 = Build.VERSION.SDK_INT) >= (n3 = 23)) {
            return IconCompat$a.c(this.b);
        }
        n4 = 2;
        if (n7 == n4) {
            String string2 = this.j;
            if (string2 != null && (n7 = (int)(TextUtils.isEmpty((CharSequence)string2) ? 1 : 0)) == 0) {
                return this.j;
            }
            return ((String)this.b).split(":", n8)[0];
        }
        CharSequence charSequence = new StringBuilder("called getResPackage() on ");
        charSequence.append(this);
        charSequence = charSequence.toString();
        IllegalStateException illegalStateException = new IllegalStateException((String)charSequence);
        throw illegalStateException;
    }

    public final int i() {
        int n3;
        int n4 = this.a;
        int n7 = -1;
        if (n4 == n7 && (n7 = Build.VERSION.SDK_INT) >= (n3 = 23)) {
            Object object = this.b;
            n4 = IconCompat$a.d(object);
        }
        return n4;
    }

    public final Uri j() {
        int n3;
        int n4 = this.a;
        int n7 = -1;
        if (n4 == n7 && (n7 = Build.VERSION.SDK_INT) >= (n3 = 23)) {
            return IconCompat$a.e(this.b);
        }
        n7 = 4;
        if (n4 != n7 && n4 != (n7 = 6)) {
            CharSequence charSequence = new StringBuilder("called getUri() on ");
            charSequence.append(this);
            charSequence = charSequence.toString();
            IllegalStateException illegalStateException = new IllegalStateException((String)charSequence);
            throw illegalStateException;
        }
        return Uri.parse((String)((String)this.b));
    }

    public final InputStream k(Context object) {
        boolean bl2;
        Object object2 = "content";
        Uri uri = this.j();
        Object object3 = uri.getScheme();
        boolean bl3 = ((String)object2).equals(object3);
        if (!bl3 && !(bl2 = ((String)(object2 = "file")).equals(object3))) {
            object2 = this.b;
            object2 = (String)object2;
            object3 = new File((String)object2);
            try {
                object = new FileInputStream((File)object3);
                return object;
            }
            catch (FileNotFoundException fileNotFoundException) {
                uri.toString();
            }
        } else {
            object = object.getContentResolver();
            try {
                return object.openInputStream(uri);
            }
            catch (Exception exception) {
                uri.toString();
            }
        }
        return null;
    }

    public final Bundle l() {
        Object object;
        Object object2 = new Bundle();
        int n3 = this.a;
        String string2 = "obj";
        switch (n3) {
            default: {
                object2 = new IllegalArgumentException("Invalid icon");
                throw object2;
            }
            case 3: {
                object = (byte[])this.b;
                object2.putByteArray(string2, (byte[])object);
                break;
            }
            case 2: 
            case 4: 
            case 6: {
                object = (String)this.b;
                object2.putString(string2, (String)object);
                break;
            }
            case 1: 
            case 5: {
                object = (Bitmap)this.b;
                object2.putParcelable(string2, (Parcelable)object);
                break;
            }
            case -1: {
                object = (Parcelable)this.b;
                object2.putParcelable(string2, (Parcelable)object);
            }
        }
        int n4 = this.a;
        object2.putInt("type", n4);
        n4 = this.e;
        object2.putInt("int1", n4);
        n4 = this.f;
        object2.putInt("int2", n4);
        string2 = this.j;
        object2.putString("string1", string2);
        object = this.g;
        if (object != null) {
            string2 = "tint_list";
            object2.putParcelable(string2, (Parcelable)object);
        }
        if ((object = (Object)this.h) != (string2 = k)) {
            string2 = "tint_mode";
            object = ((Enum)object).name();
            object2.putString(string2, (String)object);
        }
        return object2;
    }

    public final Icon m(Context object) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 23;
        if (n3 >= n4) {
            return IconCompat$a.g(this, object);
        }
        object = new UnsupportedOperationException("This method is only supported on API level 23+");
        throw object;
    }

    public final String toString() {
        Object[] objectArray;
        int n3 = this.a;
        int n4 = -1;
        if (n3 == n4) {
            return String.valueOf(this.b);
        }
        Object object = "Icon(typ=";
        StringBuilder stringBuilder = new StringBuilder((String)object);
        n4 = this.a;
        switch (n4) {
            default: {
                object = "UNKNOWN";
                break;
            }
            case 6: {
                object = "URI_MASKABLE";
                break;
            }
            case 5: {
                object = "BITMAP_MASKABLE";
                break;
            }
            case 4: {
                object = "URI";
                break;
            }
            case 3: {
                object = "DATA";
                break;
            }
            case 2: {
                object = "RESOURCE";
                break;
            }
            case 1: {
                object = "BITMAP";
            }
        }
        stringBuilder.append((String)object);
        n4 = this.a;
        switch (n4) {
            default: {
                break;
            }
            case 4: 
            case 6: {
                stringBuilder.append(" uri=");
                object = this.b;
                stringBuilder.append(object);
                break;
            }
            case 3: {
                object = " len=";
                stringBuilder.append((String)object);
                n4 = this.e;
                stringBuilder.append(n4);
                n4 = this.f;
                if (n4 == 0) break;
                object = " off=";
                stringBuilder.append((String)object);
                n4 = this.f;
                stringBuilder.append(n4);
                break;
            }
            case 2: {
                stringBuilder.append(" pkg=");
                object = this.j;
                stringBuilder.append((String)object);
                stringBuilder.append(" id=");
                n4 = this.f();
                object = n4;
                int n7 = 1;
                objectArray = new Object[n7];
                objectArray[0] = object;
                object = String.format("0x%08x", objectArray);
                stringBuilder.append((String)object);
                break;
            }
            case 1: 
            case 5: {
                stringBuilder.append(" size=");
                n4 = ((Bitmap)this.b).getWidth();
                stringBuilder.append(n4);
                stringBuilder.append("x");
                object = (Bitmap)this.b;
                n4 = object.getHeight();
                stringBuilder.append(n4);
            }
        }
        object = this.g;
        if (object != null) {
            stringBuilder.append(" tint=");
            object = this.g;
            stringBuilder.append(object);
        }
        if ((object = this.h) != (objectArray = k)) {
            stringBuilder.append(" mode=");
            object = this.h;
            stringBuilder.append(object);
        }
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

