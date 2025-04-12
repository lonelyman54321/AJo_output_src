/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from dx3
 */
public final class dx3_0
implements Function0 {
    public final /* synthetic */ fx3_0 a;

    public /* synthetic */ dx3_0(fx3_0 fx3_02) {
        this.a = fx3_02;
    }

    public final Object invoke() {
        Object object = this.a;
        String string2 = ((fx3_0)object).f;
        String string3 = ((fx3_0)object).j.a;
        int n3 = string3.length() + 3;
        int n4 = 47;
        String string4 = null;
        int n7 = 4;
        int n8 = StringsKt.N(string2, (char)n4, n3, false, n7);
        if (n8 == (n3 = -1)) {
            object = "";
        } else {
            object = ((fx3_0)object).f;
            n4 = StringsKt.N((CharSequence)object, '#', n8, false, n7);
            string4 = "substring(...)";
            if (n4 == n3) {
                object = ((String)object).substring(n8);
                Intrinsics.checkNotNullExpressionValue(object, string4);
            } else {
                object = ((String)object).substring(n8, n4);
                Intrinsics.checkNotNullExpressionValue(object, string4);
            }
        }
        return object;
    }
}

