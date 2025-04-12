/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.TransitionDrawable
 *  android.widget.ImageView
 */
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.widget.ImageView;

/*
 * Renamed from Wt0
 */
public final class wt0_0
implements qr3 {
    public final int a;
    public final boolean b;

    public wt0_0(int n3) {
        this.a = n3;
        this.b = false;
    }

    public final boolean a(Object object, qr3$a qr3$a) {
        boolean bl2 = true;
        object = (Drawable)object;
        qr3$a = (ne1_0)qr3$a;
        Drawable drawable2 = ((ImageView)((md3_1)((Object)qr3$a)).a).getDrawable();
        if (drawable2 == null) {
            drawable2 = new ColorDrawable(0);
        }
        Drawable[] drawableArray = new Drawable[2];
        drawableArray[0] = drawable2;
        drawableArray[bl2] = object;
        TransitionDrawable transitionDrawable = new TransitionDrawable(drawableArray);
        int n3 = this.b;
        transitionDrawable.setCrossFadeEnabled(n3 != 0);
        n3 = this.a;
        transitionDrawable.startTransition(n3);
        ((ImageView)((md3_1)((Object)qr3$a)).a).setImageDrawable((Drawable)transitionDrawable);
        return bl2;
    }
}

