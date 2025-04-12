/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.DatePickerDialog
 *  android.app.DatePickerDialog$OnDateSetListener
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.os.Bundle
 *  android.view.View$OnTouchListener
 */
package com.google.android.material.datepicker;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import com.google.android.material.dialog.InsetDialogOnTouchListener;
import com.google.android.material.dialog.MaterialDialogs;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.shape.MaterialShapeDrawable;

public class MaterialStyledDatePickerDialog
extends DatePickerDialog {
    private static final int DEF_STYLE_ATTR = 16843612;
    private static final int DEF_STYLE_RES = R$style.MaterialAlertDialog_MaterialComponents_Picker_Date_Spinner;
    private final Drawable background;
    private final Rect backgroundInsets;

    public MaterialStyledDatePickerDialog(Context context) {
        this(context, 0);
    }

    public MaterialStyledDatePickerDialog(Context context, int n3) {
        this(context, n3, null, -1, -1, -1);
    }

    public MaterialStyledDatePickerDialog(Context context, int n3, DatePickerDialog.OnDateSetListener object, int n4, int n7, int n8) {
        super(context, n3, (DatePickerDialog.OnDateSetListener)object, n4, n7, n8);
        context = this.getContext();
        Context context2 = this.getContext();
        int n10 = R$attr.colorSurface;
        String string2 = ((Object)((Object)this)).getClass().getCanonicalName();
        n3 = MaterialAttributes.resolveOrThrow(context2, n10, string2);
        n4 = DEF_STYLE_RES;
        n8 = 16843612;
        super(context, null, n8, n4);
        context2 = ColorStateList.valueOf((int)n3);
        ((MaterialShapeDrawable)object).setFillColor((ColorStateList)context2);
        context = MaterialDialogs.getDialogBackgroundInsets(context, n8, n4);
        this.backgroundInsets = context;
        context = MaterialDialogs.insetDrawable((Drawable)object, (Rect)context);
        this.background = context;
    }

    public MaterialStyledDatePickerDialog(Context context, DatePickerDialog.OnDateSetListener onDateSetListener, int n3, int n4, int n7) {
        this(context, 0, onDateSetListener, n3, n4, n7);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        bundle = this.getWindow();
        Object object = this.background;
        bundle.setBackgroundDrawable(object);
        bundle = this.getWindow().getDecorView();
        Rect rect = this.backgroundInsets;
        object = new InsetDialogOnTouchListener((Dialog)this, rect);
        bundle.setOnTouchListener((View.OnTouchListener)object);
    }
}

