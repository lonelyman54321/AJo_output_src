/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

public final class MB0 {
    public final ByteArrayOutputStream a;
    public final DataOutputStream b;

    public MB0() {
        DataOutputStream dataOutputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        this.a = byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.b = dataOutputStream = new DataOutputStream(byteArrayOutputStream);
    }
}

