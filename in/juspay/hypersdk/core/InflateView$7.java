/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Editable
 *  android.text.TextWatcher
 */
package in.juspay.hypersdk.core;

import android.text.Editable;
import android.text.TextWatcher;
import in.juspay.hypersdk.core.DynamicUI;
import in.juspay.hypersdk.core.InflateView;

class InflateView$7
implements TextWatcher {
    private String previousText;
    final /* synthetic */ InflateView this$0;
    final /* synthetic */ String val$js;

    public InflateView$7(InflateView inflateView, String string2) {
        this.this$0 = inflateView;
        this.val$js = string2;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
        charSequence = charSequence.toString();
        this.previousText = charSequence;
    }

    public void onTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
        Object object = this.previousText;
        CharSequence charSequence2 = charSequence.toString();
        n3 = (int)(((String)object).equals(charSequence2) ? 1 : 0);
        if (n3 == 0) {
            object = this.this$0.dynamicUI;
            charSequence2 = new StringBuilder("window.callUICallback('");
            String string2 = this.val$js;
            ((StringBuilder)charSequence2).append(string2);
            string2 = "', '";
            ((StringBuilder)charSequence2).append(string2);
            ((StringBuilder)charSequence2).append((Object)charSequence);
            ((StringBuilder)charSequence2).append("');");
            charSequence = ((StringBuilder)charSequence2).toString();
            ((DynamicUI)object).addJsToWebView((String)charSequence);
        }
    }
}

