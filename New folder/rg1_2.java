/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 */
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/*
 * Renamed from rg1
 */
public final class rg1_2
implements cr_2 {
    public final vi_2 a;
    public final ae0_1 b;
    public JSONArray c;
    public JSONArray d;
    public String e;

    public rg1_2(vi_2 vi_22, ae0_1 ae0_12) {
        Intrinsics.checkNotNullParameter(vi_22, "ctPreference");
        Intrinsics.checkNotNullParameter(ae0_12, "cryptHandler");
        this.a = vi_22;
        this.b = ae0_12;
    }

    public final void a(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "deviceId");
        Intrinsics.checkNotNullParameter(string3, "accountId");
        jd3_1.a.a();
        string2 = jd3_1.a(1, string2, string3);
        this.a.a(string2);
    }

    public final void b(JSONArray object) {
        Intrinsics.checkNotNullParameter(object, "serverSideInApps");
        this.d = object;
        object = object.toString();
        Intrinsics.checkNotNullExpressionValue(object, "serverSideInApps.toString()");
        Object object2 = this.b;
        object2.getClass();
        Intrinsics.checkNotNullParameter(object, "plainText");
        Object object3 = ((ae0_1)object2).b;
        object2 = ((ae0_1)object2).c;
        object = ((O)object3).a0((String)object, (String)object2);
        if (object != null) {
            object2 = this.a;
            object3 = "inApp";
            ((vi_2)object2).h((String)object3, (String)object);
        }
    }
}

