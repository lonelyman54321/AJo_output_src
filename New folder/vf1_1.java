/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 */
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.services.data.Product.LuxePdpLinks;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from vF1
 */
public final class vf1_1
extends RecyclerView$f {
    public final ArrayList a;
    public final yi2_1 b;

    public vf1_1(ArrayList arrayList, yi2_1 yi2_12) {
        Intrinsics.checkNotNullParameter(arrayList, "list");
        Intrinsics.checkNotNullParameter(yi2_12, "pdpInfoProvider");
        this.a = arrayList;
        this.b = yi2_12;
    }

    public final int getItemCount() {
        ArrayList arrayList = this.a;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        String string2;
        recyclerView$B = (af1_1)recyclerView$B;
        Intrinsics.checkNotNullParameter(recyclerView$B, "holder");
        LuxePdpLinks luxePdpLinks = (LuxePdpLinks)this.a.get(n3);
        boolean bl2 = false;
        Object object = null;
        if (luxePdpLinks != null) {
            recyclerView$B.getClass();
            string2 = luxePdpLinks.getMsg();
        } else {
            string2 = null;
        }
        AjioTextView ajioTextView = ((af1_1)recyclerView$B).c;
        ajioTextView.setText(string2);
        if (luxePdpLinks != null) {
            object = luxePdpLinks.getUrl();
        }
        if (!(bl2 = TextUtils.isEmpty(object))) {
            object = new zf1_1(luxePdpLinks, (af1_1)recyclerView$B);
            recyclerView$B = ((af1_1)recyclerView$B).a;
            recyclerView$B.setOnClickListener((View.OnClickListener)object);
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Object object;
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        yi2_1 yi2_12 = this.b;
        boolean bl2 = yi2_12.c9();
        if (bl2) {
            object = LayoutInflater.from((Context)viewGroup.getContext());
            int n4 = R$layout.luxe_pdp_bottom_link_url_row;
            viewGroup = object.inflate(n4, viewGroup, false);
        } else {
            object = LayoutInflater.from((Context)viewGroup.getContext());
            int n7 = R$layout.pdp_bottom_link_url_row;
            viewGroup = object.inflate(n7, viewGroup, false);
        }
        Intrinsics.checkNotNull(viewGroup);
        object = new af1_1((View)viewGroup, yi2_12);
        return object;
    }
}

