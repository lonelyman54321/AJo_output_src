/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.services.data.fleek.feedModel.ResourceOwner;
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from Ad3
 */
public final class ad3_1
implements Function0 {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ p83_0 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ dr0_0 f;
    public final /* synthetic */ String g;

    public /* synthetic */ ad3_1(Activity activity, boolean bl2, p83_0 p83_02, int n3, int n4, dr0_0 dr0_02, String string2) {
        this.a = activity;
        this.b = bl2;
        this.c = p83_02;
        this.d = n3;
        this.e = n4;
        this.f = dr0_02;
        this.g = string2;
    }

    public final Object invoke() {
        Activity activity = this.a;
        Intrinsics.checkNotNullParameter(activity, "$activity");
        dr0_0 dr0_02 = this.f;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        String string2 = this.g;
        Intrinsics.checkNotNullParameter(string2, "$key");
        int n3 = 0;
        Object object = null;
        int n4 = 47;
        int n7 = 6;
        boolean bl2 = this.b;
        p83_0 p83_02 = this.c;
        int n8 = this.d;
        int n10 = this.e;
        String string3 = "|";
        String string4 = "fleek_storybubble_";
        String string5 = "substring(...)";
        Object object2 = "";
        if (bl2) {
            Object object3;
            Object object4 = AnalyticsManager.Companion.getInstance().getGtmEvents();
            String string6 = "brand screen";
            ((GTMEvents)object4).setScreenName(string6);
            object4 = (Subcomponent)CollectionsKt.N(n8, p83_02);
            if (object4 == null || (object4 = ((Subcomponent)object4).getResourceOwnerMock()) == null || (object4 = ((ResourceOwner)object4).getLogo()) == null) {
                object4 = object2;
            }
            n3 = StringsKt.Q((CharSequence)object4, (char)n4, 0, n7) + 1;
            n4 = ((String)object4).length();
            object = ((String)object4).substring(n3, n4);
            Intrinsics.checkNotNullExpressionValue(object, string5);
            Object object5 = sq0_1.a;
            object5 = (Subcomponent)CollectionsKt.N(n8, p83_02);
            if (object5 == null || (object5 = ((Subcomponent)object5).getId()) == null) {
                object5 = object2;
            }
            if ((object3 = (Subcomponent)CollectionsKt.N(n8, p83_02)) == null || (object3 = ((Subcomponent)object3).getResourceOwner()) == null || (object3 = ((ResourceOwner)object3).getName()) == null) {
                object3 = object2;
            }
            object3 = string4.concat((String)object3);
            object4 = new StringBuilder();
            ((StringBuilder)object4).append(n10);
            ((StringBuilder)object4).append(string3);
            ((StringBuilder)object4).append(n8);
            object4 = ((StringBuilder)object4).toString();
            sq0_1.h((String)object5, (String)object3, (String)object, (String)object4);
        } else {
            Object object6;
            Object object7 = AnalyticsManager.Companion.getInstance().getGtmEvents();
            String string7 = "feed screen";
            ((GTMEvents)object7).setScreenName(string7);
            object7 = (Subcomponent)CollectionsKt.N(n8, p83_02);
            if (object7 == null || (object7 = ((Subcomponent)object7).getResourceOwner()) == null || (object7 = ((ResourceOwner)object7).getLogo()) == null) {
                object7 = object2;
            }
            n3 = StringsKt.Q((CharSequence)object7, (char)n4, 0, n7) + 1;
            n4 = ((String)object7).length();
            object = ((String)object7).substring(n3, n4);
            Intrinsics.checkNotNullExpressionValue(object, string5);
            Object object8 = sq0_1.a;
            object8 = (Subcomponent)CollectionsKt.N(n8, p83_02);
            if (object8 == null || (object8 = ((Subcomponent)object8).getResourceOwner()) == null || (object8 = ((ResourceOwner)object8).getId()) == null) {
                object8 = object2;
            }
            if ((object6 = (Subcomponent)CollectionsKt.N(n8, p83_02)) == null || (object6 = ((Subcomponent)object6).getResourceOwner()) == null || (object6 = ((ResourceOwner)object6).getName()) == null) {
                object6 = object2;
            }
            object6 = string4.concat((String)object6);
            object7 = new StringBuilder();
            ((StringBuilder)object7).append(n10);
            ((StringBuilder)object7).append(string3);
            ((StringBuilder)object7).append(n8);
            object7 = ((StringBuilder)object7).toString();
            sq0_1.h((String)object8, (String)object6, (String)object, (String)object7);
        }
        object = (Subcomponent)CollectionsKt.N(n8, p83_02);
        if (object != null && (object = ((Subcomponent)object).getResourceOwner()) != null && (object = ((ResourceOwner)object).getName()) != null) {
            object2 = object;
        }
        object = ((String)object2).concat("-story screen");
        dr0_02.getClass();
        dr0_0.w(activity).ab(string2, p83_02, n8, (String)object);
        return Unit.a;
    }
}

