/*
 * Decompiled with CFR 0.152.
 */
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.text.Charsets;

/*
 * Renamed from V11
 */
public final class v11_0
implements x80_0 {
    public final Gson a;
    public final TypeAdapter b;

    public v11_0(Gson gson, TypeAdapter typeAdapter) {
        this.a = gson;
        this.b = typeAdapter;
    }

    public final Object convert(Object object) {
        Object object2;
        Object object3;
        object = (il2_2)object;
        Object object4 = ((il2_2)object).a;
        if (object4 == null) {
            Charset charset;
            object3 = ((il2_2)object).h();
            object2 = ((il2_2)object).d();
            if (object2 == null || (object2 = ((jn1_0)object2).a(charset = Charsets.UTF_8)) == null) {
                object2 = Charsets.UTF_8;
            }
            ((il2_2)object).a = object4 = new iL2$a((se_1)object3, (Charset)object2);
        }
        object3 = this.a;
        object4 = ((Gson)object3).newJsonReader((Reader)object4);
        try {
            object3 = this.b;
        }
        catch (Throwable throwable) {
            ((il2_2)object).close();
            throw throwable;
        }
        object3 = ((TypeAdapter)object3).read((JsonReader)object4);
        object4 = ((JsonReader)object4).peek();
        object2 = JsonToken.END_DOCUMENT;
        if (object4 == object2) {
            ((il2_2)object).close();
            return object3;
        }
        object3 = "JSON document was not fully consumed.";
        object4 = new JsonIOException((String)object3);
        throw object4;
    }
}

