/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.AnimatorListenerAdapter
 *  android.animation.AnimatorSet
 *  android.animation.TimeInterpolator
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.graphics.drawable.Drawable
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewCompat$c;
import com.google.android.material.animation.AnimatableView;
import com.google.android.material.animation.AnimatableView$Listener;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.ExpandCollapseAnimationHelper;
import com.google.android.material.internal.MultiViewUpdateListener;
import com.google.android.material.internal.ToolbarUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.search.SearchBar;
import com.google.android.material.search.SearchBar$OnLoadAnimationCallback;
import com.google.android.material.search.SearchBarAnimationHelper$1;
import com.google.android.material.search.SearchBarAnimationHelper$2;
import com.google.android.material.search.SearchBarAnimationHelper$3;
import com.google.android.material.search.SearchBarAnimationHelper$4;
import com.google.android.material.search.SearchBarAnimationHelper$5;
import com.google.android.material.search.SearchBarAnimationHelper$6;
import com.google.android.material.search.SearchBarAnimationHelper$OnLoadAnimationInvocation;
import com.google.android.material.search.a;
import com.google.android.material.search.c;
import com.google.android.material.search.d;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

class SearchBarAnimationHelper {
    private static final long COLLAPSE_DURATION_MS = 250L;
    private static final long COLLAPSE_FADE_IN_CHILDREN_DURATION_MS = 100L;
    private static final long EXPAND_DURATION_MS = 300L;
    private static final long EXPAND_FADE_OUT_CHILDREN_DURATION_MS = 75L;
    private static final long ON_LOAD_ANIM_CENTER_VIEW_DEFAULT_FADE_DURATION_MS = 250L;
    private static final long ON_LOAD_ANIM_CENTER_VIEW_DEFAULT_FADE_IN_START_DELAY_MS = 500L;
    private static final long ON_LOAD_ANIM_CENTER_VIEW_DEFAULT_FADE_OUT_START_DELAY_MS = 750L;
    private static final long ON_LOAD_ANIM_SECONDARY_DURATION_MS = 250L;
    private static final long ON_LOAD_ANIM_SECONDARY_START_DELAY_MS = 250L;
    private final Set collapseAnimationListeners;
    private boolean collapsing;
    private Animator defaultCenterViewAnimator;
    private final Set expandAnimationListeners;
    private boolean expanding;
    private final Set onLoadAnimationCallbacks;
    private boolean onLoadAnimationFadeInEnabled;
    private Animator runningExpandOrCollapseAnimator;
    private Animator secondaryViewAnimator;

    public SearchBarAnimationHelper() {
        LinkedHashSet linkedHashSet;
        this.onLoadAnimationCallbacks = linkedHashSet = new LinkedHashSet();
        this.expandAnimationListeners = linkedHashSet = new LinkedHashSet();
        this.collapseAnimationListeners = linkedHashSet = new LinkedHashSet();
        this.onLoadAnimationFadeInEnabled = true;
        this.runningExpandOrCollapseAnimator = null;
    }

    public static /* synthetic */ void a(ValueAnimator valueAnimator, View view) {
        view.setAlpha(0.0f);
    }

    public static /* synthetic */ void access$000(SearchBarAnimationHelper searchBarAnimationHelper, SearchBarAnimationHelper$OnLoadAnimationInvocation searchBarAnimationHelper$OnLoadAnimationInvocation) {
        searchBarAnimationHelper.dispatchOnLoadAnimation(searchBarAnimationHelper$OnLoadAnimationInvocation);
    }

    public static /* synthetic */ boolean access$102(SearchBarAnimationHelper searchBarAnimationHelper, boolean bl2) {
        searchBarAnimationHelper.expanding = bl2;
        return bl2;
    }

    public static /* synthetic */ Animator access$202(SearchBarAnimationHelper searchBarAnimationHelper, Animator animator2) {
        searchBarAnimationHelper.runningExpandOrCollapseAnimator = animator2;
        return animator2;
    }

    public static /* synthetic */ boolean access$302(SearchBarAnimationHelper searchBarAnimationHelper, boolean bl2) {
        searchBarAnimationHelper.collapsing = bl2;
        return bl2;
    }

