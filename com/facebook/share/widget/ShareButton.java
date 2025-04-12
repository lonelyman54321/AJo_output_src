/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Fragment
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 */
package com.facebook.share.widget;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.facebook.common.R$drawable;
import com.facebook.share.R$style;
import com.facebook.share.widget.ShareButtonBase;
import kotlin.jvm.internal.Intrinsics;

public final class ShareButton
extends ShareButtonBase {
    public ShareButton(Context context) {
        super(context, null, 0, "fb_share_button_create", "fb_share_button_did_tap");
    }

    public ShareButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, "fb_share_button_create", "fb_share_button_did_tap");
    }

    public ShareButton(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3, "fb_share_button_create", "fb_share_button_did_tap");
    }

    public final void a(Context context, AttributeSet attributeSet, int n3, int n4) {
        super.a(context, attributeSet, n3, n4);
        context = this.getContext();
        int n7 = R$drawable.com_facebook_button_icon;
        context = xn.a(context, n7);
        this.setCompoundDrawablesWithIntrinsicBounds((Drawable)context, null, null, null);
    }

    public int getDefaultRequestCode() {
        return dK$c.Share.toRequestCode();
    }

    public int getDefaultStyleResource() {
        return R$style.com_facebook_button_share;
    }

    public g13_0 getDialog() {
        Object object = this.getFragment();
        Object object2 = "fragment";
        if (object != null) {
            androidx.fragment.app.Fragment fragment = this.getFragment();
            int n3 = this.getRequestCode();
            Intrinsics.checkNotNullParameter(fragment, (String)object2);
            object2 = new mw0_0(fragment);
            object = new g13_0((mw0_0)object2, n3);
        } else {
            object = this.getNativeFragment();
            if (object != null) {
                Fragment fragment = this.getNativeFragment();
                int n4 = this.getRequestCode();
                Intrinsics.checkNotNullParameter(fragment, (String)object2);
                object2 = new mw0_0(fragment);
                object = new g13_0((mw0_0)object2, n4);
            } else {
                object2 = this.getActivity();
                int n7 = this.getRequestCode();
                object = new g13_0((Activity)object2, n7);
            }
        }
        ((qi0_0)object).e = object2 = this.getCallbackManager();
        return object;
    }
}

