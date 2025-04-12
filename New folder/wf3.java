/*
 * Decompiled with CFR 0.152.
 */
public final class wf3 {
    public final yf3_1 a;
    public jq1_2 b;
    public final wf3$d c;
    public final wf3$b_0 d;
    public final wf3$c e;

    public wf3() {
        O32 o32 = O32.a;
        this(o32);
    }

    public wf3(yf3_1 object) {
        this.a = object;
        this.c = object = new wf3$d(this);
        this.d = object = new wf3$b_0(this);
        this.e = object = new wf3$c(this);
    }

    public final jq1_2 a() {
        Object object = this.b;
        if (object != null) {
            return object;
        }
        String string2 = "SubcomposeLayoutState is not attached to SubcomposeLayout".toString();
        object = new IllegalArgumentException(string2);
        throw object;
    }
}