    public static /* synthetic */ void b(SearchBarAnimationHelper searchBarAnimationHelper, SearchBar searchBar, View view, AppBarLayout appBarLayout, boolean bl2) {
        searchBarAnimationHelper.lambda$startExpandAnimation$0(searchBar, view, appBarLayout, bl2);
    }

    public static /* synthetic */ void c(MaterialShapeDrawable materialShapeDrawable, View view, ValueAnimator valueAnimator) {
        SearchBarAnimationHelper.lambda$getExpandedViewBackgroundUpdateListener$1(materialShapeDrawable, view, valueAnimator);
    }

    private void dispatchOnLoadAnimation(SearchBarAnimationHelper$OnLoadAnimationInvocation searchBarAnimationHelper$OnLoadAnimationInvocation) {
        boolean bl2;
        Iterator iterator = this.onLoadAnimationCallbacks.iterator();
        while (bl2 = iterator.hasNext()) {
            SearchBar$OnLoadAnimationCallback searchBar$OnLoadAnimationCallback = (SearchBar$OnLoadAnimationCallback)iterator.next();
            searchBarAnimationHelper$OnLoadAnimationInvocation.invoke(searchBar$OnLoadAnimationCallback);
        }
    }

    private Animator getCollapseAnimator(SearchBar searchBar, View object, AppBarLayout object2) {
        object = this.getExpandCollapseAnimationHelper(searchBar, (View)object, (AppBarLayout)object2).setDuration(250L);
        object2 = new SearchBarAnimationHelper$6(this, searchBar);
        return ((ExpandCollapseAnimationHelper)object).addListener((AnimatorListenerAdapter)object2).getCollapseAnimator();
    }

    private Animator getDefaultCenterViewAnimator(View object) {
        int n3 = 2;
        Object object2 = new float[n3];
        object2[0] = 0.0f;
        object2[1] = 1.0f;
        object2 = ValueAnimator.ofFloat((float[])object2);
        int n4 = 1;
        TimeInterpolator timeInterpolator = new View[n4];
        timeInterpolator[0] = object;
        timeInterpolator = MultiViewUpdateListener.alphaListener((View[])timeInterpolator);
        object2.addUpdateListener((ValueAnimator.AnimatorUpdateListener)timeInterpolator);
        timeInterpolator = AnimationUtils.LINEAR_INTERPOLATOR;
        object2.setInterpolator(timeInterpolator);
        boolean bl2 = this.onLoadAnimationFadeInEnabled;
        long l2 = 0L;
        long l3 = 250L;
        long l4 = bl2 ? l3 : l2;
        object2.setDuration(l4);
        bl2 = this.onLoadAnimationFadeInEnabled;
        if (bl2) {
            l2 = 500L;
        }
        object2.setStartDelay(l2);
        Object object3 = new float[n3];
        object3[0] = 1.0f;
        object3[1] = 0.0f;
        object3 = ValueAnimator.ofFloat((float[])object3);
        View[] viewArray = new View[n4];
        viewArray[0] = object;
        object = MultiViewUpdateListener.alphaListener(viewArray);
        object3.addUpdateListener((ValueAnimator.AnimatorUpdateListener)object);
        object3.setInterpolator(timeInterpolator);
        object3.setDuration(l3);
        object3.setStartDelay(750L);
        object = new AnimatorSet();
        Animator[] animatorArray = new Animator[n3];
        animatorArray[0] = (Animator)object2;
        animatorArray[n4] = (Animator)object3;
        object.playSequentially(animatorArray);
        return object;
    }

    private List getEndAnchoredViews(View view) {
        boolean bl2 = ViewUtils.isLayoutRtl(view);
        ArrayList<View> arrayList = new ArrayList<View>();
        int n3 = view instanceof ViewGroup;
        if (n3 != 0) {
            int n4;
            view = (ViewGroup)view;
            for (n3 = 0; n3 < (n4 = view.getChildCount()); ++n3) {
                boolean bl3;
                View view2 = view.getChildAt(n3);
                if ((bl2 || !(bl3 = view2 instanceof ActionMenuView)) && (!bl2 || (bl3 = view2 instanceof ActionMenuView))) continue;
                arrayList.add(view2);
            }
        }
        return arrayList;
    }

