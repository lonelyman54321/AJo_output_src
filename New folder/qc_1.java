/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import com.ril.ajio.services.data.fleek.feedModel.Component;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from qC
 */
public final class qc_1
implements Function2 {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ Component b;
    public final /* synthetic */ i90_0 c;
    public final /* synthetic */ dr0_0 d;
    public final /* synthetic */ p83_0 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ yp0_0 g;
    public final /* synthetic */ p83_0 h;
    public final /* synthetic */ String i;

    public /* synthetic */ qc_1(Activity activity, Component component, c80 c802, dr0_0 dr0_02, p83_0 p83_02, int n3, yp0_0 yp0_02, p83_0 p83_03, String string2) {
        this.a = activity;
        this.b = component;
        this.c = c802;
        this.d = dr0_02;
        this.e = p83_02;
        this.f = n3;
        this.g = yp0_02;
        this.h = p83_03;
        this.i = string2;
    }

    public final Object invoke(Object object, Object object2) {
        int n3 = (Integer)object;
        Object object3 = object2;
        object3 = (String)object2;
        object = this.c;
        Intrinsics.checkNotNullParameter(object, "$coroutineScope");
        object2 = this.d;
        Intrinsics.checkNotNullParameter(object2, "$fleekViewModel");
        yp0_0 yp0_02 = this.g;
        Intrinsics.checkNotNullParameter(yp0_02, "$fleekBrandPageGAEventsUtil");
        p83_0 p83_02 = this.h;
        Intrinsics.checkNotNullParameter(p83_02, "$it");
        Object object4 = this.a;
        int n4 = this.f;
        if (object4 != null) {
            object2.getClass();
            object2 = dr0_0.w(object4);
            object4 = this.e;
            object4 = (Component)CollectionsKt.N(n4, (List)object4);
            boolean bl2 = true;
            ((fq0_2)object2).Xa((Component)object4, bl2, (String)object3);
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = "";
        object2 = this.b.getContentType();
        if (object2 != null) {
            int n7;
            int n8 = ((String)object2).hashCode();
            if (n8 != (n7 = -1840606393)) {
                n7 = -205609049;
                if (n8 != n7) {
                    boolean bl3;
                    n7 = -169708227;
                    if (n8 == n7 && (bl3 = ((String)object2).equals(object4 = "RESOURCE_ONLY"))) {
                        ref$ObjectRef.element = object2 = "product";
                    }
                } else {
                    object4 = "MEDIA_WITH_RESOURCES";
                    boolean bl4 = ((String)object2).equals(object4);
                    if (bl4) {
                        ref$ObjectRef.element = object2 = "cont+product";
                    }
                }
            } else {
                object4 = "MEDIA_ONLY";
                boolean bl5 = ((String)object2).equals(object4);
                if (bl5) {
                    ref$ObjectRef.element = object2 = "cont";
                }
            }
        }
        String string2 = this.i;
        object4 = object2;
        object2 = new xc_2(yp0_02, (String)object3, ref$ObjectRef, p83_02, n3, string2, n4, null);
        Ae3.d((i90_0)object, null, null, (Function2)object2, 3);
        return Unit.a;
    }
}

