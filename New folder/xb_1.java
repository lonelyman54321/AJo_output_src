/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.feedModel.Component;
import com.ril.ajio.videoPlayer.model.FleekConfigs;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from XB
 */
public final class xb_1
extends qg3_2
implements Function2 {
    public final /* synthetic */ p83_0 a;
    public final /* synthetic */ p83_0 b;

    public xb_1(p83_0 p83_02, p83_0 p83_03, f80_0 f80_02) {
        this.a = p83_02;
        this.b = p83_03;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        p83_0 p83_02 = this.a;
        p83_0 p83_03 = this.b;
        object = new xb_1(p83_02, p83_03, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (xb_1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((xb_1)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        boolean bl2;
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object2 = this.a;
        if (object2 != null && !(bl2 = ((p83_0)object2).isEmpty())) {
            Object object3;
            boolean bl3;
            Object object4;
            Object object5;
            object2 = this.b;
            String string2 = null;
            Object object6 = object2 != null ? ((p83_0)object2).listIterator() : null;
            while (true) {
                boolean bl4;
                object5 = "PRODUCTS_WITH_CATALOG_LAYOUT";
                if (object6 == null) break;
                object4 = object6;
                object4 = (ob3_2)object6;
                boolean bl5 = ((ob3_2)object4).hasNext();
                if (bl5 != (bl3 = true)) break;
                object3 = (Component)((ob3_2)object4).next();
                if (object3 != null) {
                    object3 = ((Component)object3).getTemplate();
                } else {
                    bl5 = false;
                    object3 = null;
                }
                if (!(bl4 = Intrinsics.areEqual(object3, object5))) continue;
                ((ob3_2)object4).remove();
            }
            object3 = object6;
            bl3 = false;
            int n3 = 131071;
            object6 = new Component(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, n3, null);
            object4 = "INSERT";
            ((Component)object6).setType((String)object4);
            ((Component)object6).setTemplate((String)object5);
            object5 = h40_0.a;
            object5 = h40_0.x();
            if (object5 != null) {
                string2 = ((FleekConfigs)object5).getBrandPageHeading();
            }
            ((Component)object6).setHeading(string2);
            if (object2 != null) {
                ((p83_0)object2).add(object6);
            }
        }
        return Unit.a;
    }
}

