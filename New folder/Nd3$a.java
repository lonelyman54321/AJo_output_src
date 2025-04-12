/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.feedModel.PostData;
import com.ril.ajio.services.data.fleek.feedModel.Resource;
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class Nd3$a
extends qg3_2
implements Function2 {
    public final /* synthetic */ ld3_1 a;
    public final /* synthetic */ PostData b;
    public final /* synthetic */ List c;

    public Nd3$a(ld3_1 ld3_12, PostData postData, List list, f80_0 f80_02) {
        this.a = ld3_12;
        this.b = postData;
        this.c = list;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        PostData postData = this.b;
        List list = this.c;
        ld3_1 ld3_12 = this.a;
        object = new Nd3$a(ld3_12, postData, list, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (Nd3$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((Nd3$a)object).invokeSuspend(object2);
    }

    /*
     * Unable to fully structure code
     */
    public final Object invokeSuspend(Object var1_1) {
        var2_2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(var1_1);
        var1_1 = this.b.getPostId();
        var2_2 = ld3_1.Companion;
        var2_2 = this.a;
        var3_3 = var2_2.Pa().a;
        var4_4 = var2_2.J;
        var4_4 = (p83_0)var3_3.get(var4_4);
        if (var4_4 != null) {
            var4_4 = var4_4.listIterator();
            block0: while (true) {
                var5_5 = var4_4;
                var5_5 = var4_4;
                var6_6 = var5_5.hasNext();
                if (!var6_6) break;
                if ((var5_5 = (Subcomponent)var5_5.next()) == null || (var5_5 = var5_5.getResources()) == null) continue;
                var5_5 = ((Iterable)var5_5).iterator();
                while (true) {
                    if (var6_6 = var5_5.hasNext()) ** break;
                    continue block0;
                    var7_7 = (Resource)var5_5.next();
                    var8_8 = null;
                    if (var7_7 != null && (var9_9 = var7_7.getPostData()) != null) {
                        var9_9 = var9_9.getPostId();
                    } else {
                        var10_10 = false;
                        var9_9 = null;
                    }
                    if (!(var10_10 = Intrinsics.areEqual(var9_9, var1_1)) || var7_7 == null || (var7_7 = var7_7.getPostData()) == null) continue;
                    var9_9 = this.c;
                    if (var9_9 != null) {
                        Intrinsics.checkNotNullParameter(var9_9, "<this>");
                        var8_8 = new ArrayList<E>();
                        var9_9 = (Collection)var9_9;
                        var8_8.addAll(var9_9);
                    }
                    var7_7.setInnerResources(var8_8);
                }
                break;
            }
        }
        var1_1 = var2_2.Pa();
        var1_1.getClass();
        Intrinsics.checkNotNullParameter(var3_3, "<set-?>");
        var1_1.a = var3_3;
        return Unit.a;
    }
}

