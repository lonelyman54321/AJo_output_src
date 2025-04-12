/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.customviews.widgets.AjioProgressView;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Product.ProductOptionItem;
import kotlin.jvm.internal.Intrinsics;

public final class y23
implements F62 {
    public final /* synthetic */ B23 a;

    public /* synthetic */ y23(B23 b23) {
        this.a = b23;
    }

    public final void onChanged(Object object) {
        object = (DataCallback)object;
        Object object2 = B23.Companion;
        object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        object2.getClass();
        cp$a cp$a = cp_1.Companion;
        boolean bl2 = nn_2.b(cp$a, (DataCallback)object);
        if (bl2) {
            Intrinsics.checkNotNull(object);
            int n3 = ((DataCallback)object).getStatus();
            if (n3 == 0) {
                object = ((B23)object2).c;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("sharedWithMeViewModel");
                    n3 = 0;
                    object = null;
                }
                object = ((w23_0)object).o;
                ((B23)object2).Oa((ProductOptionItem)object);
            }
            if ((object = ((B23)object2).Ra().fswmdProgressView) != null) {
                object = ((B23)object2).Ra().fswmdProgressView;
                ((AjioProgressView)((Object)object)).dismiss();
            }
        }
    }
}

