/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.TimeInterpolator
 *  android.content.Context
 *  android.content.res.Resources
 *  android.text.Layout
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.ViewPropertyAnimator
 *  android.widget.Button
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$id;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.snackbar.ContentViewCallback;

public class SnackbarContentLayout
extends LinearLayout
implements ContentViewCallback {
    private Button actionView;
    private final TimeInterpolator contentInterpolator;
    private int maxInlineActionWidth;
    private TextView messageView;

    public SnackbarContentLayout(Context context) {
        this(context, null);
    }

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int n3 = R$attr.motionEasingEmphasizedInterpolator;
        TimeInterpolator timeInterpolator = AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
        context = MotionUtils.resolveThemeInterpolator(context, n3, timeInterpolator);
        this.contentInterpolator = context;
    }

    private static void updateTopBottomPadding(View view, int n3, int n4) {
        int n7 = view.isPaddingRelative();
        if (n7 != 0) {
            n7 = view.getPaddingStart();
            int n8 = view.getPaddingEnd();
            view.setPaddingRelative(n7, n3, n8, n4);
        } else {
            n7 = view.getPaddingLeft();
            int n10 = view.getPaddingRight();
            view.setPadding(n7, n3, n10, n4);
        }
    }

    private boolean updateViewsWithinLayout(int n3, int n4, int n7) {
        TextView textView;
        int n8 = this.getOrientation();
        int n10 = 1;
        if (n3 != n8) {
            this.setOrientation(n3);
            n3 = 1;
        } else {
            n3 = 0;
            textView = null;
        }
        TextView textView2 = this.messageView;
        n8 = textView2.getPaddingTop();
        if (n8 == n4 && (n8 = (textView2 = this.messageView).getPaddingBottom()) == n7) {
            n10 = n3;
        } else {
            textView = this.messageView;
            SnackbarContentLayout.updateTopBottomPadding((View)textView, n4, n7);
        }
        return n10 != 0;
    }

    public void animateContentIn(int n3, int n4) {
        this.messageView.setAlpha(0.0f);
        ViewPropertyAnimator viewPropertyAnimator = this.messageView.animate();
        float f5 = 1.0f;
        viewPropertyAnimator = viewPropertyAnimator.alpha(f5);
        long l2 = n4;
        ViewPropertyAnimator viewPropertyAnimator2 = viewPropertyAnimator.setDuration(l2);
        viewPropertyAnimator = this.contentInterpolator;
        viewPropertyAnimator2 = viewPropertyAnimator2.setInterpolator((TimeInterpolator)viewPropertyAnimator);
        long l3 = n3;
        viewPropertyAnimator2.setStartDelay(l3).start();
        Button button = this.actionView;
        n3 = button.getVisibility();
        if (n3 == 0) {
            this.actionView.setAlpha(0.0f);
            button = this.actionView.animate().alpha(f5).setDuration(l2);
            viewPropertyAnimator2 = this.contentInterpolator;
            button = button.setInterpolator((TimeInterpolator)viewPropertyAnimator2).setStartDelay(l3);
            button.start();
        }
    }

    public void animateContentOut(int n3, int n4) {
        TextView textView = this.messageView;
        float f5 = 1.0f;
        textView.setAlpha(f5);
        textView = this.messageView.animate().alpha(0.0f);
        long l2 = n4;
        ViewPropertyAnimator viewPropertyAnimator = textView.setDuration(l2);
        textView = this.contentInterpolator;
        viewPropertyAnimator = viewPropertyAnimator.setInterpolator((TimeInterpolator)textView);
        long l3 = n3;
        viewPropertyAnimator.setStartDelay(l3).start();
        Button button = this.actionView;
        n3 = button.getVisibility();
        if (n3 == 0) {
            this.actionView.setAlpha(f5);
            button = this.actionView.animate().alpha(0.0f).setDuration(l2);
            viewPropertyAnimator = this.contentInterpolator;
            button = button.setInterpolator((TimeInterpolator)viewPropertyAnimator).setStartDelay(l3);
            button.start();
        }
    }

    public Button getActionView() {
        return this.actionView;
    }

    public TextView getMessageView() {
        return this.messageView;
    }

    public void onFinishInflate() {
        TextView textView;
        super.onFinishInflate();
        int n3 = R$id.snackbar_text;
        this.messageView = textView = (TextView)this.findViewById(n3);
        n3 = R$id.snackbar_action;
        textView = (Button)this.findViewById(n3);
        this.actionView = textView;
    }

    public void onMeasure(int n3, int n4) {
        block8: {
            block9: {
                int n7;
                int n8;
                int n10;
                block7: {
                    int n14;
                    Button button;
                    int n15;
                    super.onMeasure(n3, n4);
                    n10 = this.getOrientation();
                    int n16 = 1;
                    if (n10 == n16) {
                        return;
                    }
                    Resources resources = this.getResources();
                    n8 = R$dimen.design_snackbar_padding_vertical_2lines;
                    n10 = resources.getDimensionPixelSize(n8);
                    Resources resources2 = this.getResources();
                    n7 = R$dimen.design_snackbar_padding_vertical;
                    n8 = resources2.getDimensionPixelSize(n7);
                    Layout layout2 = this.messageView.getLayout();
                    if (layout2 != null && (n7 = layout2.getLineCount()) > n16) {
                        n7 = 1;
                    } else {
                        n7 = 0;
                        layout2 = null;
                    }
                    if (n7 == 0 || (n15 = this.maxInlineActionWidth) <= 0 || (n15 = (button = this.actionView).getMeasuredWidth()) <= (n14 = this.maxInlineActionWidth)) break block7;
                    if ((n10 = (int)(this.updateViewsWithinLayout(n16, n10, n8 = n10 - n8) ? 1 : 0)) == 0) break block8;
                    break block9;
                }
                if (n7 == 0) {
                    n10 = n8;
                }
                n10 = (int)(this.updateViewsWithinLayout(0, n10, n10) ? 1 : 0);
                if (n10 == 0) break block8;
            }
            super.onMeasure(n3, n4);
        }
    }

    public void setMaxInlineActionWidth(int n3) {
        this.maxInlineActionWidth = n3;
    }

    public void updateActionTextColorAlphaIfNeeded(float f5) {
        float f6 = 1.0f;
        float f7 = f5 - f6;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object != false) {
            object = this.actionView.getCurrentTextColor();
            int n3 = R$attr.colorSurface;
            n3 = MaterialColors.getColor((View)this, n3);
            int n4 = MaterialColors.layer(n3, (int)object, f5);
            Button button = this.actionView;
            button.setTextColor(n4);
        }
    }
}

