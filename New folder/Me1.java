/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.widget.ImageView
 */
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;

public final class Me1 {
    public static void a(ImageView imageView, ColorStateList colorStateList) {
        Object object;
        int n3 = Build.VERSION.SDK_INT;
        imageView.setImageTintList(colorStateList);
        int n4 = 21;
        if (n3 == n4 && (colorStateList = imageView.getDrawable()) != null && (object = imageView.getImageTintList()) != null) {
            n3 = colorStateList.isStateful() ? 1 : 0;
            if (n3 != 0) {
                object = imageView.getDrawableState();
                colorStateList.setState((int[])object);
            }
            imageView.setImageDrawable((Drawable)colorStateList);
        }
    }
}

