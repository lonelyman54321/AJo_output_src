/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from lD
 */
public final class ld_1
implements Function0 {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ dr0_0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ ld_1(Activity activity, dr0_0 dr0_02, String string2, String string3) {
        this.a = activity;
        this.b = dr0_02;
        this.c = string2;
        this.d = string3;
    }

    public final Object invoke() {
        Object object = this.b;
        Intrinsics.checkNotNullParameter(object, "$fleekViewModel");
        Object object2 = this.a;
        if (object2 != null) {
            String string2;
            object.getClass();
            object = dr0_0.w(object2);
            object2 = this.c;
            String string3 = "";
            if (object2 == null) {
                object2 = string3;
            }
            if ((string2 = this.d) != null) {
                string3 = string2;
            }
            ((fq0_2)object).Za((String)object2, string3);
        }
        return Unit.a;
    }
}

