/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.Color
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$layout;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from H63
 */
public final class h63_0
extends RecyclerView$f {
    public final ArrayList a;

    public h63_0() {
        ArrayList arrayList;
        this.a = arrayList = new ArrayList();
    }

    public final int getItemCount() {
        return this.a.size();
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        Object object;
        recyclerView$B = (i63_0)recyclerView$B;
        Intrinsics.checkNotNullParameter(recyclerView$B, "holder");
        Object object2 = (g63_0)this.a.get(n3);
        int n4 = n3 + 1;
        String string2 = ((g63_0)object2).b;
        string2 = kp1_0.c("To fit ", string2);
        Object object3 = ((i63_0)recyclerView$B).a;
        String string3 = String.valueOf(n4);
        object3.setText((CharSequence)string3);
        string3 = ((i63_0)recyclerView$B).c;
        object3 = ((g63_0)object2).c;
        string3.setText((CharSequence)object3);
        string3 = ((i63_0)recyclerView$B).b;
        string3.setText((CharSequence)string2);
        object2 = ((g63_0)object2).a;
        if (object2 == null) {
            tj2_2.Companion.getClass();
            tj2$a_0.a().getClass();
            string3 = "#72BADA";
            string2 = "#B27171";
            object = xx_2.i("#EA8774", string3, string2).get(n3);
            object2 = object;
            object2 = (String)object;
        }
        object = ColorStateList.valueOf((int)Color.parseColor((String)object2));
        ((i63_0)recyclerView$B).a.setBackgroundTintList(object);
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
        int n4 = R$layout.layout_new_size_instruction;
        viewGroup = layoutInflater.inflate(n4, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewGroup, "inflate(...)");
        i63_0 i63_02 = new i63_0((View)viewGroup);
        return i63_02;
    }
}

