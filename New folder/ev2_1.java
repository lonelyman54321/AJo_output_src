/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Spannable
 *  android.widget.LinearLayout
 */
import android.text.Spannable;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.SuggestionList;
import com.ril.ajio.services.data.search.SuggestionSearchModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.b;

/*
 * Renamed from eV2
 */
public final class ev2_1
implements F62 {
    public final /* synthetic */ vv2_2 a;

    public /* synthetic */ ev2_1(vv2_2 vv2_22) {
        this.a = vv2_22;
    }

    public final void onChanged(Object iterator) {
        int n3 = 0;
        Object object = null;
        int n4 = 1;
        Object object2 = iterator;
        object2 = (DataCallback)((Object)iterator);
        vv2_2 vv2_22 = this.a;
        Intrinsics.checkNotNullParameter(vv2_22, "this$0");
        Intrinsics.checkNotNullParameter(object2, "suggestionListDataCallback");
        LinearLayout linearLayout = cp_1.Companion;
        int n7 = nn_2.b((cp$a)linearLayout, (DataCallback)object2);
        if (n7 != 0 && (n7 = ((DataCallback)object2).getStatus()) == 0) {
            Object object3;
            boolean bl2;
            String string2;
            String string3;
            String string4;
            String string5;
            Object object4;
            Object object5;
            Object object6;
            Object object7;
            object2 = (SuggestionList)((DataCallback)object2).getData();
            vv2_22.s0.clear();
            linearLayout = vv2_22.l;
            int n8 = linearLayout.size();
            ArrayList arrayList = vv2_22.s0;
            if (n8 > 0) {
                linearLayout = CollectionsKt.L((List)linearLayout);
                arrayList.add(linearLayout);
            }
            linearLayout = arrayList.iterator();
            while ((n8 = (int)(linearLayout.hasNext() ? 1 : 0)) != 0) {
                object7 = (SuggestionSearchModel)linearLayout.next();
                ((SuggestionSearchModel)object7).setFromPreviousSearch(n4 != 0);
            }
            n7 = 0;
            linearLayout = null;
            if (object2 != null) {
                object7 = ((SuggestionList)object2).getSuggestions();
            } else {
                n8 = 0;
                object7 = null;
            }
            object7 = (Collection)object7;
            if (object7 != null && (n8 = (int)(object7.isEmpty() ? 1 : 0)) == 0) {
                boolean bl3;
                Intrinsics.checkNotNull(object2);
                object2 = ((SuggestionList)object2).getSuggestions().iterator();
                n8 = 0;
                object7 = null;
                while (bl3 = object2.hasNext()) {
                    object6 = "STORE";
                    object5 = (Object[])object2.next();
                    object4 = object5.getDataType();
                    boolean bl4 = b.i((String)object6, (String)object4, false);
                    if (bl4) {
                        string5 = object5.getValue();
                        string4 = object5.getUrl();
                        string3 = object5.getImageUrl();
                        String string6 = object5.getDataType();
                        Spannable spannable = object5.getHighlightedText();
                        boolean bl5 = true;
                        string2 = "";
                        object6 = object7;
                        object7 = new SuggestionSearchModel(string5, null, string4, string3, string6, string2, bl5, spannable);
                        continue;
                    }
                    String string7 = object5.getValue();
                    String string8 = object5.getUrl();
                    String string9 = object5.getProductCount();
                    Spannable spannable = object5.getHighlightedText();
                    boolean bl6 = true;
                    object4 = new SuggestionSearchModel(string7, null, string8, null, null, string9, bl6, spannable);
                    arrayList.add(object4);
                }
                if (object7 != null) {
                    arrayList.add(object7);
                }
            }
            object2 = vv2_22.t;
            object7 = "searchViewModel";
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                bl2 = false;
                object2 = null;
            }
            if (!(bl2 = ((yw2_0)object2).b())) {
                object2 = vv2_22.t;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                    bl2 = false;
                    object2 = null;
                }
                if ((object2 = ((yw2_0)object2).s) != null) {
                    object7 = StringCompanionObject.INSTANCE;
                    object7 = vv2_22.U;
                    object5 = new Object[n4];
                    object5[0] = object7;
                    object7 = "Search \"%s\" in AJIO";
                    object4 = xh2_0.a(object5, n4, (String)object7, "format(...)");
                    object6 = vv2_22.U;
                    boolean bl7 = true;
                    string2 = null;
                    string5 = "SIS_SEARCH";
                    string4 = null;
                    string3 = "";
                    object5 = object2;
                    object2 = new SuggestionSearchModel((String)object4, (String)object6, string5, null, null, string3, bl7, null);
                    arrayList.add(object2);
                }
            }
            if ((object3 = vv2_22.t0) == null) {
                Intrinsics.throwUninitializedPropertyAccessException("searchSuggestionAdapter");
                n4 = 0;
                object3 = null;
            }
            object2 = ((lv2_0)object3).b;
            ((ArrayList)object2).clear();
            ((ArrayList)object2).addAll(arrayList);
            ((RecyclerView$f)object3).notifyDataSetChanged();
            object3 = vv2_22.A;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("searchList");
                n4 = 0;
                object3 = null;
            }
            object3.setVisibility(0);
            object = vv2_22.x;
            if (object == null) {
                object = "searchHistoryLayout";
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
            } else {
                linearLayout = object;
            }
            n3 = 8;
            linearLayout.setVisibility(n3);
        }
    }
}

