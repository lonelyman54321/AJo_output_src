/*
 * Decompiled with CFR 0.152.
 */
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from oq1
 */
public abstract class oq1_1 {
    public final Object a;

    public oq1_1(Object object) {
        this.a = object;
        new LinkedHashMap();
    }

    public Object a() {
        return this.a;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof oq1_1;
        if (!bl3) {
            return false;
        }
        Object object2 = this.a();
        boolean bl4 = Intrinsics.areEqual(object2, object = ((oq1_1)object).a());
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        return this.a().hashCode();
    }
}

