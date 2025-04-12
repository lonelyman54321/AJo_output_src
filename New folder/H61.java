/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import androidx.navigation.e;
import androidx.navigation.o;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class H61
implements Function1 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ e c;
    public final /* synthetic */ Activity d;
    public final /* synthetic */ dr0_0 e;

    public /* synthetic */ H61(dr0_0 dr0_02, Activity activity, e e2, String string2, String string3) {
        this.a = string2;
        this.b = string3;
        this.c = e2;
        this.d = activity;
        this.e = dr0_02;
    }

    public final Object invoke(Object object) {
        boolean bl2;
        int n3 = 1;
        object = (o)object;
        String string2 = this.a;
        Intrinsics.checkNotNullParameter(string2, "$route");
        Object object2 = this.c;
        Intrinsics.checkNotNullParameter(object2, "$this_switchTabs");
        Intrinsics.checkNotNullParameter(object, "$this$navigate");
        Object object3 = h40_0.a;
        boolean bl3 = h40_0.c();
        if (!bl3 && (bl2 = Intrinsics.areEqual(string2, object3 = "switch-store-route"))) {
            string2 = this.b;
            if (string2 != null) {
                object2 = new m61_0(0);
                ((o)object).a(string2, (Function1)object2);
            }
            ((o)object).b = n3;
            ((o)object).c = false;
        } else {
            dr0_0 dr0_02;
            string2 = ((e)object2).i().n;
            if (string2 != null) {
                object2 = new ko0_1(n3);
                ((o)object).a(string2, (Function1)object2);
            }
            ((o)object).b = n3;
            ((o)object).c = false;
            boolean bl4 = h40_0.c();
            if (bl4 && (object = this.d) != null && (dr0_02 = this.e) != null && (object = dr0_0.w((Activity)object)) != null) {
                ((fq0_2)object).cb();
            }
        }
        return Unit.a;
    }
}

