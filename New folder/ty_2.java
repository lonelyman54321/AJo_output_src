/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$layout;
import com.ril.ajio.services.data.Order.BodyMessage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ty
 */
public final class ty_2
extends RecyclerView$f {
    public List a;

    public final int getItemCount() {
        int n3;
        List list = this.a;
        if (list != null) {
            n3 = list.size();
        } else {
            n3 = 0;
            list = null;
        }
        return n3;
    }

    public final void onBindViewHolder(RecyclerView$B object, int n3) {
        String string2 = "holder";
        Intrinsics.checkNotNullParameter(object, string2);
        boolean bl2 = object instanceof uy_2;
        if (bl2) {
            BodyMessage bodyMessage;
            object = (uy_2)object;
            bl2 = false;
            string2 = null;
            List list = this.a;
            if (list != null) {
                bodyMessage = (BodyMessage)list.get(n3);
            } else {
                n3 = 0;
                bodyMessage = null;
            }
            if (bodyMessage != null) {
                object.getClass();
                string2 = bodyMessage.getMessage();
            }
            object = ((uy_2)object).a;
            ai0_2.A((TextView)object, string2);
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
        int n4 = R$layout.layout_list;
        viewGroup = layoutInflater.inflate(n4, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewGroup, "inflate(...)");
        uy_2 uy_22 = new uy_2((View)viewGroup);
        return uy_22;
    }
}

