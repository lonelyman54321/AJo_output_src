/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.BitmapFactory
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.PorterDuffColorFilter
 *  android.graphics.drawable.BitmapDrawable
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.widget.RemoteViews
 */
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.R$drawable;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.graphics.drawable.IconCompat$a;
import androidx.core.graphics.drawable.IconCompat$b;
import java.io.InputStream;

public abstract class U42 {
    public J42 a;
    public CharSequence b;
    public CharSequence c;
    public boolean d = false;

    public void a(Bundle bundle) {
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean bl2 = this.d;
        if (bl2) {
            charSequence2 = "android.summaryText";
            charSequence = this.c;
            bundle.putCharSequence(charSequence2, charSequence);
        }
        if ((charSequence2 = this.b) != null) {
            charSequence = "android.title.big";
            bundle.putCharSequence((String)charSequence, charSequence2);
        }
        if ((charSequence2 = this.f()) != null) {
            charSequence = "androidx.core.app.extra.COMPAT_TEMPLATE";
            bundle.putString((String)charSequence, charSequence2);
        }
    }

    public abstract void b(V42 var1);

    public void c(Bundle bundle) {
        bundle.remove("android.summaryText");
        bundle.remove("android.title.big");
        bundle.remove("androidx.core.app.extra.COMPAT_TEMPLATE");
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Bitmap d(IconCompat var1_1, int var2_2, int var3_3) {
        block24: {
            block22: {
                block23: {
                    var4_4 = 1;
                    var5_5 = null;
                    var6_6 = 2;
                    var7_7 /* !! */  = this.a.a;
                    var8_8 = var1_1.a;
                    if (var8_8 == var6_6 && (var9_9 = var1_1.b) != null && (var11_11 = (var9_9 = (String)var9_9).contains(var10_10 = ":")) != 0) {
                        var11_11 = -1;
                        var12_12 = var9_9.split(var10_10, var11_11)[var4_4];
                        var13_13 = "/";
                        var14_14 = var12_12.split(var13_13, var11_11)[0];
                        var12_12 = var12_12.split(var13_13, var11_11)[var4_4];
                        var9_9 = var9_9.split(var10_10, var11_11)[0];
                        var10_10 = "0_resource_name_obfuscated";
                        var15_15 = (int)var10_10.equals(var12_12);
                        if (var15_15 == 0) {
                            var10_10 = var1_1.g();
                            var15_15 = var1_1.e;
                            var8_8 = (var10_10 = IconCompat.h(var7_7 /* !! */ , var10_10)).getIdentifier(var12_12, var14_14, (String)var9_9);
                            if (var15_15 != var8_8) {
                                var1_1.e = var8_8;
                            }
                        }
                    }
                    if ((var8_8 = Build.VERSION.SDK_INT) < (var15_15 = 23)) break block23;
                    var1_1 = IconCompat$a.f(var1_1.m(var7_7 /* !! */ ), var7_7 /* !! */ );
                    break block24;
                }
                var15_15 = var1_1.a;
                switch (var15_15) {
                    default: {
                        ** GOTO lbl91
                    }
                    case 6: {
                        var16_16 /* !! */  = var1_1.k(var7_7 /* !! */ );
                        if (var16_16 /* !! */  == null) ** GOTO lbl91
                        var6_6 = 26;
                        if (var8_8 < var6_6) ** GOTO lbl39
                        var7_7 /* !! */  = var7_7 /* !! */ .getResources();
                        var16_16 /* !! */  = BitmapFactory.decodeStream((InputStream)var16_16 /* !! */ );
                        var17_17 = new BitmapDrawable((Resources)var7_7 /* !! */ , (Bitmap)var16_16 /* !! */ );
                        var16_16 /* !! */  = IconCompat$b.a((BitmapDrawable)var17_17);
                        break block22;
lbl39:
                        // 1 sources

                        var7_7 /* !! */  = var7_7 /* !! */ .getResources();
                        var16_16 /* !! */  = IconCompat.c(BitmapFactory.decodeStream((InputStream)var16_16 /* !! */ ), false);
                        var17_17 = new BitmapDrawable((Resources)var7_7 /* !! */ , (Bitmap)var16_16 /* !! */ );
lbl42:
                        // 2 sources

                        while (true) {
                            var16_16 /* !! */  = var17_17;
                            break block22;
                            break;
                        }
                    }
                    case 5: {
                        var17_17 = var7_7 /* !! */ .getResources();
                        var7_7 /* !! */  = IconCompat.c((Bitmap)var1_1.b, false);
                        var16_16 /* !! */  = new BitmapDrawable((Resources)var17_17, (Bitmap)var7_7 /* !! */ );
                        break block22;
                    }
                    case 4: {
                        var16_16 /* !! */  = var1_1.k(var7_7 /* !! */ );
                        if (var16_16 /* !! */  != null) {
                            var7_7 /* !! */  = var7_7 /* !! */ .getResources();
                            var16_16 /* !! */  = BitmapFactory.decodeStream((InputStream)var16_16 /* !! */ );
                            var17_17 = new BitmapDrawable((Resources)var7_7 /* !! */ , (Bitmap)var16_16 /* !! */ );
                            ** continue;
                        }
                        ** GOTO lbl91
                    }
                    case 3: {
                        var17_17 = var7_7 /* !! */ .getResources();
                        var7_7 /* !! */  = (Context)((byte[])var1_1.b);
                        var8_8 = var1_1.e;
                        var15_15 = var1_1.f;
                        var7_7 /* !! */  = BitmapFactory.decodeByteArray((byte[])var7_7 /* !! */ , (int)var8_8, (int)var15_15);
                        var16_16 /* !! */  = new BitmapDrawable((Resources)var17_17, (Bitmap)var7_7 /* !! */ );
                        break block22;
                    }
                    case 2: {
                        var9_9 = var1_1.g();
                        var15_15 = (int)TextUtils.isEmpty((CharSequence)var9_9);
                        if (var15_15 != 0) {
                            var9_9 = var7_7 /* !! */ .getPackageName();
                        }
                        var9_9 = IconCompat.h(var7_7 /* !! */ , (String)var9_9);
                        var15_15 = var1_1.e;
                        var7_7 /* !! */  = var7_7 /* !! */ .getTheme();
                        ** try [egrp 2[TRYBLOCK] [2 : 564->567)] { 
lbl77:
                        // 1 sources

                        try {
                            var16_16 /* !! */  = var9_9.getDrawable(var15_15, (Resources.Theme)var7_7 /* !! */ );
                            break block22;
                        }
lbl81:
                        // 4 sources

                        catch (RuntimeException v0) {
                            var18_18 = var1_1.e;
                            var7_7 /* !! */  = Integer.valueOf(var18_18);
                            var9_9 = var1_1.b;
                            var17_17 = new Object[var6_6];
                            var17_17[0] = var7_7 /* !! */ ;
                            var17_17[var4_4] = var9_9;
                            var16_16 /* !! */  = "Unable to load resource 0x%08x from pkg=%s";
                            String.format((String)var16_16 /* !! */ , var17_17);
                        }
lbl91:
                        // 4 sources

                        var4_4 = 0;
                        var16_16 /* !! */  = null;
                        break block22;
                    }
                    case 1: 
                }
                var17_17 = var7_7 /* !! */ .getResources();
                var7_7 /* !! */  = (Bitmap)var1_1.b;
                var16_16 /* !! */  = new BitmapDrawable((Resources)var17_17, (Bitmap)var7_7 /* !! */ );
            }
            if (var16_16 /* !! */  != null && ((var17_17 = var1_1.g) != null || (var17_17 = var1_1.h) != (var7_7 /* !! */  = IconCompat.k))) {
                var16_16 /* !! */ .mutate();
                var17_17 = var1_1.g;
                var16_16 /* !! */ .setTintList((ColorStateList)var17_17);
                var1_1 = var1_1.h;
                var16_16 /* !! */ .setTintMode((PorterDuff.Mode)var1_1);
            }
            var1_1 = var16_16 /* !! */ ;
        }
        var4_4 = var3_3 == 0 ? var1_1.getIntrinsicWidth() : var3_3;
        if (var3_3 == 0) {
            var3_3 = var1_1.getIntrinsicHeight();
        }
        var17_17 = Bitmap.Config.ARGB_8888;
        var17_17 = Bitmap.createBitmap((int)var4_4, (int)var3_3, (Bitmap.Config)var17_17);
        var1_1.setBounds(0, 0, var4_4, var3_3);
        if (var2_2 != 0) {
            var19_19 = var1_1.mutate();
            var5_5 = PorterDuff.Mode.SRC_IN;
            var16_16 /* !! */  = new PorterDuffColorFilter(var2_2, var5_5);
            var19_19.setColorFilter((ColorFilter)var16_16 /* !! */ );
        }
        var20_20 = new Canvas((Bitmap)var17_17);
        var1_1.draw(var20_20);
        return var17_17;
    }

    public final Bitmap e(int n3, int n4, int n7, int n8) {
        Bitmap bitmap;
        int n10 = R$drawable.notification_icon_background;
        if (n8 == 0) {
            n8 = 0;
            bitmap = null;
        }
        Object object = this.a.a;
        PorterDuff.Mode mode = IconCompat.k;
        object.getClass();
        mode = object.getResources();
        object = object.getPackageName();
        IconCompat iconCompat = IconCompat.d((Resources)mode, (String)object, n10);
        bitmap = this.d(iconCompat, n8, n4);
        iconCompat = new Canvas(bitmap);
        Drawable drawable2 = this.a.a.getResources().getDrawable(n3).mutate();
        drawable2.setFilterBitmap(true);
        n4 = (n4 - n7) / 2;
        drawable2.setBounds(n4, n4, n7 += n4, n7);
        object = PorterDuff.Mode.SRC_ATOP;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(-1, (PorterDuff.Mode)object);
        drawable2.setColorFilter((ColorFilter)porterDuffColorFilter);
        drawable2.draw((Canvas)iconCompat);
        return bitmap;
    }

    public abstract String f();

    public RemoteViews g() {
        return null;
    }

    public RemoteViews h() {
        return null;
    }

    public void i() {
    }

    public void j(Bundle object) {
        CharSequence charSequence = "android.summaryText";
        boolean bl2 = object.containsKey(charSequence);
        if (bl2) {
            boolean bl3;
            charSequence = object.getCharSequence(charSequence);
            this.c = charSequence;
            this.d = bl3 = true;
        }
        object = object.getCharSequence("android.title.big");
        this.b = object;
    }

    public final void k(J42 j42) {
        J42 j422 = this.a;
        if (j422 != j42) {
            this.a = j42;
            if (j42 != null) {
                j42.g(this);
            }
        }
    }
}

