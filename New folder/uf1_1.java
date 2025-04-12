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
import com.ril.ajio.R$layout;
import com.ril.ajio.services.data.Home.LuxeFooterData;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from uF1
 */
public final class uf1_1
extends RecyclerView$f {
    public final ArrayList a;
    public final mf1_0 b;

    public uf1_1(ArrayList arrayList, mf1_0 mf1_02) {
        Intrinsics.checkNotNullParameter(mf1_02, "luxeFooterClickListener");
        this.a = arrayList;
        this.b = mf1_02;
    }

    public final int getItemCount() {
        ArrayList arrayList = this.a;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        recyclerView$B = (of1_0)recyclerView$B;
        Intrinsics.checkNotNullParameter(recyclerView$B, "holder");
        Object object = this.a;
        if (object != null) {
            Intrinsics.checkNotNull(object);
            Object object2 = ((ArrayList)object).get(n3);
            object = "get(...)";
            Intrinsics.checkNotNullExpressionValue(object2, (String)object);
            object2 = (LuxeFooterData)object2;
            ((of1_0)recyclerView$B).w((LuxeFooterData)object2);
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        Object object = LayoutInflater.from((Context)viewGroup.getContext());
        int n4 = R$layout.luxe_footer_layout;
        viewGroup = object.inflate(n4, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewGroup, "inflate(...)");
        object = this.b;
        of1_0 of1_02 = new of1_0((View)viewGroup, (mf1_0)object);
        return of1_02;
    }
}

