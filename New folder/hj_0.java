/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from hJ
 */
public final class hj_0
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hj_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        Object object = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (fx3_0)object;
                String string2 = ((fx3_0)object).e;
                if (string2 == null) {
                    object = null;
                } else {
                    n3 = string2.length();
                    if (n3 == 0) {
                        object = "";
                    } else {
                        n3 = ((fx3_0)object).j.a.length() + 3;
                        object = ((fx3_0)object).f;
                        n3 = StringsKt.N((CharSequence)object, ':', n3, false, 4) + 1;
                        char c2 = '@';
                        int n4 = StringsKt.N((CharSequence)object, c2, 0, false, 6);
                        object = ((String)object).substring(n3, n4);
                        string2 = "substring(...)";
                        Intrinsics.checkNotNullExpressionValue(object, string2);
                    }
                }
                return object;
            }
            case 0: 
        }
        ti_1 ti_12 = ti_1.n;
        return TI$b.a(((jJ)object).f);
    }
}

