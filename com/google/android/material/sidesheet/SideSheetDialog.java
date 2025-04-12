/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.widget.FrameLayout
 */
package com.google.android.material.sidesheet;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.R$attr;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import com.google.android.material.R$style;
import com.google.android.material.sidesheet.Sheet;
import com.google.android.material.sidesheet.SheetDialog;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.sidesheet.SideSheetDialog$1;

public class SideSheetDialog
extends SheetDialog {
    private static final int SIDE_SHEET_DIALOG_DEFAULT_THEME_RES;
    private static final int SIDE_SHEET_DIALOG_THEME_ATTR;

    static {
        SIDE_SHEET_DIALOG_THEME_ATTR = R$attr.sideSheetDialogTheme;
        SIDE_SHEET_DIALOG_DEFAULT_THEME_RES = R$style.Theme_Material3_Light_SideSheetDialog;
    }

    public SideSheetDialog(Context context) {
        this(context, 0);
    }

    public SideSheetDialog(Context context, int n3) {
        int n4 = SIDE_SHEET_DIALOG_THEME_ATTR;
        int n7 = SIDE_SHEET_DIALOG_DEFAULT_THEME_RES;
        super(context, n3, n4, n7);
    }

    public void addSheetCancelOnHideCallback(Sheet sheet) {
        SideSheetDialog$1 sideSheetDialog$1 = new SideSheetDialog$1(this);
        sheet.addCallback(sideSheetDialog$1);
    }

    public SideSheetBehavior getBehavior() {
        Object object = super.getBehavior();
        boolean bl2 = object instanceof SideSheetBehavior;
        if (bl2) {
            return (SideSheetBehavior)object;
        }
        object = new IllegalStateException("The view is not associated with SideSheetBehavior");
        throw object;
    }

    public Sheet getBehaviorFromSheet(FrameLayout frameLayout) {
        return SideSheetBehavior.from((View)frameLayout);
    }

    public int getDialogId() {
        return R$id.m3_side_sheet;
    }

    public int getLayoutResId() {
        return R$layout.m3_side_sheet_dialog;
    }

    public int getStateOnStart() {
        return 3;
    }
}

