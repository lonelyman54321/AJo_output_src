/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.BitmapDrawable
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$ConstantState
 */
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/*
 * Renamed from gu0
 */
public abstract class gu0_0
implements wk2_0,
uh1_0 {
    public final Drawable a;

    public gu0_0(Drawable drawable2) {
        dV0.c(drawable2, "Argument must not be null");
        this.a = drawable2;
    }

    public final Object get() {
        Drawable drawable2 = this.a;
        Drawable.ConstantState constantState = drawable2.getConstantState();
        if (constantState != null) {
            drawable2 = constantState.newDrawable();
        }
        return drawable2;
    }

    public void initialize() {
        Drawable drawable2 = this.a;
        boolean bl2 = drawable2 instanceof BitmapDrawable;
        if (bl2) {
            drawable2 = ((BitmapDrawable)drawable2).getBitmap();
            drawable2.prepareToDraw();
        } else {
            bl2 = drawable2 instanceof yz0_2;
            if (bl2) {
                drawable2 = ((yz0_2)drawable2).a.a.l;
                drawable2.prepareToDraw();
            }
        }
    }
}

