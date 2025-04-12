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
import java.util.HashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public class XP
extends RecyclerView$f {
    public final HashMap a;
    public final KQ b;

    public XP(HashMap hashMap, KQ kQ) {
        Intrinsics.checkNotNullParameter(hashMap, "categoryTitleCountMap");
        Intrinsics.checkNotNullParameter(kQ, "categoryTitleClickListener");
        this.a = hashMap;
        this.b = kQ;
    }

    public final int getItemCount() {
        return this.a.size();
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        Object object = "holder";
        Intrinsics.checkNotNullParameter(recyclerView$B, (String)object);
        boolean bl2 = recyclerView$B instanceof bQ;
        if (bl2) {
            recyclerView$B = (bQ)recyclerView$B;
            object = this.a.entrySet();
            String string2 = "<get-entries>(...)";
            Intrinsics.checkNotNullExpressionValue(object, string2);
            Object object2 = CollectionsKt.I((Iterable)object, n3);
            object = "elementAt(...)";
            Intrinsics.checkNotNullExpressionValue(object2, (String)object);
            object2 = (Map.Entry)object2;
            ((bQ)recyclerView$B).w((Map.Entry)object2);
        }
    }

    public RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        Object object = LayoutInflater.from((Context)viewGroup.getContext());
        int n4 = R$layout.category_facet_row_view;
        viewGroup = object.inflate(n4, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewGroup, "inflate(...)");
        object = this.b;
        bQ bQ2 = new bQ((View)viewGroup, (KQ)object);
        return bQ2;
    }
}

