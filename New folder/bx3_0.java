/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from bx3
 */
public final class bx3_0
implements Function0 {
    public final /* synthetic */ List a;
    public final /* synthetic */ fx3_0 b;

    public /* synthetic */ bx3_0(ArrayList arrayList, fx3_0 fx3_02) {
        this.a = arrayList;
        this.b = fx3_02;
    }

    public final Object invoke() {
        Object object = this.a;
        boolean bl2 = object.isEmpty();
        Object object2 = "";
        if (!bl2) {
            object = this.b;
            String string2 = ((fx3_0)object).f;
            String string3 = ((fx3_0)object).j.a;
            int n3 = string3.length() + 3;
            char c2 = '/';
            int n4 = 4;
            int n7 = StringsKt.N(string2, c2, n3, false, n4);
            if (n7 != (n3 = -1)) {
                Object object3 = object2 = (Object)new char[2];
                object3[0] = 63;
                object3[1] = 35;
                object = ((fx3_0)object).f;
                int n8 = StringsKt.P((CharSequence)object, (char[])object2, n7);
                String string4 = "substring(...)";
                if (n8 == n3) {
                    object2 = ((String)object).substring(n7);
                    Intrinsics.checkNotNullExpressionValue(object2, string4);
                } else {
                    object2 = ((String)object).substring(n7, n8);
                    Intrinsics.checkNotNullExpressionValue(object2, string4);
                }
            }
        }
        return object2;
    }
}

