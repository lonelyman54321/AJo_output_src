/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONException
 */
import com.facebook.GraphRequest$b;
import com.facebook.f;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

public final class eB0
implements GraphRequest$b {
    public final /* synthetic */ ArrayList a;

    public /* synthetic */ eB0(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final void b(f object) {
        block11: {
            Object object2 = this.a;
            Intrinsics.checkNotNullParameter(object2, "$validReports");
            Object object3 = "response";
            Intrinsics.checkNotNullParameter(object, (String)object3);
            object3 = ((f)object).c;
            if (object3 != null) break block11;
            object = ((f)object).d;
            if (object == null) break block11;
            object3 = "success";
            boolean bl2 = object.getBoolean((String)object3);
            boolean bl3 = true;
            if (bl2 != bl3) break block11;
            try {
                object = object2.iterator();
            }
            catch (JSONException jSONException) {}
            while (true) {
                boolean bl4 = object.hasNext();
                if (!bl4) break block11;
                break;
            }
            {
                object2 = object.next();
                object2 = (cb0_0)object2;
                object2 = ((cb0_0)object2).a;
                ii1_0.a((String)object2);
                continue;
            }
        }
    }
}

