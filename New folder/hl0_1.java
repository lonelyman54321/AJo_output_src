/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from HL0
 */
public final class hl0_1 {
    public final boolean a;
    public final boolean b;
    public final hn2_2 c;
    public final Long d;
    public final Long e;
    public final Long f;
    public final Long g;
    public final Map h;

    public /* synthetic */ hl0_1(boolean bl2, boolean bl3, hn2_2 hn2_22, Long l2, Long l3, Long l4, Long l7) {
        nz0_2 nz0_22 = fh1_2.f();
        this(bl2, bl3, hn2_22, l2, l3, l4, l7, nz0_22);
    }

    public hl0_1(boolean bl2, boolean bl3, hn2_2 hn2_22, Long l2, Long l3, Long l4, Long l7, Map map2) {
        Map map3;
        Intrinsics.checkNotNullParameter(map2, "extras");
        this.a = bl2;
        this.b = bl3;
        this.c = hn2_22;
        this.d = l2;
        this.e = l3;
        this.f = l4;
        this.g = l7;
        this.h = map3 = fh1_2.o(map2);
    }

    public final String toString() {
        boolean bl2;
        StringBuilder stringBuilder;
        String string2;
        Object object;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        boolean bl3 = this.a;
        if (bl3) {
            object = "isRegularFile";
            arrayList.add(object);
        }
        if (bl3 = this.b) {
            object = "isDirectory";
            arrayList.add(object);
        }
        if ((object = this.d) != null) {
            string2 = "byteCount=";
            stringBuilder = new StringBuilder(string2);
            stringBuilder.append(object);
            object = stringBuilder.toString();
            arrayList.add(object);
        }
        if ((object = this.e) != null) {
            string2 = "createdAt=";
            stringBuilder = new StringBuilder(string2);
            stringBuilder.append(object);
            object = stringBuilder.toString();
            arrayList.add(object);
        }
        if ((object = this.f) != null) {
            string2 = "lastModifiedAt=";
            stringBuilder = new StringBuilder(string2);
            stringBuilder.append(object);
            object = stringBuilder.toString();
            arrayList.add(object);
        }
        if ((object = this.g) != null) {
            string2 = "lastAccessedAt=";
            stringBuilder = new StringBuilder(string2);
            stringBuilder.append(object);
            object = stringBuilder.toString();
            arrayList.add(object);
        }
        if (bl2 = (object = this.h).isEmpty() ^ true) {
            string2 = "extras=";
            stringBuilder = new StringBuilder(string2);
            stringBuilder.append(object);
            object = stringBuilder.toString();
            arrayList.add(object);
        }
        return CollectionsKt.R(arrayList, ", ", "FileMetadata(", ")", null, 56);
    }
}

