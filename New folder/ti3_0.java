/*
 * Decompiled with CFR 0.152.
 */
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from TI3
 */
public final class ti3_0
extends Lambda
implements Function0 {
    public final /* synthetic */ ni3_1 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ CI3 e;

    public ti3_0(ni3_1 ni3_12, CI3 cI3, String string2) {
        this.c = ni3_12;
        this.d = string2;
        this.e = cI3;
        super(0);
    }

    public final Object invoke() {
        Object object;
        block6: {
            Object object2;
            Object object3;
            Object object4;
            block9: {
                block10: {
                    Object object5;
                    block12: {
                        Object object6;
                        Object object7;
                        block14: {
                            block8: {
                                boolean bl2;
                                Object object8;
                                Object object9;
                                boolean bl3;
                                Object object10;
                                block13: {
                                    block11: {
                                        block7: {
                                            int n3;
                                            object4 = this.e;
                                            object7 = this.c;
                                            object3 = this.d;
                                            object = new si3_1((ni3_1)object7, (CI3)object4, (String)object3);
                                            object6 = ((ni3_1)object7).c.f();
                                            object10 = object6.p((String)object3);
                                            int n4 = ((ArrayList)object10).size();
                                            if (n4 > (n3 = 1)) break block6;
                                            if ((object10 = (EI3$b)CollectionsKt.firstOrNull((List)object10)) != null) break block7;
                                            ((si3_1)object).invoke();
                                            break block8;
                                        }
                                        object2 = ((EI3$b)object10).a;
                                        object5 = object6.i((String)object2);
                                        if (object5 == null) break block9;
                                        bl3 = object5.f();
                                        if (!bl3) break block10;
                                        object3 = ((EI3$b)object10).b;
                                        object5 = hI3$b.CANCELLED;
                                        if (object3 != object5) break block11;
                                        object6.delete((String)object2);
                                        ((si3_1)object).invoke();
                                        break block8;
                                    }
                                    object9 = ((CI3)object4).b;
                                    object8 = ((EI3$b)object10).a;
                                    int n7 = 0xFFFFFE;
                                    long l2 = 0L;
                                    long l3 = 0L;
                                    object = EI3.b(object9, (String)object8, null, null, null, 0, l2, 0, 0, l3, 0, n7);
                                    object3 = ((ni3_1)object7).f;
                                    Intrinsics.checkNotNullExpressionValue(object3, "processor");
                                    object6 = ((ni3_1)object7).c;
                                    Intrinsics.checkNotNullExpressionValue(object6, "workDatabase");
                                    object10 = ((ni3_1)object7).b;
                                    Intrinsics.checkNotNullExpressionValue(object10, "configuration");
                                    object7 = ((ni3_1)object7).e;
                                    Intrinsics.checkNotNullExpressionValue(object7, "schedulers");
                                    object2 = ((WorkDatabase)object6).f();
                                    object5 = ((EI3)object).a;
                                    object2 = object2.i((String)object5);
                                    if (object2 == null) break block12;
                                    object9 = ((EI3)object2).b;
                                    bl2 = ((hI3$b)((Object)object9)).isFinished();
                                    if (!bl2) break block13;
                                    object = lI3$a.NOT_APPLIED;
                                    break block8;
                                }
                                bl2 = ((EI3)object2).f();
                                boolean bl4 = ((EI3)object).f();
                                if (bl2 ^= bl4) break block14;
                                bl3 = ((kz2_0)object3).f((String)object5);
                                if (!bl3) {
                                    object9 = object7;
                                    object9 = ((Iterable)object7).iterator();
                                    while (bl4 = object9.hasNext()) {
                                        object8 = (mt2_0)object9.next();
                                        object8.b((String)object5);
                                    }
                                }
                                object4 = ((CI3)object4).c;
                                object9 = new RI3((WorkDatabase)object6, (EI3)object2, (EI3)object, (List)object7, (String)object5, (Set)object4, bl3);
                                ((FP2)object6).runInTransaction((Runnable)object9);
                                if (!bl3) {
                                    rt2_0.b((a)object10, (WorkDatabase)object6, (List)object7);
                                }
                                object = lI3$a.NOT_APPLIED;
                            }
                            return Unit.a;
                        }
                        object7 = new StringBuilder("Can't update ");
                        object3 = ui3_1.c;
                        object6 = (String)((ui3_1)object3).invoke(object2);
                        ((StringBuilder)object7).append((String)object6);
                        ((StringBuilder)object7).append(" Worker to ");
                        object = (String)((ui3_1)object3).invoke(object);
                        object = h30_0.a((StringBuilder)object7, (String)object, " Worker. Update operation must preserve worker's type.");
                        object4 = new UnsupportedOperationException((String)object);
                        throw object4;
                    }
                    object4 = cP.a("Worker with ", (String)object5, " doesn't exist");
                    object = new IllegalArgumentException((String)object4);
                    throw object;
                }
                object = new UnsupportedOperationException("Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.");
                throw object;
            }
            object4 = uc0_0.a("WorkSpec with ", (String)object2, ", that matches a name \"", object3, "\", wasn't found");
            object = new IllegalStateException((String)object4);
            throw object;
        }
        object = new UnsupportedOperationException("Can't apply UPDATE policy to the chains of work.");
        throw object;
    }
}

