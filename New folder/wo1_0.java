/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;

/*
 * Renamed from wo1
 */
public final class wo1_0 {
    public static final wo1_0 g;
    public final Function1 a;
    public final Function1 b;
    public final Function1 c;
    public final Function1 d;
    public final Function1 e;
    public final Function1 f;

    static {
        wo1_0 wo1_02;
        g = wo1_02 = new wo1_0(null, 63);
    }

    public wo1_0() {
        this(null, 63);
    }

    public wo1_0(yb0_1 yb0_12, int n3) {
        if ((n3 &= 0x10) != 0) {
            yb0_12 = null;
        }
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = yb0_12;
        this.f = null;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof wo1_0;
        if (!bl3) {
            return false;
        }
        object = (wo1_0)object;
        Function1 function1 = this.a;
        Function1 function12 = ((wo1_0)object).a;
        if (function1 != function12 || (function12 = this.b) != (function1 = ((wo1_0)object).b) || (function12 = this.c) != (function1 = ((wo1_0)object).c) || (function12 = this.d) != (function1 = ((wo1_0)object).d) || (function12 = this.e) != (function1 = ((wo1_0)object).e) || (function12 = this.f) != (object = ((wo1_0)object).f)) {
            bl2 = false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        int n4;
        int n7 = 0;
        Function1 function1 = this.a;
        if (function1 != null) {
            n4 = function1.hashCode();
        } else {
            n4 = 0;
            function1 = null;
        }
        n4 *= 31;
        Function1 function12 = this.b;
        if (function12 != null) {
            n3 = function12.hashCode();
        } else {
            n3 = 0;
            function12 = null;
        }
        n4 = (n4 + n3) * 31;
        function12 = this.c;
        if (function12 != null) {
            n3 = function12.hashCode();
        } else {
            n3 = 0;
            function12 = null;
        }
        n4 = (n4 + n3) * 31;
        function12 = this.d;
        if (function12 != null) {
            n3 = function12.hashCode();
        } else {
            n3 = 0;
            function12 = null;
        }
        n4 = (n4 + n3) * 31;
        function12 = this.e;
        if (function12 != null) {
            n3 = function12.hashCode();
        } else {
            n3 = 0;
            function12 = null;
        }
        n4 = (n4 + n3) * 31;
        function12 = this.f;
        if (function12 != null) {
            n7 = function12.hashCode();
        }
        return n4 + n7;
    }
}

