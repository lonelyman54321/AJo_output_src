/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from CR0
 */
public final class cr0_1
implements o60_0 {
    public final /* synthetic */ Function1 a;

    public /* synthetic */ cr0_1(br0_1 br0_12) {
        this.a = br0_12;
    }

    public final void accept(Object object) {
        Function1 function1 = this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }
}

