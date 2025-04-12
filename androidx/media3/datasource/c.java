/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.text.TextUtils
 */
package androidx.media3.datasource;

import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$HttpDataSourceException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.datasource.c$b;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableMap;
import com.google.common.io.ByteStreams;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPInputStream;

public final class c
extends Yv {
    public final boolean e;
    public final boolean f;
    public final int g;
    public final int h;
    public final String i;
    public final Ca1 j;
    public final Ca1 k;
    public final Predicate l;
    public final boolean m;
    public ti0_1 n;
    public HttpURLConnection o;
    public InputStream p;
    public boolean q;
    public int r;
    public long s;
    public long t;

    public c(String string2, int n3, int n4, Ca1 ca1) {
        super(true);
        Ca1 ca12;
        this.i = string2;
        this.g = n3;
        this.h = n4;
        this.e = false;
        this.f = false;
        this.j = ca1;
        this.l = null;
        this.k = ca12 = new Ca1();
        this.m = false;
    }

    /*
     * Unable to fully structure code
     */
    public final long a(ti0_1 var1_1) {
        block55: {
            var2_2 = this;
            var3_3 = var1_1;
            this.n = var1_1;
            var4_8 = 0L;
            var6_9 = 0.0;
            this.t = var4_8;
            this.s = var4_8;
            this.n(var1_1);
            var8_10 = 1;
            var9_11 = this.r(var1_1);
            this.o = var9_11;
            var10_12 = var9_11.getResponseCode();
            this.r = var10_12;
            var9_11.getResponseMessage();
            var10_12 = this.r;
            var11_13 = "Content-Range";
            var12_14 = 200;
            var13_15 = -1;
            var15_16 = var1_1.f;
            var17_17 = var1_1.g;
            if (var10_12 >= var12_14 && var10_12 <= (var19_18 = 299)) {
                block54: {
                    block53: {
                        var24_23 = var9_11.getContentType();
                        var25_24 = this.l;
                        if (var25_24 != null && (var19_18 = (int)var25_24.apply(var24_23)) == 0) {
                            this.p();
                            var26_25 = kp1_0.c("Invalid content type: ", var24_23);
                            var3_3 = new HttpDataSource$HttpDataSourceException(var26_25, 2003);
                            throw var3_3;
                        }
                        var10_12 = var2_2.r;
                        if (var10_12 != var12_14 || (var10_12 = (int)(var15_16 == var4_8 ? 0 : (var15_16 < var4_8 ? -1 : 1))) == 0) {
                            var15_16 = var4_8;
                        }
                        var24_23 = var9_11.getHeaderField("Content-Encoding");
                        var27_28 = "gzip";
                        var10_12 = (int)var27_28.equalsIgnoreCase(var24_23);
                        if (var10_12 == 0) {
                            var12_14 = (int)(var17_17 == var13_15 ? 0 : (var17_17 < var13_15 ? -1 : 1));
                            if (var12_14 != 0) {
                                var2_2.s = var17_17;
                            } else {
                                block51: {
                                    var27_28 = var9_11.getHeaderField("Content-Length");
                                    var11_13 = var9_11.getHeaderField((String)var11_13);
                                    var28_29 = sb1_0.a;
                                    var28_29 = "Inconsistent headers [";
                                    var29_30 = TextUtils.isEmpty((CharSequence)var27_28);
                                    var25_24 = "]";
                                    if (var29_30 == 0) {
                                        try {
                                            var13_15 = var30_31 = Long.parseLong(var27_28);
                                            break block51;
                                        }
                                        catch (NumberFormatException v0) {
                                            var32_32 = new StringBuilder("Unexpected Content-Length [");
                                            var32_32.append(var27_28);
                                            var32_32.append((String)var25_24);
                                            var33_33 = var32_32.toString();
                                            Cx.c(var33_33);
                                        }
                                    }
                                    var13_15 = -1;
                                }
                                var29_30 = TextUtils.isEmpty((CharSequence)var11_13);
                                if (var29_30 == 0 && (var34_34 = (var32_32 = sb1_0.a.matcher((CharSequence)var11_13)).matches())) {
                                    block52: {
                                        var35_35 = 2;
                                        var26_26 = var32_32.group(var35_35);
                                        var26_26.getClass();
                                        var4_8 = Long.parseLong((String)var26_26);
                                        var32_32 = var32_32.group(var8_10);
                                        var32_32.getClass();
                                        var36_36 = Long.parseLong((String)var32_32);
                                        var4_8 -= var36_36;
                                        var36_36 = 1L;
                                        var4_8 += var36_36;
                                        var20_20 = 0L;
                                        var22_22 = 0.0;
                                        var29_30 = var13_15 == var20_20 ? 0 : (var13_15 < var20_20 ? -1 : 1);
                                        if (var29_30 >= 0) break block52;
                                        var13_15 = var4_8;
                                    }
                                    var29_30 = (int)(var13_15 == var4_8 ? 0 : (var13_15 < var4_8 ? -1 : 1));
                                    if (var29_30 != 0) {
                                        var32_32 = new StringBuilder((String)var28_29);
                                        var32_32.append(var27_28);
                                        var27_28 = "] [";
                                        var32_32.append(var27_28);
                                        var32_32.append((String)var11_13);
                                        var32_32.append((String)var25_24);
                                        var27_28 = var32_32.toString();
                                        Cx.f(var27_28);
                                        var13_15 = Math.max(var13_15, var4_8);
                                    }
                                }
lbl111:
                                // 6 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                                catch (NumberFormatException v1) {
                                    var38_37 = "Unexpected Content-Range [";
                                    var26_26 = new StringBuilder((String)var38_37);
                                    var26_26.append((String)var11_13);
                                    var26_26.append((String)var25_24);
                                    var26_26 = var26_26.toString();
                                    Cx.c((String)var26_26);
                                }
                                ** continue;
                                var4_8 = -1;
                                var6_9 = 0.0 / 0.0;
                                var39_39 = var13_15 == var4_8 ? 0 : (var13_15 < var4_8 ? -1 : 1);
                                var13_15 = var39_39 != false ? (var13_15 -= var15_16) : (long)-1;
                                var2_2.s = var13_15;
                            }
                        } else {
                            var2_2.s = var17_17;
                        }
                        var35_35 = 2000;
                        try {
                            var38_37 = var9_11.getInputStream();
                        }
                        catch (IOException var3_4) {
                            break block54;
                        }
                        var2_2.p = var38_37;
                        if (var10_12 == 0) break block53;
                        var9_11 = var2_2.p;
                        var38_37 = new GZIPInputStream((InputStream)var9_11);
                        var2_2.p = var38_37;
                    }
                    var2_2.q = var8_10;
                    this.o(var1_1);
                    try {
                        var2_2.t(var15_16);
                        return var2_2.s;
                    }
                    catch (IOException var3_5) {
                        var38_37 = var3_5;
                        this.p();
                        var40_41 = var3_5 instanceof HttpDataSource$HttpDataSourceException;
                        if (var40_41) {
                            throw (HttpDataSource$HttpDataSourceException)var3_5;
                        }
                        var3_6 = new HttpDataSource$HttpDataSourceException((IOException)var38_37, var35_35, var8_10);
                        throw var3_6;
                    }
                }
                this.p();
                var38_37 = new HttpDataSource$HttpDataSourceException(var3_4, var35_35, var8_10);
                throw var38_37;
            }
            var20_19 = var4_8;
            var22_21 = var6_9;
            var26_27 = var9_11.getHeaderFields();
            var41_44 = var2_2.r;
            var10_12 = 416;
            if (var41_44 == var10_12) {
                var38_38 = var9_11.getHeaderField((String)var11_13);
                var11_13 = sb1_0.a;
                var39_40 = TextUtils.isEmpty((CharSequence)var38_38);
                if (var39_40) {
                    while (true) {
                        var42_45 = -1;
                        break;
                    }
                } else {
                    if (!(var39_40 = (var38_38 = (var11_13 = sb1_0.b).matcher((CharSequence)var38_38)).matches())) ** continue;
                    var38_38 = var38_38.group(var8_10);
                    var38_38.getClass();
                    var42_45 = Long.parseLong((String)var38_38);
                }
                var41_44 = (int)(var15_16 == var42_45 ? 0 : (var15_16 < var42_45 ? -1 : 1));
                if (var41_44 == 0) {
                    var2_2.q = var8_10;
                    this.o(var1_1);
                    var4_8 = -1;
                    var6_9 = 0.0 / 0.0;
                    var40_42 = var17_17 == var4_8 ? 0 : (var17_17 < var4_8 ? -1 : 1);
                    if (var40_42 != false) {
                        var4_8 = var17_17;
                    } else {
                        var4_8 = var20_19;
                        var6_9 = var22_21;
                    }
                    return var4_8;
                }
            }
            if ((var3_3 = var9_11.getErrorStream()) == null) ** GOTO lbl199
            try {
                ByteStreams.toByteArray((InputStream)var3_3);
                break block55;
lbl199:
                // 1 sources

                var40_43 = gz3.a;
            }
            catch (IOException v2) {
                var40_43 = gz3.a;
            }
        }
        this.p();
        var40_43 = var2_2.r;
        if (var40_43 == var10_12) {
            var41_44 = 2008;
            var3_3 = new DataSourceException(var41_44);
        } else {
            var40_43 = 0;
            var3_3 = null;
        }
        var8_10 = var2_2.r;
        var38_38 = new HttpDataSource$InvalidResponseCodeException(var8_10, (DataSourceException)var3_3, var26_27);
        throw var38_38;
        catch (IOException var3_7) {
            this.p();
            throw HttpDataSource$HttpDataSourceException.b(var3_7, var8_10);
        }
    }

    public final Map c() {
        Object object = this.o;
        if (object == null) {
            return ImmutableMap.of();
        }
        object = ((URLConnection)object).getHeaderFields();
        c$b c$b = new c$b((Map)object);
        return c$b;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void close() {
        Throwable throwable2;
        block7: {
            block6: {
                try {
                    InputStream inputStream = this.p;
                    if (inputStream == null) break block6;
                    try {
                        inputStream.close();
                    }
                    catch (IOException iOException) {
                        int n3 = gz3.a;
                        n3 = 2000;
                        int n4 = 3;
                        HttpDataSource$HttpDataSourceException httpDataSource$HttpDataSourceException = new HttpDataSource$HttpDataSourceException(iOException, n3, n4);
                        throw httpDataSource$HttpDataSourceException;
                    }
                }
                catch (Throwable throwable2) {
                    break block7;
                }
            }
            this.p = null;
            this.p();
            boolean bl2 = this.q;
            if (bl2) {
                this.q = false;
                this.m();
            }
            this.o = null;
            this.n = null;
            return;
        }
        this.p = null;
        this.p();
        boolean bl3 = this.q;
        if (bl3) {
            this.q = false;
            this.m();
        }
        this.o = null;
        this.n = null;
        throw throwable2;
    }

    public final Uri k() {
        Object object = this.o;
        if (object != null) {
            return Uri.parse((String)((URLConnection)object).getURL().toString());
        }
        object = this.n;
        if (object != null) {
            return ((ti0_1)object).a;
        }
        return null;
    }

    public final void p() {
        HttpURLConnection httpURLConnection = this.o;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            }
            catch (Exception exception) {
                String string2 = "Unexpected error while disconnecting";
                Cx.d(string2, exception);
            }
        }
    }

    public final URL q(URL object, String object2) {
        int n3 = 2001;
        if (object2 != null) {
            boolean bl2;
            Object object3;
            Object object4;
            int n4;
            block13: {
                n4 = 1;
                try {
                    object4 = new URL((URL)object, (String)object2);
                    object2 = ((URL)object4).getProtocol();
                    object3 = "https";
                    bl2 = ((String)object3).equals(object2);
                    if (bl2 || (bl2 = ((String)(object3 = "http")).equals(object2))) break block13;
                }
                catch (MalformedURLException malformedURLException) {
                    object2 = new HttpDataSource$HttpDataSourceException(malformedURLException, n3, n4);
                    throw object2;
                }
                object2 = kp1_0.c("Unsupported protocol redirect: ", (String)object2);
                object = new HttpDataSource$HttpDataSourceException((String)object2, n3);
                throw object;
            }
            bl2 = this.e;
            if (!bl2 && !(bl2 = ((String)object2).equals(object3 = ((URL)object).getProtocol()))) {
                bl2 = this.f;
                if (bl2) {
                    try {
                        object4 = ((URL)object4).toString();
                    }
                    catch (MalformedURLException malformedURLException) {
                        object2 = new HttpDataSource$HttpDataSourceException(malformedURLException, n3, n4);
                        throw object2;
                    }
                    object = ((URL)object).getProtocol();
                    object = ((String)object4).replaceFirst((String)object2, (String)object);
                    object4 = object3 = new URL((String)object);
                } else {
                    object4 = new StringBuilder("Disallowed cross-protocol redirect (");
                    object = ((URL)object).getProtocol();
                    ((StringBuilder)object4).append((String)object);
                    ((StringBuilder)object4).append(" to ");
                    ((StringBuilder)object4).append((String)object2);
                    ((StringBuilder)object4).append(")");
                    object = ((StringBuilder)object4).toString();
                    HttpDataSource$HttpDataSourceException httpDataSource$HttpDataSourceException = new HttpDataSource$HttpDataSourceException((String)object, n3);
                    throw httpDataSource$HttpDataSourceException;
                }
            }
            return object4;
        }
        object = new HttpDataSource$HttpDataSourceException("Null location redirect", n3);
        throw object;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final HttpURLConnection r(ti0_1 ti0_12) {
        int n3;
        int n4;
        c c2 = this;
        Object object = ti0_12;
        Object object2 = ti0_12.a.toString();
        URL uRL = new URL((String)object2);
        int n7 = ti0_12.i;
        int n8 = 1;
        int n10 = 0;
        String string2 = null;
        boolean bl2 = (n7 &= n8) == n8;
        n7 = (int)(c2.e ? 1 : 0);
        boolean bl3 = c2.m;
        int n14 = ((ti0_1)object).c;
        byte[] byArray = ((ti0_1)object).d;
        long l2 = ((ti0_1)object).f;
        long l3 = ((ti0_1)object).g;
        if (n7 == 0 && (n7 = (int)(c2.f ? 1 : 0)) == 0 && !bl3) {
            object = ((ti0_1)object).e;
            object2 = this;
            n10 = n14;
            byte[] byArray2 = byArray;
            boolean bl4 = true;
            return this.s(uRL, n14, byArray, l2, l3, bl2, bl4, (Map)object);
        }
        Object object3 = uRL;
        byte[] byArray3 = byArray;
        int n15 = n14;
        while (true) {
            int n16;
            n4 = n10 + 1;
            n7 = 20;
            if (n10 > n7) break;
            Object object4 = ((ti0_1)object).e;
            object2 = this;
            URL uRL2 = object3;
            n10 = n15;
            Map map2 = object4;
            object4 = byArray3;
            int n17 = n15;
            n3 = n4;
            long l4 = l3;
            URL uRL3 = object3;
            long l7 = l2;
            boolean bl5 = false;
            object2 = this.s((URL)object3, n15, byArray3, l2, l3, bl2, false, map2);
            int n18 = ((HttpURLConnection)object2).getResponseCode();
            string2 = ((URLConnection)object2).getHeaderField("Location");
            n14 = 303;
            n15 = 301;
            n4 = 300;
            int n19 = 302;
            if (n10 != n8 && n10 != (n16 = 3) || n18 != n4 && n18 != n15 && n18 != n19 && n18 != n14 && n18 != (n16 = 307) && n18 != (n16 = 308)) {
                void var4_10;
                n16 = 2;
                if (n17 != n16 || n18 != n4 && n18 != n15 && n18 != n19 && n18 != n14) return object2;
                ((HttpURLConnection)object2).disconnect();
                if (bl3 && n18 == n19) {
                    n15 = n17;
                    URL uRL4 = uRL3;
                } else {
                    byArray3 = null;
                    URL uRL5 = uRL3;
                    n15 = 1;
                }
                object3 = object2 = c2.q((URL)var4_10, string2);
            } else {
                URL uRL6 = uRL3;
                ((HttpURLConnection)object2).disconnect();
                object3 = object2 = c2.q(uRL3, string2);
                n15 = n17;
            }
            object = ti0_12;
            n10 = n3;
            l3 = l4;
            l2 = l7;
        }
        n3 = n4;
        n14 = n4;
        string2 = hj0_0.a(n4, "Too many redirects: ");
        NoRouteToHostException noRouteToHostException = new NoRouteToHostException(string2);
        object2 = new HttpDataSource$HttpDataSourceException(noRouteToHostException, 2001, n8);
        throw object2;
    }

    /*
     * Unable to fully structure code
     */
    public final int read(byte[] var1_1, int var2_3, int var3_4) {
        block15: {
            if (var3_4 == 0) {
                var4_5 = 0;
                var1_1 = null;
            } else {
                var5_6 = this.s;
                var7_7 = -1;
                var9_8 = -1;
                var10_9 = var5_6 == var7_7 ? 0 : (var5_6 < var7_7 ? -1 : 1);
                if (var10_9 != false) {
                    block14: {
                        var7_7 = this.t;
                        var5_6 -= var7_7;
                        var7_7 = 0L;
                        var10_9 = var5_6 == var7_7 ? 0 : (var5_6 < var7_7 ? -1 : 1);
                        if (var10_9 != false) break block14;
                        while (true) {
                            var4_5 = -1;
                            break block15;
                            break;
                        }
                    }
                    var7_7 = var3_4;
                    var5_6 = Math.min(var7_7, var5_6);
                    var3_4 = (int)var5_6;
                }
                var11_10 = this.p;
                ** try [egrp 4[TRYBLOCK] [4 : 94->97)] { 
lbl28:
                // 1 sources

                var4_5 = var11_10.read(var1_1, var2_3, var3_4);
                if (var4_5 == var9_8) ** continue;
                var12_11 = this.t;
                var5_6 = var4_5;
                var12_11 += var5_6;
                this.t = var12_11;
                this.l(var4_5);
            }
        }
        return var4_5;
lbl42:
        // 9 sources

        catch (IOException var1_2) {
            var2_3 = gz3.a;
            throw HttpDataSource$HttpDataSourceException.b(var1_2, 2);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final HttpURLConnection s(URL object, int n3, byte[] byArray, long l2, long l3, boolean bl2, boolean bl3, Map object2) {
        Object object3;
        int n4;
        String string2;
        String string3;
        int n7;
        long l4;
        object = (HttpURLConnection)((URL)object).openConnection();
        int n8 = this.g;
        ((URLConnection)object).setConnectTimeout(n8);
        n8 = this.h;
        ((URLConnection)object).setReadTimeout(n8);
        Object object4 = new HashMap();
        Object object5 = this.j;
        if (object5 != null) {
            object5 = ((Ca1)object5).a();
            ((HashMap)object4).putAll(object5);
        }
        object5 = this.k.a();
        ((HashMap)object4).putAll(object5);
        ((HashMap)object4).putAll(object2);
        object2 = ((HashMap)object4).entrySet().iterator();
        while ((n8 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
            object4 = object2.next();
            object5 = (String)object4.getKey();
            object4 = (String)object4.getValue();
            ((URLConnection)object).setRequestProperty((String)object5, (String)object4);
        }
        object2 = sb1_0.a;
        long l7 = 0L;
        long l8 = -1;
        Object object6 = l2 == l7 ? 0 : (l2 < l7 ? -1 : 1);
        if (object6 == false && (l4 = l3 == l8 ? 0 : (l3 < l8 ? -1 : 1)) == false) {
            n7 = 0;
            string3 = null;
        } else {
            object4 = "-";
            object2 = D70.c(l2, "bytes=", (String)object4);
            n8 = (int)(l3 == l8 ? 0 : (l3 < l8 ? -1 : 1));
            if (n8 != 0) {
                l2 += l3;
                l3 = 1L;
                ((StringBuilder)object2).append(l2 -= l3);
            }
            string3 = ((StringBuilder)object2).toString();
        }
        if (string3 != null) {
            string2 = "Range";
            ((URLConnection)object).setRequestProperty(string2, string3);
        }
        if ((string3 = this.i) != null) {
            string2 = "User-Agent";
            ((URLConnection)object).setRequestProperty(string2, string3);
        }
        string3 = bl2 ? "gzip" : "identity";
        string2 = "Accept-Encoding";
        ((URLConnection)object).setRequestProperty(string2, string3);
        ((HttpURLConnection)object).setInstanceFollowRedirects(bl3);
        n7 = 1;
        if (byArray != null) {
            n4 = 1;
        } else {
            n4 = 0;
            string2 = null;
        }
        ((URLConnection)object).setDoOutput(n4 != 0);
        n4 = ti0_1.k;
        if (n3 != n7) {
            n7 = 2;
            if (n3 != n7) {
                n7 = 3;
                if (n3 != n7) {
                    object = new IllegalStateException();
                    throw object;
                }
                object3 = "HEAD";
            } else {
                object3 = "POST";
            }
        } else {
            object3 = "GET";
        }
        ((HttpURLConnection)object).setRequestMethod((String)object3);
        if (byArray != null) {
            n3 = byArray.length;
            ((HttpURLConnection)object).setFixedLengthStreamingMode(n3);
            ((URLConnection)object).connect();
            object3 = ((URLConnection)object).getOutputStream();
            ((OutputStream)object3).write(byArray);
            ((OutputStream)object3).close();
            return object;
        }
        ((URLConnection)object).connect();
        return object;
    }

    public final void t(long l2) {
        long l3;
        long l4 = 0L;
        long l7 = l2 - l4;
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object == false) {
            return;
        }
        object = 4096;
        byte[] byArray = new byte[object];
        while ((l3 = l2 == l4 ? 0 : (l2 < l4 ? -1 : 1)) > 0) {
            long l8 = object;
            l8 = Math.min(l2, l8);
            int n3 = (int)l8;
            InputStream inputStream = this.p;
            l3 = inputStream.read(byArray, 0, n3);
            Thread thread2 = Thread.currentThread();
            n3 = (int)(thread2.isInterrupted() ? 1 : 0);
            if (n3 == 0) {
                n3 = -1;
                if (l3 != n3) {
                    long l12 = l3;
                    l2 -= l12;
                    this.l((int)l3);
                    continue;
                }
                HttpDataSource$HttpDataSourceException httpDataSource$HttpDataSourceException = new HttpDataSource$HttpDataSourceException();
                throw httpDataSource$HttpDataSourceException;
            }
            InterruptedIOException interruptedIOException = new InterruptedIOException();
            HttpDataSource$HttpDataSourceException httpDataSource$HttpDataSourceException = new HttpDataSource$HttpDataSourceException(interruptedIOException, 2000, 1);
            throw httpDataSource$HttpDataSourceException;
        }
    }
}

