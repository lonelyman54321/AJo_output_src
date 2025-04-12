/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from ex3
 */
public final class ex3_0
implements Function0 {
    public final /* synthetic */ fx3_0 a;

    public /* synthetic */ ex3_0(fx3_0 fx3_02) {
        this.a = fx3_02;
    }

    public final Object invoke() {
        Object object = this.a;
        String string2 = ((fx3_0)object).d;
        if (string2 == null) {
            object = null;
        } else {
            int n3 = string2.length();
            if (n3 == 0) {
                object = "";
            } else {
                n3 = ((fx3_0)object).j.a.length() + 3;
                char[] cArray = new char[]{':', '@'};
                object = ((fx3_0)object).f;
                int n4 = StringsKt.P((CharSequence)object, cArray, n3);
                object = ((String)object).substring(n3, n4);
                string2 = "substring(...)";
                Intrinsics.checkNotNullExpressionValue(object, string2);
            }
        }
        return object;
    }
}

