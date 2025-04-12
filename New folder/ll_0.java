/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.drawable.Drawable
 */
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import androidx.cardview.widget.CardView;
import androidx.cardview.widget.CardView$a;

/*
 * Renamed from LL
 */
public final class ll_0
implements NL {
    public static OP2 o(ML mL) {
        return (OP2)((CardView$a)mL).a;
    }

    public final void a(ML mL) {
        float f5 = ll_0.o((ML)mL).e;
        this.h(mL, f5);
    }

    public final void b(ML mL) {
        ML mL2 = mL;
        mL2 = (CardView$a)mL;
        CardView cardView = ((CardView$a)mL2).b;
        boolean bl2 = cardView.getUseCompatPadding();
        if (!bl2) {
            ((CardView$a)mL2).a(0, 0, 0, 0);
            return;
        }
        float f5 = ll_0.o((ML)mL).e;
        float f6 = ll_0.o((ML)mL).a;
        CardView cardView2 = ((CardView$a)mL2).b;
        int n3 = cardView2.getPreventCornerOverlap();
        n3 = (int)Math.ceil(PP2.a(f5, f6, n3 != 0));
        boolean bl3 = cardView2.getPreventCornerOverlap();
        int n4 = (int)Math.ceil(PP2.b(f5, f6, bl3));
        ((CardView$a)mL2).a(n3, n4, n3, n4);
    }

    public final float c(ML mL) {
        return ll_0.o((ML)mL).a * 2.0f;
    }

    public final void d(ML mL) {
        float f5 = ll_0.o((ML)mL).e;
        this.h(mL, f5);
    }

    public final float e(ML mL) {
        return ((CardView$a)mL).b.getElevation();
    }

    public final void f(ML object, ColorStateList colorStateList) {
        int n3;
        object = ll_0.o((ML)object);
        if (colorStateList == null) {
            object.getClass();
            n3 = 0;
            colorStateList = ColorStateList.valueOf((int)0);
        }
        ((OP2)((Object)object)).h = colorStateList;
        int[] nArray = object.getState();
        int n4 = ((OP2)((Object)object)).h.getDefaultColor();
        n3 = colorStateList.getColorForState(nArray, n4);
        ((OP2)((Object)object)).b.setColor(n3);
        object.invalidateSelf();
    }

    public final void g(CardView$a cardView$a, Context object, ColorStateList object2, float f5, float f6, float f7) {
        object = new OP2(f5, (ColorStateList)object2);
        cardView$a.a = object;
        object2 = cardView$a.b;
        object2.setBackgroundDrawable((Drawable)object);
        object2.setClipToOutline(true);
        object2.setElevation(f6);
        this.h(cardView$a, f7);
    }

    public final void h(ML mL, float f5) {
        OP2 oP2 = ll_0.o(mL);
        Object object = mL;
        object = (CardView$a)mL;
        CardView cardView = ((CardView$a)object).b;
        boolean bl2 = cardView.getUseCompatPadding();
        object = ((CardView$a)object).b;
        boolean bl3 = ((CardView)((Object)object)).getPreventCornerOverlap();
        float f6 = oP2.e;
        float f7 = f5 - f6;
        Object object2 = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object2 != false || (object2 = (Object)oP2.f) != bl2 || (object2 = (Object)oP2.g) != bl3) {
            oP2.e = f5;
            oP2.f = bl2;
            oP2.g = bl3;
            f5 = 0.0f;
            oP2.b(null);
            oP2.invalidateSelf();
        }
        this.b(mL);
    }

    public final void i(ML object, float f5) {
        object = ll_0.o((ML)object);
        float f6 = ((OP2)((Object)object)).a;
        float f7 = f5 - f6;
        Object object2 = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object2 != false) {
            ((OP2)((Object)object)).a = f5;
            f5 = 0.0f;
            ((OP2)((Object)object)).b(null);
            object.invalidateSelf();
        }
    }

    public final float j(ML mL) {
        return ll_0.o((ML)mL).a * 2.0f;
    }

    public final float k(ML mL) {
        return ll_0.o((ML)mL).a;
    }

    public final ColorStateList l(ML mL) {
        return ll_0.o((ML)mL).h;
    }

    public final void m(ML mL, float f5) {
        ((CardView$a)mL).b.setElevation(f5);
    }

    public final float n(ML mL) {
        return ll_0.o((ML)mL).e;
    }
}

