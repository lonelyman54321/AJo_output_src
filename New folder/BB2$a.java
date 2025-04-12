/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.util.GlUtil;
import java.nio.FloatBuffer;

public final class BB2$a {
    public final int a;
    public final FloatBuffer b;
    public final FloatBuffer c;
    public final int d;

    public BB2$a(zB2$b zB2$b) {
        int n3;
        Object object = zB2$b.c;
        this.a = n3 = ((float[])object).length / 3;
        object = GlUtil.d(object);
        this.b = object;
        object = GlUtil.d(zB2$b.d);
        this.c = object;
        int n4 = 1;
        int n7 = zB2$b.b;
        this.d = n7 != n4 ? (n7 != (n4 = 2) ? (n7 = 4) : (n7 = 6)) : (n7 = 5);
    }
}

