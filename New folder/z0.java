/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.content.res.Resources$Theme
 *  android.util.AttributeSet
 *  android.util.TypedValue
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 */
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$styleable;
import androidx.appcompat.view.menu.a;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.ViewCompat;

public abstract class z0
extends ViewGroup {
    public final z0$a a;
    public final Context b;
    public ActionMenuView c;
    public ActionMenuPresenter d;
    public int e;
    public zd3_1 f;
    public boolean g;
    public boolean h;

    public z0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public z0(Context context, AttributeSet object, int n3) {
        super(context, object, n3);
        super(this);
        this.a = object;
        super();
        Resources.Theme theme = context.getTheme();
        int n4 = R$attr.actionBarPopupTheme;
        boolean bl2 = true;
        n3 = (int)(theme.resolveAttribute(n4, (TypedValue)object, bl2) ? 1 : 0);
        if (n3 != 0 && (n3 = object.resourceId) != 0) {
            int n7 = object.resourceId;
            super(context, n7);
            this.b = theme;
        } else {
            this.b = context;
        }
    }

    public static /* synthetic */ void a(z0 z02) {
        super.setVisibility(0);
    }

    public static /* synthetic */ void b(z0 z02, int n3) {
        super.setVisibility(n3);
    }

    public static int c(View view, int n3, int n4) {
        int n7 = View.MeasureSpec.makeMeasureSpec((int)n3, (int)(-1 << -1));
        view.measure(n7, n4);
        int n8 = view.getMeasuredWidth();
        return Math.max(0, n3 -= n8);
    }

    public static int d(View view, boolean bl2, int n3, int n4, int n7) {
        int n8 = view.getMeasuredWidth();
        int n10 = view.getMeasuredHeight();
        n7 = (n7 - n10) / 2 + n4;
        if (bl2) {
            n4 = n3 - n8;
            view.layout(n4, n7, n3, n10 += n7);
        } else {
            n4 = n3 + n8;
            view.layout(n3, n7, n4, n10 += n7);
        }
        if (bl2) {
            n8 = -n8;
        }
        return n8;
    }

    public final zd3_1 e(int n3, long l2) {
        Object object = this.f;
        if (object != null) {
            ((zd3_1)object).b();
        }
        object = this.a;
        zd3_1 zd3_12 = null;
        if (n3 == 0) {
            int n4 = this.getVisibility();
            if (n4 != 0) {
                this.setAlpha(0.0f);
            }
            zd3_12 = ViewCompat.a((View)this);
            zd3_12.a(1.0f);
            zd3_12.c(l2);
            ((z0$a)object).c.f = zd3_12;
            ((z0$a)object).b = n3;
            zd3_12.d((BD3)object);
            return zd3_12;
        }
        zd3_1 zd3_13 = ViewCompat.a((View)this);
        zd3_13.a(0.0f);
        zd3_13.c(l2);
        ((z0$a)object).c.f = zd3_13;
        ((z0$a)object).b = n3;
        zd3_13.d((BD3)object);
        return zd3_13;
    }

    public int getAnimatedVisibility() {
        zd3_1 zd3_12 = this.f;
        if (zd3_12 != null) {
            return this.a.b;
        }
        return this.getVisibility();
    }

    public int getContentHeight() {
        return this.e;
    }

    public final void onConfigurationChanged(Configuration object) {
        super.onConfigurationChanged((Configuration)object);
        object = this.getContext();
        Object object2 = R$styleable.ActionBar;
        int n3 = R$attr.actionBarStyle;
        object = object.obtainStyledAttributes(null, (int[])object2, n3, 0);
        int n4 = R$styleable.ActionBar_height;
        n4 = object.getLayoutDimension(n4, 0);
        this.setContentHeight(n4);
        object.recycle();
        object = this.d;
        if (object != null) {
            int n7;
            object2 = M2.a(((a)object).b);
            ((ActionMenuPresenter)object).q = n7 = ((M2)object2).b();
            object = ((a)object).c;
            if (object != null) {
                boolean bl3 = true;
                ((d)object).onItemsChanged(bl3);
            }
        }
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int n3;
        int n4;
        int n7 = motionEvent.getActionMasked();
        if (n7 == (n4 = 9)) {
            this.h = false;
        }
        boolean bl2 = this.h;
        boolean bl3 = true;
        if (!bl2) {
            n3 = (int)(super.onHoverEvent(motionEvent) ? 1 : 0);
            if (n7 == n4 && n3 == 0) {
                this.h = bl3;
            }
        }
        if (n7 == (n3 = 10) || n7 == (n3 = 3)) {
            this.h = false;
        }
        return bl3;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int n3;
        int n4 = motionEvent.getActionMasked();
        if (!n4) {
            this.g = false;
        }
        boolean bl2 = this.g;
        int n7 = 1;
        if (!bl2) {
            n3 = super.onTouchEvent(motionEvent);
            if (!n4 && !n3) {
                this.g = n7;
            }
        }
        if (n4 == n7 || n4 == (n3 = 3)) {
            this.g = false;
        }
        return n7 != 0;
    }

    public void setContentHeight(int n3) {
        this.e = n3;
        this.requestLayout();
    }

    public void setVisibility(int n3) {
        int n4 = this.getVisibility();
        if (n3 != n4) {
            zd3_1 zd3_12 = this.f;
            if (zd3_12 != null) {
                zd3_12.b();
            }
            super.setVisibility(n3);
        }
    }
}

