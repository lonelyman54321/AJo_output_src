/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.AnimatorSet
 *  android.animation.TimeInterpolator
 *  android.animation.TypeEvaluator
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.view.View
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.widget.EditText
 *  android.widget.FrameLayout
 *  android.widget.ImageButton
 *  android.widget.TextView
 */
package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.FadeThroughDrawable;
import com.google.android.material.internal.FadeThroughUpdateListener;
import com.google.android.material.internal.MultiViewUpdateListener;
import com.google.android.material.internal.RectEvaluator;
import com.google.android.material.internal.ReversableAnimatedValueInterpolator;
import com.google.android.material.internal.ToolbarUtils;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MaterialMainContainerBackHelper;
import com.google.android.material.search.SearchBar;
import com.google.android.material.search.SearchView;
import com.google.android.material.search.SearchView$TransitionState;
import com.google.android.material.search.SearchViewAnimationHelper$1;
import com.google.android.material.search.SearchViewAnimationHelper$2;
import com.google.android.material.search.SearchViewAnimationHelper$3;
import com.google.android.material.search.SearchViewAnimationHelper$4;
import com.google.android.material.search.SearchViewAnimationHelper$5;
import com.google.android.material.search.f;
import com.google.android.material.search.g;
import com.google.android.material.search.h;
import com.google.android.material.search.i;
import com.google.android.material.search.j;
import java.util.Objects;

class SearchViewAnimationHelper {
    private static final float CONTENT_FROM_SCALE = 0.95f;
    private static final long HIDE_CLEAR_BUTTON_ALPHA_DURATION_MS = 42L;
    private static final long HIDE_CLEAR_BUTTON_ALPHA_START_DELAY_MS = 0L;
    private static final long HIDE_CONTENT_ALPHA_DURATION_MS = 83L;
    private static final long HIDE_CONTENT_ALPHA_START_DELAY_MS = 0L;
    private static final long HIDE_CONTENT_SCALE_DURATION_MS = 250L;
    private static final long HIDE_DURATION_MS = 250L;
    private static final long HIDE_TRANSLATE_DURATION_MS = 300L;
    private static final long SHOW_CLEAR_BUTTON_ALPHA_DURATION_MS = 50L;
    private static final long SHOW_CLEAR_BUTTON_ALPHA_START_DELAY_MS = 250L;
    private static final long SHOW_CONTENT_ALPHA_DURATION_MS = 150L;
    private static final long SHOW_CONTENT_ALPHA_START_DELAY_MS = 75L;
    private static final long SHOW_CONTENT_SCALE_DURATION_MS = 300L;
    private static final long SHOW_DURATION_MS = 300L;
    private static final long SHOW_TRANSLATE_DURATION_MS = 350L;
    private static final long SHOW_TRANSLATE_KEYBOARD_START_DELAY_MS = 150L;
    private final MaterialMainContainerBackHelper backHelper;
    private AnimatorSet backProgressAnimatorSet;
    private final ImageButton clearButton;
    private final TouchObserverFrameLayout contentContainer;
    private final View divider;
    private final Toolbar dummyToolbar;
    private final EditText editText;
    private final FrameLayout headerContainer;
    private final ClippableRoundedCornerLayout rootView;
    private final View scrim;
    private SearchBar searchBar;
    private final TextView searchPrefix;
    private final SearchView searchView;
    private final Toolbar toolbar;
    private final FrameLayout toolbarContainer;

    public SearchViewAnimationHelper(SearchView object) {
        Object object2;
        Object object3;
        this.searchView = object;
        this.scrim = object3 = object.scrim;
        object3 = object.rootView;
        this.rootView = object3;
        this.headerContainer = object2 = object.headerContainer;
        this.toolbarContainer = object2 = object.toolbarContainer;
        object2 = object.toolbar;
        this.toolbar = object2;
        object2 = object.dummyToolbar;
        this.dummyToolbar = object2;
        object2 = object.searchPrefix;
        this.searchPrefix = object2;
        object2 = object.editText;
        this.editText = object2;
        object2 = object.clearButton;
        this.clearButton = object2;
        object2 = object.divider;
        this.divider = object2;
        object = object.contentContainer;
        this.contentContainer = object;
        super((View)object3);
        this.backHelper = object;
    }

    public static /* synthetic */ void a(SearchViewAnimationHelper searchViewAnimationHelper) {
        searchViewAnimationHelper.lambda$startShowAnimationTranslate$1();
    }

    public static /* synthetic */ SearchView access$000(SearchViewAnimationHelper searchViewAnimationHelper) {
        return searchViewAnimationHelper.searchView;
    }

    public static /* synthetic */ ClippableRoundedCornerLayout access$100(SearchViewAnimationHelper searchViewAnimationHelper) {
        return searchViewAnimationHelper.rootView;
    }

    public static /* synthetic */ void access$200(SearchViewAnimationHelper searchViewAnimationHelper, float f5) {
        searchViewAnimationHelper.setContentViewsAlpha(f5);
    }

