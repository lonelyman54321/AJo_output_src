/*
 * Decompiled with CFR 0.152.
 */
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Sx
 */
public final class sx_2 {
    public final pb1_1 a;
    public final ly_0 b;
    public final Pair c;
    public long d;
    public HttpURLConnection e;

    public /* synthetic */ sx_2(pb1_1 pb1_12, ly_0 ly_02) {
        Boolean bl2 = Boolean.FALSE;
        Integer n3 = 0;
        Pair pair = new Pair(bl2, n3);
        this(pb1_12, ly_02, pair);
    }

    public sx_2(pb1_1 pb1_12, ly_0 ly_02, Pair pair) {
        Intrinsics.checkNotNullParameter(pb1_12, "httpUrlConnectionParams");
        Intrinsics.checkNotNullParameter(ly_02, "bitmapInputStreamReader");
        Intrinsics.checkNotNullParameter(pair, "sizeConstrainedPair");
        this.a = pb1_12;
        this.b = ly_02;
        this.c = pair;
    }

    public final HttpURLConnection a(URL object) {
        boolean bl2;
        object = ((URL)object).openConnection();
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type java.net.HttpURLConnection");
        object = (HttpURLConnection)object;
        Object object2 = this.a;
        int bl22 = ((pb1_1)object2).a;
        ((URLConnection)object).setConnectTimeout(bl22);
        int n3 = ((pb1_1)object2).b;
        ((URLConnection)object).setReadTimeout(n3);
        boolean bl3 = ((pb1_1)object2).c;
        ((URLConnection)object).setUseCaches(bl3);
        boolean bl4 = ((pb1_1)object2).d;
        ((URLConnection)object).setDoInput(bl4);
        object2 = ((pb1_1)object2).e.entrySet().iterator();
        while (bl2 = object2.hasNext()) {
            Object object3 = (Map.Entry)object2.next();
            String string2 = (String)object3.getKey();
            object3 = (String)object3.getValue();
            ((URLConnection)object).addRequestProperty(string2, (String)object3);
        }
        return object;
    }
}

