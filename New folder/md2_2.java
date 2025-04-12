/*
 * Decompiled with CFR 0.152.
 */
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from md2
 */
public final class md2_2
implements Function0 {
    public final /* synthetic */ qz1_2 a;

    public /* synthetic */ md2_2(qz1_2 qz1_22) {
        this.a = qz1_22;
    }

    public final Object invoke() {
        qz1_2 qz1_22 = this.a;
        Intrinsics.checkNotNullParameter(qz1_22, "$viewModel");
        qz1_22.getClass();
        LinkedHashMap<Boolean, Object> linkedHashMap = new LinkedHashMap<Boolean, Object>();
        Boolean bl2 = Boolean.FALSE;
        linkedHashMap.put(bl2, null);
        qz1_22.w.setValue(linkedHashMap);
        return Unit.a;
    }
}

