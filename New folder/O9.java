/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.model.CMSConfigInitializer;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Home.CMSNavigation;
import com.ril.ajio.services.data.Home.CategoryPageDetail;
import com.ril.ajio.services.data.Home.HomeCategory;
import com.ril.ajio.services.data.Home.NativeCategoryNavigationListDetail;
import com.ril.ajio.services.data.Home.NavigationDataClass;
import com.ril.ajio.services.data.Home.NavigationParent;
import com.ril.ajio.services.utils.JsonUtils;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class O9
implements Function1 {
    public final /* synthetic */ x9_0 a;

    public /* synthetic */ O9(x9_0 x9_02) {
        this.a = x9_02;
    }

    public final Object invoke(Object object) {
        object = (DataCallback)object;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        object = (NavigationParent)((DataCallback)object).getData();
        zr1_1 zr1_12 = ((x9_0)object2).d;
        String string2 = "";
        String string3 = "LUXE_CMS_CATEGORY_RESPONSE";
        jo_2 jo_22 = ((x9_0)object2).b;
        if (object == null) {
            jo_22.putPreference(string3, string2);
            int n3 = 14;
            Object var8_9 = null;
            int n4 = 1;
            Object var10_12 = null;
            boolean bl2 = false;
            Object var12_16 = null;
            Object var13_18 = null;
            Object object3 = object;
            object = new DataCallback(n4, null, null, null, n3, null);
            zr1_12.i(object);
        } else {
            int n7;
            CategoryPageDetail categoryPageDetail = new CategoryPageDetail();
            categoryPageDetail.setPosition("Section2");
            HomeCategory homeCategory = new HomeCategory();
            ArrayList<CategoryPageDetail> arrayList = new ArrayList<CategoryPageDetail>();
            arrayList.add(categoryPageDetail);
            homeCategory.setPageDetails(arrayList);
            arrayList = new ArrayList<CategoryPageDetail>();
            Object object4 = new NativeCategoryNavigationListDetail();
            String string4 = "core";
            ((NativeCategoryNavigationListDetail)object4).setNativeCategoryType(string4);
            String string5 = CMSConfigInitializer.INSTANCE.getLuxeDefaultHomePageUrl();
            ((NativeCategoryNavigationListDetail)object4).setNativeCategoryPageId(string5);
            int n8 = 1;
            ((NativeCategoryNavigationListDetail)object4).setDefaultNode(n8 != 0);
            arrayList.add((CategoryPageDetail)object4);
            object = ((NavigationParent)object).getData();
            if (object != null) {
                object = ((NavigationDataClass)object).getChildDetails();
            } else {
                n7 = 0;
                object = null;
            }
            object4 = object;
            object4 = (Collection)object;
            if (object4 != null && (n8 = object4.isEmpty()) == 0) {
                int n10 = object4.size();
                string5 = null;
                for (n8 = 0; n8 < n10; ++n8) {
                    Object object5 = (CMSNavigation)object.get(n8);
                    NativeCategoryNavigationListDetail nativeCategoryNavigationListDetail = new NativeCategoryNavigationListDetail();
                    nativeCategoryNavigationListDetail.setNativeCategoryType(string4);
                    String string6 = ((CMSNavigation)object5).getUrl();
                    nativeCategoryNavigationListDetail.setNativeCategoryPageId(string6);
                    object5 = ((CMSNavigation)object5).getName();
                    nativeCategoryNavigationListDetail.setNativeCategoryName((String)object5);
                    arrayList.add((CategoryPageDetail)((Object)nativeCategoryNavigationListDetail));
                }
                categoryPageDetail.setNativeCategoryNavigationListDetails(arrayList);
            }
            if ((object = jo_22.getPreference(string3, string2)) == null || (n7 = ((String)object).length()) == 0) {
                object = DataCallback.Companion.onSuccess(homeCategory);
                zr1_12.i(object);
            }
            ((x9_0)object2).a.getClass();
            Intrinsics.checkNotNullParameter(homeCategory, "categoryRes");
            object = n9_0.i;
            object2 = JsonUtils.toJson(homeCategory);
            if (object2 != null) {
                ((sw_0)object).putPreference(string3, (String)object2);
            } else {
                object.getClass();
            }
        }
        fq2_1.a();
        return Unit.a;
    }
}

