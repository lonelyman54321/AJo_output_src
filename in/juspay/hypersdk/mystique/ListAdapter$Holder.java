/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  org.json.JSONArray
 *  org.json.JSONException
 */
package in.juspay.hypersdk.mystique;

import android.view.View;
import in.juspay.hypersdk.mystique.ListAdapter;
import org.json.JSONArray;
import org.json.JSONException;

class ListAdapter$Holder {
    final /* synthetic */ ListAdapter this$0;
    View[] views;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public ListAdapter$Holder(ListAdapter listAdapter, View view) {
        this.this$0 = listAdapter;
        View[] viewArray = new View[ListAdapter.access$100(listAdapter).length()];
        this.views = viewArray;
        int n3 = 0;
        viewArray = null;
        JSONArray jSONArray;
        int n4;
        while (n3 < (n4 = (jSONArray = ListAdapter.access$100(listAdapter)).length())) {
            try {
                jSONArray = ListAdapter.access$100(listAdapter);
                jSONArray = jSONArray.getJSONObject(n3);
                View[] viewArray2 = this.views;
                String string2 = "id";
                n4 = jSONArray.getInt(string2);
                jSONArray = view.findViewById(n4);
                viewArray2[n3] = jSONArray;
            }
            catch (JSONException jSONException) {}
            ++n3;
        }
        return;
    }
}

