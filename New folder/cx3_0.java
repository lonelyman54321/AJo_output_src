/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from cx3
 */
public final class cx3_0
implements Function0 {
    public final /* synthetic */ fx3_0 a;

    public /* synthetic */ cx3_0(fx3_0 fx3_02) {
        this.a = fx3_02;
    }

    public final Object invoke() {
        Object object = this.a;
        String string2 = ((fx3_0)object).f;
        int n3 = 6;
        int n4 = 63;
        String string3 = null;
        int n7 = StringsKt.N(string2, (char)n4, 0, false, n3) + 1;
        if (n7 == 0) {
            object = "";
        } else {
            object = ((fx3_0)object).f;
            n3 = StringsKt.N((CharSequence)object, '#', n7, false, 4);
            n4 = -1;
            string3 = "substring(...)";
            if (n3 == n4) {
                object = ((String)object).substring(n7);
                Intrinsics.checkNotNullExpressionValue(object, string3);
            } else {
                object = ((String)object).substring(n7, n3);
                Intrinsics.checkNotNullExpressionValue(object, string3);
            }
        }
        return object;
    }
}

