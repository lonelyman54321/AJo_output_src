/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.view.View;
import android.view.ViewGroup;
import com.ril.ajio.R$layout;
import com.ril.ajio.home.landingpage.activity.NewAjioStoryActivity;
import com.ril.ajio.home.landingpage.view.BaseNewAjioStoryView;
import com.ril.ajio.home.landingpage.view.NewAjioStoryView;
import com.ril.ajio.services.data.Home.BannerDetails;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Rd3
 */
public final class rd3_1
extends Uk2 {
    public final NewAjioStoryActivity c;
    public final int d;
    public final Map e;
    public final ArrayList f;

    public rd3_1(NewAjioStoryActivity newAjioStoryActivity, int n3, HashMap hashMap, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(newAjioStoryActivity, "activity");
        Intrinsics.checkNotNullParameter(hashMap, "mNewAjioStoryViewMap");
        this.c = newAjioStoryActivity;
        this.d = n3;
        this.e = hashMap;
        this.f = arrayList;
    }

    public final void a(ViewGroup object, int n3, Object object2) {
        Intrinsics.checkNotNullParameter(object, "collection");
        Intrinsics.checkNotNullParameter(object2, "view");
        object2 = (View)object2;
        object.removeView((View)object2);
        object = n3;
        this.e.remove(object);
    }

    public final int c() {
        int n3;
        ArrayList arrayList = this.f;
        if (arrayList != null) {
            n3 = arrayList.size();
        } else {
            n3 = 0;
            arrayList = null;
        }
        return n3;
    }

    public final Object f(int n3, ViewGroup object) {
        Object object2 = ck0.a(object, "collection");
        int n4 = R$layout.row_viewpager_new_ajio_story;
        object2 = object2.inflate(n4, object, false);
        Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type com.ril.ajio.home.landingpage.view.NewAjioStoryView");
        object2 = (NewAjioStoryView)((Object)object2);
        object.addView((View)object2);
        object = this.c;
        ((BaseNewAjioStoryView)((Object)object2)).setActivity((NewAjioStoryActivity)object);
        Serializable serializable = this.f;
        Intrinsics.checkNotNull(serializable);
        serializable = ((BannerDetails)serializable.get(n3)).getBannerImageDetails();
        ((NewAjioStoryView)((Object)object2)).setData((ArrayList)serializable, n3);
        serializable = Integer.valueOf(n3);
        Map map2 = this.e;
        map2.put(serializable, object2);
        ((BaseNewAjioStoryView)((Object)object2)).setOnNewAjioStoryClick((L82)object);
        int n7 = this.d;
        if (n3 == n7) {
            ((NewAjioStoryView)((Object)object2)).l();
        }
        return object2;
    }

    public final boolean g(View view, Object object) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(view, "view");
        String string2 = "object";
        Intrinsics.checkNotNullParameter(object, string2);
        if (view == object) {
            bl2 = true;
        } else {
            bl2 = false;
            view = null;
        }
        return bl2;
    }
}

