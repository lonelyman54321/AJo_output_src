/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public final class TE$d$a
implements TE$b {
    public final Class a() {
        return InputStream.class;
    }

    public final Object b(byte[] byArray) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byArray);
        return byteArrayInputStream;
    }
}

