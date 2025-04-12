/*
 * Decompiled with CFR 0.152.
 */
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from H72
 */
public final class h72_0 {
    public static final pj2_2 a(bg2_2 object, CoroutineContext object2) {
        boolean bl2;
        block8: {
            block5: {
                block7: {
                    Object object3;
                    Object object4;
                    block6: {
                        block4: {
                            Intrinsics.checkNotNullParameter(object, "<this>");
                            object4 = "callContext";
                            Intrinsics.checkNotNullParameter(object2, (String)object4);
                            bl2 = object instanceof bg2$a_0;
                            object3 = null;
                            if (!bl2) break block4;
                            object2 = object;
                            object2 = ((bg2$a_0)object).e();
                            object4 = pj2_2.Companion;
                            Pattern pattern = jn1_0.d;
                            object = JN1$a.b(String.valueOf(((bg2_2)object).b()));
                            int n3 = ((Object)object2).length;
                            object4.getClass();
                            object = PJ2$a.b((jn1_0)object, (byte[])object2, 0, n3);
                            break block5;
                        }
                        bl2 = object instanceof bg2$d_0;
                        if (!bl2) break block6;
                        object4 = ((bg2_2)object).a();
                        int n4 = 1;
                        object3 = new lw1_0(object, n4);
                        object = object2 = new ae3_2((Long)object4, (Function0)object3);
                        break block5;
                    }
                    bl2 = object instanceof bg2$e_0;
                    if (!bl2) break block7;
                    object3 = ((bg2_2)object).a();
                    g72_0 g72_02 = new g72_0((bg2_2)object, (CoroutineContext)object2);
                    object = object4 = new ae3_2((Long)object3, g72_02);
                    break block5;
                }
                bl2 = object instanceof bg2$c_0;
                boolean bl3 = false;
                Object var5_7 = null;
                if (!bl2) break block8;
                object = pj2_2.Companion;
                object2 = new byte[0];
                object.getClass();
                object = PJ2$a.b(null, (byte[])object2, 0, 0);
            }
            return object;
        }
        bl2 = object instanceof bg2$b_0;
        if (bl2) {
            ((bg2$b_0)object).getClass();
            h72_0.a(null, (CoroutineContext)object2);
            throw null;
        }
        object = new NoWhenBranchMatchedException();
        throw object;
    }
}

