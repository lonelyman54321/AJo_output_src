/*
 * Decompiled with CFR 0.152.
 */
import com.clevertap.android.sdk.b;
import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.Charsets;

public final class ix3
implements le0_1 {
    public final boolean a;
    public final b b;
    public final hh3_2 c;
    public final hh3_2 d;

    public ix3(boolean bl2, b b2, String string2) {
        Intrinsics.checkNotNullParameter(b2, "logger");
        Intrinsics.checkNotNullParameter(string2, "logTag");
        this.a = bl2;
        this.b = b2;
        Serializable serializable = new ix3$b(this);
        serializable = yr1_2.b(serializable);
        this.c = serializable;
        super(this);
        serializable = yr1_2.b(serializable);
        this.d = serializable;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final el2_1 a(jj2_0 jj2_02) {
        Exception exception2;
        Ref$ObjectRef ref$ObjectRef;
        Object object;
        block3: {
            ix3$a ix3$a;
            Map<String, List<String>> map2;
            int n3;
            Object object2;
            Object object3;
            object = "Sending request to: ";
            Intrinsics.checkNotNullParameter(jj2_02, "request");
            ref$ObjectRef = new Ref$ObjectRef();
            try {
                ref$ObjectRef.element = object3 = this.b(jj2_02);
                object3 = this.b;
                object2 = new StringBuilder((String)object);
                object = jj2_02.a;
                ((StringBuilder)object2).append(object);
                object = ((StringBuilder)object2).toString();
                object3.getClass();
                com.clevertap.android.sdk.b.f((String)object);
                object = ref$ObjectRef.element;
                object = (HttpsURLConnection)object;
                n3 = ((HttpURLConnection)object).getResponseCode();
                object = ref$ObjectRef.element;
                object = (HttpsURLConnection)object;
                map2 = ((URLConnection)object).getHeaderFields();
                ix3$a = new ix3$a(ref$ObjectRef);
                int n4 = 200;
                object3 = "headers";
                if (n3 == n4) {
                    Intrinsics.checkNotNullExpressionValue(map2, (String)object3);
                    object3 = ref$ObjectRef.element;
                    object3 = (HttpsURLConnection)object3;
                    InputStream inputStream = ((URLConnection)object3).getInputStream();
                    object3 = object;
                    object2 = jj2_02;
                    return new el2_1(jj2_02, n3, map2, inputStream, ix3$a);
                }
            }
            catch (Exception exception2) {
                break block3;
            }
            Intrinsics.checkNotNullExpressionValue(map2, (String)object3);
            object3 = ref$ObjectRef.element;
            object3 = (HttpsURLConnection)object3;
            InputStream inputStream = ((HttpURLConnection)object3).getErrorStream();
            object3 = object;
            object2 = jj2_02;
            return new el2_1(jj2_02, n3, map2, inputStream, ix3$a);
        }
        object = (HttpsURLConnection)ref$ObjectRef.element;
        if (object == null) throw exception2;
        ((HttpURLConnection)object).disconnect();
        throw exception2;
    }

    public final HttpsURLConnection b(jj2_0 object) {
        Object object2;
        boolean bl2;
        Object object3 = ((jj2_0)object).a.toString();
        Object object4 = new URL((String)object3);
        object4 = ((URL)object4).openConnection();
        Intrinsics.checkNotNull(object4, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
        object4 = (HttpsURLConnection)object4;
        int bl3 = 10000;
        ((URLConnection)object4).setConnectTimeout(bl3);
        ((URLConnection)object4).setReadTimeout(bl3);
        object3 = ((jj2_0)object).b.entrySet().iterator();
        while (bl2 = object3.hasNext()) {
            object2 = (Map.Entry)object3.next();
            String string2 = (String)object2.getKey();
            object2 = (String)object2.getValue();
            ((URLConnection)object4).setRequestProperty(string2, (String)object2);
        }
        object3 = null;
        ((HttpURLConnection)object4).setInstanceFollowRedirects(false);
        boolean bl4 = this.a;
        if (bl4 && (object3 = (SSLContext)this.d.getValue()) != null) {
            object3 = (SSLSocketFactory)this.c.getValue();
            ((HttpsURLConnection)object4).setSSLSocketFactory((SSLSocketFactory)object3);
        }
        if ((object = ((jj2_0)object).c) != null) {
            boolean bl5 = true;
            ((URLConnection)object4).setDoOutput(bl5);
            object3 = ((URLConnection)object4).getOutputStream();
            try {
                object2 = Charsets.UTF_8;
            }
            catch (Throwable throwable) {
                try {
                    throw throwable;
                }
                catch (Throwable throwable2) {
                    xj3_1.b((Closeable)object3, throwable);
                    throw throwable2;
                }
            }
            object = ((String)object).getBytes((Charset)object2);
            object2 = "this as java.lang.String).getBytes(charset)";
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
            ((OutputStream)object3).write((byte[])object);
            object = Unit.a;
            object = null;
            xj3_1.b((Closeable)object3, null);
        }
        return object4;
    }
}

