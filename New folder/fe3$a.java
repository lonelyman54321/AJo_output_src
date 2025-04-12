/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public final class fe3$a
extends ByteArrayOutputStream {
    public final /* synthetic */ fe3_0 a;

    public fe3$a(fe3_0 fe3_02, int n3) {
        this.a = fe3_02;
        super(n3);
    }

    public final String toString() {
        Object object;
        int n3 = this.count;
        if (n3 > 0) {
            object = this.buf;
            int n4 = n3 + -1;
            byte by2 = object[n4];
            if (by2 == (n4 = 13)) {
                n3 += -1;
            }
        }
        try {
            object = new String;
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            object = new AssertionError;
            object((Object)unsupportedEncodingException);
            throw object;
        }
        byte[] byArray = this.buf;
        Object object2 = this.a;
        object2 = ((fe3_0)object2).b;
        object2 = ((Charset)object2).name();
        object(byArray, 0, n3, (String)object2);
        return object;
    }
}

