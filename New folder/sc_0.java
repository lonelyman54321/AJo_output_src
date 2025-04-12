/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from SC
 */
public final class sc_0
implements Function0 {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ dr0_0 b;
    public final /* synthetic */ p83_0 c;
    public final /* synthetic */ Subcomponent d;
    public final /* synthetic */ Subcomponent e;
    public final /* synthetic */ String f;
    public final /* synthetic */ int g;
    public final /* synthetic */ yp0_0 h;
    public final /* synthetic */ String i;

    public /* synthetic */ sc_0(Activity activity, dr0_0 dr0_02, p83_0 p83_02, Subcomponent subcomponent, Subcomponent subcomponent2, String string2, int n3, yp0_0 yp0_02, String string3) {
        this.a = activity;
        this.b = dr0_02;
        this.c = p83_02;
        this.d = subcomponent;
        this.e = subcomponent2;
        this.f = string2;
        this.g = n3;
        this.h = yp0_02;
        this.i = string3;
    }

    public final Object invoke() {
        dr0_0 dr0_02 = this.b;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        Subcomponent subcomponent = this.d;
        Intrinsics.checkNotNullParameter(subcomponent, "$subcomponent");
        yp0_0 yp0_02 = this.h;
        Object object = "$fleekBrandPageGAEventsUtil";
        Intrinsics.checkNotNullParameter(yp0_02, (String)object);
        Activity activity = this.a;
        if (activity != null) {
            jc_0 jc_02;
            int n3 = this.g;
            String string2 = this.i;
            p83_0 p83_02 = this.c;
            Subcomponent subcomponent2 = this.e;
            String string3 = this.f;
            object = jc_02;
            jc_02 = new jc_0(dr0_02, p83_02, subcomponent, subcomponent2, string3, n3, yp0_02, string2);
            dr0_02.getClass();
            dr0_0.c(activity, jc_02);
        }
        return Unit.a;
    }
}

