/*
 * Decompiled with CFR 0.152.
 */
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URLConnection;

/*
 * Renamed from lm0
 */
public final class lm0_0
implements Closeable {
    public final HttpURLConnection a;

    public lm0_0(HttpURLConnection httpURLConnection) {
        this.a = httpURLConnection;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String a() {
        IOException iOException322222;
        Throwable throwable222222;
        block17: {
            StringBuilder stringBuilder;
            Object object;
            block16: {
                Object object2;
                block15: {
                    char c2;
                    char c3;
                    object = this.a;
                    boolean bl2 = false;
                    stringBuilder = null;
                    try {
                        c3 = ((HttpURLConnection)object).getResponseCode();
                        c2 = '\u0002';
                        if ((c3 /= 100) == c2) {
                            return null;
                        }
                    }
                    catch (IOException iOException2) {}
                    if (bl2) {
                        return null;
                    }
                    stringBuilder = new StringBuilder();
                    object2 = "Unable to fetch ";
                    stringBuilder.append((String)object2);
                    object2 = ((URLConnection)object).getURL();
                    stringBuilder.append(object2);
                    object2 = ". Failed with ";
                    stringBuilder.append((String)object2);
                    c3 = ((HttpURLConnection)object).getResponseCode();
                    stringBuilder.append((int)c3);
                    object2 = "\n";
                    stringBuilder.append((String)object2);
                    object = ((HttpURLConnection)object).getErrorStream();
                    Object object3 = new InputStreamReader((InputStream)object);
                    object2 = new BufferedReader((Reader)object3);
                    object = new StringBuilder();
                    try {
                        while ((object3 = ((BufferedReader)object2).readLine()) != null) {
                            ((StringBuilder)object).append((String)object3);
                            c2 = '\n';
                            ((StringBuilder)object).append(c2);
                        }
                    }
                    catch (Throwable throwable222222) {
                        break block15;
                    }
                    try {
                        ((BufferedReader)object2).close();
                        break block16;
                    }
                    catch (Exception exception) {}
                }
                ((BufferedReader)object2).close();
                break block17;
            }
            try {
                object = ((StringBuilder)object).toString();
                stringBuilder.append((String)object);
                return stringBuilder.toString();
            }
            catch (IOException iOException322222) {}
            catch (Exception exception) {}
        }
        throw throwable222222;
        rx1.c("get error failed ", iOException322222);
        return iOException322222.getMessage();
    }

    public final void close() {
        this.a.disconnect();
    }
}

