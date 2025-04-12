/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/*
 * Renamed from wm1
 */
public final class wm1_2
implements Function0 {
    public final /* synthetic */ SerialDescriptor a;
    public final /* synthetic */ ml1_2 b;

    public /* synthetic */ wm1_2(ml1_2 ml1_22, SerialDescriptor serialDescriptor) {
        this.a = serialDescriptor;
        this.b = ml1_22;
    }

    public final Object invoke() {
        XZ2$b xZ2$b;
        Map map2 = new Map();
        ml1_2 ml1_22 = this.b;
        Object object = ml1_22.a;
        boolean bl2 = ((sl1_2)object).m;
        SerialDescriptor serialDescriptor = this.a;
        if (bl2 && (bl2 = Intrinsics.areEqual(object = serialDescriptor.getKind(), xZ2$b = XZ2$b.a))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        xm1_2.e(ml1_22, serialDescriptor);
        int n3 = serialDescriptor.d();
        xZ2$b = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object2;
            int n4;
            Object object3 = serialDescriptor.f(i3);
            Object object4 = new ArrayList();
            object3 = object3.iterator();
            while ((n4 = object3.hasNext()) != 0) {
                object2 = object3.next();
                int n7 = object2 instanceof vm1_2;
                if (n7 == 0) continue;
                ((ArrayList)object4).add(object2);
            }
            object3 = (vm1_2)CollectionsKt.b0(object4);
            object4 = "toLowerCase(...)";
            if (object3 != null && (object3 = object3.names()) != null) {
                for (Object object5 : object3) {
                    if (bl2) {
                        Locale locale = Locale.ROOT;
                        object5 = ((String)object5).toLowerCase(locale);
                        Intrinsics.checkNotNullExpressionValue(object5, (String)object4);
                    }
                    xm1_2.a(map2, serialDescriptor, (String)object5, i3);
                }
            }
            if (bl2) {
                object3 = serialDescriptor.e(i3);
                object2 = Locale.ROOT;
                object3 = ((String)object3).toLowerCase((Locale)object2);
                Intrinsics.checkNotNullExpressionValue(object3, (String)object4);
            } else {
                object3 = null;
            }
            if (object3 == null) continue;
            xm1_2.a(map2, serialDescriptor, (String)object3, i3);
        }
        n3 = (int)(map2.isEmpty() ? 1 : 0);
        if (n3 != 0) {
            map2 = fh1_2.f();
        }
        return map2;
    }
}

