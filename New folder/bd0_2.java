/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from bd0
 */
public final class bd0_2
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bd0_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        Object object2 = "this$0";
        Object object3 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                boolean bl2;
                object = (p83_0)object;
                Object object4 = vd3_2.Companion;
                object3 = (vd3_2)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object2);
                if (object != null && (bl2 = ((p83_0)object).isEmpty() ^ true)) {
                    boolean bl3;
                    object2 = ((vd3_2)object3).Pa().a;
                    object4 = ((Iterable)object2.keySet()).iterator();
                    while (bl3 = object4.hasNext()) {
                        ArrayList<Object> arrayList;
                        String string2 = (String)object4.next();
                        boolean bl4 = Intrinsics.areEqual(string2, arrayList = "TOP_STORIES");
                        if (bl4) {
                            arrayList = new ArrayList<Object>();
                            CollectionsKt.h0((Iterable)object, arrayList);
                            object2.put(string2, arrayList);
                        }
                        if (!(bl4 = Intrinsics.areEqual(string2, arrayList = "BRAND_THUMBNAIL"))) continue;
                        arrayList = new ArrayList<Object>();
                        Object object5 = ((p83_0)object).listIterator();
                        while (true) {
                            Object object6 = object5;
                            object6 = (ob3_2)object5;
                            boolean bl5 = ((ob3_2)object6).hasNext();
                            if (!bl5) break;
                            Object object7 = object6 = ((ob3_2)object6).next();
                            object7 = (Subcomponent)object6;
                            if (object7 != null) {
                                object7 = ((Subcomponent)object7).isPinned();
                                Boolean bl6 = Boolean.FALSE;
                                bl5 = Intrinsics.areEqual(object7, bl6);
                            } else {
                                bl5 = false;
                                object7 = null;
                            }
                            if (!bl5) continue;
                            arrayList.add(object6);
                        }
                        object5 = new p83_0();
                        CollectionsKt.h0(arrayList, (Collection)object5);
                        object2.put(string2, object5);
                    }
                    object = ((vd3_2)object3).Pa();
                    object.getClass();
                    object4 = "<set-?>";
                    Intrinsics.checkNotNullParameter(object2, (String)object4);
                    ((f23_0)object).a = object2;
                    object = ((vd3_2)object3).a;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("pagerAdapter");
                        object = null;
                    }
                    object2 = ((vd3_2)object3).Pa().a;
                    object3 = ((vd3_2)object3).d;
                    if ((object2 = (p83_0)object2.get(object3)) == null || (object2 = ((p83_0)object2).a().c) == null) {
                        object2 = mz0_2.a;
                    }
                    ((tk2_2)object).n((List)object2);
                }
                return Unit.a;
            }
            case 0: 
        }
        object = (DataCallback)object;
        object3 = (fd0_2)object3;
        Intrinsics.checkNotNullParameter(object3, (String)object2);
        ((fd0_2)object3).e.k(object);
        return Unit.a;
    }
}

