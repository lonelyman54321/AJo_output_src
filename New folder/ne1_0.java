/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Animatable
 *  android.graphics.drawable.Drawable
 *  android.widget.ImageView
 */
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/*
 * Renamed from Ne1
 */
public abstract class ne1_0
extends md3_1
implements qr3$a {
    public Animatable d;

    public abstract void b(Object var1);

    public void c(Drawable drawable2) {
        this.b(null);
        this.d = null;
        ((ImageView)this.a).setImageDrawable(drawable2);
    }

    public void d(Object object, qr3 qr32) {
        boolean bl2;
        if (qr32 != null && (bl2 = qr32.a(object, this))) {
            bl2 = object instanceof Animatable;
            if (bl2) {
                object = (Animatable)object;
                this.d = object;
                object.start();
            } else {
                this.d = null;
            }
        } else {
            this.b(object);
            bl2 = object instanceof Animatable;
            if (bl2) {
                object = (Animatable)object;
                this.d = object;
                object.start();
            } else {
                this.d = null;
            }
        }
    }

    public final void e(Drawable drawable2) {
        super.e(drawable2);
        Animatable animatable = this.d;
        if (animatable != null) {
            animatable.stop();
        }
        this.b(null);
        this.d = null;
        ((ImageView)this.a).setImageDrawable(drawable2);
    }

    public void i(Drawable drawable2) {
        this.b(null);
        this.d = null;
        ((ImageView)this.a).setImageDrawable(drawable2);
    }

    public final void onStart() {
        Animatable animatable = this.d;
        if (animatable != null) {
            animatable.start();
        }
    }

    public final void onStop() {
        Animatable animatable = this.d;
        if (animatable != null) {
            animatable.stop();
        }
    }
}

