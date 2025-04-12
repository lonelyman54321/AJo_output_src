/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.i;

/*
 * Renamed from eb1
 */
public final class eb1_2 {
    public final fx3_0 a;
    public final pa1_0 b;
    public final l41_0 c;
    public final bg2_2 d;
    public final i e;
    public final yq_1 f;
    public final Set g;

    public eb1_2(fx3_0 set, pa1_0 pa1_02, q41_0 q41_02, bg2_2 bg2_22, i i3, e40_0 e40_02) {
        Intrinsics.checkNotNullParameter(set, "url");
        Intrinsics.checkNotNullParameter(pa1_02, "method");
        Intrinsics.checkNotNullParameter(q41_02, "headers");
        Intrinsics.checkNotNullParameter(bg2_22, "body");
        Intrinsics.checkNotNullParameter(i3, "executionContext");
        String string2 = "attributes";
        Intrinsics.checkNotNullParameter(e40_02, string2);
        this.a = set;
        this.b = pa1_02;
        this.c = q41_02;
        this.d = bg2_22;
        this.e = i3;
        this.f = e40_02;
        set = va1_1.a;
        set = (Map)e40_02.a((xq_2)((Object)set));
        if (set == null || (set = set.keySet()) == null) {
            set = vz0_2.a;
        }
        this.g = set;
    }

    public final Object a(ua1_0 ua1_02) {
        Intrinsics.checkNotNullParameter(ua1_02, "key");
        Object object = va1_1.a;
        yq_1 yq_12 = this.f;
        object = (Map)yq_12.a((xq_2)object);
        ua1_02 = object != null ? object.get(ua1_02) : null;
        return ua1_02;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("HttpRequestData(url=");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(", method=");
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

