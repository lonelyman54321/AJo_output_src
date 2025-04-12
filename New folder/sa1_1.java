/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 */
import android.app.Application;
import androidx.fragment.app.Fragment;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext$Element;
import kotlin.coroutines.CoroutineContext$Element$a;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.coroutines.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.c;

/*
 * Renamed from sa1
 */
public final class sa1_1
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sa1_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        Object object = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object2 = ld3_1.Companion;
                object = (ld3_1)object;
                Intrinsics.checkNotNullParameter(object, "this$0");
                object = ((Fragment)object).requireActivity().getApplication();
                Intrinsics.checkNotNullExpressionValue(object, "getApplication(...)");
                object2 = new e43_0((Application)object);
                return object2;
            }
            case 0: 
        }
        CoroutineContext coroutineContext = new xl1_2(null);
        Object object3 = C90$a.a;
        Object object4 = new a((CoroutineContext$a)object3);
        coroutineContext = CoroutineContext$Element$a.d((CoroutineContext)object4, (CoroutineContext$Element)coroutineContext);
        object = (ta1_1)object;
        object3 = (c)((ta1_1)object).b.getValue();
        coroutineContext = coroutineContext.plus((CoroutineContext)object3);
        object4 = new StringBuilder();
        object = ((ta1_1)object).a;
        object = h30_0.a((StringBuilder)object4, (String)object, "-context");
        object3 = new h90_0((String)object);
        return coroutineContext.plus((CoroutineContext)object3);
    }
}

