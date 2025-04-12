/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.PorterDuff$Mode
 *  android.os.Build$VERSION
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.accessibility.AccessibilityManager
 *  android.widget.Button
 *  android.widget.FrameLayout
 *  android.widget.TextView
 */
package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R$attr;
import com.google.android.material.R$layout;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.BaseTransientBottomBar$BaseCallback;
import com.google.android.material.snackbar.ContentViewCallback;
import com.google.android.material.snackbar.Snackbar$Callback;
import com.google.android.material.snackbar.SnackbarContentLayout;

public class Snackbar
extends BaseTransientBottomBar {
    private static final int[] SNACKBAR_BUTTON_STYLE_ATTR;
    private static final int[] SNACKBAR_CONTENT_STYLE_ATTRS;
    private final AccessibilityManager accessibilityManager;
    private BaseTransientBottomBar$BaseCallback callback;
    private boolean hasAction;

    static {
        int n3 = R$attr.snackbarButtonStyle;
        SNACKBAR_BUTTON_STYLE_ATTR = new int[]{n3};
        int n4 = R$attr.snackbarTextViewStyle;
        SNACKBAR_CONTENT_STYLE_ATTRS = new int[]{n3, n4};
    }

    private Snackbar(Context context, ViewGroup viewGroup, View view, ContentViewCallback contentViewCallback) {
        super(context, viewGroup, view, contentViewCallback);
        context = (AccessibilityManager)viewGroup.getContext().getSystemService("accessibility");
        this.accessibilityManager = context;
    }

    public static /* synthetic */ void a(Snackbar snackbar, View.OnClickListener onClickListener, View view) {
        snackbar.lambda$setAction$0(onClickListener, view);
    }

    private static ViewGroup findSuitableParent(View view) {
        int n3 = 0;
        View view2 = null;
        do {
            int n4;
            if ((n4 = view instanceof CoordinatorLayout) != 0) {
                return (ViewGroup)view;
            }
            n4 = view instanceof FrameLayout;
            if (n4 != 0) {
                n3 = view.getId();
                if (n3 == (n4 = 0x1020002)) {
                    return (ViewGroup)view;
                }
                view2 = view;
                view2 = (ViewGroup)view;
            }
            if (view == null || (n4 = (view = view.getParent()) instanceof View) != 0) continue;
            view = null;
        } while (view != null);
        return view2;
    }

    private Button getActionView() {
        return this.getContentLayout().getActionView();
    }

    private SnackbarContentLayout getContentLayout() {
        return (SnackbarContentLayout)this.view.getChildAt(0);
    }

    private TextView getMessageView() {
        return this.getContentLayout().getMessageView();
    }

    public static boolean hasSnackbarButtonStyleAttr(Context context) {
        int[] nArray = SNACKBAR_BUTTON_STYLE_ATTR;
        context = context.obtainStyledAttributes(nArray);
        boolean bl2 = false;
        nArray = null;
        int n3 = -1;
        int n4 = context.getResourceId(0, n3);
        context.recycle();
        if (n4 != n3) {
            bl2 = true;
        }
        return bl2;
    }

    private static boolean hasSnackbarContentStyleAttrs(Context context) {
        int[] nArray = SNACKBAR_CONTENT_STYLE_ATTRS;
        context = context.obtainStyledAttributes(nArray);
        boolean bl2 = false;
        nArray = null;
        int n3 = -1;
        int n4 = context.getResourceId(0, n3);
        int n7 = 1;
        int n8 = context.getResourceId(n7, n3);
        context.recycle();
        if (n4 != n3 && n8 != n3) {
            bl2 = true;
        }
        return bl2;
    }

    private /* synthetic */ void lambda$setAction$0(View.OnClickListener onClickListener, View view) {
        onClickListener.onClick(view);
        this.dispatchDismiss(1);
    }

    public static Snackbar make(Context context, View view, CharSequence charSequence, int n3) {
        return Snackbar.makeInternal(context, view, charSequence, n3);
    }

    public static Snackbar make(View view, int n3, int n4) {
        CharSequence charSequence = view.getResources().getText(n3);
        return Snackbar.make(view, charSequence, n4);
    }

    public static Snackbar make(View view, CharSequence charSequence, int n3) {
        return Snackbar.makeInternal(null, view, charSequence, n3);
    }

    private static Snackbar makeInternal(Context object, View view, CharSequence charSequence, int n3) {
        if ((view = Snackbar.findSuitableParent(view)) != null) {
            if (object == null) {
                object = view.getContext();
            }
            Object object2 = LayoutInflater.from((Context)object);
            int n4 = Snackbar.hasSnackbarContentStyleAttrs(object);
            n4 = n4 != 0 ? R$layout.mtrl_layout_snackbar_include : R$layout.design_layout_snackbar_include;
            object2 = (SnackbarContentLayout)object2.inflate(n4, (ViewGroup)view, false);
            Snackbar snackbar = new Snackbar((Context)object, (ViewGroup)view, (View)object2, (ContentViewCallback)object2);
            snackbar.setText(charSequence);
            snackbar.setDuration(n3);
            return snackbar;
        }
        object = new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        throw object;
    }

    public void dismiss() {
        super.dismiss();
    }

    public int getDuration() {
        AccessibilityManager accessibilityManager;
        int n3;
        int n4 = super.getDuration();
        if (n4 == (n3 = -2)) {
            return n3;
        }
        int n7 = Build.VERSION.SDK_INT;
        int n8 = 29;
        if (n7 >= n8) {
            n3 = (int)(this.hasAction ? 1 : 0);
            n3 = n3 != 0 ? 4 : 0;
            AccessibilityManager accessibilityManager2 = this.accessibilityManager;
            return Kk0.a(accessibilityManager2, n4, n3 |= 3);
        }
        n7 = (int)(this.hasAction ? 1 : 0);
        if (n7 != 0 && (n7 = (int)((accessibilityManager = this.accessibilityManager).isTouchExplorationEnabled() ? 1 : 0)) != 0) {
            n4 = -2;
        }
        return n4;
    }

    public boolean isShown() {
        return super.isShown();
    }

    public Snackbar setAction(int n3, View.OnClickListener onClickListener) {
        CharSequence charSequence = this.getContext().getText(n3);
        return this.setAction(charSequence, onClickListener);
    }

    public Snackbar setAction(CharSequence object, View.OnClickListener onClickListener) {
        Button button = this.getActionView();
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (!bl2 && onClickListener != null) {
            this.hasAction = bl2 = true;
            button.setVisibility(0);
            button.setText((CharSequence)object);
            object = new C73(this, onClickListener);
            button.setOnClickListener((View.OnClickListener)object);
        } else {
            button.setVisibility(8);
            object = null;
            button.setOnClickListener(null);
            this.hasAction = false;
        }
        return this;
    }

    public Snackbar setActionTextColor(int n3) {
        this.getActionView().setTextColor(n3);
        return this;
    }

    public Snackbar setActionTextColor(ColorStateList colorStateList) {
        this.getActionView().setTextColor(colorStateList);
        return this;
    }

    public Snackbar setBackgroundTint(int n3) {
        ColorStateList colorStateList = ColorStateList.valueOf((int)n3);
        return this.setBackgroundTintList(colorStateList);
    }

    public Snackbar setBackgroundTintList(ColorStateList colorStateList) {
        this.view.setBackgroundTintList(colorStateList);
        return this;
    }

    public Snackbar setBackgroundTintMode(PorterDuff.Mode mode) {
        this.view.setBackgroundTintMode(mode);
        return this;
    }

    public Snackbar setCallback(Snackbar$Callback snackbar$Callback) {
        BaseTransientBottomBar$BaseCallback baseTransientBottomBar$BaseCallback = this.callback;
        if (baseTransientBottomBar$BaseCallback != null) {
            this.removeCallback(baseTransientBottomBar$BaseCallback);
        }
        if (snackbar$Callback != null) {
            this.addCallback(snackbar$Callback);
        }
        this.callback = snackbar$Callback;
        return this;
    }

    public Snackbar setMaxInlineActionWidth(int n3) {
        this.getContentLayout().setMaxInlineActionWidth(n3);
        return this;
    }

    public Snackbar setText(int n3) {
        CharSequence charSequence = this.getContext().getText(n3);
        return this.setText(charSequence);
    }

    public Snackbar setText(CharSequence charSequence) {
        this.getMessageView().setText(charSequence);
        return this;
    }

    public Snackbar setTextColor(int n3) {
        this.getMessageView().setTextColor(n3);
        return this;
    }

    public Snackbar setTextColor(ColorStateList colorStateList) {
        this.getMessageView().setTextColor(colorStateList);
        return this;
    }

    public Snackbar setTextMaxLines(int n3) {
        this.getMessageView().setMaxLines(n3);
        return this;
    }

    public void show() {
        super.show();
    }
}

