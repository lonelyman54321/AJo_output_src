/*
 * Decompiled with CFR 0.152.
 */
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from df1
 */
public final class df1_1 {
    public final kd3_0 a;
    public final uv_0 b;
    public final Locale c;
    public final LinkedHashMap d;
    public int e;

    public df1_1(kd3_0 linkedHashMap) {
        String string2 = "storeRegistry";
        Intrinsics.checkNotNullParameter(linkedHashMap, string2);
        UV$a$a uV$a$a = UV$a.a;
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        Intrinsics.checkNotNullParameter(linkedHashMap, string2);
        Intrinsics.checkNotNullParameter(uV$a$a, "clock");
        Intrinsics.checkNotNullParameter(locale, "locale");
        this.a = linkedHashMap;
        this.b = uV$a$a;
        this.c = locale;
        this.d = linkedHashMap = new LinkedHashMap();
    }

    public final int a(long l2, String object) {
        Object object2 = "campaignId";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object2 = this.a.b;
        if (object2 == null || (object = ((ef1_1)object2).b((String)object)) == null) {
            object = mz0_2.a;
        }
        int n3 = object.size() + -1;
        int n4 = 0;
        while (n4 <= n3) {
            int n7 = n4 + n3 >>> 1;
            Number number = (Number)object.get(n7);
            long l3 = number.longValue();
            long l4 = l3 - l2;
            Object object3 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object3 < 0) {
                n4 = n7 + 1;
                continue;
            }
            n3 = n7 + -1;
        }
        return object.size() - n4;
    }
}

