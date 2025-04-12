/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.Canvas
 *  android.graphics.drawable.BitmapDrawable
 *  android.graphics.drawable.Drawable
 */
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Yt0
 */
public final class yt0_1 {
    public static final /* synthetic */ Drawable a(Drawable drawable2, Context context, Integer n3, Integer n4) {
        Intrinsics.checkNotNullParameter(drawable2, "<this>");
        String string2 = "context";
        Intrinsics.checkNotNullParameter(context, string2);
        if (n3 != null && n4 != null) {
            int n7 = n3;
            int n8 = n4;
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            string2 = Bitmap.createBitmap((int)n7, (int)n8, (Bitmap.Config)config);
            Canvas canvas = new Canvas((Bitmap)string2);
            int n10 = n3;
            int n14 = n4;
            config = null;
            drawable2.setBounds(0, 0, n10, n14);
            drawable2.draw(canvas);
            context = context.getResources();
            drawable2 = new BitmapDrawable((Resources)context, (Bitmap)string2);
        }
        return drawable2;
    }

    public static final void b(Drawable drawable2, Integer n3) {
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(drawable2, string2);
        if (n3 != null) {
            int n4 = n3;
            drawable2 = ut0_0.h(drawable2);
            n3 = ColorStateList.valueOf((int)n4);
            drawable2.setTintList((ColorStateList)n3);
        }
    }
}

