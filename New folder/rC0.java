/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONException
 */
import com.facebook.GraphRequest$b;
import com.facebook.f;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

public final class rC0
implements GraphRequest$b {
    public final /* synthetic */ Di1 a;

    public /* synthetic */ rC0(Di1 di1) {
        this.a = di1;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(f object) {
        Di1 di1 = this.a;
        Intrinsics.checkNotNullParameter(di1, "$instrumentData");
        Object object2 = "response";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        try {
            boolean bl2;
            object2 = ((f)object).c;
            if (object2 != null) return;
            object = ((f)object).d;
            if (object == null) return;
            object2 = "success";
            boolean bl3 = object.getBoolean((String)object2);
            if (bl3 != (bl2 = true)) return;
            object = di1.a;
            ii1_0.a((String)object);
            return;
        }
        catch (JSONException jSONException) {
            return;
        }
    }
}

