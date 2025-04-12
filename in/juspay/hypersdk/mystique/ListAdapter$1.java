/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package in.juspay.hypersdk.mystique;

import android.view.View;
import in.juspay.hypersdk.mystique.ListAdapter;

class ListAdapter$1
implements View.OnClickListener {
    final /* synthetic */ ListAdapter this$0;
    final /* synthetic */ int val$index;
    final /* synthetic */ String val$value;

    public ListAdapter$1(ListAdapter listAdapter, String string2, int n3) {
        this.this$0 = listAdapter;
        this.val$value = string2;
        this.val$index = n3;
    }

    public void onClick(View object) {
        object = ListAdapter.access$000(this.this$0);
        CharSequence charSequence = new StringBuilder("window.callUICallback('");
        String string2 = this.val$value;
        charSequence.append(string2);
        charSequence.append("',");
        int n3 = this.val$index;
        charSequence.append(n3);
        charSequence.append(");");
        charSequence = charSequence.toString();
        object.addJsToWebView((String)charSequence);
    }
}

