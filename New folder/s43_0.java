/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 */
import android.text.TextUtils;
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
 * Renamed from S43
 */
public final class s43_0
extends RecyclerView$f {
    public final ArrayList a;
    public final J43 b;

    public s43_0(ArrayList arrayList, J43 j43) {
        Intrinsics.checkNotNullParameter(arrayList, "list");
        this.a = arrayList;
        this.b = j43;
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
        recyclerView$B = (I43)recyclerView$B;
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
        AjioTextView ajioTextView = ((I43)recyclerView$B).c;
        ajioTextView.setText(string2);
        if (luxePdpLinks != null) {
            object = luxePdpLinks.getUrl();
        }
        if (!(bl2 = TextUtils.isEmpty(object))) {
            object = new H43(luxePdpLinks, (I43)recyclerView$B);
            recyclerView$B = ((I43)recyclerView$B).a;
            recyclerView$B.setOnClickListener((View.OnClickListener)object);
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Object object = ck0.a(viewGroup, "parent");
        int n4 = R$layout.link_single_item;
        viewGroup = object.inflate(n4, viewGroup, false);
        Intrinsics.checkNotNull(viewGroup);
        J43 j43 = this.b;
        object = new I43((View)viewGroup, j43);
        return object;
    }
}