    public static /* synthetic */ SearchBar access$300(SearchViewAnimationHelper searchViewAnimationHelper) {
        return searchViewAnimationHelper.searchBar;
    }

    private void addActionMenuViewAnimatorIfNeeded(AnimatorSet animatorSet) {
        int n3 = 2;
        int n4 = 1;
        Object object = ToolbarUtils.getActionMenuView(this.toolbar);
        if (object == null) {
            return;
        }
        float f5 = this.getFromTranslationXEnd((View)object);
        Object object2 = new float[n3];
        object2[0] = f5;
        object2[n4] = 0.0f;
        ValueAnimator valueAnimator = ValueAnimator.ofFloat((float[])object2);
        object2 = new View[n4];
        object2[0] = (float)object;
        object2 = MultiViewUpdateListener.translationXListener((View[])object2);
        valueAnimator.addUpdateListener((ValueAnimator.AnimatorUpdateListener)object2);
        float f6 = this.getFromTranslationY();
        float[] fArray = new float[n3];
        fArray[0] = f6;
        fArray[n4] = 0.0f;
        ValueAnimator valueAnimator2 = ValueAnimator.ofFloat((float[])fArray);
        object2 = new View[n4];
        object2[0] = (float)object;
        object = MultiViewUpdateListener.translationYListener((View[])object2);
        valueAnimator2.addUpdateListener((ValueAnimator.AnimatorUpdateListener)object);
        Animator[] animatorArray = new Animator[n3];
        animatorArray[0] = valueAnimator;
        animatorArray[n4] = valueAnimator2;
        animatorSet.playTogether(animatorArray);
    }

    private void addBackButtonProgressAnimatorIfNeeded(AnimatorSet animatorSet) {
        ImageButton imageButton = ToolbarUtils.getNavigationIconButton(this.toolbar);
        if (imageButton == null) {
            return;
        }
        imageButton = ut0_0.g(imageButton.getDrawable());
        SearchView searchView = this.searchView;
        boolean bl2 = searchView.isAnimatedNavigationIcon();
        if (bl2) {
            this.addDrawerArrowDrawableAnimatorIfNeeded(animatorSet, (Drawable)imageButton);
            this.addFadeThroughDrawableAnimatorIfNeeded(animatorSet, (Drawable)imageButton);
        } else {
            this.setFullDrawableProgressIfNeeded((Drawable)imageButton);
        }
    }

    private void addBackButtonTranslationAnimatorIfNeeded(AnimatorSet animatorSet) {
        int n3 = 2;
        int n4 = 1;
        Object object = ToolbarUtils.getNavigationIconButton(this.toolbar);
        if (object == null) {
            return;
        }
        float f5 = this.getFromTranslationXStart((View)object);
        Object object2 = new float[n3];
        object2[0] = f5;
        object2[n4] = 0.0f;
        ValueAnimator valueAnimator = ValueAnimator.ofFloat((float[])object2);
        object2 = new View[n4];
        object2[0] = (float)object;
        object2 = MultiViewUpdateListener.translationXListener((View[])object2);
        valueAnimator.addUpdateListener((ValueAnimator.AnimatorUpdateListener)object2);
        float f6 = this.getFromTranslationY();
        float[] fArray = new float[n3];
        fArray[0] = f6;
        fArray[n4] = 0.0f;
        ValueAnimator valueAnimator2 = ValueAnimator.ofFloat((float[])fArray);
        object2 = new View[n4];
        object2[0] = (float)object;
        object = MultiViewUpdateListener.translationYListener((View[])object2);
        valueAnimator2.addUpdateListener((ValueAnimator.AnimatorUpdateListener)object);
        Animator[] animatorArray = new Animator[n3];
        animatorArray[0] = valueAnimator;
        animatorArray[n4] = valueAnimator2;
        animatorSet.playTogether(animatorArray);
    }

    private void addDrawerArrowDrawableAnimatorIfNeeded(AnimatorSet animatorSet, Drawable animatorArray) {
        int n3 = animatorArray instanceof yu0_2;
        if (n3 != 0) {
            animatorArray = (yu0_2)animatorArray;
            n3 = 2;
            Object object = new float[n3];
            object[0] = 0.0f;
            object[1] = 1.0f;
            object = ValueAnimator.ofFloat((float[])object);
            g g3 = new g((yu0_2)animatorArray);
            object.addUpdateListener((ValueAnimator.AnimatorUpdateListener)g3);
            int n4 = 1;
            animatorArray = new Animator[n4];
            g3 = null;
            animatorArray[0] = (Animator)object;
            animatorSet.playTogether(animatorArray);
        }
    }

