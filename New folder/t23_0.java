/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.database.dbhelper.ShareProductExperienceDaoHelper;
import com.ril.ajio.data.database.entity.ShareProductExperience;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from T23
 */
public final class t23_0
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ w23_0 b;
    public final /* synthetic */ ShareProductExperience c;
    public final /* synthetic */ String d;

    public t23_0(w23_0 w23_02, ShareProductExperience shareProductExperience, String string2, f80_0 f80_02) {
        this.b = w23_02;
        this.c = shareProductExperience;
        this.d = string2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        ShareProductExperience shareProductExperience = this.c;
        String string2 = this.d;
        w23_0 w23_02 = this.b;
        object = new t23_0(w23_02, shareProductExperience, string2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (t23_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((t23_0)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        if (n3 == 0) {
            vl2_2.b(object);
            object = this.b;
            ((w23_0)object).a.getClass();
            Object object2 = this.c;
            Intrinsics.checkNotNullParameter(object2, "shareProductExperience");
            Object object3 = this.d;
            Intrinsics.checkNotNullParameter(object3, "products");
            ((ShareProductExperience)object2).setShareType(n4);
            ((ShareProductExperience)object2).setDeleted(false);
            n3 = 2;
            ((ShareProductExperience)object2).setExpType(n3);
            Object object4 = ShareProductExperienceDaoHelper.Companion.getInstance().insertShareProductExperience((ShareProductExperience)object2, (String)object3);
            object2 = new T23$a((w23_0)object, null);
            object3 = new at0_1((es0_2)object4, (gx0_2)object2);
            object4 = new T23$b((w23_0)object);
            this.a = n4;
            object = ((at0_1)object3).collect((fs0_2)object4, this);
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

