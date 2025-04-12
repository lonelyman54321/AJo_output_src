/*
 * Decompiled with CFR 0.152.
 */
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from nB
 */
public final class nb_1
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nb_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        int n3 = this.a;
        switch (n3) {
            default: {
                qz1_2 qz1_22 = (qz1_2)this.b;
                Intrinsics.checkNotNullParameter(qz1_22, "$viewModel");
                qz1_22.getClass();
                LinkedHashMap<Boolean, Object> linkedHashMap = new LinkedHashMap<Boolean, Object>();
                Boolean bl2 = Boolean.FALSE;
                linkedHashMap.put(bl2, null);
                qz1_22.w.setValue(linkedHashMap);
                return Unit.a;
            }
            case 0: 
        }
        Function0 function0 = (Function0)this.b;
        Intrinsics.checkNotNullParameter(function0, "$onBackClicked");
        function0.invoke();
        return Unit.a;
    }
}

