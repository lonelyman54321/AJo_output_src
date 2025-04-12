/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest$b;
import com.facebook.GraphRequest$c;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/*
 * Renamed from Ii1
 */
public final class ii1_0 {
    public static final void a(String string2) {
        File file = ii1_0.b();
        if (file != null && string2 != null) {
            File file2 = new File(file, string2);
            file2.delete();
        }
    }

    public static final File b() {
        String string2;
        File file = FacebookSdk.a().getCacheDir();
        File file2 = new File(file, string2 = "instrument");
        boolean bl2 = file2.exists();
        if (!bl2 && !(bl2 = file2.mkdirs())) {
            file2 = null;
        }
        return file2;
    }

    public static final boolean c(StackTraceElement object) {
        boolean bl2;
        block3: {
            block2: {
                Intrinsics.checkNotNullParameter(object, "element");
                String string2 = ((StackTraceElement)object).getClassName();
                String string3 = "element.className";
                Intrinsics.checkNotNullExpressionValue(string2, string3);
                String string4 = "com.facebook";
                bl2 = false;
                boolean bl3 = b.s(string2, string4, false);
                if (bl3) break block2;
                object = ((StackTraceElement)object).getClassName();
                Intrinsics.checkNotNullExpressionValue(object, string3);
                string2 = "com.meta";
                boolean bl4 = b.s((String)object, string2, false);
                if (!bl4) break block3;
            }
            bl2 = true;
        }
        return bl2;
    }

    public static final boolean d(Thread stackTraceElementArray) {
        block3: {
            if ((stackTraceElementArray = stackTraceElementArray.getStackTrace()) == null) break block3;
            for (StackTraceElement stackTraceElement : stackTraceElementArray) {
                block5: {
                    String string2;
                    String string3;
                    boolean bl2;
                    String string4;
                    block4: {
                        string4 = "element";
                        Intrinsics.checkNotNullExpressionValue(stackTraceElement, string4);
                        bl2 = ii1_0.c(stackTraceElement);
                        if (!bl2) continue;
                        string4 = stackTraceElement.getClassName();
                        string3 = "element.className";
                        Intrinsics.checkNotNullExpressionValue(string4, string3);
                        string2 = "com.facebook.appevents.codeless";
                        bl2 = b.s(string4, string2, false);
                        if (bl2) break block4;
                        string4 = stackTraceElement.getClassName();
                        Intrinsics.checkNotNullExpressionValue(string4, string3);
                        string3 = "com.facebook.appevents.suggestedevents";
                        bl2 = b.s(string4, string3, false);
                        if (!bl2) break block5;
                    }
                    string4 = stackTraceElement.getMethodName();
                    string3 = "element.methodName";
                    Intrinsics.checkNotNullExpressionValue(string4, string3);
                    string2 = "onClick";
                    bl2 = b.s(string4, string2, false);
                    if (bl2) continue;
                    string4 = stackTraceElement.getMethodName();
                    Intrinsics.checkNotNullExpressionValue(string4, string3);
                    string2 = "onItemClick";
                    bl2 = b.s(string4, string2, false);
                    if (bl2) continue;
                    String string5 = stackTraceElement.getMethodName();
                    Intrinsics.checkNotNullExpressionValue(string5, string3);
                    string4 = "onTouch";
                    boolean bl3 = b.s(string5, string4, false);
                    if (bl3) continue;
                }
                return true;
            }
        }
        return false;
    }

    public static final JSONObject e(String string2) {
        Object object = ii1_0.b();
        if (object != null && string2 != null) {
            File file = new File((File)object, string2);
            object = new FileInputStream(file);
            object = lz3_0.K((InputStream)object);
            try {
                file = new JSONObject((String)object);
                return file;
            }
            catch (Exception exception) {
                ii1_0.a(string2);
            }
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final void f(String object, JSONArray object2, GraphRequest$b graphRequest$b) {
        boolean bl2;
        String string2;
        int n3;
        block12: {
            n3 = 1;
            string2 = "reports";
            Intrinsics.checkNotNullParameter(object2, string2);
            int n4 = object2.length();
            if (n4 == 0) {
                return;
            }
            string2 = new JSONObject();
            object2 = object2.toString();
            string2.put((String)object, object2);
            object = lz3_0.p();
            if (object == null) break block12;
            try {
                object2 = object.keys();
            }
            catch (JSONException jSONException) {
                return;
            }
            while (true) {
                bl2 = object2.hasNext();
                if (!bl2) break;
                Object e2 = object2.next();
                String string3 = (String)e2;
                Object object3 = object.get(string3);
                string2.put(string3, object3);
                continue;
                break;
            }
        }
        object = GraphRequest.j;
        object = StringCompanionObject.INSTANCE;
        object = FacebookSdk.b();
        object2 = new Object[n3];
        bl2 = false;
        object2[0] = object;
        String string4 = "format(format, *args)";
        object = xh2_0.a((Object[])object2, n3, "%s/instruments", string4);
        object2 = null;
        object = GraphRequest$c.i(null, (String)object, (JSONObject)string2, graphRequest$b);
        ((GraphRequest)object).d();
        return;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void g(String object, String object2) {
        Object object3 = ii1_0.b();
        if (object3 == null) return;
        if (object == null) return;
        if (object2 == null) {
            return;
        }
        File file = new File((File)object3, (String)object);
        try {
            object = new FileOutputStream(file);
            object3 = Charsets.UTF_8;
            object2 = ((String)object2).getBytes((Charset)object3);
            object3 = "this as java.lang.String).getBytes(charset)";
            Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
            ((FileOutputStream)object).write((byte[])object2);
            ((FileOutputStream)object).close();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }
}

