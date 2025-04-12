/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.ViewGroup
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.databinding.RtoImageRowBinding;
import com.ril.ajio.services.data.Order.Entries;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class wQ2
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
        boolean bl2;
        Entries entries2;
        Intrinsics.checkNotNullParameter(object, "holder");
        object = (xQ2)object;
        Object object2 = this.a;
        String string2 = null;
        if (object2 != null) {
            entries2 = (Entries)object2.get(n3);
        } else {
            n3 = 0;
            entries2 = null;
        }
        object.getClass();
        object2 = new da$a();
        ((da$a)object2).k = bl2 = true;
        ((da$a)object2).g = bl2;
        if (entries2 != null) {
            string2 = entries2.getUrl();
        }
        object = ((xQ2)object).a.imgProduct;
        ((da$a)object2).n = string2;
        ((da$a)object2).u = object;
        ((da$a)object2).a();
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup object, int n3) {
        Intrinsics.checkNotNullParameter(object, "parent");
        object = RtoImageRowBinding.inflate(LayoutInflater.from((Context)object.getContext()), object, false);
        Intrinsics.checkNotNullExpressionValue(object, "inflate(...)");
        xQ2 xQ22 = new xQ2((RtoImageRowBinding)object);
        return xQ22;
    }
}

