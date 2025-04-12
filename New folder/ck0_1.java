/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.services.data.fleek.feedModel.Component;
import com.ril.ajio.services.data.fleek.feedModel.Media;
import com.ril.ajio.services.data.fleek.feedModel.ResourceOwner;
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from cK0
 */
public final class ck0_1
implements Function1 {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ dr0_0 b;
    public final /* synthetic */ Component c;
    public final /* synthetic */ String d;
    public final /* synthetic */ int e;

    public /* synthetic */ ck0_1(Activity activity, dr0_0 dr0_02, Component component, String string2, int n3) {
        this.a = activity;
        this.b = dr0_02;
        this.c = component;
        this.d = string2;
        this.e = n3;
    }

    public final Object invoke(Object object) {
        block11: {
            boolean bl2;
            boolean bl3;
            Object object2;
            Object object3;
            String string2;
            boolean bl4;
            int n3;
            Object object4;
            CharSequence charSequence;
            Object object5;
            block13: {
                block12: {
                    ((Integer)object).getClass();
                    object = this.b;
                    Intrinsics.checkNotNullParameter(object, "$fleekViewModel");
                    object5 = this.a;
                    if (object5 == null) break block11;
                    object.getClass();
                    object = dr0_0.w((Activity)object5);
                    object5 = this.c;
                    charSequence = null;
                    object4 = object5 != null ? ((Component)object5).getPostId() : null;
                    n3 = 2;
                    bl4 = false;
                    string2 = null;
                    fq0_2.Ya((fq0_2)object, (Component)object5, false, (String)object4, n3);
                    object = ((Component)object5).getContentType();
                    object4 = "";
                    if (object == null) break block12;
                    n3 = ((String)object).hashCode();
                    switch (n3) {
                        default: {
                            break block12;
                        }
                        case -169708227: {
                            object3 = "RESOURCE_ONLY";
                            boolean bl5 = ((String)object).equals(object3);
                            if (!bl5) break block12;
                            object = "product";
                            break block13;
                        }
                        case -1333014809: {
                            object3 = "MEDIA-WITH-RESOURCES";
                            boolean bl6 = ((String)object).equals(object3);
                            if (!bl6) break block12;
                            object = "cont+product";
                            break block13;
                        }
                        case -1840606393: {
                            object3 = "MEDIA_ONLY";
                            boolean bl7 = ((String)object).equals(object3);
                            if (bl7) break;
                            break block12;
                        }
                        case -1886782443: {
                            object3 = "MEDIA-ONLY";
                            boolean bl8 = ((String)object).equals(object3);
                            if (!bl8) break block12;
                        }
                    }
                    object = "cont";
                    break block13;
                }
                object = object4;
            }
            object3 = ((Component)object5).getSubcomponent();
            if (object3 != null && (object3 = (Subcomponent)CollectionsKt.firstOrNull((List)object3)) != null && (object3 = ((Subcomponent)object3).getResourceOwner()) != null) {
                object3 = ((ResourceOwner)object3).isFollowing();
                object2 = Boolean.TRUE;
                n3 = (int)(Intrinsics.areEqual(object3, object2) ? 1 : 0);
            } else {
                n3 = 0;
                object3 = null;
            }
            object3 = n3 != 0 ? "follow" : "non-follower";
            object2 = ((Component)object5).getSubcomponent();
            if (object2 != null && (object2 = (Subcomponent)CollectionsKt.firstOrNull((List)object2)) != null && (bl3 = ((Subcomponent)object2).isLiked()) == (bl2 = true)) {
                bl4 = true;
            }
            string2 = bl4 ? "like" : "not-liked";
            object2 = ((Component)object5).getSubcomponent();
            if (object2 != null && (object2 = (Subcomponent)CollectionsKt.firstOrNull((List)object2)) != null && (object2 = ((Subcomponent)object2).getPostMedia()) != null && (object2 = (Media)CollectionsKt.firstOrNull((List)object2)) != null) {
                charSequence = ((Media)object2).getType();
            }
            object2 = "unseen - ";
            String string3 = " - ";
            object = BW0.b(og_1.a((String)object2, (String)object, string3, (String)object3, string3), string2, string3, charSequence);
            charSequence = new StringBuilder("fleek_post_");
            object3 = this.d;
            ((StringBuilder)charSequence).append((String)object3);
            charSequence = ((StringBuilder)charSequence).toString();
            object3 = AnalyticsManager.Companion.getInstance().getGtmEvents();
            string2 = "feed screen";
            ((GTMEvents)object3).setScreenName(string2);
            object3 = sq0_1.a;
            object5 = ((Component)object5).getPostId();
            if (object5 != null) {
                object4 = object5;
            }
            object5 = new StringBuilder();
            n3 = this.e;
            string2 = "|0";
            object5 = g30.a(n3, string2, (StringBuilder)object5);
            sq0_1.h((String)object4, (String)charSequence, (String)object, (String)object5);
        }
        return Unit.a;
    }
}

