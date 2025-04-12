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
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.AjioRoundedCornerImageView;
import com.ril.ajio.customviews.widgets.AjioRoundedCornerImageView$Companion;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class M71
extends RecyclerView$f {
    public final ArrayList a;

    public M71(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final int getItemCount() {
        int n3;
        ArrayList arrayList = this.a;
        if (arrayList != null) {
            n3 = arrayList.size();
        } else {
            n3 = 0;
            arrayList = null;
        }
        return n3;
    }

    public final void onBindViewHolder(RecyclerView$B object, int n3) {
        Object object2 = "viewHolder";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        boolean bl2 = object instanceof M71$a;
        if (bl2) {
            String string2;
            object2 = this.a;
            if (object2 != null) {
                string2 = (String)((ArrayList)object2).get(n3);
            } else {
                n3 = 0;
                string2 = null;
            }
            object = (M71$a)object;
            object.getClass();
            object2 = AjioRoundedCornerImageView.Companion;
            int n4 = 0x40C00000;
            float f5 = 6.0f;
            ((AjioRoundedCornerImageView$Companion)object2).setRadius(f5);
            if (string2 != null) {
                object2 = new da$a();
                n4 = 1;
                f5 = Float.MIN_VALUE;
                ((da$a)object2).k = n4;
                ((da$a)object2).r = n4;
                n4 = R$string.acc_banner;
                String string3 = hv3_0.K(n4);
                ((da$a)object2).b(string3);
                ((da$a)object2).n = string2;
                object = ((M71$a)object).a;
                ((da$a)object2).u = object;
                ((da$a)object2).a();
            }
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
        int n4 = R$layout.homepage_other_products_item;
        viewGroup = layoutInflater.inflate(n4, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewGroup, "inflate(...)");
        M71$a m71$a = new M71$a((View)viewGroup);
        return m71$a;
    }
}

