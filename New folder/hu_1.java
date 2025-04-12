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
import com.ril.ajio.services.data.sis.StoreInfo;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from hU
 */
public final class hu_1
extends RecyclerView$f {
    public final ArrayList a;
    public final lc3_1 b;
    public final boolean c;
    public final int d;
    public final boolean e;
    public final boolean f;

    public hu_1(ArrayList arrayList, lc3_1 lc3_12, int n3, boolean bl2, boolean bl3) {
        Intrinsics.checkNotNullParameter(arrayList, "storeList");
        Intrinsics.checkNotNullParameter(lc3_12, "selectionListener");
        this.a = arrayList;
        this.b = lc3_12;
        this.c = true;
        this.d = n3;
        this.e = bl2;
        this.f = bl3;
    }

    public final int getItemCount() {
        return this.a.size();
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        recyclerView$B = (hU$a)recyclerView$B;
        Intrinsics.checkNotNullParameter(recyclerView$B, "holder");
        ArrayList arrayList = this.a;
        int n4 = arrayList.size();
        int n7 = 1;
        String string2 = "get(...)";
        if (n3 == (n4 -= n7)) {
            Object object = arrayList.get(n3);
            Intrinsics.checkNotNullExpressionValue(object, string2);
            object = (StoreInfo)object;
            ((hU$a)recyclerView$B).w((StoreInfo)object, n7 != 0);
        } else {
            Object object = arrayList.get(n3);
            Intrinsics.checkNotNullExpressionValue(object, string2);
            object = (StoreInfo)object;
            arrayList = null;
            ((hU$a)recyclerView$B).w((StoreInfo)object, false);
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        hU$a hU$a;
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        Object object = LayoutInflater.from((Context)viewGroup.getContext());
        int n4 = R$layout.list_item_store;
        View view = object.inflate(n4, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(view, "inflate(...)");
        boolean bl2 = this.c;
        int n7 = this.d;
        lc3_1 lc3_12 = this.b;
        boolean bl3 = this.e;
        boolean bl4 = this.f;
        object = hU$a;
        hU$a = new hU$a(view, lc3_12, bl2, n7, bl3, bl4);
        return hU$a;
    }
}

