/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import com.ril.ajio.data.repo.UserRepo;
import com.ril.ajio.services.data.fleek.explore_brands.ResourceOwner;
import com.ril.ajio.services.data.fleek.explore_brands.Subcomponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from AH0
 */
public final class ah0_0
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ah0_0(int n3, Object object, Object object2) {
        this.a = n3;
        this.b = object;
        this.c = object2;
    }

    public final Object invoke(Object object) {
        Object object2;
        Object object3;
        int n3 = this.a;
        switch (n3) {
            default: {
                String string2 = (String)this.c;
                object = (dl2_2)object;
                return UserRepo.T((UserRepo)this.b, string2, (dl2_2)object);
            }
            case 0: 
        }
        object = (Subcomponent)object;
        dr0_0 dr0_02 = (dr0_0)this.c;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        n3 = 0;
        String string3 = null;
        object3 = object != null && (object3 = ((Subcomponent)object).getResourceOwner()) != null ? ((ResourceOwner)object3).getCode() : null;
        if (object != null && (object2 = ((Subcomponent)object).getResourceOwner()) != null) {
            string3 = ((ResourceOwner)object2).getName();
        }
        Activity activity = (Activity)this.b;
        object2 = new mh0_2(dr0_02, activity, (Subcomponent)object);
        ai0_2.r((Function2)object2, object3, string3);
        return Unit.a;
    }
}

