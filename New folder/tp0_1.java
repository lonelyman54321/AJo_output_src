/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Home.CMSNavigation;
import com.ril.ajio.services.data.user.GPSResponse;
import com.ril.ajio.services.data.user.LocationData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from TP0
 */
public final class tp0_1
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tp0_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        Object object2 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (UY2)object;
                object2 = (CMSNavigation)object2;
                Intrinsics.checkNotNullParameter(object2, "$category");
                Intrinsics.checkNotNullParameter(object, "$this$semantics");
                String string2 = ((CMSNavigation)object2).getInactiveAltText();
                if (string2 == null && (string2 = ((CMSNavigation)object2).getName()) == null) {
                    string2 = "category";
                }
                RY2.e((UY2)object, string2);
                return Unit.a;
            }
            case 0: 
        }
        object = (DataCallback)object;
        Object object3 = fq0_2.Companion;
        object2 = (fq0_2)object2;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        object3 = cp_1.Companion;
        n3 = (int)(nn_2.b((cp$a)object3, (DataCallback)object) ? 1 : 0);
        if (n3 != 0 && (n3 = ((DataCallback)object).getStatus()) == 0 && (object3 = ((DataCallback)object).getData()) != null && (object = (GPSResponse)((DataCallback)object).getData()) != null && (n3 = (int)(((GPSResponse)object).getInvalidpostalcode() ? 1 : 0)) == 0) {
            String string3 = ((GPSResponse)object).getCity();
            String string4 = ((GPSResponse)object).getState();
            String string5 = ((GPSResponse)object).getZone();
            int n4 = 103;
            object3 = new LocationData(n4, string3, string4, string5, null);
            object = ((ew_2)object2).a;
            ((jo_2)object).r((LocationData)object3);
        }
        return Unit.a;
    }
}

