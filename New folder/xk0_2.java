/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.feedModel.Component;
import com.ril.ajio.services.data.fleek.feedModel.Media;
import com.ril.ajio.services.data.fleek.feedModel.ResourceOwner;
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import com.ril.ajio.services.data.fleek.feedModel.SubcomponentsOwner;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from xK0
 */
public final class xk0_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ Component a;
    public final /* synthetic */ Subcomponent b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ dr0_0 e;

    public xk0_2(Component component, Subcomponent subcomponent, int n3, int n4, dr0_0 dr0_02, f80_0 f80_02) {
        this.a = component;
        this.b = subcomponent;
        this.c = n3;
        this.d = n4;
        this.e = dr0_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        int n3 = this.d;
        dr0_0 dr0_02 = this.e;
        Component component = this.a;
        Subcomponent subcomponent = this.b;
        int n4 = this.c;
        object = new xk0_2(component, subcomponent, n4, n3, dr0_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (xk0_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((xk0_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2;
        String string2;
        Object object3;
        Object object4;
        boolean bl2;
        Object object5;
        block11: {
            block10: {
                int n4;
                object5 = j90_0.COROUTINE_SUSPENDED;
                vl2_2.b(object);
                bl2 = false;
                object5 = null;
                object = new wq0_0(0);
                object4 = this.a;
                object3 = ((Component)object4).getPostId();
                ((wq0_0)object).a = object3;
                object3 = ((Component)object4).getSubComponentsOwner();
                string2 = null;
                if (object3 != null) {
                    object3 = ((SubcomponentsOwner)object3).getName();
                } else {
                    n4 = 0;
                    object3 = null;
                }
                object2 = "fleek_post_";
                ((wq0_0)object).b = object3 = kp1_0.c((String)object2, (String)object3);
                object4 = ((Component)object4).getContentType();
                if (object4 == null) break block10;
                n4 = ((String)object4).hashCode();
                switch (n4) {
                    default: {
                        break block10;
                    }
                    case -169708227: {
                        object3 = "RESOURCE_ONLY";
                        boolean n3 = ((String)object4).equals(object3);
                        if (!n3) break block10;
                        object4 = "product";
                        break block11;
                    }
                    case -205609049: {
                        object3 = "MEDIA_WITH_RESOURCES";
                        boolean bl3 = ((String)object4).equals(object3);
                        if (!bl3) break block10;
                        object4 = "cont+product";
                        break block11;
                    }
                    case -1840606393: {
                        object3 = "MEDIA_ONLY";
                        boolean bl4 = ((String)object4).equals(object3);
                        if (bl4) break;
                        break block10;
                    }
                    case -1886782443: {
                        object3 = "MEDIA-ONLY";
                        boolean bl5 = ((String)object4).equals(object3);
                        if (!bl5) break block10;
                    }
                }
                object4 = "cont";
                break block11;
            }
            object4 = "";
        }
        object3 = this.b;
        object2 = ((Subcomponent)object3).getResourceOwner();
        if (object2 != null) {
            object5 = ((ResourceOwner)object2).isFollowing();
            object2 = Boolean.TRUE;
            bl2 = Intrinsics.areEqual(object5, object2);
        }
        object5 = bl2 ? "follow" : "non-follower";
        boolean bl6 = ((Subcomponent)object3).isLiked();
        boolean bl7 = true;
        object2 = bl6 == bl7 ? "like" : "not-liked";
        object3 = ((Subcomponent)object3).getPostMedia();
        if (object3 != null && (object3 = (Media)CollectionsKt.firstOrNull((List)object3)) != null) {
            string2 = ((Media)object3).getType();
        }
        String string3 = " - ";
        object5 = BW0.b(og_1.a("unseen - ", (String)object4, string3, (String)object5, string3), (String)object2, string3, string2);
        ((wq0_0)object).c = object5;
        object5 = new StringBuilder();
        int n3 = this.c;
        ((StringBuilder)object5).append(n3);
        ((StringBuilder)object5).append("|");
        int n4 = this.d;
        ((StringBuilder)object5).append(n4);
        ((wq0_0)object).d = object5 = ((StringBuilder)object5).toString();
        this.e.l((wq0_0)object);
        return Unit.a;
    }
}

