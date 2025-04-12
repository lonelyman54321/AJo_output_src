/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ril.ajio.data.repo.DataCallback;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from zW1
 */
public final class zw1_0
implements Function1 {
    public final /* synthetic */ ex1_0 a;

    public /* synthetic */ zw1_0(ex1_0 ex1_02) {
        this.a = ex1_02;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invoke(Object object) {
        Exception exception2;
        Object object2;
        block3: {
            int n3;
            Object object3;
            block2: {
                int n4;
                object = (DataCallback)object;
                object2 = this.a;
                Intrinsics.checkNotNullParameter(object2, "this$0");
                object3 = cp_1.Companion;
                n3 = nn_2.b((cp$a)object3, (DataCallback)object);
                if (n3 == 0) return Unit.a;
                ((ex1_0)object2).Xa();
                object3 = ((DataCallback)object).getData();
                if (object3 == null) return Unit.a;
                object = ((DataCallback)object).getData();
                Intrinsics.checkNotNull(object);
                object = (List)object;
                object3 = ((Fragment)object2).getParentFragment();
                if (object3 == null) return Unit.a;
                n3 = ((Fragment)object3).isAdded();
                if (n3 != (n4 = 1)) return Unit.a;
                n3 = ((Fragment)object2).isAdded();
                if (n3 == 0) return Unit.a;
                try {
                    object3 = ((ex1_0)object2).R;
                    if (object3 == null) return Unit.a;
                    ((ep_0)object3).b = object;
                    object = ((ex1_0)object2).t;
                    if (object != null) break block2;
                    object = "cartViewModel";
                    Intrinsics.throwUninitializedPropertyAccessException((String)object);
                    object = null;
                }
                catch (Exception exception2) {
                    break block3;
                }
            }
            ((ep_0)object3).a = object = ((wx1_1)object).a1;
            ((ep_0)object3).c = object = ((ex1_0)object2).q0;
            object = new io_2();
            object3 = ((ex1_0)object2).F0;
            String string2 = ((ex1_0)object2).G0;
            String string3 = "prevScreen";
            Intrinsics.checkNotNullParameter(object3, string3);
            string3 = "prevScreenType";
            Intrinsics.checkNotNullParameter(string2, string3);
            ((io_2)object).f = object3;
            ((io_2)object).g = string2;
            n3 = 1002;
            ((Fragment)object).setTargetFragment((Fragment)object2, n3);
            object2 = ((Fragment)object2).requireParentFragment();
            object2 = ((Fragment)object2).getChildFragmentManager();
            object3 = "Size Update Dialog";
            ((DialogFragment)object).show((FragmentManager)object2, (String)object3);
            return Unit.a;
        }
        object2 = yn3_0.a;
        ((yn3$a)object2).e(exception2);
        return Unit.a;
    }
}

