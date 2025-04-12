/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.database.entity.SearchEntry;
import com.ril.ajio.services.data.search.SuggestionSearchModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

public final class JV2 {
    public static ArrayList a(String string2, List object) {
        Object object2;
        int n3;
        Intrinsics.checkNotNullParameter(object, "searchEntries");
        ArrayList<Object> arrayList = new ArrayList<Object>();
        if (string2 == null || (n3 = ((String)(object2 = ((Object)StringsKt.m0(string2)).toString())).length()) == 0) {
            return arrayList;
        }
        object = ((Iterable)CollectionsKt.Z((Iterable)object)).iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            String string3;
            Object object3;
            object2 = (SearchEntry)object.next();
            if (string2 == null) continue;
            Object object4 = "";
            boolean bl2 = ((String)object4).equalsIgnoreCase(string2);
            if (!bl2) {
                object4 = ((SearchEntry)object2).getSearchText();
                object3 = Locale.ROOT;
                object4 = ((String)object4).toLowerCase((Locale)object3);
                string3 = "toLowerCase(...)";
                Intrinsics.checkNotNullExpressionValue(object4, string3);
                object3 = string2.toLowerCase((Locale)object3);
                Intrinsics.checkNotNullExpressionValue(object3, string3);
                string3 = null;
                bl2 = b.s((String)object4, (String)object3, false);
                if (!bl2) continue;
            }
            string3 = ((SearchEntry)object2).getSearchText();
            String string4 = ((SearchEntry)object2).getCode();
            String string5 = ((SearchEntry)object2).getQuery();
            boolean bl3 = ((SearchEntry)object2).isAutoSuggested();
            String string6 = ((SearchEntry)object2).getStoreType();
            String string7 = ((SearchEntry)object2).getImgUrl();
            object3 = object4;
            object4 = new SuggestionSearchModel(string3, string4, string5, bl3, string6, string7);
            arrayList.add(object4);
        }
        return arrayList;
    }
}

