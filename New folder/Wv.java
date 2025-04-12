/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public abstract class Wv
implements w50 {
    public final N50 a;

    public Wv(N50 n50) {
        Intrinsics.checkNotNullParameter(n50, "tracker");
        this.a = n50;
    }

    public final boolean a(EI3 object) {
        String string2 = "workSpec";
        Intrinsics.checkNotNullParameter(object, string2);
        boolean bl2 = this.c((EI3)object);
        if (bl2 && (bl2 = this.e(object = this.a.a()))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public final zj_2 b(b60 object) {
        Intrinsics.checkNotNullParameter(object, "constraints");
        object = new vv_1(this, null);
        return ms0_1.d((Function2)object);
    }

    public abstract int d();

    public abstract boolean e(Object var1);
}

