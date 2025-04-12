/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.util.TypedValue
 *  android.view.Gravity
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.Window
 *  android.widget.FrameLayout
 */
package com.google.android.material.sidesheet;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout$e;
import androidx.core.view.ViewCompat;
import com.google.android.material.R$id;
import com.google.android.material.R$style;
import com.google.android.material.motion.MaterialBackOrchestrator;
import com.google.android.material.sidesheet.Sheet;
import com.google.android.material.sidesheet.SheetDialog$1;
import com.google.android.material.sidesheet.a;

abstract class SheetDialog
extends on {
    private static final int COORDINATOR_LAYOUT_ID = R$id.coordinator;
    private static final int TOUCH_OUTSIDE_ID = R$id.touch_outside;
    private MaterialBackOrchestrator backOrchestrator;
    private Sheet behavior;
    boolean cancelable;
    private boolean canceledOnTouchOutside;
    private boolean canceledOnTouchOutsideSet;
    private FrameLayout container;
    boolean dismissWithAnimation;
    private FrameLayout sheet;

    public SheetDialog(Context context, int n3, int n4, int n7) {
        n3 = SheetDialog.getThemeResId(context, n3, n4, n7);
        super(context, n3);
        int n8 = 1;
        this.cancelable = n8;
        this.canceledOnTouchOutside = n8;
        this.supportRequestWindowFeature(n8);
    }

    public static /* synthetic */ void b(SheetDialog sheetDialog, View view) {
        sheetDialog.lambda$wrapInSheet$0(view);
    }

    private void ensureContainerAndBehavior() {
        Object object = this.container;
        if (object == null) {
            object = this.getContext();
            int n3 = this.getLayoutResId();
            this.container = object = (FrameLayout)View.inflate((Context)object, (int)n3, null);
            n3 = this.getDialogId();
            this.sheet = object = (FrameLayout)object.findViewById(n3);
            object = this.getBehaviorFromSheet((FrameLayout)object);
            this.behavior = object;
            this.addSheetCancelOnHideCallback((Sheet)object);
            Sheet sheet = this.behavior;
            FrameLayout frameLayout = this.sheet;
            object = new MaterialBackOrchestrator(sheet, (View)frameLayout);
            this.backOrchestrator = object;
        }
    }

    private FrameLayout getContainer() {
        FrameLayout frameLayout = this.container;
        if (frameLayout == null) {
            this.ensureContainerAndBehavior();
        }
        return this.container;
    }

    private FrameLayout getSheet() {
        FrameLayout frameLayout = this.sheet;
        if (frameLayout == null) {
            this.ensureContainerAndBehavior();
        }
        return this.sheet;
    }

    private static int getThemeResId(Context context, int n3, int n4, int n7) {
        if (n3 == 0) {
            boolean bl2;
            TypedValue typedValue = new TypedValue();
            boolean bl3 = (context = context.getTheme()).resolveAttribute(n4, typedValue, bl2 = true);
            n3 = bl3 ? typedValue.resourceId : n7;
        }
        return n3;
    }

    private /* synthetic */ void lambda$wrapInSheet$0(View view) {
        boolean bl2 = this.cancelable;
        if (bl2 && (bl2 = this.isShowing()) && (bl2 = this.shouldWindowCloseOnTouchOutside())) {
            this.cancel();
        }
    }

    private void maybeUpdateWindowAnimationsBasedOnLayoutDirection() {
        int n3;
        Object object;
        Window window = this.getWindow();
        if (window != null && (object = this.sheet) != null && (n3 = (object = object.getLayoutParams()) instanceof CoordinatorLayout$e) != 0) {
            object = (CoordinatorLayout$e)this.sheet.getLayoutParams();
            n3 = object.c;
            FrameLayout frameLayout = this.sheet;
            int n4 = frameLayout.getLayoutDirection();
            n3 = (n3 = Gravity.getAbsoluteGravity((int)n3, (int)n4)) == (n4 = 3) ? R$style.Animation_Material3_SideSheetDialog_Left : R$style.Animation_Material3_SideSheetDialog_Right;
            window.setWindowAnimations(n3);
        }
    }

    private boolean shouldWindowCloseOnTouchOutside() {
        boolean bl2 = this.canceledOnTouchOutsideSet;
        if (!bl2) {
            boolean bl3;
            Context context = this.getContext();
            int[] nArray = new int[]{16843611};
            context = context.obtainStyledAttributes(nArray);
            nArray = null;
            boolean bl4 = true;
            this.canceledOnTouchOutside = bl3 = context.getBoolean(0, bl4);
            context.recycle();
            this.canceledOnTouchOutsideSet = bl4;
        }
        return this.canceledOnTouchOutside;
    }

    private void updateListeningForBackCallbacks() {
        MaterialBackOrchestrator materialBackOrchestrator = this.backOrchestrator;
        if (materialBackOrchestrator == null) {
            return;
        }
        boolean bl2 = this.cancelable;
        if (bl2) {
            materialBackOrchestrator.startListeningForBackCallbacks();
        } else {
            materialBackOrchestrator.stopListeningForBackCallbacks();
        }
    }

    private View wrapInSheet(int n3, View object, ViewGroup.LayoutParams layoutParams) {
        this.ensureContainerAndBehavior();
        Object object2 = this.getContainer();
        int n4 = COORDINATOR_LAYOUT_ID;
        object2 = (CoordinatorLayout)object2.findViewById(n4);
        if (n3 != 0 && object == null) {
            object = this.getLayoutInflater();
            n4 = 0;
            object = object.inflate(n3, (ViewGroup)object2, false);
        }
        FrameLayout frameLayout = this.getSheet();
        frameLayout.removeAllViews();
        if (layoutParams == null) {
            frameLayout.addView(object);
        } else {
            frameLayout.addView(object, layoutParams);
        }
        n3 = TOUCH_OUTSIDE_ID;
        frameLayout = object2.findViewById(n3);
        object = new a(this);
        frameLayout.setOnClickListener((View.OnClickListener)object);
        frameLayout = this.getSheet();
        object = new SheetDialog$1(this);
        ViewCompat.s((View)frameLayout, (androidx.core.view.a)object);
        return this.container;
    }

    public abstract void addSheetCancelOnHideCallback(Sheet var1);

    public void cancel() {
        int n3;
        Sheet sheet = this.getBehavior();
        int n4 = this.dismissWithAnimation;
        if (n4 != 0 && (n4 = sheet.getState()) != (n3 = 5)) {
            sheet.setState(n3);
        } else {
            super.cancel();
        }
    }

    public Sheet getBehavior() {
        Sheet sheet = this.behavior;
        if (sheet == null) {
            this.ensureContainerAndBehavior();
        }
        return this.behavior;
    }

    public abstract Sheet getBehaviorFromSheet(FrameLayout var1);

    public abstract int getDialogId();

    public abstract int getLayoutResId();

    public abstract int getStateOnStart();

    public boolean isDismissWithSheetAnimationEnabled() {
        return this.dismissWithAnimation;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.maybeUpdateWindowAnimationsBasedOnLayoutDirection();
        this.updateListeningForBackCallbacks();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        bundle = this.getWindow();
        if (bundle != null) {
            int n3 = Build.VERSION.SDK_INT;
            bundle.setStatusBarColor(0);
            bundle.addFlags(-1 << -1);
            int n4 = 23;
            if (n3 < n4) {
                n3 = 0x4000000;
                bundle.addFlags(n3);
            }
            n3 = -1;
            bundle.setLayout(n3, n3);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        MaterialBackOrchestrator materialBackOrchestrator = this.backOrchestrator;
        if (materialBackOrchestrator != null) {
            materialBackOrchestrator.stopListeningForBackCallbacks();
        }
    }

    public void onStart() {
        int n3;
        int n4;
        super.onStart();
        Sheet sheet = this.behavior;
        if (sheet != null && (n4 = sheet.getState()) == (n3 = 5)) {
            sheet = this.behavior;
            n3 = this.getStateOnStart();
            sheet.setState(n3);
        }
    }

    public void setCancelable(boolean bl2) {
        Window window;
        super.setCancelable(bl2);
        boolean bl3 = this.cancelable;
        if (bl3 != bl2) {
            this.cancelable = bl2;
        }
        if ((window = this.getWindow()) != null) {
            this.updateListeningForBackCallbacks();
        }
    }

    public void setCanceledOnTouchOutside(boolean bl2) {
        boolean bl3;
        super.setCanceledOnTouchOutside(bl2);
        boolean bl4 = true;
        if (bl2 && !(bl3 = this.cancelable)) {
            this.cancelable = bl4;
        }
        this.canceledOnTouchOutside = bl2;
        this.canceledOnTouchOutsideSet = bl4;
    }

    public void setContentView(int n3) {
        View view = this.wrapInSheet(n3, null, null);
        super.setContentView(view);
    }

    public void setContentView(View view) {
        view = this.wrapInSheet(0, view, null);
        super.setContentView(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view = this.wrapInSheet(0, view, layoutParams);
        super.setContentView(view);
    }

    public void setDismissWithSheetAnimationEnabled(boolean bl2) {
        this.dismissWithAnimation = bl2;
    }

    public void setSheetEdge(int n3) {
        Object object = this.sheet;
        if (object != null) {
            boolean bl2 = object.isLaidOut();
            if (!bl2) {
                object = this.sheet.getLayoutParams();
                boolean bl3 = object instanceof CoordinatorLayout$e;
                if (bl3) {
                    object = (CoordinatorLayout$e)((Object)object);
                    object.c = n3;
                    this.maybeUpdateWindowAnimationsBasedOnLayoutDirection();
                }
                return;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Sheet view has been laid out; sheet edge cannot be changed once the sheet has been laid out.");
            throw illegalStateException;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Sheet view reference is null; sheet edge cannot be changed if the sheet view is null.");
        throw illegalStateException;
    }
}

