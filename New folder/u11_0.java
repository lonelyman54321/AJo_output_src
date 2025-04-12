/*
 * Decompiled with CFR 0.152.
 */
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.io.Closeable;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/*
 * Renamed from U11
 */
public final class u11_0
implements x80_0 {
    public static final jn1_0 c = JN1$a.a("application/json; charset=UTF-8");
    public final Gson a;
    public final TypeAdapter b;

    public u11_0(Gson gson, TypeAdapter typeAdapter) {
        this.a = gson;
        this.b = typeAdapter;
    }

    public final Object convert(Object object) {
        ce_2 ce_22 = new ce_2();
        de_2 de_22 = new de_2(ce_22);
        Charset charset = StandardCharsets.UTF_8;
        Closeable closeable = new OutputStreamWriter((OutputStream)de_22, charset);
        closeable = this.a.newJsonWriter((Writer)closeable);
        this.b.write((JsonWriter)closeable, object);
        ((JsonWriter)closeable).close();
        long l2 = ce_22.b;
        object = ce_22.b0(l2);
        return pj2_2.create(c, (ff_2)object);
    }
}

