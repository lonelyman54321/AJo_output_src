/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.explore_brands.Component;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from us
 */
public final class us_2
implements Function0 {
    public final /* synthetic */ ft1_2 a;
    public final /* synthetic */ p83_0 b;

    public /* synthetic */ us_2(ft1_2 ft1_22, p83_0 p83_02) {
        this.a = ft1_22;
        this.b = p83_02;
    }

    public final Object invoke() {
        Object object = this.b;
        Intrinsics.checkNotNull(object);
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "<this>");
        Intrinsics.checkNotNullParameter(object, "videos");
        ArrayList<Js1> arrayList = ((ft1_2)object2).j().i();
        int n3 = arrayList.isEmpty();
        Object object3 = null;
        if (n3 == 0 && (n3 = ((p83_0)object).isEmpty()) == 0) {
            int n4;
            arrayList = ((ft1_2)object2).j();
            Object object4 = arrayList.i();
            Js1 js1 = (Js1)CollectionsKt.S((List)object4);
            int n7 = ((ft1_2)object2).h();
            boolean bl2 = false;
            int n8 = 1;
            float f5 = Float.MIN_VALUE;
            n7 = n7 == 0 && (n7 = ((ft1_2)object2).i()) == 0 ? 1 : 0;
            int n10 = js1.getSize();
            int n14 = js1.getOffset();
            n3 = arrayList.d();
            int n15 = js1.getIndex();
            if (n15 == (n4 = ((p83_0)object).size() - n8) && (n3 -= n14) >= n10) {
                bl2 = true;
            }
            object4 = (Iterable)object4;
            arrayList = new ArrayList<Js1>();
            object4 = object4.iterator();
            while ((n15 = (int)(object4.hasNext() ? 1 : 0)) != 0) {
                Js1 js12 = js1 = object4.next();
                js12 = js1;
                f5 = ov3.A((ft1_2)object2, js12);
                n10 = 1103626240;
                float f6 = 25.0f;
                float f7 = f5 - f6;
                n8 = (int)(f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1));
                if (n8 <= 0) continue;
                arrayList.add(js1);
            }
            if (n7 != 0) {
                object3 = object = CollectionsKt.firstOrNull((List)object);
                object3 = (Component)object;
            } else if (bl2) {
                object3 = object = CollectionsKt.T((List)object);
                object3 = (Component)object;
            } else {
                object2 = (Js1)CollectionsKt.firstOrNull(arrayList);
                if (object2 != null) {
                    int n16 = object2.getIndex();
                    object3 = object = ((p83_0)object).get(n16);
                    object3 = (Component)object;
                }
            }
        }
        return object3;
    }
}

