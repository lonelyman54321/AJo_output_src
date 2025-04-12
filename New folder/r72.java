/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.Charsets;
import org.json.JSONObject;

public final class r72
implements Runnable {
    public final /* synthetic */ URL a;
    public final /* synthetic */ Ref$ObjectRef b;
    public final /* synthetic */ String c;
    public final /* synthetic */ ReentrantLock d;
    public final /* synthetic */ Condition e;

    public /* synthetic */ r72(URL uRL, Ref$ObjectRef ref$ObjectRef, String string2, ReentrantLock reentrantLock, Condition condition) {
        this.a = uRL;
        this.b = ref$ObjectRef;
        this.c = string2;
        this.d = reentrantLock;
        this.e = condition;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        Throwable throwable2222222;
        URLConnection uRLConnection;
        ReentrantLock reentrantLock;
        Object object;
        block12: {
            object = this.e;
            Object object2 = this.a;
            Intrinsics.checkNotNullParameter(object2, "$openIdKeyUrl");
            Ref$ObjectRef ref$ObjectRef = this.b;
            Intrinsics.checkNotNullParameter(ref$ObjectRef, "$result");
            String string2 = this.c;
            Intrinsics.checkNotNullParameter(string2, "$kid");
            reentrantLock = this.d;
            Intrinsics.checkNotNullParameter(reentrantLock, "$lock");
            uRLConnection = ((URL)object2).openConnection();
            object2 = "null cannot be cast to non-null type java.net.HttpURLConnection";
            Intrinsics.checkNotNull(uRLConnection, (String)object2);
            uRLConnection = (HttpURLConnection)uRLConnection;
            object2 = uRLConnection.getInputStream();
            Object object3 = "connection.inputStream";
            Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
            object3 = Charsets.UTF_8;
            InputStreamReader inputStreamReader = new InputStreamReader((InputStream)object2, (Charset)object3);
            int n3 = 8192;
            object2 = new BufferedReader(inputStreamReader, n3);
            object2 = vm3_0.b((Reader)object2);
            object3 = uRLConnection.getInputStream();
            ((InputStream)object3).close();
            object3 = new JSONObject((String)object2);
            ref$ObjectRef.element = object2 = object3.optString(string2);
            ((HttpURLConnection)uRLConnection).disconnect();
            reentrantLock.lock();
            {
                catch (Throwable throwable2222222) {
                    break block12;
                }
                catch (Exception exception) {}
                {
                    exception.getMessage();
                    ((HttpURLConnection)uRLConnection).disconnect();
                    reentrantLock.lock();
                }
                try {
                    object.signal();
                    object = Unit.a;
                    return;
                }
                catch (Throwable throwable3) {
                    reentrantLock.unlock();
                    throw throwable3;
                }
            }
            try {
                object.signal();
                object = Unit.a;
                return;
            }
            finally {
                reentrantLock.unlock();
            }
        }
        ((HttpURLConnection)uRLConnection).disconnect();
        reentrantLock.lock();
        try {
            object.signal();
            object = Unit.a;
            throw throwable2222222;
        }
        finally {
            reentrantLock.unlock();
        }
    }
}

