/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.customviews.widgets.AjioProgressView;
import com.ril.ajio.data.repo.DataCallback;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class v23
implements F62 {
    public final /* synthetic */ B23 a;

    public /* synthetic */ v23(B23 b23) {
        this.a = b23;
    }

    public final void onChanged(Object object) {
        object = (DataCallback)object;
        Object object2 = B23.Companion;
        object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        object2.getClass();
        cp$a cp$a = cp_1.Companion;
        int n3 = nn_2.b(cp$a, (DataCallback)object);
        if (n3 != 0) {
            Intrinsics.checkNotNull(object);
            n3 = ((DataCallback)object).getStatus();
            if (n3 != 0) {
                int n4 = 1;
                if (n3 == n4) {
                    object = ((B23)object2).Ra().fswmdProgressView;
                    ((AjioProgressView)((Object)object)).dismiss();
                }
            } else {
                object2 = ((B23)object2).c;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("sharedWithMeViewModel");
                    object2 = null;
                }
                object = ((DataCallback)object).getData();
                Intrinsics.checkNotNull(object);
                object = (List)object;
                ((w23_0)object2).b((List)object);
            }
        }
    }
}

