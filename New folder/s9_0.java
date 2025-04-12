/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Home.CMSNavigation;
import com.ril.ajio.services.data.Home.NativeCategoryNavigationListDetail;
import com.ril.ajio.services.data.Home.NavigationDataClass;
import com.ril.ajio.services.data.Home.NavigationParent;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from S9
 */
public final class s9_0
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jD3 b;

    public /* synthetic */ s9_0(jD3 jD32, int n3) {
        this.a = n3;
        this.b = jD32;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        object = (DataCallback)object;
        switch (n3) {
            default: {
                N71 n71 = (N71)this.b;
                Intrinsics.checkNotNullParameter(n71, "this$0");
                n71.b.k(object);
                return Unit.a;
            }
            case 0: 
        }
        x9_0 x9_02 = (x9_0)this.b;
        ArrayList<NativeCategoryNavigationListDetail> arrayList = "this$0";
        Intrinsics.checkNotNullParameter(x9_02, (String)((Object)arrayList));
        object = (NavigationParent)((DataCallback)object).getData();
        boolean bl2 = hu1_2.e();
        boolean bl3 = true;
        int n4 = 0;
        Object object2 = null;
        if (bl2) {
            arrayList = x9_02.m;
            if (object != null) {
                boolean bl4;
                Object object3 = ((NavigationParent)object).getData();
                object3 = object3 != null ? ((NavigationDataClass)object3).getChildDetails() : null;
                Collection collection = object3;
                collection = (Collection)object3;
                if (collection != null && !(bl4 = collection.isEmpty())) {
                    ArrayList<Object> arrayList2 = new ArrayList<Object>();
                    if ((object = ((NavigationParent)object).getData()) != null) {
                        object2 = ((NavigationDataClass)object).getAspectRatio();
                    }
                    x9_02.K = object2;
                    int n7 = collection.size();
                    while (n4 < n7) {
                        object2 = (CMSNavigation)object3.get(n4);
                        collection = new NativeCategoryNavigationListDetail();
                        if (n4 == 0) {
                            ((NativeCategoryNavigationListDetail)((Object)collection)).setDefaultNode(bl3);
                        }
                        String string2 = ((CMSNavigation)object2).getUrl();
                        ((NativeCategoryNavigationListDetail)((Object)collection)).setNativeCategoryPageId(string2);
                        string2 = ((CMSNavigation)object2).getName();
                        ((NativeCategoryNavigationListDetail)((Object)collection)).setNativeCategoryName(string2);
                        string2 = ((CMSNavigation)object2).getActiveImageUrl();
                        ((NativeCategoryNavigationListDetail)((Object)collection)).setImgUrlForTab(string2);
                        string2 = ((CMSNavigation)object2).getActiveAltText();
                        ((NativeCategoryNavigationListDetail)((Object)collection)).setActiveAltText(string2);
                        object2 = ((CMSNavigation)object2).getInactiveAltText();
                        ((NativeCategoryNavigationListDetail)((Object)collection)).setInactiveAltText((String)object2);
                        arrayList2.add(collection);
                        ++n4;
                    }
                    ((LiveData)((Object)arrayList)).i(arrayList2);
                    x9_02.I = arrayList2;
                }
            } else {
                ((LiveData)((Object)arrayList)).i(null);
            }
        } else {
            x9_02.getClass();
            if (object != null) {
                if ((object = ((NavigationParent)object).getData()) != null) {
                    object2 = ((NavigationDataClass)object).getChildDetails();
                }
                object = object2;
                object = (Collection)object2;
                if (object != null && !(bl2 = object.isEmpty())) {
                    arrayList = new ArrayList<NativeCategoryNavigationListDetail>();
                    NativeCategoryNavigationListDetail nativeCategoryNavigationListDetail = new NativeCategoryNavigationListDetail();
                    String string3 = x9_0.d();
                    nativeCategoryNavigationListDetail.setNativeCategoryPageId(string3);
                    string3 = "";
                    nativeCategoryNavigationListDetail.setNativeCategoryName(string3);
                    nativeCategoryNavigationListDetail.setDefaultNode(bl3);
                    arrayList.add(nativeCategoryNavigationListDetail);
                    int n8 = object.size();
                    while (n4 < n8) {
                        Object object4 = (CMSNavigation)object2.get(n4);
                        nativeCategoryNavigationListDetail = new NativeCategoryNavigationListDetail();
                        string3 = ((CMSNavigation)object4).getUrl();
                        nativeCategoryNavigationListDetail.setNativeCategoryPageId(string3);
                        string3 = ((CMSNavigation)object4).getName();
                        nativeCategoryNavigationListDetail.setNativeCategoryName(string3);
                        string3 = ((CMSNavigation)object4).getActiveImageUrl();
                        nativeCategoryNavigationListDetail.setImgUrlForTab(string3);
                        string3 = ((CMSNavigation)object4).getActiveAltText();
                        nativeCategoryNavigationListDetail.setActiveAltText(string3);
                        object4 = ((CMSNavigation)object4).getInactiveAltText();
                        nativeCategoryNavigationListDetail.setInactiveAltText((String)object4);
                        arrayList.add(nativeCategoryNavigationListDetail);
                        ++n4;
                    }
                    object = x9_02.m;
                    ((LiveData)object).i(arrayList);
                    x9_02.I = arrayList;
                }
            }
        }
        fq2_1.a();
        return Unit.a;
    }
}

