/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Rect
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 */
package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.R$styleable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;

public final class CoordinatorLayout$e
extends ViewGroup.MarginLayoutParams {
    public CoordinatorLayout$Behavior a;
    public boolean b;
    public int c;
    public int d;
    public final int e;
    public final int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public View k;
    public View l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public final Rect q;
    public Object r;

    public CoordinatorLayout$e() {
        Rect rect;
        int n3;
        int n4 = -2;
        super(n4, n4);
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = n3 = -1;
        this.f = n3;
        this.g = 0;
        this.h = 0;
        this.q = rect = new Rect();
    }

    public CoordinatorLayout$e(Context object, AttributeSet attributeSet) {
        super((Context)object, attributeSet);
        int n3;
        Object object2;
        int n4;
        String string2 = null;
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = n4 = -1;
        this.f = n4;
        this.g = 0;
        this.h = 0;
        this.q = object2 = new Rect();
        object2 = R$styleable.CoordinatorLayout_Layout;
        object2 = object.obtainStyledAttributes(attributeSet, (int[])object2);
        int n7 = R$styleable.CoordinatorLayout_Layout_android_layout_gravity;
        this.c = n7 = object2.getInteger(n7, 0);
        n7 = R$styleable.CoordinatorLayout_Layout_layout_anchor;
        this.f = n7 = object2.getResourceId(n7, n4);
        n7 = R$styleable.CoordinatorLayout_Layout_layout_anchorGravity;
        this.d = n7 = object2.getInteger(n7, 0);
        n7 = R$styleable.CoordinatorLayout_Layout_layout_keyline;
        this.e = n4 = object2.getInteger(n7, n4);
        n4 = R$styleable.CoordinatorLayout_Layout_layout_insetEdge;
        this.g = n4 = object2.getInt(n4, 0);
        n4 = R$styleable.CoordinatorLayout_Layout_layout_dodgeInsetEdges;
        this.h = n3 = object2.getInt(n4, 0);
        n3 = R$styleable.CoordinatorLayout_Layout_layout_behavior;
        n3 = (int)(object2.hasValue(n3) ? 1 : 0);
        this.b = n3;
        if (n3 != 0) {
            n3 = R$styleable.CoordinatorLayout_Layout_layout_behavior;
            string2 = object2.getString(n3);
            this.a = object = CoordinatorLayout.parseBehavior((Context)object, attributeSet, string2);
        }
        object2.recycle();
        object = this.a;
        if (object != null) {
            ((CoordinatorLayout$Behavior)object).onAttachedToLayoutParams(this);
        }
    }

    public CoordinatorLayout$e(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        int n3;
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = n3 = -1;
        this.f = n3;
        this.g = 0;
        this.h = 0;
        super();
        this.q = layoutParams;
    }

    public CoordinatorLayout$e(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        int n3;
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = n3 = -1;
        this.f = n3;
        this.g = 0;
        this.h = 0;
        super();
        this.q = marginLayoutParams;
    }

    public CoordinatorLayout$e(CoordinatorLayout$e coordinatorLayout$e) {
        super((ViewGroup.MarginLayoutParams)coordinatorLayout$e);
        int n3;
        this.b = false;
        this.c = 0;
        this.d = 0;
        this.e = n3 = -1;
        this.f = n3;
        this.g = 0;
        this.h = 0;
        super();
        this.q = coordinatorLayout$e;
    }

    public final boolean a(int n3) {
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                return false;
            }
            return this.o;
        }
        return this.n;
    }

    public final void b(CoordinatorLayout$Behavior coordinatorLayout$Behavior) {
        CoordinatorLayout$Behavior coordinatorLayout$Behavior2 = this.a;
        if (coordinatorLayout$Behavior2 != coordinatorLayout$Behavior) {
            boolean bl2;
            if (coordinatorLayout$Behavior2 != null) {
                coordinatorLayout$Behavior2.onDetachedFromLayoutParams();
            }
            this.a = coordinatorLayout$Behavior;
            coordinatorLayout$Behavior2 = null;
            this.r = null;
            this.b = bl2 = true;
            if (coordinatorLayout$Behavior != null) {
                coordinatorLayout$Behavior.onAttachedToLayoutParams(this);
            }
        }
    }
}

