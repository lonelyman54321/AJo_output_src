/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/*
 * Renamed from eL2
 */
public final class el2_1
implements Closeable {
    public final int a;
    public final Map b;
    public final Function0 c;
    public final BufferedReader d;

    public el2_1(jj2_0 object, int n3, Map map2, InputStream inputStream, ix3$a ix3$a) {
        Object object2;
        String string2 = "request";
        Intrinsics.checkNotNullParameter(object, string2);
        Intrinsics.checkNotNullParameter(map2, "headers");
        object = "closeDelegate";
        Intrinsics.checkNotNullParameter(ix3$a, (String)object);
        this.a = n3;
        this.b = map2;
        this.c = ix3$a;
        if (inputStream != null) {
            object2 = Charsets.UTF_8;
            object = new InputStreamReader(inputStream, (Charset)object2);
            int n4 = 8192;
            object2 = new BufferedReader((Reader)object, n4);
        } else {
            n3 = 0;
            object2 = null;
        }
        this.d = object2;
    }

    public final String a(String object) {
        Intrinsics.checkNotNullParameter(object, "header");
        Map map2 = this.b;
        object = (List)map2.get(object);
        object = object != null ? (String)CollectionsKt.T((List)object) : null;
        return object;
    }

    public final void close() {
        BufferedReader bufferedReader = this.d;
        if (bufferedReader != null) {
            ((Reader)bufferedReader).close();
        }
        this.c.invoke();
    }
}

