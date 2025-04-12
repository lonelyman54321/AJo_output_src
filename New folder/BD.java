/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import com.ril.ajio.services.data.fleek.feedModel.ResourceOwner;
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class BD
implements Function0 {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ List b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ dr0_0 e;
    public final /* synthetic */ String f;
    public final /* synthetic */ p83_0 g;

    public /* synthetic */ BD(Activity activity, ArrayList arrayList, int n3, int n4, dr0_0 dr0_02, p83_0 p83_02) {
        this.a = activity;
        this.b = arrayList;
        this.c = n3;
        this.d = n4;
        this.e = dr0_02;
        this.f = "BRAND_THUMBNAIL";
        this.g = p83_02;
    }

    public final Object invoke() {
        Object object;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$activity");
        Object object3 = this.e;
        Intrinsics.checkNotNullParameter(object3, "$fleekViewModel");
        Object object4 = this.f;
        String string2 = "$key";
        Intrinsics.checkNotNullParameter(object4, string2);
        object3.getClass();
        object2 = dr0_0.w((Activity)object2);
        object3 = fq0_2.Companion;
        object3 = this.g;
        int n3 = this.c;
        String string3 = null;
        ((fq0_2)object2).ab((String)object4, (p83_0)object3, n3, null);
        object2 = this.b;
        object2 = object2 != null ? (Subcomponent)CollectionsKt.N(n3, (List)object2) : null;
        object3 = sq0_1.a;
        object3 = "";
        if (object2 == null || (object4 = ((Subcomponent)object2).getResourceOwner()) == null || (object4 = ((ResourceOwner)object4).getId()) == null) {
            object4 = object3;
        }
        if (object2 != null && (object = ((Subcomponent)object2).getResourceOwner()) != null) {
            string3 = ((ResourceOwner)object).getName();
        }
        object = "fleek_storytile_";
        string3 = kp1_0.c((String)object, string3);
        if (object2 != null && (object2 = ((Subcomponent)object2).getResourceOwner()) != null && (object2 = ((ResourceOwner)object2).getName()) != null) {
            object3 = object2;
        }
        object2 = new StringBuilder();
        int n4 = this.d;
        object2 = Xd0.a("|", n4, n3, (StringBuilder)object2);
        sq0_1.h((String)object4, string3, (String)object3, (String)object2);
        return Unit.a;
    }
}