    private Animator getExpandAnimator(SearchBar searchBar, View object, AppBarLayout object2) {
        object = this.getExpandCollapseAnimationHelper(searchBar, (View)object, (AppBarLayout)object2).setDuration(300L);
        object2 = new SearchBarAnimationHelper$4(this, searchBar);
        return ((ExpandCollapseAnimationHelper)object).addListener((AnimatorListenerAdapter)object2).getExpandAnimator();
    }

    private ExpandCollapseAnimationHelper getExpandCollapseAnimationHelper(SearchBar object, View object2, AppBarLayout appBarLayout) {
        int n3;
        ExpandCollapseAnimationHelper expandCollapseAnimationHelper = new ExpandCollapseAnimationHelper((View)object, (View)object2);
        object = this.getExpandedViewBackgroundUpdateListener((SearchBar)object, (View)object2);
        object = expandCollapseAnimationHelper.setAdditionalUpdateListener((ValueAnimator.AnimatorUpdateListener)object);
        if (appBarLayout != null) {
            n3 = appBarLayout.getTop();
        } else {
            n3 = 0;
            appBarLayout = null;
        }
        object = ((ExpandCollapseAnimationHelper)object).setCollapsedViewOffsetY(n3);
        object2 = this.getEndAnchoredViews((View)object2);
        return ((ExpandCollapseAnimationHelper)object).addEndAnchoredViews((Collection)object2);
    }

    private ValueAnimator.AnimatorUpdateListener getExpandedViewBackgroundUpdateListener(SearchBar object, View view) {
        MaterialShapeDrawable materialShapeDrawable = MaterialShapeDrawable.createWithElevationOverlay(view.getContext());
        float f5 = ((SearchBar)object).getCornerSize();
        materialShapeDrawable.setCornerSize(f5);
        float f6 = ViewCompat$c.e((View)object);
        materialShapeDrawable.setElevation(f6);
        object = new d(view, materialShapeDrawable);
        return object;
    }

    private List getFadeChildren(SearchBar searchBar) {
        List list = ViewUtils.getChildren((View)searchBar);
        View view = searchBar.getCenterView();
        if (view != null) {
            searchBar = searchBar.getCenterView();
            list.remove(searchBar);
        }
        return list;
    }

    private Animator getFadeInChildrenAnimator(SearchBar object) {
        object = this.getFadeChildren((SearchBar)object);
        Object object2 = new float[]{0.0f, 1.0f};
        object2 = ValueAnimator.ofFloat((float[])object2);
        object = MultiViewUpdateListener.alphaListener((Collection)object);
        object2.addUpdateListener((ValueAnimator.AnimatorUpdateListener)object);
        object2.setDuration((long)100);
        object = AnimationUtils.LINEAR_INTERPOLATOR;
        object2.setInterpolator((TimeInterpolator)object);
        return object2;
    }

    private Animator getFadeOutChildrenAnimator(SearchBar object, View view) {
        object = this.getFadeChildren((SearchBar)object);
        Object object2 = new float[]{1.0f, 0.0f};
        object2 = ValueAnimator.ofFloat((float[])object2);
        object = MultiViewUpdateListener.alphaListener((Collection)object);
        object2.addUpdateListener((ValueAnimator.AnimatorUpdateListener)object);
        object = new a(view);
        object2.addUpdateListener((ValueAnimator.AnimatorUpdateListener)object);
        object2.setDuration((long)75);
        object = AnimationUtils.LINEAR_INTERPOLATOR;
        object2.setInterpolator((TimeInterpolator)object);
        return object2;
    }

    private Animator getSecondaryActionMenuItemAnimator(View object) {
        Object object2 = new float[]{0.0f, 1.0f};
        object2 = ValueAnimator.ofFloat((float[])object2);
        View[] viewArray = new View[]{object};
        object = MultiViewUpdateListener.alphaListener(viewArray);
        object2.addUpdateListener((ValueAnimator.AnimatorUpdateListener)object);
        object = AnimationUtils.LINEAR_INTERPOLATOR;
        object2.setInterpolator((TimeInterpolator)object);
        object2.setDuration(250L);
        return object2;
    }

