/*
 * Decompiled with CFR 0.152.
 */
import kotlin.coroutines.CoroutineContext;

/*
 * Renamed from aa1
 */
public final class aa1_2
implements bb1_2 {
    public final pa1_0 a;
    public final fx3_0 b;
    public final e40_0 c;
    public final q41_0 d;

    public aa1_2(db1_2 object) {
        Object object2 = ((db1_2)object).b;
        this.a = object2;
        this.b = object2 = ((db1_2)object).a.b();
        this.c = object2 = ((db1_2)object).f;
        this.d = object = ((db1_2)object).c.i();
    }

    public final ea1_2 a() {
        String string2 = "Call is not initialized".toString();
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public final yq_1 getAttributes() {
        return this.c;
    }

    public final CoroutineContext getCoroutineContext() {
        this.a();
        throw null;
    }

    public final l41_0 getHeaders() {
        return this.d;
    }

    public final pa1_0 getMethod() {
        return this.a;
    }

    public final fx3_0 getUrl() {
        return this.b;
    }
}

