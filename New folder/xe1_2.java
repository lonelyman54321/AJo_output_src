/*
 * Decompiled with CFR 0.152.
 */
import androidx.navigation.e;
import com.ril.ajio.services.data.Home.CMSNavigation;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from xE1
 */
public final class xe1_2
implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ xe1_2(Object object, Object object2, Object object3, int n3, int n4) {
        this.a = n4;
        this.c = object;
        this.d = object2;
        this.e = object3;
        this.b = n3;
    }

    public final Object invoke(Object object, Object object2) {
        int n3 = this.a;
        object = (b30_0)object;
        object2 = (Integer)object2;
        ((Integer)object2).intValue();
        switch (n3) {
            default: {
                String string2 = (String)this.d;
                Intrinsics.checkNotNullParameter(string2, "$address");
                String string3 = (String)this.e;
                Intrinsics.checkNotNullParameter(string3, "$phone");
                int n4 = Me3.b(this.b | 1);
                de2_0.f((String)this.c, string2, string3, (b30_0)object, n4);
                return Unit.a;
            }
            case 0: 
        }
        e e2 = (e)this.c;
        Intrinsics.checkNotNullParameter(e2, "$navController");
        bf1_2 bf1_22 = (bf1_2)this.d;
        Intrinsics.checkNotNullParameter(bf1_22, "$viewModel");
        int n7 = Me3.b(this.b | 1);
        CMSNavigation cMSNavigation = (CMSNavigation)this.e;
        ge1_0.b(e2, bf1_22, cMSNavigation, (b30_0)object, n7);
        return Unit.a;
    }
}

