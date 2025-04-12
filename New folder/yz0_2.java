/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.Paint
 *  android.graphics.Rect
 *  android.graphics.drawable.Animatable
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$ConstantState
 *  android.view.Gravity
 */
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import java.util.ArrayList;

/*
 * Renamed from yZ0
 */
public final class yz0_2
extends Drawable
implements DZ0$b,
Animatable {
    public final yZ0$a a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public int f;
    public final int g;
    public boolean h;
    public Paint i;
    public Rect j;

    public yz0_2() {
        throw null;
    }

    public yz0_2(yZ0$a yZ0$a) {
        this.e = true;
        this.g = -1;
        dV0.c((Object)yZ0$a, "Argument must not be null");
        this.a = yZ0$a;
    }

    public final void a() {
        int n3;
        Object object = this.getCallback();
        while ((n3 = object instanceof Drawable) != 0) {
            object = ((Drawable)object).getCallback();
        }
        if (object == null) {
            this.stop();
            this.invalidateSelf();
            return;
        }
        this.invalidateSelf();
        object = this.a.a;
        DZ0$a dZ0$a = ((DZ0)object).i;
        int n4 = -1;
        n3 = dZ0$a != null ? dZ0$a.e : -1;
        object = ((DZ0)object).a;
        int n7 = object.c() + -1;
        if (n3 == n7) {
            this.f = n7 = this.f + 1;
        }
        if ((n7 = this.g) != n4 && (n3 = this.f) >= n7) {
            this.stop();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void b() {
        boolean bl2 = this.d;
        int n3 = 1;
        dV0.a(bl2 ^= n3, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        Object object = this.a;
        Object object2 = ((yZ0$a)((Object)object)).a.a;
        int n4 = object2.c();
        if (n4 == n3) {
            this.invalidateSelf();
            return;
        }
        n4 = (int)(this.b ? 1 : 0);
        if (n4 != 0) return;
        this.b = n3;
        object = ((yZ0$a)((Object)object)).a;
        n4 = (int)(((DZ0)object).j ? 1 : 0);
        if (n4 != 0) {
            object = new IllegalStateException("Cannot subscribe to a cleared frame loader");
            throw object;
        }
        object2 = ((DZ0)object).c;
        boolean bl3 = ((ArrayList)object2).contains(this);
        if (bl3) {
            object = new IllegalStateException("Cannot subscribe twice in a row");
            throw object;
        }
        bl3 = ((ArrayList)object2).isEmpty();
        ((ArrayList)object2).add(this);
        if (bl3 && (n4 = (int)(((DZ0)object).f ? 1 : 0)) == 0) {
            ((DZ0)object).f = n3;
            n3 = 0;
            ((DZ0)object).j = false;
            ((DZ0)object).a();
        }
        this.invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        DZ0 dZ0;
        Rect rect;
        int n3 = this.d;
        if (n3 != 0) {
            return;
        }
        n3 = this.h;
        if (n3 != 0) {
            n3 = this.getIntrinsicWidth();
            int n4 = this.getIntrinsicHeight();
            rect = this.getBounds();
            Rect rect2 = this.j;
            if (rect2 == null) {
                this.j = rect2 = new Rect();
            }
            rect2 = this.j;
            int n7 = 119;
            Gravity.apply((int)n7, (int)n3, (int)n4, (Rect)rect, (Rect)rect2);
            n3 = 0;
            dZ0 = null;
            this.h = false;
        }
        dZ0 = this.a.a;
        DZ0$a dZ0$a = dZ0.i;
        dZ0 = dZ0$a != null ? dZ0$a.g : dZ0.l;
        dZ0$a = this.j;
        if (dZ0$a == null) {
            dZ0$a = new Rect();
            this.j = dZ0$a;
        }
        dZ0$a = this.j;
        rect = this.i;
        if (rect == null) {
            int n8 = 2;
            rect = new Paint(n8);
            this.i = rect;
        }
        rect = this.i;
        canvas.drawBitmap((Bitmap)dZ0, null, (Rect)dZ0$a, (Paint)rect);
    }

    public final Drawable.ConstantState getConstantState() {
        return this.a;
    }

    public final int getIntrinsicHeight() {
        return this.a.a.q;
    }

    public final int getIntrinsicWidth() {
        return this.a.a.p;
    }

    public final int getOpacity() {
        return -2;
    }

    public final boolean isRunning() {
        return this.b;
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.h = true;
    }

    public final void setAlpha(int n3) {
        Paint paint = this.i;
        if (paint == null) {
            int n4 = 2;
            this.i = paint = new Paint(n4);
        }
        this.i.setAlpha(n3);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Paint paint = this.i;
        if (paint == null) {
            int n3 = 2;
            this.i = paint = new Paint(n3);
        }
        this.i.setColorFilter(colorFilter);
    }

    public final boolean setVisible(boolean bl2, boolean bl3) {
        boolean bl4 = this.d ^ true;
        Object object = "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.";
        dV0.a(bl4, (String)object);
        this.e = bl2;
        if (!bl2) {
            bl4 = false;
            this.b = false;
            object = this.a.a;
            ArrayList arrayList = ((DZ0)object).c;
            arrayList.remove(this);
            boolean bl5 = arrayList.isEmpty();
            if (bl5) {
                ((DZ0)object).f = false;
            }
        } else {
            bl4 = this.c;
            if (bl4) {
                this.b();
            }
        }
        return super.setVisible(bl2, bl3);
    }

    public final void start() {
        this.c = true;
        this.f = 0;
        boolean bl2 = this.e;
        if (bl2) {
            this.b();
        }
    }

    public final void stop() {
        this.c = false;
        this.b = false;
        DZ0 dZ0 = this.a.a;
        ArrayList arrayList = dZ0.c;
        arrayList.remove(this);
        boolean bl2 = arrayList.isEmpty();
        if (bl2) {
            dZ0.f = false;
        }
    }
}

