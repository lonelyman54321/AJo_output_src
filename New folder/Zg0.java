/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Typeface
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$color;
import com.ril.ajio.R$layout;
import com.ril.ajio.services.data.ratings.AttributeRatings;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class Zg0
extends RecyclerView$f {
    public final ArrayList a;
    public final int b;

    public Zg0(int n3, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "experiences");
        this.a = arrayList;
        this.b = n3;
    }

    public final int getItemCount() {
        return this.a.size();
    }

    public final void onBindViewHolder(RecyclerView$B object, int n3) {
        object = (kf0_0)object;
        Intrinsics.checkNotNullParameter(object, "holder");
        Object object2 = this.a.get(n3);
        Intrinsics.checkNotNullExpressionValue(object2, "get(...)");
        object2 = (AttributeRatings)object2;
        object.getClass();
        Intrinsics.checkNotNullParameter(object2, "exp");
        cp_1.Companion.getClass();
        Object object3 = cp$a.e();
        Object object4 = ((AttributeRatings)object2).getPercentageRating();
        object3.getClass();
        int n4 = cp_1.v((String)object4);
        ((kf0_0)object).b.setProgress(n4);
        object3 = ((AttributeRatings)object2).getText();
        object4 = cp$a.e();
        Object object5 = ((AttributeRatings)object2).getPercentageRating();
        object4.getClass();
        int n7 = cp_1.v((String)object5);
        object5 = new StringBuilder();
        ((StringBuilder)object5).append((String)object3);
        ((StringBuilder)object5).append(" (");
        ((StringBuilder)object5).append(n7);
        ((StringBuilder)object5).append("%)");
        object3 = ((StringBuilder)object5).toString();
        object4 = ((kf0_0)object).c;
        object4.setText((CharSequence)object3);
        object3 = cp$a.e();
        object2 = ((AttributeRatings)object2).getPercentageRating();
        object3.getClass();
        n3 = cp_1.v((String)object2);
        int n8 = ((kf0_0)object).a;
        if (n8 == n3) {
            String string2;
            object = od3_2.a;
            n3 = ((String)object).length();
            if (n3 == 0) {
                object = od3_2.a();
            }
            n3 = (int)(s20.a ? 1 : 0);
            n4 = 1;
            if (n3 == 0 && (n3 = (int)(Intrinsics.areEqual(object2 = od3_2.a(), string2 = ((ld3_2)((Object)(object5 = ld3_2.STORE_AJIOGRAM))).getStoreId()) ? 1 : 0)) == 0 && (n8 = (int)(Intrinsics.areEqual(object, object2 = ((ld3_2)((Object)object5)).getStoreId()) ? 1 : 0)) == 0) {
                AJIOApplication.Companion.getClass();
                object = AJIOApplication$a.a();
                n3 = R$color.color_202020;
                n8 = t70.getColor((Context)object, n3);
                object4.setTextColor(n8);
                object = object4.getTypeface();
                ((AppCompatTextView)object4).setTypeface((Typeface)object, n4);
            } else {
                AJIOApplication.Companion.getClass();
                object = AJIOApplication$a.a();
                n3 = R$color.white;
                n8 = t70.getColor((Context)object, n3);
                object4.setTextColor(n8);
                object = object4.getTypeface();
                ((AppCompatTextView)object4).setTypeface((Typeface)object, n4);
            }
        } else {
            object = od3_2.a;
            n3 = ((String)object).length();
            if (n3 == 0) {
                object = od3_2.a();
            }
            if ((n3 = (int)(s20.a ? 1 : 0)) == 0 && (n3 = (int)(Intrinsics.areEqual(object2 = od3_2.a(), object5 = ((ld3_2)((Object)(object3 = ld3_2.STORE_AJIOGRAM))).getStoreId()) ? 1 : 0)) == 0 && (n8 = (int)(Intrinsics.areEqual(object, object2 = ((ld3_2)((Object)object3)).getStoreId()) ? 1 : 0)) == 0) {
                AJIOApplication.Companion.getClass();
                object = AJIOApplication$a.a();
                n3 = R$color.color_6d6d6d;
                n8 = t70.getColor((Context)object, n3);
                object4.setTextColor(n8);
            } else {
                AJIOApplication.Companion.getClass();
                object = AJIOApplication$a.a();
                n3 = R$color.fleek_color_accent_3;
                n8 = t70.getColor((Context)object, n3);
                object4.setTextColor(n8);
            }
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
        int n4 = R$layout.experience_item;
        viewGroup = layoutInflater.inflate(n4, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewGroup, "inflate(...)");
        int n7 = this.b;
        kf0_0 kf0_02 = new kf0_0((View)viewGroup, n7);
        return kf0_02;
    }
}

