/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.ViewGroup
 */
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.chuckerteam.chucker.R$layout;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

public final class iq3
extends RecyclerView$f {
    public final ArrayList a;

    public iq3() {
        ArrayList arrayList;
        this.a = arrayList = new ArrayList();
    }

    public final int getItemCount() {
        return this.a.size();
    }

    public final int getItemViewType(int n3) {
        Object object;
        block5: {
            block3: {
                block4: {
                    boolean bl2;
                    block2: {
                        ArrayList arrayList = this.a;
                        object = (Fq3)arrayList.get(n3);
                        bl2 = object instanceof Fq3$b;
                        if (!bl2) break block2;
                        n3 = 1;
                        break block3;
                    }
                    bl2 = object instanceof Fq3$a;
                    if (!bl2) break block4;
                    n3 = 2;
                    break block3;
                }
                n3 = object instanceof Fq3$c;
                if (n3 == 0) break block5;
                n3 = 3;
            }
            return n3;
        }
        object = new NoWhenBranchMatchedException();
        throw object;
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        recyclerView$B = (Gq3)recyclerView$B;
        Intrinsics.checkNotNullParameter(recyclerView$B, "holder");
        Object object = this.a.get(n3);
        Intrinsics.checkNotNullExpressionValue(object, "items[position]");
        object = (Fq3)object;
        ((Gq3)recyclerView$B).w((Fq3)object);
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup object, int n3) {
        Gq3 gq3;
        LayoutInflater layoutInflater = ck0.a(object, "parent");
        int n4 = 1;
        String string2 = "inflate(inflater, parent, false)";
        if (n3 != n4) {
            n4 = 2;
            if (n3 != n4) {
                n3 = R$layout.chucker_transaction_item_image;
                object = FU.bind(layoutInflater.inflate(n3, object, false));
                Intrinsics.checkNotNullExpressionValue(object, string2);
                gq3 = new Gq3$c((FU)object);
            } else {
                n3 = R$layout.chucker_transaction_item_body_line;
                object = DU.bind(layoutInflater.inflate(n3, object, false));
                Intrinsics.checkNotNullExpressionValue(object, string2);
                gq3 = new Gq3$a((DU)object);
            }
        } else {
            n3 = R$layout.chucker_transaction_item_headers;
            object = eu_0.bind(layoutInflater.inflate(n3, object, false));
            Intrinsics.checkNotNullExpressionValue(object, string2);
            gq3 = new Gq3$b((eu_0)object);
        }
        return gq3;
    }
}

