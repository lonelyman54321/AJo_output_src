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
import com.ril.ajio.services.data.Suggestion;
import com.ril.ajio.services.data.SuggestionList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class zW2$b
implements fs0_2 {
    public final /* synthetic */ yw2_0 a;
    public final /* synthetic */ String b;

    public zW2$b(yw2_0 yw2_02, String string2) {
        this.a = yw2_02;
        this.b = string2;
    }

    public final Object emit(Object object, f80_0 f80_02) {
        int n3;
        zW2$b zW2$b = this;
        zr1_1 zr1_12 = null;
        int n4 = 1;
        Object object2 = object;
        object2 = (DataCallback)object;
        Iterator iterator = (SuggestionList)((DataCallback)object2).getData();
        yw2_0 yw2_02 = this.a;
        if (iterator != null && (iterator = ((SuggestionList)((Object)iterator)).getSuggestions()) != null && (n3 = (iterator = (Collection)((Object)iterator)).isEmpty() ^ n4) == n4) {
            yw2_02.getClass();
            iterator = (SuggestionList)((DataCallback)object2).getData();
            if (iterator != null && (iterator = ((SuggestionList)((Object)iterator)).getSuggestions()) != null) {
                boolean bl2;
                iterator = ((Iterable)((Object)iterator)).iterator();
                while (bl2 = iterator.hasNext()) {
                    int n7;
                    String string2;
                    Suggestion suggestion = (Suggestion)iterator.next();
                    String string3 = suggestion.getValue();
                    String string4 = "getValue(...)";
                    Intrinsics.checkNotNullExpressionValue(string3, string4);
                    Locale locale = Locale.ROOT;
                    string3 = string3.toLowerCase(locale);
                    Object object3 = "toLowerCase(...)";
                    Intrinsics.checkNotNullExpressionValue(string3, (String)object3);
                    Object object4 = zW2$b.b;
                    Object object5 = ((String)object4).toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(object5, (String)object3);
                    int n8 = StringsKt.F(string3, (CharSequence)object5, false);
                    if (n8 == 0) continue;
                    string3 = suggestion.getValue();
                    Intrinsics.checkNotNullExpressionValue(string3, string4);
                    string3 = string3.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(string3, (String)object3);
                    string4 = ((String)object4).toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(string4, (String)object3);
                    int n10 = 6;
                    n8 = StringsKt.O(string3, string4, 0, false, n10);
                    int n14 = ((String)object4).length() + n8;
                    object3 = suggestion.getValue();
                    locale = new SpannableString((CharSequence)object3);
                    object3 = od3_2.a;
                    int n15 = ((String)object3).length();
                    if (n15 == 0) {
                        object3 = od3_2.a();
                    }
                    n7 = (n15 = (int)(s20.a ? 1 : 0)) == 0 && (n15 = (int)(Intrinsics.areEqual(object4 = od3_2.a(), string2 = ((ld3_2)((Object)(object5 = ld3_2.STORE_AJIOGRAM))).getStoreId()) ? 1 : 0)) == 0 && (n7 = (int)(Intrinsics.areEqual(object3, object4 = ((ld3_2)((Object)object5)).getStoreId()) ? 1 : 0)) == 0 ? R$color.black : R$color.white;
                    object4 = new int[0];
                    object5 = new int[n4][];
                    object5[0] = object4;
                    n7 = t70.getColor((Context)yw2_02.getApplication(), n7);
                    object3 = new int[]{n7};
                    ColorStateList colorStateList = new ColorStateList((int[][])object5, (int[])object3);
                    int n16 = -1;
                    object5 = null;
                    int n17 = 1;
                    object4 = object3;
                    object3 = new TextAppearanceSpan(null, n17, n16, colorStateList, null);
                    n15 = 33;
                    locale.setSpan(object3, n8, n14, n15);
                    suggestion.setHighlightedText((Spannable)locale);
                }
            }
            zr1_12 = yw2_02.c;
            zr1_12.k(object2);
        } else {
            zr1_12 = yw2_02.c;
            zr1_12.k(object2);
        }
        return Unit.a;
    }
}

