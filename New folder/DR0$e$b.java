/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.helper.UrlHelper;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class DR0$e$b
extends qg3_2
implements gx0_2 {
    public int a;
    public /* synthetic */ fs0_2 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ dr0_0 d;

    public DR0$e$b(f80_0 f80_02, dr0_0 dr0_02) {
        this.d = dr0_02;
        super(3, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (fs0_2)object;
        object3 = (f80_0)object3;
        dr0_0 dr0_02 = this.d;
        DR0$e$b dR0$e$b = new DR0$e$b((f80_0)object3, dr0_02);
        dR0$e$b.b = object;
        dR0$e$b.c = object2;
        object = Unit.a;
        return dR0$e$b.invokeSuspend(object);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 == 0) {
            Object object2;
            vl2_2.b(object);
            object = this.b;
            Object object3 = object2 = this.c;
            object3 = (String)object2;
            Object object4 = this.d;
            xr0_2 xr0_22 = ((dr0_0)object4).a;
            int n7 = ((dr0_0)object4).p();
            boolean bl2 = ((dr0_0)object4).O0;
            xr0_22.getClass();
            Intrinsics.checkNotNullParameter(object3, "searchQuery");
            Intrinsics.checkNotNullParameter(object4, "fleekViewModel");
            object2 = UrlHelper.Companion.getInstance();
            Object object5 = ld3_2.STORE_AJIOGRAM.getStoreId();
            Object[] objectArray = new Object[]{};
            String string2 = ((UrlHelper)object2).getApiUrl((String)object5, "brands_list", objectArray);
            object5 = object2;
            object2 = new br0_2((dr0_0)object4, n7, bl2, xr0_22, string2, (String)object3, null);
            object5 = new br2_2((Function2)object2);
            object2 = ir0_2.a;
            object2 = em0_2.b;
            object2 = ms0_1.m((es0_2)object5, (CoroutineContext)object2);
            object5 = new cr0_2(null);
            object4 = new at0_1((es0_2)object2, (gx0_2)object5);
            this.a = n4;
            object = ms0_1.i(this, (es0_2)object4, (fs0_2)object);
            if (object != j90_02) return Unit.a;
            return j90_02;
        }
        if (n3 == n4) {
            vl2_2.b(object);
            return Unit.a;
        }
        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        throw object;
    }
}

