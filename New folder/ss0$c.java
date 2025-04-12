/*
 * Decompiled with CFR 0.152.
 */
public final class ss0$c
extends ss0 {
    public final ss0$g a(int n3, int n4, int n7, int n8) {
        ss0$g ss0$g;
        float f5;
        float f6 = this.b(n3, n4, n7, n8);
        float f7 = f6 - (f5 = 1.0f);
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object == false) {
            ss0$g = ss0$g.QUALITY;
        } else {
            ss0$e ss0$e = ss0.a;
            ss0$g = ss0$e.a(n3, n4, n7, n8);
        }
        return ss0$g;
    }

    public final float b(int n3, int n4, int n7, int n8) {
        float f5 = ss0.a.b(n3, n4, n7, n8);
        return Math.min(1.0f, f5);
    }
}

