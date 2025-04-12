/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.ImageDecoder$Source
 */
import android.graphics.ImageDecoder;
import java.io.InputStream;

public final class ai1
implements BK2 {
    public final jy_0 a;

    public ai1() {
        jy_0 jy_02;
        this.a = jy_02 = new jy_0();
    }

    public final wk2_0 b(Object object, int n3, int n4, Z92 z92) {
        object = qd1.a(hf_0.b((InputStream)object));
        return this.a.c((ImageDecoder.Source)object, n3, n4, z92);
    }
}

