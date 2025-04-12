/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Handler
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.animation.Animation
 *  android.view.animation.AnimationUtils
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.LinearLayout
 *  android.widget.ListAdapter
 *  android.widget.ListView
 *  android.widget.ProgressBar
 *  android.widget.TextView
 */
package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment$a;

public class ListFragment
extends Fragment {
    public final Handler a;
    public final Runnable b;
    public final ListFragment$a c;
    public ListAdapter d;
    public ListView e;
    public View f;
    public View g;
    public View h;
    public boolean i;

    public ListFragment() {
        Object object;
        this.a = object = new Handler();
        super(this);
        this.b = object;
        super(this);
        this.c = object;
    }

    public final void Oa() {
        Object object = this.e;
        if (object != null) {
            return;
        }
        object = this.getView();
        if (object != null) {
            boolean bl2;
            Object object2;
            int n3 = object instanceof ListView;
            if (n3 != 0) {
                this.e = object;
            } else {
                n3 = 0xFF0001;
                object2 = (TextView)object.findViewById(n3);
                if (object2 == null) {
                    n3 = 16908292;
                    object2 = object.findViewById(n3);
                    this.f = object2;
                } else {
                    int bl3 = 8;
                    object2.setVisibility(bl3);
                }
                object2 = object.findViewById(0xFF0002);
                this.g = object2;
                object2 = object.findViewById(0xFF0003);
                this.h = object2;
                object = object.findViewById(16908298);
                n3 = object instanceof ListView;
                if (n3 == 0) {
                    if (object == null) {
                        object = new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
                        throw object;
                    }
                    object = new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                    throw object;
                }
                this.e = object;
                object2 = this.f;
                if (object2 != null) {
                    object.setEmptyView((View)object2);
                }
            }
            this.i = bl2 = true;
            object2 = this.e;
            ListFragment$a listFragment$a = this.c;
            object2.setOnItemClickListener((AdapterView.OnItemClickListener)listFragment$a);
            object2 = this.d;
            boolean bl3 = false;
            listFragment$a = null;
            if (object2 != null) {
                this.d = object2;
                ListView listView = this.e;
                if (listView != null) {
                    listView.setAdapter((ListAdapter)object2);
                    n3 = (int)(this.i ? 1 : 0);
                    if (n3 == 0) {
                        boolean bl4;
                        object2 = this.requireView().getWindowToken();
                        if (object2 != null) {
                            bl4 = true;
                        }
                        this.Pa(bl2, bl4);
                    }
                }
            } else {
                object = this.g;
                if (object != null) {
                    this.Pa(false, false);
                }
            }
            object = this.a;
            object2 = this.b;
            object.post((Runnable)object2);
            return;
        }
        object = new IllegalStateException("Content view not yet created");
        throw object;
    }

    public final void Pa(boolean bl2, boolean bl3) {
        this.Oa();
        View view = this.g;
        if (view != null) {
            boolean bl4 = this.i;
            if (bl4 == bl2) {
                return;
            }
            this.i = bl2;
            bl4 = false;
            int n3 = 8;
            int n4 = 0x10A0000;
            int n7 = 0x10A0001;
            if (bl2) {
                Animation animation;
                if (bl3) {
                    animation = AnimationUtils.loadAnimation((Context)this.getContext(), (int)n7);
                    view.startAnimation(animation);
                    animation = this.h;
                    Animation animation2 = AnimationUtils.loadAnimation((Context)this.getContext(), (int)n4);
                    animation.startAnimation(animation2);
                } else {
                    view.clearAnimation();
                    animation = this.h;
                    animation.clearAnimation();
                }
                this.g.setVisibility(n3);
                animation = this.h;
                animation.setVisibility(0);
            } else {
                Animation animation;
                if (bl3) {
                    animation = AnimationUtils.loadAnimation((Context)this.getContext(), (int)n4);
                    view.startAnimation(animation);
                    animation = this.h;
                    Animation animation3 = AnimationUtils.loadAnimation((Context)this.getContext(), (int)n7);
                    animation.startAnimation(animation3);
                } else {
                    view.clearAnimation();
                    animation = this.h;
                    animation.clearAnimation();
                }
                this.g.setVisibility(0);
                animation = this.h;
                animation.setVisibility(n3);
            }
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Can't be used with a custom content view");
        throw illegalStateException;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater = this.requireContext();
        viewGroup = new FrameLayout((Context)layoutInflater);
        bundle = new LinearLayout((Context)layoutInflater);
        bundle.setId(0xFF0002);
        bundle.setOrientation(1);
        bundle.setVisibility(8);
        int n3 = 17;
        bundle.setGravity(n3);
        ProgressBar progressBar = new ProgressBar((Context)layoutInflater, null, 16842874);
        int n4 = -2;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(n4, n4);
        bundle.addView((View)progressBar, (ViewGroup.LayoutParams)layoutParams);
        int n7 = -1;
        progressBar = new FrameLayout.LayoutParams(n7, n7);
        viewGroup.addView((View)bundle, (ViewGroup.LayoutParams)progressBar);
        bundle = new FrameLayout((Context)layoutInflater);
        bundle.setId(0xFF0003);
        progressBar = new TextView((Context)layoutInflater);
        progressBar.setId(0xFF0001);
        progressBar.setGravity(n3);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(n7, n7);
        bundle.addView((View)progressBar, (ViewGroup.LayoutParams)layoutParams2);
        layoutParams2 = new ListView((Context)layoutInflater);
        layoutParams2.setId(16908298);
        layoutParams2.setDrawSelectorOnTop(false);
        layoutInflater = new FrameLayout.LayoutParams(n7, n7);
        bundle.addView((View)layoutParams2, (ViewGroup.LayoutParams)layoutInflater);
        layoutInflater = new FrameLayout.LayoutParams(n7, n7);
        viewGroup.addView((View)bundle, (ViewGroup.LayoutParams)layoutInflater);
        layoutInflater = new FrameLayout.LayoutParams(n7, n7);
        viewGroup.setLayoutParams((ViewGroup.LayoutParams)layoutInflater);
        return viewGroup;
    }

    public final void onDestroyView() {
        Handler handler = this.a;
        Runnable runnable2 = this.b;
        handler.removeCallbacks(runnable2);
        this.e = null;
        this.i = false;
        this.h = null;
        this.g = null;
        this.f = null;
        super.onDestroyView();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.Oa();
    }
}

