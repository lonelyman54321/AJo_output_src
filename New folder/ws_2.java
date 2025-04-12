/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.explore_brands.Subcomponent;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ws
 */
public final class ws_2
implements Function0 {
    public final /* synthetic */ ft1_2 a;
    public final /* synthetic */ p83_0 b;

    public /* synthetic */ ws_2(ft1_2 ft1_22, p83_0 p83_02) {
        this.a = ft1_22;
        this.b = p83_02;
    }

    public final Object invoke() {
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "<this>");
        p83_0 p83_02 = this.b;
        Intrinsics.checkNotNullParameter(p83_02, "videos");
        ArrayList<Js1> arrayList = ((ft1_2)object).j().i();
        int n3 = arrayList.isEmpty();
        Object object2 = null;
        if (n3 == 0 && (n3 = p83_02.isEmpty()) == 0) {
            int n4;
            arrayList = ((ft1_2)object).j();
            Object object3 = arrayList.i();
            Js1 js1 = (Js1)CollectionsKt.S((List)object3);
            int n7 = ((ft1_2)object).h();
            boolean bl2 = false;
            int n8 = 1;
            float f5 = Float.MIN_VALUE;
            n7 = n7 == 0 && (n7 = ((ft1_2)object).i()) == 0 ? 1 : 0;
            int n10 = js1.getSize();
            int n14 = js1.getOffset();
            n3 = arrayList.d();
            int n15 = js1.getIndex();
            if (n15 == (n4 = p83_02.size() - n8) && (n3 -= n14) >= n10) {
                bl2 = true;
            }
            object3 = (Iterable)object3;
            arrayList = new ArrayList<Js1>();
            object3 = object3.iterator();
            while ((n15 = (int)(object3.hasNext() ? 1 : 0)) != 0) {
                Js1 js12 = js1 = object3.next();
                js12 = js1;
                f5 = ov3.A((ft1_2)object, js12);
                n10 = 1116471296;
                float f6 = 70.0f;
                float f7 = f5 - f6;
                n8 = (int)(f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1));
                if (n8 <= 0) continue;
                arrayList.add(js1);
            }
            if (n7 != 0) {
                object2 = object = CollectionsKt.firstOrNull(p83_02);
                object2 = (Subcomponent)object;
            } else if (bl2) {
                object2 = object = CollectionsKt.T(p83_02);
                object2 = (Subcomponent)object;
            } else {
                object = (Js1)CollectionsKt.firstOrNull(arrayList);
                if (object != null) {
                    int n16 = object.getIndex();
                    object2 = object = p83_02.get(n16);
                    object2 = (Subcomponent)object;
                }
            }
        }
        return object2;
    }
}

