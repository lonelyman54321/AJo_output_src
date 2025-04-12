/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.DialogInterface$OnCancelListener
 *  android.graphics.Color
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.util.TypedValue
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnTouchListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.Window
 *  android.widget.FrameLayout
 */
package com.google.android.material.bottomsheet;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewCompat$c;
import androidx.core.view.a;
import com.google.android.material.R$attr;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import com.google.android.material.R$style;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior$BottomSheetCallback;
import com.google.android.material.bottomsheet.BottomSheetDialog$1;
import com.google.android.material.bottomsheet.BottomSheetDialog$2;
import com.google.android.material.bottomsheet.BottomSheetDialog$3;
import com.google.android.material.bottomsheet.BottomSheetDialog$4;
import com.google.android.material.bottomsheet.BottomSheetDialog$5;
import com.google.android.material.bottomsheet.BottomSheetDialog$EdgeToEdgeCallback;
import com.google.android.material.motion.MaterialBackHandler;
import com.google.android.material.motion.MaterialBackOrchestrator;

public class BottomSheetDialog
extends on {
    private MaterialBackOrchestrator backOrchestrator;
    private BottomSheetBehavior behavior;
    private FrameLayout bottomSheet;
    private BottomSheetBehavior$BottomSheetCallback bottomSheetCallback;
    boolean cancelable;
    private boolean canceledOnTouchOutside;
    private boolean canceledOnTouchOutsideSet;
    private FrameLayout container;
    private CoordinatorLayout coordinator;
    boolean dismissWithAnimation;
    private BottomSheetDialog$EdgeToEdgeCallback edgeToEdgeCallback;
    private boolean edgeToEdgeEnabled;

    public BottomSheetDialog(Context context) {
        this(context, 0);
        boolean bl2;
        context = this.getContext().getTheme();
        int n3 = R$attr.enableEdgeToEdge;
        int[] nArray = new int[]{n3};
        this.edgeToEdgeEnabled = bl2 = context.obtainStyledAttributes(nArray).getBoolean(0, false);
    }

    public BottomSheetDialog(Context context, int n3) {
        n3 = BottomSheetDialog.getThemeResId(context, n3);
        super(context, n3);
        int n4 = 1;
        this.cancelable = n4;
        this.canceledOnTouchOutside = n4;
        Object object = new BottomSheetDialog$5(this);
        this.bottomSheetCallback = object;
        this.supportRequestWindowFeature(n4);
        context = this.getContext().getTheme();
        n3 = R$attr.enableEdgeToEdge;
        object = new int[]{n3};
        n4 = (int)(context.obtainStyledAttributes((int[])object).getBoolean(0, false) ? 1 : 0);
        this.edgeToEdgeEnabled = n4;
    }

    public BottomSheetDialog(Context context, boolean bl2, DialogInterface.OnCancelListener object) {
        super(context, bl2, (DialogInterface.OnCancelListener)bottomSheetDialog$5);
        BottomSheetDialog$5 bottomSheetDialog$5;
        int n3 = 1;
        this.cancelable = n3;
        this.canceledOnTouchOutside = n3;
        bottomSheetDialog$5 = new BottomSheetDialog$5(this);
        this.bottomSheetCallback = bottomSheetDialog$5;
        this.supportRequestWindowFeature(n3);
        this.cancelable = bl2;
        context = this.getContext().getTheme();
        int n4 = R$attr.enableEdgeToEdge;
        int[] nArray = new int[]{n4};
        n3 = (int)(context.obtainStyledAttributes(nArray).getBoolean(0, false) ? 1 : 0);
        this.edgeToEdgeEnabled = n3;
    }

    public static /* synthetic */ BottomSheetDialog$EdgeToEdgeCallback access$000(BottomSheetDialog bottomSheetDialog) {
        return bottomSheetDialog.edgeToEdgeCallback;
    }

    public static /* synthetic */ BottomSheetDialog$EdgeToEdgeCallback access$002(BottomSheetDialog bottomSheetDialog, BottomSheetDialog$EdgeToEdgeCallback bottomSheetDialog$EdgeToEdgeCallback) {
        bottomSheetDialog.edgeToEdgeCallback = bottomSheetDialog$EdgeToEdgeCallback;
        return bottomSheetDialog$EdgeToEdgeCallback;
    }

    public static /* synthetic */ BottomSheetBehavior access$100(BottomSheetDialog bottomSheetDialog) {
        return bottomSheetDialog.behavior;
    }

    public static /* synthetic */ FrameLayout access$200(BottomSheetDialog bottomSheetDialog) {
        return bottomSheetDialog.bottomSheet;
    }

    private FrameLayout ensureContainerAndBehavior() {
        Object object = this.container;
        if (object == null) {
            object = this.getContext();
            int bl2 = R$layout.design_bottom_sheet_dialog;
            object = (FrameLayout)View.inflate((Context)object, (int)bl2, null);
            this.container = object;
            int n3 = R$id.coordinator;
            object = (CoordinatorLayout)object.findViewById(n3);
            this.coordinator = object;
            object = this.container;
            int n4 = R$id.design_bottom_sheet;
            object = (FrameLayout)object.findViewById(n4);
            this.bottomSheet = object;
            object = BottomSheetBehavior.from((View)object);
            this.behavior = object;
            Object object2 = this.bottomSheetCallback;
            ((BottomSheetBehavior)object).addBottomSheetCallback((BottomSheetBehavior$BottomSheetCallback)object2);
            object = this.behavior;
            boolean bl3 = this.cancelable;
            ((BottomSheetBehavior)object).setHideable(bl3);
            object2 = this.behavior;
            FrameLayout frameLayout = this.bottomSheet;
            this.backOrchestrator = object = new MaterialBackOrchestrator((MaterialBackHandler)object2, (View)frameLayout);
        }
        return this.container;
    }

    private static int getThemeResId(Context context, int n3) {
        if (n3 == 0) {
            boolean bl2;
            int n4;
            TypedValue typedValue = new TypedValue();
            boolean bl3 = (context = context.getTheme()).resolveAttribute(n4 = R$attr.bottomSheetDialogTheme, typedValue, bl2 = true);
            n3 = bl3 ? typedValue.resourceId : R$style.Theme_Design_Light_BottomSheetDialog;
        }
        return n3;
    }

    /*
     * WARNING - void declaration
     */
    public static void setLightStatusBar(View view, boolean bl2) {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 23;
        if (n3 >= n4) {
            void var1_4;
            n3 = view.getSystemUiVisibility();
            if (bl2) {
                int n7 = n3 | 0x2000;
            } else {
                int n8 = n3 & 0xFFFFDFFF;
            }
            view.setSystemUiVisibility((int)var1_4);
        }
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

    private View wrapInBottomSheet(int n3, View object, ViewGroup.LayoutParams layoutParams) {
        FrameLayout frameLayout;
        BottomSheetDialog$1 bottomSheetDialog$1;
        this.ensureContainerAndBehavior();
        Object object2 = this.container;
        int n4 = R$id.coordinator;
        object2 = (CoordinatorLayout)object2.findViewById(n4);
        if (n3 != 0 && object == null) {
            object = this.getLayoutInflater();
            n4 = 0;
            bottomSheetDialog$1 = null;
            object = object.inflate(n3, (ViewGroup)object2, false);
        }
        if ((n3 = (int)(this.edgeToEdgeEnabled ? 1 : 0)) != 0) {
            frameLayout = this.bottomSheet;
            bottomSheetDialog$1 = new BottomSheetDialog$1(this);
            ViewCompat$c.o((View)frameLayout, bottomSheetDialog$1);
        }
        frameLayout = this.bottomSheet;
        frameLayout.removeAllViews();
        if (layoutParams == null) {
            frameLayout = this.bottomSheet;
            frameLayout.addView(object);
        } else {
            frameLayout = this.bottomSheet;
            frameLayout.addView(object, layoutParams);
        }
        n3 = R$id.touch_outside;
        frameLayout = object2.findViewById(n3);
        object = new BottomSheetDialog$2(this);
        frameLayout.setOnClickListener((View.OnClickListener)object);
        frameLayout = this.bottomSheet;
        object = new BottomSheetDialog$3(this);
        ViewCompat.s((View)frameLayout, (a)object);
        frameLayout = this.bottomSheet;
        object = new BottomSheetDialog$4(this);
        frameLayout.setOnTouchListener((View.OnTouchListener)object);
        return this.container;
    }

    public void cancel() {
        int n3;
        BottomSheetBehavior bottomSheetBehavior = this.getBehavior();
        int n4 = this.dismissWithAnimation;
        if (n4 != 0 && (n4 = bottomSheetBehavior.getState()) != (n3 = 5)) {
            bottomSheetBehavior.setState(n3);
        } else {
            super.cancel();
        }
    }

    public BottomSheetBehavior getBehavior() {
        BottomSheetBehavior bottomSheetBehavior = this.behavior;
        if (bottomSheetBehavior == null) {
            this.ensureContainerAndBehavior();
        }
        return this.behavior;
    }

    public boolean getDismissWithAnimation() {
        return this.dismissWithAnimation;
    }

    public boolean getEdgeToEdgeEnabled() {
        return this.edgeToEdgeEnabled;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = this.getWindow();
        if (window != null) {
            BottomSheetDialog$EdgeToEdgeCallback bottomSheetDialog$EdgeToEdgeCallback;
            int n3;
            int n4 = this.edgeToEdgeEnabled;
            int n7 = 1;
            if (n4 != 0 && (n4 = Color.alpha((int)window.getNavigationBarColor())) < (n3 = 255)) {
                n4 = 1;
            } else {
                n4 = 0;
                bottomSheetDialog$EdgeToEdgeCallback = null;
            }
            Object object = this.container;
            if (object != null) {
                boolean bl2 = n4 ^ 1;
                object.setFitsSystemWindows(bl2);
            }
            if ((object = this.coordinator) != null) {
                boolean bl2 = n4 ^ 1;
                ((CoordinatorLayout)object).setFitsSystemWindows(bl2);
            }
            ag3_1.a(window, (n4 ^= n7) != 0);
            bottomSheetDialog$EdgeToEdgeCallback = this.edgeToEdgeCallback;
            if (bottomSheetDialog$EdgeToEdgeCallback != null) {
                bottomSheetDialog$EdgeToEdgeCallback.setWindow(window);
            }
        }
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
        Object object = this.edgeToEdgeCallback;
        if (object != null) {
            ((BottomSheetDialog$EdgeToEdgeCallback)object).setWindow(null);
        }
        if ((object = this.backOrchestrator) != null) {
            ((MaterialBackOrchestrator)object).stopListeningForBackCallbacks();
        }
    }

    public void onStart() {
        int n3;
        int n4;
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.behavior;
        if (bottomSheetBehavior != null && (n4 = bottomSheetBehavior.getState()) == (n3 = 5)) {
            bottomSheetBehavior = this.behavior;
            n3 = 4;
            bottomSheetBehavior.setState(n3);
        }
    }

    public void removeDefaultCallback() {
        BottomSheetBehavior bottomSheetBehavior = this.behavior;
        BottomSheetBehavior$BottomSheetCallback bottomSheetBehavior$BottomSheetCallback = this.bottomSheetCallback;
        bottomSheetBehavior.removeBottomSheetCallback(bottomSheetBehavior$BottomSheetCallback);
    }

    public void setCancelable(boolean bl2) {
        super.setCancelable(bl2);
        boolean bl3 = this.cancelable;
        if (bl3 != bl2) {
            Window window;
            this.cancelable = bl2;
            BottomSheetBehavior bottomSheetBehavior = this.behavior;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.setHideable(bl2);
            }
            if ((window = this.getWindow()) != null) {
                this.updateListeningForBackCallbacks();
            }
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
        View view = this.wrapInBottomSheet(n3, null, null);
        super.setContentView(view);
    }

    public void setContentView(View view) {
        view = this.wrapInBottomSheet(0, view, null);
        super.setContentView(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view = this.wrapInBottomSheet(0, view, layoutParams);
        super.setContentView(view);
    }

    public void setDismissWithAnimation(boolean bl2) {
        this.dismissWithAnimation = bl2;
    }

    public boolean shouldWindowCloseOnTouchOutside() {
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
}

