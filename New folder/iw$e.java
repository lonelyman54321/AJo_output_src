/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public final class iw$e
implements iw$c {
    public final Bo1 a;
    public float b = -1.0f;

    public iw$e(List object) {
        this.a = object = (Bo1)object.get(0);
    }

    public final boolean a(float f5) {
        float f6 = this.b;
        float f7 = f6 - f5;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object == false) {
            return true;
        }
        this.b = f5;
        return false;
    }

    public final Bo1 b() {
        return this.a;
    }

    public final boolean c(float f5) {
        return this.a.c() ^ true;
    }

    public final float d() {
        return this.a.b();
    }

    public final float e() {
        return this.a.a();
    }

    public final boolean isEmpty() {
        return false;
    }
}

