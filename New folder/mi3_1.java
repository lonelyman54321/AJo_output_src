/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Mi3
 */
public final class mi3_1
implements op {
    public final Gl a;

    public mi3_1(Gl gl) {
        this.a = gl;
    }

    public final Object a(kU2$b$a object, Float object2, Float f5, j83$b j83$b, l83 l832) {
        Gl gl;
        float f6 = ((Number)object2).floatValue();
        float f7 = ((Number)f5).floatValue();
        f5 = null;
        int n3 = 28;
        il_0 il_02 = jl_0.a(0.0f, f7, n3);
        float f8 = Math.abs(f6);
        float f11 = (f7 = Math.signum(f7)) * f8;
        if ((object = r83_0.b((kU2$b$a)object, f11, f6, il_02, gl = this.a, j83$b, l832)) != (object2 = j90_0.COROUTINE_SUSPENDED)) {
            object = (rl_1)object;
        }
        return object;
    }
}

