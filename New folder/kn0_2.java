/*
 * Decompiled with CFR 0.152.
 */
import java.io.InputStream;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/*
 * Renamed from Kn0
 */
public final class kn0_2
extends qg3_2
implements gx0_2 {
    public int a;
    public /* synthetic */ is2_2 b;
    public /* synthetic */ Object c;

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (is2_2)object;
        object3 = (f80_0)object3;
        kn0_2 kn0_22 = new qg3_2(3, (f80_0)object3);
        kn0_22.b = object;
        kn0_22.c = object2;
        object = Unit.a;
        return kn0_22.invokeSuspend(object);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        Object object2;
        String string2;
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
        Object object3 = this.c;
        Object object4 = ((db1_2)((is2_2)object).a).c;
        Object object5 = ja1_1.a;
        object5 = "Accept";
        object4 = ((xe3_2)object4).e((String)object5);
        Object object6 = ((is2_2)object).a;
        if (object4 == null) {
            object4 = object6;
            object4 = ((db1_2)object6).c;
            string2 = "*/*";
            ((xe3_2)object4).b((String)object5, string2);
        }
        object4 = object6;
        object4 = oa1_0.c((na1_0)object6);
        boolean bl2 = object3 instanceof String;
        string2 = null;
        if (bl2) {
            object2 = object3;
            object2 = (String)object3;
            if (object4 == null) {
                object4 = k70$d.a;
            }
            object5 = new hj3_1((String)object2, (k70_0)object4);
        } else {
            bl2 = object3 instanceof byte[];
            if (bl2) {
                object5 = new kn0$a_0((k70_0)object4, object3);
            } else {
                bl2 = object3 instanceof uf_1;
                if (bl2) {
                    object5 = new kn0$b_0((is2_2)object, (k70_0)object4, object3);
                } else {
                    bl2 = object3 instanceof bg2_2;
                    if (bl2) {
                        object5 = object3;
                        object5 = (bg2_2)object3;
                    } else {
                        object5 = object6;
                        object5 = (db1_2)object6;
                        Intrinsics.checkNotNullParameter(object5, "context");
                        object2 = "body";
                        Intrinsics.checkNotNullParameter(object3, (String)object2);
                        boolean bl3 = object3 instanceof InputStream;
                        if (bl3) {
                            object5 = object2 = new on0_2((db1_2)object5, (k70_0)object4, object3);
                        } else {
                            bl2 = false;
                            object5 = null;
                        }
                    }
                }
            }
        }
        object4 = object5 != null ? ((bg2_2)object5).b() : null;
        if (object4 == null) return Unit.a;
        object6 = (db1_2)object6;
        object4 = ((db1_2)object6).c;
        object4.getClass();
        String string3 = "Content-Type";
        Intrinsics.checkNotNullParameter(string3, "name");
        ((xe3_2)object4).b.remove(string3);
        object4 = nn0_2.a;
        string3 = "Transformed with default transformers request body for ";
        object2 = new StringBuilder(string3);
        object6 = ((db1_2)object6).a;
        ((StringBuilder)object2).append(object6);
        object6 = " from ";
        ((StringBuilder)object2).append((String)object6);
        object3 = Reflection.getOrCreateKotlinClass(object3.getClass());
        ((StringBuilder)object2).append(object3);
        object3 = ((StringBuilder)object2).toString();
        object4.g((String)object3);
        this.b = null;
        this.a = n4;
        object = ((is2_2)object).d(this, object5);
        if (object != j90_02) return Unit.a;
        return j90_02;
    }
}

