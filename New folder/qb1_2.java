/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/*
 * Renamed from qb1
 */
public final class qb1_2
extends qg3_2
implements gx0_2 {
    public int a;
    public /* synthetic */ is2_2 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ pb1_2 d;
    public final /* synthetic */ da1_2 e;

    public qb1_2(pb1_2 pb1_22, da1_2 da1_22, f80_0 f80_02) {
        this.d = pb1_22;
        this.e = da1_22;
        super(3, f80_02);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (is2_2)object;
        object3 = (f80_0)object3;
        pb1_2 pb1_22 = this.d;
        da1_2 da1_22 = this.e;
        qb1_2 qb1_22 = new qb1_2(pb1_22, da1_22, (f80_0)object3);
        qb1_22.b = object;
        qb1_22.c = object2;
        object = Unit.a;
        return qb1_22.invokeSuspend(object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invokeSuspend(Object object) {
        is2_2 is2_22;
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 2;
        int n7 = 1;
        if (n3 != 0) {
            if (n3 != n7) {
                if (n3 == n4) {
                    vl2_2.b(object);
                    return Unit.a;
                }
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            is2_22 = this.b;
            vl2_2.b(object);
        } else {
            int n8;
            vl2_2.b(object);
            is2_22 = this.b;
            object = this.c;
            boolean bl2 = object instanceof bg2_2;
            if (!bl2) {
                object2 = new StringBuilder("\n|Fail to prepare request body for sending. \n|The body type is: ");
                object = Reflection.getOrCreateKotlinClass(object.getClass());
                ((StringBuilder)object2).append(object);
                ((StringBuilder)object2).append(", with Content-Type: ");
                object = oa1_0.c((na1_0)is2_22.a);
                ((StringBuilder)object2).append(object);
                ((StringBuilder)object2).append(".\n|\n|If you expect serialized body, please check that you have installed the corresponding plugin(like `ContentNegotiation`) and set `Content-Type` header.");
                object = ee3_2.c(((StringBuilder)object2).toString());
                object = object.toString();
                object2 = new IllegalStateException((String)object);
                throw object2;
            }
            Object object3 = (db1_2)is2_22.a;
            Object object4 = "<set-?>";
            Object object5 = bg2_2.class;
            if (object == null) {
                object = g52_0.a;
                object3.getClass();
                Intrinsics.checkNotNullParameter(object, (String)object4);
                ((db1_2)object3).d = object;
                object = Reflection.getOrCreateKotlinClass(object5);
                try {
                    object4 = Reflection.typeOf(object5);
                }
                catch (Throwable throwable) {
                    n8 = 0;
                    object4 = null;
                }
                object5 = new at3_0((yn1_2)object, (kn1_1)object4);
                ((db1_2)object3).a((at3_0)object5);
            } else {
                boolean bl3 = object instanceof bg2_2;
                if (bl3) {
                    object3.getClass();
                    Intrinsics.checkNotNullParameter(object, (String)object4);
                    ((db1_2)object3).d = object;
                    ((db1_2)object3).a(null);
                } else {
                    object3.getClass();
                    Intrinsics.checkNotNullParameter(object, (String)object4);
                    ((db1_2)object3).d = object;
                    object = Reflection.getOrCreateKotlinClass(object5);
                    try {
                        object4 = Reflection.typeOf(object5);
                    }
                    catch (Throwable throwable) {
                        n8 = 0;
                        object4 = null;
                    }
                    object5 = new at3_0((yn1_2)object, (kn1_1)object4);
                    ((db1_2)object3).a((at3_0)object5);
                }
            }
            object3 = this.d;
            n8 = ((pb1_2)object3).a;
            object5 = this.e;
            object = new pb1$b(n8, (da1_2)object5);
            object3 = CollectionsKt.Z(((pb1_2)object3).b).iterator();
            while ((n8 = (int)(object3.hasNext() ? 1 : 0)) != 0) {
                object4 = (gx0_2)object3.next();
                object = object5 = new pb1$c((gx0_2)object4, (mz2_1)object);
            }
            object3 = (db1_2)is2_22.a;
            this.b = is2_22;
            this.a = n7;
            if ((object = object.a((db1_2)object3, this)) == object2) {
                return object2;
            }
        }
        object = (ea1_2)object;
        this.b = null;
        this.a = n4;
        object = is2_22.d(this, object);
        if (object != object2) return Unit.a;
        return object2;
    }
}

