/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.SeekBar
 *  android.widget.SeekBar$OnSeekBarChangeListener
 */
package in.juspay.hypersdk.core;

import android.widget.SeekBar;
import in.juspay.hypersdk.core.InflateView;

class InflateView$5
implements SeekBar.OnSeekBarChangeListener {
    final /* synthetic */ InflateView this$0;
    final /* synthetic */ String val$jsFunc;

    public InflateView$5(InflateView inflateView, String string2) {
        this.this$0 = inflateView;
        this.val$jsFunc = string2;
    }

    public void onProgressChanged(SeekBar object, int n3, boolean bl2) {
        object = new StringBuilder("window.callUICallback('");
        String string2 = this.val$jsFunc;
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append("', 'PROGRESS_CHANGED', '");
        ((StringBuilder)object).append(n3);
        ((StringBuilder)object).append("','");
        object = Vm.a("');", bl2, (StringBuilder)object);
        this.this$0.dynamicUI.addJsToWebView((String)object);
    }

    public void onStartTrackingTouch(SeekBar object) {
        object = new StringBuilder("window.callUICallback('");
        String string2 = this.val$jsFunc;
        object = h30_0.a((StringBuilder)object, string2, "', 'START_TRACKING_TOUCH');");
        this.this$0.dynamicUI.addJsToWebView((String)object);
    }

    public void onStopTrackingTouch(SeekBar object) {
        object = new StringBuilder("window.callUICallback('");
        String string2 = this.val$jsFunc;
        object = h30_0.a((StringBuilder)object, string2, "', 'STOP_TRACKING_TOUCH');");
        this.this$0.dynamicUI.addJsToWebView((String)object);
    }
}

