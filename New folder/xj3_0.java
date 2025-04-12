/*
 * Decompiled with CFR 0.152.
 */
import com.clevertap.android.sdk.b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from xj3
 */
public final class xj3_0 {
    public static final ArrayList d;
    public final b a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;

    static {
        ArrayList arrayList;
        d = arrayList = new ArrayList();
    }

    public xj3_0(LinkedHashSet linkedHashMap, b b2) {
        Intrinsics.checkNotNullParameter(linkedHashMap, "templates");
        LinkedHashMap<Object, b> linkedHashMap2 = "logger";
        Intrinsics.checkNotNullParameter(b2, (String)((Object)linkedHashMap2));
        this.a = b2;
        int n3 = eh1_2.c(yx_2.o((Iterable)((Object)linkedHashMap), 10));
        int n4 = 16;
        if (n3 < n4) {
            n3 = 16;
        }
        linkedHashMap2 = new LinkedHashMap<Object, b>(n3);
        linkedHashMap = linkedHashMap.iterator();
        while ((n3 = (int)(linkedHashMap.hasNext() ? 1 : 0)) != 0) {
            b2 = linkedHashMap.next();
            ((eg0)((Object)b2)).getClass();
            linkedHashMap2.put(null, b2);
        }
        this.b = linkedHashMap2;
        this.c = linkedHashMap = new LinkedHashMap();
    }
}

