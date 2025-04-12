/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ed2
 */
public final class ed2_2
implements Function1 {
    public final /* synthetic */ Sl a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ ed2_2(Sl sl, o8_0 o8_02) {
        this.a = sl;
        this.b = o8_02;
    }

    public final Object invoke(Object object) {
        int n3 = (Integer)object;
        Sl sl = this.a;
        Intrinsics.checkNotNullParameter(sl, "$annotatedText");
        Function0 function0 = this.b;
        Intrinsics.checkNotNullParameter(function0, "$onLinkButtonClicked");
        String string2 = "URL";
        object = (Sl$b)CollectionsKt.firstOrNull(sl.c(n3, n3, string2));
        if (object != null) {
            function0.invoke();
        }
        return Unit.a;
    }
}

