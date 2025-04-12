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
import com.ril.ajio.services.data.ratings.PopUpImageModel;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class CO2
extends RecyclerView$f {
    public final ArrayList a;
    public Context b;

    public CO2() {
        ArrayList arrayList;
        this.a = arrayList = new ArrayList();
    }

    public final int getItemCount() {
        return this.a.size();
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        recyclerView$B = (CO2$a)recyclerView$B;
        Intrinsics.checkNotNullParameter(recyclerView$B, "holder");
        Object object = this.a;
        Object object2 = (PopUpImageModel)((ArrayList)object).get(n3);
        recyclerView$B = ((CO2$a)recyclerView$B).a;
        if (recyclerView$B != null && (object = this.b) != null) {
            boolean bl2;
            object = new da$a();
            ((da$a)object).k = bl2 = true;
            ((da$a)object).g = bl2;
            ((da$a)object).n = object2 = ((PopUpImageModel)object2).getImageUrl();
            ((da$a)object).u = recyclerView$B;
            ((da$a)object).a();
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup object, int n3) {
        LayoutInflater layoutInflater = ck0.a(object, "parent");
        int n4 = R$layout.review_image_row;
        layoutInflater = layoutInflater.inflate(n4, object, false);
        object = object.getContext();
        this.b = object;
        Intrinsics.checkNotNull(layoutInflater);
        object = new CO2$a((View)layoutInflater);
        return object;
    }
}

