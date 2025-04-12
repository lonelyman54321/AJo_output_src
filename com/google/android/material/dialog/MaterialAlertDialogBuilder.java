/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.DialogInterface$OnCancelListener
 *  android.content.DialogInterface$OnClickListener
 *  android.content.DialogInterface$OnDismissListener
 *  android.content.DialogInterface$OnKeyListener
 *  android.content.DialogInterface$OnMultiChoiceClickListener
 *  android.content.res.ColorStateList
 *  android.content.res.Configuration
 *  android.content.res.Resources$Theme
 *  android.database.Cursor
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 *  android.view.View
 *  android.view.View$OnTouchListener
 *  android.widget.AdapterView$OnItemSelectedListener
 *  android.widget.ListAdapter
 */
package com.google.android.material.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import androidx.appcompat.app.f;
import androidx.appcompat.app.f$a;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewCompat$c;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.dialog.InsetDialogOnTouchListener;
import com.google.android.material.dialog.MaterialDialogs;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.util.WeakHashMap;

public class MaterialAlertDialogBuilder
extends f$a {
    private static final int DEF_STYLE_ATTR = R$attr.alertDialogStyle;
    private static final int DEF_STYLE_RES = R$style.MaterialAlertDialog_MaterialComponents;
    private static final int MATERIAL_ALERT_DIALOG_THEME_OVERLAY = R$attr.materialAlertDialogTheme;
    private Drawable background;
    private final Rect backgroundInsets;

    public MaterialAlertDialogBuilder(Context context) {
        this(context, 0);
    }

    public MaterialAlertDialogBuilder(Context context, int n3) {
        Rect rect;
        Context context2 = MaterialAlertDialogBuilder.createMaterialAlertDialogThemedContext(context);
        int n4 = MaterialAlertDialogBuilder.getOverridingThemeResId(context, n3);
        super(context2, n4);
        context = this.getContext();
        Resources.Theme theme = context.getTheme();
        int n7 = DEF_STYLE_ATTR;
        int bl2 = DEF_STYLE_RES;
        this.backgroundInsets = rect = MaterialDialogs.getDialogBackgroundInsets(context, n7, bl2);
        int n8 = R$attr.colorSurface;
        Object object = this.getClass().getCanonicalName();
        n8 = MaterialColors.getColor(context, n8, (String)object);
        object = R$styleable.MaterialAlertDialog;
        object = context.obtainStyledAttributes(null, (int[])object, n7, bl2);
        int n10 = R$styleable.MaterialAlertDialog_backgroundTint;
        n8 = object.getColor(n10, n8);
        object.recycle();
        object = new MaterialShapeDrawable(context, null, n7, bl2);
        ((MaterialShapeDrawable)object).initializeElevationOverlay(context);
        context = ColorStateList.valueOf((int)n8);
        ((MaterialShapeDrawable)object).setFillColor((ColorStateList)context);
        n4 = Build.VERSION.SDK_INT;
        n7 = 28;
        if (n4 >= n7) {
            super();
            boolean bl3 = true;
            theme.resolveAttribute(16844145, (TypedValue)context, bl3);
            theme = this.getContext().getResources().getDisplayMetrics();
            float f5 = context.getDimension((DisplayMetrics)theme);
            n4 = context.type;
            n7 = 5;
            if (n4 == n7) {
                context = null;
                float f6 = f5 - 0.0f;
                n4 = (int)(f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1));
                if (n4 >= 0) {
                    ((MaterialShapeDrawable)object).setCornerSize(f5);
                }
            }
        }
        this.background = object;
    }

    private static Context createMaterialAlertDialogThemedContext(Context context) {
        int n3 = MaterialAlertDialogBuilder.getMaterialAlertDialogThemeOverlay(context);
        int n4 = DEF_STYLE_ATTR;
        int n7 = DEF_STYLE_RES;
        context = MaterialThemeOverlay.wrap(context, null, n4, n7);
        if (n3 == 0) {
            return context;
        }
        d80 d802 = new d80(context, n3);
        return d802;
    }

    private static int getMaterialAlertDialogThemeOverlay(Context context) {
        int n3 = MATERIAL_ALERT_DIALOG_THEME_OVERLAY;
        if ((context = MaterialAttributes.resolve(context, n3)) == null) {
            return 0;
        }
        return context.data;
    }

    private static int getOverridingThemeResId(Context context, int n3) {
        if (n3 == 0) {
            n3 = MaterialAlertDialogBuilder.getMaterialAlertDialogThemeOverlay(context);
        }
        return n3;
    }

    public f create() {
        WeakHashMap weakHashMap;
        f f5 = super.create();
        Object object = f5.getWindow();
        View view = object.getDecorView();
        Drawable drawable2 = this.background;
        boolean bl2 = drawable2 instanceof MaterialShapeDrawable;
        if (bl2) {
            drawable2 = (MaterialShapeDrawable)drawable2;
            weakHashMap = ViewCompat.a;
            float f6 = ViewCompat$c.e(view);
            drawable2.setElevation(f6);
        }
        drawable2 = this.background;
        weakHashMap = this.backgroundInsets;
        drawable2 = MaterialDialogs.insetDrawable(drawable2, (Rect)weakHashMap);
        object.setBackgroundDrawable(drawable2);
        drawable2 = this.backgroundInsets;
        object = new InsetDialogOnTouchListener(f5, (Rect)drawable2);
        view.setOnTouchListener((View.OnTouchListener)object);
        return f5;
    }

    public Drawable getBackground() {
        return this.background;
    }

    public MaterialAlertDialogBuilder setAdapter(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder)super.setAdapter(listAdapter, onClickListener);
    }

    public MaterialAlertDialogBuilder setBackground(Drawable drawable2) {
        this.background = drawable2;
        return this;
    }

    public MaterialAlertDialogBuilder setBackgroundInsetBottom(int n3) {
        this.backgroundInsets.bottom = n3;
        return this;
    }

    public MaterialAlertDialogBuilder setBackgroundInsetEnd(int n3) {
        int n4;
        Configuration configuration = this.getContext().getResources().getConfiguration();
        int n7 = configuration.getLayoutDirection();
        if (n7 == (n4 = 1)) {
            configuration = this.backgroundInsets;
            configuration.left = n3;
        } else {
            configuration = this.backgroundInsets;
            configuration.right = n3;
        }
        return this;
    }

    public MaterialAlertDialogBuilder setBackgroundInsetStart(int n3) {
        int n4;
        Configuration configuration = this.getContext().getResources().getConfiguration();
        int n7 = configuration.getLayoutDirection();
        if (n7 == (n4 = 1)) {
            configuration = this.backgroundInsets;
            configuration.right = n3;
        } else {
            configuration = this.backgroundInsets;
            configuration.left = n3;
        }
        return this;
    }

    public MaterialAlertDialogBuilder setBackgroundInsetTop(int n3) {
        this.backgroundInsets.top = n3;
        return this;
    }

    public MaterialAlertDialogBuilder setCancelable(boolean bl2) {
        return (MaterialAlertDialogBuilder)super.setCancelable(bl2);
    }

    public MaterialAlertDialogBuilder setCursor(Cursor cursor, DialogInterface.OnClickListener onClickListener, String string2) {
        return (MaterialAlertDialogBuilder)super.setCursor(cursor, onClickListener, string2);
    }

    public MaterialAlertDialogBuilder setCustomTitle(View view) {
        return (MaterialAlertDialogBuilder)super.setCustomTitle(view);
    }

    public MaterialAlertDialogBuilder setIcon(int n3) {
        return (MaterialAlertDialogBuilder)super.setIcon(n3);
    }

    public MaterialAlertDialogBuilder setIcon(Drawable drawable2) {
        return (MaterialAlertDialogBuilder)super.setIcon(drawable2);
    }

    public MaterialAlertDialogBuilder setIconAttribute(int n3) {
        return (MaterialAlertDialogBuilder)super.setIconAttribute(n3);
    }

    public MaterialAlertDialogBuilder setItems(int n3, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder)super.setItems(n3, onClickListener);
    }

    public MaterialAlertDialogBuilder setItems(CharSequence[] charSequenceArray, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder)super.setItems(charSequenceArray, onClickListener);
    }

    public MaterialAlertDialogBuilder setMessage(int n3) {
        return (MaterialAlertDialogBuilder)super.setMessage(n3);
    }

    public MaterialAlertDialogBuilder setMessage(CharSequence charSequence) {
        return (MaterialAlertDialogBuilder)super.setMessage(charSequence);
    }

    public MaterialAlertDialogBuilder setMultiChoiceItems(int n3, boolean[] blArray, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (MaterialAlertDialogBuilder)super.setMultiChoiceItems(n3, blArray, onMultiChoiceClickListener);
    }

    public MaterialAlertDialogBuilder setMultiChoiceItems(Cursor cursor, String string2, String string3, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (MaterialAlertDialogBuilder)super.setMultiChoiceItems(cursor, string2, string3, onMultiChoiceClickListener);
    }

    public MaterialAlertDialogBuilder setMultiChoiceItems(CharSequence[] charSequenceArray, boolean[] blArray, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (MaterialAlertDialogBuilder)super.setMultiChoiceItems(charSequenceArray, blArray, onMultiChoiceClickListener);
    }

    public MaterialAlertDialogBuilder setNegativeButton(int n3, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder)super.setNegativeButton(n3, onClickListener);
    }

    public MaterialAlertDialogBuilder setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder)super.setNegativeButton(charSequence, onClickListener);
    }

    public MaterialAlertDialogBuilder setNegativeButtonIcon(Drawable drawable2) {
        return (MaterialAlertDialogBuilder)super.setNegativeButtonIcon(drawable2);
    }

    public MaterialAlertDialogBuilder setNeutralButton(int n3, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder)super.setNeutralButton(n3, onClickListener);
    }

    public MaterialAlertDialogBuilder setNeutralButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder)super.setNeutralButton(charSequence, onClickListener);
    }

    public MaterialAlertDialogBuilder setNeutralButtonIcon(Drawable drawable2) {
        return (MaterialAlertDialogBuilder)super.setNeutralButtonIcon(drawable2);
    }

    public MaterialAlertDialogBuilder setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        return (MaterialAlertDialogBuilder)super.setOnCancelListener(onCancelListener);
    }

    public MaterialAlertDialogBuilder setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        return (MaterialAlertDialogBuilder)super.setOnDismissListener(onDismissListener);
    }

    public MaterialAlertDialogBuilder setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        return (MaterialAlertDialogBuilder)super.setOnItemSelectedListener(onItemSelectedListener);
    }

    public MaterialAlertDialogBuilder setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
        return (MaterialAlertDialogBuilder)super.setOnKeyListener(onKeyListener);
    }

    public MaterialAlertDialogBuilder setPositiveButton(int n3, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder)super.setPositiveButton(n3, onClickListener);
    }

    public MaterialAlertDialogBuilder setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder)super.setPositiveButton(charSequence, onClickListener);
    }

    public MaterialAlertDialogBuilder setPositiveButtonIcon(Drawable drawable2) {
        return (MaterialAlertDialogBuilder)super.setPositiveButtonIcon(drawable2);
    }

    public MaterialAlertDialogBuilder setSingleChoiceItems(int n3, int n4, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder)super.setSingleChoiceItems(n3, n4, onClickListener);
    }

    public MaterialAlertDialogBuilder setSingleChoiceItems(Cursor cursor, int n3, String string2, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder)super.setSingleChoiceItems(cursor, n3, string2, onClickListener);
    }

    public MaterialAlertDialogBuilder setSingleChoiceItems(ListAdapter listAdapter, int n3, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder)super.setSingleChoiceItems(listAdapter, n3, onClickListener);
    }

    public MaterialAlertDialogBuilder setSingleChoiceItems(CharSequence[] charSequenceArray, int n3, DialogInterface.OnClickListener onClickListener) {
        return (MaterialAlertDialogBuilder)super.setSingleChoiceItems(charSequenceArray, n3, onClickListener);
    }

    public MaterialAlertDialogBuilder setTitle(int n3) {
        return (MaterialAlertDialogBuilder)super.setTitle(n3);
    }

    public MaterialAlertDialogBuilder setTitle(CharSequence charSequence) {
        return (MaterialAlertDialogBuilder)super.setTitle(charSequence);
    }

    public MaterialAlertDialogBuilder setView(int n3) {
        return (MaterialAlertDialogBuilder)super.setView(n3);
    }

    public MaterialAlertDialogBuilder setView(View view) {
        return (MaterialAlertDialogBuilder)super.setView(view);
    }
}

