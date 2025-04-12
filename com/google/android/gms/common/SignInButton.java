/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.FrameLayout
 */
package com.google.android.gms.common;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.base.R$styleable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zaaa;
import com.google.android.gms.common.internal.zaz;
import com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException;

public final class SignInButton
extends FrameLayout
implements View.OnClickListener {
    public static final int COLOR_AUTO = 2;
    public static final int COLOR_DARK = 0;
    public static final int COLOR_LIGHT = 1;
    public static final int SIZE_ICON_ONLY = 2;
    public static final int SIZE_STANDARD = 0;
    public static final int SIZE_WIDE = 1;
    private int zaa;
    private int zab;
    private View zac;
    private View.OnClickListener zad;

    public SignInButton(Context context) {
        this(context, null);
    }

    public SignInButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SignInButton(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
        n3 = 0;
        this.zad = null;
        context = context.getTheme();
        int[] nArray = R$styleable.SignInButton;
        context = context.obtainStyledAttributes(attributeSet, nArray, 0, 0);
        try {
            int n4 = R$styleable.SignInButton_buttonSize;
            this.zaa = n4 = context.getInt(n4, 0);
            n4 = R$styleable.SignInButton_colorScheme;
            n3 = 2;
            this.zab = n4 = context.getInt(n4, n3);
            int n7 = this.zaa;
            n4 = this.zab;
            this.setStyle(n7, n4);
            return;
        }
        finally {
            context.recycle();
        }
    }

    private final void zaa(Context context) {
        View view = this.zac;
        if (view != null) {
            this.removeView(view);
        }
        int bl2 = this.zaa;
        int n3 = this.zab;
        view = zaz.zaa(context, bl2, n3);
        try {
            this.zac = view;
        }
        catch (RemoteCreator$RemoteCreatorException remoteCreator$RemoteCreatorException) {
            int n4 = this.zaa;
            n3 = this.zab;
            zaaa zaaa2 = new zaaa(context, null);
            context = context.getResources();
            zaaa2.zaa((Resources)context, n4, n3);
            this.zac = zaaa2;
        }
        context = this.zac;
        this.addView((View)context);
        context = this.zac;
        boolean bl3 = this.isEnabled();
        context.setEnabled(bl3);
        this.zac.setOnClickListener((View.OnClickListener)this);
    }

    public void onClick(View view) {
        View view2;
        View.OnClickListener onClickListener = this.zad;
        if (onClickListener != null && view == (view2 = this.zac)) {
            onClickListener.onClick((View)this);
        }
    }

    public void setColorScheme(int n3) {
        int n4 = this.zaa;
        this.setStyle(n4, n3);
    }

    public void setEnabled(boolean bl2) {
        super.setEnabled(bl2);
        this.zac.setEnabled(bl2);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.zad = onClickListener;
        onClickListener = this.zac;
        if (onClickListener != null) {
            onClickListener.setOnClickListener((View.OnClickListener)this);
        }
    }

    public void setScopes(Scope[] scopeArray) {
        int n3 = this.zaa;
        int n4 = this.zab;
        this.setStyle(n3, n4);
    }

    public void setSize(int n3) {
        int n4 = this.zab;
        this.setStyle(n3, n4);
    }

    public void setStyle(int n3, int n4) {
        this.zaa = n3;
        this.zab = n4;
        Context context = this.getContext();
        this.zaa(context);
    }

    public void setStyle(int n3, int n4, Scope[] scopeArray) {
        this.setStyle(n3, n4);
    }
}

