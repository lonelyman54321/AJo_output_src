/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$ConstantState
 */
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/*
 * Renamed from iJ3
 */
public final class ij3_0
extends Drawable.ConstantState {
    public int a;
    public Drawable.ConstantState b;
    public ColorStateList c;
    public PorterDuff.Mode d;

    public final int getChangingConfigurations() {
        int n3;
        int n4 = this.a;
        Drawable.ConstantState constantState = this.b;
        if (constantState != null) {
            n3 = constantState.getChangingConfigurations();
        } else {
            n3 = 0;
            constantState = null;
        }
        return n4 | n3;
    }

    public final Drawable newDrawable() {
        return this.newDrawable(null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Drawable newDrawable(Resources object) {
        hJ3 hJ32 = new Drawable();
        hJ32.d = this;
        Drawable.ConstantState constantState = this.b;
        if (constantState != null) {
            object = constantState.newDrawable((Resources)object);
            hJ32.b((Drawable)object);
        }
        if ((object = hJ3.h) != null) return hJ32;
        object = Drawable.class;
        String string2 = "isProjected";
        try {
            hJ3.h = object = ((Class)object).getDeclaredMethod(string2, null);
            return hJ32;
        }
        catch (Exception exception) {
            return hJ32;
        }
    }
}

