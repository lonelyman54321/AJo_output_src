/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from QP0
 */
public final class qp0_0
implements Function0 {
    public final /* synthetic */ fq0_2 a;

    public /* synthetic */ qp0_0(fq0_2 fq0_22) {
        this.a = fq0_22;
    }

    public final Object invoke() {
        fq0$b_0 fq0$b_0 = null;
        Object object = fq0_2.Companion;
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = ((fq0_2)object).q;
        Object object3 = null;
        Object object4 = "fleekViewModel";
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            object2 = null;
        }
        object2 = ((dr0_0)object2).A0.e;
        Object object5 = new rp0_1((fq0_2)object);
        Object object6 = new fq0$b_0((Function1)object5);
        ((LiveData)object2).e((mu1_1)object, (F62)object6);
        object2 = ((fq0_2)object).q;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            object2 = null;
        }
        object2 = ((dr0_0)object2).A0.g;
        object5 = new sp0_1(object, 0);
        object6 = new fq0$b_0((Function1)object5);
        ((LiveData)object2).e((mu1_1)object, (F62)object6);
        object2 = ((fq0_2)object).q;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            object2 = null;
        }
        object2 = ((dr0_0)object2).E0;
        object5 = ((Fragment)object).getViewLifecycleOwner();
        object6 = new tp0_1(object, 0);
        fq0$b_0 fq0$b_02 = new fq0$b_0((Function1)object6);
        ((LiveData)object2).e((mu1_1)object5, fq0$b_02);
        object2 = ((fq0_2)object).q;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
        } else {
            object3 = object2;
        }
        object2 = ((dr0_0)object3).p;
        object3 = new wp0_1(object, 0);
        object4 = new fq0$b_0((Function1)object3);
        ((LiveData)object2).e((mu1_1)object, (F62)object4);
        object2 = ((F12)((fq0_2)object).C.getValue()).d.f;
        object3 = new up0_0(object, 0);
        object4 = new fq0$b_0((Function1)object3);
        ((LiveData)object2).e((mu1_1)object, (F62)object4);
        object2 = ((fq0_2)object).Pa().i;
        object3 = new vp0_1(object, 0);
        fq0$b_0 = new fq0$b_0((Function1)object3);
        ((R53)object2).e((mu1_1)object, fq0$b_0);
        return Unit.a;
    }
}

