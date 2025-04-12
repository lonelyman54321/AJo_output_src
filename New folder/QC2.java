/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.widget.TextView
 */
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$o;
import com.ril.ajio.R$id;
import kotlin.jvm.internal.Intrinsics;

public final class QC2
extends RecyclerView$B {
    public final View a;
    public final RecyclerView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final View g;
    public final TextView h;
    public final TextView i;
    public final TextView j;
    public final sc2_0 k;

    public QC2(View object, sc2_0 sc2_02) {
        TextView textView;
        TextView textView2;
        RecyclerView recyclerView;
        Intrinsics.checkNotNullParameter(object, "view");
        Intrinsics.checkNotNullParameter(sc2_02, "itemClickListener");
        super((View)object);
        this.a = object;
        Context context = object.getContext();
        int n3 = R$id.productRv;
        this.b = recyclerView = (RecyclerView)object.findViewById(n3);
        int n4 = R$id.productTitleTv;
        this.c = textView2 = (TextView)object.findViewById(n4);
        n4 = R$id.productPrice;
        this.d = textView2 = (TextView)object.findViewById(n4);
        n4 = R$id.sizeInfo;
        this.e = textView2 = (TextView)object.findViewById(n4);
        n4 = R$id.brand_size_tv;
        this.f = textView2 = (TextView)object.findViewById(n4);
        n4 = R$id.qtyInfo;
        this.h = textView2 = (TextView)object.findViewById(n4);
        n4 = R$id.viewProduct;
        this.i = textView2 = (TextView)object.findViewById(n4);
        int n7 = R$id.productBrandTv;
        this.j = textView = (TextView)object.findViewById(n7);
        n7 = R$id.sizeContainer;
        this.g = object = object.findViewById(n7);
        this.k = sc2_02;
        sc2_02 = null;
        super(context, 0, false);
        recyclerView.setLayoutManager((RecyclerView$o)object);
        int n8 = mz3_0.d(16);
        int n10 = 8;
        n7 = mz3_0.d(n10);
        super(n8, n7);
        recyclerView.addItemDecoration((RecyclerView$n)object);
        int n14 = og1_1.b();
        if (n14 != 0) {
            n14 = textView2.getPaintFlags() | n10;
            textView2.setPaintFlags(n14);
        }
    }
}

