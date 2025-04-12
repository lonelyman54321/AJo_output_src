/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ril.ajio.data.database.entity.SearchEntry;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.search.SuggestionSearchModel;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class xW2$a
extends qg3_2
implements Function2 {
    public final /* synthetic */ yw2_0 a;

    public xW2$a(yw2_0 yw2_02, f80_0 f80_02) {
        this.a = yw2_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        yw2_0 yw2_02 = this.a;
        object = new xW2$a(yw2_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (xW2$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((xW2$a)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        boolean bl2;
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.a;
        object2 = ((yw2_0)object).x;
        Intrinsics.checkNotNullParameter(object2, "searchEntries");
        ArrayList<SuggestionSearchModel> arrayList = new ArrayList<SuggestionSearchModel>();
        object2 = ((Iterable)CollectionsKt.Z((Iterable)object2)).iterator();
        while (bl2 = object2.hasNext()) {
            SearchEntry searchEntry = (SearchEntry)object2.next();
            String string2 = searchEntry.getSearchText();
            String string3 = searchEntry.getCode();
            String string4 = searchEntry.getQuery();
            boolean bl3 = searchEntry.isAutoSuggested();
            String string5 = searchEntry.getStoreType();
            String string6 = searchEntry.getImgUrl();
            SuggestionSearchModel suggestionSearchModel = new SuggestionSearchModel(string2, string3, string4, bl3, string5, string6);
            arrayList.add(suggestionSearchModel);
        }
        object = ((yw2_0)object).l;
        object2 = DataCallback.Companion.onSuccess(arrayList);
        ((LiveData)object).i(object2);
        return Unit.a;
    }
}

