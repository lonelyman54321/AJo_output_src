/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.chuckerteam.chucker.R$string;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;
import kotlinx.coroutines.d;

/*
 * Renamed from AU
 */
public final class au_0
implements nj1_2 {
    public static final Charset e = Charset.forName("UTF-8");
    public final uU a;
    public final zU b;
    public final gc1_0 c;
    public final LinkedHashSet d;

    public au_0(Context object, uU object2, zU zU2, Set set) {
        Intrinsics.checkNotNullParameter(object, "context");
        Intrinsics.checkNotNullParameter(object2, "collector");
        Intrinsics.checkNotNullParameter(zU2, "cacheDirectoryProvider");
        Intrinsics.checkNotNullParameter(set, "headersToRedact");
        this.a = object2;
        this.b = zU2;
        this.c = object2 = new gc1_0((Context)object);
        object = CollectionsKt.n0(set);
        this.d = object;
    }

    public final m41_0 a(m41_0 object) {
        boolean bl2;
        m41$a_0 m41$a_0 = ((m41_0)object).e();
        object = ((m41_0)object).d().iterator();
        block0: while (bl2 = object.hasNext()) {
            String string2 = (String)object.next();
            Object object2 = this.d;
            boolean bl3 = object2 instanceof Collection;
            if (bl3 && (bl3 = ((Collection)object2).isEmpty())) continue;
            object2 = ((Iterable)object2).iterator();
            while (bl3 = object2.hasNext()) {
                boolean bl4;
                String string3 = (String)object2.next();
                bl3 = kotlin.text.b.i(string3, string2, bl4 = true);
                if (!bl3) continue;
                object2 = "**";
                m41$a_0.h(string2, (String)object2);
                continue block0;
            }
        }
        object = m41$a_0.e();
        Intrinsics.checkNotNullExpressionValue(object, "builder.build()");
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final cl2_2 intercept(nj1$a nj1$a) {
        long l2;
        Object object;
        long l3;
        Object object2;
        int n3;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        Object object7;
        Object object8;
        au_0 au_02;
        block45: {
            block43: {
                block44: {
                    long l4;
                    int n4;
                    String string2;
                    int n7;
                    int n8;
                    int n10;
                    boolean bl2;
                    Object object9;
                    Object object10;
                    block42: {
                        long l7;
                        Object object11;
                        int n14;
                        au_02 = this;
                        object8 = nj1$a;
                        Intrinsics.checkNotNullParameter(nj1$a, "chain");
                        object7 = nj1$a;
                        object7 = ((te2_2)nj1$a).e;
                        object6 = new HttpTransaction();
                        Intrinsics.checkNotNullExpressionValue(object7, "request");
                        object5 = ((kj2_2)object7).d;
                        object10 = ((kj2_2)object7).c;
                        object9 = ((m41_0)object10).a("Content-Encoding");
                        object4 = this.c;
                        object4.getClass();
                        bl2 = false;
                        object3 = null;
                        boolean bl3 = true;
                        if (object9 != null && (n3 = ((String)object9).length()) != 0 && (n3 = (int)(((String)object9).equalsIgnoreCase((String)(object2 = "identity")) ? 1 : 0)) == 0 && (n10 = ((String)object9).equalsIgnoreCase((String)(object2 = "gzip"))) == 0) {
                            n10 = 0;
                            object9 = null;
                        } else {
                            n10 = 1;
                        }
                        Intrinsics.checkNotNullExpressionValue(object10, "request.headers()");
                        ((HttpTransaction)object6).setRequestHeaders((m41_0)object10);
                        Object object12 = ((kj2_2)object7).a;
                        Intrinsics.checkNotNullExpressionValue(object12, "request.url()");
                        ((HttpTransaction)object6).populateUrl((ob1_1)object12);
                        ((HttpTransaction)object6).setRequestBodyPlainText(n10 != 0);
                        long l8 = System.currentTimeMillis();
                        object2 = l8;
                        ((HttpTransaction)object6).setRequestDate((Long)object2);
                        object2 = ((kj2_2)object7).b;
                        ((HttpTransaction)object6).setMethod((String)object2);
                        n3 = 0;
                        object2 = null;
                        if (object5 == null || (object12 = ((pj2_2)object5).contentType()) == null) {
                            n14 = 0;
                            object12 = null;
                        } else {
                            object12 = ((jn1_0)object12).a;
                        }
                        ((HttpTransaction)object6).setRequestContentType((String)object12);
                        long l12 = 0L;
                        if (object5 == null) {
                            object11 = l12;
                        } else {
                            l7 = ((pj2_2)object5).contentLength();
                            object11 = l7;
                        }
                        ((HttpTransaction)object6).setRequestPayloadSize((Long)object11);
                        if (object5 != null && n10 != 0) {
                            object9 = new ce_2();
                            Intrinsics.checkNotNullParameter(object7, "<this>");
                            Intrinsics.checkNotNullExpressionValue(object10, "this.headers()");
                            object10 = ((m41_0)object10).a("Content-Encoding");
                            n8 = kotlin.text.b.i((String)object10, "gzip", bl3);
                            object11 = "input";
                            Intrinsics.checkNotNullParameter(object9, (String)object11);
                            if (n8 != 0) {
                                object10 = new c21((a93_0)object9);
                                try {
                                    object9 = o72_0.b((a93_0)object10);
                                }
                                catch (Throwable throwable) {
                                    object7 = throwable;
                                    try {
                                        throw throwable;
                                    }
                                    catch (Throwable throwable2) {
                                        object6 = throwable2;
                                        xj3_1.b((Closeable)object10, (Throwable)object7);
                                        throw throwable2;
                                    }
                                }
                                xj3_1.b((Closeable)object10, null);
                                object10 = "{\n        val source = GzipSource(input)\n        source.use { Okio.buffer(it) }\n    }";
                                Intrinsics.checkNotNullExpressionValue(object9, (String)object10);
                            }
                            object9 = object9.m();
                            ((pj2_2)object5).writeTo((re_2)object9);
                            object10 = e;
                            object11 = "UTF8";
                            Intrinsics.checkNotNullExpressionValue(object10, (String)object11);
                            object5 = ((pj2_2)object5).contentType();
                            if (object5 != null) {
                                if ((object5 = ((jn1_0)object5).a((Charset)object10)) == null) {
                                    Intrinsics.checkNotNullExpressionValue(object10, (String)object11);
                                } else {
                                    object10 = object5;
                                }
                            }
                            object5 = "buffer";
                            Intrinsics.checkNotNullExpressionValue(object9, (String)object5);
                            boolean bl4 = gc1_0.a((ce_2)object9);
                            if (bl4) {
                                object4 = ((gc1_0)object4).a;
                                Intrinsics.checkNotNullParameter(object9, (String)object5);
                                object5 = "charset";
                                Intrinsics.checkNotNullParameter(object10, (String)object5);
                                l7 = ((ce_2)object9).b;
                                l12 = 250000L;
                                l3 = Math.min(l7, l12);
                                try {
                                    object9 = ((ce_2)object9).H(l3, (Charset)object10);
                                    object10 = "buffer.readString(maxBytes, charset)";
                                    Intrinsics.checkNotNullExpressionValue(object9, (String)object10);
                                }
                                catch (EOFException eOFException) {
                                    n10 = R$string.chucker_body_unexpected_eof;
                                    object9 = object4.getString(n10);
                                    object10 = "";
                                    object9 = Intrinsics.stringPlus((String)object10, object9);
                                }
                                n8 = l7 == l12 ? 0 : (l7 < l12 ? -1 : 1);
                                if (n8 > 0) {
                                    n8 = R$string.chucker_body_content_truncated;
                                    object10 = object4.getString(n8);
                                    object9 = Intrinsics.stringPlus((String)object9, object10);
                                }
                                ((HttpTransaction)object6).setRequestBody((String)object9);
                            } else {
                                ((HttpTransaction)object6).setRequestBodyPlainText(false);
                            }
                        }
                        object9 = au_02.a;
                        object9.getClass();
                        Intrinsics.checkNotNullParameter(object6, "transaction");
                        object10 = ir0_2.a;
                        object10 = em0_2.b;
                        object4 = kotlinx.coroutines.d.a((CoroutineContext)object10);
                        n3 = 0;
                        object2 = null;
                        object = new tu_0((HttpTransaction)object6, null);
                        n14 = 3;
                        Ae3.d((i90_0)object4, null, null, (Function2)object, n14);
                        n7 = ((uU)object9).a;
                        if (n7 != 0) {
                            object4 = ((uU)object9).c;
                            ((l52_0)object4).b((HttpTransaction)object6);
                        }
                        object9 = ((uU)object9).b;
                        // MONITORENTER : object9
                        l3 = ((zm2_0)object9).a;
                        long l14 = 0L;
                        n7 = l3 == l14 ? 0 : (l3 < l14 ? -1 : 1);
                        if (n7 <= 0) break block42;
                        l3 = System.currentTimeMillis();
                        long l15 = zm2_0.d;
                        long l16 = l15 - l14;
                        n7 = (int)(l16 == 0L ? 0 : (l16 < 0L ? -1 : 1));
                        if (n7 == 0) {
                            object4 = ((zm2_0)object9).c;
                            string2 = "last_cleanup";
                            zm2_0.d = l14 = object4.getLong(string2, l3);
                        }
                        l14 = zm2_0.d;
                        l14 = l3 - l14;
                        long l17 = l3;
                        long l18 = ((zm2_0)object9).b;
                        long l19 = l14 - l18;
                        n3 = (int)(l19 == 0L ? 0 : (l19 < 0L ? -1 : 1));
                        if (n3 <= 0) break block42;
                        object3 = "Performing data retention maintenance...";
                        object = "message";
                        Intrinsics.checkNotNullParameter(object3, (String)object);
                        l18 = ((zm2_0)object9).a;
                        l14 = 0L;
                        n3 = (int)(l18 == l14 ? 0 : (l18 < l14 ? -1 : 1));
                        if (n3 != 0) {
                            l3 -= l18;
                        }
                        object10 = kotlinx.coroutines.d.a((CoroutineContext)object10);
                        string2 = null;
                        object3 = new am2_1(l3, null);
                        Ae3.d((i90_0)object10, null, null, (Function2)object3, n14);
                        zm2_0.d = l17;
                        object10 = ((zm2_0)object9).c;
                        object10 = object10.edit();
                        object3 = "last_cleanup";
                        l3 = l17;
                        object10 = object10.putLong((String)object3, l17);
                        object10.apply();
                    }
                    string2 = null;
                    // MONITOREXIT : object9
                    try {
                        object8 = (te2_2)object8;
                        object8 = ((te2_2)object8).a((kj2_2)object7);
                        object7 = "chain.proceed(request)";
                        Intrinsics.checkNotNullExpressionValue(object8, (String)object7);
                        object7 = ((cl2_2)object8).f.a("Content-Encoding");
                        object9 = au_02.c;
                        object9.getClass();
                    }
                    catch (IOException iOException) {
                        object7 = ((Object)iOException).toString();
                        ((HttpTransaction)object6).setError((String)object7);
                        au_02.a.a((HttpTransaction)object6);
                        throw iOException;
                    }
                    if (object7 != null && (n10 = ((String)object7).length()) != 0 && (n10 = (int)(((String)object7).equalsIgnoreCase((String)(object9 = "identity")) ? 1 : 0)) == 0 && (n4 = ((String)object7).equalsIgnoreCase((String)(object9 = "gzip"))) == 0) {
                        bl2 = false;
                        object3 = null;
                    } else {
                        bl2 = true;
                    }
                    object7 = ((cl2_2)object8).a.c;
                    Intrinsics.checkNotNullExpressionValue(object7, "response.request().headers()");
                    object7 = au_02.a((m41_0)object7);
                    ((HttpTransaction)object6).setRequestHeaders((m41_0)object7);
                    object9 = ((cl2_2)object8).f;
                    Intrinsics.checkNotNullExpressionValue(object9, "response.headers()");
                    object7 = au_02.a((m41_0)object9);
                    ((HttpTransaction)object6).setResponseHeaders((m41_0)object7);
                    ((HttpTransaction)object6).setResponseBodyPlainText(bl2);
                    l2 = ((cl2_2)object8).k;
                    object7 = l2;
                    ((HttpTransaction)object6).setRequestDate((Long)object7);
                    long l20 = ((cl2_2)object8).l;
                    object7 = l20;
                    ((HttpTransaction)object6).setResponseDate((Long)object7);
                    object7 = ((cl2_2)object8).b.toString();
                    ((HttpTransaction)object6).setProtocol((String)object7);
                    n4 = ((cl2_2)object8).d;
                    object7 = n4;
                    ((HttpTransaction)object6).setResponseCode((Integer)object7);
                    object7 = ((cl2_2)object8).c;
                    ((HttpTransaction)object6).setResponseMessage((String)object7);
                    object7 = ((cl2_2)object8).e;
                    if (object7 != null) {
                        object = ((k21_0)object7).a.javaName();
                        ((HttpTransaction)object6).setResponseTlsVersion((String)object);
                        object7 = ((k21_0)object7).b.a;
                        ((HttpTransaction)object6).setResponseCipherSuite((String)object7);
                    }
                    Intrinsics.checkNotNullParameter(object8, "<this>");
                    object7 = "Content-Type";
                    object = "name";
                    Intrinsics.checkNotNullParameter(object7, (String)object);
                    object7 = cl2_2.c((cl2_2)object8, (String)object7);
                    ((HttpTransaction)object6).setResponseContentType((String)object7);
                    object7 = l20 -= l2;
                    ((HttpTransaction)object6).setTookMs((Long)object7);
                    object7 = ((cl2_2)object8).g;
                    object9 = "<this>";
                    Intrinsics.checkNotNullParameter(object8, (String)object9);
                    object10 = ((cl2_2)object8).a.b;
                    object4 = "HEAD";
                    n8 = (int)(Intrinsics.areEqual(object10, object4) ? 1 : 0);
                    if (n8 != 0) break block43;
                    n8 = ((cl2_2)object8).d;
                    n7 = 100;
                    if ((n8 < n7 || n8 >= (n7 = 200)) && n8 != (n7 = 204) && n8 != (n7 = 304)) break block44;
                    object10 = "Content-Length";
                    object4 = "name";
                    Intrinsics.checkNotNullParameter(object10, (String)object4);
                    object10 = cl2_2.c((cl2_2)object8, (String)object10);
                    l20 = -1;
                    if (object10 != null && (object10 = StringsKt.l0((String)object10)) != null) {
                        l20 = (Long)object10;
                    }
                    if ((n8 = (int)((l4 = l20 - (l3 = 0L)) == 0L ? 0 : (l4 < 0L ? -1 : 1))) > 0) break block44;
                    Intrinsics.checkNotNullParameter(object8, (String)object9);
                    object9 = "Transfer-Encoding";
                    Intrinsics.checkNotNullParameter(object9, "name");
                    object9 = cl2_2.c((cl2_2)object8, (String)object9);
                    object10 = "chunked";
                    boolean bl5 = kotlin.text.b.i((String)object9, (String)object10, true);
                    if (!bl5) break block43;
                }
                if (object7 != null) break block45;
            }
            object7 = au_02.a;
            ((uU)object7).a((HttpTransaction)object6);
            return object8;
        }
        object5 = ((il2_2)object7).d();
        l2 = ((il2_2)object7).c();
        object3 = (AU$a)au_02.b.a;
        object = "this$0";
        Intrinsics.checkNotNullParameter(object3, (String)object);
        object3 = ((AU$a)object3).a.getFilesDir();
        if (object3 == null) {
            object = "Failed to obtain a valid cache directory for Chucker transaction file";
            object3 = new IOException((String)object);
            n3 = 0;
            object2 = null;
        } else {
            object = qL0.a;
            Intrinsics.checkNotNullParameter(object3, "directory");
            l3 = qL0.a.getAndIncrement();
            object = l3;
            object = Intrinsics.stringPlus("chucker-", object);
            object2 = qL0.a((File)object3, (String)object);
        }
        object3 = new AU$b(au_02, (cl2_2)object8, (HttpTransaction)object6);
        object4 = new ij2_0((File)object2, (AU$b)object3);
        object7 = ((il2_2)object7).h();
        object3 = "responseBody.source()";
        Intrinsics.checkNotNullExpressionValue(object7, (String)object3);
        object6 = new zi3_0((se_1)object7, (ij2_0)object4);
        object8 = ((cl2_2)object8).h();
        object7 = o72_0.b((a93_0)object6);
        Intrinsics.checkNotNullParameter(object7, "content");
        Intrinsics.checkNotNullParameter(object7, "<this>");
        ((cl2$a_0)object8).g = object6 = new jl2_2((jn1_0)object5, l2, (se_1)object7);
        object8 = ((cl2$a_0)object8).a();
        object7 = "response.newBuilder()\n            .body(ResponseBody.create(contentType, contentLength, Okio.buffer(upstream)))\n            .build()";
        Intrinsics.checkNotNullExpressionValue(object8, (String)object7);
        return object8;
    }
}

