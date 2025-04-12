/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.SimilarToRepo;
import com.ril.ajio.services.data.Product.WidgetRecord;
import com.ril.ajio.services.query.QueryProductDetails;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Q43
 */
public final class q43_0
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ r43_0 b;
    public final /* synthetic */ QueryProductDetails c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ zr1_1 g;
    public final /* synthetic */ WidgetRecord h;

    public q43_0(r43_0 r43_02, QueryProductDetails queryProductDetails, String string2, String string3, boolean bl2, zr1_1 zr1_12, WidgetRecord widgetRecord, f80_0 f80_02) {
        this.b = r43_02;
        this.c = queryProductDetails;
        this.d = string2;
        this.e = string3;
        this.f = bl2;
        this.g = zr1_12;
        this.h = widgetRecord;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        zr1_1 zr1_12 = this.g;
        WidgetRecord widgetRecord = this.h;
        r43_0 r43_02 = this.b;
        QueryProductDetails queryProductDetails = this.c;
        String string2 = this.d;
        String string3 = this.e;
        boolean bl2 = this.f;
        object = new q43_0(r43_02, queryProductDetails, string2, string3, bl2, zr1_12, widgetRecord, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (q43_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((q43_0)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 != 0) {
            if (n3 == n4) {
                vl2_2.b(object);
                return Unit.a;
            }
            object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw object;
        }
        vl2_2.b(object);
        object = this.b;
        Object object2 = ((r43_0)object).a;
        Object object3 = this.e;
        if (object3 == null) {
            object3 = "";
        }
        boolean bl2 = this.f;
        Object object4 = this.c;
        String string2 = this.d;
        object2 = ((SimilarToRepo)object2).getSimilarProducts((QueryProductDetails)object4, string2, (String)object3, bl2);
        bl2 = false;
        object4 = this.g;
        object3 = new Q43$a((r43_0)object, (zr1_1)object4, null);
        at0_1 at0_12 = new at0_1((es0_2)object2, (gx0_2)object3);
        object3 = this.h;
        object2 = new Q43$b((WidgetRecord)object3, (r43_0)object, (zr1_1)object4);
        this.a = n4;
        object = at0_12.collect((fs0_2)object2, this);
        if (object != j90_02) return Unit.a;
        return j90_02;
    }
}

