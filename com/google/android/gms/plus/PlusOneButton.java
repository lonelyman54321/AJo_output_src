/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.FrameLayout
 */
package com.google.android.gms.plus;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ViewUtils;
import com.google.android.gms.plus.PlusOneButton$DefaultOnPlusOneClickListener;
import com.google.android.gms.plus.PlusOneButton$OnPlusOneClickListener;
import com.google.android.gms.plus.internal.zzm;

public final class PlusOneButton
extends FrameLayout {
    public static final int ANNOTATION_BUBBLE = 1;
    public static final int ANNOTATION_INLINE = 2;
    public static final int ANNOTATION_NONE = 0;
    public static final int DEFAULT_ACTIVITY_REQUEST_CODE = 255;
    public static final int SIZE_MEDIUM = 1;
    public static final int SIZE_SMALL = 0;
    public static final int SIZE_STANDARD = 3;
    public static final int SIZE_TALL = 2;
    private int mSize;
    private View zzi;
    private int zzj;
    private String zzk;
    private int zzl;
    private PlusOneButton$OnPlusOneClickListener zzm;

    public PlusOneButton(Context context) {
        this(context, null);
    }

    public PlusOneButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int n3;
        int n4;
        this.mSize = n4 = PlusOneButton.getSize(context, attributeSet);
        this.zzj = n3 = PlusOneButton.getAnnotation(context, attributeSet);
        this.zzl = -1;
        context = this.getContext();
        this.zza(context);
        this.isInEditMode();
    }

    public static int getAnnotation(Context object, AttributeSet object2) {
        object2 = "INLINE";
        String string2 = "http://schemas.android.com/apk/lib/com.google.android.gms.plus";
        String string3 = "annotation";
        boolean bl2 = true;
        String string4 = "PlusOneButton";
        boolean bl3 = ((String)object2).equalsIgnoreCase((String)(object = ViewUtils.getXmlAttributeString(string2, string3, object, (AttributeSet)object2, bl2, false, string4)));
        if (bl3) {
            return 2;
        }
        object2 = "NONE";
        boolean bl4 = ((String)object2).equalsIgnoreCase((String)object);
        if (bl4) {
            return 0;
        }
        return 1;
    }

    public static int getSize(Context object, AttributeSet object2) {
        object2 = "SMALL";
        String string2 = "http://schemas.android.com/apk/lib/com.google.android.gms.plus";
        String string3 = "size";
        boolean bl2 = true;
        String string4 = "PlusOneButton";
        boolean bl3 = ((String)object2).equalsIgnoreCase((String)(object = ViewUtils.getXmlAttributeString(string2, string3, object, (AttributeSet)object2, bl2, false, string4)));
        if (bl3) {
            return 0;
        }
        object2 = "MEDIUM";
        bl3 = ((String)object2).equalsIgnoreCase((String)object);
        if (bl3) {
            return 1;
        }
        object2 = "TALL";
        boolean bl4 = ((String)object2).equalsIgnoreCase((String)object);
        if (bl4) {
            return 2;
        }
        return 3;
    }

    public static /* synthetic */ View zza(PlusOneButton plusOneButton) {
        return plusOneButton.zzi;
    }

    private final void zza(Context object) {
        View view = this.zzi;
        if (view != null) {
            this.removeView(view);
        }
        int n3 = this.mSize;
        int n4 = this.zzj;
        String string2 = this.zzk;
        int n7 = this.zzl;
        object = com.google.android.gms.plus.internal.zzm.zza(object, n3, n4, string2, n7);
        this.zzi = object;
        object = this.zzm;
        this.setOnPlusOneClickListener((PlusOneButton$OnPlusOneClickListener)object);
        object = this.zzi;
        this.addView((View)object);
    }

    public static /* synthetic */ int zzb(PlusOneButton plusOneButton) {
        return plusOneButton.zzl;
    }

    public final void initialize(String string2, int n3) {
        Preconditions.checkState(this.getContext() instanceof Activity, "To use this method, the PlusOneButton must be placed in an Activity. Use initialize(String, OnPlusOneClickListener).");
        this.zzk = string2;
        this.zzl = n3;
        string2 = this.getContext();
        this.zza((Context)string2);
    }

    public final void initialize(String string2, PlusOneButton$OnPlusOneClickListener plusOneButton$OnPlusOneClickListener) {
        this.zzk = string2;
        this.zzl = 0;
        string2 = this.getContext();
        this.zza((Context)string2);
        this.setOnPlusOneClickListener(plusOneButton$OnPlusOneClickListener);
    }

    public final void onLayout(boolean bl2, int n3, int n4, int n7, int n8) {
        View view = this.zzi;
        view.layout(0, 0, n7 -= n3, n8 -= n4);
    }

    public final void onMeasure(int n3, int n4) {
        View view = this.zzi;
        this.measureChild(view, n3, n4);
        n3 = view.getMeasuredWidth();
        n4 = view.getMeasuredHeight();
        this.setMeasuredDimension(n3, n4);
    }

    public final void plusOneClick() {
        this.zzi.performClick();
    }

    public final void setAnnotation(int n3) {
        this.zzj = n3;
        Context context = this.getContext();
        this.zza(context);
    }

    public final void setIntent(Intent intent) {
        this.zzi.setTag((Object)intent);
    }

    public final void setOnPlusOneClickListener(PlusOneButton$OnPlusOneClickListener plusOneButton$OnPlusOneClickListener) {
        this.zzm = plusOneButton$OnPlusOneClickListener;
        View view = this.zzi;
        PlusOneButton$DefaultOnPlusOneClickListener plusOneButton$DefaultOnPlusOneClickListener = new PlusOneButton$DefaultOnPlusOneClickListener(this, plusOneButton$OnPlusOneClickListener);
        view.setOnClickListener((View.OnClickListener)plusOneButton$DefaultOnPlusOneClickListener);
    }

    public final void setSize(int n3) {
        this.mSize = n3;
        Context context = this.getContext();
        this.zza(context);
    }
}

