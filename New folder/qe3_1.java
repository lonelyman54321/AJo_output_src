/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from qe3
 */
public final class qe3_1
extends d63_0 {
    public final String b;
    public final int c;

    public qe3_1(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string3, "errorMsg");
        super(string2, string3);
        this.b = string2;
        this.c = 0;
    }

    public final boolean a() {
        String string2 = this.b;
        int n3 = string2 != null && (string2 = ((Object)StringsKt.m0(string2)).toString()) != null ? string2.length() : -1;
        int n4 = this.c;
        int n7 = 1;
        if (n3 <= n4) {
            n3 = 1;
        } else {
            n3 = 0;
            string2 = null;
        }
        if (n3 != 0) {
            ak2_1.b();
        }
        return (n3 ^ n7) != 0;
    }
}

