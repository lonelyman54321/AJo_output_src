/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;

public final class MB2 {
    public final H30 a;
    public final boolean b;
    public final I83 c;
    public final tr1_0 d;
    public final Function1 e;
    public final boolean f;
    public final Object g;
    public boolean h;

    public MB2(H30 h30, Object object, boolean bl2, I83 i83, boolean bl3) {
        this.a = h30;
        this.b = bl2;
        this.c = i83;
        this.d = null;
        this.e = null;
        this.f = bl3;
        this.g = object;
        this.h = true;
    }

    public final Object a() {
        block4: {
            Object object;
            block2: {
                Object object2;
                block3: {
                    boolean bl2 = this.b;
                    object = null;
                    if (bl2) break block2;
                    object2 = this.d;
                    if (object2 == null) break block3;
                    object = object2.getValue();
                    break block2;
                }
                object2 = this.g;
                if (object2 == null) break block4;
                object = object2;
            }
            return object;
        }
        p30_0.d("Unexpected form of a provided value");
        throw null;
    }
}

