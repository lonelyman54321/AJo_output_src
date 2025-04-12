/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.Bundle
 */
import android.app.Activity;
import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from lC
 */
public final class lc_1
implements Function0 {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ dr0_0 d;
    public final /* synthetic */ i90_0 e;
    public final /* synthetic */ yp0_0 f;

    public /* synthetic */ lc_1(Activity activity, String string2, String string3, dr0_0 dr0_02, c80 c802, yp0_0 yp0_02) {
        this.a = activity;
        this.b = string2;
        this.c = string3;
        this.d = dr0_02;
        this.e = c802;
        this.f = yp0_02;
    }

    public final Object invoke() {
        Object object = this.d;
        Intrinsics.checkNotNullParameter(object, "$fleekViewModel");
        i90_0 i90_02 = this.e;
        Intrinsics.checkNotNullParameter(i90_02, "$coroutineScope");
        yp0_0 yp0_02 = this.f;
        Intrinsics.checkNotNullParameter(yp0_02, "$fleekBrandPageGAEventsUtil");
        Activity activity = this.a;
        if (activity != null) {
            Bundle bundle = new Bundle();
            String string2 = this.b;
            bundle.putString("brand_name", string2);
            String string3 = this.c;
            bundle.putString("brand_id", string3);
            string3 = "insert_";
            CharSequence charSequence = new StringBuilder(string3);
            charSequence.append(string2);
            charSequence = charSequence.toString();
            bundle.putString("FLEEK_SOURCE", (String)charSequence);
            charSequence = "FLEEK_SOURCE_DETAILS";
            string2 = "insert";
            bundle.putString((String)charSequence, string2);
            dr0_0.H((dr0_0)object, activity, bundle);
        }
        object = new vc_2(yp0_02, null);
        Ae3.d(i90_02, null, null, (Function2)object, 3);
        return Unit.a;
    }
}

