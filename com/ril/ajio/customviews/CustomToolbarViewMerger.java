/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.AnimatorInflater
 *  android.animation.StateListAnimator
 *  android.content.Context
 *  android.graphics.Color
 *  android.graphics.ColorFilter
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.text.SpannableString
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.customviews;

import android.animation.AnimatorInflater;
import android.animation.StateListAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout$e;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.AppBarLayout$BaseBehavior$BaseDragCallback;
import com.google.android.material.appbar.AppBarLayout$Behavior;
import com.google.android.material.appbar.AppBarLayout$OnOffsetChangedListener;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.ril.ajio.R$animator;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.CustomToolbarOffsetListener;
import com.ril.ajio.customviews.CustomToolbarViewMerger$setExpanded$1;
import com.ril.ajio.customviews.OnNavigationClickListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class CustomToolbarViewMerger
implements AppBarLayout$OnOffsetChangedListener,
View.OnClickListener {
    public static final int $stable = 8;
    private AppBarLayout appBarLayout;
    private CollapsingToolbarLayout collapsingToolbarLayout;
    private CustomToolbarOffsetListener customToolbarOffsetListener;
    private TextView floatSubtitleTv;
    private TextView floatTitleTv;
    private ConstraintLayout floatView;
    private TextView headerSubTitleTv;
    private TextView headerTitleTv;
    private ConstraintLayout headerView;
    private ImageView headingIv;
    private boolean isHeaderImageViewEnabled;
    private boolean isHideToolbarView;
    private final OnNavigationClickListener navigationClickListener;
    private LinearLayout subtitlefloatLayout;
    private Toolbar toolbar;

    public CustomToolbarViewMerger(OnNavigationClickListener onNavigationClickListener) {
        Intrinsics.checkNotNullParameter(onNavigationClickListener, "navigationClickListener");
        this.navigationClickListener = onNavigationClickListener;
    }

    public CustomToolbarViewMerger(OnNavigationClickListener onNavigationClickListener, CustomToolbarOffsetListener customToolbarOffsetListener) {
        Intrinsics.checkNotNullParameter(onNavigationClickListener, "navigationClickListener");
        Intrinsics.checkNotNullParameter(customToolbarOffsetListener, "customToolbarOffsetListener");
        this(onNavigationClickListener);
        this.customToolbarOffsetListener = customToolbarOffsetListener;
    }

    public static /* synthetic */ Unit a(CustomToolbarViewMerger customToolbarViewMerger) {
        return CustomToolbarViewMerger.setNavigationIconAccessibility$lambda$7$lambda$6$lambda$5(customToolbarViewMerger);
    }

    private final void initFloatView(View object) {
        int n3;
        int n4 = R$id.float_header_view;
        object = (ConstraintLayout)object.findViewById(n4);
        this.floatView = object;
        n4 = 0;
        Object object2 = null;
        if (object != null) {
            n3 = R$id.toolbar_title_tv;
            object = (TextView)object.findViewById(n3);
        } else {
            object = null;
        }
        this.floatTitleTv = object;
        object = this.floatView;
        if (object != null) {
            n3 = R$id.toolbar_subtitle_tv;
            object = (TextView)object.findViewById(n3);
        } else {
            object = null;
        }
        this.floatSubtitleTv = object;
        object = this.floatView;
        if (object != null) {
            n4 = R$id.linearLayout;
            object2 = object = object.findViewById(n4);
            object2 = (LinearLayout)object;
        }
        this.subtitlefloatLayout = object2;
    }

    private final void initToolbarView(View object) {
        int n3 = R$id.toolbar_header_view;
        Object object2 = (ConstraintLayout)object.findViewById(n3);
        this.headerView = object2;
        int n4 = 0;
        ConstraintLayout constraintLayout = null;
        if (object2 != null) {
            int n7 = R$id.toolbar_title_tv;
            object2 = (TextView)object2.findViewById(n7);
        } else {
            n3 = 0;
            object2 = null;
        }
        this.headerTitleTv = object2;
        if (object2 != null) {
            ai0_2.t((View)object2);
        }
        if ((object2 = this.headerView) != null) {
            n4 = R$id.toolbar_subtitle_tv;
            object2 = object2.findViewById(n4);
            constraintLayout = object2;
            constraintLayout = (TextView)object2;
        }
        this.headerSubTitleTv = constraintLayout;
        n3 = R$id.toolbar_bg_iv;
        object2 = (ImageView)object.findViewById(n3);
        this.headingIv = object2;
        n3 = R$id.toolbar;
        object2 = (Toolbar)object.findViewById(n3);
        this.toolbar = object2;
        n3 = R$id.app_bar_layout;
        object2 = (AppBarLayout)object.findViewById(n3);
        this.appBarLayout = object2;
        if (object2 != null) {
            ((AppBarLayout)object2).addOnOffsetChangedListener(this);
        }
        n3 = R$id.collapsing_toolbar;
        object = (CollapsingToolbarLayout)object.findViewById(n3);
        this.collapsingToolbarLayout = object;
        object2 = "";
        if (object != null) {
            ((CollapsingToolbarLayout)((Object)object)).setTitle((CharSequence)object2);
        }
        if ((object = this.toolbar) != null) {
            ((Toolbar)object).setTitle((CharSequence)object2);
        }
        if ((object = this.toolbar) != null) {
            n3 = R$drawable.nav_back;
            ((Toolbar)object).setNavigationIcon(n3);
        }
        if ((object = this.toolbar) != null) {
            n3 = R$string.back_button_text;
            object2 = hv3_0.K(n3);
            ((Toolbar)object).setNavigationContentDescription((CharSequence)object2);
        }
        if ((object = this.toolbar) != null && (object = ((Toolbar)object).getNavigationIcon()) != null) {
            object2 = "#000000";
            n3 = Color.parseColor((String)object2);
            constraintLayout = PorterDuff.Mode.SRC_IN;
            object.setColorFilter(n3, (PorterDuff.Mode)constraintLayout);
        }
    }

    public static /* synthetic */ void setNavigationIcon$default(CustomToolbarViewMerger customToolbarViewMerger, int n3, String string2, String string3, String string4, int n4, Object object) {
        int n7 = n4 & 2;
        if (n7 != 0) {
            string2 = "back";
        }
        if ((n4 &= 8) != 0) {
            string4 = "";
        }
        customToolbarViewMerger.setNavigationIcon(n3, string2, string3, string4);
    }

    public static /* synthetic */ void setNavigationIcon$default(CustomToolbarViewMerger customToolbarViewMerger, Drawable drawable2, String string2, int n3, Object object) {
        if ((n3 &= 2) != 0) {
            string2 = null;
        }
        customToolbarViewMerger.setNavigationIcon(drawable2, string2);
    }

    private final void setNavigationIconAccessibility(String object) {
        if (object != null) {
            Object object2 = "BACK";
            int n3 = Intrinsics.areEqual(object, object2);
            if (n3 != 0) {
                object = this.toolbar;
                if (object != null) {
                    n3 = R$string.back_button_text;
                    object2 = hv3_0.K(n3);
                    ((Toolbar)object).setNavigationContentDescription((CharSequence)object2);
                }
            } else {
                object2 = "CLOSE";
                n3 = Intrinsics.areEqual(object, object2);
                if (n3 != 0) {
                    object = this.toolbar;
                    if (object != null) {
                        n3 = R$string.close;
                        object2 = hv3_0.K(n3);
                        ((Toolbar)object).setNavigationContentDescription((CharSequence)object2);
                    }
                } else {
                    object2 = "HAMBURGER";
                    n3 = (int)(Intrinsics.areEqual(object, object2) ? 1 : 0);
                    if (n3 == 0) {
                        object2 = hv3_0.K(R$string.acc_back_icon_product_details);
                        n3 = (int)(Intrinsics.areEqual(object, object2) ? 1 : 0);
                        if (n3 != 0) {
                            object2 = this.toolbar;
                            if (object2 != null) {
                                ((Toolbar)object2).setNavigationContentDescription((CharSequence)object);
                            }
                        } else {
                            object = this.toolbar;
                            if (object != null) {
                                n3 = R$string.back_button_text;
                                object2 = hv3_0.K(n3);
                                ((Toolbar)object).setNavigationContentDescription((CharSequence)object2);
                            }
                        }
                    }
                }
            }
        }
    }

    private static final Function0 setNavigationIconAccessibility$lambda$7$lambda$6(CustomToolbarViewMerger customToolbarViewMerger) {
        Intrinsics.checkNotNullParameter(customToolbarViewMerger, "this$0");
        lg0_2 lg0_22 = new lg0_2(customToolbarViewMerger, 0);
        return lg0_22;
    }

    private static final Unit setNavigationIconAccessibility$lambda$7$lambda$6$lambda$5(CustomToolbarViewMerger object) {
        String string2 = "this$0";
        Intrinsics.checkNotNullParameter(object, string2);
        object = ((CustomToolbarViewMerger)object).toolbar;
        if (object != null) {
            int n3 = R$string.hamburger_button;
            string2 = hv3_0.K(n3);
            ((Toolbar)object).setNavigationContentDescription(string2);
        }
        return Unit.a;
    }

    public final void forceCollapsingToolbarLayoutTitle() {
        AppBarLayout appBarLayout = this.appBarLayout;
        if (appBarLayout != null) {
            boolean bl2 = true;
            appBarLayout.setExpanded(bl2, false);
        }
    }

    public final TextView getFloatSubtitleTv() {
        return this.floatSubtitleTv;
    }

    public final TextView getFloatTitleTv() {
        return this.floatTitleTv;
    }

    public final ConstraintLayout getFloatView() {
        return this.floatView;
    }

    public final TextView getHeaderSubTitleTv() {
        return this.headerSubTitleTv;
    }

    public final TextView getHeaderTitleTv() {
        return this.headerTitleTv;
    }

    public final ConstraintLayout getHeaderView() {
        return this.headerView;
    }

    public final LinearLayout getSubtitlefloatLayout() {
        return this.subtitlefloatLayout;
    }

    public final Toolbar getToolbar() {
        return this.toolbar;
    }

    public final View inflateView(Context context, int n3, int n4, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        View view = layoutInflater.inflate(n3, viewGroup, false);
        context = LayoutInflater.from((Context)context).inflate(n4, viewGroup, false);
        n4 = R$id.toolbar_frame_layout;
        FrameLayout frameLayout = (FrameLayout)view.findViewById(n4);
        if (frameLayout != null) {
            frameLayout.addView((View)context);
        }
        Intrinsics.checkNotNull(view);
        this.initViews(view);
        return view;
    }

    public final void initViews(View view) {
        Intrinsics.checkNotNullParameter(view, "parentView");
        this.initToolbarView(view);
        this.initFloatView(view);
    }

    public void onClick(View view) {
        Intrinsics.checkNotNullParameter(view, "v");
        this.navigationClickListener.onNavigationClick();
    }

    public void onOffsetChanged(AppBarLayout object, int n3) {
        Object object2 = "appBarLayout";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        int n4 = ((AppBarLayout)object).getTotalScrollRange();
        int n7 = Math.abs(n3);
        float f5 = n7;
        float f6 = n4;
        f5 /= f6;
        f6 = 1.0f;
        int n8 = 8;
        int n10 = 1;
        n4 = (int)(f5 == f6 ? 0 : (f5 < f6 ? -1 : 1));
        if (n4 == 0 && (n7 = (int)(this.isHideToolbarView ? 1 : 0)) != 0) {
            object = this.headerView;
            if (object != null) {
                object.setVisibility(0);
            }
            n4 = this.isHideToolbarView ^ n10;
            this.isHideToolbarView = n4;
            n4 = (int)(this.isHeaderImageViewEnabled ? 1 : 0);
            if (n4 != 0 && (object = this.headingIv) != null) {
                object.setVisibility(n8);
            }
        } else if (n4 < 0 && (n4 = (int)(this.isHideToolbarView ? 1 : 0)) == 0) {
            object = this.headerView;
            if (object != null) {
                object.setVisibility(n8);
            }
            n4 = this.isHideToolbarView ^ n10;
            this.isHideToolbarView = n4;
            n4 = (int)(this.isHeaderImageViewEnabled ? 1 : 0);
            if (n4 != 0 && (object = this.headingIv) != null) {
                object.setVisibility(0);
            }
        }
        if ((object = this.customToolbarOffsetListener) != null && (object2 = this.collapsingToolbarLayout) != null) {
            n8 = object2.getHeight() + n3;
            if (n8 < (n3 = ((CollapsingToolbarLayout)((Object)object2)).getScrimVisibleHeightTrigger())) {
                object.onScrolled(n10 != 0);
            } else {
                object.onScrolled(false);
            }
        }
    }

    public final void setBackGroundColor(int n3) {
        AppBarLayout appBarLayout = this.appBarLayout;
        if (appBarLayout != null) {
            appBarLayout.setBackgroundColor(n3);
        }
    }

    public final void setExpanded(boolean bl2) {
        Object object = this.appBarLayout;
        if (object != null) {
            ((AppBarLayout)object).setExpanded(bl2);
        }
        Object object2 = this.appBarLayout;
        object = null;
        if (object2 != null) {
            Context context = object2 != null ? object2.getContext() : null;
            int n3 = R$animator.appbar_elevation_off;
            context = AnimatorInflater.loadStateListAnimator((Context)context, (int)n3);
            object2.setStateListAnimator((StateListAnimator)context);
        }
        if ((object2 = this.appBarLayout) != null) {
            object = object2.getLayoutParams();
        }
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        object = (CoordinatorLayout$e)((Object)object);
        object2 = ((CoordinatorLayout$e)((Object)object)).a;
        if (object2 == null) {
            object2 = new AppBarLayout$Behavior();
            ((CoordinatorLayout$e)((Object)object)).b((CoordinatorLayout$Behavior)object2);
        }
        object2 = ((CoordinatorLayout$e)((Object)object)).a;
        Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout.Behavior");
        object2 = (AppBarLayout$Behavior)object2;
        object = new CustomToolbarViewMerger$setExpanded$1();
        ((AppBarLayout$Behavior)object2).setDragCallback((AppBarLayout$BaseBehavior$BaseDragCallback)object);
    }

    public final void setFloatSubtitleColor(int n3) {
        TextView textView = this.floatSubtitleTv;
        if (textView != null) {
            textView.setTextColor(n3);
        }
    }

    public final void setFloatSubtitleTv(TextView textView) {
        this.floatSubtitleTv = textView;
    }

    public final void setFloatTitleColor(int n3) {
        TextView textView = this.floatTitleTv;
        if (textView != null) {
            textView.setTextColor(n3);
        }
    }

    public final void setFloatTitleTv(TextView textView) {
        this.floatTitleTv = textView;
    }

    public final void setFloatView(ConstraintLayout constraintLayout) {
        this.floatView = constraintLayout;
    }

    public final void setFloatViewSubtitleTextSize(float f5) {
        TextView textView = this.floatSubtitleTv;
        if (textView != null) {
            int n3 = 2;
            textView.setTextSize(n3, f5);
        }
    }

    public final void setFloatViewTitleTextSize(float f5) {
        TextView textView = this.floatTitleTv;
        if (textView != null) {
            int n3 = 2;
            textView.setTextSize(n3, f5);
        }
    }

    public final void setHeaderImageViewIcon(String string2) {
        Intrinsics.checkNotNullParameter(string2, "url");
        ImageView imageView = this.headingIv;
        if (imageView != null) {
            int n3;
            boolean bl2;
            Intrinsics.checkNotNull(imageView);
            imageView.setVisibility(0);
            this.isHeaderImageViewEnabled = bl2 = true;
            da$a da$a = new da$a();
            da$a.k = bl2;
            da$a.a = n3 = 17170445;
            da$a.b = n3;
            da$a.c = n3;
            da$a.s = bl2;
            n3 = R$string.acc_icon_product_placeholder;
            String string3 = hv3_0.K(n3);
            da$a.b(string3);
            da$a.g = bl2;
            string3 = this.headingIv;
            Intrinsics.checkNotNull(string3);
            da$a.n = string2;
            da$a.u = string3;
            da$a.i = bl2;
            da$a.a();
        }
    }

    public final void setHeaderSubTitleTv(TextView textView) {
        this.headerSubTitleTv = textView;
    }

    public final void setHeaderTitleTv(TextView textView) {
        this.headerTitleTv = textView;
    }

    public final void setHeaderView(ConstraintLayout constraintLayout) {
        this.headerView = constraintLayout;
    }

    public final void setNavigationClick() {
        Toolbar toolbar = this.toolbar;
        if (toolbar != null) {
            toolbar.setNavigationOnClickListener(this);
        }
    }

    public final void setNavigationIcon(int n3, String string2, String object, String string3) {
        string3 = "from";
        Intrinsics.checkNotNullParameter(object, string3);
        object = this.toolbar;
        if (object != null) {
            ((Toolbar)object).setNavigationIcon(n3);
        }
        this.setNavigationIconAccessibility(string2);
    }

    public final void setNavigationIcon(Drawable object, String string2) {
        Toolbar toolbar = this.toolbar;
        if (toolbar != null) {
            toolbar.setNavigationIcon((Drawable)object);
        }
        if (string2 != null) {
            this.setNavigationIconAccessibility(string2);
        }
        if (object != null && string2 != null && (object = this.toolbar) != null) {
            object.setContentDescription((CharSequence)string2);
        }
    }

    public final void setNavigationIconColor(int n3) {
        Toolbar toolbar = this.toolbar;
        if (toolbar != null && (toolbar = toolbar.getNavigationIcon()) != null) {
            hy_0 hy_02 = hy_0.SRC_IN;
            ColorFilter colorFilter = by_0.a(n3, hy_02);
            toolbar.setColorFilter(colorFilter);
        }
    }

    public final void setSubTitleColor(int n3) {
        TextView textView = this.headerSubTitleTv;
        if (textView != null) {
            textView.setTextColor(n3);
        }
        if ((textView = this.floatSubtitleTv) != null) {
            textView.setTextColor(n3);
        }
    }

    public final void setSubTitleText(String string2) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(string2, "text");
        TextView textView = this.headerSubTitleTv;
        if (textView != null) {
            textView.setText((CharSequence)string2);
        }
        if ((textView = this.floatSubtitleTv) != null) {
            textView.setText((CharSequence)string2);
        }
        if (!(bl2 = TextUtils.isEmpty((CharSequence)string2)) && (textView = this.headerTitleTv) != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            stringBuilder.append(" header");
            string2 = stringBuilder.toString();
            textView.setContentDescription((CharSequence)string2);
        }
    }

    public final void setSubTitleVisibility(int n3) {
        TextView textView = this.headerSubTitleTv;
        if (textView != null) {
            textView.setVisibility(n3);
        }
        if ((textView = this.floatSubtitleTv) != null) {
            textView.setVisibility(n3);
        }
    }

    public final void setSubtitlefloatLayout(LinearLayout linearLayout) {
        this.subtitlefloatLayout = linearLayout;
    }

    public final void setTitleColor(int n3) {
        TextView textView = this.headerTitleTv;
        if (textView != null) {
            textView.setTextColor(n3);
        }
        if ((textView = this.floatTitleTv) != null) {
            textView.setTextColor(n3);
        }
    }

    public final void setTitleText(SpannableString object) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "spannableString");
        TextView textView = this.headerTitleTv;
        if (textView != null) {
            textView.setText((CharSequence)object);
        }
        if ((textView = this.floatTitleTv) != null) {
            textView.setText((CharSequence)object);
        }
        if (!(bl2 = TextUtils.isEmpty((CharSequence)object)) && (textView = this.headerTitleTv) != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(object);
            stringBuilder.append(" header");
            object = stringBuilder.toString();
            textView.setContentDescription((CharSequence)object);
        }
    }

    public final void setTitleText(String string2) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(string2, "text");
        TextView textView = this.headerTitleTv;
        if (textView != null) {
            textView.setText((CharSequence)string2);
        }
        if ((textView = this.floatTitleTv) != null) {
            textView.setText((CharSequence)string2);
        }
        if (!(bl2 = TextUtils.isEmpty((CharSequence)string2)) && (textView = this.headerTitleTv) != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            stringBuilder.append(" header");
            string2 = stringBuilder.toString();
            textView.setContentDescription((CharSequence)string2);
        }
    }

    public final void setTitleVisibility(int n3) {
        TextView textView = this.headerTitleTv;
        if (textView != null) {
            textView.setVisibility(n3);
        }
        if ((textView = this.floatTitleTv) != null) {
            textView.setVisibility(n3);
        }
    }

    public final void setToolbarSubtitleColor(int n3) {
        TextView textView = this.headerSubTitleTv;
        if (textView != null) {
            textView.setTextColor(n3);
        }
    }

    public final void setToolbarTitleColor(int n3) {
        TextView textView = this.headerTitleTv;
        if (textView != null) {
            textView.setTextColor(n3);
        }
    }
}

