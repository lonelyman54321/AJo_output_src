/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Parcelable
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.View$BaseSavedState
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 *  android.widget.TabHost
 *  android.widget.TabHost$OnTabChangeListener
 *  android.widget.TabWidget
 */
package androidx.fragment.app;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabWidget;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTabHost$SavedState;
import androidx.fragment.app.FragmentTabHost$a;
import androidx.fragment.app.k;
import java.util.ArrayList;

public class FragmentTabHost
extends TabHost
implements TabHost.OnTabChangeListener {
    public final ArrayList a;
    public FrameLayout b;
    public FragmentManager c;
    public int d;
    public TabHost.OnTabChangeListener e;
    public boolean f;

    public FragmentTabHost(Context context) {
        super(context, null);
        int n3;
        Object object = new ArrayList();
        this.a = object;
        object = new int[]{16842995};
        context = context.obtainStyledAttributes(null, (int[])object, 0, 0);
        this.d = n3 = context.getResourceId(0, 0);
        context.recycle();
        super.setOnTabChangedListener((TabHost.OnTabChangeListener)this);
    }

    public FragmentTabHost(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int n3;
        Object object = new ArrayList();
        this.a = object;
        object = new int[]{16842995};
        context = context.obtainStyledAttributes(attributeSet, (int[])object, 0, 0);
        this.d = n3 = context.getResourceId(0, 0);
        context.recycle();
        super.setOnTabChangedListener((TabHost.OnTabChangeListener)this);
    }

    public final k a() {
        ArrayList arrayList = this.a;
        int n3 = arrayList.size();
        if (n3 <= 0) {
            return null;
        }
        ((FragmentTabHost$a)arrayList.get(0)).getClass();
        throw null;
    }

    public final void b() {
        Object object = this.b;
        if (object == null) {
            int n3 = this.d;
            this.b = object = (FrameLayout)this.findViewById(n3);
            if (object == null) {
                CharSequence charSequence = new StringBuilder("No tab content FrameLayout found for id ");
                int n4 = this.d;
                charSequence.append(n4);
                charSequence = charSequence.toString();
                object = new IllegalStateException((String)charSequence);
                throw object;
            }
        }
    }

    public final void c(Context context) {
        int n3 = 16908307;
        View view = this.findViewById(n3);
        if (view == null) {
            view = new LinearLayout(context);
            int n4 = 1;
            view.setOrientation(n4);
            int n7 = -1;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(n7, n7);
            this.addView(view, (ViewGroup.LayoutParams)layoutParams);
            layoutParams = new TabWidget(context);
            layoutParams.setId(n3);
            n3 = 0;
            layoutParams.setOrientation(0);
            int n8 = -2;
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(n7, n8, 0.0f);
            view.addView((View)layoutParams, (ViewGroup.LayoutParams)layoutParams2);
            layoutParams = new FrameLayout(context);
            layoutParams.setId(0x1020011);
            layoutParams2 = new LinearLayout.LayoutParams(0, 0, 0.0f);
            view.addView((View)layoutParams, (ViewGroup.LayoutParams)layoutParams2);
            layoutParams = new FrameLayout(context);
            this.b = layoutParams;
            int n10 = this.d;
            layoutParams.setId(n10);
            float f5 = 1.0f;
            context = new LinearLayout.LayoutParams(n7, 0, f5);
            view.addView((View)layoutParams, (ViewGroup.LayoutParams)context);
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.getCurrentTabTag();
        ArrayList arrayList = this.a;
        int n3 = arrayList.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            boolean bl2;
            FragmentTabHost$a fragmentTabHost$a = (FragmentTabHost$a)arrayList.get(i3);
            Object object = this.c;
            fragmentTabHost$a.getClass();
            object = ((FragmentManager)object).E(null);
            fragmentTabHost$a.getClass();
            if (object == null || (bl2 = ((Fragment)object).isDetached())) continue;
            throw null;
        }
        this.f = true;
        this.a();
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f = false;
    }

    public final void onRestoreInstanceState(Parcelable object) {
        boolean bl2 = object instanceof FragmentTabHost$SavedState;
        if (!bl2) {
            super.onRestoreInstanceState(object);
            return;
        }
        object = (FragmentTabHost$SavedState)((Object)object);
        Parcelable parcelable = object.getSuperState();
        super.onRestoreInstanceState(parcelable);
        object = object.a;
        this.setCurrentTabByTag((String)object);
    }

    public final Parcelable onSaveInstanceState() {
        Object object = super.onSaveInstanceState();
        FragmentTabHost$SavedState fragmentTabHost$SavedState = new View.BaseSavedState(object);
        object = this.getCurrentTabTag();
        fragmentTabHost$SavedState.a = object;
        return fragmentTabHost$SavedState;
    }

    public final void onTabChanged(String string2) {
        TabHost.OnTabChangeListener onTabChangeListener;
        boolean bl2 = this.f;
        if (bl2) {
            this.a();
        }
        if ((onTabChangeListener = this.e) != null) {
            onTabChangeListener.onTabChanged(string2);
        }
    }

    public void setOnTabChangedListener(TabHost.OnTabChangeListener onTabChangeListener) {
        this.e = onTabChangeListener;
    }

    public void setup() {
        IllegalStateException illegalStateException = new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
        throw illegalStateException;
    }

    public void setup(Context context, FragmentManager fragmentManager) {
        this.c(context);
        super.setup();
        this.c = fragmentManager;
        this.b();
    }

    public void setup(Context context, FragmentManager fragmentManager, int n3) {
        this.c(context);
        super.setup();
        this.c = fragmentManager;
        this.d = n3;
        this.b();
        context = this.b;
        context.setId(n3);
        int n4 = this.getId();
        int n7 = -1;
        if (n4 == n7) {
            n4 = 0x1020012;
            this.setId(n4);
        }
    }
}

