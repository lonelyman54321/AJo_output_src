/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Color
 *  android.graphics.drawable.Drawable
 *  android.widget.ImageView
 */
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.viewpager.widget.ViewPager$h;
import com.clevertap.android.sdk.R$drawable;
import com.clevertap.android.sdk.inbox.CTInboxMessage;
import com.clevertap.android.sdk.inbox.CTInboxMessageContent;

public final class FH$a
implements ViewPager$h {
    public final Context a;
    public final ImageView[] b;
    public final CTInboxMessage c;
    public final fh_1 d;

    public FH$a(Context context, fh_1 fh_12, ImageView[] imageViewArray, CTInboxMessage object) {
        this.a = context;
        this.d = fh_12;
        this.b = imageViewArray;
        this.c = object;
        fh_12 = imageViewArray[0];
        context = context.getResources();
        int n3 = R$drawable.ct_selected_dot;
        object = WK2.a;
        context = context.getDrawable(n3, null);
        fh_12.setImageDrawable((Drawable)context);
    }

    public final void onPageScrollStateChanged(int n3) {
    }

    public final void onPageScrolled(int n3, float f5, int n4) {
    }

    public final void onPageSelected(int n3) {
        Object object;
        Object object2;
        int n4;
        Object object3 = this.b;
        int n7 = ((ImageView[])object3).length;
        int n8 = 0;
        CTInboxMessage cTInboxMessage = null;
        while (true) {
            n4 = 0;
            object2 = null;
            object = this.a;
            if (n8 >= n7) break;
            ImageView imageView = object3[n8];
            object = object.getResources();
            int n10 = R$drawable.ct_unselected_dot;
            object2 = object.getDrawable(n10, null);
            imageView.setImageDrawable(object2);
            ++n8;
        }
        object3 = object3[n3];
        Resources resources = object.getResources();
        n8 = R$drawable.ct_selected_dot;
        object = WK2.a;
        resources = resources.getDrawable(n8, null);
        object3.setImageDrawable((Drawable)resources);
        object3 = this.d;
        resources = object3.s;
        cTInboxMessage = this.c;
        object2 = ((CTInboxMessageContent)cTInboxMessage.j.get((int)n3)).k;
        resources.setText((CharSequence)object2);
        resources = object3.s;
        n4 = Color.parseColor((String)((CTInboxMessageContent)cTInboxMessage.j.get((int)n3)).l);
        resources.setTextColor(n4);
        resources = object3.t;
        object2 = ((CTInboxMessageContent)cTInboxMessage.j.get((int)n3)).h;
        resources.setText((CharSequence)object2);
        object3 = object3.t;
        n3 = Color.parseColor((String)((CTInboxMessageContent)cTInboxMessage.j.get((int)n3)).i);
        object3.setTextColor(n3);
    }
}

