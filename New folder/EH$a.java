/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.drawable.Drawable
 *  android.widget.ImageView
 */
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.viewpager.widget.ViewPager$h;
import com.clevertap.android.sdk.R$drawable;

public final class EH$a
implements ViewPager$h {
    public final Context a;
    public final ImageView[] b;

    public EH$a(Context context, ImageView[] imageView) {
        this.a = context;
        this.b = imageView;
        imageView = imageView[0];
        context = context.getResources();
        int n3 = R$drawable.ct_selected_dot;
        context = context.getDrawable(n3, null);
        imageView.setImageDrawable((Drawable)context);
    }

    public final void onPageScrollStateChanged(int n3) {
    }

    public final void onPageScrolled(int n3, float f5, int n4) {
    }

    public final void onPageSelected(int n3) {
        Context context;
        Resources resources = this.b;
        int n4 = ((ImageView[])resources).length;
        int n7 = 0;
        while (true) {
            Drawable drawable2 = null;
            context = this.a;
            if (n7 >= n4) break;
            ImageView imageView = resources[n7];
            context = context.getResources();
            int n8 = R$drawable.ct_unselected_dot;
            drawable2 = context.getDrawable(n8, null);
            imageView.setImageDrawable(drawable2);
            ++n7;
        }
        ImageView imageView = resources[n3];
        resources = context.getResources();
        n4 = R$drawable.ct_selected_dot;
        resources = resources.getDrawable(n4, null);
        imageView.setImageDrawable((Drawable)resources);
    }
}

