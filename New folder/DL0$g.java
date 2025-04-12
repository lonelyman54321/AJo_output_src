/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONException
 *  org.json.JSONObject
 *  org.json.JSONTokener
 */
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public final class DL0$g {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static JSONObject a(BufferedInputStream object) {
        JSONException jSONException2;
        Object object2;
        block9: {
            String string2;
            String string3;
            int n3;
            int n4 = 1;
            Object object3 = "stream";
            Intrinsics.checkNotNullParameter(object, (String)object3);
            int n7 = ((InputStream)object).read();
            if (n7 != 0) {
                return null;
            }
            n7 = 0;
            object3 = null;
            int n8 = 0;
            Object object4 = null;
            int n10 = 0;
            while (true) {
                int n14;
                n3 = 3;
                string3 = "TAG";
                string2 = "DL0";
                if (n8 >= n3) break;
                n3 = ((InputStream)object).read();
                if (n3 == (n14 = -1)) {
                    object = sx1.d;
                    object = Ax1.CACHE;
                    AtomicLong atomicLong = dl0_1.h;
                    Intrinsics.checkNotNullExpressionValue(string2, string3);
                    sx1$a.a((Ax1)((Object)object), string2, "readHeader: stream.read returned -1 while reading header size");
                    return null;
                }
                n10 <<= 8;
                n10 += (n3 &= 0xFF);
                n8 += n4;
            }
            object4 = new byte[n10];
            while (n7 < n10) {
                n3 = n10 - n7;
                if ((n3 = ((InputStream)object).read((byte[])object4, n7, n3)) < n4) {
                    object = sx1.d;
                    object = Ax1.CACHE;
                    Object object5 = dl0_1.h;
                    Intrinsics.checkNotNullExpressionValue(string2, string3);
                    object5 = new StringBuilder("readHeader: stream.read stopped at ");
                    object3 = n7;
                    ((StringBuilder)object5).append(object3);
                    ((StringBuilder)object5).append(" when expected ");
                    ((StringBuilder)object5).append(n10);
                    object5 = ((StringBuilder)object5).toString();
                    sx1$a.a((Ax1)((Object)object), string2, (String)object5);
                    return null;
                }
                n7 += n3;
            }
            object2 = Charsets.UTF_8;
            object = new String((byte[])object4, (Charset)object2);
            object2 = new JSONTokener((String)object);
            try {
                object = object2.nextValue();
            }
            catch (JSONException jSONException2) {
                break block9;
            }
            n4 = object instanceof JSONObject;
            if (n4 == 0) {
                object2 = sx1.d;
                object2 = Ax1.CACHE;
                object3 = dl0_1.h;
                Intrinsics.checkNotNullExpressionValue(string2, string3);
                object3 = new StringBuilder();
                object4 = "readHeader: expected JSONObject, got ";
                ((StringBuilder)object3).append((String)object4);
                object = object.getClass();
                object = ((Class)object).getCanonicalName();
                ((StringBuilder)object3).append((String)object);
                object = ((StringBuilder)object3).toString();
                sx1$a.a((Ax1)((Object)object2), string2, (String)object);
                return null;
            }
            return (JSONObject)object;
        }
        String string4 = jSONException2.getMessage();
        object2 = new IOException(string4);
        throw object2;
    }
}

