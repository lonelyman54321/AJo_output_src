/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from kt
 */
public final class kt_1
implements Function1 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ String c;

    public /* synthetic */ kt_1(boolean bl2, tt_0 tt_02, String string2) {
        this.a = bl2;
        this.b = tt_02;
        this.c = string2;
    }

    public final Object invoke(Object object) {
        object = (Boolean)object;
        object.getClass();
        Function1 function1 = this.b;
        Intrinsics.checkNotNullParameter(function1, "$onCheckBoxPressed");
        String string2 = this.c;
        String string3 = "$loginToast";
        Intrinsics.checkNotNullParameter(string2, string3);
        boolean bl2 = this.a;
        if (bl2) {
            function1.invoke(object);
        } else {
            object = null;
            int n3 = 1;
            hv3_0.o0(n3, string2, null);
        }
        return Unit.a;
    }
}

