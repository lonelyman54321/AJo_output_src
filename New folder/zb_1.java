/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.Fragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from zB
 */
public final class zb_1
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zb_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        Object object = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object2 = dc0_1.Companion;
                object2 = "this$0";
                object = (dc0_1)object;
                Intrinsics.checkNotNullParameter(object, (String)object2);
                object = ((Fragment)object).getArguments();
                if (object != null) {
                    object2 = "IS_FROM_JOUNRNEY";
                    object = object.getString((String)object2);
                } else {
                    object = null;
                }
                return object;
            }
            case 0: 
        }
        object = (Function0)object;
        Intrinsics.checkNotNullParameter(object, "$onSearchClick");
        object.invoke();
        return Unit.a;
    }
}

