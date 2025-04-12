/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Home.NavigationParent;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from MV1
 */
public final class mv1_2
implements F62 {
    public final /* synthetic */ qv1_2 a;

    public /* synthetic */ mv1_2(qv1_2 qv1_22) {
        this.a = qv1_22;
    }

    public final void onChanged(Object object) {
        int n3;
        object = (DataCallback)object;
        Object object2 = qv1_2.Companion;
        object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        Object object3 = ((qv1_2)object2).L;
        if (object3 != null) {
            object3.stopLoader();
        }
        if ((n3 = nn_2.b((cp$a)(object3 = cp_1.Companion), (DataCallback)object)) != 0 && object != null && (n3 = ((DataCallback)object).getStatus()) == 0) {
            ((qv1_2)object2).j = object = (NavigationParent)((DataCallback)object).getData();
            object3 = ((qv1_2)object2).l;
            if (object3 == null) {
                object3 = ((qv1_2)object2).Q;
                ((qv1_2)object2).Va((NavigationParent)object, (String)object3);
            }
        }
    }
}

