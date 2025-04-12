/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
 *  android.os.Bundle
 */
package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior$BottomSheetCallback;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment$BottomSheetDismissCallback;

public class BottomSheetDialogFragment
extends pn {
    private boolean waitingForDismissAllowingStateLoss;

    public BottomSheetDialogFragment() {
    }

    public BottomSheetDialogFragment(int n3) {
        super(n3);
    }

    public static /* synthetic */ void access$100(BottomSheetDialogFragment bottomSheetDialogFragment) {
        bottomSheetDialogFragment.dismissAfterAnimation();
    }

    private void dismissAfterAnimation() {
        boolean bl2 = this.waitingForDismissAllowingStateLoss;
        if (bl2) {
            super.dismissAllowingStateLoss();
        } else {
            super.dismiss();
        }
    }

    private void dismissWithAnimation(BottomSheetBehavior bottomSheetBehavior, boolean n3) {
        int n4;
        this.waitingForDismissAllowingStateLoss = n3;
        n3 = bottomSheetBehavior.getState();
        if (n3 == (n4 = 5)) {
            this.dismissAfterAnimation();
        } else {
            Object object = this.getDialog();
            n3 = object instanceof BottomSheetDialog;
            if (n3 != 0) {
                object = (BottomSheetDialog)this.getDialog();
                ((BottomSheetDialog)object).removeDefaultCallback();
            }
            object = new BottomSheetDialogFragment$BottomSheetDismissCallback(this, null);
            bottomSheetBehavior.addBottomSheetCallback((BottomSheetBehavior$BottomSheetCallback)object);
            bottomSheetBehavior.setState(n4);
        }
    }

    private boolean tryDismissWithAnimation(boolean bl2) {
        boolean bl3;
        BottomSheetBehavior bottomSheetBehavior;
        boolean bl4;
        Dialog dialog = this.getDialog();
        boolean bl5 = dialog instanceof BottomSheetDialog;
        if (bl5 && (bl4 = (bottomSheetBehavior = (dialog = (BottomSheetDialog)dialog).getBehavior()).isHideable()) && (bl3 = dialog.getDismissWithAnimation())) {
            this.dismissWithAnimation(bottomSheetBehavior, bl2);
            return true;
        }
        return false;
    }

    public void dismiss() {
        boolean bl2 = this.tryDismissWithAnimation(false);
        if (!bl2) {
            super.dismiss();
        }
    }

    public void dismissAllowingStateLoss() {
        boolean bl2 = this.tryDismissWithAnimation(true);
        if (!bl2) {
            super.dismissAllowingStateLoss();
        }
    }

    public Dialog onCreateDialog(Bundle object) {
        Context context = this.getContext();
        int n3 = this.getTheme();
        object = new BottomSheetDialog(context, n3);
        return object;
    }
}

