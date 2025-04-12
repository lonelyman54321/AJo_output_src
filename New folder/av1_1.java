/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from av1
 */
public final class av1_1
extends d63_0 {
    public final List b;
    public final int c;

    public av1_1(ArrayList arrayList, String string2) {
        Intrinsics.checkNotNullParameter(string2, "errorMsg");
        super(arrayList, string2);
        this.b = arrayList;
        this.c = 3;
    }

    public final boolean a() {
        int n3;
        int n4;
        int n7 = 1;
        List list = this.b;
        if (list != null && (n4 = list.size()) == (n3 = this.c)) {
            n4 = 0;
            list = null;
        } else {
            n4 = 1;
        }
        if (n4 != 0) {
            ak2_1.b();
        }
        return (n7 ^ n4) != 0;
    }
}

