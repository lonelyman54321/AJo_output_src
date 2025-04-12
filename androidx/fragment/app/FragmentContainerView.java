/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.LayoutTransition
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.graphics.Canvas
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.View$OnApplyWindowInsetsListener
 *  android.view.ViewGroup$LayoutParams
 *  android.view.WindowInsets
 *  android.widget.FrameLayout
 */
package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.f;
import androidx.core.view.f$k;
import androidx.fragment.R$id;
import androidx.fragment.R$styleable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentManager$d;
import androidx.fragment.app.a;
import androidx.fragment.app.h;
import androidx.fragment.app.k;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class FragmentContainerView
extends FrameLayout {
    public final ArrayList a;
    public final ArrayList b;
    public View.OnApplyWindowInsetsListener c;
    public boolean d;

    public FragmentContainerView(Context object) {
        Intrinsics.checkNotNullParameter(object, "context");
        super(object);
        super();
        this.a = object;
        super();
        this.b = object;
        this.d = true;
    }

    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(context, "context");
        this(context, attributeSet, 0);
    }

    public FragmentContainerView(Context object, AttributeSet object2, int n3) {
        Object object3 = "context";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        super(object, object2, n3);
        Object object4 = new ArrayList();
        this.a = object4;
        object4 = new ArrayList();
        this.b = object4;
        n3 = 1;
        this.d = n3;
        if (object2 != null) {
            boolean bl2;
            object4 = object2.getClassAttribute();
            object3 = R$styleable.FragmentContainerView;
            Intrinsics.checkNotNullExpressionValue(object3, "FragmentContainerView");
            object = object.obtainStyledAttributes(object2, (int[])object3, 0, 0);
            if (object4 == null) {
                int n4 = R$styleable.FragmentContainerView_android_name;
                object4 = object.getString(n4);
                object2 = "android:name";
            } else {
                object2 = "class";
            }
            object.recycle();
            if (object4 != null && !(bl2 = this.isInEditMode())) {
                object3 = new StringBuilder("FragmentContainerView must be within a FragmentActivity to use ");
                ((StringBuilder)object3).append((String)object2);
                ((StringBuilder)object3).append("=\"");
                ((StringBuilder)object3).append((String)object4);
                ((StringBuilder)object3).append('\"');
                object2 = ((StringBuilder)object3).toString();
                super((String)object2);
                throw object;
            }
        }
    }

    public FragmentContainerView(Context object, AttributeSet object2, FragmentManager object3) {
        int n3;
        int n4;
        int n7;
        View view;
        Intrinsics.checkNotNullParameter(object, "context");
        Intrinsics.checkNotNullParameter(object2, "attrs");
        Intrinsics.checkNotNullParameter(object3, "fm");
        super((Context)object, (AttributeSet)object2);
        this.a = view = new ArrayList();
        this.b = view = new ArrayList();
        this.d = n7 = 1;
        Object object4 = object2.getClassAttribute();
        Object object5 = R$styleable.FragmentContainerView;
        Intrinsics.checkNotNullExpressionValue(object5, "FragmentContainerView");
        int n8 = 0;
        String string2 = null;
        object5 = object.obtainStyledAttributes((AttributeSet)object2, object5, 0, 0);
        if (object4 == null) {
            n4 = R$styleable.FragmentContainerView_android_name;
            object4 = object5.getString(n4);
        }
        n8 = R$styleable.FragmentContainerView_android_tag;
        string2 = object5.getString(n8);
        object5.recycle();
        int n10 = this.getId();
        Object object6 = ((FragmentManager)object3).D(n10);
        if (object4 != null && object6 == null) {
            int n14 = -1;
            if (n10 == n14) {
                object = string2 != null ? " with tag ".concat(string2) : "";
                object = cP.a("FragmentContainerView must have an android:id to add Fragment ", (String)object4, (String)object);
                super((String)object);
                throw object2;
            }
            object6 = ((FragmentManager)object3).M();
            object.getClassLoader();
            object4 = Fragment.instantiate(((FragmentManager$d)object6).b.x.b, (String)object4, null);
            object6 = "fm.fragmentFactory.insta\u2026ontext.classLoader, name)";
            Intrinsics.checkNotNullExpressionValue(object4, (String)object6);
            ((Fragment)object4).mFragmentId = n10;
            ((Fragment)object4).mContainerId = n10;
            ((Fragment)object4).mTag = string2;
            ((Fragment)object4).mFragmentManager = object3;
            object5 = ((FragmentManager)object3).x;
            ((Fragment)object4).mHost = object5;
            ((Fragment)object4).onInflate((Context)object, (AttributeSet)object2, null);
            object = new a((FragmentManager)object3);
            ((k)object).p = n7;
            ((Fragment)object4).mContainer = this;
            ((Fragment)object4).mInDynamicContainer = n7;
            n3 = this.getId();
            ((a)object).h(n3, (Fragment)object4, string2, n7);
            ((a)object).f();
        }
        object = ((FragmentManager)object3).c.d().iterator();
        while ((n3 = object.hasNext()) != 0) {
            object2 = (h)object.next();
            object3 = ((h)object2).c;
            n7 = ((Fragment)object3).mContainerId;
            n4 = this.getId();
            if (n7 != n4 || (view = ((Fragment)object3).mView) == null || (view = view.getParent()) != null) continue;
            ((Fragment)object3).mContainer = this;
            ((h)object2).a();
            ((h)object2).i();
        }
    }

    public final void a(View view) {
        ArrayList arrayList = this.b;
        boolean bl2 = arrayList.contains(view);
        if (bl2) {
            arrayList = this.a;
            arrayList.add(view);
        }
    }

    public final void addView(View object, int n3, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(object, "child");
        int n4 = R$id.fragment_container_view_tag;
        Object object2 = object.getTag(n4);
        boolean bl2 = object2 instanceof Fragment;
        if (bl2) {
            object2 = (Fragment)object2;
        } else {
            n4 = 0;
            object2 = null;
        }
        if (object2 != null) {
            super.addView((View)object, n3, layoutParams);
            return;
        }
        Serializable serializable = new StringBuilder("Views added to a FragmentContainerView must be associated with a Fragment. View ");
        serializable.append(object);
        serializable.append(" is not associated with a Fragment.");
        object = serializable.toString();
        object = object.toString();
        serializable = new IllegalStateException((String)object);
        throw serializable;
    }

    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        Object object = "insets";
        Intrinsics.checkNotNullParameter(windowInsets, (String)object);
        int n3 = 0;
        f$k f$k = null;
        Object object2 = f.h(null, windowInsets);
        Intrinsics.checkNotNullExpressionValue(object2, "toWindowInsetsCompat(insets)");
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.c;
        if (onApplyWindowInsetsListener != null) {
            Intrinsics.checkNotNull(onApplyWindowInsetsListener);
            Intrinsics.checkNotNullParameter(onApplyWindowInsetsListener, "onApplyWindowInsetsListener");
            Intrinsics.checkNotNullParameter((Object)this, "v");
            Intrinsics.checkNotNullParameter(windowInsets, (String)object);
            object = onApplyWindowInsetsListener.onApplyWindowInsets((View)this, windowInsets);
            object2 = "onApplyWindowInsetsListe\u2026lyWindowInsets(v, insets)";
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
            object = f.h(null, (WindowInsets)object);
        } else {
            object = ViewCompat.n((View)this, (f)object2);
        }
        Intrinsics.checkNotNullExpressionValue(object, "if (applyWindowInsetsLis\u2026, insetsCompat)\n        }");
        f$k = ((f)object).a;
        n3 = f$k.m();
        if (n3 == 0) {
            n3 = this.getChildCount();
            object2 = null;
            for (int i3 = 0; i3 < n3; ++i3) {
                onApplyWindowInsetsListener = this.getChildAt(i3);
                ViewCompat.b((View)onApplyWindowInsetsListener, (f)object);
            }
        }
        return windowInsets;
    }

    public final void dispatchDraw(Canvas canvas) {
        Object object = "canvas";
        Intrinsics.checkNotNullParameter(canvas, (String)object);
        boolean bl2 = this.d;
        if (bl2) {
            boolean bl3;
            object = this.a.iterator();
            while (bl3 = object.hasNext()) {
                View view = (View)object.next();
                long l2 = this.getDrawingTime();
                super.drawChild(canvas, view, l2);
            }
        }
        super.dispatchDraw(canvas);
    }

    public final boolean drawChild(Canvas canvas, View view, long l2) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Object object = "child";
        Intrinsics.checkNotNullParameter(view, (String)object);
        boolean bl3 = this.d;
        if (bl3 && (bl2 = (object = this.a).isEmpty() ^ true) && (bl3 = ((ArrayList)object).contains(view))) {
            return false;
        }
        return super.drawChild(canvas, view, l2);
    }

    public final void endViewTransition(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.b.remove(view);
        ArrayList arrayList = this.a;
        boolean bl2 = arrayList.remove(view);
        if (bl2) {
            this.d = bl2 = true;
        }
        super.endViewTransition(view);
    }

    public final Fragment getFragment() {
        Object object;
        block9: {
            block8: {
                block5: {
                    boolean bl2;
                    block6: {
                        block7: {
                            object = FragmentManager.F((View)this);
                            if (object == null) break block6;
                            boolean n3 = ((Fragment)object).isAdded();
                            if (!n3) break block7;
                            object = ((Fragment)object).getChildFragmentManager();
                            break block8;
                        }
                        StringBuilder stringBuilder = new StringBuilder("The Fragment ");
                        stringBuilder.append(object);
                        stringBuilder.append(" that owns View ");
                        stringBuilder.append((Object)this);
                        stringBuilder.append(" has already been destroyed. Nested fragments should always use the child FragmentManager.");
                        object = stringBuilder.toString();
                        IllegalStateException illegalStateException = new IllegalStateException((String)object);
                        throw illegalStateException;
                    }
                    object = this.getContext();
                    while (bl2 = object instanceof ContextWrapper) {
                        bl2 = object instanceof FragmentActivity;
                        if (bl2) {
                            object = (FragmentActivity)object;
                            break block5;
                        }
                        object = ((ContextWrapper)object).getBaseContext();
                    }
                    object = null;
                }
                if (object == null) break block9;
                object = ((FragmentActivity)object).getSupportFragmentManager();
            }
            int n3 = this.getId();
            return ((FragmentManager)object).D(n3);
        }
        CharSequence charSequence = new StringBuilder("View ");
        charSequence.append((Object)this);
        charSequence.append(" is not within a subclass of FragmentActivity.");
        charSequence = charSequence.toString();
        object = new IllegalStateException((String)charSequence);
        throw object;
    }

    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        Intrinsics.checkNotNullParameter(windowInsets, "insets");
        return windowInsets;
    }

    public final void removeAllViewsInLayout() {
        int n3;
        for (int i3 = this.getChildCount() + -1; (n3 = -1) < i3; i3 += -1) {
            View view = this.getChildAt(i3);
            String string2 = "view";
            Intrinsics.checkNotNullExpressionValue(view, string2);
            this.a(view);
        }
        super.removeAllViewsInLayout();
    }

    public final void removeView(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.a(view);
        super.removeView(view);
    }

    public final void removeViewAt(int n3) {
        View view = this.getChildAt(n3);
        Intrinsics.checkNotNullExpressionValue(view, "view");
        this.a(view);
        super.removeViewAt(n3);
    }

    public final void removeViewInLayout(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.a(view);
        super.removeViewInLayout(view);
    }

    public final void removeViews(int n3, int n4) {
        int n7 = n3 + n4;
        for (int i3 = n3; i3 < n7; ++i3) {
            View view = this.getChildAt(i3);
            String string2 = "view";
            Intrinsics.checkNotNullExpressionValue(view, string2);
            this.a(view);
        }
        super.removeViews(n3, n4);
    }

    public final void removeViewsInLayout(int n3, int n4) {
        int n7 = n3 + n4;
        for (int i3 = n3; i3 < n7; ++i3) {
            View view = this.getChildAt(i3);
            String string2 = "view";
            Intrinsics.checkNotNullExpressionValue(view, string2);
            this.a(view);
        }
        super.removeViewsInLayout(n3, n4);
    }

    public final void setDrawDisappearingViewsLast(boolean bl2) {
        this.d = bl2;
    }

    public void setLayoutTransition(LayoutTransition object) {
        object = new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
        throw object;
    }

    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        Intrinsics.checkNotNullParameter(onApplyWindowInsetsListener, "listener");
        this.c = onApplyWindowInsetsListener;
    }

    public final void startViewTransition(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Object object = view.getParent();
        if (object == this) {
            object = this.b;
            ((ArrayList)object).add(view);
        }
        super.startViewTransition(view);
    }
}

