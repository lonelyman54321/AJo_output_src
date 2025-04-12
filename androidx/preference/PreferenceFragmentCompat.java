/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.os.Bundle
 *  android.os.Looper
 *  android.util.TypedValue
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
package androidx.preference;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.preference.DialogPreference$a;
import androidx.preference.PreferenceFragmentCompat$a;
import androidx.preference.PreferenceFragmentCompat$b;
import androidx.preference.R$attr;
import androidx.preference.R$id;
import androidx.preference.R$layout;
import androidx.preference.R$style;
import androidx.preference.R$styleable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.v;

public abstract class PreferenceFragmentCompat
extends Fragment
implements DialogPreference$a {
    public final PreferenceFragmentCompat$b a;
    public iy2_1 b;
    public RecyclerView c;
    public int d;
    public final PreferenceFragmentCompat$a e;
    public final Runnable f;

    public PreferenceFragmentCompat() {
        int n3;
        Object object;
        this.a = object = new PreferenceFragmentCompat$b(this);
        this.d = n3 = R$layout.preference_list_fragment;
        Looper looper = Looper.getMainLooper();
        super(this, looper);
        this.e = object;
        super(this);
        this.f = object;
    }

    public abstract void Oa();

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = new TypedValue();
        Object object2 = this.requireContext().getTheme();
        int n3 = R$attr.preferenceTheme;
        boolean bl2 = true;
        object2.resolveAttribute(n3, (TypedValue)object, bl2);
        int n4 = object.resourceId;
        if (n4 == 0) {
            n4 = R$style.PreferenceThemeOverlay;
        }
        object2 = this.requireContext().getTheme();
        n3 = 0;
        object2.applyStyle(n4, false);
        object2 = this.requireContext();
        object = new Object();
        StringBuilder stringBuilder = new StringBuilder();
        object2 = object2.getPackageName();
        stringBuilder.append((String)object2);
        object2 = "_preferences";
        stringBuilder.append((String)object2);
        this.b = object;
        object = this.getArguments();
        if (object != null) {
            object = this.getArguments();
            object2 = "androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT";
            object.getString((String)object2);
        }
        this.Oa();
    }

    public final View onCreateView(LayoutInflater object, ViewGroup viewGroup, Bundle bundle) {
        bundle = this.requireContext();
        Object object2 = R$styleable.PreferenceFragmentCompat;
        int n3 = R$attr.preferenceFragmentCompatStyle;
        int n4 = 0;
        RecyclerView recyclerView = null;
        bundle = bundle.obtainStyledAttributes(null, (int[])object2, n3, 0);
        int n7 = R$styleable.PreferenceFragmentCompat_android_layout;
        n3 = this.d;
        this.d = n7 = bundle.getResourceId(n7, n3);
        n7 = R$styleable.PreferenceFragmentCompat_android_divider;
        object2 = bundle.getDrawable(n7);
        n3 = R$styleable.PreferenceFragmentCompat_android_dividerHeight;
        int n8 = -1;
        n3 = bundle.getDimensionPixelSize(n3, n8);
        int n10 = R$styleable.PreferenceFragmentCompat_allowDividerAfterLastItem;
        n10 = (int)(bundle.getBoolean(n10, true) ? 1 : 0);
        bundle.recycle();
        bundle = this.requireContext();
        object = object.cloneInContext((Context)bundle);
        int n14 = this.d;
        viewGroup = object.inflate(n14, viewGroup, false);
        n14 = 16908351;
        bundle = viewGroup.findViewById(n14);
        int n15 = bundle instanceof ViewGroup;
        if (n15 != 0) {
            String string2;
            bundle = (ViewGroup)bundle;
            Object object3 = this.requireContext().getPackageManager();
            n15 = object3.hasSystemFeature(string2 = "android.hardware.type.automotive");
            if (n15 == 0 || (object3 = (RecyclerView)bundle.findViewById(n15 = R$id.recycler_view)) == null) {
                n15 = R$layout.preference_recyclerview;
                object3 = object = object.inflate(n15, (ViewGroup)bundle, false);
                object3 = (RecyclerView)object;
                string2 = this.requireContext();
                object = new LinearLayoutManager((Context)string2);
                ((RecyclerView)object3).setLayoutManager((RecyclerView$o)object);
                object = new jy2_0((RecyclerView)object3);
                ((RecyclerView)object3).setAccessibilityDelegateCompat((v)object);
            }
            this.c = object3;
            object = this.a;
            ((RecyclerView)object3).addItemDecoration((RecyclerView$n)object);
            if (object2 != null) {
                object.getClass();
                ((PreferenceFragmentCompat$b)object).b = n4 = object2.getIntrinsicHeight();
            } else {
                ((PreferenceFragmentCompat$b)object).b = 0;
            }
            ((PreferenceFragmentCompat$b)object).a = (Drawable)object2;
            object2 = ((PreferenceFragmentCompat$b)object).d;
            recyclerView = ((PreferenceFragmentCompat)object2).c;
            recyclerView.invalidateItemDecorations();
            if (n3 != n8) {
                ((PreferenceFragmentCompat$b)object).b = n3;
                object2 = ((PreferenceFragmentCompat)object2).c;
                ((RecyclerView)object2).invalidateItemDecorations();
            }
            ((PreferenceFragmentCompat$b)object).c = n10;
            object = this.c.getParent();
            if (object == null) {
                object = this.c;
                bundle.addView((View)object);
            }
            object = this.f;
            this.e.post((Runnable)object);
            return viewGroup;
        }
        object = new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        throw object;
    }

    public final void onDestroyView() {
        Runnable runnable2 = this.f;
        PreferenceFragmentCompat$a preferenceFragmentCompat$a = this.e;
        preferenceFragmentCompat$a.removeCallbacks(runnable2);
        preferenceFragmentCompat$a.removeMessages(1);
        this.c = null;
        super.onDestroyView();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.b.getClass();
    }

    public final void onStart() {
        super.onStart();
        this.b.getClass();
    }

    public final void onStop() {
        super.onStop();
        this.b.getClass();
    }

    public final void onViewCreated(View object, Bundle bundle) {
        super.onViewCreated((View)object, bundle);
        if (bundle != null && (object = bundle.getBundle("android:preferences")) != null) {
            object = this.b;
            object.getClass();
        }
    }

    public final void u8() {
    }
}

