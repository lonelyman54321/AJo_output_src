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
import com.ril.ajio.services.data.freebies.FreebieGift;
import com.ril.ajio.services.data.freebies.FreebieProductDetail;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from kG2
 */
public final class kg2_1
extends RecyclerView$f {
    public final List a;
    public final Object b;
    public final zk1_2 c;

    public kg2_1(List object, int n3, Object object2) {
        if ((n3 &= 4) != 0) {
            object2 = null;
        }
        this.a = object;
        this.b = object2;
        this.c = object = new Object();
    }

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

    public final int getItemViewType(int n3) {
        Object object;
        block8: {
            block7: {
                block6: {
                    Object object2 = this.a;
                    if (object2 == null) {
                        return -1;
                    }
                    if (object2 != null) {
                        object = object2.get(n3);
                    } else {
                        n3 = 0;
                        object = null;
                    }
                    object2 = this.c;
                    object2.getClass();
                    boolean bl2 = object instanceof FreebieGift;
                    if (!bl2) break block6;
                    n3 = R$layout.pdp_freebie_item;
                    break block7;
                }
                n3 = object instanceof FreebieProductDetail;
                if (n3 == 0) break block8;
                n3 = R$layout.pdp_freebie_product_item;
            }
            return n3;
        }
        object = new Object("Layout is missing for the selection");
        throw object;
    }

    public final void onBindViewHolder(RecyclerView$B object, int n3) {
        block4: {
            block2: {
                int n4;
                List list;
                int n7;
                block3: {
                    String string2 = "holder";
                    Intrinsics.checkNotNullParameter(object, string2);
                    n7 = this.getItemViewType(n3);
                    list = this.a;
                    list = list != null ? list.get(n3) : null;
                    Intrinsics.checkNotNullParameter(object, string2);
                    if (list == null) break block2;
                    n4 = R$layout.pdp_freebie_item;
                    if (n7 != n4) break block3;
                    object = (jg2_0)object;
                    ((jg2_0)object).w(n3, list);
                    break block2;
                }
                n4 = R$layout.pdp_freebie_product_item;
                if (n7 != n4) break block4;
                object = (jg2_0)object;
                ((jg2_0)object).w(n3, list);
            }
            return;
        }
        object = new IllegalArgumentException("Trying to bind an undefined layout");
        throw object;
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup object, int n3) {
        block4: {
            jg2_0 jg2_02;
            block3: {
                int n4;
                block2: {
                    Object object2 = "parent";
                    Intrinsics.checkNotNullParameter(object, (String)object2);
                    Intrinsics.checkNotNullParameter(object, (String)object2);
                    object2 = LayoutInflater.from((Context)object.getContext());
                    object = object2.inflate(n3, object, false);
                    n4 = R$layout.pdp_freebie_item;
                    if (n3 != n4) break block2;
                    Intrinsics.checkNotNull(object);
                    object2 = this.b;
                    jg2_02 = new lx0_1((View)object, object2);
                    break block3;
                }
                n4 = R$layout.pdp_freebie_product_item;
                if (n3 != n4) break block4;
                Intrinsics.checkNotNull(object);
                jg2_02 = new mx0_1((View)object);
            }
            return jg2_02;
        }
        object = new IllegalArgumentException("Layout is undefined");
        throw object;
    }
}

