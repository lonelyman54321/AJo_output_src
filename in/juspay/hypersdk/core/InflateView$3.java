/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnTouchListener
 */
package in.juspay.hypersdk.core;

import android.view.MotionEvent;
import android.view.View;
import in.juspay.hypersdk.core.InflateView;

class InflateView$3
implements View.OnTouchListener {
    final /* synthetic */ InflateView this$0;
    final /* synthetic */ String val$jsFunc;

    public InflateView$3(InflateView inflateView, String string2) {
        this.this$0 = inflateView;
        this.val$jsFunc = string2;
    }

    public boolean onTouch(View object, MotionEvent motionEvent) {
        object = new StringBuilder("window.callUICallback('");
        String string2 = this.val$jsFunc;
        ((StringBuilder)object).append(string2);
        string2 = "','";
        ((StringBuilder)object).append(string2);
        float f5 = motionEvent.getX();
        ((StringBuilder)object).append(f5);
        ((StringBuilder)object).append(string2);
        float f6 = motionEvent.getY();
        ((StringBuilder)object).append(f6);
        ((StringBuilder)object).append("');");
        object = ((StringBuilder)object).toString();
        this.this$0.dynamicUI.addJsToWebView((String)object);
        return false;
    }
}

