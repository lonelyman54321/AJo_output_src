/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$layout;
import com.ril.ajio.services.data.Payment.HowToFindUpiSteps;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ut3
 */
public final class ut3_0
extends RecyclerView$f {
    public final List a;

    public ut3_0(List list) {
        Intrinsics.checkNotNullParameter(list, "howToFindUpiSteps");
        this.a = list;
    }

    public final int getItemCount() {
        return this.a.size();
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        Iterator iterator;
        Object object = "holder";
        Intrinsics.checkNotNullParameter(recyclerView$B, (String)object);
        boolean bl2 = recyclerView$B instanceof wt3_0;
        if (bl2 && (iterator = (HowToFindUpiSteps)(object = this.a).get(n3)) != null) {
            int n4;
            boolean bl3;
            recyclerView$B = (wt3_0)recyclerView$B;
            recyclerView$B.getClass();
            Intrinsics.checkNotNullParameter(iterator, "howToFindUpiSteps");
            object = new da$a();
            ((da$a)object).k = bl3 = true;
            ((da$a)object).a = n4 = R$drawable.component_placeholder;
            ((da$a)object).b = n4;
            ((da$a)object).g = bl3;
            String string2 = ((HowToFindUpiSteps)((Object)iterator)).getIconURL();
            ((da$a)object).n = string2;
            string2 = ((wt3_0)recyclerView$B).a;
            ((da$a)object).u = string2;
            ((da$a)object).h = bl3;
            ((da$a)object).a();
            object = ((wt3_0)recyclerView$B).b;
            String string3 = ((HowToFindUpiSteps)((Object)iterator)).getAppName();
            object.setText((CharSequence)string3);
            iterator = ((HowToFindUpiSteps)((Object)iterator)).getSteps();
            object = "";
            if (iterator != null) {
                iterator = iterator.iterator();
                while (bl3 = iterator.hasNext()) {
                    string3 = (String)iterator.next();
                    string2 = "\n";
                    object = n1.a((String)object, string3, string2);
                }
            }
            recyclerView$B = ((wt3_0)recyclerView$B).c;
            recyclerView$B.setText((CharSequence)object);
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
        int n4 = R$layout.layout_payment_upi_how_to_row;
        viewGroup = layoutInflater.inflate(n4, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewGroup, "inflate(...)");
        wt3_0 wt3_02 = new wt3_0((View)viewGroup);
        return wt3_02;
    }
}

