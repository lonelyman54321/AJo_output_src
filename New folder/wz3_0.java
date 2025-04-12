/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Wz3
 */
public final class wz3_0
extends ha3 {
    public final Object a;
    public final String b;
    public final ha3$b c;
    public final tu1_2 d;

    public wz3_0(Object object, ha3$b ha3$b, tu1_2 tu1_22) {
        Intrinsics.checkNotNullParameter(object, "value");
        String string2 = "v43";
        Intrinsics.checkNotNullParameter(string2, "tag");
        Intrinsics.checkNotNullParameter((Object)ha3$b, "verificationMode");
        Intrinsics.checkNotNullParameter(tu1_22, "logger");
        this.a = object;
        this.b = string2;
        this.c = ha3$b;
        this.d = tu1_22;
    }

    public final Object a() {
        return this.a;
    }

    public final ha3 c(String string2, Function1 object) {
        Intrinsics.checkNotNullParameter(string2, "message");
        Intrinsics.checkNotNullParameter(object, "condition");
        Object object2 = this.a;
        object = (Boolean)object.invoke(object2);
        boolean bl2 = (Boolean)object;
        if (bl2) {
            object = this;
        } else {
            Object object3 = this.a;
            String string3 = this.b;
            tu1_2 tu1_22 = this.d;
            ha3$b ha3$b = this.c;
            object2 = object;
            object = new ri0_0(object3, string3, string2, tu1_22, ha3$b);
        }
        return object;
    }
}

