/*
 * Decompiled with CFR 0.152.
 */
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.customviews.widgets.AjioProgressView;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Product.Product;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class u23
implements F62 {
    public final /* synthetic */ B23 a;

    public /* synthetic */ u23(B23 b23) {
        this.a = b23;
    }

    public final void onChanged(Object object) {
        object = (DataCallback)object;
        Object object2 = B23.Companion;
        object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        object2.getClass();
        Object object3 = cp_1.Companion;
        boolean bl2 = nn_2.b((cp$a)object3, (DataCallback)object);
        if (bl2) {
            Intrinsics.checkNotNull(object);
            int n3 = ((DataCallback)object).getStatus();
            if (n3 == 0) {
                Iterator iterator;
                object = ((B23)object2).f;
                bl2 = false;
                object3 = null;
                if (object != null) {
                    List list;
                    iterator = L23.a(ex_2.B(((m23_0)object).e));
                    Object object4 = "reversed(...)";
                    Intrinsics.checkNotNullExpressionValue(iterator, (String)object4);
                    iterator = iterator.iterator();
                    while (true) {
                        int n4 = iterator.hasNext();
                        list = ((m23_0)object).a;
                        if (n4 == 0) break;
                        object4 = (Integer)iterator.next();
                        if (list == null) continue;
                        Intrinsics.checkNotNull(object4);
                        n4 = (Integer)object4;
                        object4 = (Product)list.remove(n4);
                    }
                    ((RecyclerView$f)object).notifyDataSetChanged();
                    if (list != null) {
                        n3 = list.size();
                    } else {
                        n3 = 0;
                        object = null;
                    }
                    object = n3;
                } else {
                    n3 = 0;
                    object = null;
                }
                iterator = ((B23)object2).d;
                if (iterator == null) {
                    iterator = "sharedWithMeDetailListener";
                    Intrinsics.throwUninitializedPropertyAccessException(iterator);
                } else {
                    object3 = iterator;
                }
                object3.F0();
                object3 = ((B23)object2).Ra().fswmdProgressView;
                ((AjioProgressView)((Object)object3)).dismiss();
                if (object != null && (n3 = ((Integer)object).intValue()) == 0) {
                    ((B23)object2).Qa();
                }
            } else {
                object = ((B23)object2).Ra().fswmdProgressView;
                ((AjioProgressView)((Object)object)).dismiss();
            }
        }
    }
}

