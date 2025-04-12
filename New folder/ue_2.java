/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.http.X509TrustManagerExtensions
 *  android.os.Build$VERSION
 */
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ue
 */
public final class ue_2
extends zs2_2 {
    public static final boolean d;
    public final ArrayList c;

    static {
        int n3;
        int n4 = Zs2$a.c();
        n4 = n4 != 0 && (n4 = Build.VERSION.SDK_INT) >= (n3 = 29) ? 1 : 0;
        d = n4;
    }

    public ue_2() {
        boolean bl2;
        Iterator iterator;
        int n3;
        int n4 = Zs2$a.c();
        if (n4 != 0 && (n4 = Build.VERSION.SDK_INT) >= (n3 = 29)) {
        } else {
            n4 = 0;
            iterator = null;
        }
        Object object = hj_2.f;
        ArrayList<Object> arrayList = new ArrayList<Object>((Xn0$a)object);
        Object object2 = l50_0.a;
        object = new xn0_2((Xn0$a)object2);
        Object[] objectArray = ca_1.a;
        object2 = new xn0_2((Xn0$a)objectArray);
        int n7 = 4;
        objectArray = new y83_0[n7];
        objectArray[0] = iterator;
        objectArray[1] = arrayList;
        objectArray[2] = object;
        n4 = 3;
        objectArray[n4] = object2;
        Intrinsics.checkNotNullParameter(objectArray, "elements");
        iterator = tp_2.y(objectArray);
        arrayList = new ArrayList<Object>();
        iterator = ((ArrayList)((Object)iterator)).iterator();
        while (bl2 = iterator.hasNext()) {
            object2 = object = iterator.next();
            object2 = (y83_0)object;
            boolean bl3 = object2.isSupported();
            if (!bl3) continue;
            arrayList.add(object);
        }
        this.c = arrayList;
    }

    public final i0_0 b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        Object object = "trustManager";
        Intrinsics.checkNotNullParameter(x509TrustManager, (String)object);
        Intrinsics.checkNotNullParameter(x509TrustManager, (String)object);
        object = null;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            x509TrustManagerExtensions = null;
        }
        if (x509TrustManagerExtensions != null) {
            object = new of_1(x509TrustManager, x509TrustManagerExtensions);
        }
        if (object == null) {
            object = super.b(x509TrustManager);
        }
        return object;
    }

    public final void d(SSLSocket sSLSocket, String string2, List list) {
        Object object;
        block2: {
            boolean bl2;
            Intrinsics.checkNotNullParameter(sSLSocket, "sslSocket");
            Intrinsics.checkNotNullParameter(list, "protocols");
            Iterator iterator = this.c.iterator();
            while (bl2 = iterator.hasNext()) {
                Object object2 = object = iterator.next();
                object2 = (y83_0)object;
                boolean bl3 = object2.a(sSLSocket);
                if (!bl3) continue;
                break block2;
            }
            bl2 = false;
            object = null;
        }
        object = (y83_0)object;
        if (object != null) {
            object.c(sSLSocket, string2, list);
        }
    }

    public final String f(SSLSocket sSLSocket) {
        String string2;
        Object object;
        block3: {
            boolean bl2;
            block2: {
                Object object2;
                boolean bl3;
                Intrinsics.checkNotNullParameter(sSLSocket, "sslSocket");
                Iterator iterator = this.c.iterator();
                do {
                    bl2 = iterator.hasNext();
                    string2 = null;
                    if (!bl2) break block2;
                    object2 = object = iterator.next();
                } while (!(bl3 = (object2 = (y83_0)object).a(sSLSocket)));
                break block3;
            }
            bl2 = false;
            object = null;
        }
        object = (y83_0)object;
        if (object != null) {
            string2 = object.b(sSLSocket);
        }
        return string2;
    }

    public final boolean h(String string2) {
        Intrinsics.checkNotNullParameter(string2, "hostname");
        return te_2.a(sk3_1.a(), string2);
    }
}