    private void addFadeThroughDrawableAnimatorIfNeeded(AnimatorSet animatorSet, Drawable animatorArray) {
        int n3 = animatorArray instanceof FadeThroughDrawable;
        if (n3 != 0) {
            animatorArray = (FadeThroughDrawable)animatorArray;
            n3 = 2;
            Object object = new float[n3];
            object[0] = 0.0f;
            object[1] = 1.0f;
            object = ValueAnimator.ofFloat((float[])object);
            i i3 = new i((FadeThroughDrawable)animatorArray);
            object.addUpdateListener((ValueAnimator.AnimatorUpdateListener)i3);
            int n4 = 1;
            animatorArray = new Animator[n4];
            i3 = null;
            animatorArray[0] = (Animator)object;
            animatorSet.playTogether(animatorArray);
        }
    }

    public static /* synthetic */ void b(SearchViewAnimationHelper searchViewAnimationHelper, float f5, float f6, Rect rect, ValueAnimator valueAnimator) {
        searchViewAnimationHelper.lambda$getRootViewAnimator$2(f5, f6, rect, valueAnimator);
    }

    public static /* synthetic */ void c(yu0_2 yu0_22, ValueAnimator valueAnimator) {
        SearchViewAnimationHelper.lambda$addDrawerArrowDrawableAnimatorIfNeeded$3(yu0_22, valueAnimator);
    }

    public static /* synthetic */ void d(SearchViewAnimationHelper searchViewAnimationHelper) {
        searchViewAnimationHelper.lambda$startShowAnimationExpand$0();
    }

    public static /* synthetic */ void e(FadeThroughDrawable fadeThroughDrawable, ValueAnimator valueAnimator) {
        SearchViewAnimationHelper.lambda$addFadeThroughDrawableAnimatorIfNeeded$4(fadeThroughDrawable, valueAnimator);
    }

    private Animator getActionMenuViewsAlphaAnimator(boolean bl2) {
        int n3 = 2;
        Object object = new float[n3];
        object[0] = 0.0f;
        object[1] = 1.0f;
        object = ValueAnimator.ofFloat((float[])object);
        long l2 = bl2 ? 300L : 250L;
        object.setDuration(l2);
        Object object2 = AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
        Object object3 = ReversableAnimatedValueInterpolator.of(bl2, object2);
        object.setInterpolator((TimeInterpolator)object3);
        object3 = this.searchView;
        bl2 = ((SearchView)object3).isMenuItemsAnimated();
        if (bl2) {
            object3 = ToolbarUtils.getActionMenuView(this.dummyToolbar);
            object2 = ToolbarUtils.getActionMenuView(this.toolbar);
            FadeThroughUpdateListener fadeThroughUpdateListener = new FadeThroughUpdateListener((View)object3, (View)object2);
            object.addUpdateListener((ValueAnimator.AnimatorUpdateListener)fadeThroughUpdateListener);
        }
        return object;
    }