    private Animator getSecondaryViewAnimator(TextView textView, View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        long l2 = 250L;
        animatorSet.setStartDelay(l2);
        textView = this.getTextViewAnimator(textView);
        animatorSet.play((Animator)textView);
        if (view != null) {
            textView = this.getSecondaryActionMenuItemAnimator(view);
            animatorSet.play((Animator)textView);
        }
        return animatorSet;
    }

    private Animator getTextViewAnimator(TextView object) {
        Object object2 = new float[]{0.0f, 1.0f};
        object2 = ValueAnimator.ofFloat((float[])object2);
        View[] viewArray = new View[]{object};
        object = MultiViewUpdateListener.alphaListener(viewArray);
        object2.addUpdateListener((ValueAnimator.AnimatorUpdateListener)object);
        object = AnimationUtils.LINEAR_INTERPOLATOR;
        object2.setInterpolator((TimeInterpolator)object);
        object2.setDuration(250L);
        return object2;
    }

    private static void lambda$getExpandedViewBackgroundUpdateListener$1(MaterialShapeDrawable materialShapeDrawable, View view, ValueAnimator object) {
        float f5 = object.getAnimatedFraction();
        float f6 = 1.0f;
        f5 = f6 - f5;
        materialShapeDrawable.setInterpolation(f5);
        object = ViewCompat.a;
        view.setBackground((Drawable)materialShapeDrawable);
        view.setAlpha(f6);
    }

