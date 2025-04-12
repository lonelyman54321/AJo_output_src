/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ke1
 */
public final class ke1_2 {
    public final List a;

    public ke1_2() {
        ArrayList arrayList = new ArrayList();
        this(arrayList);
    }

    public ke1_2(List list) {
        Intrinsics.checkNotNullParameter(list, "mutablePlugins");
        this.a = list;
    }
}

