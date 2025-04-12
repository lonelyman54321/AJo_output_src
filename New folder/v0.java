/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONException
 */
import com.facebook.GraphRequest$b;
import com.facebook.f;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

public final class v0
implements GraphRequest$b {
    public final /* synthetic */ List a;

    public /* synthetic */ v0(List list) {
        this.a = list;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(f object) {
        Object object2 = this.a;
        Class<w0> clazz = w0.class;
        boolean bl2 = td0.b(clazz);
        if (bl2) {
            return;
        }
        Object object3 = "$validReports";
        try {
            Intrinsics.checkNotNullParameter(object2, (String)object3);
            object3 = "response";
            Intrinsics.checkNotNullParameter(object, (String)object3);
            try {
                boolean bl4;
                object3 = ((f)object).c;
                if (object3 != null) return;
                object = ((f)object).d;
                if (object == null) return;
                object3 = "success";
                boolean bl3 = object.getBoolean((String)object3);
                if (bl3 != (bl2 = true)) return;
                object2 = (Iterable)object2;
                object = object2.iterator();
                while (bl4 = object.hasNext()) {
                    object2 = object.next();
                    object2 = (Di1)object2;
                    object2 = ((Di1)object2).a;
                    ii1_0.a((String)object2);
                }
                return;
            }
            catch (JSONException jSONException) {
                return;
            }
        }
        catch (Throwable throwable) {
            td0.a(clazz, throwable);
        }
    }
}

