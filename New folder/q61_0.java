/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Q61
 */
public final class q61_0
implements Function0 {
    public final /* synthetic */ yz_0 a;
    public final /* synthetic */ dr0_0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Activity d;
    public final /* synthetic */ e e;

    public /* synthetic */ q61_0(yz_0 yz_02, dr0_0 dr0_02, String string2, Activity activity, e e2, FragmentManager fragmentManager) {
        this.a = yz_02;
        this.b = dr0_02;
        this.c = string2;
        this.d = activity;
        this.e = e2;
    }

    public final Object invoke() {
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "$item");
        dr0_0 dr0_02 = this.b;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        e e2 = this.e;
        Intrinsics.checkNotNullParameter(e2, "$bottomNavigationController");
        Object object2 = h40_0.a;
        boolean bl2 = h40_0.c();
        String string2 = this.c;
        Activity activity = this.d;
        if (bl2) {
            object2 = ((yz_0)object).d;
            String string3 = "switch-store-route";
            bl2 = Intrinsics.areEqual(object2, string3);
            if (!bl2) {
                bl2 = false;
                object2 = null;
                dr0_02.Z(false);
            }
            if ((bl2 = Intrinsics.areEqual(string2, string3)) && (bl2 = Intrinsics.areEqual(string2, object2 = ((yz_0)object).d)) && activity != null) {
                dr0_02.getClass();
                object2 = dr0_0.w(activity);
                ((fq0_2)object2).Va();
            }
        }
        object = ((yz_0)object).d;
        T61.e(dr0_02, activity, e2, string2, (String)object);
        return Unit.a;
    }
}

