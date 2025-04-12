/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnLongClickListener
 *  android.view.ViewGroup
 */
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from MQ1
 */
public final class mq1_0
extends RecyclerView$f {
    public final List a;
    public final Oj2 b;

    public mq1_0(List list, Oj2 oj2) {
        Intrinsics.checkNotNullParameter(list, "urlList");
        Intrinsics.checkNotNullParameter(oj2, "plpImageClickListener");
        this.a = list;
        this.b = oj2;
    }

    public final int getItemCount() {
        return this.a.size();
    }

    public final void onBindViewHolder(RecyclerView$B object, int n3) {
        int n4;
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "holder");
        object = (mA2)object;
        String string2 = (String)this.a.get(n3);
        object.getClass();
        Intrinsics.checkNotNullParameter(string2, "url");
        Object object2 = new StringBuilder();
        ((StringBuilder)object2).append(string2);
        ((StringBuilder)object2).append("?quality=medium");
        string2 = ((StringBuilder)object2).toString();
        object2 = new da$a();
        ((da$a)object2).k = bl2 = true;
        ((da$a)object2).a = n4 = R$drawable.component_placeholder;
        ((da$a)object2).b = n4;
        ((da$a)object2).r = bl2;
        String string3 = hv3_0.K(R$string.acc_banner);
        ((da$a)object2).b(string3);
        ((da$a)object2).n = string2;
        string2 = ((mA2)object).b;
        ((da$a)object2).u = string2;
        ((da$a)object2).i = bl2;
        ((da$a)object2).a();
        string2.setClickable(bl2);
        string2.setOnClickListener((View.OnClickListener)object);
        string2.setLongClickable(bl2);
        object = ((mA2)object).c;
        string2.setOnLongClickListener((View.OnLongClickListener)object);
        object = hv3_0.K(R$string.product_image);
        object2 = new StringBuilder();
        ((StringBuilder)object2).append((String)object);
        ((StringBuilder)object2).append(" index ");
        ((StringBuilder)object2).append(n3);
        object = ((StringBuilder)object2).toString();
        string2.setContentDescription((CharSequence)object);
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Object object = ck0.a(viewGroup, "parent");
        int n4 = R$layout.plp_multi_image_row;
        viewGroup = object.inflate(n4, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewGroup, "inflate(...)");
        Oj2 oj2 = this.b;
        object = new mA2((View)viewGroup, oj2);
        ((RecyclerView$B)object).setIsRecyclable(false);
        return object;
    }
}

