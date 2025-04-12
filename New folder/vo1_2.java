/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from vO1
 */
public final class vo1_2
implements tx1_2 {
    public final int a;
    public final int b;
    public final tx1_2 c;

    public vo1_2(tx1_2 object, int n3) {
        if ((n3 &= 4) != 0) {
            object = tx1$a_0.a;
            String string2 = "<this>";
            Intrinsics.checkNotNullParameter(object, string2);
            object = new yx1_2();
        }
        Intrinsics.checkNotNullParameter(object, "delegate");
        this.a = 4000;
        this.b = 3000;
        this.c = object;
    }

    public final void a(String string2) {
        tx1_2 tx1_22;
        String string3 = "message";
        Intrinsics.checkNotNullParameter(string2, string3);
        while (true) {
            int n3 = string2.length();
            tx1_22 = this.c;
            int n4 = this.a;
            if (n3 <= n4) break;
            n3 = 0;
            string3 = null;
            String string4 = string2.substring(0, n4);
            String string5 = "substring(...)";
            Intrinsics.checkNotNullExpressionValue(string4, string5);
            int n7 = StringsKt.Q(string4, '\n', 0, 6);
            int n8 = this.b;
            if (n7 >= n8) {
                string4 = string4.substring(0, n7);
                Intrinsics.checkNotNullExpressionValue(string4, string5);
                n4 = n7 + 1;
            }
            tx1_22.a(string4);
            string2 = string2.substring(n4);
            Intrinsics.checkNotNullExpressionValue(string2, string5);
        }
        tx1_22.a(string2);
    }
}

