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
import com.ril.ajio.services.data.Order.UserSubRating;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Qa2
 */
public final class qa2_1
extends RecyclerView$f {
    public final ArrayList a;

    public qa2_1(ArrayList arrayList) {
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

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        Object object = "viewHolder";
        Intrinsics.checkNotNullParameter(recyclerView$B, (String)object);
        boolean bl2 = recyclerView$B instanceof Qa2$a;
        if (bl2) {
            String string2;
            Object object2;
            object = this.a;
            if (object != null) {
                object2 = (UserSubRating)((ArrayList)object).get(n3);
            } else {
                n3 = 0;
                object2 = null;
            }
            recyclerView$B = (Qa2$a)recyclerView$B;
            object = ((Qa2$a)recyclerView$B).a;
            String string3 = "-";
            if (object2 != null && (string2 = ((UserSubRating)object2).title) != null) {
                cp_1.Companion.getClass();
                cp_1 cp_12 = cp$a.e();
                cp_12.getClass();
                string2 = cp_1.C(string2);
                int n4 = string2.length();
                if (n4 == 0) {
                    object.setText((CharSequence)string3);
                } else {
                    object.setText((CharSequence)string2);
                }
            } else {
                object.setText((CharSequence)string3);
            }
            recyclerView$B = ((Qa2$a)recyclerView$B).b;
            if (object2 != null && (object2 = ((UserSubRating)object2).subQuestionText) != null) {
                recyclerView$B.setText((CharSequence)object2);
            } else {
                recyclerView$B.setText(string3);
            }
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
        int n4 = R$layout.od_review_item;
        viewGroup = layoutInflater.inflate(n4, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewGroup, "inflate(...)");
        Qa2$a qa2$a = new Qa2$a((View)viewGroup);
        return qa2$a;
    }
}

