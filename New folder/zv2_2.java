/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$layout;
import com.ril.ajio.services.data.search.SuggestionSearchModel;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from zV2
 */
public final class zv2_2
extends RecyclerView$f {
    public final ArrayList a;
    public final AV2 b;
    public boolean c;

    public zv2_2(ArrayList arrayList, AV2 aV2) {
        this.a = arrayList;
        this.b = aV2;
        this.c = false;
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
        Intrinsics.checkNotNullParameter(object, "holder");
        Object object2 = this.a;
        if (object2 != null) {
            boolean bl2 = object instanceof ev2_0;
            Object object3 = "historyItem";
            String string2 = "get(...)";
            if (bl2) {
                object = (ev2_0)object;
                Object object4 = ((ArrayList)object2).get(n3);
                Intrinsics.checkNotNullExpressionValue(object4, string2);
                object4 = (SuggestionSearchModel)object4;
                object.getClass();
                Intrinsics.checkNotNullParameter(object4, (String)object3);
                object2 = ((SuggestionSearchModel)object4).getText();
                Object object5 = ((ev2_0)object).b;
                object5.setText((CharSequence)object2);
                object2 = ((ev2_0)object).a;
                if (object2 != null) {
                    object3 = new DV2((AV2)object2, (SuggestionSearchModel)object4, (ev2_0)object);
                    object5.setOnClickListener((View.OnClickListener)object3);
                    int n4 = 1;
                    object5 = new gG1(n4, object2, object4);
                    object = ((ev2_0)object).c;
                    object.setOnClickListener((View.OnClickListener)object5);
                }
            } else {
                int n7;
                object = (cv2_0)object;
                Object object6 = ((ArrayList)object2).get(n3);
                Intrinsics.checkNotNullExpressionValue(object6, string2);
                object6 = (SuggestionSearchModel)object6;
                object.getClass();
                Intrinsics.checkNotNullParameter(object6, (String)object3);
                object2 = ((SuggestionSearchModel)object6).getText();
                ((cv2_0)object).c.setText((CharSequence)object2);
                object2 = new da$a();
                ((da$a)object2).k = bl2 = true;
                ((da$a)object2).g = bl2;
                ((da$a)object2).s = bl2;
                ((da$a)object2).b = n7 = R$drawable.place_order_shadow;
                ((da$a)object2).n = object3 = ((SuggestionSearchModel)object6).getImageUrl();
                object3 = ((cv2_0)object).e;
                ((da$a)object2).u = object3;
                ((da$a)object2).i = bl2;
                ((da$a)object2).a();
                int n8 = ((cv2_0)object).b;
                ImageView imageView = ((cv2_0)object).d;
                if (n8 != 0) {
                    n8 = 0;
                    object2 = null;
                    imageView.setVisibility(0);
                } else {
                    n8 = 8;
                    imageView.setVisibility(n8);
                }
                object2 = ((cv2_0)object).a;
                if (object2 != null) {
                    object3 = new BV2((cv2_0)object, (AV2)object2, (SuggestionSearchModel)object6);
                    ((cv2_0)object).f.setOnClickListener((View.OnClickListener)object3);
                    n7 = 2;
                    object = new eg1_0(n7, object2, object6);
                    imageView.setOnClickListener((View.OnClickListener)object);
                }
            }
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Object object = "parent";
        Intrinsics.checkNotNullParameter(viewGroup, (String)object);
        n3 = (int)(og1_1.c() ? 1 : 0);
        AV2 aV2 = this.b;
        String string2 = "recentSearchNewUIEnabled";
        if (n3 != 0) {
            object = z40_0.Companion;
            AJIOApplication$a aJIOApplication$a = AJIOApplication.Companion;
            object = Q.a((AJIOApplication$a)aJIOApplication$a, (z40$a)object).a;
            n3 = (int)(((ao0_0)object).a(string2) ? 1 : 0);
            if (n3 != 0) {
                object = LayoutInflater.from((Context)viewGroup.getContext());
                int bl2 = R$layout.search_history_new_row_refresh;
                viewGroup = object.inflate(bl2, viewGroup, false);
                Intrinsics.checkNotNull(viewGroup);
                boolean n4 = this.c;
                object = new cv2_0((View)viewGroup, aV2, n4);
                return object;
            }
            object = LayoutInflater.from((Context)viewGroup.getContext());
            int bl3 = R$layout.search_history_row_luxe;
            viewGroup = object.inflate(bl3, viewGroup, false);
        } else {
            object = z40_0.Companion;
            AJIOApplication$a aJIOApplication$a = AJIOApplication.Companion;
            object = Q.a((AJIOApplication$a)aJIOApplication$a, (z40$a)object).a;
            n3 = (int)(((ao0_0)object).a(string2) ? 1 : 0);
            if (n3 != 0) {
                object = LayoutInflater.from((Context)viewGroup.getContext());
                int n7 = R$layout.search_history_new_row_refresh;
                viewGroup = object.inflate(n7, viewGroup, false);
                Intrinsics.checkNotNull(viewGroup);
                boolean bl2 = this.c;
                object = new cv2_0((View)viewGroup, aV2, bl2);
                return object;
            }
            object = LayoutInflater.from((Context)viewGroup.getContext());
            int n4 = R$layout.search_history_row_refresh;
            viewGroup = object.inflate(n4, viewGroup, false);
        }
        Intrinsics.checkNotNull(viewGroup);
        object = new ev2_0((View)viewGroup, aV2);
        return object;
    }
}

