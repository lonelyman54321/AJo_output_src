/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.text.Spannable
 *  android.text.SpannableString
 *  android.text.style.TextAppearanceSpan
 */
import android.content.Context;
import android.content.res.ColorStateList;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.TextAppearanceSpan;
import com.ril.ajio.R$color;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.search.SuggestionSearchModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class vW2$a
extends qg3_2
implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ yw2_0 b;
    public final /* synthetic */ boolean c;

    public vW2$a(f80_0 f80_02, yw2_0 yw2_02, String string2, boolean bl2) {
        this.a = string2;
        this.b = yw2_02;
        this.c = bl2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        yw2_0 yw2_02 = this.b;
        boolean bl2 = this.c;
        String string2 = this.a;
        object = new vW2$a(f80_02, yw2_02, string2, bl2);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (vW2$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((vW2$a)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        int n3 = 0;
        Object object2 = null;
        int n4 = 1;
        Object object3 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object3 = this.b;
        List list = ((yw2_0)object3).x;
        String string2 = this.a;
        list = JV2.a(string2, list);
        boolean bl2 = this.c;
        if (bl2) {
            bl2 = ((ArrayList)list).isEmpty() ^ n4;
            if (bl2) {
                Object object4;
                String string3;
                String string4;
                string2 = String.valueOf(string2);
                SuggestionSearchModel suggestionSearchModel = (SuggestionSearchModel)CollectionsKt.L(list);
                String string5 = suggestionSearchModel.getText();
                Intrinsics.checkNotNullExpressionValue(string5, "getText(...)");
                Object object5 = Locale.ROOT;
                string5 = string5.toLowerCase((Locale)object5);
                String string6 = "toLowerCase(...)";
                Intrinsics.checkNotNullExpressionValue(string5, string6);
                object5 = string2.toLowerCase((Locale)object5);
                Intrinsics.checkNotNullExpressionValue(object5, string6);
                int n7 = StringsKt.O(string5, (String)object5, 0, false, 6);
                int n8 = string2.length() + n7;
                string6 = suggestionSearchModel.getText();
                object5 = new SpannableString((CharSequence)string6);
                int n10 = og1_1.c();
                if (n10 != 0) {
                    int[] nArray = new int[]{};
                    int[][] nArrayArray = new int[n4][];
                    nArrayArray[0] = nArray;
                    object2 = ((Hj)object3).getApplication();
                    int n14 = R$color.luxe_color_121212;
                    n3 = t70.getColor((Context)object2, n14);
                    object2 = new int[]{n3};
                    string4 = string6 = new ColorStateList((int[][])nArrayArray, (int[])object2);
                } else {
                    String string7;
                    string6 = od3_2.a;
                    int n15 = string6.length();
                    if (n15 == 0) {
                        string6 = od3_2.a();
                    }
                    n10 = (n15 = (int)(s20.a ? 1 : 0)) == 0 && (n15 = (int)(Intrinsics.areEqual(string7 = od3_2.a(), string3 = ((ld3_2)((Object)(object4 = ld3_2.STORE_AJIOGRAM))).getStoreId()) ? 1 : 0)) == 0 && (n10 = (int)(Intrinsics.areEqual(string6, string7 = ((ld3_2)((Object)object4)).getStoreId()) ? 1 : 0)) == 0 ? R$color.brand_color_2 : R$color.white;
                    object4 = new int[0];
                    int[][] nArrayArray = new int[n4][];
                    nArrayArray[0] = (int[])object4;
                    n3 = t70.getColor((Context)((Hj)object3).getApplication(), n10);
                    object2 = new int[]{n3};
                    string4 = string7 = new ColorStateList((int[][])nArrayArray, (int[])object2);
                }
                string3 = null;
                int n16 = 1;
                int n17 = -1;
                object4 = object2;
                object2 = new TextAppearanceSpan(null, n16, n17, (ColorStateList)string4, null);
                n4 = 33;
                object5.setSpan(object2, n7, n8, n4);
                suggestionSearchModel.setHighlightedText((Spannable)object5);
                object2 = DataCallback.Companion.onSuccess(list);
            } else {
                object2 = DataCallback.Companion.onSuccess(list);
            }
        } else {
            object2 = DataCallback.Companion.onSuccess(list);
        }
        return object2;
    }
}

