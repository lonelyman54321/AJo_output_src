/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from re1
 */
public final class re1_0 {
    public static final re1_0 a;
    public static final String b;
    public static dl0_1 c;

    static {
        re1_0 re1_02;
        a = re1_02 = new re1_0();
        b = re1_0.class.getSimpleName();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final dl0_1 a() {
        Class<re1_0> clazz = re1_0.class;
        synchronized (clazz) {
            Throwable throwable2;
            block5: {
                Object object;
                block4: {
                    try {
                        object = c;
                        if (object != null) break block4;
                        String string2 = b;
                        Object object2 = "TAG";
                        Intrinsics.checkNotNullExpressionValue(string2, (String)object2);
                        object2 = new DL0$d();
                        c = object = new dl0_1(string2, (DL0$d)object2);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                if ((object = c) != null) return object;
                object = "imageCache";
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
                return null;
            }
            throw throwable2;
        }
    }

    public static final BufferedInputStream b(Uri object) {
        BufferedInputStream bufferedInputStream = null;
        if (object != null) {
            Object object2 = a;
            object2.getClass();
            boolean bl2 = re1_0.d(object);
            if (bl2) {
                object2 = re1_0.a();
                object = object.toString();
                Object object3 = "uri.toString()";
                Intrinsics.checkNotNullExpressionValue(object, (String)object3);
                object3 = dl0_1.h;
                try {
                    bufferedInputStream = ((dl0_1)object2).a((String)object, null);
                }
                catch (IOException iOException) {
                    object2 = sx1.d;
                    object2 = Ax1.CACHE;
                    object3 = b;
                    String string2 = "TAG";
                    Intrinsics.checkNotNullExpressionValue(object3, string2);
                    String string3 = ((Object)iOException).toString();
                    sx1$a.c((Ax1)((Object)object2), (String)object3, string3);
                }
            }
        }
        return bufferedInputStream;
    }

    public static final InputStream c(HttpURLConnection object) {
        String string2 = "connection";
        Intrinsics.checkNotNullParameter(object, string2);
        int n3 = ((HttpURLConnection)object).getResponseCode();
        int n4 = 200;
        InputStream inputStream = null;
        if (n3 == n4) {
            InputStream inputStream2;
            block15: {
                Object object2;
                Object object3 = Uri.parse((String)((URLConnection)object).getURL().toString());
                inputStream2 = ((URLConnection)object).getInputStream();
                try {
                    object2 = a;
                }
                catch (IOException iOException) {}
                object2.getClass();
                boolean bl2 = re1_0.d(object3);
                if (!bl2) break block15;
                object2 = re1_0.a();
                object3 = object3.toString();
                Object object4 = "uri.toString()";
                Intrinsics.checkNotNullExpressionValue(object3, (String)object4);
                Intrinsics.checkNotNullParameter(object, string2);
                int n7 = 8192;
                object4 = new BufferedInputStream(inputStream2, n7);
                ((re1$a)object4).a = object;
                object2.getClass();
                object = "key";
                Intrinsics.checkNotNullParameter(object3, (String)object);
                object = "input";
                Intrinsics.checkNotNullParameter(object4, (String)object);
                object = ((dl0_1)object2).b((String)object3, null);
                inputStream = new DL0$c((re1$a)object4, (BufferedOutputStream)object);
            }
            inputStream = inputStream2;
        }
        return inputStream;
    }

    public static boolean d(Uri object) {
        if (object != null && (object = object.getHost()) != null) {
            boolean bl2;
            String string2 = "fbcdn.net";
            boolean bl3 = Intrinsics.areEqual(object, string2);
            boolean bl4 = true;
            if (bl3 || (bl3 = kotlin.text.b.h((String)object, string2 = ".fbcdn.net", false)) || (bl3 = kotlin.text.b.s((String)object, string2 = "fbcdn", false)) && (bl2 = kotlin.text.b.h((String)object, string2 = ".akamaihd.net", false))) {
                return bl4;
            }
        }
        return false;
    }
}

