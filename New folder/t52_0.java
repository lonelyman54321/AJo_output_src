/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.fragment.app.Fragment;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from t52
 */
public final class t52_0
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t52_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        Object object = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                return ((kn1_1)((List)object).get(0)).getClassifier();
            }
            case 0: 
        }
        Object object2 = v52_0.Companion;
        object = (v52_0)object;
        Intrinsics.checkNotNullParameter(object, "this$0");
        object = ((Fragment)object).requireActivity().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(object, "getApplicationContext(...)");
        object2 = new jo_2((Context)object);
        return object2;
    }
}

