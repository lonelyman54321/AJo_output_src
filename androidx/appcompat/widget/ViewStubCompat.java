/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.util.AttributeSet
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.R$styleable;
import androidx.appcompat.widget.ViewStubCompat$a;
import java.lang.ref.WeakReference;

public final class ViewStubCompat
extends View {
    public int a = 0;
    public int b;
    public WeakReference c;
    public LayoutInflater d;

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
        int[] nArray = R$styleable.ViewStubCompat;
        context = context.obtainStyledAttributes(attributeSet, nArray, n3, 0);
        int n4 = R$styleable.ViewStubCompat_android_inflatedId;
        n3 = -1;
        this.b = n4 = context.getResourceId(n4, n3);
        n4 = R$styleable.ViewStubCompat_android_layout;
        this.a = n4 = context.getResourceId(n4, 0);
        n4 = R$styleable.ViewStubCompat_android_id;
        n4 = context.getResourceId(n4, n3);
        this.setId(n4);
        context.recycle();
        this.setVisibility(8);
        this.setWillNotDraw(true);
    }

    public final View a() {
        Object object = this.getParent();
        int n3 = object instanceof ViewGroup;
        if (n3 != 0) {
            n3 = this.a;
            if (n3 != 0) {
                object = (ViewGroup)object;
                LayoutInflater layoutInflater = this.d;
                if (layoutInflater == null) {
                    layoutInflater = LayoutInflater.from((Context)this.getContext());
                }
                int n4 = this.a;
                ViewGroup.LayoutParams layoutParams = null;
                layoutInflater = layoutInflater.inflate(n4, (ViewGroup)object, false);
                n4 = this.b;
                int n7 = -1;
                if (n4 != n7) {
                    layoutInflater.setId(n4);
                }
                n4 = object.indexOfChild((View)this);
                object.removeViewInLayout((View)this);
                layoutParams = this.getLayoutParams();
                if (layoutParams != null) {
                    object.addView((View)layoutInflater, n4, layoutParams);
                } else {
                    object.addView((View)layoutInflater, n4);
                }
                object = new WeakReference(layoutInflater);
                this.c = object;
                return layoutInflater;
            }
            object = new IllegalArgumentException("ViewStub must have a valid layoutResource");
            throw object;
        }
        object = new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        throw object;
    }

    public final void dispatchDraw(Canvas canvas) {
    }

    public final void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.b;
    }

    public LayoutInflater getLayoutInflater() {
        return this.d;
    }

    public int getLayoutResource() {
        return this.a;
    }

    public final void onMeasure(int n3, int n4) {
        this.setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int n3) {
        this.b = n3;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.d = layoutInflater;
    }

    public void setLayoutResource(int n3) {
        this.a = n3;
    }

    public void setOnInflateListener(ViewStubCompat$a viewStubCompat$a) {
    }

    /*
     * Enabled aggressive block sorting
     */
    public void setVisibility(int n3) {
        WeakReference weakReference = this.c;
        if (weakReference != null) {
            if ((weakReference = (View)weakReference.get()) != null) {
                weakReference.setVisibility(n3);
                return;
            }
            IllegalStateException illegalStateException = new IllegalStateException("setVisibility called on un-referenced view");
            throw illegalStateException;
        }
        super.setVisibility(n3);
        if (n3 != 0) {
            int n4 = 4;
            if (n3 != n4) return;
        }
        this.a();
    }
}

