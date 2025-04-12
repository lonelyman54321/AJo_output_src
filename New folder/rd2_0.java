/*
 * Decompiled with CFR 0.152.
 */
import androidx.core.widget.NestedScrollView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from rD2
 */
public final class rd2_0
implements Function2 {
    public final /* synthetic */ wd2_0 a;

    public /* synthetic */ rd2_0(wd2_0 wd2_02) {
        this.a = wd2_02;
    }

    public final Object invoke(Object object, Object object2) {
        object = (Float)object;
        float f5 = ((Float)object).floatValue();
        object2 = (Float)object2;
        float f6 = ((Float)object2).floatValue();
        Object object3 = this.a;
        String string2 = "this$0";
        Intrinsics.checkNotNullParameter(object3, string2);
        object3 = ((wd2_0)object3).u;
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("scrollView");
            object3 = null;
        }
        int n3 = (int)f5;
        int n4 = (int)f6;
        int n7 = object3.getScrollX();
        n3 -= n7;
        n7 = object3.getScrollY();
        ((NestedScrollView)object3).p(n3, n4 -= n7, false);
        return Unit.a;
    }
}