    private /* synthetic */ void lambda$startExpandAnimation$0(SearchBar object, View animatorListenerAdapter, AppBarLayout appBarLayout, boolean bl2) {
        AnimatorSet animatorSet = new AnimatorSet();
        Animator animator2 = this.getFadeOutChildrenAnimator((SearchBar)object, (View)animatorListenerAdapter);
        object = this.getExpandAnimator((SearchBar)object, (View)animatorListenerAdapter, appBarLayout);
        int n3 = 2;
        animatorListenerAdapter = new Animator[n3];
        appBarLayout = null;
        animatorListenerAdapter[0] = animator2;
        int n4 = 1;
        animatorListenerAdapter[n4] = object;
        animatorSet.playSequentially((Animator[])animatorListenerAdapter);
        object = new SearchBarAnimationHelper$3(this);
        animatorSet.addListener((Animator.AnimatorListener)object);
        object = this.expandAnimationListeners.iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            animatorListenerAdapter = (AnimatorListenerAdapter)object.next();
            animatorSet.addListener((Animator.AnimatorListener)animatorListenerAdapter);
        }
        if (bl2) {
            long l2 = 0L;
            animatorSet.setDuration(l2);
        }
        animatorSet.start();
        this.runningExpandOrCollapseAnimator = animatorSet;
    }

    public void addCollapseAnimationListener(AnimatorListenerAdapter animatorListenerAdapter) {
        this.collapseAnimationListeners.add(animatorListenerAdapter);
    }

    public void addExpandAnimationListener(AnimatorListenerAdapter animatorListenerAdapter) {
        this.expandAnimationListeners.add(animatorListenerAdapter);
    }

    public void addOnLoadAnimationCallback(SearchBar$OnLoadAnimationCallback searchBar$OnLoadAnimationCallback) {
        this.onLoadAnimationCallbacks.add(searchBar$OnLoadAnimationCallback);
    }

    public boolean isCollapsing() {
        return this.collapsing;
    }

    public boolean isExpanding() {
        return this.expanding;
    }

    public boolean isOnLoadAnimationFadeInEnabled() {
        return this.onLoadAnimationFadeInEnabled;
    }

    public boolean removeCollapseAnimationListener(AnimatorListenerAdapter animatorListenerAdapter) {
        return this.collapseAnimationListeners.remove(animatorListenerAdapter);
    }

    public boolean removeExpandAnimationListener(AnimatorListenerAdapter animatorListenerAdapter) {
        return this.expandAnimationListeners.remove(animatorListenerAdapter);
    }

    public boolean removeOnLoadAnimationCallback(SearchBar$OnLoadAnimationCallback searchBar$OnLoadAnimationCallback) {
        return this.onLoadAnimationCallbacks.remove(searchBar$OnLoadAnimationCallback);
    }

    public void setOnLoadAnimationFadeInEnabled(boolean bl2) {
        this.onLoadAnimationFadeInEnabled = bl2;
    }

    public void startCollapseAnimation(SearchBar object, View view, AppBarLayout animatorArray, boolean bl2) {
        boolean bl3;
        Animator animator2;
        int n3 = 1;
        boolean bl4 = this.isExpanding();
        if (bl4 && (animator2 = this.runningExpandOrCollapseAnimator) != null) {
            animator2.cancel();
        }
        this.collapsing = n3;
        animator2 = new AnimatorSet();
        view = this.getCollapseAnimator((SearchBar)object, view, (AppBarLayout)animatorArray);
        object = this.getFadeInChildrenAnimator((SearchBar)object);
        int n4 = 2;
        animatorArray = new Animator[n4];
        animatorArray[0] = view;
        animatorArray[n3] = object;
        animator2.playSequentially(animatorArray);
        object = new SearchBarAnimationHelper$5(this);
        animator2.addListener((Animator.AnimatorListener)object);
        object = this.collapseAnimationListeners.iterator();
        while (bl3 = object.hasNext()) {
            view = (AnimatorListenerAdapter)object.next();
            animator2.addListener((Animator.AnimatorListener)view);
        }
        if (bl2) {
            long l2 = 0L;
            animator2.setDuration(l2);
        }
        animator2.start();
        this.runningExpandOrCollapseAnimator = animator2;
    }

    public void startExpandAnimation(SearchBar searchBar, View view, AppBarLayout appBarLayout, boolean bl2) {
        Object object;
        boolean bl3 = this.isCollapsing();
        if (bl3 && (object = this.runningExpandOrCollapseAnimator) != null) {
            object.cancel();
        }
        this.expanding = true;
        view.setVisibility(4);
        object = new c(this, searchBar, view, appBarLayout, bl2);
        view.post((Runnable)object);
    }

    public void startOnLoadAnimation(SearchBar object) {
        boolean bl2;
        Object object2 = new Object();
        this.dispatchOnLoadAnimation((SearchBarAnimationHelper$OnLoadAnimationInvocation)object2);
        object2 = ((SearchBar)object).getTextView();
        Object object3 = ((SearchBar)object).getCenterView();
        object = ToolbarUtils.getSecondaryActionMenuItemView((Toolbar)object);
        Animator animator2 = this.getSecondaryViewAnimator((TextView)object2, (View)object);
        SearchBarAnimationHelper$1 searchBarAnimationHelper$1 = new SearchBarAnimationHelper$1(this);
        animator2.addListener((Animator.AnimatorListener)searchBarAnimationHelper$1);
        this.secondaryViewAnimator = animator2;
        searchBarAnimationHelper$1 = null;
        object2.setAlpha(0.0f);
        if (object != null) {
            object.setAlpha(0.0f);
        }
        if (bl2 = object3 instanceof AnimatableView) {
            object3 = (AnimatableView)object3;
            object = new iu2_2(animator2);
            object3.startAnimation((AnimatableView$Listener)object);
        } else if (object3 != null) {
            object3.setAlpha(0.0f);
            bl2 = false;
            object3.setVisibility(0);
            object = this.getDefaultCenterViewAnimator((View)object3);
            this.defaultCenterViewAnimator = object;
            object2 = new SearchBarAnimationHelper$2(this, (View)object3, animator2);
            object.addListener((Animator.AnimatorListener)object2);
            object.start();
        } else {
            animator2.start();
        }
    }

    public void stopOnLoadAnimation(SearchBar searchBar) {
        boolean bl2;
        Object object = this.secondaryViewAnimator;
        if (object != null) {
            object.end();
        }
        if ((object = this.defaultCenterViewAnimator) != null) {
            object.end();
        }
        if (bl2 = (searchBar = searchBar.getCenterView()) instanceof AnimatableView) {
            object = searchBar;
            object = (AnimatableView)((Object)searchBar);
            object.stopAnimation();
        }
        if (searchBar != null) {
            bl2 = false;
            object = null;
            ((View)searchBar).setAlpha(0.0f);
        }
    }
}

