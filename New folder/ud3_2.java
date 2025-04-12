/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ud3
 */
public final class ud3_2
implements Function1 {
    public final /* synthetic */ vd3_2 a;

    public /* synthetic */ ud3_2(vd3_2 vd3_22) {
        this.a = vd3_22;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object) {
        Object object2 = object;
        object2 = (Boolean)object;
        Object object3 = this.a;
        Object object4 = "this$0";
        Intrinsics.checkNotNullParameter(object3, (String)object4);
        boolean bl2 = (Boolean)object2;
        if (!bl2) return Unit.a;
        object2 = ((vd3_2)object3).Pa().a;
        object4 = ((Iterable)object2.keySet()).iterator();
        while (true) {
            Object object5;
            String string2;
            block9: {
                Object object6;
                Object object7;
                block7: {
                    Object object8;
                    boolean bl3;
                    Object object9;
                    block10: {
                        block8: {
                            boolean bl4 = object4.hasNext();
                            object7 = null;
                            if (!bl4) break block8;
                            string2 = (String)object4.next();
                            boolean bl5 = Intrinsics.areEqual(string2, object5 = "BRAND_THUMBNAIL");
                            if (!bl5 && !(bl5 = Intrinsics.areEqual(string2, object5 = "TOP_STORIES"))) continue;
                            object5 = ((vd3_2)object3).Pa().a;
                            object9 = ((vd3_2)object3).d;
                            if ((object5 = (p83_0)object5.get(object9)) == null) break block9;
                            boolean bl6 = ((p83_0)object5).isEmpty();
                            if (bl6) break block7;
                            break block10;
                        }
                        object4 = ((vd3_2)object3).Pa();
                        object4.getClass();
                        string2 = "<set-?>";
                        Intrinsics.checkNotNullParameter(object2, string2);
                        ((f23_0)object4).a = object2;
                        object2 = ((vd3_2)object3).a;
                        if (object2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("pagerAdapter");
                            bl2 = false;
                            object2 = null;
                        }
                        object4 = ((vd3_2)object3).Pa().a;
                        string2 = ((vd3_2)object3).d;
                        if ((object4 = (p83_0)object4.get(string2)) == null || (object4 = ((p83_0)object4).a().c) == null) {
                            object4 = mz0_2.a;
                        }
                        ((tk2_2)object2).n((List)object4);
                        object2 = ((vd3_2)object3).i;
                        if (object2 == null) {
                            object2 = "fleekViewModel";
                            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                        } else {
                            object7 = object2;
                        }
                        object2 = ((dr0_0)object7).u;
                        object3 = Boolean.FALSE;
                        ((LiveData)object2).k(object3);
                        return Unit.a;
                    }
                    object9 = ((p83_0)object5).listIterator();
                    do {
                        object8 = object9;
                        object8 = (ob3_2)object9;
                        boolean bl7 = ((ob3_2)object8).hasNext();
                        if (!bl7) break block7;
                        if ((object8 = (Subcomponent)((ob3_2)object8).next()) != null) {
                            object8 = ((Subcomponent)object8).getType();
                            continue;
                        }
                        bl3 = false;
                        object8 = null;
                    } while (!(bl3 = Intrinsics.areEqual(object8, object6 = "SHOW_ERROR_SCREEN")));
                    break block9;
                }
                object6 = object7;
                int n3 = -67108865;
                String string3 = "SHOW_ERROR_SCREEN";
                long l2 = 0L;
                int n4 = 1;
                object7 = new Subcomponent(null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, string3, null, l2, null, null, false, null, n3, n4, null);
                ((p83_0)object5).add(object7);
            }
            object2.put(string2, object5);
        }
    }
}

