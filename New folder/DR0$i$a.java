/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.seen_components.FailedIds;
import com.ril.ajio.services.data.fleek.seen_components.FleekSeenComponents;
import com.ril.ajio.services.data.fleek.seen_components.SeenApiModel;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class DR0$i$a
implements fs0_2 {
    public final /* synthetic */ dr0_0 a;

    public DR0$i$a(dr0_0 dr0_02) {
        this.a = dr0_02;
    }

    public final Object emit(Object object, f80_0 object2) {
        block11: {
            block9: {
                kb3_2 kb3_22;
                block10: {
                    block8: {
                        object = (kk2_1)object;
                        object2 = this.a;
                        FailedIds failedIds = null;
                        ((dr0_0)object2).v0 = false;
                        boolean bl2 = object instanceof KK2$c;
                        kb3_22 = ((dr0_0)object2).y0;
                        if (!bl2) break block8;
                        object = (SeenApiModel)((KK2$c)object).a;
                        if (object != null) {
                            Object object3;
                            ((dr0_0)object2).r0.clear();
                            ((dr0_0)object2).q0.clear();
                            Object object4 = new ArrayList();
                            ((dr0_0)object2).u0 = object4;
                            object4 = new ArrayList();
                            ((dr0_0)object2).s0 = object4;
                            ((dr0_0)object2).v0 = false;
                            failedIds = ((SeenApiModel)object).getFailedIds();
                            object4 = ((dr0_0)object2).q0.iterator();
                            Object object5 = "iterator(...)";
                            Intrinsics.checkNotNullExpressionValue(object4, (String)object5);
                            while (true) {
                                boolean bl3 = object4.hasNext();
                                object3 = "next(...)";
                                if (!bl3) break;
                                Object object6 = object4.next();
                                Intrinsics.checkNotNullExpressionValue(object6, (String)object3);
                                object6 = (FleekSeenComponents)object6;
                                if (failedIds == null || (object3 = failedIds.getPost()) == null || (bl3 = CollectionsKt.F((Iterable)object3, object6 = ((FleekSeenComponents)object6).getId()))) continue;
                                object4.remove();
                            }
                            object2 = ((dr0_0)object2).q0.iterator();
                            Intrinsics.checkNotNullExpressionValue(object2, (String)object5);
                            while (bl2 = object2.hasNext()) {
                                object4 = object2.next();
                                Intrinsics.checkNotNullExpressionValue(object4, (String)object3);
                                object4 = (FleekSeenComponents)object4;
                                if (failedIds == null || (object5 = failedIds.getStory()) == null || (bl2 = CollectionsKt.F((Iterable)object5, object4 = ((FleekSeenComponents)object4).getId()))) continue;
                                object2.remove();
                            }
                            object2 = new qX2$d((SeenApiModel)object);
                            kb3_22.getClass();
                            kb3_22.k(null, object2);
                        }
                        break block9;
                    }
                    boolean bl4 = object instanceof KK2$a;
                    if (!bl4) break block10;
                    object = ((KK2$a)object).b;
                    if (object == null) {
                        object = "";
                    }
                    object2 = new qX2$a((String)object);
                    kb3_22.getClass();
                    kb3_22.k(null, object2);
                    break block9;
                }
                boolean bl5 = object instanceof KK2$b;
                if (!bl5) break block11;
                object = qX2$b.a;
                kb3_22.getClass();
                kb3_22.k(null, object);
            }
            return Unit.a;
        }
        object = new NoWhenBranchMatchedException();
        throw object;
    }
}