    private AnimatorSet getButtonsProgressAnimator(boolean bl2) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.addBackButtonProgressAnimatorIfNeeded(animatorSet);
        long l2 = bl2 ? 300L : 250L;
        animatorSet.setDuration(l2);
        TimeInterpolator timeInterpolator = AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
        TimeInterpolator timeInterpolator2 = ReversableAnimatedValueInterpolator.of(bl2, timeInterpolator);
        animatorSet.setInterpolator(timeInterpolator2);
        return animatorSet;
    }

    private AnimatorSet getButtonsTranslationAnimator(boolean bl2) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.addBackButtonTranslationAnimatorIfNeeded(animatorSet);
        this.addActionMenuViewAnimatorIfNeeded(animatorSet);
        long l2 = bl2 ? 300L : 250L;
        animatorSet.setDuration(l2);
        TimeInterpolator timeInterpolator = AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
        TimeInterpolator timeInterpolator2 = ReversableAnimatedValueInterpolator.of(bl2, timeInterpolator);
        animatorSet.setInterpolator(timeInterpolator2);
        return animatorSet;
    }

    private Animator getClearButtonAnimator(boolean bl2) {
        int n3 = 2;
        Object object = new float[n3];
        object[0] = 0.0f;
        object[1] = 1.0f;
        object = ValueAnimator.ofFloat((float[])object);
        long l2 = bl2 ? (long)50 : (long)42;
        object.setDuration(l2);
        l2 = bl2 ? 250L : 0L;
        object.setStartDelay(l2);
        View[] viewArray = AnimationUtils.LINEAR_INTERPOLATOR;
        Object object2 = ReversableAnimatedValueInterpolator.of(bl2, (TimeInterpolator)viewArray);
        object.setInterpolator(object2);
        object2 = this.clearButton;
        viewArray = new View[]{object2};
        object2 = MultiViewUpdateListener.alphaListener(viewArray);
        object.addUpdateListener((ValueAnimator.AnimatorUpdateListener)object2);
        return object;
    }

    private Animator getContentAlphaAnimator(boolean bl2) {
        int n3 = 2;
        Object object = new float[n3];
        object[0] = 0.0f;
        object[1] = 1.0f;
        object = ValueAnimator.ofFloat((float[])object);
        long l2 = bl2 ? 150L : (long)83;
        object.setDuration(l2);
        l2 = bl2 ? (long)75 : 0L;
        object.setStartDelay(l2);
        Object object2 = AnimationUtils.LINEAR_INTERPOLATOR;
        Object object3 = ReversableAnimatedValueInterpolator.of(bl2, object2);
        object.setInterpolator(object3);
        object3 = this.divider;
        object2 = this.contentContainer;
        View[] viewArray = new View[n3];
        viewArray[0] = object3;
        viewArray[1] = object2;
        object3 = MultiViewUpdateListener.alphaListener(viewArray);
        object.addUpdateListener((ValueAnimator.AnimatorUpdateListener)object3);
        return object;
    }

    private Animator getContentAnimator(boolean bl2) {
        AnimatorSet animatorSet = new AnimatorSet();
        Animator animator2 = this.getContentAlphaAnimator(bl2);
        Animator animator3 = this.getDividerAnimator(bl2);
        Animator animator4 = this.getContentScaleAnimator(bl2);
        Animator[] animatorArray = new Animator[]{animator2, animator3, animator4};
        animatorSet.playTogether(animatorArray);
        return animatorSet;
    }

    private Animator getContentScaleAnimator(boolean bl2) {
        int n3 = 2;
        Object object = new float[n3];
        object[0] = 0.95f;
        object[1] = 1.0f;
        object = ValueAnimator.ofFloat((float[])object);
        long l2 = bl2 ? 300L : 250L;
        object.setDuration(l2);
        View[] viewArray = AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
        Object object2 = ReversableAnimatedValueInterpolator.of(bl2, (TimeInterpolator)viewArray);
        object.setInterpolator(object2);
        object2 = this.contentContainer;
        viewArray = new View[]{object2};
        object2 = MultiViewUpdateListener.scaleListener(viewArray);
        object.addUpdateListener((ValueAnimator.AnimatorUpdateListener)object2);
        return object;
    }

    private Animator getDividerAnimator(boolean bl2) {
        float f5 = (float)this.contentContainer.getHeight() * 0.050000012f / 2.0f;
        int n3 = 2;
        Object object = new float[n3];
        object[0] = f5;
        f5 = 0.0f;
        int n4 = 1;
        object[n4] = 0.0f;
        ValueAnimator valueAnimator = ValueAnimator.ofFloat((float[])object);
        long l2 = bl2 ? 300L : 250L;
        valueAnimator.setDuration(l2);
        object = AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
        Object object2 = ReversableAnimatedValueInterpolator.of(bl2, (TimeInterpolator)object);
        valueAnimator.setInterpolator(object2);
        object2 = this.divider;
        object = new View[n4];
        object[0] = (float)object2;
        object2 = MultiViewUpdateListener.translationYListener((View[])object);
        valueAnimator.addUpdateListener((ValueAnimator.AnimatorUpdateListener)object2);
        return valueAnimator;
    }

    private Animator getDummyToolbarAnimator(boolean bl2) {
        Toolbar toolbar = this.dummyToolbar;
        return this.getTranslationAnimator(bl2, false, (View)toolbar);
    }

    private Animator getEditTextAnimator(boolean bl2) {
        EditText editText = this.editText;
        return this.getTranslationAnimator(bl2, true, (View)editText);
    }

    private AnimatorSet getExpandCollapseAnimatorSet(boolean bl2) {
        Animator animator2;
        AnimatorSet animatorSet;
        int n3 = 1;
        int n4 = 2;
        AnimatorSet animatorSet2 = new AnimatorSet();
        AnimatorSet animatorSet3 = this.backProgressAnimatorSet;
        if (animatorSet3 == null) {
            animatorSet3 = this.getButtonsProgressAnimator(bl2);
            animatorSet = this.getButtonsTranslationAnimator(bl2);
            animator2 = new Animator[n4];
            animator2[0] = animatorSet3;
            animator2[n3] = animatorSet;
            animatorSet2.playTogether((Animator[])animator2);
        }
        animatorSet3 = this.getScrimAlphaAnimator(bl2);
        animatorSet = this.getRootViewAnimator(bl2);
        animator2 = this.getClearButtonAnimator(bl2);
        Animator animator3 = this.getContentAnimator(bl2);
        Animator animator4 = this.getHeaderContainerAnimator(bl2);
        Animator animator5 = this.getDummyToolbarAnimator(bl2);
        Animator animator6 = this.getActionMenuViewsAlphaAnimator(bl2);
        Animator animator7 = this.getEditTextAnimator(bl2);
        Animator animator8 = this.getSearchPrefixAnimator(bl2);
        Animator[] animatorArray = new Animator[9];
        animatorArray[0] = animatorSet3;
        animatorArray[n3] = animatorSet;
        animatorArray[n4] = animator2;
        animatorArray[3] = animator3;
        animatorArray[4] = animator4;
        animatorArray[5] = animator5;
        animatorArray[6] = animator6;
        animatorArray[7] = animator7;
        animatorArray[8] = animator8;
        animatorSet2.playTogether(animatorArray);
        SearchViewAnimationHelper$5 searchViewAnimationHelper$5 = new SearchViewAnimationHelper$5(this, bl2);
        animatorSet2.addListener((Animator.AnimatorListener)searchViewAnimationHelper$5);
        return animatorSet2;
    }

    private int getFromTranslationXEnd(View view) {
        view = (ViewGroup.MarginLayoutParams)view.getLayoutParams();
        int n3 = view.getMarginEnd();
        SearchBar searchBar = this.searchBar;
        int n4 = ViewUtils.isLayoutRtl((View)searchBar);
        if (n4 != 0) {
            searchBar = this.searchBar;
            n4 = searchBar.getLeft() - n3;
        } else {
            searchBar = this.searchBar;
            n4 = searchBar.getRight();
            SearchView searchView = this.searchView;
            int n7 = searchView.getWidth();
            n4 = n4 - n7 + n3;
        }
        return n4;
    }

    private int getFromTranslationXStart(View view) {
        view = (ViewGroup.MarginLayoutParams)view.getLayoutParams();
        int n3 = view.getMarginStart();
        SearchBar searchBar = this.searchBar;
        Object object = ViewCompat.a;
        int n4 = searchBar.getPaddingStart();
        object = this.searchBar;
        int n7 = ViewUtils.isLayoutRtl((View)object);
        if (n7 != 0) {
            object = this.searchBar;
            n7 = object.getWidth();
            SearchBar searchBar2 = this.searchBar;
            int n8 = searchBar2.getRight();
            n7 = n7 - n8 + n3 - n4;
        } else {
            object = this.searchBar;
            n7 = object.getLeft() - n3 + n4;
        }
        return n7;
    }

    private int getFromTranslationY() {
        int n3 = this.toolbarContainer.getTop();
        int n4 = (this.toolbarContainer.getBottom() + n3) / 2;
        n3 = this.searchBar.getTop();
        return (this.searchBar.getBottom() + n3) / 2 - n4;
    }

    private Animator getHeaderContainerAnimator(boolean bl2) {
        FrameLayout frameLayout = this.headerContainer;
        return this.getTranslationAnimator(bl2, false, (View)frameLayout);
    }

    private Animator getRootViewAnimator(boolean bl2) {
        Object object;
        Rect rect = this.backHelper.getInitialHideToClipBounds();
        Object object2 = this.backHelper.getInitialHideFromClipBounds();
        if (rect == null) {
            rect = ViewUtils.calculateRectFromBounds((View)this.searchView);
        }
        if (object2 == null) {
            object2 = this.rootView;
            object = this.searchBar;
            object2 = ViewUtils.calculateOffsetRectFromBounds((View)object2, (View)object);
        }
        object = new Rect(object2);
        SearchBar searchBar = this.searchBar;
        float f5 = searchBar.getCornerSize();
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = this.rootView;
        float f6 = clippableRoundedCornerLayout.getCornerRadius();
        int n3 = this.backHelper.getExpandedCornerSize();
        float f7 = n3;
        f6 = Math.max(f6, f7);
        RectEvaluator rectEvaluator = new RectEvaluator((Rect)object);
        int n4 = 2;
        Object[] objectArray = new Object[n4];
        objectArray[0] = object2;
        int n7 = 1;
        objectArray[n7] = rect;
        rect = ValueAnimator.ofObject((TypeEvaluator)rectEvaluator, (Object[])objectArray);
        object2 = new f(this, f5, f6, (Rect)object);
        rect.addUpdateListener((ValueAnimator.AnimatorUpdateListener)object2);
        long l2 = bl2 ? 300L : 250L;
        rect.setDuration(l2);
        object2 = AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
        TimeInterpolator timeInterpolator = ReversableAnimatedValueInterpolator.of(bl2, (TimeInterpolator)object2);
        rect.setInterpolator(timeInterpolator);
        return rect;
    }

    private Animator getScrimAlphaAnimator(boolean bl2) {
        Object object = bl2 ? AnimationUtils.LINEAR_INTERPOLATOR : AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
        int n3 = 2;
        Object object2 = new float[n3];
        object2[0] = 0.0f;
        object2[1] = 1.0f;
        object2 = ValueAnimator.ofFloat((float[])object2);
        long l2 = bl2 ? 300L : 250L;
        object2.setDuration(l2);
        Object object3 = ReversableAnimatedValueInterpolator.of(bl2, (TimeInterpolator)object);
        object2.setInterpolator(object3);
        object3 = this.scrim;
        object = new View[]{object3};
        object3 = MultiViewUpdateListener.alphaListener(object);
        object2.addUpdateListener((ValueAnimator.AnimatorUpdateListener)object3);
        return object2;
    }

    private Animator getSearchPrefixAnimator(boolean bl2) {
        TextView textView = this.searchPrefix;
        return this.getTranslationAnimator(bl2, true, (View)textView);
    }

    private AnimatorSet getTranslateAnimatorSet(boolean bl2) {
        AnimatorSet animatorSet = new AnimatorSet();
        Animator animator2 = this.getTranslationYAnimator();
        int n3 = 1;
        Animator[] animatorArray = new Animator[n3];
        animatorArray[0] = animator2;
        animatorSet.playTogether(animatorArray);
        this.addBackButtonProgressAnimatorIfNeeded(animatorSet);
        animator2 = AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
        animator2 = ReversableAnimatedValueInterpolator.of(bl2, (TimeInterpolator)animator2);
        animatorSet.setInterpolator((TimeInterpolator)animator2);
        long l2 = bl2 ? 350L : 300L;
        animatorSet.setDuration(l2);
        return animatorSet;
    }

    /*
     * WARNING - void declaration
     */
    private Animator getTranslationAnimator(boolean bl2, boolean bl3, View object) {
        void var2_5;
        MultiViewUpdateListener multiViewUpdateListener;
        int n3 = 2;
        int n4 = 1;
        if (bl3) {
            int n7 = this.getFromTranslationXStart((View)multiViewUpdateListener);
        } else {
            int n8 = this.getFromTranslationXEnd((View)multiViewUpdateListener);
        }
        float f5 = (float)var2_5;
        Object object2 = new float[n3];
        object2[0] = f5;
        object2[n4] = 0.0f;
        ValueAnimator valueAnimator = ValueAnimator.ofFloat((float[])object2);
        object2 = new View[n4];
        object2[0] = multiViewUpdateListener;
        object2 = MultiViewUpdateListener.translationXListener((View[])object2);
        valueAnimator.addUpdateListener((ValueAnimator.AnimatorUpdateListener)object2);
        int n10 = this.getFromTranslationY();
        float f6 = n10;
        float[] fArray = new float[n3];
        fArray[0] = f6;
        fArray[n4] = 0.0f;
        ValueAnimator valueAnimator2 = ValueAnimator.ofFloat((float[])fArray);
        object2 = new View[n4];
        object2[0] = multiViewUpdateListener;
        multiViewUpdateListener = MultiViewUpdateListener.translationYListener((View[])object2);
        valueAnimator2.addUpdateListener((ValueAnimator.AnimatorUpdateListener)multiViewUpdateListener);
        multiViewUpdateListener = new AnimatorSet();
        Animator[] animatorArray = new Animator[n3];
        animatorArray[0] = valueAnimator;
        animatorArray[n4] = valueAnimator2;
        multiViewUpdateListener.playTogether(animatorArray);
        long l2 = bl2 ? 300L : 250L;
        multiViewUpdateListener.setDuration(l2);
        valueAnimator = AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
        TimeInterpolator timeInterpolator = ReversableAnimatedValueInterpolator.of(bl2, (TimeInterpolator)valueAnimator);
        multiViewUpdateListener.setInterpolator(timeInterpolator);
        return multiViewUpdateListener;
    }

    private Animator getTranslationYAnimator() {
        float f5 = this.rootView.getHeight();
        Object object = new float[2];
        object[0] = f5;
        int n3 = 1;
        object[n3] = 0.0f;
        ValueAnimator valueAnimator = ValueAnimator.ofFloat((float[])object);
        object = (Object)this.rootView;
        View[] viewArray = new View[n3];
        viewArray[0] = (View)object;
        object = MultiViewUpdateListener.translationYListener(viewArray);
        valueAnimator.addUpdateListener((ValueAnimator.AnimatorUpdateListener)object);
        return valueAnimator;
    }

    private static /* synthetic */ void lambda$addDrawerArrowDrawableAnimatorIfNeeded$3(yu0_2 yu0_22, ValueAnimator valueAnimator) {
        float f5 = ((Float)valueAnimator.getAnimatedValue()).floatValue();
        yu0_22.b(f5);
    }

    private static /* synthetic */ void lambda$addFadeThroughDrawableAnimatorIfNeeded$4(FadeThroughDrawable fadeThroughDrawable, ValueAnimator valueAnimator) {
        float f5 = ((Float)valueAnimator.getAnimatedValue()).floatValue();
        fadeThroughDrawable.setProgress(f5);
    }

    private /* synthetic */ void lambda$getRootViewAnimator$2(float f5, float f6, Rect rect, ValueAnimator valueAnimator) {
        float f7 = valueAnimator.getAnimatedFraction();
        f5 = AnimationUtils.lerp(f5, f6, f7);
        this.rootView.updateClipBoundsAndCornerRadius(rect, f5);
    }

    private /* synthetic */ void lambda$startShowAnimationExpand$0() {
        AnimatorSet animatorSet = this.getExpandCollapseAnimatorSet(true);
        SearchViewAnimationHelper$1 searchViewAnimationHelper$1 = new SearchViewAnimationHelper$1(this);
        animatorSet.addListener((Animator.AnimatorListener)searchViewAnimationHelper$1);
        animatorSet.start();
    }

    private /* synthetic */ void lambda$startShowAnimationTranslate$1() {
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = this.rootView;
        float f5 = clippableRoundedCornerLayout.getHeight();
        clippableRoundedCornerLayout.setTranslationY(f5);
        clippableRoundedCornerLayout = this.getTranslateAnimatorSet(true);
        SearchViewAnimationHelper$3 searchViewAnimationHelper$3 = new SearchViewAnimationHelper$3(this);
        clippableRoundedCornerLayout.addListener((Animator.AnimatorListener)searchViewAnimationHelper$3);
        clippableRoundedCornerLayout.start();
    }

    private void setActionMenuViewAlphaIfNeeded(float f5) {
        Object object = this.searchView;
        boolean bl2 = ((SearchView)object).isMenuItemsAnimated();
        if (bl2 && (object = ToolbarUtils.getActionMenuView(this.toolbar)) != null) {
            object.setAlpha(f5);
        }
    }

    private void setContentViewsAlpha(float f5) {
        this.clearButton.setAlpha(f5);
        this.divider.setAlpha(f5);
        this.contentContainer.setAlpha(f5);
        this.setActionMenuViewAlphaIfNeeded(f5);
    }

    private void setFullDrawableProgressIfNeeded(Drawable drawable2) {
        boolean bl2 = drawable2 instanceof yu0_2;
        float f5 = 1.0f;
        if (bl2) {
            Drawable drawable3 = drawable2;
            drawable3 = (yu0_2)drawable2;
            drawable3.b(f5);
        }
        if (bl2 = drawable2 instanceof FadeThroughDrawable) {
            drawable2 = (FadeThroughDrawable)drawable2;
            drawable2.setProgress(f5);
        }
    }

    private void setMenuItemsNotClickable(Toolbar viewGroup) {
        if ((viewGroup = ToolbarUtils.getActionMenuView(viewGroup)) != null) {
            int n3;
            for (int i3 = 0; i3 < (n3 = viewGroup.getChildCount()); ++i3) {
                View view = viewGroup.getChildAt(i3);
                view.setClickable(false);
                view.setFocusable(false);
                view.setFocusableInTouchMode(false);
            }
        }
    }

    private void setUpDummyToolbarIfNeeded() {
        int n3;
        int n4;
        Object object = this.dummyToolbar.getMenu();
        if (object != null) {
            object.clear();
        }
        if ((n4 = ((SearchBar)(object = this.searchBar)).getMenuResId()) != (n3 = -1) && (n4 = (int)(((SearchView)(object = this.searchView)).isMenuItemsAnimated() ? 1 : 0)) != 0) {
            object = this.dummyToolbar;
            n3 = this.searchBar.getMenuResId();
            ((Toolbar)object).inflateMenu(n3);
            object = this.dummyToolbar;
            this.setMenuItemsNotClickable((Toolbar)object);
            object = this.dummyToolbar;
            n3 = 0;
            object.setVisibility(0);
        } else {
            object = this.dummyToolbar;
            n3 = 8;
            object.setVisibility(n3);
        }
    }

    private AnimatorSet startHideAnimationCollapse() {
        SearchView searchView = this.searchView;
        boolean bl2 = searchView.isAdjustNothingSoftInputMode();
        if (bl2) {
            searchView = this.searchView;
            searchView.clearFocusAndHideKeyboard();
        }
        searchView = this.getExpandCollapseAnimatorSet(false);
        SearchViewAnimationHelper$2 searchViewAnimationHelper$2 = new SearchViewAnimationHelper$2(this);
        searchView.addListener((Animator.AnimatorListener)searchViewAnimationHelper$2);
        searchView.start();
        return searchView;
    }

    private AnimatorSet startHideAnimationTranslate() {
        SearchView searchView = this.searchView;
        boolean bl2 = searchView.isAdjustNothingSoftInputMode();
        if (bl2) {
            searchView = this.searchView;
            searchView.clearFocusAndHideKeyboard();
        }
        searchView = this.getTranslateAnimatorSet(false);
        SearchViewAnimationHelper$4 searchViewAnimationHelper$4 = new SearchViewAnimationHelper$4(this);
        searchView.addListener((Animator.AnimatorListener)searchViewAnimationHelper$4);
        searchView.start();
        return searchView;
    }

    private void startShowAnimationExpand() {
        FrameLayout frameLayout = this.searchView;
        boolean bl2 = frameLayout.isAdjustNothingSoftInputMode();
        if (bl2) {
            frameLayout = this.searchView;
            frameLayout.requestFocusAndShowKeyboardIfNeeded();
        }
        frameLayout = this.searchView;
        Object object = SearchView$TransitionState.SHOWING;
        frameLayout.setTransitionState((SearchView$TransitionState)((Object)object));
        this.setUpDummyToolbarIfNeeded();
        frameLayout = this.editText;
        object = this.searchBar.getText();
        frameLayout.setText((CharSequence)object);
        frameLayout = this.editText;
        int n3 = frameLayout.getText().length();
        frameLayout.setSelection(n3);
        this.rootView.setVisibility(4);
        frameLayout = this.rootView;
        object = new h(this);
        frameLayout.post((Runnable)object);
    }

    private void startShowAnimationTranslate() {
        Runnable runnable2;
        FrameLayout frameLayout = this.searchView;
        boolean bl2 = frameLayout.isAdjustNothingSoftInputMode();
        if (bl2) {
            frameLayout = this.searchView;
            Objects.requireNonNull(frameLayout);
            int n3 = 2;
            runnable2 = new eW(frameLayout, n3);
            long l2 = 150L;
            frameLayout.postDelayed(runnable2, l2);
        }
        this.rootView.setVisibility(4);
        frameLayout = this.rootView;
        runnable2 = new j(this);
        frameLayout.post(runnable2);
    }

    public void cancelBackProgress() {
        MaterialMainContainerBackHelper materialMainContainerBackHelper = this.backHelper;
        SearchBar searchBar = this.searchBar;
        materialMainContainerBackHelper.cancelBackProgress((View)searchBar);
        materialMainContainerBackHelper = this.backProgressAnimatorSet;
        if (materialMainContainerBackHelper != null) {
            nw2_0.a((AnimatorSet)materialMainContainerBackHelper);
        }
        this.backProgressAnimatorSet = null;
    }

    public void finishBackProgress() {
        long l2 = ow2_0.a(this.hide());
        MaterialMainContainerBackHelper materialMainContainerBackHelper = this.backHelper;
        SearchBar searchBar = this.searchBar;
        materialMainContainerBackHelper.finishBackProgress(l2, (View)searchBar);
        AnimatorSet animatorSet = this.backProgressAnimatorSet;
        if (animatorSet != null) {
            this.getButtonsTranslationAnimator(false).start();
            animatorSet = this.backProgressAnimatorSet;
            animatorSet.resume();
        }
        this.backProgressAnimatorSet = null;
    }

    public MaterialMainContainerBackHelper getBackHelper() {
        return this.backHelper;
    }

    public AnimatorSet hide() {
        SearchBar searchBar = this.searchBar;
        if (searchBar != null) {
            return this.startHideAnimationCollapse();
        }
        return this.startHideAnimationTranslate();
    }

    public uu_0 onHandleBackInvoked() {
        return this.backHelper.onHandleBackInvoked();
    }

    public void setSearchBar(SearchBar searchBar) {
        this.searchBar = searchBar;
    }

    public void show() {
        SearchBar searchBar = this.searchBar;
        if (searchBar != null) {
            this.startShowAnimationExpand();
        } else {
            this.startShowAnimationTranslate();
        }
    }

    public void startBackProgress(uu_0 uu_02) {
        MaterialMainContainerBackHelper materialMainContainerBackHelper = this.backHelper;
        SearchBar searchBar = this.searchBar;
        materialMainContainerBackHelper.startBackProgress(uu_02, (View)searchBar);
    }

    public void updateBackProgress(uu_0 object) {
        float f5 = ((uu_0)object).c;
        float f6 = 0.0f;
        SearchBar searchBar = null;
        float f7 = f5 - 0.0f;
        Object object2 = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
        if (object2 <= 0) {
            return;
        }
        MaterialMainContainerBackHelper materialMainContainerBackHelper = this.backHelper;
        searchBar = this.searchBar;
        float f8 = searchBar.getCornerSize();
        materialMainContainerBackHelper.updateBackProgress((uu_0)object, (View)searchBar, f8);
        materialMainContainerBackHelper = this.backProgressAnimatorSet;
        if (materialMainContainerBackHelper == null) {
            object = this.searchView;
            boolean bl2 = ((SearchView)object).isAdjustNothingSoftInputMode();
            if (bl2) {
                object = this.searchView;
                ((SearchView)object).clearFocusAndHideKeyboard();
            }
            if (!(bl2 = ((SearchView)(object = this.searchView)).isAnimatedNavigationIcon())) {
                return;
            }
            bl2 = false;
            float f11 = 0.0f;
            object = this.getButtonsProgressAnimator(false);
            this.backProgressAnimatorSet = object;
            object.start();
            object = this.backProgressAnimatorSet;
            object.pause();
        } else {
            f6 = materialMainContainerBackHelper.getDuration();
            float f12 = ((uu_0)object).c * f6;
            long l2 = (long)f12;
            hr3.a((AnimatorSet)materialMainContainerBackHelper, l2);
        }
    }
}

