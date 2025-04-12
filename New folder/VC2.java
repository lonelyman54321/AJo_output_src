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
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class VC2
extends RecyclerView$f {
    public final List a;

    public VC2(List list) {
        Intrinsics.checkNotNullParameter(list, "listOfGuidelines");
        this.a = list;
    }

    public final int getItemCount() {
        return this.a.size();
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        String string2;
        Object object = "holder";
        Intrinsics.checkNotNullParameter(recyclerView$B, (String)object);
        boolean bl2 = recyclerView$B instanceof UC2;
        if (bl2 && (string2 = (String)(object = this.a).get(n3)) != null) {
            recyclerView$B = (UC2)recyclerView$B;
            recyclerView$B.getClass();
            object = "guideline";
            Intrinsics.checkNotNullParameter(string2, (String)object);
            recyclerView$B = ((UC2)recyclerView$B).a;
            recyclerView$B.setText(string2);
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
        int n4 = R$layout.layout_rbi_guideline_row;
        viewGroup = layoutInflater.inflate(n4, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewGroup, "inflate(...)");
        UC2 uC2 = new UC2((View)viewGroup);
        return uC2;
    }
}

