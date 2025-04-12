/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 *  android.text.TextUtils
 *  android.util.Log
 */
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.HttpException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.Map;

/*
 * Renamed from Qb1
 */
public final class qb1_0
implements ei0_0 {
    public final a01 a;
    public final int b;
    public HttpURLConnection c;
    public InputStream d;
    public volatile boolean e;

    public qb1_0(a01 a012, int n3) {
        this.a = a012;
        this.b = n3;
    }

    public final Class a() {
        return InputStream.class;
    }

    public final void b() {
        Object object = this.d;
        if (object != null) {
            try {
                ((InputStream)object).close();
            }
            catch (IOException iOException) {}
        }
        if ((object = this.c) != null) {
            ((HttpURLConnection)object).disconnect();
        }
        this.c = null;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final InputStream c(URL object, int n3, URL object2, Map object3) {
        int n4;
        int n7;
        Object object4;
        Object object5 = "HttpUrlFetcher";
        int n8 = 5;
        int n10 = -1;
        if (n3 >= n8) {
            object = new HttpException(n10, null, "Too many (> 5) redirects!");
            throw object;
        }
        if (object2 != null) {
            try {
                object4 = ((URL)object).toURI();
                object2 = ((URL)object2).toURI();
                n7 = ((URI)object4).equals(object2);
                if (n7 != 0) {
                    object4 = "In re-direct loop";
                    object2 = new HttpException(n10, null, (String)object4);
                    throw object2;
                }
            }
            catch (URISyntaxException uRISyntaxException) {}
        }
        n7 = 0;
        object2 = null;
        object4 = ((URL)object).openConnection();
        object4 = (HttpURLConnection)object4;
        Iterator iterator = object3.entrySet().iterator();
        while ((n4 = iterator.hasNext()) != 0) {
            Object object6 = iterator.next();
            String string2 = (String)object6.getKey();
            object6 = (String)object6.getValue();
            ((URLConnection)object4).addRequestProperty(string2, (String)object6);
        }
        int n14 = this.b;
        ((URLConnection)object4).setConnectTimeout(n14);
        ((URLConnection)object4).setReadTimeout(n14);
        ((URLConnection)object4).setUseCaches(false);
        n14 = 1;
        ((URLConnection)object4).setDoInput(n14 != 0);
        ((HttpURLConnection)object4).setInstanceFollowRedirects(false);
        this.c = object4;
        n7 = 3;
        try {
            ((URLConnection)object4).connect();
            object4 = this.c;
            this.d = object4 = ((URLConnection)object4).getInputStream();
        }
        catch (IOException iOException) {
            object3 = this.c;
            try {
                n10 = ((HttpURLConnection)object3).getResponseCode();
            }
            catch (IOException iOException2) {
                Log.isLoggable((String)object5, (int)n7);
            }
            HttpException httpException = new HttpException(n10, iOException, "Failed to connect or obtain data");
            throw httpException;
        }
        n8 = (int)(this.e ? 1 : 0);
        if (n8 != 0) {
            return null;
        }
        object4 = this.c;
        try {
            n8 = ((HttpURLConnection)object4).getResponseCode();
        }
        catch (IOException iOException) {
            Log.isLoggable((String)object5, (int)n7);
            n8 = -1;
        }
        n4 = n8 / 100;
        int n15 = 2;
        if (n4 == n15) {
            IOException iOException322;
            block29: {
                Object object7;
                object = this.c;
                try {
                    object7 = ((URLConnection)object).getContentEncoding();
                    n3 = (int)(TextUtils.isEmpty((CharSequence)object7) ? 1 : 0);
                    if (n3 != 0) {
                        n3 = ((URLConnection)object).getContentLength();
                        object3 = ((URLConnection)object).getInputStream();
                        long l2 = n3;
                        this.d = object7 = new R60((InputStream)object3, l2);
                        return this.d;
                    }
                }
                catch (IOException iOException322) {
                    break block29;
                }
                n3 = (int)(Log.isLoggable((String)object5, (int)n7) ? 1 : 0);
                if (n3 != 0) {
                    ((URLConnection)object).getContentEncoding();
                }
                this.d = object7 = ((URLConnection)object).getInputStream();
                return this.d;
            }
            try {
                n10 = ((HttpURLConnection)object).getResponseCode();
            }
            catch (IOException iOException4) {
                Log.isLoggable((String)object5, (int)n7);
            }
            object3 = new HttpException(n10, iOException322, "Failed to obtain InputStream");
            throw object3;
        }
        if (n4 == n7) {
            object2 = this.c;
            object5 = "Location";
            boolean bl2 = TextUtils.isEmpty((CharSequence)(object2 = ((URLConnection)object2).getHeaderField((String)object5)));
            if (bl2) {
                object = new HttpException(n8, null, "Received empty or null redirect url");
                throw object;
            }
            try {
                object5 = new URL((URL)object, (String)object2);
                this.b();
                return this.c((URL)object5, n3 += n14, (URL)object, (Map)object3);
            }
            catch (MalformedURLException malformedURLException) {
                object2 = kp1_0.c("Bad redirect url: ", (String)object2);
                HttpException httpException = new HttpException(n8, malformedURLException, (String)object2);
                throw httpException;
            }
        }
        if (n8 == n10) {
            object = new HttpException(n8, null, "Http request failed");
            throw object;
        }
        try {
            Object object8 = this.c;
            object8 = ((HttpURLConnection)object8).getResponseMessage();
            object = new HttpException(n8, null, (String)object8);
            throw object;
        }
        catch (IOException iOException) {
            HttpException httpException = new HttpException(n8, iOException, "Failed to get a response message");
            throw httpException;
        }
        catch (IOException iOException) {
            HttpException httpException = new HttpException(0, iOException, "URL.openConnection threw");
            throw httpException;
        }
    }

    public final void cancel() {
        this.e = true;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d(Az2 object, ei0$a ei0$a) {
        Throwable throwable2;
        int n3;
        String string2;
        block5: {
            block6: {
                String string3;
                object = this.a;
                string2 = "HttpUrlFetcher";
                n3 = kx1.a;
                SystemClock.elapsedRealtimeNanos();
                n3 = 2;
                URL uRL = ((a01)object).f;
                if (uRL == null) {
                    string3 = ((a01)object).e();
                    ((a01)object).f = uRL = new URL(string3);
                }
                uRL = ((a01)object).f;
                object = ((a01)object).d();
                string3 = null;
                object = this.c(uRL, 0, null, (Map)object);
                ei0$a.f(object);
                {
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    catch (IOException iOException) {}
                    int n4 = 3;
                    {
                        Log.isLoggable((String)string2, (int)n4);
                        ei0$a.c(iOException);
                    }
                    boolean bl2 = Log.isLoggable((String)string2, (int)n3);
                    if (!bl2) return;
                    break block6;
                }
                boolean bl3 = Log.isLoggable((String)string2, (int)n3);
                if (!bl3) return;
            }
            SystemClock.elapsedRealtimeNanos();
            return;
        }
        boolean bl4 = Log.isLoggable((String)string2, (int)n3);
        if (!bl4) throw throwable2;
        SystemClock.elapsedRealtimeNanos();
        throw throwable2;
    }

    public final pi0_0 e() {
        return pi0_0.REMOTE;
    }
}

