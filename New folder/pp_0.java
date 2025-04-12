/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
import com.facebook.FacebookSdk;
import com.facebook.j;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/*
 * Renamed from pP
 */
public final class pp_0
implements vv1$a,
kJ0$a {
    public static Object a(int n3, ArrayList arrayList) {
        int n4 = arrayList.size() - n3;
        return arrayList.get(n4);
    }

    public void b(boolean bl2) {
        if (bl2) {
            File[] fileArray = FacebookSdk.a;
            bl2 = j.c();
            if (bl2 && !(bl2 = lz3_0.y())) {
                int n3;
                Object object;
                fileArray = ii1_0.b();
                int n4 = 0;
                eB0 eB02 = null;
                if (fileArray == null) {
                    fileArray = new File[]{};
                } else {
                    object = new Object();
                    fileArray = fileArray.listFiles((FilenameFilter)object);
                    object = "reportDir.listFiles { di\u2026OR_REPORT_PREFIX)))\n    }";
                    Intrinsics.checkNotNullExpressionValue(fileArray, (String)object);
                }
                object = new ArrayList();
                for (File file : fileArray) {
                    Long l2;
                    String string2;
                    Intrinsics.checkNotNullParameter(file, "file");
                    cb0_0 cb0_02 = new Object();
                    String string3 = file.getName();
                    Object object2 = "file.name";
                    Intrinsics.checkNotNullExpressionValue(string3, (String)object2);
                    cb0_02.a = string3;
                    JSONObject jSONObject = ii1_0.e(string3);
                    if (jSONObject != null) {
                        String string4;
                        long l3 = 0L;
                        long l4 = jSONObject.optLong("timestamp", l3);
                        cb0_02.c = object2 = Long.valueOf(l4);
                        object2 = "error_message";
                        cb0_02.b = string4 = jSONObject.optString((String)object2, null);
                    }
                    if ((string2 = cb0_02.b) == null || (l2 = cb0_02.c) == null) continue;
                    ((ArrayList)object).add(cb0_02);
                }
                fileArray = new Object();
                bx_2.q((List)object, (Comparator)fileArray);
                fileArray = new JSONArray();
                while (n4 < (n3 = ((ArrayList)object).size()) && n4 < (n3 = 1000)) {
                    Object e2 = ((ArrayList)object).get(n4);
                    fileArray.put(e2);
                    ++n4;
                }
                eB02 = new eB0((ArrayList)object);
                object = "error_reports";
                ii1_0.f((String)object, (JSONArray)fileArray, eB02);
            }
        }
    }

    public void invoke(Object object) {
        ((oe)object).getClass();
    }
}

