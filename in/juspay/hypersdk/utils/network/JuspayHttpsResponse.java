/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package in.juspay.hypersdk.utils.network;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public class JuspayHttpsResponse {
    private static final String LOG_TAG = "JuspayHttpsResponse";
    public final Map headers;
    public final int responseCode;
    public final byte[] responsePayload;

    public JuspayHttpsResponse(int n3, byte[] byArray, Map map2) {
        this.responseCode = n3;
        this.responsePayload = byArray;
        this.headers = map2;
    }

    public JuspayHttpsResponse(cl2_2 object) {
        int n3;
        this.responseCode = n3 = ((cl2_2)object).d;
        Object object2 = ((cl2_2)object).f.f();
        this.headers = object2;
        object2 = ((cl2_2)object).g;
        if (object2 != null) {
            boolean bl2;
            String string2 = "name";
            String string3 = "content-encoding";
            Intrinsics.checkNotNullParameter(string3, string2);
            object = cl2_2.c((cl2_2)object, string3);
            if (object != null && (bl2 = ((String)object).equalsIgnoreCase(string2 = "gzip"))) {
                object = JuspayHttpsResponse.decodeGZip(((il2_2)object2).a());
                this.responsePayload = (byte[])object;
            } else {
                object = ((il2_2)object2).b();
                this.responsePayload = (byte[])object;
            }
        } else {
            boolean bl3 = false;
            object = null;
            this.responsePayload = null;
        }
        if (object2 != null) {
            ((il2_2)object2).close();
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public JuspayHttpsResponse(HttpsURLConnection object) {
        Throwable throwable3222222;
        block12: {
            boolean bl2;
            int n3;
            this.responseCode = n3 = ((HttpURLConnection)object).getResponseCode();
            Object object2 = ((URLConnection)object).getHeaderFields();
            this.headers = object2;
            int n4 = 200;
            Closeable closeable = n3 >= n4 && n3 < (n4 = 300) || n3 == (n4 = 302) ? ((URLConnection)object).getInputStream() : ((HttpURLConnection)object).getErrorStream();
            object = ((URLConnection)object).getContentEncoding();
            if (object != null && (bl2 = ((String)object).equals(object2 = "gzip"))) {
                object = JuspayHttpsResponse.decodeGZip((InputStream)closeable);
                this.responsePayload = (byte[])object;
                return;
            }
            object = new BufferedInputStream((InputStream)closeable);
            n4 = 1024;
            {
                Throwable throwable22222222;
                block13: {
                    catch (Throwable throwable3222222) {
                        break block12;
                    }
                    try {
                        int n7;
                        int n8;
                        byte[] byArray = new byte[n4];
                        while ((n8 = ((BufferedInputStream)object).read(byArray, 0, n4)) != (n7 = -1)) {
                            ((ByteArrayOutputStream)closeable).write(byArray, 0, n8);
                        }
                    }
                    catch (Throwable throwable22222222) {
                        break block13;
                    }
                    object2 = ((ByteArrayOutputStream)closeable).toByteArray();
                    this.responsePayload = (byte[])object2;
                    ((OutputStream)closeable).flush();
                    {
                        ((ByteArrayOutputStream)closeable).close();
                    }
                    ((BufferedInputStream)object).close();
                    return;
                }
                try {
                    ((ByteArrayOutputStream)closeable).close();
                    throw throwable22222222;
                }
                catch (Throwable throwable4) {}
                {
                    throwable22222222.addSuppressed(throwable4);
                    throw throwable22222222;
                }
            }
        }
        try {
            ((BufferedInputStream)object).close();
            throw throwable3222222;
        }
        catch (Throwable throwable5) {
            throwable3222222.addSuppressed(throwable5);
        }
        throw throwable3222222;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static byte[] decodeGZip(InputStream closeable) {
        Throwable throwable3222222;
        GZIPInputStream gZIPInputStream;
        block11: {
            gZIPInputStream = new GZIPInputStream((InputStream)closeable);
            closeable = new ByteArrayOutputStream();
            int n3 = 1024;
            {
                Throwable throwable22222222;
                block12: {
                    byte[] byArray;
                    catch (Throwable throwable3222222) {
                        break block11;
                    }
                    try {
                        int n4;
                        byArray = new byte[n3];
                        while ((n4 = ((InputStream)gZIPInputStream).read(byArray)) >= 0) {
                            ((ByteArrayOutputStream)closeable).write(byArray, 0, n4);
                        }
                    }
                    catch (Throwable throwable22222222) {
                        break block12;
                    }
                    byArray = ((ByteArrayOutputStream)closeable).toByteArray();
                    ((OutputStream)closeable).flush();
                    {
                        ((ByteArrayOutputStream)closeable).close();
                    }
                    gZIPInputStream.close();
                    return byArray;
                }
                try {
                    ((ByteArrayOutputStream)closeable).close();
                    throw throwable22222222;
                }
                catch (Throwable throwable4) {}
                {
                    throwable22222222.addSuppressed(throwable4);
                    throw throwable22222222;
                }
            }
        }
        try {
            gZIPInputStream.close();
            throw throwable3222222;
        }
        catch (Throwable throwable5) {
            throwable3222222.addSuppressed(throwable5);
        }
        throw throwable3222222;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public String toString() {
        int n3;
        JSONObject jSONObject = new JSONObject();
        String string2 = "responseCode";
        try {
            n3 = this.responseCode;
        }
        catch (Exception exception) {
            return jSONObject.toString();
        }
        jSONObject.put(string2, n3);
        string2 = "responsePayload";
        byte[] byArray = this.responsePayload;
        jSONObject.put(string2, (Object)byArray);
        string2 = "headers";
        Map map2 = this.headers;
        jSONObject.put(string2, (Object)map2);
        return jSONObject.toString();
    }
}

