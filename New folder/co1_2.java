/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONException
 *  org.json.JSONObject
 */
import com.facebook.FacebookSdk;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/*
 * Renamed from CO1
 */
public final class co1_2 {
    public static final co1_2 a;
    public static boolean b;

    static {
        co1_2 co1_22;
        a = co1_22 = new co1_2();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        boolean bl2 = td0.b(this);
        if (bl2) {
            return;
        }
        try {
            Object object2 = FacebookSdk.b();
            Object object = null;
            object2 = dl0_2.k((String)object2, false);
            if (object2 == null) {
                return;
            }
            object2 = ((al0_2)object2).m;
            if (object2 == null) {
                return;
            }
            object = ko1_1.d;
            object = "rulesFromServer";
            Intrinsics.checkNotNullParameter(object2, (String)object);
            try {
                object = ko1_1.a();
                ((CopyOnWriteArraySet)object).clear();
                object = new JSONObject((String)object2);
                ko1$a_0.a((JSONObject)object);
                return;
            }
            catch (JSONException jSONException) {
                return;
            }
        }
        catch (Throwable throwable) {
            td0.a(this, throwable);
            return;
        }
    }
}

