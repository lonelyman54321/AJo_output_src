/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.FacetValue;
import com.ril.ajio.services.data.user.AppliedFacetValue;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from xW1
 */
public final class xw1_0
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xw1_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (AppliedFacetValue)object;
                FacetValue facetValue = (FacetValue)this.b;
                Intrinsics.checkNotNullParameter(facetValue, "$appliedFilterItem");
                Intrinsics.checkNotNullParameter(object, "userAppliedFilterItem");
                String string2 = facetValue.getCode();
                object = ((AppliedFacetValue)object).getFacetValue();
                object = object != null ? ((FacetValue)object).getCode() : null;
                return Intrinsics.areEqual(string2, object);
            }
            case 0: 
        }
        object = (DataCallback)object;
        ex1_0 ex1_02 = (ex1_0)this.b;
        Intrinsics.checkNotNullParameter(ex1_02, "this$0");
        Object object2 = cp_1.Companion;
        boolean bl2 = nn_2.b((cp$a)object2, (DataCallback)object);
        if (bl2) {
            ex1_02.Xa();
            object2 = ex1_02.getActivity();
            if (object2 != null && !(bl2 = object2.isFinishing())) {
                object = (HashMap)((DataCallback)object).getData();
                object2 = ex1_02.x0;
                Object object3 = null;
                if (object2 != null) {
                    ((qm_1)object2).a = null;
                    ((qm_1)object2).b = null;
                    ((qm_1)object2).c = false;
                    ((qm_1)object2).d = false;
                }
                if (object2 != null) {
                    ((qm_1)object2).a = object;
                }
                if ((object = ex1_02.p) == null) {
                    object = "cartClosetListener";
                    Intrinsics.throwUninitializedPropertyAccessException((String)object);
                } else {
                    object3 = object;
                }
                object = object3.e1();
                if (object != null) {
                    n3 = 4;
                    object.H5(n3);
                }
            }
        }
        return Unit.a;
    }
}

