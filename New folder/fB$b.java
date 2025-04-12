/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.Editable
 *  android.text.TextWatcher
 */
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import com.google.common.collect.ImmutableList;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.FacetValue;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class fB$b
implements TextWatcher {
    public final /* synthetic */ fB a;

    public fB$b(fB fB2) {
        this.a = fB2;
    }

    public final void afterTextChanged(Editable editable) {
        Intrinsics.checkNotNullParameter(editable, "arg0");
    }

    public final void beforeTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
        Intrinsics.checkNotNullParameter(charSequence, "arg0");
    }

    public final void onTextChanged(CharSequence object, int n3, int n4, int n7) {
        Intrinsics.checkNotNullParameter(object, "query");
        fB fB2 = this.a;
        Object object2 = fB2.c;
        if (object2 != null) {
            object2 = ((RecyclerView)object2).getAdapter();
        } else {
            n4 = 0;
            object2 = null;
        }
        n7 = object2 instanceof za_0;
        if (n7 != 0) {
            Object object3 = fB2.f;
            if (object3 == null) {
                return;
            }
            ArrayList<Object> arrayList = new ArrayList<Object>();
            Object object4 = object.toString();
            int n8 = ((String)object4).length();
            String string2 = "facetValueList";
            String string3 = "copyOf(...)";
            int n10 = 8;
            if (n8 == 0) {
                object = fB2.d;
                if (object != null) {
                    object.setVisibility(n10);
                }
                if ((object = fB2.c) != null) {
                    object.setVisibility(0);
                }
                object2 = (za_0)object2;
                object = ImmutableList.copyOf((Collection)fB2.f);
                Intrinsics.checkNotNullExpressionValue(object, string3);
                object2.getClass();
                Intrinsics.checkNotNullParameter(object, string2);
                ((za_0)object2).a = object;
                ((RecyclerView$f)object2).notifyDataSetChanged();
            } else {
                object3 = ((ArrayList)object3).iterator();
                object4 = "iterator(...)";
                Intrinsics.checkNotNullExpressionValue(object3, (String)object4);
                while ((n8 = (int)(object3.hasNext() ? 1 : 0)) != 0) {
                    boolean bl2;
                    boolean bl3;
                    object4 = object3.next();
                    Intrinsics.checkNotNullExpressionValue(object4, "next(...)");
                    String string4 = ((FacetValue)(object4 = (FacetValue)object4)).getName();
                    if (string4 == null || (bl3 = arrayList.contains(object4))) continue;
                    string4 = ((FacetValue)object4).getName();
                    Intrinsics.checkNotNull(string4);
                    String string5 = object.toString();
                    bl3 = StringsKt.F(string4, string5, bl2 = true);
                    if (!bl3 || (bl3 = ((FacetValue)object4).isTitleFacet())) continue;
                    arrayList.add(object4);
                }
                boolean bl4 = arrayList.isEmpty();
                if (bl4) {
                    object = fB2.d;
                    if (object != null) {
                        object.setVisibility(0);
                    }
                    if ((object = fB2.d) != null) {
                        n4 = R$string.filter_search_no_prd_found;
                        object2 = hv3_0.K(n4);
                        object.setContentDescription((CharSequence)object2);
                    }
                    object2 = Looper.getMainLooper();
                    object = new Handler((Looper)object2);
                    n7 = 0;
                    object3 = null;
                    object2 = new gB(fB2, 0);
                    long l2 = 300L;
                    object.postDelayed((Runnable)object2, l2);
                    object = fB2.c;
                    if (object != null) {
                        object.setVisibility(n10);
                    }
                } else {
                    object = fB2.d;
                    if (object != null) {
                        object.setVisibility(n10);
                    }
                    if ((object = fB2.c) != null) {
                        object.setVisibility(0);
                    }
                    object2 = (za_0)object2;
                    object = ImmutableList.copyOf(arrayList);
                    Intrinsics.checkNotNullExpressionValue(object, string3);
                    object2.getClass();
                    Intrinsics.checkNotNullParameter(object, string2);
                    ((za_0)object2).a = object;
                    ((RecyclerView$f)object2).notifyDataSetChanged();
                }
            }
        }
    }
}

