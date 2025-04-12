/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ml
 */
public final class ml_1 {
    public final String a;

    public /* synthetic */ ml_1(String string2) {
        this.a = string2;
    }

    public static final /* synthetic */ ml_1 a(String string2) {
        ml_1 ml_12 = new ml_1(string2);
        return ml_12;
    }

    public final boolean equals(Object object) {
        String string2;
        boolean bl2;
        boolean bl3 = object instanceof ml_1;
        boolean bl4 = false;
        if (bl3 && (bl2 = Intrinsics.areEqual(string2 = this.a, object = ((ml_1)object).a))) {
            bl4 = true;
        }
        return bl4;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}

