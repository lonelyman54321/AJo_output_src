/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import com.ril.ajio.services.data.fleek.feedModel.Component;
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from UC
 */
public final class uc_0
implements Function1 {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ dr0_0 b;
    public final /* synthetic */ Component c;
    public final /* synthetic */ Subcomponent d;
    public final /* synthetic */ Subcomponent e;
    public final /* synthetic */ p83_0 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ i90_0 h;
    public final /* synthetic */ String i;

    public /* synthetic */ uc_0(Activity activity, dr0_0 dr0_02, Component component, Subcomponent subcomponent, Subcomponent subcomponent2, p83_0 p83_02, int n3, c80 c802, String string2) {
        this.a = activity;
        this.b = dr0_02;
        this.c = component;
        this.d = subcomponent;
        this.e = subcomponent2;
        this.f = p83_02;
        this.g = n3;
        this.h = c802;
        this.i = string2;
    }

    public final Object invoke(Object object) {
        int n3 = (Integer)object;
        object = this.b;
        Intrinsics.checkNotNullParameter(object, "$fleekViewModel");
        Object object2 = this.c;
        Intrinsics.checkNotNullParameter(object2, "$component");
        Object object3 = this.d;
        Intrinsics.checkNotNullParameter(object3, "$subcomponent");
        i90_0 i90_02 = this.h;
        Intrinsics.checkNotNullParameter(i90_02, "$coroutineScope");
        Object object4 = this.a;
        if (object4 != null) {
            dd_2 dd_22;
            boolean bl2;
            object.getClass();
            object = dr0_0.w(object4);
            object3 = ((Subcomponent)object3).getId();
            int n4 = 2;
            int n7 = 0;
            fq0_2.Ya((fq0_2)object, (Component)object2, false, (String)object3, n4);
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ref$ObjectRef.element = object = "";
            object2 = this.e;
            if (object2 != null) {
                object2 = ((Subcomponent)object2).getPostContentType();
            } else {
                bl2 = false;
                object2 = null;
            }
            if (object2 != null) {
                int n8 = ((String)object2).hashCode();
                if (n8 != (n4 = -1840606393)) {
                    n4 = -205609049;
                    if (n8 != n4) {
                        n4 = -169708227;
                        if (n8 == n4 && (bl2 = ((String)object2).equals(object3 = "RESOURCE_ONLY"))) {
                            ref$ObjectRef.element = object2 = "product";
                        }
                    } else {
                        object3 = "MEDIA_WITH_RESOURCES";
                        bl2 = ((String)object2).equals(object3);
                        if (bl2) {
                            ref$ObjectRef.element = object2 = "cont+product";
                        }
                    }
                } else {
                    object3 = "MEDIA_ONLY";
                    bl2 = ((String)object2).equals(object3);
                    if (bl2) {
                        ref$ObjectRef.element = object2 = "cont";
                    }
                }
            }
            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            ref$ObjectRef2.element = object;
            object4 = this.f;
            int n10 = this.g;
            if (object4 != null && (object2 = (Subcomponent)CollectionsKt.N(n10, (List)object4)) != null) {
                object2 = ((Subcomponent)object2).isSeen();
                object3 = Boolean.TRUE;
                n7 = Intrinsics.areEqual(object2, object3);
            }
            ref$ObjectRef2.element = n7 != 0 ? (object2 = "seen") : (object2 = "unseen");
            object3 = this.i;
            object2 = dd_22;
            n7 = n10;
            dd_22 = new dd_2((String)object3, (p83_0)object4, n10, ref$ObjectRef2, ref$ObjectRef, n3, null);
            n10 = 3;
            Ae3.d(i90_02, null, null, dd_22, n10);
        }
        return Unit.a;
    }
}

