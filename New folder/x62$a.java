/*
 * Decompiled with CFR 0.152.
 */
public final class x62$a
extends vw_2 {
    public final bx0_2 e;

    public x62$a(e62_0 e62_02, bx0_2 bx0_22) {
        super(e62_02);
        this.e = bx0_22;
    }

    public final void b(Object object) {
        Object object2;
        boolean bl2 = this.d;
        if (bl2) {
            return;
        }
        e62_0 e62_02 = this.a;
        try {
            object2 = this.e;
        }
        catch (Throwable throwable) {
            mm0.h(throwable);
            this.b.dispose();
            this.onError(throwable);
            return;
        }
        object = object2.apply(object);
        object2 = "The mapper function returned a null value.";
        x03_0.b(object, (String)object2);
        e62_02.b(object);
    }

    public final Object poll() {
        Object object = this.c.poll();
        if (object != null) {
            object = this.e.apply(object);
            String string2 = "The mapper function returned a null value.";
            x03_0.b(object, string2);
        } else {
            object = null;
        }
        return object;
    }

    public final int requestFusion(int n3) {
        return 0;
    }
}

