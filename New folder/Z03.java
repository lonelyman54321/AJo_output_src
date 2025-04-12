/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Shader
 */
import android.graphics.Shader;
import kotlin.jvm.internal.Intrinsics;

public abstract class Z03
extends ZD {
    public Shader a;
    public long b = 9205357640488583168L;

    public final void a(float f5, long l2, fm2 fm22) {
        float f6;
        float f7;
        Shader shader;
        boolean bl2;
        long l3;
        boolean bl3;
        Shader shader2 = this.a;
        if (shader2 == null || !(bl3 = C63.a(l3 = this.b, l2))) {
            boolean bl4 = C63.e(l2);
            if (bl4) {
                bl4 = false;
                shader2 = null;
                this.a = null;
                this.b = l2 = 9205357640488583168L;
            } else {
                this.a = shader2 = this.b(l2);
                this.b = l2;
            }
        }
        if (!(bl2 = OX.c(l2 = fm22.a(), l3 = OX.b))) {
            fm22.f(l3);
        }
        if (!(bl2 = Intrinsics.areEqual(shader = fm22.j(), shader2))) {
            fm22.i(shader2);
        }
        if (bl2 = (f7 = (f6 = fm22.getAlpha()) - f5) == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1)) {
            fm22.b(f5);
        }
    }

    public abstract Shader b(long var1);
}

