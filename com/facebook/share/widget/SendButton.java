/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Fragment
 *  android.content.Context
 *  android.util.AttributeSet
 */
package com.facebook.share.widget;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.util.AttributeSet;
import com.facebook.share.R$style;
import com.facebook.share.widget.ShareButtonBase;

public final class SendButton
extends ShareButtonBase {
    public SendButton(Context context) {
        super(context, null, 0, "fb_send_button_create", "fb_send_button_did_tap");
    }

    public SendButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, "fb_send_button_create", "fb_send_button_did_tap");
    }

    public SendButton(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3, "fb_send_button_create", "fb_send_button_did_tap");
    }

    public int getDefaultRequestCode() {
        return dK$c.Message.toRequestCode();
    }

    public int getDefaultStyleResource() {
        return R$style.com_facebook_button_send;
    }

    public g13_0 getDialog() {
        Object object;
        Object object2 = this.getFragment();
        if (object2 != null) {
            object = this.getFragment();
            int n3 = this.getRequestCode();
            mw0_0 mw0_02 = new mw0_0((androidx.fragment.app.Fragment)object);
            object2 = new rO1(mw0_02, n3);
        } else {
            object2 = this.getNativeFragment();
            if (object2 != null) {
                object = this.getNativeFragment();
                int n4 = this.getRequestCode();
                mw0_0 mw0_03 = new mw0_0((Fragment)object);
                object2 = new rO1(mw0_03, n4);
            } else {
                object = this.getActivity();
                int n7 = this.getRequestCode();
                object2 = new g13_0((Activity)object, n7);
                object = dk_1.b;
                u13_0 u13_02 = new u13_0(n7);
                ((dK$b)object).a(n7, u13_02);
            }
        }
        ((qi0_0)object2).e = object = this.getCallbackManager();
        return object2;
    }
}

