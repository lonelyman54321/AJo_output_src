/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.database.DatabaseCreator;
import com.ril.ajio.data.database.dbhelper.SearchRvDaoHelper;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Qa3
 */
public final class qa3_2
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ pa3_1 b;

    public qa3_2(pa3_1 pa3_12, f80_0 f80_02) {
        this.b = pa3_12;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        pa3_1 pa3_12 = this.b;
        object = new qa3_2(pa3_12, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (qa3_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((qa3_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        block5: {
            Object object2;
            int n3;
            int n4;
            j90_0 j90_02;
            block6: {
                int n7;
                block2: {
                    block3: {
                        block4: {
                            j90_02 = j90_0.COROUTINE_SUSPENDED;
                            int n8 = this.a;
                            n4 = 3;
                            n3 = 2;
                            n7 = 1;
                            if (n8 == 0) break block2;
                            if (n8 == n7) break block3;
                            if (n8 != n3) break block4;
                            vl2_2.b(object);
                            break block5;
                        }
                        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw object;
                    }
                    vl2_2.b(object);
                    break block6;
                }
                vl2_2.b(object);
                object = SearchRvDaoHelper.INSTANCE.deleteUnUsedSearchRvEntry();
                object2 = new qg3_2(n4, null);
                at0_1 at0_12 = new at0_1((es0_2)object, (gx0_2)object2);
                object = Qa3$b.a;
                this.a = n7;
                object = at0_12.collect((fs0_2)object, this);
                if (object == j90_02) {
                    return j90_02;
                }
            }
            this.b.a.getClass();
            object = DatabaseCreator.INSTANCE.getDBInstance();
            object2 = new mu2_0((es0_2)object);
            object = new nu2_0((mu2_0)object2);
            object2 = new ou2_0((nu2_0)object);
            object = ir0_2.a;
            object = ms0_1.m((es0_2)object2, (CoroutineContext)object);
            object2 = new qg3_2(n4, null);
            at0_1 at0_13 = new at0_1((es0_2)object, (gx0_2)object2);
            object = Qa3$d.a;
            this.a = n3;
            object = at0_13.collect((fs0_2)object, this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        return Unit.a;
    }
}

