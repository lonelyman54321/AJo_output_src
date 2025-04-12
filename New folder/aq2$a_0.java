/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from aQ2$a
 */
public final class aq2$a_0 {
    public final List a;
    public int b;

    public aq2$a_0(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "routes");
        this.a = arrayList;
    }

    public final boolean a() {
        int n3 = this.b;
        List list = this.a;
        int n4 = list.size();
        n3 = n3 < n4 ? 1 : 0;
        return n3 != 0;
    }
}

