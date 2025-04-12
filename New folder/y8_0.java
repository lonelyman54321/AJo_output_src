/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import com.ril.ajio.data.repo.DataCallback;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from y8
 */
public final class y8_0
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y8_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        Object object2 = this.b;
        Object object3 = "this$0";
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (DataCallback)object;
                object2 = (op2_2)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object3);
                ((op2_2)object2).r.k(object);
                return Unit.a;
            }
            case 0: 
        }
        object = (List)object;
        Object object4 = q9_0.Companion;
        object2 = (q9_0)object2;
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        if (object != null) {
            object3 = ((b52_0)((q9_0)object2).Q0.getValue()).e;
            object4 = ((Fragment)object2).getViewLifecycleOwner();
            a9_0 a9_02 = new a9_0((List)object, (q9_0)object2);
            object = new c9_0(a9_02);
            ((LiveData)object3).e((mu1_1)object4, (F62)object);
        }
        return Unit.a;
    }
}

