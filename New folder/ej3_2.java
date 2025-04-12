/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from EJ3
 */
public final class ej3_2 {
    public final hn2_2 a;
    public final boolean b;
    public final long c;
    public final long d;
    public final int e;
    public final Long f;
    public final long g;
    public final ArrayList h;

    public /* synthetic */ ej3_2(hn2_2 hn2_22) {
        this(hn2_22, true, "", -1, -1, -1, null, -1);
    }

    public ej3_2(hn2_2 arrayList, boolean bl2, String string2, long l2, long l3, int n3, Long l4, long l7) {
        Intrinsics.checkNotNullParameter(arrayList, "canonicalPath");
        Intrinsics.checkNotNullParameter(string2, "comment");
        this.a = arrayList;
        this.b = bl2;
        this.c = l2;
        this.d = l3;
        this.e = n3;
        this.f = l4;
        this.g = l7;
        this.h = arrayList = new ArrayList();
    }
}

