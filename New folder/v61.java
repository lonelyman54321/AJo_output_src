/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class v61 {
    public final v61$b a;

    public v61() {
        v61$b v61$b;
        this.a = v61$b = new v61$b(this);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final i23_0 a(Rv1 object) {
        void var1_5;
        Intrinsics.checkNotNullParameter(object, "loadType");
        int[] nArray = v61$c.$EnumSwitchMapping$0;
        int n3 = ((Enum)object).ordinal();
        n3 = nArray[n3];
        int n4 = 1;
        v61$b v61$b = this.a;
        if (n3 == n4) {
            i23_0 i23_02 = v61$b.a.b;
            return var1_5;
        }
        n4 = 2;
        if (n3 == n4) {
            i23_0 i23_03 = v61$b.b.b;
            return var1_5;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("invalid load type for hints");
        throw illegalArgumentException;
    }
}

