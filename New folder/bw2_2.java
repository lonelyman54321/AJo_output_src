/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.database.DatabaseCreator;
import com.ril.ajio.data.database.entity.SearchEntry;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from BW2
 */
public final class bw2_2
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ yw2_0 b;
    public final /* synthetic */ SearchEntry c;

    public bw2_2(yw2_0 yw2_02, SearchEntry searchEntry, f80_0 f80_02) {
        this.b = yw2_02;
        this.c = searchEntry;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        yw2_0 yw2_02 = this.b;
        SearchEntry searchEntry = this.c;
        object = new bw2_2(yw2_02, searchEntry, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (bw2_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((bw2_2)object).invokeSuspend(object2);
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
            this.b.b.getClass();
            object = this.c;
            Intrinsics.checkNotNullParameter(object, "searchEntry");
            Object object2 = DatabaseCreator.INSTANCE.getDBInstance();
            es0_2 es0_22 = new pu2_0((es0_2)object2, (SearchEntry)object);
            object = ir0_2.a;
            object = ms0_1.m(es0_22, (CoroutineContext)object);
            int n7 = 3;
            object2 = new qg3_2(n7, null);
            es0_22 = new at0_1((es0_2)object, (gx0_2)object2);
            object = BW2$b.a;
            this.a = n4;
            object = ((at0_1)es0_22).collect((fs0_2)object, this);
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

