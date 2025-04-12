/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import androidx.lifecycle.LiveData;
import com.ril.ajio.data.database.entity.SearchEntry;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.plp.PLPExtras$a;
import com.ril.ajio.services.data.Product.ProductsList;
import com.ril.ajio.services.data.search.SuggestionSearchModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class FW2$a
extends qg3_2
implements Function2 {
    public final /* synthetic */ ProductsList a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ int e;
    public final /* synthetic */ yw2_0 f;
    public final /* synthetic */ String g;

    public FW2$a(ProductsList productsList, String string2, String string3, String string4, int n3, yw2_0 yw2_02, String string5, f80_0 f80_02) {
        this.a = productsList;
        this.b = string2;
        this.c = string3;
        this.d = string4;
        this.e = n3;
        this.f = yw2_02;
        this.g = string5;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        yw2_0 yw2_02 = this.f;
        String string2 = this.g;
        ProductsList productsList = this.a;
        String string3 = this.b;
        String string4 = this.c;
        String string5 = this.d;
        int n3 = this.e;
        object = new FW2$a(productsList, string3, string4, string5, n3, yw2_02, string2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (FW2$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((FW2$a)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        FW2$a fW2$a = this;
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object2 = this.f;
        Object object3 = ((yw2_0)object2).x;
        Object object4 = ((yw2_0)object2).s;
        Object object5 = "searchEntries";
        Intrinsics.checkNotNullParameter(object3, (String)object5);
        PLPExtras$a pLPExtras$a = new PLPExtras$a();
        Object object6 = this.a;
        if (object6 != null) {
            int n3;
            AM0.a().a = object6;
            Object object7 = this.b;
            Object object8 = JV2.a((String)object7, (List)object3);
            int n4 = ((ArrayList)object8).size();
            if (n4 < (n3 = this.e)) {
                object3 = "auto suggested search";
            } else {
                Intrinsics.checkNotNullParameter(object3, (String)object5);
                object5 = new ArrayList();
                object3 = ((Iterable)CollectionsKt.Z((Iterable)object3)).iterator();
                while ((n4 = (int)(object3.hasNext() ? 1 : 0)) != 0) {
                    Object object9;
                    object8 = (SearchEntry)object3.next();
                    String string2 = ((SearchEntry)object8).getSearchText();
                    String string3 = ((SearchEntry)object8).getCode();
                    String string4 = ((SearchEntry)object8).getQuery();
                    boolean bl2 = ((SearchEntry)object8).isAutoSuggested();
                    String string5 = ((SearchEntry)object8).getStoreType();
                    object8 = ((SearchEntry)object8).getImgUrl();
                    SuggestionSearchModel suggestionSearchModel = object9;
                    object = object3;
                    object3 = object9;
                    object9 = object8;
                    suggestionSearchModel(string2, string3, string4, bl2, string5, (String)object8);
                    ((ArrayList)object5).add(suggestionSearchModel);
                    object3 = object;
                }
                boolean bl3 = ((ArrayList)object5).isEmpty() ^ true;
                if (bl3) {
                    object3 = "history search";
                } else {
                    bl3 = false;
                    object3 = null;
                }
            }
            boolean bl4 = TextUtils.isEmpty((CharSequence)object7);
            object8 = fW2$a.c;
            if (bl4) {
                object7 = object8;
            }
            object5 = "";
            if (object8 == null) {
                object8 = object5;
            }
            pLPExtras$a.c = object8;
            if (object7 == null) {
                object7 = object5;
            }
            pLPExtras$a.g = object7;
            pLPExtras$a.f = object5;
            pLPExtras$a.m = object6 = ((ProductsList)object6).getSpellCheckSuggestions();
            if (object4 == null) {
                object4 = object5;
            }
            pLPExtras$a.d = object4;
            if (object3 == null) {
                object3 = object5;
            }
            pLPExtras$a.j = object3;
            object3 = fW2$a.d;
            object4 = object3 == null ? object5 : object3;
            pLPExtras$a.k = object4;
            if (object3 != null) {
                object5 = object3;
            }
            pLPExtras$a.i = object5;
            pLPExtras$a.n = object3 = fW2$a.g;
        }
        object3 = pLPExtras$a.a();
        object2 = ((yw2_0)object2).j;
        object3 = DataCallback.Companion.onSuccess(object3);
        ((LiveData)object2).i(object3);
        return Unit.a;
    }
}

