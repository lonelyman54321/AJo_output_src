/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ril.ajio.data.repo.DataCallback;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from lD2
 */
public final class ld2_0
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ld2_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3;
        Object object2;
        int n4 = this.a;
        switch (n4) {
            default: {
                object = (UY2)object;
                String string2 = (String)this.b;
                Intrinsics.checkNotNullParameter(string2, "$contentDes");
                Intrinsics.checkNotNullParameter(object, "$this$semantics");
                RY2.e((UY2)object, string2);
                return Unit.a;
            }
            case 0: 
        }
        object = (DataCallback)object;
        wd2_0 wd2_02 = (wd2_0)this.b;
        Intrinsics.checkNotNullParameter(wd2_02, "this$0");
        Object object3 = wd2_02.a;
        if (object3 != null && (object3 = ((gE2)object3).a) != null) {
            object2 = wd2_02.q;
            ((LiveData)object3).i(object2);
        }
        if ((n3 = nn_2.b((cp$a)(object3 = cp_1.Companion), (DataCallback)object)) != 0) {
            int n7;
            object3 = (qf3)((DataCallback)object).getData();
            object2 = null;
            if (object3 != null) {
                object3 = ((qf3)object3).a;
            } else {
                n3 = 0;
                object3 = null;
            }
            object = (qf3)((DataCallback)object).getData();
            if (object != null) {
                object2 = ((qf3)object).b;
            }
            if (object3 != null && (n7 = ((DataCallback)object3).getStatus()) == 0 && object2 != null && (n7 = ((DataCallback)object2).getStatus()) == 0) {
                wd2_02.db();
                wd2_02.Va();
            } else {
                n7 = 1;
                if (object3 != null && (n3 = ((DataCallback)object3).getStatus()) == n7) {
                    object = wd2_02.a;
                    if (object != null && (object = ((gE2)object).b) != null) {
                        object3 = Boolean.FALSE;
                        ((LiveData)object).i(object3);
                    }
                    wd2_02.dismiss();
                } else if (object2 != null && (n3 = ((DataCallback)object2).getStatus()) == n7) {
                    object = wd2_02.a;
                    if (object != null && (object = ((gE2)object).b) != null) {
                        object3 = Boolean.FALSE;
                        ((LiveData)object).i(object3);
                    }
                    wd2_02.dismiss();
                }
            }
        }
        return Unit.a;
    }
}

