/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from y22
 */
public final class y22_0
implements Function1 {
    public final /* synthetic */ q22_0 a;

    public /* synthetic */ y22_0(q22_0 q22_02) {
        this.a = q22_02;
    }

    public final Object invoke(Object object) {
        boolean bl2;
        object = (Boolean)object;
        String string2 = "this$0";
        q22_0 q22_02 = this.a;
        Intrinsics.checkNotNullParameter(q22_02, string2);
        if (object != null && (bl2 = ((Boolean)object).booleanValue())) {
            object = q22_02.i;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("clearAllFilterBottomSheetFragment");
                bl2 = false;
                object = null;
            }
            ((BottomSheetDialogFragment)object).dismiss();
        }
        return Unit.a;
    }
}

