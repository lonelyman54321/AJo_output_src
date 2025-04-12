/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.fragment.app.Fragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from WP0
 */
public final class wp0_1
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wp0_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        Object object2 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (UY2)object;
                object2 = (String)object2;
                Intrinsics.checkNotNullParameter(object2, "$phone");
                Intrinsics.checkNotNullParameter(object, "$this$semantics");
                cp_1.Companion.getClass();
                object2 = cp$a.B((String)object2);
                RY2.e((UY2)object, (String)object2);
                return Unit.a;
            }
            case 0: 
        }
        object = (String)object;
        Object object3 = fq0_2.Companion;
        object2 = (fq0_2)object2;
        object3 = "this$0";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        if (object != null) {
            n13_0.Companion.getClass();
            object3 = N13$a.a();
            Object object4 = ((fq0_2)object2).q;
            if (object4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fleekViewModel");
                object4 = null;
            }
            object4 = ((dr0_0)object4).q;
            Context context = ((Fragment)object2).requireContext();
            Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
            kq0_0 kq0_02 = new kq0_0((fq0_2)object2, (String)object);
            ((n13_0)object3).a((String)object4, context, kq0_02);
        }
        return Unit.a;
    }
}

